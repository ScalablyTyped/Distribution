package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinePlotArea extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[SparklinePlotAreaBorder] = js.undefined
  var margin: js.UndefOr[Double | js.Any] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object SparklinePlotArea {
  @scala.inline
  def apply(
    background: String = null,
    border: SparklinePlotAreaBorder = null,
    margin: Double | js.Any = null,
    opacity: Int | Double = null
  ): SparklinePlotArea = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklinePlotArea]
  }
}

