package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.angular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularBuildOptions extends BuildOptions[angular] {
  /**
    * The Angular architect configuration to use for builds.
    *
    * The `--prod` command line flag is a shortcut which translates to the
    * 'production' configuration.
    */
  var configuration: js.UndefOr[String] = js.undefined
  var cordovaAssets: js.UndefOr[Boolean] = js.undefined
  var sourcemaps: js.UndefOr[Boolean] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
}

object AngularBuildOptions {
  @scala.inline
  def apply(
    `--`: js.Array[String],
    engine: String,
    `type`: angular,
    configuration: String = null,
    cordovaAssets: js.UndefOr[Boolean] = js.undefined,
    platform: String = null,
    project: String = null,
    sourcemaps: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    watch: js.UndefOr[Boolean] = js.undefined
  ): AngularBuildOptions = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (!js.isUndefined(cordovaAssets)) __obj.updateDynamic("cordovaAssets")(cordovaAssets.get.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcemaps)) __obj.updateDynamic("sourcemaps")(sourcemaps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularBuildOptions]
  }
}

