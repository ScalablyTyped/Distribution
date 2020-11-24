package typings.maximMazurokGapiClientCloudscheduler.gapi.client.cloudscheduler

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudscheduler.anon.Callback
import typings.maximMazurokGapiClientCloudscheduler.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Callback): Request[Location] = js.native
  
  var jobs: JobsResource = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: Filter): Request[ListLocationsResponse] = js.native
}
