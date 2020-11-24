package typings.googleapis.resellerV1Mod.resellerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceResellernotifyUnregister extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The service account which owns the Cloud-PubSub topic.
    */
  var serviceAccountEmailAddress: js.UndefOr[String] = js.native
}
object ParamsResourceResellernotifyUnregister {
  
  @scala.inline
  def apply(): ParamsResourceResellernotifyUnregister = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResellernotifyUnregister]
  }
  
  @scala.inline
  implicit class ParamsResourceResellernotifyUnregisterOps[Self <: ParamsResourceResellernotifyUnregister] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setServiceAccountEmailAddress(value: String): Self = this.set("serviceAccountEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountEmailAddress: Self = this.set("serviceAccountEmailAddress", js.undefined)
  }
}
