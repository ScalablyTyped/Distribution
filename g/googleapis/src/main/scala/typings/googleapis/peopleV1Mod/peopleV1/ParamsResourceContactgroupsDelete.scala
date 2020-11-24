package typings.googleapis.peopleV1Mod.peopleV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceContactgroupsDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Set to true to also delete the contacts in the specified group.
    */
  var deleteContacts: js.UndefOr[Boolean] = js.native
  
  /**
    * The resource name of the contact group to delete.
    */
  var resourceName: js.UndefOr[String] = js.native
}
object ParamsResourceContactgroupsDelete {
  
  @scala.inline
  def apply(): ParamsResourceContactgroupsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceContactgroupsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceContactgroupsDeleteOps[Self <: ParamsResourceContactgroupsDelete] (val x: Self) extends AnyVal {
    
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
    def setDeleteContacts(value: Boolean): Self = this.set("deleteContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteContacts: Self = this.set("deleteContacts", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
  }
}
