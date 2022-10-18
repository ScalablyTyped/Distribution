package typings.html2canvas

import typings.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyListDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssPropertyDescriptorsCounterResetMod {
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/counter-reset", "counterReset")
  @js.native
  val counterReset: IPropertyListDescriptor[CounterReset_] = js.native
  
  trait COUNTER_RESET extends StObject {
    
    var counter: String
    
    var reset: Double
  }
  object COUNTER_RESET {
    
    inline def apply(counter: String, reset: Double): COUNTER_RESET = {
      val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any])
      __obj.asInstanceOf[COUNTER_RESET]
    }
    
    extension [Self <: COUNTER_RESET](x: Self) {
      
      inline def setCounter(value: String): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setReset(value: Double): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    }
  }
  
  type CounterReset_ = js.Array[COUNTER_RESET]
}
