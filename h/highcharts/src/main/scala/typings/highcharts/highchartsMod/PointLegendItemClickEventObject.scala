package typings.highcharts.highchartsMod

import typings.highcharts.highchartsStrings.legendItemClick
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointLegendItemClickEventObject extends js.Object {
  /**
    * Related browser event.
    */
  var browserEvent: PointerEvent
  /**
    * Prevent the default action of toggle the visibility of the point.
    */
  var preventDefault: js.Function
  /**
    * Related point.
    */
  var target: Point
  /**
    * Event type.
    */
  var `type`: legendItemClick
}

object PointLegendItemClickEventObject {
  @scala.inline
  def apply(browserEvent: PointerEvent, preventDefault: js.Function, target: Point, `type`: legendItemClick): PointLegendItemClickEventObject = {
    val __obj = js.Dynamic.literal(browserEvent = browserEvent.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointLegendItemClickEventObject]
  }
}

