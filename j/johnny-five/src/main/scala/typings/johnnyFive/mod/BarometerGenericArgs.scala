package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarometerGenericArgs extends StObject {
  
  var address: js.UndefOr[Double] = js.undefined
  
  var controller: SupportedBarometers
  
  var freq: js.UndefOr[Double] = js.undefined
}
object BarometerGenericArgs {
  
  inline def apply(controller: SupportedBarometers): BarometerGenericArgs = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarometerGenericArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarometerGenericArgs] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Double): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setController(value: SupportedBarometers): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
    
    inline def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
  }
}
