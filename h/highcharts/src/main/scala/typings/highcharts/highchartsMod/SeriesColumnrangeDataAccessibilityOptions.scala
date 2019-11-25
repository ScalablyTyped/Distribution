package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesColumnrangeDataAccessibilityOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Provide a description of the data point,
    * announced to screen readers.
    */
  var description: js.UndefOr[String] = js.undefined
}

object SeriesColumnrangeDataAccessibilityOptions {
  @scala.inline
  def apply(description: String = null): SeriesColumnrangeDataAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesColumnrangeDataAccessibilityOptions]
  }
}

