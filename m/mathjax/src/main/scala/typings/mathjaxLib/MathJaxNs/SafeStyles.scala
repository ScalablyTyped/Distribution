package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeStyles extends js.Object {
  var backgroundColor: js.UndefOr[scala.Boolean] = js.undefined
  var border: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[scala.Boolean] = js.undefined
  var cursor: js.UndefOr[scala.Boolean] = js.undefined
  var fontFamily: js.UndefOr[scala.Boolean] = js.undefined
  var fontSize: js.UndefOr[scala.Boolean] = js.undefined
  var fontStyle: js.UndefOr[scala.Boolean] = js.undefined
  var fontWeight: js.UndefOr[scala.Boolean] = js.undefined
  var margin: js.UndefOr[scala.Boolean] = js.undefined
  var opacity: js.UndefOr[scala.Boolean] = js.undefined
  var outline: js.UndefOr[scala.Boolean] = js.undefined
  var padding: js.UndefOr[scala.Boolean] = js.undefined
  var textShadow: js.UndefOr[scala.Boolean] = js.undefined
}

object SafeStyles {
  @scala.inline
  def apply(
    backgroundColor: js.UndefOr[scala.Boolean] = js.undefined,
    border: js.UndefOr[scala.Boolean] = js.undefined,
    color: js.UndefOr[scala.Boolean] = js.undefined,
    cursor: js.UndefOr[scala.Boolean] = js.undefined,
    fontFamily: js.UndefOr[scala.Boolean] = js.undefined,
    fontSize: js.UndefOr[scala.Boolean] = js.undefined,
    fontStyle: js.UndefOr[scala.Boolean] = js.undefined,
    fontWeight: js.UndefOr[scala.Boolean] = js.undefined,
    margin: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: js.UndefOr[scala.Boolean] = js.undefined,
    outline: js.UndefOr[scala.Boolean] = js.undefined,
    padding: js.UndefOr[scala.Boolean] = js.undefined,
    textShadow: js.UndefOr[scala.Boolean] = js.undefined
  ): SafeStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backgroundColor)) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border)
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(cursor)) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(fontFamily)) __obj.updateDynamic("fontFamily")(fontFamily)
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize)
    if (!js.isUndefined(fontStyle)) __obj.updateDynamic("fontStyle")(fontStyle)
    if (!js.isUndefined(fontWeight)) __obj.updateDynamic("fontWeight")(fontWeight)
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin)
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity)
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding)
    if (!js.isUndefined(textShadow)) __obj.updateDynamic("textShadow")(textShadow)
    __obj.asInstanceOf[SafeStyles]
  }
}

