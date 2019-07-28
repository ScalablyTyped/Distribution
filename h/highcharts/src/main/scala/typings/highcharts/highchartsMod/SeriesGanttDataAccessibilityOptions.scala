package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesGanttDataAccessibilityOptions extends js.Object {
  /**
    * (Gantt) Provide a description of the data point, announced to screen
    * readers.
    */
  var description: js.UndefOr[String] = js.undefined
}

object SeriesGanttDataAccessibilityOptions {
  @scala.inline
  def apply(description: String = null): SeriesGanttDataAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SeriesGanttDataAccessibilityOptions]
  }
}

