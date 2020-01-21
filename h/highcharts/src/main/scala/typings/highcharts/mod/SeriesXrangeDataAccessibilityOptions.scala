package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesXrangeDataAccessibilityOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Provide a description of the data point,
    * announced to screen readers.
    */
  var description: js.UndefOr[String] = js.undefined
}

object SeriesXrangeDataAccessibilityOptions {
  @scala.inline
  def apply(description: String = null): SeriesXrangeDataAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesXrangeDataAccessibilityOptions]
  }
}

