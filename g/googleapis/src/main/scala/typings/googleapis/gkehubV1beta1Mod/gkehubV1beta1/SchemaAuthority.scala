package typings.googleapis.gkehubV1beta1Mod.gkehubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthority extends StObject {
  
  /**
    * Output only. An identity provider that reflects the `issuer` in the workload identity pool.
    */
  var identityProvider: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://` and be a valid URL with length <2000 characters. If set, then Google will allow valid OIDC tokens from this issuer to authenticate within the workload_identity_pool. OIDC discovery will be performed on this URI to validate tokens from the issuer. Clearing `issuer` disables Workload Identity. `issuer` cannot be directly modified; it must be cleared (and Workload Identity disabled) before using a new issuer (and re-enabling Workload Identity).
    */
  var issuer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. OIDC verification keys for this Membership in JWKS format (RFC 7517). When this field is set, OIDC discovery will NOT be performed on `issuer`, and instead OIDC tokens will be validated using this field.
    */
  var oidcJwks: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the workload identity pool in which `issuer` will be recognized. There is a single Workload Identity Pool per Hub that is shared between all Memberships that belong to that Hub. For a Hub hosted in {PROJECT_ID\}, the workload pool format is `{PROJECT_ID\}.hub.id.goog`, although this is subject to change in newer versions of this API.
    */
  var workloadIdentityPool: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuthority {
  
  inline def apply(): SchemaAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthority]
  }
  
  extension [Self <: SchemaAuthority](x: Self) {
    
    inline def setIdentityProvider(value: String): Self = StObject.set(x, "identityProvider", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderNull: Self = StObject.set(x, "identityProvider", null)
    
    inline def setIdentityProviderUndefined: Self = StObject.set(x, "identityProvider", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerNull: Self = StObject.set(x, "issuer", null)
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setOidcJwks(value: String): Self = StObject.set(x, "oidcJwks", value.asInstanceOf[js.Any])
    
    inline def setOidcJwksNull: Self = StObject.set(x, "oidcJwks", null)
    
    inline def setOidcJwksUndefined: Self = StObject.set(x, "oidcJwks", js.undefined)
    
    inline def setWorkloadIdentityPool(value: String): Self = StObject.set(x, "workloadIdentityPool", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdentityPoolNull: Self = StObject.set(x, "workloadIdentityPool", null)
    
    inline def setWorkloadIdentityPoolUndefined: Self = StObject.set(x, "workloadIdentityPool", js.undefined)
  }
}
