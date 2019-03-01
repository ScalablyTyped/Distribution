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
    sourcemaps: js.UndefOr[scala.Boolean] = js.undefined
  ): IonicAngularBuildOptions = {
    val __obj = js.Dynamic.literal(`--` = `--`, `type` = `type`)
    __obj.updateDynamic("aot")(aot)
    __obj.updateDynamic("engine")(engine)
    __obj.updateDynamic("minifycss")(minifycss)
    __obj.updateDynamic("minifyjs")(minifyjs)
    __obj.updateDynamic("optimizejs")(optimizejs)
    __obj.updateDynamic("prod")(prod)
    if (env != null) __obj.updateDynamic("env")(env)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (project != null) __obj.updateDynamic("project")(project)
    if (!js.isUndefined(sourcemaps)) __obj.updateDynamic("sourcemaps")(sourcemaps)
    __obj.asInstanceOf[IonicAngularBuildOptions]
  }
}

