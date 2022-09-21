package typings.googleapis.v1p1beta1Mod.cloudassetV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityAccesscontextmanagerV1IngressFrom extends StObject {
  
  /**
    * A list of identities that are allowed access through this ingress policy. Should be in the format of email address. The email address should represent individual user or service account only.
    */
  var identities: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Specifies the type of identities that are allowed access from outside the perimeter. If left unspecified, then members of `identities` field will be allowed access.
    */
  var identityType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sources that this IngressPolicy authorizes access from.
    */
  var sources: js.UndefOr[js.Array[SchemaGoogleIdentityAccesscontextmanagerV1IngressSource]] = js.undefined
}
object SchemaGoogleIdentityAccesscontextmanagerV1IngressFrom {
  
  inline def apply(): SchemaGoogleIdentityAccesscontextmanagerV1IngressFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityAccesscontextmanagerV1IngressFrom]
  }
  
  extension [Self <: SchemaGoogleIdentityAccesscontextmanagerV1IngressFrom](x: Self) {
    
    inline def setIdentities(value: js.Array[String]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesNull: Self = StObject.set(x, "identities", null)
    
    inline def setIdentitiesUndefined: Self = StObject.set(x, "identities", js.undefined)
    
    inline def setIdentitiesVarargs(value: String*): Self = StObject.set(x, "identities", js.Array(value*))
    
    inline def setIdentityType(value: String): Self = StObject.set(x, "identityType", value.asInstanceOf[js.Any])
    
    inline def setIdentityTypeNull: Self = StObject.set(x, "identityType", null)
    
    inline def setIdentityTypeUndefined: Self = StObject.set(x, "identityType", js.undefined)
    
    inline def setSources(value: js.Array[SchemaGoogleIdentityAccesscontextmanagerV1IngressSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: SchemaGoogleIdentityAccesscontextmanagerV1IngressSource*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
