package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for AuthorizeEnvironment.
  */
@js.native
trait SchemaAuthorizeEnvironmentRequest extends js.Object {
  
  /**
    * The OAuth access token that should be sent to the environment.
    */
  var accessToken: js.UndefOr[String] = js.native
  
  /**
    * The time when the credentials expire. If not set, defaults to one hour
    * from when the server received the request.
    */
  var expireTime: js.UndefOr[String] = js.native
  
  /**
    * The OAuth ID token that should be sent to the environment.
    */
  var idToken: js.UndefOr[String] = js.native
}
object SchemaAuthorizeEnvironmentRequest {
  
  @scala.inline
  def apply(): SchemaAuthorizeEnvironmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizeEnvironmentRequest]
  }
  
  @scala.inline
  implicit class SchemaAuthorizeEnvironmentRequestOps[Self <: SchemaAuthorizeEnvironmentRequest] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
  }
}
