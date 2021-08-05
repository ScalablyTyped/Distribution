package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GetOpenIDConfigResponse is an OIDC discovery document for the cluster. See
  * the OpenID Connect Discovery 1.0 specification for details.
  */
trait SchemaGetOpenIDConfigResponse extends StObject {
  
  /**
    * NOLINT
    */
  var claims_supported: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * NOLINT
    */
  var grant_types: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * NOLINT
    */
  var id_token_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * NOLINT
    */
  var issuer: js.UndefOr[String] = js.undefined
  
  /**
    * NOLINT
    */
  var jwks_uri: js.UndefOr[String] = js.undefined
  
  /**
    * NOLINT
    */
  var response_types_supported: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * NOLINT
    */
  var subject_types_supported: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaGetOpenIDConfigResponse {
  
  inline def apply(): SchemaGetOpenIDConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOpenIDConfigResponse]
  }
  
  extension [Self <: SchemaGetOpenIDConfigResponse](x: Self) {
    
    inline def setClaims_supported(value: js.Array[String]): Self = StObject.set(x, "claims_supported", value.asInstanceOf[js.Any])
    
    inline def setClaims_supportedUndefined: Self = StObject.set(x, "claims_supported", js.undefined)
    
    inline def setClaims_supportedVarargs(value: String*): Self = StObject.set(x, "claims_supported", js.Array(value :_*))
    
    inline def setGrant_types(value: js.Array[String]): Self = StObject.set(x, "grant_types", value.asInstanceOf[js.Any])
    
    inline def setGrant_typesUndefined: Self = StObject.set(x, "grant_types", js.undefined)
    
    inline def setGrant_typesVarargs(value: String*): Self = StObject.set(x, "grant_types", js.Array(value :_*))
    
    inline def setId_token_signing_alg_values_supported(value: js.Array[String]): Self = StObject.set(x, "id_token_signing_alg_values_supported", value.asInstanceOf[js.Any])
    
    inline def setId_token_signing_alg_values_supportedUndefined: Self = StObject.set(x, "id_token_signing_alg_values_supported", js.undefined)
    
    inline def setId_token_signing_alg_values_supportedVarargs(value: String*): Self = StObject.set(x, "id_token_signing_alg_values_supported", js.Array(value :_*))
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setJwks_uri(value: String): Self = StObject.set(x, "jwks_uri", value.asInstanceOf[js.Any])
    
    inline def setJwks_uriUndefined: Self = StObject.set(x, "jwks_uri", js.undefined)
    
    inline def setResponse_types_supported(value: js.Array[String]): Self = StObject.set(x, "response_types_supported", value.asInstanceOf[js.Any])
    
    inline def setResponse_types_supportedUndefined: Self = StObject.set(x, "response_types_supported", js.undefined)
    
    inline def setResponse_types_supportedVarargs(value: String*): Self = StObject.set(x, "response_types_supported", js.Array(value :_*))
    
    inline def setSubject_types_supported(value: js.Array[String]): Self = StObject.set(x, "subject_types_supported", value.asInstanceOf[js.Any])
    
    inline def setSubject_types_supportedUndefined: Self = StObject.set(x, "subject_types_supported", js.undefined)
    
    inline def setSubject_types_supportedVarargs(value: String*): Self = StObject.set(x, "subject_types_supported", js.Array(value :_*))
  }
}
