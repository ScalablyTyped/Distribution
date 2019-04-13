package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolLayout extends js.Object {
  var `icon-allow-overlap`: js.UndefOr[scala.Boolean | StyleFunction | Expression] = js.undefined
  var `icon-anchor`: js.UndefOr[Anchor | StyleFunction | Expression] = js.undefined
  var `icon-ignore-placement`: js.UndefOr[scala.Boolean] = js.undefined
  var `icon-image`: js.UndefOr[java.lang.String | StyleFunction | Expression] = js.undefined
  var `icon-keep-upright`: js.UndefOr[scala.Boolean] = js.undefined
  var `icon-offset`: js.UndefOr[js.Array[scala.Double] | StyleFunction | Expression] = js.undefined
  var `icon-optional`: js.UndefOr[scala.Boolean] = js.undefined
  var `icon-padding`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `icon-pitch-alignment`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport | mapboxDashGlLib.mapboxDashGlLibStrings.auto
  ] = js.undefined
  var `icon-rotate`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `icon-rotation-alignment`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport | mapboxDashGlLib.mapboxDashGlLibStrings.auto
  ] = js.undefined
  var `icon-size`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `icon-text-fit`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.none | mapboxDashGlLib.mapboxDashGlLibStrings.both | mapboxDashGlLib.mapboxDashGlLibStrings.width | mapboxDashGlLib.mapboxDashGlLibStrings.height
  ] = js.undefined
  var `icon-text-fit-padding`: js.UndefOr[js.Array[scala.Double] | Expression] = js.undefined
  var `symbol-avoid-edges`: js.UndefOr[scala.Boolean] = js.undefined
  var `symbol-placement`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.point | mapboxDashGlLib.mapboxDashGlLibStrings.line | mapboxDashGlLib.mapboxDashGlLibStrings.`line-center`
  ] = js.undefined
  var `symbol-spacing`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `symbol-z-order`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.`viewport-y` | mapboxDashGlLib.mapboxDashGlLibStrings.source
  ] = js.undefined
  var `text-allow-overlap`: js.UndefOr[scala.Boolean] = js.undefined
  var `text-anchor`: js.UndefOr[Anchor | StyleFunction | Expression] = js.undefined
  var `text-field`: js.UndefOr[java.lang.String | StyleFunction | Expression] = js.undefined
  var `text-font`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var `text-ignore-placement`: js.UndefOr[scala.Boolean] = js.undefined
  var `text-justify`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.left | mapboxDashGlLib.mapboxDashGlLibStrings.center | mapboxDashGlLib.mapboxDashGlLibStrings.right
  ] = js.undefined
  var `text-keep-upright`: js.UndefOr[scala.Boolean] = js.undefined
  var `text-letter-spacing`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `text-line-height`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `text-max-angle`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `text-max-width`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `text-offset`: js.UndefOr[js.Array[scala.Double] | Expression] = js.undefined
  var `text-optional`: js.UndefOr[scala.Boolean] = js.undefined
  var `text-padding`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `text-pitch-alignment`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport | mapboxDashGlLib.mapboxDashGlLibStrings.auto
  ] = js.undefined
  var `text-rotate`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `text-rotation-alignment`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport | mapboxDashGlLib.mapboxDashGlLibStrings.auto
  ] = js.undefined
  var `text-size`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `text-transform`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.none | mapboxDashGlLib.mapboxDashGlLibStrings.uppercase | mapboxDashGlLib.mapboxDashGlLibStrings.lowercase | StyleFunction | Expression
  ] = js.undefined
  var visibility: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.visible | mapboxDashGlLib.mapboxDashGlLibStrings.none
  ] = js.undefined
}

