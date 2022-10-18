package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchingAcl extends StObject {
  
  var errorCode: Double
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var host: String
  
  var operation: AclOperationTypes
  
  var permissionType: AclPermissionTypes
  
  var principal: String
  
  var resourceName: String
  
  var resourcePatternType: ResourcePatternTypes
  
  var resourceType: AclResourceTypes
}
object MatchingAcl {
  
  inline def apply(
    errorCode: Double,
    host: String,
    operation: AclOperationTypes,
    permissionType: AclPermissionTypes,
    principal: String,
    resourceName: String,
    resourcePatternType: ResourcePatternTypes,
    resourceType: AclResourceTypes
  ): MatchingAcl = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], permissionType = permissionType.asInstanceOf[js.Any], principal = principal.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any], resourcePatternType = resourcePatternType.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchingAcl]
  }
  
  extension [Self <: MatchingAcl](x: Self) {
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: AclOperationTypes): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setPermissionType(value: AclPermissionTypes): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourcePatternType(value: ResourcePatternTypes): Self = StObject.set(x, "resourcePatternType", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: AclResourceTypes): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
