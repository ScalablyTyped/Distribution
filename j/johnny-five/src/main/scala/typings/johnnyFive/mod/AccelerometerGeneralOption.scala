package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccelerometerGeneralOption extends StObject {
  
  var controller: js.UndefOr[String] = js.undefined
}
object AccelerometerGeneralOption {
  
  inline def apply(): AccelerometerGeneralOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccelerometerGeneralOption]
  }
  
  extension [Self <: AccelerometerGeneralOption](x: Self) {
    
    inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
  }
}
