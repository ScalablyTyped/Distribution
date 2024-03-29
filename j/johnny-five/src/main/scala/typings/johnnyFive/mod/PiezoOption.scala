package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PiezoOption extends StObject {
  
  var board: js.UndefOr[Board] = js.undefined
  
  var pin: Double
}
object PiezoOption {
  
  inline def apply(pin: Double): PiezoOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PiezoOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PiezoOption] (val x: Self) extends AnyVal {
    
    inline def setBoard(value: Board): Self = StObject.set(x, "board", value.asInstanceOf[js.Any])
    
    inline def setBoardUndefined: Self = StObject.set(x, "board", js.undefined)
    
    inline def setPin(value: Double): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
  }
}
