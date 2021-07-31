package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AltimeterOption extends StObject {
  
  var address: js.UndefOr[Double] = js.undefined
  
  var controller: String
  
  var elevation: js.UndefOr[Double] = js.undefined
  
  var freq: js.UndefOr[Double] = js.undefined
}
object AltimeterOption {
  
  @scala.inline
  def apply(controller: String): AltimeterOption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltimeterOption]
  }
  
  @scala.inline
  implicit class AltimeterOptionMutableBuilder[Self <: AltimeterOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Double): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    @scala.inline
    def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
  }
}
