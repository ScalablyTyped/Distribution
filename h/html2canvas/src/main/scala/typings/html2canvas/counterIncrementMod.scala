package typings.html2canvas

import typings.html2canvas.ipropertydescriptorMod.IPropertyListDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object counterIncrementMod {
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/counter-increment", "counterIncrement")
  @js.native
  val counterIncrement: IPropertyListDescriptor[CounterIncrement_] = js.native
  
  trait COUNTER_INCREMENT extends StObject {
    
    var counter: String
    
    var increment: Double
  }
  object COUNTER_INCREMENT {
    
    inline def apply(counter: String, increment: Double): COUNTER_INCREMENT = {
      val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], increment = increment.asInstanceOf[js.Any])
      __obj.asInstanceOf[COUNTER_INCREMENT]
    }
    
    extension [Self <: COUNTER_INCREMENT](x: Self) {
      
      inline def setCounter(value: String): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    }
  }
  
  type CounterIncrement_ = js.Array[COUNTER_INCREMENT] | Null
}
