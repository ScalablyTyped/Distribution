package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.Acknowledged
import typings.maximMazurokGapiClientContent.anon.QuotaUserResource
import typings.maximMazurokGapiClientContent.anon.QuotaUserReturnId
import typings.maximMazurokGapiClientContent.anon.ResourceReturnId
import typings.maximMazurokGapiClientContent.anon.ReturnId
import typings.maximMazurokGapiClientContent.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderreturnsResource extends StObject {
  
  def acknowledge(request: QuotaUserReturnId, body: OrderreturnsAcknowledgeRequest): Request[OrderreturnsAcknowledgeResponse] = js.native
  /** Acks an order return in your Merchant Center account. */
  def acknowledge(request: ReturnId): Request[OrderreturnsAcknowledgeResponse] = js.native
  
  /** Create return in your Merchant Center account. */
  def createorderreturn(request: QuotaUserResource): Request[OrderreturnsCreateOrderReturnResponse] = js.native
  def createorderreturn(request: UploadType, body: OrderreturnsCreateOrderReturnRequest): Request[OrderreturnsCreateOrderReturnResponse] = js.native
  
  /** Retrieves an order return from your Merchant Center account. */
  def get(): Request[MerchantOrderReturn] = js.native
  def get(request: QuotaUserReturnId): Request[MerchantOrderReturn] = js.native
  
  /** Lists order returns in your Merchant Center account. */
  def list(): Request[OrderreturnsListResponse] = js.native
  def list(request: Acknowledged): Request[OrderreturnsListResponse] = js.native
  
  def process(request: QuotaUserReturnId, body: OrderreturnsProcessRequest): Request[OrderreturnsProcessResponse] = js.native
  /** Processes return in your Merchant Center account. */
  def process(request: ResourceReturnId): Request[OrderreturnsProcessResponse] = js.native
}
