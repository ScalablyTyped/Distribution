package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemOverlay extends js.Object {
  var gradient: js.UndefOr[String] = js.undefined
}

object ChartSeriesItemOverlay {
  @scala.inline
  def apply(gradient: String = null): ChartSeriesItemOverlay = {
    val __obj = js.Dynamic.literal()
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesItemOverlay]
  }
}

