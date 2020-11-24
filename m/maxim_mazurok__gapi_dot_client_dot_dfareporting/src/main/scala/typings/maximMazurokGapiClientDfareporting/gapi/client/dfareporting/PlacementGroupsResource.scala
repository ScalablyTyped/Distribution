package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.CampaignIds
import typings.maximMazurokGapiClientDfareporting.anon.ResourceUploadTypeUploadprotocol
import typings.maximMazurokGapiClientDfareporting.anon.UploadTypeUploadprotocolXgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementGroupsResource extends js.Object {
  
  /** Gets one placement group by ID. */
  def get(): Request[PlacementGroup] = js.native
  def get(request: Alt): Request[PlacementGroup] = js.native
  
  def insert(request: Callback, body: PlacementGroup): Request[PlacementGroup] = js.native
  /** Inserts a new placement group. */
  def insert(request: ResourceUploadTypeUploadprotocol): Request[PlacementGroup] = js.native
  
  /** Retrieves a list of placement groups, possibly filtered. This method supports paging. */
  def list(): Request[PlacementGroupsListResponse] = js.native
  def list(request: CampaignIds): Request[PlacementGroupsListResponse] = js.native
  
  def patch(request: Alt, body: PlacementGroup): Request[PlacementGroup] = js.native
  /** Updates an existing placement group. This method supports patch semantics. */
  def patch(request: UploadTypeUploadprotocolXgafv): Request[PlacementGroup] = js.native
  
  def update(request: Callback, body: PlacementGroup): Request[PlacementGroup] = js.native
  /** Updates an existing placement group. */
  def update(request: ResourceUploadTypeUploadprotocol): Request[PlacementGroup] = js.native
}
