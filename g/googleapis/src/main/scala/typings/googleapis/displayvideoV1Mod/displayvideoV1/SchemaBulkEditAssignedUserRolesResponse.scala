package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkEditAssignedUserRolesResponse extends StObject {
  
  /**
    * The list of assigned user roles that have been successfully created. This list will be absent if empty.
    */
  var createdAssignedUserRoles: js.UndefOr[js.Array[SchemaAssignedUserRole]] = js.undefined
}
object SchemaBulkEditAssignedUserRolesResponse {
  
  inline def apply(): SchemaBulkEditAssignedUserRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkEditAssignedUserRolesResponse]
  }
  
  extension [Self <: SchemaBulkEditAssignedUserRolesResponse](x: Self) {
    
    inline def setCreatedAssignedUserRoles(value: js.Array[SchemaAssignedUserRole]): Self = StObject.set(x, "createdAssignedUserRoles", value.asInstanceOf[js.Any])
    
    inline def setCreatedAssignedUserRolesUndefined: Self = StObject.set(x, "createdAssignedUserRoles", js.undefined)
    
    inline def setCreatedAssignedUserRolesVarargs(value: SchemaAssignedUserRole*): Self = StObject.set(x, "createdAssignedUserRoles", js.Array(value*))
  }
}
