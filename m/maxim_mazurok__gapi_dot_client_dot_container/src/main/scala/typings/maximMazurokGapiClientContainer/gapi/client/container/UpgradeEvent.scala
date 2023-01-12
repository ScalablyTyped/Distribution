package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeEvent extends StObject {
  
  /** The current version before the upgrade. */
  var currentVersion: js.UndefOr[String] = js.undefined
  
  /** The operation associated with this upgrade. */
  var operation: js.UndefOr[String] = js.undefined
  
  /** The time when the operation was started. */
  var operationStartTime: js.UndefOr[String] = js.undefined
  
  /** Optional relative path to the resource. For example in node pool upgrades, the relative path of the node pool. */
  var resource: js.UndefOr[String] = js.undefined
  
  /** The resource type that is upgrading. */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /** The target version for the upgrade. */
  var targetVersion: js.UndefOr[String] = js.undefined
}
object UpgradeEvent {
  
  inline def apply(): UpgradeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpgradeEvent] (val x: Self) extends AnyVal {
    
    inline def setCurrentVersion(value: String): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationStartTime(value: String): Self = StObject.set(x, "operationStartTime", value.asInstanceOf[js.Any])
    
    inline def setOperationStartTimeUndefined: Self = StObject.set(x, "operationStartTime", js.undefined)
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setTargetVersion(value: String): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionUndefined: Self = StObject.set(x, "targetVersion", js.undefined)
  }
}
