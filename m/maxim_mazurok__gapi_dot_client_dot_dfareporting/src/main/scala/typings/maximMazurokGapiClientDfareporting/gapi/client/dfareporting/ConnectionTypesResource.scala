package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionTypesResource extends js.Object {
  
  /** Gets one connection type by ID. */
  def get(): Request[ConnectionType] = js.native
  def get(request: Alt): Request[ConnectionType] = js.native
  
  /** Retrieves a list of connection types. */
  def list(): Request[ConnectionTypesListResponse] = js.native
  def list(request: Callback): Request[ConnectionTypesListResponse] = js.native
}
