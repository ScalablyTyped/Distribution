package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServoGeneralOption extends StObject {
  
  var board: js.UndefOr[Board] = js.undefined
  
  var center: js.UndefOr[Boolean] = js.undefined
  
  var controller: js.UndefOr[String] = js.undefined
  
  var isInverted: js.UndefOr[Boolean] = js.undefined
  
  var pin: Double | String
  
  var range: js.UndefOr[js.Array[Double]] = js.undefined
  
  var startAt: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ServoGeneralOption {
  
  inline def apply(pin: Double | String): ServoGeneralOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServoGeneralOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServoGeneralOption] (val x: Self) extends AnyVal {
    
    inline def setBoard(value: Board): Self = StObject.set(x, "board", value.asInstanceOf[js.Any])
    
    inline def setBoardUndefined: Self = StObject.set(x, "board", js.undefined)
    
    inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setIsInverted(value: Boolean): Self = StObject.set(x, "isInverted", value.asInstanceOf[js.Any])
    
    inline def setIsInvertedUndefined: Self = StObject.set(x, "isInverted", js.undefined)
    
    inline def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    
    inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
