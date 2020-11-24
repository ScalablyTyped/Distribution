package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.MaxResults
import typings.maximMazurokGapiClientDfareporting.anon.Resource
import typings.maximMazurokGapiClientDfareporting.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserGroupsResource extends js.Object {
  
  /** Deletes an existing advertiser group. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Gets one advertiser group by ID. */
  def get(): Request[AdvertiserGroup] = js.native
  def get(request: Alt): Request[AdvertiserGroup] = js.native
  
  def insert(request: Callback, body: AdvertiserGroup): Request[AdvertiserGroup] = js.native
  /** Inserts a new advertiser group. */
  def insert(request: Resource): Request[AdvertiserGroup] = js.native
  
  /** Retrieves a list of advertiser groups, possibly filtered. This method supports paging. */
  def list(): Request[AdvertiserGroupsListResponse] = js.native
  def list(request: MaxResults): Request[AdvertiserGroupsListResponse] = js.native
  
  def patch(request: Alt, body: AdvertiserGroup): Request[AdvertiserGroup] = js.native
  /** Updates an existing advertiser group. This method supports patch semantics. */
  def patch(request: UploadType): Request[AdvertiserGroup] = js.native
  
  def update(request: Callback, body: AdvertiserGroup): Request[AdvertiserGroup] = js.native
  /** Updates an existing advertiser group. */
  def update(request: Resource): Request[AdvertiserGroup] = js.native
}
