package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalytics.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GaResource extends js.Object {
  
  /** Returns Analytics data for a view (profile). */
  def get(): Request[GaData] = js.native
  def get(request: Alt): Request[GaData] = js.native
}
