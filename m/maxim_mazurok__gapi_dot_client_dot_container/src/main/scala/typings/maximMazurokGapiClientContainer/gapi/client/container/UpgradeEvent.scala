package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeEvent extends js.Object {
  
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
  implicit class UpgradeEventOps[Self <: UpgradeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentVersion(value: String): Self = this.set("currentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentVersion: Self = this.set("currentVersion", js.undefined)
    
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    
    @scala.inline
    def setOperationStartTime(value: String): Self = this.set("operationStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationStartTime: Self = this.set("operationStartTime", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setTargetVersion(value: String): Self = this.set("targetVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetVersion: Self = this.set("targetVersion", js.undefined)
  }
}
