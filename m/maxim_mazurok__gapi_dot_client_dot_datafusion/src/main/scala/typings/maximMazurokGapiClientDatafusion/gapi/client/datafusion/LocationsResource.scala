package typings.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatafusion.anon.Callback
import typings.maximMazurokGapiClientDatafusion.anon.IncludeUnrevealedLocations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Callback): Request[Location] = js.native
  
  var instances: InstancesResource = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: IncludeUnrevealedLocations): Request[ListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  var versions: VersionsResource = js.native
}
