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
    val __obj = js.Dynamic.literal(aot = aot, engine = engine, minifycss = minifycss, minifyjs = minifyjs, optimizejs = optimizejs, prod = prod)
    __obj.updateDynamic("--")(`--`)
    __obj.updateDynamic("type")(`type`)
    if (env != null) __obj.updateDynamic("env")(env)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (project != null) __obj.updateDynamic("project")(project)
    if (!js.isUndefined(sourcemaps)) __obj.updateDynamic("sourcemaps")(sourcemaps)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[IonicAngularBuildOptions]
  }
}

