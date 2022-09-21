package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudidentity.anon.Customer
import typings.maximMazurokGapiClientCloudidentity.anon.Filter
import typings.maximMazurokGapiClientCloudidentity.anon.Key
import typings.maximMazurokGapiClientCloudidentity.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientStatesResource extends StObject {
  
  /** Gets the client state for the device user */
  def get(): Request[GoogleAppsCloudidentityDevicesV1ClientState] = js.native
  def get(request: Customer): Request[GoogleAppsCloudidentityDevicesV1ClientState] = js.native
  
  /** Lists the client states for the given search query. */
  def list(): Request[GoogleAppsCloudidentityDevicesV1ListClientStatesResponse] = js.native
  def list(request: Filter): Request[GoogleAppsCloudidentityDevicesV1ListClientStatesResponse] = js.native
  
  /**
    * Updates the client state for the device user **Note**: This method is available only to customers who have one of the following SKUs: Enterprise Standard, Enterprise Plus,
    * Enterprise for Education, and Cloud Identity Premium
    */
  def patch(request: Key): Request[Operation] = js.native
  def patch(request: Name, body: GoogleAppsCloudidentityDevicesV1ClientState): Request[Operation] = js.native
}
