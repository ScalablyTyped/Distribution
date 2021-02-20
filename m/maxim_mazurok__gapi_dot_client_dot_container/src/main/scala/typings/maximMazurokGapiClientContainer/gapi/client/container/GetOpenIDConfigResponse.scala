package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOpenIDConfigResponse extends StObject {
  
  /** OnePlatform automatically extracts this field and uses it to set the HTTP Cache-Control header. */
  var cacheHeader: js.UndefOr[HttpCacheControlResponseHeader] = js.native
  
  /** Supported claims. */
  var claims_supported: js.UndefOr[js.Array[String]] = js.native
  
  /** Supported grant types. */
  var grant_types: js.UndefOr[js.Array[String]] = js.native
  
  /** supported ID Token signing Algorithms. */
  var id_token_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.native
  
  /** OIDC Issuer. */
  var issuer: js.UndefOr[String] = js.native
  
  /** JSON Web Key uri. */
  var jwks_uri: js.UndefOr[String] = js.native
  
  /** Supported response types. */
  var response_types_supported: js.UndefOr[js.Array[String]] = js.native
  
  /** Supported subject types. */
  var subject_types_supported: js.UndefOr[js.Array[String]] = js.native
}
object GetOpenIDConfigResponse {
  
  @scala.inline
  def apply(): GetOpenIDConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpenIDConfigResponse]
  }
  
  @scala.inline
  implicit class GetOpenIDConfigResponseMutableBuilder[Self <: GetOpenIDConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheHeader(value: HttpCacheControlResponseHeader): Self = StObject.set(x, "cacheHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheHeaderUndefined: Self = StObject.set(x, "cacheHeader", js.undefined)
    
    @scala.inline
    def setClaims_supported(value: js.Array[String]): Self = StObject.set(x, "claims_supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaims_supportedUndefined: Self = StObject.set(x, "claims_supported", js.undefined)
    
    @scala.inline
    def setClaims_supportedVarargs(value: String*): Self = StObject.set(x, "claims_supported", js.Array(value :_*))
    
    @scala.inline
    def setGrant_types(value: js.Array[String]): Self = StObject.set(x, "grant_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrant_typesUndefined: Self = StObject.set(x, "grant_types", js.undefined)
    
    @scala.inline
    def setGrant_typesVarargs(value: String*): Self = StObject.set(x, "grant_types", js.Array(value :_*))
    
    @scala.inline
    def setId_token_signing_alg_values_supported(value: js.Array[String]): Self = StObject.set(x, "id_token_signing_alg_values_supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_token_signing_alg_values_supportedUndefined: Self = StObject.set(x, "id_token_signing_alg_values_supported", js.undefined)
    
    @scala.inline
    def setId_token_signing_alg_values_supportedVarargs(value: String*): Self = StObject.set(x, "id_token_signing_alg_values_supported", js.Array(value :_*))
    
    @scala.inline
    def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    @scala.inline
    def setJwks_uri(value: String): Self = StObject.set(x, "jwks_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJwks_uriUndefined: Self = StObject.set(x, "jwks_uri", js.undefined)
    
    @scala.inline
    def setResponse_types_supported(value: js.Array[String]): Self = StObject.set(x, "response_types_supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_types_supportedUndefined: Self = StObject.set(x, "response_types_supported", js.undefined)
    
    @scala.inline
    def setResponse_types_supportedVarargs(value: String*): Self = StObject.set(x, "response_types_supported", js.Array(value :_*))
    
    @scala.inline
    def setSubject_types_supported(value: js.Array[String]): Self = StObject.set(x, "subject_types_supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject_types_supportedUndefined: Self = StObject.set(x, "subject_types_supported", js.undefined)
    
    @scala.inline
    def setSubject_types_supportedVarargs(value: String*): Self = StObject.set(x, "subject_types_supported", js.Array(value :_*))
  }
}
