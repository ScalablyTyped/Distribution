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

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Conversationdatasets")
@js.native
open class ResourceProjectsConversationdatasets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationDataset] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ConversationDataset]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationDataset] = js.native
  def get(params: ParamsResourceProjectsConversationdatasetsGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationDataset] = js.native
  def get(
    params: ParamsResourceProjectsConversationdatasetsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ConversationDataset]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsConversationdatasetsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ConversationDataset],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ConversationDataset]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsConversationdatasetsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationDataset] = js.native
  def get(
    params: ParamsResourceProjectsConversationdatasetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ConversationDataset]
  ): Unit = js.native
  /**
    * Retrieves the specified conversation dataset.
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
    *   const res = await dialogflow.projects.conversationDatasets.get({
    *     // Required. The conversation dataset to retrieve. Format: `projects//locations//conversationDatasets/`
    *     name: 'projects/my-project/conversationDatasets/my-conversationDataset',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conversationCount": "my_conversationCount",
    *   //   "conversationInfo": {},
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "inputConfig": {},
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceProjectsConversationdatasetsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsConversationdatasetsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def importConversationData(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def importConversationData(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def importConversationData(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def importConversationData(params: ParamsResourceProjectsConversationdatasetsImportconversationdata): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def importConversationData(
    params: ParamsResourceProjectsConversationdatasetsImportconversationdata,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def importConversationData(
    params: ParamsResourceProjectsConversationdatasetsImportconversationdata,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def importConversationData(params: ParamsResourceProjectsConversationdatasetsImportconversationdata, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def importConversationData(
    params: ParamsResourceProjectsConversationdatasetsImportconversationdata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Import data into the specified conversation dataset. Note that it is not allowed to import data to a conversation dataset that already has data in it. This method is a [long-running operation](https://cloud.google.com/dialogflow/es/docs/how/long-running-operations). The returned `Operation` type has the following method-specific fields: - `metadata`: ImportConversationDataOperationMetadata - `response`: ImportConversationDataOperationResponse
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
    *   const res =
    *     await dialogflow.projects.conversationDatasets.importConversationData({
    *       // Required. Dataset resource name. Format: `projects//locations//conversationDatasets/`
    *       name: 'projects/my-project/conversationDatasets/my-conversationDataset',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "inputConfig": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def importConversationData(
    params: ParamsResourceProjectsConversationdatasetsImportconversationdata,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def importConversationData(
    params: ParamsResourceProjectsConversationdatasetsImportconversationdata,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListConversationDatasetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListConversationDatasetsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListConversationDatasetsResponse] = js.native
  def list(params: ParamsResourceProjectsConversationdatasetsList): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListConversationDatasetsResponse] = js.native
  def list(
    params: ParamsResourceProjectsConversationdatasetsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListConversationDatasetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsConversationdatasetsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListConversationDatasetsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListConversationDatasetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsConversationdatasetsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListConversationDatasetsResponse] = js.native
  def list(
    params: ParamsResourceProjectsConversationdatasetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListConversationDatasetsResponse]
  ): Unit = js.native
  /**
    * Returns the list of all conversation datasets in the specified project and location.
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
    *   const res = await dialogflow.projects.conversationDatasets.list({
    *     // Optional. Maximum number of conversation datasets to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The project and location name to list all conversation datasets for. Format: `projects//locations/`
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conversationDatasets": [],
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
  def list(params: ParamsResourceProjectsConversationdatasetsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsConversationdatasetsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
