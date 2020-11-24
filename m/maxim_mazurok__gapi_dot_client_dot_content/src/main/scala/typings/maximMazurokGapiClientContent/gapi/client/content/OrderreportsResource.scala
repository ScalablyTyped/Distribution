package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.DisbursementEndDate
import typings.maximMazurokGapiClientContent.anon.DisbursementId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderreportsResource extends js.Object {
  
  /** Retrieves a report for disbursements from your Merchant Center account. */
  def listdisbursements(): Request[OrderreportsListDisbursementsResponse] = js.native
  def listdisbursements(request: DisbursementEndDate): Request[OrderreportsListDisbursementsResponse] = js.native
  
  /** Retrieves a list of transactions for a disbursement from your Merchant Center account. */
  def listtransactions(): Request[OrderreportsListTransactionsResponse] = js.native
  def listtransactions(request: DisbursementId): Request[OrderreportsListTransactionsResponse] = js.native
}
