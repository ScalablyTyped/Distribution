package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDeletionResource extends js.Object {
  
  var userDeletionRequest: UserDeletionRequestResource = js.native
}
object UserDeletionResource {
  
  @scala.inline
  def apply(userDeletionRequest: UserDeletionRequestResource): UserDeletionResource = {
    val __obj = js.Dynamic.literal(userDeletionRequest = userDeletionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDeletionResource]
  }
  
  @scala.inline
  implicit class UserDeletionResourceOps[Self <: UserDeletionResource] (val x: Self) extends AnyVal {
    
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
    def setUserDeletionRequest(value: UserDeletionRequestResource): Self = this.set("userDeletionRequest", value.asInstanceOf[js.Any])
  }
}
