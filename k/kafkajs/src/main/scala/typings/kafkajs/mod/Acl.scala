package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acl extends StObject {
  
  var host: String
  
  var operation: AclOperationTypes
  
  var permissionType: AclPermissionTypes
  
  var principal: String
}
object Acl {
  
  inline def apply(host: String, operation: AclOperationTypes, permissionType: AclPermissionTypes, principal: String): Acl = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], permissionType = permissionType.asInstanceOf[js.Any], principal = principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acl]
  }
  
  extension [Self <: Acl](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: AclOperationTypes): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setPermissionType(value: AclPermissionTypes): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
  }
}
