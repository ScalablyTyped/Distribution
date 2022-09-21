package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateRoleRequest extends StObject {
  
  /**
    * The Role resource to create.
    */
  var role: js.UndefOr[SchemaRole] = js.undefined
  
  /**
    * The role ID to use for this role. A role ID may contain alphanumeric characters, underscores (`_`), and periods (`.`). It must contain a minimum of 3 characters and a maximum of 64 characters.
    */
  var roleId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateRoleRequest {
  
  inline def apply(): SchemaCreateRoleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateRoleRequest]
  }
  
  extension [Self <: SchemaCreateRoleRequest](x: Self) {
    
    inline def setRole(value: SchemaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleId(value: String): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
    
    inline def setRoleIdNull: Self = StObject.set(x, "roleId", null)
    
    inline def setRoleIdUndefined: Self = StObject.set(x, "roleId", js.undefined)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
