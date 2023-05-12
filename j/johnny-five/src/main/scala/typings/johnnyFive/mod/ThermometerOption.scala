package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThermometerOption extends StObject {
  
  var board: js.UndefOr[Board] = js.undefined
  
  var controller: js.UndefOr[String] = js.undefined
  
  var freq: js.UndefOr[Double] = js.undefined
  
  var pin: String | Double
  
  var toCelsius: js.UndefOr[js.Function1[/* val */ Double, Double]] = js.undefined
}
object ThermometerOption {
  
  inline def apply(pin: String | Double): ThermometerOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThermometerOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThermometerOption] (val x: Self) extends AnyVal {
    
    inline def setBoard(value: Board): Self = StObject.set(x, "board", value.asInstanceOf[js.Any])
    
    inline def setBoardUndefined: Self = StObject.set(x, "board", js.undefined)
    
    inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
    
    inline def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
    
    inline def setPin(value: String | Double): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setToCelsius(value: /* val */ Double => Double): Self = StObject.set(x, "toCelsius", js.Any.fromFunction1(value))
    
    inline def setToCelsiusUndefined: Self = StObject.set(x, "toCelsius", js.undefined)
  }
}
