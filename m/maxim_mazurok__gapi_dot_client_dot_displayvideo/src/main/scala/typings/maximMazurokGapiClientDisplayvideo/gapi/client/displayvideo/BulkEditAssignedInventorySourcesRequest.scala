package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEditAssignedInventorySourcesRequest extends js.Object {
  
  /** The ID of the advertiser that owns the parent inventory source group. The parent partner does not have access to these assigned inventory sources. */
  var advertiserId: js.UndefOr[String] = js.native
  
  /** The assigned inventory sources to create in bulk, specified as a list of AssignedInventorySources. */
  var createdAssignedInventorySources: js.UndefOr[js.Array[AssignedInventorySource]] = js.native
  
  /** The IDs of the assigned inventory sources to delete in bulk, specified as a list of assigned_inventory_source_ids. */
  var deletedAssignedInventorySources: js.UndefOr[js.Array[String]] = js.native
  
  /** The ID of the partner that owns the inventory source group. Only this partner has write access to these assigned inventory sources. */
  var partnerId: js.UndefOr[String] = js.native
}
object BulkEditAssignedInventorySourcesRequest {
  
  @scala.inline
  def apply(): BulkEditAssignedInventorySourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditAssignedInventorySourcesRequest]
  }
  
  @scala.inline
  implicit class BulkEditAssignedInventorySourcesRequestOps[Self <: BulkEditAssignedInventorySourcesRequest] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setCreatedAssignedInventorySourcesVarargs(value: AssignedInventorySource*): Self = this.set("createdAssignedInventorySources", js.Array(value :_*))
    
    @scala.inline
    def setCreatedAssignedInventorySources(value: js.Array[AssignedInventorySource]): Self = this.set("createdAssignedInventorySources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAssignedInventorySources: Self = this.set("createdAssignedInventorySources", js.undefined)
    
    @scala.inline
    def setDeletedAssignedInventorySourcesVarargs(value: String*): Self = this.set("deletedAssignedInventorySources", js.Array(value :_*))
    
    @scala.inline
    def setDeletedAssignedInventorySources(value: js.Array[String]): Self = this.set("deletedAssignedInventorySources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedAssignedInventorySources: Self = this.set("deletedAssignedInventorySources", js.undefined)
    
    @scala.inline
    def setPartnerId(value: String): Self = this.set("partnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartnerId: Self = this.set("partnerId", js.undefined)
  }
}
