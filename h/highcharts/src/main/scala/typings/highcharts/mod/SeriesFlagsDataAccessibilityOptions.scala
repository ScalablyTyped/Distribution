package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesFlagsDataAccessibilityOptions extends js.Object {
  /**
    * (Highstock) Provide a description of the data point, announced to screen
    * readers.
    */
  var description: js.UndefOr[String] = js.undefined
}

object SeriesFlagsDataAccessibilityOptions {
  @scala.inline
  def apply(description: String = null): SeriesFlagsDataAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesFlagsDataAccessibilityOptions]
  }
}

