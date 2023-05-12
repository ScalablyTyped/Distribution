package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShiftRegisterOption extends StObject {
  
  var board: js.UndefOr[Board] = js.undefined
  
  var isAnode: js.UndefOr[Boolean] = js.undefined
  
  var pins: Any
}
object ShiftRegisterOption {
  
  inline def apply(pins: Any): ShiftRegisterOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShiftRegisterOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShiftRegisterOption] (val x: Self) extends AnyVal {
    
    inline def setBoard(value: Board): Self = StObject.set(x, "board", value.asInstanceOf[js.Any])
    
    inline def setBoardUndefined: Self = StObject.set(x, "board", js.undefined)
    
    inline def setIsAnode(value: Boolean): Self = StObject.set(x, "isAnode", value.asInstanceOf[js.Any])
    
    inline def setIsAnodeUndefined: Self = StObject.set(x, "isAnode", js.undefined)
    
    inline def setPins(value: Any): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
  }
}
