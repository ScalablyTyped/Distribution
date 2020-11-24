package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOpenIDConfigResponse extends js.Object {
  
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
  implicit class GetOpenIDConfigResponseOps[Self <: GetOpenIDConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCacheHeader(value: HttpCacheControlResponseHeader): Self = this.set("cacheHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheHeader: Self = this.set("cacheHeader", js.undefined)
    
    @scala.inline
    def setClaims_supportedVarargs(value: String*): Self = this.set("claims_supported", js.Array(value :_*))
    
    @scala.inline
    def setClaims_supported(value: js.Array[String]): Self = this.set("claims_supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaims_supported: Self = this.set("claims_supported", js.undefined)
    
    @scala.inline
    def setGrant_typesVarargs(value: String*): Self = this.set("grant_types", js.Array(value :_*))
    
    @scala.inline
    def setGrant_types(value: js.Array[String]): Self = this.set("grant_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrant_types: Self = this.set("grant_types", js.undefined)
    
    @scala.inline
    def setId_token_signing_alg_values_supportedVarargs(value: String*): Self = this.set("id_token_signing_alg_values_supported", js.Array(value :_*))
    
    @scala.inline
    def setId_token_signing_alg_values_supported(value: js.Array[String]): Self = this.set("id_token_signing_alg_values_supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId_token_signing_alg_values_supported: Self = this.set("id_token_signing_alg_values_supported", js.undefined)
    
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    
    @scala.inline
    def setJwks_uri(value: String): Self = this.set("jwks_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwks_uri: Self = this.set("jwks_uri", js.undefined)
    
    @scala.inline
    def setResponse_types_supportedVarargs(value: String*): Self = this.set("response_types_supported", js.Array(value :_*))
    
    @scala.inline
    def setResponse_types_supported(value: js.Array[String]): Self = this.set("response_types_supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse_types_supported: Self = this.set("response_types_supported", js.undefined)
    
    @scala.inline
    def setSubject_types_supportedVarargs(value: String*): Self = this.set("subject_types_supported", js.Array(value :_*))
    
    @scala.inline
    def setSubject_types_supported(value: js.Array[String]): Self = this.set("subject_types_supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject_types_supported: Self = this.set("subject_types_supported", js.undefined)
  }
}
