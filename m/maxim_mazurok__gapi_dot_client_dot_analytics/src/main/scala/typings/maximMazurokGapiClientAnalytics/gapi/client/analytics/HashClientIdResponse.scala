package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashClientIdResponse extends StObject {
  
  var clientId: js.UndefOr[String] = js.native
  
  var hashedClientId: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var webPropertyId: js.UndefOr[String] = js.native
}
object HashClientIdResponse {
  
  @scala.inline
  def apply(): HashClientIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashClientIdResponse]
  }
  
  @scala.inline
  implicit class HashClientIdResponseMutableBuilder[Self <: HashClientIdResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setHashedClientId(value: String): Self = StObject.set(x, "hashedClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashedClientIdUndefined: Self = StObject.set(x, "hashedClientId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
