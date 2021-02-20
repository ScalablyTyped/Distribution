package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.AccesstokenAccountId
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.CreativeStatusId
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.DuplicateIdMode
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.Query
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.QuotaUser
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.UploadType
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.Uploadprotocol
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativesResource extends StObject {
  
  /** Creates a creative. */
  def create(request: DuplicateIdMode): Request[Creative] = js.native
  def create(request: UploadType, body: Creative): Request[Creative] = js.native
  
  var dealAssociations: DealAssociationsResource = js.native
  
  /** Gets a creative. */
  def get(): Request[Creative] = js.native
  def get(request: QuotaUser): Request[Creative] = js.native
  
  /** Lists creatives. */
  /** List all creatives associated with a specific reason for which bids were filtered, with the number of bids filtered for each creative. */
  def list(): Request[ListCreativesResponse] = js.native
  def list(request: CreativeStatusId): Request[ListCreativeStatusBreakdownByCreativeResponse] = js.native
  def list(request: Query): Request[ListCreativesResponse] = js.native
  
  def stopWatching(request: QuotaUser, body: StopWatchingCreativeRequest): Request[js.Object] = js.native
  /** Stops watching a creative. Will stop push notifications being sent to the topics when the creative changes status. */
  def stopWatching(request: Uploadprotocol): Request[js.Object] = js.native
  
  def update(request: QuotaUser, body: Creative): Request[Creative] = js.native
  /** Updates a creative. */
  def update(request: Xgafv): Request[Creative] = js.native
  
  /** Watches a creative. Will result in push notifications being sent to the topic when the creative changes status. */
  def watch(request: AccesstokenAccountId): Request[js.Object] = js.native
  def watch(request: QuotaUser, body: WatchCreativeRequest): Request[js.Object] = js.native
}
