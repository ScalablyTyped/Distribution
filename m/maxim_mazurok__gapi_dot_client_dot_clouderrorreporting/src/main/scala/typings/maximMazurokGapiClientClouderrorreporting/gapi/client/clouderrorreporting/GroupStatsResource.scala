package typings.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientClouderrorreporting.anon.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupStatsResource extends js.Object {
  
  /** Lists the specified groups. */
  def list(): Request[ListGroupStatsResponse] = js.native
  def list(request: Alignment): Request[ListGroupStatsResponse] = js.native
}
