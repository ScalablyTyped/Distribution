package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CODE extends StObject {
  
  var CODE: Method
  
  var UNICODE: Method
}
object CODE {
  
  inline def apply(CODE: Method, UNICODE: Method): CODE = {
    val __obj = js.Dynamic.literal(CODE = CODE.asInstanceOf[js.Any], UNICODE = UNICODE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CODE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CODE] (val x: Self) extends AnyVal {
    
    inline def setCODE(value: Method): Self = StObject.set(x, "CODE", value.asInstanceOf[js.Any])
    
    inline def setUNICODE(value: Method): Self = StObject.set(x, "UNICODE", value.asInstanceOf[js.Any])
  }
}
