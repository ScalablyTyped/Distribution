package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueBuildOptions extends BuildOptions[vue] {
  var configuration: js.UndefOr[String] = js.native
  var cordovaAssets: js.UndefOr[Boolean] = js.native
  var sourcemaps: js.UndefOr[Boolean] = js.native
}

object VueBuildOptions {
  @scala.inline
  def apply(`--`: js.Array[String], engine: String, `type`: vue): VueBuildOptions = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueBuildOptions]
  }
  @scala.inline
  implicit class VueBuildOptionsOps[Self <: VueBuildOptions] (val x: Self) extends AnyVal {
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
  }
  
}

