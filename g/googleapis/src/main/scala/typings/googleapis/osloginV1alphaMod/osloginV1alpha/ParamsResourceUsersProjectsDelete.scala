package typings.googleapis.osloginV1alphaMod.osloginV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUsersProjectsDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A reference to the POSIX account to update. POSIX accounts are identified
    * by the project ID they are associated with. A reference to the POSIX
    * account is in format `users/{user}/projects/{project}`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The type of operating system associated with the account.
    */
  var operatingSystemType: js.UndefOr[String] = js.native
}
object ParamsResourceUsersProjectsDelete {
  
  @scala.inline
  def apply(): ParamsResourceUsersProjectsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersProjectsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersProjectsDeleteOps[Self <: ParamsResourceUsersProjectsDelete] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOperatingSystemType(value: String): Self = this.set("operatingSystemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystemType: Self = this.set("operatingSystemType", js.undefined)
  }
}
