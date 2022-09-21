package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.CallbackDestinations
import typings.maximMazurokGapiClientContent.anon.DestinationsFields
import typings.maximMazurokGapiClientContent.anon.FieldsKeyOauthtokenPrettyPrint
import typings.maximMazurokGapiClientContent.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductstatusesResource extends StObject {
  
  /** Gets the statuses of multiple products in a single request. */
  def custombatch(request: FieldsKeyOauthtokenPrettyPrint): Request[ProductstatusesCustomBatchResponse] = js.native
  def custombatch(request: UploadType, body: ProductstatusesCustomBatchRequest): Request[ProductstatusesCustomBatchResponse] = js.native
  
  /** Gets the status of a product from your Merchant Center account. */
  def get(): Request[ProductStatus] = js.native
  def get(request: CallbackDestinations): Request[ProductStatus] = js.native
  
  /** Lists the statuses of the products in your Merchant Center account. */
  def list(): Request[ProductstatusesListResponse] = js.native
  def list(request: DestinationsFields): Request[ProductstatusesListResponse] = js.native
  
  var repricingreports: RepricingreportsResource = js.native
}
