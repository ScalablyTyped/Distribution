package typings.gsi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevocationResponse extends StObject {
  
  /** This field optionally contains a detailed error response message. */
  var error: String
  
  /** This field is the return value of the method call. */
  var successful: Boolean
}
object RevocationResponse {
  
  inline def apply(error: String, successful: Boolean): RevocationResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevocationResponse]
  }
  
  extension [Self <: RevocationResponse](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setSuccessful(value: Boolean): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
  }
}
