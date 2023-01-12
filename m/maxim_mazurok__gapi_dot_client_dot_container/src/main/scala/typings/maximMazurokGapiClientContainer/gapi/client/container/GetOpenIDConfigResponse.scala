package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpenIDConfigResponse extends StObject {
  
  /** OnePlatform automatically extracts this field and uses it to set the HTTP Cache-Control header. */
  var cacheHeader: js.UndefOr[HttpCacheControlResponseHeader] = js.undefined
  
  /** Supported claims. */
  var claims_supported: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Supported grant types. */
  var grant_types: js.UndefOr[js.Array[String]] = js.undefined
  
  /** supported ID Token signing Algorithms. */
  var id_token_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.undefined
  
  /** OIDC Issuer. */
  var issuer: js.UndefOr[String] = js.undefined
  
  /** JSON Web Key uri. */
  var jwks_uri: js.UndefOr[String] = js.undefined
  
  /** Supported response types. */
  var response_types_supported: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Supported subject types. */
  var subject_types_supported: js.UndefOr[js.Array[String]] = js.undefined
}
object GetOpenIDConfigResponse {
  
  inline def apply(): GetOpenIDConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpenIDConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOpenIDConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setCacheHeader(value: HttpCacheControlResponseHeader): Self = StObject.set(x, "cacheHeader", value.asInstanceOf[js.Any])
    
    inline def setCacheHeaderUndefined: Self = StObject.set(x, "cacheHeader", js.undefined)
    
    inline def setClaims_supported(value: js.Array[String]): Self = StObject.set(x, "claims_supported", value.asInstanceOf[js.Any])
    
    inline def setClaims_supportedUndefined: Self = StObject.set(x, "claims_supported", js.undefined)
    
    inline def setClaims_supportedVarargs(value: String*): Self = StObject.set(x, "claims_supported", js.Array(value*))
    
    inline def setGrant_types(value: js.Array[String]): Self = StObject.set(x, "grant_types", value.asInstanceOf[js.Any])
    
    inline def setGrant_typesUndefined: Self = StObject.set(x, "grant_types", js.undefined)
    
    inline def setGrant_typesVarargs(value: String*): Self = StObject.set(x, "grant_types", js.Array(value*))
    
    inline def setId_token_signing_alg_values_supported(value: js.Array[String]): Self = StObject.set(x, "id_token_signing_alg_values_supported", value.asInstanceOf[js.Any])
    
    inline def setId_token_signing_alg_values_supportedUndefined: Self = StObject.set(x, "id_token_signing_alg_values_supported", js.undefined)
    
    inline def setId_token_signing_alg_values_supportedVarargs(value: String*): Self = StObject.set(x, "id_token_signing_alg_values_supported", js.Array(value*))
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setJwks_uri(value: String): Self = StObject.set(x, "jwks_uri", value.asInstanceOf[js.Any])
    
    inline def setJwks_uriUndefined: Self = StObject.set(x, "jwks_uri", js.undefined)
    
    inline def setResponse_types_supported(value: js.Array[String]): Self = StObject.set(x, "response_types_supported", value.asInstanceOf[js.Any])
    
    inline def setResponse_types_supportedUndefined: Self = StObject.set(x, "response_types_supported", js.undefined)
    
    inline def setResponse_types_supportedVarargs(value: String*): Self = StObject.set(x, "response_types_supported", js.Array(value*))
    
    inline def setSubject_types_supported(value: js.Array[String]): Self = StObject.set(x, "subject_types_supported", value.asInstanceOf[js.Any])
    
    inline def setSubject_types_supportedUndefined: Self = StObject.set(x, "subject_types_supported", js.undefined)
    
    inline def setSubject_types_supportedVarargs(value: String*): Self = StObject.set(x, "subject_types_supported", js.Array(value*))
  }
}
