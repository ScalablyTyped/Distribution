package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpgradeEvent extends StObject {
  
  /**
    * The current version before the upgrade.
    */
  var currentVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The operation associated with this upgrade.
    */
  var operation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when the operation was started.
    */
  var operationStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional relative path to the resource. For example in node pool upgrades, the relative path of the node pool.
    */
  var resource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource type that is upgrading.
    */
  var resourceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target version for the upgrade.
    */
  var targetVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpgradeEvent {
  
  inline def apply(): SchemaUpgradeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpgradeEvent]
  }
  
  extension [Self <: SchemaUpgradeEvent](x: Self) {
    
    inline def setCurrentVersion(value: String): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionNull: Self = StObject.set(x, "currentVersion", null)
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationNull: Self = StObject.set(x, "operation", null)
    
    inline def setOperationStartTime(value: String): Self = StObject.set(x, "operationStartTime", value.asInstanceOf[js.Any])
    
    inline def setOperationStartTimeNull: Self = StObject.set(x, "operationStartTime", null)
    
    inline def setOperationStartTimeUndefined: Self = StObject.set(x, "operationStartTime", js.undefined)
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setTargetVersion(value: String): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionNull: Self = StObject.set(x, "targetVersion", null)
    
    inline def setTargetVersionUndefined: Self = StObject.set(x, "targetVersion", js.undefined)
  }
}
