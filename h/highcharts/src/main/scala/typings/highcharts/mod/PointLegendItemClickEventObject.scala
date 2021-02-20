package typings.highcharts.mod

import typings.highcharts.highchartsStrings.legendItemClick
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointLegendItemClickEventObject extends StObject {
  
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
  implicit class PointLegendItemClickEventObjectMutableBuilder[Self <: PointLegendItemClickEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowserEvent(value: PointerEvent): Self = StObject.set(x, "browserEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Point): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: legendItemClick): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
