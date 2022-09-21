package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.Accesstoken
import typings.maximMazurokGapiClientDialogflow.anon.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var agents: AgentsResource = js.native
  
  /** Gets information about a location. */
  def get(): Request[GoogleCloudLocationLocation] = js.native
  def get(request: Accesstoken): Request[GoogleCloudLocationLocation] = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[GoogleCloudLocationListLocationsResponse] = js.native
  def list(request: Filter): Request[GoogleCloudLocationListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  var securitySettings: SecuritySettingsResource = js.native
}
