package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AclResource extends StObject {
  
  var resourceName: String
  
  var resourcePatternType: ResourcePatternTypes
  
  var resourceType: AclResourceTypes
}
object AclResource {
  
  inline def apply(resourceName: String, resourcePatternType: ResourcePatternTypes, resourceType: AclResourceTypes): AclResource = {
    val __obj = js.Dynamic.literal(resourceName = resourceName.asInstanceOf[js.Any], resourcePatternType = resourcePatternType.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AclResource] (val x: Self) extends AnyVal {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourcePatternType(value: ResourcePatternTypes): Self = StObject.set(x, "resourcePatternType", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: AclResourceTypes): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
