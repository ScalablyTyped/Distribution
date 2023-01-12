package typings.keycloakJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeycloakTokenParsed
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var acr: js.UndefOr[String] = js.undefined
  
  var amr: js.UndefOr[String] = js.undefined
  
  var aud: js.UndefOr[String] = js.undefined
  
  var auth_time: js.UndefOr[Double] = js.undefined
  
  var azp: js.UndefOr[String] = js.undefined
  
  var exp: js.UndefOr[Double] = js.undefined
  
  var iat: js.UndefOr[Double] = js.undefined
  
  var iss: js.UndefOr[String] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var realm_access: js.UndefOr[KeycloakRoles] = js.undefined
  
  var resource_access: js.UndefOr[KeycloakResourceAccess] = js.undefined
  
  var session_state: js.UndefOr[String] = js.undefined
  
  var sub: js.UndefOr[String] = js.undefined
}
object KeycloakTokenParsed {
  
  inline def apply(): KeycloakTokenParsed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeycloakTokenParsed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeycloakTokenParsed] (val x: Self) extends AnyVal {
    
    inline def setAcr(value: String): Self = StObject.set(x, "acr", value.asInstanceOf[js.Any])
    
    inline def setAcrUndefined: Self = StObject.set(x, "acr", js.undefined)
    
    inline def setAmr(value: String): Self = StObject.set(x, "amr", value.asInstanceOf[js.Any])
    
    inline def setAmrUndefined: Self = StObject.set(x, "amr", js.undefined)
    
    inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    inline def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
    
    inline def setAuth_time(value: Double): Self = StObject.set(x, "auth_time", value.asInstanceOf[js.Any])
    
    inline def setAuth_timeUndefined: Self = StObject.set(x, "auth_time", js.undefined)
    
    inline def setAzp(value: String): Self = StObject.set(x, "azp", value.asInstanceOf[js.Any])
    
    inline def setAzpUndefined: Self = StObject.set(x, "azp", js.undefined)
    
    inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    inline def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
    
    inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
    
    inline def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setRealm_access(value: KeycloakRoles): Self = StObject.set(x, "realm_access", value.asInstanceOf[js.Any])
    
    inline def setRealm_accessUndefined: Self = StObject.set(x, "realm_access", js.undefined)
    
    inline def setResource_access(value: KeycloakResourceAccess): Self = StObject.set(x, "resource_access", value.asInstanceOf[js.Any])
    
    inline def setResource_accessUndefined: Self = StObject.set(x, "resource_access", js.undefined)
    
    inline def setSession_state(value: String): Self = StObject.set(x, "session_state", value.asInstanceOf[js.Any])
    
    inline def setSession_stateUndefined: Self = StObject.set(x, "session_state", js.undefined)
    
    inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
  }
}
