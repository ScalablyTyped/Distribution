package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.Key
import typings.maximMazurokGapiClientContent.anon.PrettyPrintProductId
import typings.maximMazurokGapiClientContent.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientContent.anon.ProductId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalinventoryResource extends js.Object {
  
  def custombatch(request: Key, body: LocalinventoryCustomBatchRequest): Request[LocalinventoryCustomBatchResponse] = js.native
  /** Updates local inventory for multiple products or stores in a single request. */
  def custombatch(request: PrettyPrintQuotaUser): Request[LocalinventoryCustomBatchResponse] = js.native
  
  def insert(request: PrettyPrintProductId, body: LocalInventory): Request[LocalInventory] = js.native
  /** Updates the local inventory of a product in your Merchant Center account. */
  def insert(request: ProductId): Request[LocalInventory] = js.native
}
