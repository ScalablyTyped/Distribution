package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.CallbackFieldsKeyOauthtoken
import typings.maximMazurokGapiClientContent.anon.Key
import typings.maximMazurokGapiClientContent.anon.PrettyPrintProductId
import typings.maximMazurokGapiClientContent.anon.ProductIdQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionalinventoryResource extends js.Object {
  
  /** Updates regional inventory for multiple products or regions in a single request. */
  def custombatch(request: CallbackFieldsKeyOauthtoken): Request[RegionalinventoryCustomBatchResponse] = js.native
  def custombatch(request: Key, body: RegionalinventoryCustomBatchRequest): Request[RegionalinventoryCustomBatchResponse] = js.native
  
  def insert(request: PrettyPrintProductId, body: RegionalInventory): Request[RegionalInventory] = js.native
  /** Update the regional inventory of a product in your Merchant Center account. If a regional inventory with the same region ID already exists, this method updates that entry. */
  def insert(request: ProductIdQuotaUser): Request[RegionalInventory] = js.native
}
