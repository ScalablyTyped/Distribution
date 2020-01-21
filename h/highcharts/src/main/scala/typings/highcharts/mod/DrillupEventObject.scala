package typings.highcharts.mod

import typings.highcharts.highchartsStrings.drillup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrillupEventObject extends js.Object {
  /**
    * Prevents the default behaviour of the event.
    */
  var preventDefault: js.Function
  /**
    * Options for the new series.
    */
  var seriesOptions: js.UndefOr[SeriesOptionsType] = js.undefined
  /**
    * The event target.
    */
  var target: Chart_
  /**
    * The event type.
    */
  var `type`: drillup
}

object DrillupEventObject {
  @scala.inline
  def apply(
    preventDefault: js.Function,
    target: Chart_,
    `type`: drillup,
    seriesOptions: SeriesOptionsType = null
  ): DrillupEventObject = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (seriesOptions != null) __obj.updateDynamic("seriesOptions")(seriesOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrillupEventObject]
  }
}

