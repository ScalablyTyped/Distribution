package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GetOpenIDConfigResponse is an OIDC discovery document for the cluster. See
  * the OpenID Connect Discovery 1.0 specification for details.
  */
@js.native
trait SchemaGetOpenIDConfigResponse extends js.Object {
  
  /**
    * NOLINT
    */
  var claims_supported: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * NOLINT
    */
  var grant_types: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * NOLINT
    */
  var id_token_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * NOLINT
    */
  var issuer: js.UndefOr[String] = js.native
  
  /**
    * NOLINT
    */
  var jwks_uri: js.UndefOr[String] = js.native
  
  /**
    * NOLINT
    */
  var response_types_supported: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * NOLINT
    */
  var subject_types_supported: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGetOpenIDConfigResponse {
  
  @scala.inline
  def apply(): SchemaGetOpenIDConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOpenIDConfigResponse]
  }
  
  @scala.inline
  implicit class SchemaGetOpenIDConfigResponseOps[Self <: SchemaGetOpenIDConfigResponse] (val x: Self) extends AnyVal {
    
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
