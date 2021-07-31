package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.DartId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperatingSystemsResource extends StObject {
  
  /** Gets one operating system by DART ID. */
  def get(): Request[OperatingSystem] = js.native
  def get(request: DartId): Request[OperatingSystem] = js.native
  
  /** Retrieves a list of operating systems. */
  def list(): Request[OperatingSystemsListResponse] = js.native
  def list(request: Callback): Request[OperatingSystemsListResponse] = js.native
}
