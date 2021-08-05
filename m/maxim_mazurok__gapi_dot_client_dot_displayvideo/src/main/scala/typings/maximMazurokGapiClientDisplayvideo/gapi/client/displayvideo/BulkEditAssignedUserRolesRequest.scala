package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEditAssignedUserRolesRequest extends StObject {
  
  /** The assigned user roles to create in batch, specified as a list of AssignedUserRoles. */
  var createdAssignedUserRoles: js.UndefOr[js.Array[AssignedUserRole]] = js.undefined
  
  /** The assigned user roles to delete in batch, specified as a list of assigned_user_role_ids. The format of assigned_user_role_id is `entityType-entityid`, for example `partner-123`. */
  var deletedAssignedUserRoles: js.UndefOr[js.Array[String]] = js.undefined
}
object BulkEditAssignedUserRolesRequest {
  
  inline def apply(): BulkEditAssignedUserRolesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditAssignedUserRolesRequest]
  }
  
  extension [Self <: BulkEditAssignedUserRolesRequest](x: Self) {
    
    inline def setCreatedAssignedUserRoles(value: js.Array[AssignedUserRole]): Self = StObject.set(x, "createdAssignedUserRoles", value.asInstanceOf[js.Any])
    
    inline def setCreatedAssignedUserRolesUndefined: Self = StObject.set(x, "createdAssignedUserRoles", js.undefined)
    
    inline def setCreatedAssignedUserRolesVarargs(value: AssignedUserRole*): Self = StObject.set(x, "createdAssignedUserRoles", js.Array(value :_*))
    
    inline def setDeletedAssignedUserRoles(value: js.Array[String]): Self = StObject.set(x, "deletedAssignedUserRoles", value.asInstanceOf[js.Any])
    
    inline def setDeletedAssignedUserRolesUndefined: Self = StObject.set(x, "deletedAssignedUserRoles", js.undefined)
    
    inline def setDeletedAssignedUserRolesVarargs(value: String*): Self = StObject.set(x, "deletedAssignedUserRoles", js.Array(value :_*))
  }
}
