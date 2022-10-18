package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AclFilter extends StObject {
  
  var host: js.UndefOr[String] = js.undefined
  
  var operation: AclOperationTypes
  
  var permissionType: AclPermissionTypes
  
  var principal: js.UndefOr[String] = js.undefined
  
  var resourceName: js.UndefOr[String] = js.undefined
  
  var resourcePatternType: ResourcePatternTypes
  
  var resourceType: AclResourceTypes
}
object AclFilter {
  
  inline def apply(
    operation: AclOperationTypes,
    permissionType: AclPermissionTypes,
    resourcePatternType: ResourcePatternTypes,
    resourceType: AclResourceTypes
  ): AclFilter = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], permissionType = permissionType.asInstanceOf[js.Any], resourcePatternType = resourcePatternType.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclFilter]
  }
  
  extension [Self <: AclFilter](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setOperation(value: AclOperationTypes): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setPermissionType(value: AclPermissionTypes): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourcePatternType(value: ResourcePatternTypes): Self = StObject.set(x, "resourcePatternType", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: AclResourceTypes): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
