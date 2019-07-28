package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesOhlcDataAccessibilityOptions extends js.Object {
  /**
    * (Highstock) Provide a description of the data point, announced to screen
    * readers.
    */
  var description: js.UndefOr[String] = js.undefined
}

object SeriesOhlcDataAccessibilityOptions {
  @scala.inline
  def apply(description: String = null): SeriesOhlcDataAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SeriesOhlcDataAccessibilityOptions]
  }
}

