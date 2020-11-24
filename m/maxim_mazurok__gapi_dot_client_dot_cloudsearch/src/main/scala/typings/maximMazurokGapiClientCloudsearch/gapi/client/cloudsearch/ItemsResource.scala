package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudsearch.anon.Brief
import typings.maximMazurokGapiClientCloudsearch.anon.Callback
import typings.maximMazurokGapiClientCloudsearch.anon.ConnectorName
import typings.maximMazurokGapiClientCloudsearch.anon.DebugOptionsenableDebugging
import typings.maximMazurokGapiClientCloudsearch.anon.Fields
import typings.maximMazurokGapiClientCloudsearch.anon.GroupResourceName
import typings.maximMazurokGapiClientCloudsearch.anon.Key
import typings.maximMazurokGapiClientCloudsearch.anon.Oauthtoken
import typings.maximMazurokGapiClientCloudsearch.anon.PrettyPrint
import typings.maximMazurokGapiClientCloudsearch.anon.QuotaUser
import typings.maximMazurokGapiClientCloudsearch.anon.Resource
import typings.maximMazurokGapiClientCloudsearch.anon.UploadType
import typings.maximMazurokGapiClientCloudsearch.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsResource extends js.Object {
  
  /** Checks whether an item is accessible by specified principal. **Note:** This API requires an admin account to execute. */
  def checkAccess(request: Callback): Request[CheckAccessResponse] = js.native
  def checkAccess(request: DebugOptionsenableDebugging, body: Principal): Request[CheckAccessResponse] = js.native
  
  /**
    * Deletes Item resource for the specified resource name. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding
    * data source.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: ConnectorName): Request[Operation] = js.native
  
  def deleteQueueItems(request: Key, body: DeleteQueueItemsRequest): Request[Operation] = js.native
  /**
    * Deletes all items in a queue. This method is useful for deleting stale items. This API requires an admin or service account to execute. The service account used is the one
    * whitelisted in the corresponding data source.
    */
  def deleteQueueItems(request: typings.maximMazurokGapiClientCloudsearch.anon.Name): Request[Operation] = js.native
  
  /** Gets Item resource by item name. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source. */
  def get(): Request[Item] = js.native
  def get(request: Oauthtoken): Request[Item] = js.native
  
  def index(request: Key, body: IndexItemRequest): Request[Operation] = js.native
  /**
    * Updates Item ACL, metadata, and content. It will insert the Item if it does not exist. This method does not support partial updates. Fields with no provided values are cleared out
    * in the Cloud Search index. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
    */
  def index(request: PrettyPrint): Request[Operation] = js.native
  
  /** Lists all or a subset of Item resources. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source. */
  def list(): Request[ListItemsResponse] = js.native
  def list(request: Brief): Request[ListItemsResponse] = js.native
  
  /** Lists names of items associated with an unmapped identity. **Note:** This API requires an admin account to execute. */
  def listForunmappedidentity(): Request[ListItemNamesForUnmappedIdentityResponse] = js.native
  def listForunmappedidentity(request: GroupResourceName): Request[ListItemNamesForUnmappedIdentityResponse] = js.native
  
  def poll(request: Key, body: PollItemsRequest): Request[PollItemsResponse] = js.native
  /**
    * Polls for unreserved items from the indexing queue and marks a set as reserved, starting with items that have the oldest timestamp from the highest priority ItemStatus. The priority
    * order is as follows: ERROR MODIFIED NEW_ITEM ACCEPTED Reserving items ensures that polling from other threads cannot create overlapping sets. After handling the reserved items, the
    * client should put items back into the unreserved state, either by calling index, or by calling push with the type REQUEUE. Items automatically become available (unreserved) after 4
    * hours even if no update or push method is called. This API requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data
    * source.
    */
  def poll(request: QuotaUser): Request[PollItemsResponse] = js.native
  
  def push(request: Key, body: PushItemRequest): Request[Item] = js.native
  /**
    * Pushes an item onto a queue for later polling and updating. This API requires an admin or service account to execute. The service account used is the one whitelisted in the
    * corresponding data source.
    */
  def push(request: Resource): Request[Item] = js.native
  
  /** Fetches the item whose viewUrl exactly matches that of the URL provided in the request. **Note:** This API requires an admin account to execute. */
  def searchByViewUrl(request: Fields): Request[SearchItemsByViewUrlResponse] = js.native
  def searchByViewUrl(request: Key, body: SearchItemsByViewUrlRequest): Request[SearchItemsByViewUrlResponse] = js.native
  
  var unmappedids: UnmappedidsResource = js.native
  
  def unreserve(request: Key, body: UnreserveItemsRequest): Request[Operation] = js.native
  /**
    * Unreserves all items from a queue, making them all eligible to be polled. This method is useful for resetting the indexing queue after a connector has been restarted. This API
    * requires an admin or service account to execute. The service account used is the one whitelisted in the corresponding data source.
    */
  def unreserve(request: UploadType): Request[Operation] = js.native
  
  def upload(request: Key, body: StartUploadItemRequest): Request[UploadItemRef] = js.native
  /**
    * Creates an upload session for uploading item content. For items smaller than 100 KB, it's easier to embed the content inline within an index request. This API requires an admin or
    * service account to execute. The service account used is the one whitelisted in the corresponding data source.
    */
  def upload(request: Uploadprotocol): Request[UploadItemRef] = js.native
}
