package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowsersResource extends js.Object {
  
  /** Retrieves a list of browsers. */
  def list(): Request[BrowsersListResponse] = js.native
  def list(request: Callback): Request[BrowsersListResponse] = js.native
}
