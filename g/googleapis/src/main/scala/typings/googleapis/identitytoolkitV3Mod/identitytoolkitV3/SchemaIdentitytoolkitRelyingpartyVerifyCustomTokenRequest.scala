package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to verify a custom token
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyVerifyCustomTokenRequest extends js.Object {
  
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  
  /**
    * Instance id token of the app.
    */
  var instanceId: js.UndefOr[String] = js.native
  
  /**
    * Whether return sts id token and refresh token instead of gitkit token.
    */
  var returnSecureToken: js.UndefOr[Boolean] = js.native
  
  /**
    * The custom token to verify
    */
  var token: js.UndefOr[String] = js.native
}
object SchemaIdentitytoolkitRelyingpartyVerifyCustomTokenRequest {
  
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartyVerifyCustomTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyVerifyCustomTokenRequest]
  }
  
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartyVerifyCustomTokenRequestOps[Self <: SchemaIdentitytoolkitRelyingpartyVerifyCustomTokenRequest] (val x: Self) extends AnyVal {
    
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
    def setDelegatedProjectNumber(value: String): Self = this.set("delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegatedProjectNumber: Self = this.set("delegatedProjectNumber", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setReturnSecureToken(value: Boolean): Self = this.set("returnSecureToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnSecureToken: Self = this.set("returnSecureToken", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
