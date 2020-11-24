package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountActiveAdSummariesResource extends js.Object {
  
  /** Gets the account's active ad summary by account ID. */
  def get(): Request[AccountActiveAdSummary] = js.native
  def get(request: Accesstoken): Request[AccountActiveAdSummary] = js.native
}
