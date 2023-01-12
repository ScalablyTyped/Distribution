package typings.highcharts.mod

import typings.highcharts.highchartsStrings.drillupall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrillupAllEventObject extends StObject {
  
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
  var `type`: drillupall
}
object DrillupAllEventObject {
  
  inline def apply(preventDefault: js.Function, target: Chart_): DrillupAllEventObject = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("drillupall")
    __obj.asInstanceOf[DrillupAllEventObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrillupAllEventObject] (val x: Self) extends AnyVal {
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Chart_): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: drillupall): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
