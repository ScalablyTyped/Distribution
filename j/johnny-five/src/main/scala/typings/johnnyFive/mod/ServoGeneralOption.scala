package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServoGeneralOption extends StObject {
  
  var center: js.UndefOr[Boolean] = js.undefined
  
  var controller: js.UndefOr[String] = js.undefined
  
  var isInverted: js.UndefOr[Boolean] = js.undefined
  
  var pin: Double | String
  
  var range: js.UndefOr[js.Array[Double]] = js.undefined
  
  var startAt: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ServoGeneralOption {
  
  @scala.inline
  def apply(pin: Double | String): ServoGeneralOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServoGeneralOption]
  }
  
  @scala.inline
  implicit class ServoGeneralOptionMutableBuilder[Self <: ServoGeneralOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    @scala.inline
    def setIsInverted(value: Boolean): Self = StObject.set(x, "isInverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInvertedUndefined: Self = StObject.set(x, "isInverted", js.undefined)
    
    @scala.inline
    def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value :_*))
    
    @scala.inline
    def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
