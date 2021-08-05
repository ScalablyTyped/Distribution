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
}
object EventOptionsObject {
  
  inline def apply(order: Double): EventOptionsObject = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOptionsObject]
  }
  
  extension [Self <: EventOptionsObject](x: Self) {
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
