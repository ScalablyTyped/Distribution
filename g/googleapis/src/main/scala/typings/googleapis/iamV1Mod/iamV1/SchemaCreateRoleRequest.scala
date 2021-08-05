package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request to create a new role.
  */
trait SchemaCreateRoleRequest extends StObject {
  
  /**
    * The Role resource to create.
    */
  var role: js.UndefOr[SchemaRole] = js.undefined
  
  /**
    * The role id to use for this role.
    */
  var roleId: js.UndefOr[String] = js.undefined
}
object SchemaCreateRoleRequest {
  
  inline def apply(): SchemaCreateRoleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateRoleRequest]
  }
  
  extension [Self <: SchemaCreateRoleRequest](x: Self) {
    
    inline def setRole(value: SchemaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleId(value: String): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
    
    inline def setRoleIdUndefined: Self = StObject.set(x, "roleId", js.undefined)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
