package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperatingSystemVersionsResource extends StObject {
  
  /** Gets one operating system version by ID. */
  def get(): Request[OperatingSystemVersion] = js.native
  def get(request: Alt): Request[OperatingSystemVersion] = js.native
  
  /** Retrieves a list of operating system versions. */
  def list(): Request[OperatingSystemVersionsListResponse] = js.native
  def list(request: Callback): Request[OperatingSystemVersionsListResponse] = js.native
}
