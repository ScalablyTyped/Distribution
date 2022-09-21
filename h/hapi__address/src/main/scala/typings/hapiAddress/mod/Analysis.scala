package typings.hapiAddress.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Analysis extends StObject {
  
  /**
    * The error code.
    */
  var code: String
  
  /**
    * The reason validation failed.
    */
  var error: String
}
object Analysis {
  
  inline def apply(code: String, error: String): Analysis = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analysis]
  }
  
  extension [Self <: Analysis](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
