package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEditAssignedInventorySourcesRequest extends StObject {
  
  /** The ID of the advertiser that owns the parent inventory source group. The parent partner does not have access to these assigned inventory sources. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** The assigned inventory sources to create in bulk, specified as a list of AssignedInventorySources. */
  var createdAssignedInventorySources: js.UndefOr[js.Array[AssignedInventorySource]] = js.undefined
  
  /** The IDs of the assigned inventory sources to delete in bulk, specified as a list of assigned_inventory_source_ids. */
  var deletedAssignedInventorySources: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The ID of the partner that owns the inventory source group. Only this partner has write access to these assigned inventory sources. */
  var partnerId: js.UndefOr[String] = js.undefined
}
object BulkEditAssignedInventorySourcesRequest {
  
  @scala.inline
  def apply(): BulkEditAssignedInventorySourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditAssignedInventorySourcesRequest]
  }
  
  @scala.inline
  implicit class BulkEditAssignedInventorySourcesRequestMutableBuilder[Self <: BulkEditAssignedInventorySourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setCreatedAssignedInventorySources(value: js.Array[AssignedInventorySource]): Self = StObject.set(x, "createdAssignedInventorySources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAssignedInventorySourcesUndefined: Self = StObject.set(x, "createdAssignedInventorySources", js.undefined)
    
    @scala.inline
    def setCreatedAssignedInventorySourcesVarargs(value: AssignedInventorySource*): Self = StObject.set(x, "createdAssignedInventorySources", js.Array(value :_*))
    
    @scala.inline
    def setDeletedAssignedInventorySources(value: js.Array[String]): Self = StObject.set(x, "deletedAssignedInventorySources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedAssignedInventorySourcesUndefined: Self = StObject.set(x, "deletedAssignedInventorySources", js.undefined)
    
    @scala.inline
    def setDeletedAssignedInventorySourcesVarargs(value: String*): Self = StObject.set(x, "deletedAssignedInventorySources", js.Array(value :_*))
    
    @scala.inline
    def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
