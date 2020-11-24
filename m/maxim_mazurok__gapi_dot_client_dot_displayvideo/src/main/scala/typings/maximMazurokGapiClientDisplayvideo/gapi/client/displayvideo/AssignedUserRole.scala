package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedUserRole extends js.Object {
  
  /** The ID of the advertiser that the assigend user role applies to. */
  var advertiserId: js.UndefOr[String] = js.native
  
  /** Output only. The ID of the assigned user role. */
  var assignedUserRoleId: js.UndefOr[String] = js.native
  
  /** The ID of the partner that the assigned user role applies to. */
  var partnerId: js.UndefOr[String] = js.native
  
  /** Required. The user role to assign to a user for the entity. */
  var userRole: js.UndefOr[String] = js.native
}
object AssignedUserRole {
  
  @scala.inline
  def apply(): AssignedUserRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedUserRole]
  }
  
  @scala.inline
  implicit class AssignedUserRoleOps[Self <: AssignedUserRole] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setAssignedUserRoleId(value: String): Self = this.set("assignedUserRoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedUserRoleId: Self = this.set("assignedUserRoleId", js.undefined)
    
    @scala.inline
    def setPartnerId(value: String): Self = this.set("partnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartnerId: Self = this.set("partnerId", js.undefined)
    
    @scala.inline
    def setUserRole(value: String): Self = this.set("userRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRole: Self = this.set("userRole", js.undefined)
  }
}
