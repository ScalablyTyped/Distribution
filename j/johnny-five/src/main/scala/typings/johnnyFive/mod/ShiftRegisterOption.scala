package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShiftRegisterOption extends StObject {
  
  var isAnode: js.UndefOr[Boolean] = js.undefined
  
  var pins: js.Any
}
object ShiftRegisterOption {
  
  @scala.inline
  def apply(pins: js.Any): ShiftRegisterOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShiftRegisterOption]
  }
  
  @scala.inline
  implicit class ShiftRegisterOptionMutableBuilder[Self <: ShiftRegisterOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsAnode(value: Boolean): Self = StObject.set(x, "isAnode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAnodeUndefined: Self = StObject.set(x, "isAnode", js.undefined)
    
    @scala.inline
    def setPins(value: js.Any): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
  }
}
