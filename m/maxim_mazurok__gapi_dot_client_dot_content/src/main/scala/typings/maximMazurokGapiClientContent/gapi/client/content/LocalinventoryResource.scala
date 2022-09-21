package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.FieldsKeyOauthtoken
import typings.maximMazurokGapiClientContent.anon.PrettyPrintProductId
import typings.maximMazurokGapiClientContent.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalinventoryResource extends StObject {
  
  /** Updates local inventory for multiple products or stores in a single request. */
  def custombatch(request: FieldsKeyOauthtoken): Request[LocalinventoryCustomBatchResponse] = js.native
  def custombatch(request: UploadType, body: LocalinventoryCustomBatchRequest): Request[LocalinventoryCustomBatchResponse] = js.native
  
  def insert(request: PrettyPrintProductId, body: LocalInventory): Request[LocalInventory] = js.native
  /** Updates the local inventory of a product in your Merchant Center account. */
  def insert(request: typings.maximMazurokGapiClientContent.anon.ProductId): Request[LocalInventory] = js.native
}
