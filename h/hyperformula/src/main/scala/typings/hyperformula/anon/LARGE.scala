package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LARGE extends StObject {
  
  var LARGE: `12`
  
  var MEDIAN: MethodParametersRepeatLastArgs
  
  var SMALL: `12`
}
object LARGE {
  
  inline def apply(LARGE: `12`, MEDIAN: MethodParametersRepeatLastArgs, SMALL: `12`): LARGE = {
    val __obj = js.Dynamic.literal(LARGE = LARGE.asInstanceOf[js.Any], MEDIAN = MEDIAN.asInstanceOf[js.Any], SMALL = SMALL.asInstanceOf[js.Any])
    __obj.asInstanceOf[LARGE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LARGE] (val x: Self) extends AnyVal {
    
    inline def setLARGE(value: `12`): Self = StObject.set(x, "LARGE", value.asInstanceOf[js.Any])
    
    inline def setMEDIAN(value: MethodParametersRepeatLastArgs): Self = StObject.set(x, "MEDIAN", value.asInstanceOf[js.Any])
    
    inline def setSMALL(value: `12`): Self = StObject.set(x, "SMALL", value.asInstanceOf[js.Any])
  }
}
