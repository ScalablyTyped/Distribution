package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesItemConnectors extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SparklineSeriesItemConnectors {
  @scala.inline
  def apply(color: String = null, padding: Int | Double = null, width: Int | Double = null): SparklineSeriesItemConnectors = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineSeriesItemConnectors]
  }
}

