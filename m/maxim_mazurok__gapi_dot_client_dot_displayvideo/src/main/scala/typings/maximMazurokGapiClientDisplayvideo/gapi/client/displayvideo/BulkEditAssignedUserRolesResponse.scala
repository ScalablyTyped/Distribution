package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEditAssignedUserRolesResponse extends StObject {
  
  /** The list of assigned user roles that have been successfully created. This list will be absent if empty. */
  var createdAssignedUserRoles: js.UndefOr[js.Array[AssignedUserRole]] = js.undefined
}
object BulkEditAssignedUserRolesResponse {
  
  @scala.inline
  def apply(): BulkEditAssignedUserRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditAssignedUserRolesResponse]
  }
  
  @scala.inline
  implicit class BulkEditAssignedUserRolesResponseMutableBuilder[Self <: BulkEditAssignedUserRolesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAssignedUserRoles(value: js.Array[AssignedUserRole]): Self = StObject.set(x, "createdAssignedUserRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAssignedUserRolesUndefined: Self = StObject.set(x, "createdAssignedUserRoles", js.undefined)
    
    @scala.inline
    def setCreatedAssignedUserRolesVarargs(value: AssignedUserRole*): Self = StObject.set(x, "createdAssignedUserRoles", js.Array(value :_*))
  }
}
