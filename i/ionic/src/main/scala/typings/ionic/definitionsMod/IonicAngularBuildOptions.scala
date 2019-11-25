package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.`ionic-angular`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicAngularBuildOptions extends BuildOptions[`ionic-angular`] {
  var aot: Boolean
  var env: js.UndefOr[String] = js.undefined
  var minifycss: Boolean
  var minifyjs: Boolean
  var optimizejs: Boolean
  var prod: Boolean
  var sourcemaps: js.UndefOr[Boolean] = js.undefined
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
    `type`: `ionic-angular`,
    env: String = null,
    platform: String = null,
    project: String = null,
    sourcemaps: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): IonicAngularBuildOptions = {
    val __obj = js.Dynamic.literal(aot = aot.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], minifycss = minifycss.asInstanceOf[js.Any], minifyjs = minifyjs.asInstanceOf[js.Any], optimizejs = optimizejs.asInstanceOf[js.Any], prod = prod.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcemaps)) __obj.updateDynamic("sourcemaps")(sourcemaps.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicAngularBuildOptions]
  }
}

