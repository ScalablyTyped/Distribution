package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.CallbackDatafeedId
import typings.maximMazurokGapiClientContent.anon.CallbackFields
import typings.maximMazurokGapiClientContent.anon.DatafeedId
import typings.maximMazurokGapiClientContent.anon.FieldsKey
import typings.maximMazurokGapiClientContent.anon.Key
import typings.maximMazurokGapiClientContent.anon.KeyMerchantId
import typings.maximMazurokGapiClientContent.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatafeedsResource extends StObject {
  
  /** Deletes, fetches, gets, inserts and updates multiple datafeeds in a single request. */
  def custombatch(request: FieldsKey): Request[DatafeedsCustomBatchResponse] = js.native
  def custombatch(request: Key, body: DatafeedsCustomBatchRequest): Request[DatafeedsCustomBatchResponse] = js.native
  
  /** Deletes a datafeed configuration from your Merchant Center account. */
  def delete(): Request[Unit] = js.native
  def delete(request: DatafeedId): Request[Unit] = js.native
  
  /**
    * Invokes a fetch for the datafeed in your Merchant Center account. If you need to call this method more than once per day, we recommend you use the Products service to update your
    * product data.
    */
  def fetchnow(): Request[DatafeedsFetchNowResponse] = js.native
  def fetchnow(request: DatafeedId): Request[DatafeedsFetchNowResponse] = js.native
  
  /** Retrieves a datafeed configuration from your Merchant Center account. */
  def get(): Request[Datafeed] = js.native
  def get(request: DatafeedId): Request[Datafeed] = js.native
  
  /** Registers a datafeed configuration with your Merchant Center account. */
  def insert(request: KeyMerchantId): Request[Datafeed] = js.native
  def insert(request: UploadType, body: Datafeed): Request[Datafeed] = js.native
  
  /** Lists the configurations for datafeeds in your Merchant Center account. */
  def list(): Request[DatafeedsListResponse] = js.native
  def list(request: CallbackFields): Request[DatafeedsListResponse] = js.native
  
  /** Updates a datafeed configuration of your Merchant Center account. Any fields that are not provided are deleted from the resource. */
  def update(request: CallbackDatafeedId): Request[Datafeed] = js.native
  def update(request: DatafeedId, body: Datafeed): Request[Datafeed] = js.native
}
