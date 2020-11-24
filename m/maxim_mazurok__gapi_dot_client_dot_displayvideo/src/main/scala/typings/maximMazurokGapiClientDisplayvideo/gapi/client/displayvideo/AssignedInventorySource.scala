package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedInventorySource extends js.Object {
  
  /** Output only. The unique ID of the assigned inventory source. The ID is only unique within a given inventory source group. It may be reused in other contexts. */
  var assignedInventorySourceId: js.UndefOr[String] = js.native
  
  /** Required. The ID of the inventory source entity being targeted. */
  var inventorySourceId: js.UndefOr[String] = js.native
  
  /** Output only. The resource name of the assigned inventory source. */
  var name: js.UndefOr[String] = js.native
}
object AssignedInventorySource {
  
  @scala.inline
  def apply(): AssignedInventorySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedInventorySource]
  }
  
  @scala.inline
  implicit class AssignedInventorySourceOps[Self <: AssignedInventorySource] (val x: Self) extends AnyVal {
    
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
    def setAssignedInventorySourceId(value: String): Self = this.set("assignedInventorySourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedInventorySourceId: Self = this.set("assignedInventorySourceId", js.undefined)
    
    @scala.inline
    def setInventorySourceId(value: String): Self = this.set("inventorySourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventorySourceId: Self = this.set("inventorySourceId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
