package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typings.maximMazurokGapiClientContent.anon.CountryFields
import typings.maximMazurokGapiClientContent.anon.QuotaUserResourceUploadTypeUploadprotocol
import typings.maximMazurokGapiClientContent.anon.ResourceUploadTypeUploadprotocolXgafv
import typings.maximMazurokGapiClientContent.anon.ReturnAddressId
import typings.maximMazurokGapiClientContent.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnaddressResource extends StObject {
  
  /** Batches multiple return address related calls in a single request. */
  def custombatch(request: QuotaUserResourceUploadTypeUploadprotocol): Request[ReturnaddressCustomBatchResponse] = js.native
  def custombatch(request: UploadType, body: ReturnaddressCustomBatchRequest): Request[ReturnaddressCustomBatchResponse] = js.native
  
  /** Deletes a return address for the given Merchant Center account. */
  def delete(): Request[Unit] = js.native
  def delete(request: ReturnAddressId): Request[Unit] = js.native
  
  /** Gets a return address of the Merchant Center account. */
  def get(): Request[ReturnAddress] = js.native
  def get(request: ReturnAddressId): Request[ReturnAddress] = js.native
  
  def insert(request: AccesstokenAlt, body: ReturnAddress): Request[ReturnAddress] = js.native
  /** Inserts a return address for the Merchant Center account. */
  def insert(request: ResourceUploadTypeUploadprotocolXgafv): Request[ReturnAddress] = js.native
  
  /** Lists the return addresses of the Merchant Center account. */
  def list(): Request[ReturnaddressListResponse] = js.native
  def list(request: CountryFields): Request[ReturnaddressListResponse] = js.native
}
