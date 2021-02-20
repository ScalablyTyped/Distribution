package typings.hapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestOrig extends StObject {
  
  var params: js.Object = js.native
  
  var payload: js.Object = js.native
  
  var query: js.Object = js.native
}
object RequestOrig {
  
  @scala.inline
  def apply(params: js.Object, payload: js.Object, query: js.Object): RequestOrig = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOrig]
  }
  
  @scala.inline
  implicit class RequestOrigMutableBuilder[Self <: RequestOrig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
