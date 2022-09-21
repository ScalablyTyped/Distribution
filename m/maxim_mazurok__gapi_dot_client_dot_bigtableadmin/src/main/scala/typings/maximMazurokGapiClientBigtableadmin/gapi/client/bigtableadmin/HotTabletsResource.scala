package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigtableadmin.anon.EndTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HotTabletsResource extends StObject {
  
  /** Lists hot tablets in a cluster, within the time range provided. Hot tablets are ordered based on CPU usage. */
  def list(): Request[ListHotTabletsResponse] = js.native
  def list(request: EndTime): Request[ListHotTabletsResponse] = js.native
}
