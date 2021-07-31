package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashClientIdResponse extends StObject {
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var hashedClientId: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var webPropertyId: js.UndefOr[String] = js.undefined
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
