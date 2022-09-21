package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleIdentityAccesscontextmanagerV1IngressFrom extends StObject {
  
  /**
    * A list of identities that are allowed access through this ingress policy. Should be in the format of email address. The email address should represent individual user or service
    * account only.
    */
  var identities: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Specifies the type of identities that are allowed access from outside the perimeter. If left unspecified, then members of `identities` field will be allowed access. */
  var identityType: js.UndefOr[String] = js.undefined
  
  /** Sources that this IngressPolicy authorizes access from. */
  var sources: js.UndefOr[js.Array[GoogleIdentityAccesscontextmanagerV1IngressSource]] = js.undefined
}
object GoogleIdentityAccesscontextmanagerV1IngressFrom {
  
  inline def apply(): GoogleIdentityAccesscontextmanagerV1IngressFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityAccesscontextmanagerV1IngressFrom]
  }
  
  extension [Self <: GoogleIdentityAccesscontextmanagerV1IngressFrom](x: Self) {
    
    inline def setIdentities(value: js.Array[String]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesUndefined: Self = StObject.set(x, "identities", js.undefined)
    
    inline def setIdentitiesVarargs(value: String*): Self = StObject.set(x, "identities", js.Array(value*))
    
    inline def setIdentityType(value: String): Self = StObject.set(x, "identityType", value.asInstanceOf[js.Any])
    
    inline def setIdentityTypeUndefined: Self = StObject.set(x, "identityType", js.undefined)
    
    inline def setSources(value: js.Array[GoogleIdentityAccesscontextmanagerV1IngressSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: GoogleIdentityAccesscontextmanagerV1IngressSource*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
