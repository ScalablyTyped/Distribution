package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.AdvertiserId
import typings.maximMazurokGapiClientDisplayvideo.anon.Alt
import typings.maximMazurokGapiClientDisplayvideo.anon.Callback
import typings.maximMazurokGapiClientDisplayvideo.anon.CampaignId
import typings.maximMazurokGapiClientDisplayvideo.anon.Fields
import typings.maximMazurokGapiClientDisplayvideo.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignsResource extends StObject {
  
  def create(request: AdvertiserId, body: Campaign): Request[Campaign] = js.native
  /** Creates a new campaign. Returns the newly created campaign if successful. */
  def create(request: Alt): Request[Campaign] = js.native
  
  /**
    * Permanently deletes a campaign. A deleted campaign cannot be recovered. The campaign should be archived first, i.e. set entity_status to `ENTITY_STATUS_ARCHIVED`, to be able to
    * delete it.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets a campaign. */
  def get(): Request[Campaign] = js.native
  def get(request: Callback): Request[Campaign] = js.native
  
  /**
    * Lists campaigns in an advertiser. The order is defined by the order_by parameter. If a filter by entity_status is not specified, campaigns with `ENTITY_STATUS_ARCHIVED` will not be
    * included in the results.
    */
  def list(): Request[ListCampaignsResponse] = js.native
  def list(request: Fields): Request[ListCampaignsResponse] = js.native
  
  /** Updates an existing campaign. Returns the updated campaign if successful. */
  def patch(request: CampaignId): Request[Campaign] = js.native
  def patch(request: Key, body: Campaign): Request[Campaign] = js.native
}
