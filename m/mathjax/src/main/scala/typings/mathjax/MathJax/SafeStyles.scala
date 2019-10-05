package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeStyles extends js.Object {
  var backgroundColor: js.UndefOr[Boolean] = js.undefined
  var border: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[Boolean] = js.undefined
  var cursor: js.UndefOr[Boolean] = js.undefined
  var fontFamily: js.UndefOr[Boolean] = js.undefined
  var fontSize: js.UndefOr[Boolean] = js.undefined
  var fontStyle: js.UndefOr[Boolean] = js.undefined
  var fontWeight: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[Boolean] = js.undefined
  var opacity: js.UndefOr[Boolean] = js.undefined
  var outline: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[Boolean] = js.undefined
  var textShadow: js.UndefOr[Boolean] = js.undefined
}

object SafeStyles {
  @scala.inline
  def apply(
    backgroundColor: js.UndefOr[Boolean] = js.undefined,
    border: js.UndefOr[Boolean] = js.undefined,
    color: js.UndefOr[Boolean] = js.undefined,
    cursor: js.UndefOr[Boolean] = js.undefined,
    fontFamily: js.UndefOr[Boolean] = js.undefined,
    fontSize: js.UndefOr[Boolean] = js.undefined,
    fontStyle: js.UndefOr[Boolean] = js.undefined,
    fontWeight: js.UndefOr[Boolean] = js.undefined,
    margin: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Boolean] = js.undefined,
    outline: js.UndefOr[Boolean] = js.undefined,
    padding: js.UndefOr[Boolean] = js.undefined,
    textShadow: js.UndefOr[Boolean] = js.undefined
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

