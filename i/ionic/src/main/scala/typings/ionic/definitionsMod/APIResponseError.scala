package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIResponseError extends APIResponse {
  
  var error: APIResponseErrorError = js.native
  
  var meta: APIResponseMeta = js.native
}
object APIResponseError {
  
  @scala.inline
  def apply(error: APIResponseErrorError, meta: APIResponseMeta): APIResponseError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponseError]
  }
  
  @scala.inline
  implicit class APIResponseErrorMutableBuilder[Self <: APIResponseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: APIResponseErrorError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: APIResponseMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
