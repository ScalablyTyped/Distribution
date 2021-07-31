package typings.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientClouderrorreporting.anon.Alignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupStatsResource extends StObject {
  
  /** Lists the specified groups. */
  def list(): Request[ListGroupStatsResponse] = js.native
  def list(request: Alignment): Request[ListGroupStatsResponse] = js.native
}
