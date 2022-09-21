package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.KeyOauthtokenPrettyPrintQuotaUser
import typings.maximMazurokGapiClientContent.anon.OauthtokenPrettyPrintProductId
import typings.maximMazurokGapiClientContent.anon.PrettyPrintProductId
import typings.maximMazurokGapiClientContent.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionalinventoryResource extends StObject {
  
  /** Updates regional inventory for multiple products or regions in a single request. */
  def custombatch(request: KeyOauthtokenPrettyPrintQuotaUser): Request[RegionalinventoryCustomBatchResponse] = js.native
  def custombatch(request: UploadType, body: RegionalinventoryCustomBatchRequest): Request[RegionalinventoryCustomBatchResponse] = js.native
  
  /** Updates the regional inventory of a product in your Merchant Center account. If a regional inventory with the same region ID already exists, this method updates that entry. */
  def insert(request: OauthtokenPrettyPrintProductId): Request[RegionalInventory] = js.native
  def insert(request: PrettyPrintProductId, body: RegionalInventory): Request[RegionalInventory] = js.native
}
