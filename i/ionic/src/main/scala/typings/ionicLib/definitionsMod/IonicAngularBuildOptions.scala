package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicAngularBuildOptions
  extends BuildOptions[ionicLib.ionicLibStrings.`ionic-angular`] {
  var aot: scala.Boolean
  var env: js.UndefOr[java.lang.String] = js.undefined
  var minifycss: scala.Boolean
  var minifyjs: scala.Boolean
  var optimizejs: scala.Boolean
  var prod: scala.Boolean
  var sourcemaps: js.UndefOr[scala.Boolean] = js.undefined
}

object IonicAngularBuildOptions {
  @scala.inline
  def apply(
    `--`: js.Array[java.lang.String],
    aot: scala.Boolean,
    engine: java.lang.String,
    minifycss: scala.Boolean,
    minifyjs: scala.Boolean,
    optimizejs: scala.Boolean,
    prod: scala.Boolean,
    `type`: ionicLib.ionicLibStrings.`ionic-angular`,
    env: java.lang.String = null,
    platform: java.lang.String = null,
    project: java.lang.String = null,
    sourcemaps: js.UndefOr[scala.Boolean] = js.undefined,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
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

