package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.angular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AngularBuildOptions extends BuildOptions[angular] {
  
  /**
    * The Angular architect configuration to use for builds.
    *
    * The `--prod` command line flag is a shortcut which translates to the
    * 'production' configuration.
    */
  var configuration: js.UndefOr[String] = js.native
  
  var cordovaAssets: js.UndefOr[Boolean] = js.native
  
  var sourcemaps: js.UndefOr[Boolean] = js.native
  
  var watch: js.UndefOr[Boolean] = js.native
}
object AngularBuildOptions {
  
  @scala.inline
  def apply(`--`: js.Array[String], engine: String, `type`: angular): AngularBuildOptions = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularBuildOptions]
  }
  
  @scala.inline
  implicit class AngularBuildOptionsOps[Self <: AngularBuildOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfiguration(value: String): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    
    @scala.inline
    def setCordovaAssets(value: Boolean): Self = this.set("cordovaAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCordovaAssets: Self = this.set("cordovaAssets", js.undefined)
    
    @scala.inline
    def setSourcemaps(value: Boolean): Self = this.set("sourcemaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcemaps: Self = this.set("sourcemaps", js.undefined)
    
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
}
