package typings.highcharts.mod

import typings.highcharts.highchartsStrings.legendItemClick
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointLegendItemClickEventObject extends StObject {
  
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
  
  inline def apply(browserEvent: PointerEvent, preventDefault: js.Function, target: Point): PointLegendItemClickEventObject = {
    val __obj = js.Dynamic.literal(browserEvent = browserEvent.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("legendItemClick")
    __obj.asInstanceOf[PointLegendItemClickEventObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointLegendItemClickEventObject] (val x: Self) extends AnyVal {
    
    inline def setBrowserEvent(value: PointerEvent): Self = StObject.set(x, "browserEvent", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Point): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: legendItemClick): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
