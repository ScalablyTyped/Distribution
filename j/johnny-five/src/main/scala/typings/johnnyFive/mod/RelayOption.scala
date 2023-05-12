package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.NC
import typings.johnnyFive.johnnyFiveStrings.NO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelayOption extends StObject {
  
  var board: js.UndefOr[Board] = js.undefined
  
  var pin: Double | String
  
  /**
    * @default 'NO'
    */
  var `type`: js.UndefOr[NO | NC] = js.undefined
}
object RelayOption {
  
  inline def apply(pin: Double | String): RelayOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelayOption] (val x: Self) extends AnyVal {
    
    inline def setBoard(value: Board): Self = StObject.set(x, "board", value.asInstanceOf[js.Any])
    
    inline def setBoardUndefined: Self = StObject.set(x, "board", js.undefined)
    
    inline def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setType(value: NO | NC): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
