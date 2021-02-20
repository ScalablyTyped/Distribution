package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeEvent extends StObject {
  
  /** Required. The current version before the upgrade. */
  var currentVersion: js.UndefOr[String] = js.native
  
  /** Required. The operation associated with this upgrade. */
  var operation: js.UndefOr[String] = js.native
  
  /** Required. The time when the operation was started. */
  var operationStartTime: js.UndefOr[String] = js.native
  
  /** Optional. Optional relative path to the resource. For example in node pool upgrades, the relative path of the node pool. */
  var resource: js.UndefOr[String] = js.native
  
  /** Required. The resource type that is upgrading. */
  var resourceType: js.UndefOr[String] = js.native
  
  /** Required. The target version for the upgrade. */
  var targetVersion: js.UndefOr[String] = js.native
}
object UpgradeEvent {
  
  @scala.inline
  def apply(): UpgradeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeEvent]
  }
  
  @scala.inline
  implicit class UpgradeEventMutableBuilder[Self <: UpgradeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentVersion(value: String): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationStartTime(value: String): Self = StObject.set(x, "operationStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationStartTimeUndefined: Self = StObject.set(x, "operationStartTime", js.undefined)
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setTargetVersion(value: String): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVersionUndefined: Self = StObject.set(x, "targetVersion", js.undefined)
  }
}
