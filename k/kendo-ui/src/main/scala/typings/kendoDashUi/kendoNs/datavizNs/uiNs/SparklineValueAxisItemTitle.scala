package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineValueAxisItemTitle extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[SparklineValueAxisItemTitleBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[Double | js.Any] = js.undefined
  var padding: js.UndefOr[Double | js.Any] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SparklineValueAxisItemTitle {
  @scala.inline
  def apply(
    background: String = null,
    border: SparklineValueAxisItemTitleBorder = null,
    color: String = null,
    font: String = null,
    margin: Double | js.Any = null,
    padding: Double | js.Any = null,
    position: String = null,
    rotation: Int | Double = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SparklineValueAxisItemTitle = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SparklineValueAxisItemTitle]
  }
}

