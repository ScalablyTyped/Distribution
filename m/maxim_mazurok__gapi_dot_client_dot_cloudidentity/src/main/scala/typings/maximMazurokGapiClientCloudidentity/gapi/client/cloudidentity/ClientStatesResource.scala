package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudidentity.anon.Accesstoken
import typings.maximMazurokGapiClientCloudidentity.anon.Alt
import typings.maximMazurokGapiClientCloudidentity.anon.Callback
import typings.maximMazurokGapiClientCloudidentity.anon.Customer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientStatesResource extends StObject {
  
  /** Gets the client state for the device user */
  def get(): Request[GoogleAppsCloudidentityDevicesV1ClientState] = js.native
  def get(request: Accesstoken): Request[GoogleAppsCloudidentityDevicesV1ClientState] = js.native
  
  /** Lists the client states for the given search query. */
  def list(): Request[GoogleAppsCloudidentityDevicesV1ListClientStatesResponse] = js.native
  def list(request: Alt): Request[GoogleAppsCloudidentityDevicesV1ListClientStatesResponse] = js.native
  
  /** Updates the client state for the device user */
  def patch(request: Callback): Request[Operation] = js.native
  def patch(request: Customer, body: GoogleAppsCloudidentityDevicesV1ClientState): Request[Operation] = js.native
}
