package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceMembersGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Email or immutable ID of the group
    */
  var groupKey: js.UndefOr[String] = js.native
  
  /**
    * Email or immutable ID of the member
    */
  var memberKey: js.UndefOr[String] = js.native
}
object ParamsResourceMembersGet {
  
  @scala.inline
  def apply(): ParamsResourceMembersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMembersGet]
  }
  
  @scala.inline
  implicit class ParamsResourceMembersGetOps[Self <: ParamsResourceMembersGet] (val x: Self) extends AnyVal {
    
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
    def setGroupKey(value: String): Self = this.set("groupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupKey: Self = this.set("groupKey", js.undefined)
    
    @scala.inline
    def setMemberKey(value: String): Self = this.set("memberKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberKey: Self = this.set("memberKey", js.undefined)
  }
}
