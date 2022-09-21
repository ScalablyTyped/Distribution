package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceGroup extends StObject {
  
  /**
    * The group of resources being monitored. Should be only the [GROUP_ID], and not the full-path projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID].
    */
  var groupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource type of the group members.
    */
  var resourceType: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourceGroup {
  
  inline def apply(): SchemaResourceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceGroup]
  }
  
  extension [Self <: SchemaResourceGroup](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdNull: Self = StObject.set(x, "groupId", null)
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
