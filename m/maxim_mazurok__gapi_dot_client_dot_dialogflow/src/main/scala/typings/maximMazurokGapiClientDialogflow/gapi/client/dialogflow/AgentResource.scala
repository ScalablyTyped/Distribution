package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.Alt
import typings.maximMazurokGapiClientDialogflow.anon.KeyName
import typings.maximMazurokGapiClientDialogflow.anon.KeyOauthtoken
import typings.maximMazurokGapiClientDialogflow.anon.Name
import typings.maximMazurokGapiClientDialogflow.anon.OauthtokenParent
import typings.maximMazurokGapiClientDialogflow.anon.PageToken
import typings.maximMazurokGapiClientDialogflow.anon.Parent
import typings.maximMazurokGapiClientDialogflow.anon.ParentPrettyPrint
import typings.maximMazurokGapiClientDialogflow.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientDialogflow.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentResource extends StObject {
  
  var entityTypes: EntityTypesResource = js.native
  
  var environments: EnvironmentsResource = js.native
  
  def `export`(request: Alt, body: GoogleCloudDialogflowV2ExportAgentRequest): Request[GoogleLongrunningOperation] = js.native
  /** Exports the specified agent to a ZIP file. Operation */
  def `export`(request: KeyOauthtoken): Request[GoogleLongrunningOperation] = js.native
  
  /** Retrieves the fulfillment. */
  def getFulfillment(): Request[GoogleCloudDialogflowV2Fulfillment] = js.native
  def getFulfillment(request: Name): Request[GoogleCloudDialogflowV2Fulfillment] = js.native
  
  /** Gets agent validation result. Agent validation is performed during training time and is updated automatically when training is completed. */
  def getValidationResult(): Request[GoogleCloudDialogflowV2ValidationResult] = js.native
  def getValidationResult(request: Parent): Request[GoogleCloudDialogflowV2ValidationResult] = js.native
  
  def `import`(request: Alt, body: GoogleCloudDialogflowV2ImportAgentRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Imports the specified agent from a ZIP file. Uploads new intents and entity types without deleting the existing ones. Intents and entity types with the same name are replaced with
    * the new versions from ImportAgentRequest. After the import, the imported draft agent will be trained automatically (unless disabled in agent settings). However, once the import is
    * done, training may not be completed yet. Please call TrainAgent and wait for the operation it returns in order to train explicitly. Operation An operation which tracks when
    * importing is complete. It only tracks when the draft agent is updated not when it is done training.
    */
  def `import`(request: OauthtokenParent): Request[GoogleLongrunningOperation] = js.native
  
  var intents: IntentsResource = js.native
  
  def restore(request: Alt, body: GoogleCloudDialogflowV2RestoreAgentRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Restores the specified agent from a ZIP file. Replaces the current agent version with a new one. All the intents and entity types in the older version are deleted. After the
    * restore, the restored draft agent will be trained automatically (unless disabled in agent settings). However, once the restore is done, training may not be completed yet. Please
    * call TrainAgent and wait for the operation it returns in order to train explicitly. Operation An operation which tracks when restoring is complete. It only tracks when the draft
    * agent is updated not when it is done training.
    */
  def restore(request: ParentPrettyPrint): Request[GoogleLongrunningOperation] = js.native
  
  /**
    * Returns the list of agents. Since there is at most one conversational agent per project, this method is useful primarily for listing all agents across projects the caller has access
    * to. One can achieve that with a wildcard project collection id "-". Refer to [List Sub-Collections](https://cloud.google.com/apis/design/design_patterns#list_sub-collections).
    */
  def search(): Request[GoogleCloudDialogflowV2SearchAgentsResponse] = js.native
  def search(request: PageToken): Request[GoogleCloudDialogflowV2SearchAgentsResponse] = js.native
  
  var sessions: SessionsResource = js.native
  
  def train(request: Alt, body: GoogleCloudDialogflowV2TrainAgentRequest): Request[GoogleLongrunningOperation] = js.native
  /** Trains the specified agent. Operation */
  def train(request: PrettyPrintQuotaUser): Request[GoogleLongrunningOperation] = js.native
  
  /** Updates the fulfillment. */
  def updateFulfillment(request: KeyName): Request[GoogleCloudDialogflowV2Fulfillment] = js.native
  def updateFulfillment(request: Uploadprotocol, body: GoogleCloudDialogflowV2Fulfillment): Request[GoogleCloudDialogflowV2Fulfillment] = js.native
}
