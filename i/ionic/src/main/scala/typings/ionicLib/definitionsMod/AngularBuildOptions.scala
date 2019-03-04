package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularBuildOptions
  extends BuildOptions[ionicLib.ionicLibStrings.angular] {
  /**
    * The Angular architect configuration to use for builds.
    *
    * The `--prod` command line flag is a shortcut which translates to the
    * 'production' configuration.
    */
  var configuration: js.UndefOr[java.lang.String] = js.undefined
  var cordovaAssets: js.UndefOr[scala.Boolean] = js.undefined
  var sourcemaps: js.UndefOr[scala.Boolean] = js.undefined
}

object AngularBuildOptions {
  @scala.inline
  def apply(
    `--`: js.Array[java.lang.String],
    engine: java.lang.String,
    `type`: ionicLib.ionicLibStrings.angular,
    configuration: java.lang.String = null,
    cordovaAssets: js.UndefOr[scala.Boolean] = js.undefined,
    platform: java.lang.String = null,
    project: java.lang.String = null,
    sourcemaps: js.UndefOr[scala.Boolean] = js.undefined
  ): AngularBuildOptions = {
    val __obj = js.Dynamic.literal(engine = engine)
    __obj.updateDynamic("--")(`--`)
    __obj.updateDynamic("type")(`type`)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (!js.isUndefined(cordovaAssets)) __obj.updateDynamic("cordovaAssets")(cordovaAssets)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (project != null) __obj.updateDynamic("project")(project)
    if (!js.isUndefined(sourcemaps)) __obj.updateDynamic("sourcemaps")(sourcemaps)
    __obj.asInstanceOf[AngularBuildOptions]
  }
}

