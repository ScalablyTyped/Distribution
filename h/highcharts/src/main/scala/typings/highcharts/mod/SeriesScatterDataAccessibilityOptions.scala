package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesScatterDataAccessibilityOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Provide a description of the data point,
    * announced to screen readers.
    */
  var description: js.UndefOr[String] = js.undefined
}

object SeriesScatterDataAccessibilityOptions {
  @scala.inline
  def apply(description: String = null): SeriesScatterDataAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesScatterDataAccessibilityOptions]
  }
}

