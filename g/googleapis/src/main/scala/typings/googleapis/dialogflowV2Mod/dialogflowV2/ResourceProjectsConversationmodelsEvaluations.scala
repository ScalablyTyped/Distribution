package typings.googleapis.dialogflowV2Mod.dialogflowV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Conversationmodels$Evaluations")
@js.native
open class ResourceProjectsConversationmodelsEvaluations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationModelEvaluation] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ConversationModelEvaluation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationModelEvaluation] = js.native
  def get(params: ParamsResourceProjectsConversationmodelsEvaluationsGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationModelEvaluation] = js.native
  def get(
    params: ParamsResourceProjectsConversationmodelsEvaluationsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ConversationModelEvaluation]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsConversationmodelsEvaluationsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ConversationModelEvaluation],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ConversationModelEvaluation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsConversationmodelsEvaluationsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationModelEvaluation] = js.native
  def get(
    params: ParamsResourceProjectsConversationmodelsEvaluationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ConversationModelEvaluation]
  ): Unit = js.native
  /**
    * Gets an evaluation of conversation model.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.conversationModels.evaluations.get({
    *     // Required. The conversation model evaluation resource name. Format: `projects//conversationModels//evaluations/`
    *     name: 'projects/my-project/conversationModels/my-conversationModel/evaluations/my-evaluation',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "evaluationConfig": {},
    *   //   "name": "my_name",
    *   //   "smartReplyMetrics": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceProjectsConversationmodelsEvaluationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsConversationmodelsEvaluationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListConversationModelEvaluationsResponse] = js.native
  def list(
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListConversationModelEvaluationsResponse]
  ): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListConversationModelEvaluationsResponse] = js.native
  def list(params: ParamsResourceProjectsConversationmodelsEvaluationsList): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListConversationModelEvaluationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsConversationmodelsEvaluationsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListConversationModelEvaluationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsConversationmodelsEvaluationsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListConversationModelEvaluationsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListConversationModelEvaluationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsConversationmodelsEvaluationsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListConversationModelEvaluationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsConversationmodelsEvaluationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListConversationModelEvaluationsResponse]
  ): Unit = js.native
  /**
    * Lists evaluations of a conversation model.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.conversationModels.evaluations.list({
    *     // Optional. Maximum number of evaluations to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The conversation model resource name. Format: `projects//conversationModels/`
    *     parent: 'projects/my-project/conversationModels/my-conversationModel',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conversationModelEvaluations": [],
    *   //   "nextPageToken": "my_nextPageToken"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceProjectsConversationmodelsEvaluationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsConversationmodelsEvaluationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