object SymbolLayout {
  @scala.inline
  def apply(
    `icon-allow-overlap`: scala.Boolean | StyleFunction | Expression = null,
    `icon-anchor`: Anchor | StyleFunction | Expression = null,
    `icon-ignore-placement`: js.UndefOr[scala.Boolean] = js.undefined,
    `icon-image`: java.lang.String | StyleFunction | Expression = null,
    `icon-keep-upright`: js.UndefOr[scala.Boolean] = js.undefined,
    `icon-offset`: js.Array[scala.Double] | StyleFunction | Expression = null,
    `icon-optional`: js.UndefOr[scala.Boolean] = js.undefined,
    `icon-padding`: scala.Double | Expression = null,
    `icon-pitch-alignment`: mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport | mapboxDashGlLib.mapboxDashGlLibStrings.auto = null,
    `icon-rotate`: scala.Double | StyleFunction | Expression = null,
    `icon-rotation-alignment`: mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport | mapboxDashGlLib.mapboxDashGlLibStrings.auto = null,
    `icon-size`: scala.Double | StyleFunction | Expression = null,
    `icon-text-fit`: mapboxDashGlLib.mapboxDashGlLibStrings.none | mapboxDashGlLib.mapboxDashGlLibStrings.both | mapboxDashGlLib.mapboxDashGlLibStrings.width | mapboxDashGlLib.mapboxDashGlLibStrings.height = null,
    `icon-text-fit-padding`: js.Array[scala.Double] | Expression = null,
    `symbol-avoid-edges`: js.UndefOr[scala.Boolean] = js.undefined,
    `symbol-placement`: mapboxDashGlLib.mapboxDashGlLibStrings.point | mapboxDashGlLib.mapboxDashGlLibStrings.line | mapboxDashGlLib.mapboxDashGlLibStrings.`line-center` = null,
    `symbol-spacing`: scala.Double | Expression = null,
    `symbol-z-order`: mapboxDashGlLib.mapboxDashGlLibStrings.`viewport-y` | mapboxDashGlLib.mapboxDashGlLibStrings.source = null,
    `text-allow-overlap`: js.UndefOr[scala.Boolean] = js.undefined,
    `text-anchor`: Anchor | StyleFunction | Expression = null,
    `text-field`: java.lang.String | StyleFunction | Expression = null,
    `text-font`: java.lang.String | js.Array[java.lang.String] = null,
    `text-ignore-placement`: js.UndefOr[scala.Boolean] = js.undefined,
    `text-justify`: mapboxDashGlLib.mapboxDashGlLibStrings.left | mapboxDashGlLib.mapboxDashGlLibStrings.center | mapboxDashGlLib.mapboxDashGlLibStrings.right = null,
    `text-keep-upright`: js.UndefOr[scala.Boolean] = js.undefined,
    `text-letter-spacing`: scala.Double | Expression = null,
    `text-line-height`: scala.Double | Expression = null,
    `text-max-angle`: scala.Double | Expression = null,
    `text-max-width`: scala.Double | Expression = null,
    `text-offset`: js.Array[scala.Double] | Expression = null,
    `text-optional`: js.UndefOr[scala.Boolean] = js.undefined,
    `text-padding`: scala.Double | Expression = null,
    `text-pitch-alignment`: mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport | mapboxDashGlLib.mapboxDashGlLibStrings.auto = null,
    `text-rotate`: scala.Double | StyleFunction | Expression = null,
    `text-rotation-alignment`: mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport | mapboxDashGlLib.mapboxDashGlLibStrings.auto = null,
    `text-size`: scala.Double | StyleFunction | Expression = null,
    `text-transform`: mapboxDashGlLib.mapboxDashGlLibStrings.none | mapboxDashGlLib.mapboxDashGlLibStrings.uppercase | mapboxDashGlLib.mapboxDashGlLibStrings.lowercase | StyleFunction | Expression = null,
    visibility: mapboxDashGlLib.mapboxDashGlLibStrings.visible | mapboxDashGlLib.mapboxDashGlLibStrings.none = null
  ): SymbolLayout = {
    val __obj = js.Dynamic.literal()
    if (`icon-allow-overlap` != null) __obj.updateDynamic("icon-allow-overlap")(`icon-allow-overlap`.asInstanceOf[js.Any])
    if (`icon-anchor` != null) __obj.updateDynamic("icon-anchor")(`icon-anchor`.asInstanceOf[js.Any])
    if (!js.isUndefined(`icon-ignore-placement`)) __obj.updateDynamic("icon-ignore-placement")(`icon-ignore-placement`)
    if (`icon-image` != null) __obj.updateDynamic("icon-image")(`icon-image`.asInstanceOf[js.Any])
    if (!js.isUndefined(`icon-keep-upright`)) __obj.updateDynamic("icon-keep-upright")(`icon-keep-upright`)
    if (`icon-offset` != null) __obj.updateDynamic("icon-offset")(`icon-offset`.asInstanceOf[js.Any])
    if (!js.isUndefined(`icon-optional`)) __obj.updateDynamic("icon-optional")(`icon-optional`)
    if (`icon-padding` != null) __obj.updateDynamic("icon-padding")(`icon-padding`.asInstanceOf[js.Any])
    if (`icon-pitch-alignment` != null) __obj.updateDynamic("icon-pitch-alignment")(`icon-pitch-alignment`.asInstanceOf[js.Any])
    if (`icon-rotate` != null) __obj.updateDynamic("icon-rotate")(`icon-rotate`.asInstanceOf[js.Any])
    if (`icon-rotation-alignment` != null) __obj.updateDynamic("icon-rotation-alignment")(`icon-rotation-alignment`.asInstanceOf[js.Any])
    if (`icon-size` != null) __obj.updateDynamic("icon-size")(`icon-size`.asInstanceOf[js.Any])
    if (`icon-text-fit` != null) __obj.updateDynamic("icon-text-fit")(`icon-text-fit`.asInstanceOf[js.Any])
    if (`icon-text-fit-padding` != null) __obj.updateDynamic("icon-text-fit-padding")(`icon-text-fit-padding`.asInstanceOf[js.Any])
    if (!js.isUndefined(`symbol-avoid-edges`)) __obj.updateDynamic("symbol-avoid-edges")(`symbol-avoid-edges`)
    if (`symbol-placement` != null) __obj.updateDynamic("symbol-placement")(`symbol-placement`.asInstanceOf[js.Any])
    if (`symbol-spacing` != null) __obj.updateDynamic("symbol-spacing")(`symbol-spacing`.asInstanceOf[js.Any])
    if (`symbol-z-order` != null) __obj.updateDynamic("symbol-z-order")(`symbol-z-order`.asInstanceOf[js.Any])
    if (!js.isUndefined(`text-allow-overlap`)) __obj.updateDynamic("text-allow-overlap")(`text-allow-overlap`)
    if (`text-anchor` != null) __obj.updateDynamic("text-anchor")(`text-anchor`.asInstanceOf[js.Any])
    if (`text-field` != null) __obj.updateDynamic("text-field")(`text-field`.asInstanceOf[js.Any])
    if (`text-font` != null) __obj.updateDynamic("text-font")(`text-font`.asInstanceOf[js.Any])
    if (!js.isUndefined(`text-ignore-placement`)) __obj.updateDynamic("text-ignore-placement")(`text-ignore-placement`)
    if (`text-justify` != null) __obj.updateDynamic("text-justify")(`text-justify`.asInstanceOf[js.Any])
    if (!js.isUndefined(`text-keep-upright`)) __obj.updateDynamic("text-keep-upright")(`text-keep-upright`)
    if (`text-letter-spacing` != null) __obj.updateDynamic("text-letter-spacing")(`text-letter-spacing`.asInstanceOf[js.Any])
    if (`text-line-height` != null) __obj.updateDynamic("text-line-height")(`text-line-height`.asInstanceOf[js.Any])
    if (`text-max-angle` != null) __obj.updateDynamic("text-max-angle")(`text-max-angle`.asInstanceOf[js.Any])
    if (`text-max-width` != null) __obj.updateDynamic("text-max-width")(`text-max-width`.asInstanceOf[js.Any])
    if (`text-offset` != null) __obj.updateDynamic("text-offset")(`text-offset`.asInstanceOf[js.Any])
    if (!js.isUndefined(`text-optional`)) __obj.updateDynamic("text-optional")(`text-optional`)
    if (`text-padding` != null) __obj.updateDynamic("text-padding")(`text-padding`.asInstanceOf[js.Any])
    if (`text-pitch-alignment` != null) __obj.updateDynamic("text-pitch-alignment")(`text-pitch-alignment`.asInstanceOf[js.Any])
    if (`text-rotate` != null) __obj.updateDynamic("text-rotate")(`text-rotate`.asInstanceOf[js.Any])
    if (`text-rotation-alignment` != null) __obj.updateDynamic("text-rotation-alignment")(`text-rotation-alignment`.asInstanceOf[js.Any])
    if (`text-size` != null) __obj.updateDynamic("text-size")(`text-size`.asInstanceOf[js.Any])
    if (`text-transform` != null) __obj.updateDynamic("text-transform")(`text-transform`.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolLayout]
  }
}

