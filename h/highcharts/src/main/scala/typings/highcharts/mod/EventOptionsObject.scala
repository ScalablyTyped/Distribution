package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventOptionsObject extends StObject {
  
  /**
    * The order the event handler should be called. This opens for having one
    * handler be called before another, independent of in which order they were
    * added.
    */
  var order: Double
  
  /**
    * Whether an event should be passive or not. When set to `true`, the
    * function specified by listener will never call `preventDefault()`.
    */
  var passive: Boolean
}
object EventOptionsObject {
  
  inline def apply(order: Double, passive: Boolean): EventOptionsObject = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], passive = passive.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOptionsObject]
  }
  
  extension [Self <: EventOptionsObject](x: Self) {
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
  }
}
