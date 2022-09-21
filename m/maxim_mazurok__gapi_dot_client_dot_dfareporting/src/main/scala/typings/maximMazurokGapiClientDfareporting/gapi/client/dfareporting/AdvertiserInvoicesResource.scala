package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.IssueMonth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserInvoicesResource extends StObject {
  
  /**
    * Retrieves a list of invoices for a particular issue month. The api only works if the billing profile invoice level is set to either advertiser or campaign non-consolidated invoice
    * level.
    */
  def list(): Request[AdvertiserInvoicesListResponse] = js.native
  def list(request: IssueMonth): Request[AdvertiserInvoicesListResponse] = js.native
}
