package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesDefaultsOverlay extends js.Object {
  var gradient: js.UndefOr[String] = js.undefined
}

object ChartSeriesDefaultsOverlay {
  @scala.inline
  def apply(gradient: String = null): ChartSeriesDefaultsOverlay = {
    val __obj = js.Dynamic.literal()
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesDefaultsOverlay]
  }
}

