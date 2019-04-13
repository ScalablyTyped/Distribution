package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSObject extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String | Gradient] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  var left: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var overflow: js.UndefOr[java.lang.String] = js.undefined
  var padding: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var textOutline: js.UndefOr[java.lang.String] = js.undefined
  var textOverflow: js.UndefOr[java.lang.String] = js.undefined
  var top: js.UndefOr[java.lang.String] = js.undefined
  var whiteSpace: js.UndefOr[java.lang.String] = js.undefined
}

object CSSObject {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: java.lang.String = null,
    color: java.lang.String | Gradient = null,
    cursor: java.lang.String = null,
    font: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: java.lang.String = null,
    fontWeight: java.lang.String = null,
    left: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    overflow: java.lang.String = null,
    padding: java.lang.String | scala.Double = null,
    position: java.lang.String = null,
    textOutline: java.lang.String = null,
    textOverflow: java.lang.String = null,
    top: java.lang.String = null,
    whiteSpace: java.lang.String = null
  ): CSSObject = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (font != null) __obj.updateDynamic("font")(font)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (left != null) __obj.updateDynamic("left")(left)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (textOutline != null) __obj.updateDynamic("textOutline")(textOutline)
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow)
    if (top != null) __obj.updateDynamic("top")(top)
    if (whiteSpace != null) __obj.updateDynamic("whiteSpace")(whiteSpace)
    __obj.asInstanceOf[CSSObject]
  }
}

