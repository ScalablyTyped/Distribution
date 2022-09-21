package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetOpenIDConfigResponse extends StObject {
  
  /**
    * OnePlatform automatically extracts this field and uses it to set the HTTP Cache-Control header.
    */
  var cacheHeader: js.UndefOr[SchemaHttpCacheControlResponseHeader] = js.undefined
  
  /**
    * Supported claims.
    */
  var claims_supported: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Supported grant types.
    */
  var grant_types: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * supported ID Token signing Algorithms.
    */
  var id_token_signing_alg_values_supported: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * OIDC Issuer.
    */
  var issuer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * JSON Web Key uri.
    */
  var jwks_uri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Supported response types.
    */
  var response_types_supported: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Supported subject types.
    */
  var subject_types_supported: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGetOpenIDConfigResponse {
  
  inline def apply(): SchemaGetOpenIDConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOpenIDConfigResponse]
  }
  
  extension [Self <: SchemaGetOpenIDConfigResponse](x: Self) {
    
    inline def setCacheHeader(value: SchemaHttpCacheControlResponseHeader): Self = StObject.set(x, "cacheHeader", value.asInstanceOf[js.Any])
    
    inline def setCacheHeaderUndefined: Self = StObject.set(x, "cacheHeader", js.undefined)
    
    inline def setClaims_supported(value: js.Array[String]): Self = StObject.set(x, "claims_supported", value.asInstanceOf[js.Any])
    
    inline def setClaims_supportedNull: Self = StObject.set(x, "claims_supported", null)
    
    inline def setClaims_supportedUndefined: Self = StObject.set(x, "claims_supported", js.undefined)
    
    inline def setClaims_supportedVarargs(value: String*): Self = StObject.set(x, "claims_supported", js.Array(value*))
    
    inline def setGrant_types(value: js.Array[String]): Self = StObject.set(x, "grant_types", value.asInstanceOf[js.Any])
    
    inline def setGrant_typesNull: Self = StObject.set(x, "grant_types", null)
    
    inline def setGrant_typesUndefined: Self = StObject.set(x, "grant_types", js.undefined)
    
    inline def setGrant_typesVarargs(value: String*): Self = StObject.set(x, "grant_types", js.Array(value*))
    
    inline def setId_token_signing_alg_values_supported(value: js.Array[String]): Self = StObject.set(x, "id_token_signing_alg_values_supported", value.asInstanceOf[js.Any])
    
    inline def setId_token_signing_alg_values_supportedNull: Self = StObject.set(x, "id_token_signing_alg_values_supported", null)
    
    inline def setId_token_signing_alg_values_supportedUndefined: Self = StObject.set(x, "id_token_signing_alg_values_supported", js.undefined)
    
    inline def setId_token_signing_alg_values_supportedVarargs(value: String*): Self = StObject.set(x, "id_token_signing_alg_values_supported", js.Array(value*))
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerNull: Self = StObject.set(x, "issuer", null)
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setJwks_uri(value: String): Self = StObject.set(x, "jwks_uri", value.asInstanceOf[js.Any])
    
    inline def setJwks_uriNull: Self = StObject.set(x, "jwks_uri", null)
    
    inline def setJwks_uriUndefined: Self = StObject.set(x, "jwks_uri", js.undefined)
    
    inline def setResponse_types_supported(value: js.Array[String]): Self = StObject.set(x, "response_types_supported", value.asInstanceOf[js.Any])
    
    inline def setResponse_types_supportedNull: Self = StObject.set(x, "response_types_supported", null)
    
    inline def setResponse_types_supportedUndefined: Self = StObject.set(x, "response_types_supported", js.undefined)
    
    inline def setResponse_types_supportedVarargs(value: String*): Self = StObject.set(x, "response_types_supported", js.Array(value*))
    
    inline def setSubject_types_supported(value: js.Array[String]): Self = StObject.set(x, "subject_types_supported", value.asInstanceOf[js.Any])
    
    inline def setSubject_types_supportedNull: Self = StObject.set(x, "subject_types_supported", null)
    
    inline def setSubject_types_supportedUndefined: Self = StObject.set(x, "subject_types_supported", js.undefined)
    
    inline def setSubject_types_supportedVarargs(value: String*): Self = StObject.set(x, "subject_types_supported", js.Array(value*))
  }
}
