package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUser extends StObject {
  
  /**
    * The assigned user roles. Required in CreateUser. Output only in UpdateUser. Can only be updated through BulkEditAssignedUserRoles.
    */
  var assignedUserRoles: js.UndefOr[js.Array[SchemaAssignedUserRole]] = js.undefined
  
  /**
    * Required. The display name of the user. Must be UTF-8 encoded with a maximum size of 240 bytes.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The email address used to identify the user.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the user.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The unique ID of the user. Assigned by the system.
    */
  var userId: js.UndefOr[String | Null] = js.undefined
}
object SchemaUser {
  
  inline def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  extension [Self <: SchemaUser](x: Self) {
    
    inline def setAssignedUserRoles(value: js.Array[SchemaAssignedUserRole]): Self = StObject.set(x, "assignedUserRoles", value.asInstanceOf[js.Any])
    
    inline def setAssignedUserRolesUndefined: Self = StObject.set(x, "assignedUserRoles", js.undefined)
    
    inline def setAssignedUserRolesVarargs(value: SchemaAssignedUserRole*): Self = StObject.set(x, "assignedUserRoles", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
