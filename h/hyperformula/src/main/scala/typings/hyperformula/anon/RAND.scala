package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RAND extends StObject {
  
  var RAND: IsVolatileMethod
  
  var RANDBETWEEN: IsVolatileMethodParameters
}
object RAND {
  
  inline def apply(RAND: IsVolatileMethod, RANDBETWEEN: IsVolatileMethodParameters): RAND = {
    val __obj = js.Dynamic.literal(RAND = RAND.asInstanceOf[js.Any], RANDBETWEEN = RANDBETWEEN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RAND]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RAND] (val x: Self) extends AnyVal {
    
    inline def setRAND(value: IsVolatileMethod): Self = StObject.set(x, "RAND", value.asInstanceOf[js.Any])
    
    inline def setRANDBETWEEN(value: IsVolatileMethodParameters): Self = StObject.set(x, "RANDBETWEEN", value.asInstanceOf[js.Any])
  }
}
