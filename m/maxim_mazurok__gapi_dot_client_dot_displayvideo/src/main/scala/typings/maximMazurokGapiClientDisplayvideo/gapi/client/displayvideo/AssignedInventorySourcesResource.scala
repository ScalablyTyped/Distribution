package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.AssignedInventorySourceId
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackFieldsInventorySourceGroupId
import typings.maximMazurokGapiClientDisplayvideo.anon.FieldsInventorySourceGroupId
import typings.maximMazurokGapiClientDisplayvideo.anon.FilterInventorySourceGroupId
import typings.maximMazurokGapiClientDisplayvideo.anon.InventorySourceGroupId
import typings.maximMazurokGapiClientDisplayvideo.anon.InventorySourceGroupIdKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedInventorySourcesResource extends StObject {
  
  def bulkEdit(request: FieldsInventorySourceGroupId, body: BulkEditAssignedInventorySourcesRequest): Request[BulkEditAssignedInventorySourcesResponse] = js.native
  /**
    * Bulk edits multiple assignments between inventory sources and a single inventory source group. The operation will delete the assigned inventory sources provided in
    * BulkEditAssignedInventorySourcesRequest.deleted_assigned_inventory_sources and then create the assigned inventory sources provided in
    * BulkEditAssignedInventorySourcesRequest.created_assigned_inventory_sources.
    */
  def bulkEdit(request: InventorySourceGroupId): Request[BulkEditAssignedInventorySourcesResponse] = js.native
  
  def create(request: CallbackFieldsInventorySourceGroupId, body: AssignedInventorySource): Request[AssignedInventorySource] = js.native
  /** Creates an assignment between an inventory source and an inventory source group. */
  def create(request: InventorySourceGroupIdKey): Request[AssignedInventorySource] = js.native
  
  /** Deletes the assignment between an inventory source and an inventory source group. */
  def delete(): Request[js.Object] = js.native
  def delete(request: AssignedInventorySourceId): Request[js.Object] = js.native
  
  /** Lists inventory sources assigned to an inventory source group. */
  def list(): Request[ListAssignedInventorySourcesResponse] = js.native
  def list(request: FilterInventorySourceGroupId): Request[ListAssignedInventorySourcesResponse] = js.native
}
