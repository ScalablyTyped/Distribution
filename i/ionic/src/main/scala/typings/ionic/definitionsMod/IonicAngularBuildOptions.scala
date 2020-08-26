package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.`ionic-angular`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonicAngularBuildOptions extends BuildOptions[`ionic-angular`] {
  var aot: Boolean = js.native
  var env: js.UndefOr[String] = js.native
  var minifycss: Boolean = js.native
  var minifyjs: Boolean = js.native
  var optimizejs: Boolean = js.native
  var prod: Boolean = js.native
  var sourcemaps: js.UndefOr[Boolean] = js.native
}

object IonicAngularBuildOptions {
  @scala.inline
  def apply(
    `--`: js.Array[String],
    aot: Boolean,
    engine: String,
    minifycss: Boolean,
    minifyjs: Boolean,
    optimizejs: Boolean,
    prod: Boolean,
    `type`: `ionic-angular`
  ): IonicAngularBuildOptions = {
    val __obj = js.Dynamic.literal(aot = aot.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], minifycss = minifycss.asInstanceOf[js.Any], minifyjs = minifyjs.asInstanceOf[js.Any], optimizejs = optimizejs.asInstanceOf[js.Any], prod = prod.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicAngularBuildOptions]
  }
  @scala.inline
  implicit class IonicAngularBuildOptionsOps[Self <: IonicAngularBuildOptions] (val x: Self) extends AnyVal {
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
    def setAot(value: Boolean): Self = this.set("aot", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinifycss(value: Boolean): Self = this.set("minifycss", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinifyjs(value: Boolean): Self = this.set("minifyjs", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptimizejs(value: Boolean): Self = this.set("optimizejs", value.asInstanceOf[js.Any])
    @scala.inline
    def setProd(value: Boolean): Self = this.set("prod", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setSourcemaps(value: Boolean): Self = this.set("sourcemaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcemaps: Self = this.set("sourcemaps", js.undefined)
  }
  
}

