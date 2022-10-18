package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AclEntry
  extends StObject
     with Acl
     with AclResource
object AclEntry {
  
  inline def apply(
    host: String,
    operation: AclOperationTypes,
    permissionType: AclPermissionTypes,
    principal: String,
    resourceName: String,
    resourcePatternType: ResourcePatternTypes,
    resourceType: AclResourceTypes
  ): AclEntry = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], permissionType = permissionType.asInstanceOf[js.Any], principal = principal.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any], resourcePatternType = resourcePatternType.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclEntry]
  }
}
