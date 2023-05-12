package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HygrometerOption extends StObject {
  
  var board: js.UndefOr[Board] = js.undefined
  
  var controller: js.UndefOr[String] = js.undefined
  
  var freq: js.UndefOr[Double] = js.undefined
}
object HygrometerOption {
  
  inline def apply(): HygrometerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HygrometerOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HygrometerOption] (val x: Self) extends AnyVal {
    
    inline def setBoard(value: Board): Self = StObject.set(x, "board", value.asInstanceOf[js.Any])
    
    inline def setBoardUndefined: Self = StObject.set(x, "board", js.undefined)
    
    inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
    
    inline def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
  }
}
