package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkEditAssignedUserRolesRequest extends StObject {
  
  /**
    * The assigned user roles to create in batch, specified as a list of AssignedUserRoles.
    */
  var createdAssignedUserRoles: js.UndefOr[js.Array[SchemaAssignedUserRole]] = js.undefined
  
  /**
    * The assigned user roles to delete in batch, specified as a list of assigned_user_role_ids. The format of assigned_user_role_id is `entityType-entityid`, for example `partner-123`.
    */
  var deletedAssignedUserRoles: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBulkEditAssignedUserRolesRequest {
  
  inline def apply(): SchemaBulkEditAssignedUserRolesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkEditAssignedUserRolesRequest]
  }
  
  extension [Self <: SchemaBulkEditAssignedUserRolesRequest](x: Self) {
    
    inline def setCreatedAssignedUserRoles(value: js.Array[SchemaAssignedUserRole]): Self = StObject.set(x, "createdAssignedUserRoles", value.asInstanceOf[js.Any])
    
    inline def setCreatedAssignedUserRolesUndefined: Self = StObject.set(x, "createdAssignedUserRoles", js.undefined)
    
    inline def setCreatedAssignedUserRolesVarargs(value: SchemaAssignedUserRole*): Self = StObject.set(x, "createdAssignedUserRoles", js.Array(value*))
    
    inline def setDeletedAssignedUserRoles(value: js.Array[String]): Self = StObject.set(x, "deletedAssignedUserRoles", value.asInstanceOf[js.Any])
    
    inline def setDeletedAssignedUserRolesNull: Self = StObject.set(x, "deletedAssignedUserRoles", null)
    
    inline def setDeletedAssignedUserRolesUndefined: Self = StObject.set(x, "deletedAssignedUserRoles", js.undefined)
    
    inline def setDeletedAssignedUserRolesVarargs(value: String*): Self = StObject.set(x, "deletedAssignedUserRoles", js.Array(value*))
  }
}
