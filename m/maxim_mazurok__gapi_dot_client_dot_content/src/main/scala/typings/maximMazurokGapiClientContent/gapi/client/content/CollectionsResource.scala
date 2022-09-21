package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typings.maximMazurokGapiClientContent.anon.CollectionId
import typings.maximMazurokGapiClientContent.anon.PageSize
import typings.maximMazurokGapiClientContent.anon.QuotaUserResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionsResource extends StObject {
  
  def create(request: AccesstokenAlt, body: Collection): Request[Collection] = js.native
  /**
    * Uploads a collection to your Merchant Center account. If a collection with the same collectionId already exists, this method updates that entry. In each update, the collection is
    * completely replaced by the fields in the body of the update request.
    */
  def create(request: QuotaUserResource): Request[Collection] = js.native
  
  /** Deletes a collection from your Merchant Center account. */
  def delete(): Request[Unit] = js.native
  def delete(request: CollectionId): Request[Unit] = js.native
  
  /** Retrieves a collection from your Merchant Center account. */
  def get(): Request[Collection] = js.native
  def get(request: CollectionId): Request[Collection] = js.native
  
  /**
    * Lists the collections in your Merchant Center account. The response might contain fewer items than specified by page_size. Rely on next_page_token to determine if there are more
    * items to be requested.
    */
  def list(): Request[ListCollectionsResponse] = js.native
  def list(request: PageSize): Request[ListCollectionsResponse] = js.native
}
