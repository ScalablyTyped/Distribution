package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.CallbackFields
import typings.maximMazurokGapiClientContent.anon.Country
import typings.maximMazurokGapiClientContent.anon.Key
import typings.maximMazurokGapiClientContent.anon.KeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatafeedstatusesResource extends js.Object {
  
  /** Gets multiple Merchant Center datafeed statuses in a single request. */
  def custombatch(request: KeyOauthtoken): Request[DatafeedstatusesCustomBatchResponse] = js.native
  def custombatch(request: Key, body: DatafeedstatusesCustomBatchRequest): Request[DatafeedstatusesCustomBatchResponse] = js.native
  
  /** Retrieves the status of a datafeed from your Merchant Center account. */
  def get(): Request[DatafeedStatus] = js.native
  def get(request: Country): Request[DatafeedStatus] = js.native
  
  /** Lists the statuses of the datafeeds in your Merchant Center account. */
  def list(): Request[DatafeedstatusesListResponse] = js.native
  def list(request: CallbackFields): Request[DatafeedstatusesListResponse] = js.native
}
