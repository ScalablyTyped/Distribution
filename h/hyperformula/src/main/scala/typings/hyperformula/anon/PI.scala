package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PI extends StObject {
  
  var PI: ParametersArray
  
  var SQRTPI: MethodString
}
object PI {
  
  inline def apply(PI: ParametersArray, SQRTPI: MethodString): PI = {
    val __obj = js.Dynamic.literal(PI = PI.asInstanceOf[js.Any], SQRTPI = SQRTPI.asInstanceOf[js.Any])
    __obj.asInstanceOf[PI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PI] (val x: Self) extends AnyVal {
    
    inline def setPI(value: ParametersArray): Self = StObject.set(x, "PI", value.asInstanceOf[js.Any])
    
    inline def setSQRTPI(value: MethodString): Self = StObject.set(x, "SQRTPI", value.asInstanceOf[js.Any])
  }
}
