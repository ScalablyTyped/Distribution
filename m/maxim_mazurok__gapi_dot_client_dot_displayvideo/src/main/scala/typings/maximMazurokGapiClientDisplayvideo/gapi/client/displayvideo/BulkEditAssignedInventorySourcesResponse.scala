package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEditAssignedInventorySourcesResponse extends js.Object {
  
  /** The list of assigned inventory sources that have been successfully created. This list will be absent if empty. */
  var assignedInventorySources: js.UndefOr[js.Array[AssignedInventorySource]] = js.native
}
object BulkEditAssignedInventorySourcesResponse {
  
  @scala.inline
  def apply(): BulkEditAssignedInventorySourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditAssignedInventorySourcesResponse]
  }
  
  @scala.inline
  implicit class BulkEditAssignedInventorySourcesResponseOps[Self <: BulkEditAssignedInventorySourcesResponse] (val x: Self) extends AnyVal {
    
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
    def setAssignedInventorySourcesVarargs(value: AssignedInventorySource*): Self = this.set("assignedInventorySources", js.Array(value :_*))
    
    @scala.inline
    def setAssignedInventorySources(value: js.Array[AssignedInventorySource]): Self = this.set("assignedInventorySources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedInventorySources: Self = this.set("assignedInventorySources", js.undefined)
  }
}
