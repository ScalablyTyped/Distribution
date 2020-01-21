package typings.highcharts.mod

import typings.highcharts.highchartsStrings.addSeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAddSeriesEventObject extends js.Object {
  /**
    * The series options that were passed to the `addSeries` method.
    */
  var options: SeriesOptionsType
  /**
    * Prevents the default behaviour of the event.
    */
  var preventDefault: js.Function
  /**
    * The event target.
    */
  var target: Chart_
  /**
    * The event type.
    */
  var `type`: addSeries
}

object ChartAddSeriesEventObject {
  @scala.inline
  def apply(options: SeriesOptionsType, preventDefault: js.Function, target: Chart_, `type`: addSeries): ChartAddSeriesEventObject = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAddSeriesEventObject]
  }
}

