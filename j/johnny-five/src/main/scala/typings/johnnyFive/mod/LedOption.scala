package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LedOption extends StObject {
  
  var address: js.UndefOr[Double] = js.undefined
  
  var controller: js.UndefOr[String] = js.undefined
  
  var isAnode: js.UndefOr[Boolean] = js.undefined
  
  var pin: Double
  
  var `type`: js.UndefOr[String] = js.undefined
}
object LedOption {
  
  @scala.inline
  def apply(pin: Double): LedOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedOption]
  }
  
  @scala.inline
  implicit class LedOptionMutableBuilder[Self <: LedOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Double): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    @scala.inline
    def setIsAnode(value: Boolean): Self = StObject.set(x, "isAnode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAnodeUndefined: Self = StObject.set(x, "isAnode", js.undefined)
    
    @scala.inline
    def setPin(value: Double): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
