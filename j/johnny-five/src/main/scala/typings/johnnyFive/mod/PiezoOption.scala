package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PiezoOption extends StObject {
  
  var pin: Double
}
object PiezoOption {
  
  inline def apply(pin: Double): PiezoOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PiezoOption]
  }
  
  extension [Self <: PiezoOption](x: Self) {
    
    inline def setPin(value: Double): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
  }
}
