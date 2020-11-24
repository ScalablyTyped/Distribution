package typings.maximMazurokGapiClientContainer.gapi.client.container

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContainer.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsableSubnetworksResource extends js.Object {
  
  /** Lists subnetworks that are usable for creating clusters in a project. */
  def list(): Request[ListUsableSubnetworksResponse] = js.native
  def list(request: Accesstoken): Request[ListUsableSubnetworksResponse] = js.native
}
