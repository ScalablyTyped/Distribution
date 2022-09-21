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

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Answerrecords")
@js.native
open class ResourceProjectsAnswerrecords protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListAnswerRecordsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListAnswerRecordsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListAnswerRecordsResponse] = js.native
  def list(params: ParamsResourceProjectsAnswerrecordsList): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListAnswerRecordsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAnswerrecordsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListAnswerRecordsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAnswerrecordsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListAnswerRecordsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListAnswerRecordsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAnswerrecordsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListAnswerRecordsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAnswerrecordsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListAnswerRecordsResponse]
  ): Unit = js.native
  /**
    * Returns the list of all answer records in the specified project in reverse chronological order.
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
    *   const res = await dialogflow.projects.answerRecords.list({
    *     // Optional. Filters to restrict results to specific answer records. Marked deprecated as it hasn't been, and isn't currently, supported. For more information about filtering, see [API Filtering](https://aip.dev/160).
    *     filter: 'placeholder-value',
    *     // Optional. The maximum number of records to return in a single page. The server may return fewer records than this. If unspecified, we use 10. The maximum is 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. The ListAnswerRecordsResponse.next_page_token value returned from a previous list request used to continue listing on the next page.
    *     pageToken: 'placeholder-value',
    *     // Required. The project to list all answer records for in reverse chronological order. Format: `projects//locations/`.
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "answerRecords": [],
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
  def list(params: ParamsResourceProjectsAnswerrecordsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsAnswerrecordsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2AnswerRecord] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2AnswerRecord]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2AnswerRecord] = js.native
  def patch(params: ParamsResourceProjectsAnswerrecordsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2AnswerRecord] = js.native
  def patch(
    params: ParamsResourceProjectsAnswerrecordsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2AnswerRecord]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAnswerrecordsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2AnswerRecord],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2AnswerRecord]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAnswerrecordsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2AnswerRecord] = js.native
  def patch(
    params: ParamsResourceProjectsAnswerrecordsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2AnswerRecord]
  ): Unit = js.native
  /**
    * Updates the specified answer record.
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
    *   const res = await dialogflow.projects.answerRecords.patch({
    *     // The unique identifier of this answer record. Format: `projects//locations//answerRecords/`.
    *     name: 'projects/my-project/answerRecords/my-answerRecord',
    *     // Required. The mask to control which fields get updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "agentAssistantRecord": {},
    *       //   "answerFeedback": {},
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "agentAssistantRecord": {},
    *   //   "answerFeedback": {},
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
  def patch(params: ParamsResourceProjectsAnswerrecordsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsAnswerrecordsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
