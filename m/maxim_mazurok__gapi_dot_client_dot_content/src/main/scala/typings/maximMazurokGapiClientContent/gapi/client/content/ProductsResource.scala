package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.CallbackFeedId
import typings.maximMazurokGapiClientContent.anon.CallbackFields
import typings.maximMazurokGapiClientContent.anon.FeedId
import typings.maximMazurokGapiClientContent.anon.FeedIdFields
import typings.maximMazurokGapiClientContent.anon.Key
import typings.maximMazurokGapiClientContent.anon.KeyOauthtokenPrettyPrint
import typings.maximMazurokGapiClientContent.anon.PrettyPrintProductId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductsResource extends StObject {
  
  /** Retrieves, inserts, and deletes multiple products in a single request. */
  def custombatch(request: KeyOauthtokenPrettyPrint): Request[ProductsCustomBatchResponse] = js.native
  def custombatch(request: Key, body: ProductsCustomBatchRequest): Request[ProductsCustomBatchResponse] = js.native
  
  /** Deletes a product from your Merchant Center account. */
  def delete(): Request[Unit] = js.native
  def delete(request: FeedId): Request[Unit] = js.native
  
  /** Retrieves a product from your Merchant Center account. */
  def get(): Request[Product] = js.native
  def get(request: PrettyPrintProductId): Request[Product] = js.native
  
  /** Uploads a product to your Merchant Center account. If an item with the same channel, contentLanguage, offerId, and targetCountry already exists, this method updates that entry. */
  def insert(request: CallbackFeedId): Request[Product] = js.native
  def insert(request: FeedIdFields, body: Product): Request[Product] = js.native
  
  /**
    * Lists the products in your Merchant Center account. The response might contain fewer items than specified by maxResults. Rely on nextPageToken to determine if there are more items
    * to be requested.
    */
  def list(): Request[ProductsListResponse] = js.native
  def list(request: CallbackFields): Request[ProductsListResponse] = js.native
}
