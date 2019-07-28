package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesErrorbarDataAccessibilityOptions extends js.Object {
  /**
    * (Highcharts) Provide a description of the data point, announced to screen
    * readers.
    */
  var description: js.UndefOr[String] = js.undefined
}

object SeriesErrorbarDataAccessibilityOptions {
  @scala.inline
  def apply(description: String = null): SeriesErrorbarDataAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SeriesErrorbarDataAccessibilityOptions]
  }
}

