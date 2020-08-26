package typings.highcharts.mod

import typings.highcharts.highchartsStrings.legendItemClick
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointLegendItemClickEventObject extends js.Object {
  /**
    * Related browser event.
    */
  var browserEvent: PointerEvent = js.native
  /**
    * Prevent the default action of toggle the visibility of the point.
    */
  var preventDefault: js.Function = js.native
  /**
    * Related point.
    */
  var target: Point = js.native
  /**
    * Event type.
    */
  var `type`: legendItemClick = js.native
}

object PointLegendItemClickEventObject {
  @scala.inline
  def apply(browserEvent: PointerEvent, preventDefault: js.Function, target: Point, `type`: legendItemClick): PointLegendItemClickEventObject = {
    val __obj = js.Dynamic.literal(browserEvent = browserEvent.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointLegendItemClickEventObject]
  }
  @scala.inline
  implicit class PointLegendItemClickEventObjectOps[Self <: PointLegendItemClickEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBrowserEvent(value: PointerEvent): Self = this.set("browserEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: js.Function): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Point): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: legendItemClick): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

