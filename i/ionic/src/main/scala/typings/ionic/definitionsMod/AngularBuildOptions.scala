package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.angular
import org.scalablytyped.runtime.StObject
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
  implicit class AngularBuildOptionsMutableBuilder[Self <: AngularBuildOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setCordovaAssets(value: Boolean): Self = StObject.set(x, "cordovaAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCordovaAssetsUndefined: Self = StObject.set(x, "cordovaAssets", js.undefined)
    
    @scala.inline
    def setSourcemaps(value: Boolean): Self = StObject.set(x, "sourcemaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcemapsUndefined: Self = StObject.set(x, "sourcemaps", js.undefined)
    
    @scala.inline
    def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
