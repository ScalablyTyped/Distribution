package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.Accesstoken
import typings.maximMazurokGapiClientDialogflow.anon.CallbackEnvironment
import typings.maximMazurokGapiClientDialogflow.anon.Environment
import typings.maximMazurokGapiClientDialogflow.anon.EnvironmentFields
import typings.maximMazurokGapiClientDialogflow.anon.FieldsKey
import typings.maximMazurokGapiClientDialogflow.anon.KeyName
import typings.maximMazurokGapiClientDialogflow.anon.PageSize
import typings.maximMazurokGapiClientDialogflow.anon.PageToken
import typings.maximMazurokGapiClientDialogflow.anon.PrettyPrint
import typings.maximMazurokGapiClientDialogflow.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentsResource extends StObject {
  
  var continuousTestResults: ContinuousTestResultsResource = js.native
  
  /**
    * Creates an Environment in the specified Agent. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned
    * `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct
    * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: Environment
    */
  def create(request: FieldsKey): Request[GoogleLongrunningOperation] = js.native
  def create(request: PrettyPrint, body: GoogleCloudDialogflowCxV3Environment): Request[GoogleLongrunningOperation] = js.native
  
  /** Deletes the specified Environment. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  def deployFlow(request: CallbackEnvironment, body: GoogleCloudDialogflowCxV3DeployFlowRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Deploys a flow to the specified Environment. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned
    * `Operation` type has the following method-specific fields: - `metadata`: DeployFlowMetadata - `response`: DeployFlowResponse
    */
  def deployFlow(request: Environment): Request[GoogleLongrunningOperation] = js.native
  
  var deployments: DeploymentsResource = js.native
  
  var experiments: ExperimentsResource = js.native
  
  /** Retrieves the specified Environment. */
  def get(): Request[GoogleCloudDialogflowCxV3Environment] = js.native
  def get(request: Accesstoken): Request[GoogleCloudDialogflowCxV3Environment] = js.native
  
  /** Returns the list of all environments in the specified Agent. */
  def list(): Request[GoogleCloudDialogflowCxV3ListEnvironmentsResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudDialogflowCxV3ListEnvironmentsResponse] = js.native
  
  /** Looks up the history of the specified Environment. */
  def lookupEnvironmentHistory(): Request[GoogleCloudDialogflowCxV3LookupEnvironmentHistoryResponse] = js.native
  def lookupEnvironmentHistory(request: PageToken): Request[GoogleCloudDialogflowCxV3LookupEnvironmentHistoryResponse] = js.native
  
  /**
    * Updates the specified Environment. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type
    * has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`:
    * Environment
    */
  def patch(request: KeyName): Request[GoogleLongrunningOperation] = js.native
  def patch(request: UpdateMask, body: GoogleCloudDialogflowCxV3Environment): Request[GoogleLongrunningOperation] = js.native
  
  def runContinuousTest(request: CallbackEnvironment, body: GoogleCloudDialogflowCxV3RunContinuousTestRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Kicks off a continuous test under the specified Environment. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The
    * returned `Operation` type has the following method-specific fields: - `metadata`: RunContinuousTestMetadata - `response`: RunContinuousTestResponse
    */
  def runContinuousTest(request: EnvironmentFields): Request[GoogleLongrunningOperation] = js.native
  
  var sessions: SessionsResource = js.native
}
