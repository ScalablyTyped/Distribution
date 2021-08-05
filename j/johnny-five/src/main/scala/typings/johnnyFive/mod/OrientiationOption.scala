package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrientiationOption extends StObject {
  
  var controller: js.UndefOr[String] = js.undefined
  
  var freq: js.UndefOr[Double] = js.undefined
}
object OrientiationOption {
  
  inline def apply(): OrientiationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrientiationOption]
  }
  
  extension [Self <: OrientiationOption](x: Self) {
    
    inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
    
    inline def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
  }
}
