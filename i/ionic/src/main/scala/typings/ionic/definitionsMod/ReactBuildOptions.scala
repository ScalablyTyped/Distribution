package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.react
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactBuildOptions extends BuildOptions[react] {
  var ci: js.UndefOr[Boolean] = js.undefined
  var inlineRuntimeChunk: js.UndefOr[Boolean] = js.undefined
  var publicUrl: js.UndefOr[String] = js.undefined
  var sourceMap: js.UndefOr[Boolean] = js.undefined
}

object ReactBuildOptions {
  @scala.inline
  def apply(
    `--`: js.Array[String],
    engine: String,
    `type`: react,
    ci: js.UndefOr[Boolean] = js.undefined,
    inlineRuntimeChunk: js.UndefOr[Boolean] = js.undefined,
    platform: String = null,
    project: String = null,
    publicUrl: String = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): ReactBuildOptions = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(ci)) __obj.updateDynamic("ci")(ci.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineRuntimeChunk)) __obj.updateDynamic("inlineRuntimeChunk")(inlineRuntimeChunk.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (publicUrl != null) __obj.updateDynamic("publicUrl")(publicUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactBuildOptions]
  }
}

