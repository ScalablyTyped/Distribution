package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMUGeneralOption extends StObject {
  
  var controller: js.UndefOr[String] = js.undefined
  
  var freq: js.UndefOr[Double] = js.undefined
}
object IMUGeneralOption {
  
  inline def apply(): IMUGeneralOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMUGeneralOption]
  }
  
  extension [Self <: IMUGeneralOption](x: Self) {
    
    inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
    
    inline def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
  }
}
