package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesWindbarbDataAccessibilityOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Provide a description of the data point,
    * announced to screen readers.
    */
  var description: js.UndefOr[String] = js.undefined
}

object SeriesWindbarbDataAccessibilityOptions {
  @scala.inline
  def apply(description: String = null): SeriesWindbarbDataAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SeriesWindbarbDataAccessibilityOptions]
  }
}

