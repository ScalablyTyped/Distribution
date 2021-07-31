package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignedUserRole extends StObject {
  
  /** The ID of the advertiser that the assigend user role applies to. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** Output only. The ID of the assigned user role. */
  var assignedUserRoleId: js.UndefOr[String] = js.undefined
  
  /** The ID of the partner that the assigned user role applies to. */
  var partnerId: js.UndefOr[String] = js.undefined
  
  /** Required. The user role to assign to a user for the entity. */
  var userRole: js.UndefOr[String] = js.undefined
}
object AssignedUserRole {
  
  @scala.inline
  def apply(): AssignedUserRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedUserRole]
  }
  
  @scala.inline
  implicit class AssignedUserRoleMutableBuilder[Self <: AssignedUserRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setAssignedUserRoleId(value: String): Self = StObject.set(x, "assignedUserRoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedUserRoleIdUndefined: Self = StObject.set(x, "assignedUserRoleId", js.undefined)
    
    @scala.inline
    def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    @scala.inline
    def setUserRole(value: String): Self = StObject.set(x, "userRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRoleUndefined: Self = StObject.set(x, "userRole", js.undefined)
  }
}
