package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThermometerOption extends StObject {
  
  var controller: js.UndefOr[String] = js.native
  
  var freq: js.UndefOr[Double] = js.native
  
  var pin: String | Double = js.native
  
  var toCelsius: js.UndefOr[js.Function1[/* val */ Double, Double]] = js.native
}
object ThermometerOption {
  
  @scala.inline
  def apply(pin: String | Double): ThermometerOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThermometerOption]
  }
  
  @scala.inline
  implicit class ThermometerOptionMutableBuilder[Self <: ThermometerOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    @scala.inline
    def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
    
    @scala.inline
    def setPin(value: String | Double): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToCelsius(value: /* val */ Double => Double): Self = StObject.set(x, "toCelsius", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToCelsiusUndefined: Self = StObject.set(x, "toCelsius", js.undefined)
  }
}
