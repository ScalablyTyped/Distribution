package typings.highcharts.mod

import typings.highcharts.highchartsStrings.legendItemClick
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesLegendItemClickEventObject extends js.Object {
  /**
    * Related browser event.
    */
  var browserEvent: PointerEvent
  /**
    * Prevent the default action of toggle the visibility of the series.
    */
  var preventDefault: js.Function
  /**
    * Related series.
    */
  var target: Series
  /**
    * Event type.
    */
  var `type`: legendItemClick
}

object SeriesLegendItemClickEventObject {
  @scala.inline
  def apply(browserEvent: PointerEvent, preventDefault: js.Function, target: Series, `type`: legendItemClick): SeriesLegendItemClickEventObject = {
    val __obj = js.Dynamic.literal(browserEvent = browserEvent.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesLegendItemClickEventObject]
  }
}

