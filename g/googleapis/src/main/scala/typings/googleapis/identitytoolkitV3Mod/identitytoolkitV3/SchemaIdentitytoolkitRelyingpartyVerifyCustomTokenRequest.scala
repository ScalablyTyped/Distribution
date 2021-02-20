package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to verify a custom token
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyVerifyCustomTokenRequest extends StObject {
  
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
  implicit class SchemaIdentitytoolkitRelyingpartyVerifyCustomTokenRequestMutableBuilder[Self <: SchemaIdentitytoolkitRelyingpartyVerifyCustomTokenRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setReturnSecureToken(value: Boolean): Self = StObject.set(x, "returnSecureToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnSecureTokenUndefined: Self = StObject.set(x, "returnSecureToken", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
