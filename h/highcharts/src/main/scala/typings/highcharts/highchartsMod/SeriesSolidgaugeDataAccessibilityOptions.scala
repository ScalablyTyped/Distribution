package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesSolidgaugeDataAccessibilityOptions extends js.Object {
  /**
    * (Highcharts) Provide a description of the data point, announced to screen
    * readers.
    */
  var description: js.UndefOr[String] = js.undefined
}

object SeriesSolidgaugeDataAccessibilityOptions {
  @scala.inline
  def apply(description: String = null): SeriesSolidgaugeDataAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SeriesSolidgaugeDataAccessibilityOptions]
  }
}

