package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotSerializerOptions extends js.Object {
  var callToJSON: js.UndefOr[Boolean] = js.undefined
  var edgeSpacing: js.UndefOr[String] = js.undefined
  var escapeRegex: js.UndefOr[Boolean] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  var indent: js.UndefOr[Double] = js.undefined
  var maxDepth: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Boolean] = js.undefined
  var plugins: js.UndefOr[js.Array[SnapshotSerializerPlugin]] = js.undefined
  var printFunctionName: js.UndefOr[Boolean] = js.undefined
  var spacing: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[SnapshotSerializerOptionsTheme] = js.undefined
}

object SnapshotSerializerOptions {
  @scala.inline
  def apply(
    callToJSON: js.UndefOr[Boolean] = js.undefined,
    edgeSpacing: String = null,
    escapeRegex: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    indent: Int | Double = null,
    maxDepth: Int | Double = null,
    min: js.UndefOr[Boolean] = js.undefined,
    plugins: js.Array[SnapshotSerializerPlugin] = null,
    printFunctionName: js.UndefOr[Boolean] = js.undefined,
    spacing: String = null,
    theme: SnapshotSerializerOptionsTheme = null
  ): SnapshotSerializerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(callToJSON)) __obj.updateDynamic("callToJSON")(callToJSON)
    if (edgeSpacing != null) __obj.updateDynamic("edgeSpacing")(edgeSpacing)
    if (!js.isUndefined(escapeRegex)) __obj.updateDynamic("escapeRegex")(escapeRegex)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(printFunctionName)) __obj.updateDynamic("printFunctionName")(printFunctionName)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[SnapshotSerializerOptions]
  }
}

