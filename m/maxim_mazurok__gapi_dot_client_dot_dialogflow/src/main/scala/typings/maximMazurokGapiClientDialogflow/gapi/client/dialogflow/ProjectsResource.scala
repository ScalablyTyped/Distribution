package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.Alt
import typings.maximMazurokGapiClientDialogflow.anon.QuotaUserResource
import typings.maximMazurokGapiClientDialogflow.anon.QuotaUserUpdateMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
  var agent: AgentResource = js.native
  
  /** Deletes the specified agent. */
  def deleteAgent(): Request[js.Object] = js.native
  def deleteAgent(request: Alt): Request[js.Object] = js.native
  
  /** Retrieves the specified agent. */
  def getAgent(): Request[GoogleCloudDialogflowV2Agent] = js.native
  def getAgent(request: Alt): Request[GoogleCloudDialogflowV2Agent] = js.native
  
  var locations: LocationsResource = js.native
  
  var operations: OperationsResource = js.native
  
  /** Creates/updates the specified agent. */
  def setAgent(request: QuotaUserResource): Request[GoogleCloudDialogflowV2Agent] = js.native
  def setAgent(request: QuotaUserUpdateMask, body: GoogleCloudDialogflowV2Agent): Request[GoogleCloudDialogflowV2Agent] = js.native
}
