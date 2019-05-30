package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactBuildOptions
  extends BuildOptions[ionicLib.ionicLibStrings.react] {
  var ci: js.UndefOr[scala.Boolean] = js.undefined
  var inlineRuntimeChunk: js.UndefOr[scala.Boolean] = js.undefined
  var publicUrl: js.UndefOr[java.lang.String] = js.undefined
  var sourceMap: js.UndefOr[scala.Boolean] = js.undefined
}

object ReactBuildOptions {
  @scala.inline
  def apply(
    `--`: js.Array[java.lang.String],
    engine: java.lang.String,
    `type`: ionicLib.ionicLibStrings.react,
    ci: js.UndefOr[scala.Boolean] = js.undefined,
    inlineRuntimeChunk: js.UndefOr[scala.Boolean] = js.undefined,
    platform: java.lang.String = null,
    project: java.lang.String = null,
    publicUrl: java.lang.String = null,
    sourceMap: js.UndefOr[scala.Boolean] = js.undefined
  ): ReactBuildOptions = {
    val __obj = js.Dynamic.literal(engine = engine)
    __obj.updateDynamic("--")(`--`)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(ci)) __obj.updateDynamic("ci")(ci)
    if (!js.isUndefined(inlineRuntimeChunk)) __obj.updateDynamic("inlineRuntimeChunk")(inlineRuntimeChunk)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (project != null) __obj.updateDynamic("project")(project)
    if (publicUrl != null) __obj.updateDynamic("publicUrl")(publicUrl)
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap)
    __obj.asInstanceOf[ReactBuildOptions]
  }
}

