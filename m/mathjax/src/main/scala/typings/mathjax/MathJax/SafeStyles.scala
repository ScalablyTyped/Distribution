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
    if (!js.isUndefined(backgroundColor)) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(cursor)) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(fontFamily)) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(fontStyle)) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(fontWeight)) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(textShadow)) __obj.updateDynamic("textShadow")(textShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeStyles]
  }
}

