package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.Accesstoken
import typings.maximMazurokGapiClientDialogflow.anon.Fields
import typings.maximMazurokGapiClientDialogflow.anon.Force
import typings.maximMazurokGapiClientDialogflow.anon.Key
import typings.maximMazurokGapiClientDialogflow.anon.LanguageCode
import typings.maximMazurokGapiClientDialogflow.anon.Oauthtoken
import typings.maximMazurokGapiClientDialogflow.anon.OauthtokenParent
import typings.maximMazurokGapiClientDialogflow.anon.ParentPrettyPrint
import typings.maximMazurokGapiClientDialogflow.anon.PrettyPrint
import typings.maximMazurokGapiClientDialogflow.anon.QuotaUserResource
import typings.maximMazurokGapiClientDialogflow.anon.ResourceUpdateMask
import typings.maximMazurokGapiClientDialogflow.anon.ResourceUploadType
import typings.maximMazurokGapiClientDialogflow.anon.UploadTypeUploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowsResource extends StObject {
  
  def create(request: Fields, body: GoogleCloudDialogflowCxV3Flow): Request[GoogleCloudDialogflowCxV3Flow] = js.native
  /**
    * Creates a flow in the specified agent. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def create(request: OauthtokenParent): Request[GoogleCloudDialogflowCxV3Flow] = js.native
  
  /** Deletes a specified flow. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Force): Request[js.Object] = js.native
  
  def `export`(request: Accesstoken, body: GoogleCloudDialogflowCxV3ExportFlowRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Exports the specified flow to a binary file. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned
    * `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct
    * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: ExportFlowResponse Note that resources (e.g. intents, entities,
    * webhooks) that the flow references will also be exported.
    */
  def `export`(request: QuotaUserResource): Request[GoogleLongrunningOperation] = js.native
  
  /** Retrieves the specified flow. */
  def get(): Request[GoogleCloudDialogflowCxV3Flow] = js.native
  def get(request: Key): Request[GoogleCloudDialogflowCxV3Flow] = js.native
  
  /** Gets the latest flow validation result. Flow validation is performed when ValidateFlow is called. */
  def getValidationResult(): Request[GoogleCloudDialogflowCxV3FlowValidationResult] = js.native
  def getValidationResult(request: Key): Request[GoogleCloudDialogflowCxV3FlowValidationResult] = js.native
  
  /**
    * Imports the specified flow to the specified agent from a binary file. This method is a [long-running
    * operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty
    * [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: ImportFlowResponse Note: You should always train a flow prior to
    * sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def `import`(request: ParentPrettyPrint): Request[GoogleLongrunningOperation] = js.native
  def `import`(request: PrettyPrint, body: GoogleCloudDialogflowCxV3ImportFlowRequest): Request[GoogleLongrunningOperation] = js.native
  
  /** Returns the list of all flows in the specified agent. */
  def list(): Request[GoogleCloudDialogflowCxV3ListFlowsResponse] = js.native
  def list(request: LanguageCode): Request[GoogleCloudDialogflowCxV3ListFlowsResponse] = js.native
  
  var pages: PagesResource = js.native
  
  def patch(request: Oauthtoken, body: GoogleCloudDialogflowCxV3Flow): Request[GoogleCloudDialogflowCxV3Flow] = js.native
  /**
    * Updates the specified flow. Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def patch(request: ResourceUpdateMask): Request[GoogleCloudDialogflowCxV3Flow] = js.native
  
  def train(request: Accesstoken, body: GoogleCloudDialogflowCxV3TrainFlowRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Trains the specified flow. Note that only the flow in 'draft' environment is trained. This method is a [long-running
    * operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty
    * [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: An [Empty
    * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty) Note: You should always train a flow prior to sending it queries. See the [training
    * documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    */
  def train(request: ResourceUploadType): Request[GoogleLongrunningOperation] = js.native
  
  var transitionRouteGroups: TransitionRouteGroupsResource = js.native
  
  def validate(request: Accesstoken, body: GoogleCloudDialogflowCxV3ValidateFlowRequest): Request[GoogleCloudDialogflowCxV3FlowValidationResult] = js.native
  /** Validates the specified flow and creates or updates validation results. Please call this API after the training is completed to get the complete validation results. */
  def validate(request: UploadTypeUploadprotocol): Request[GoogleCloudDialogflowCxV3FlowValidationResult] = js.native
  
  var versions: VersionsResource = js.native
}
