package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Locations$Answerrecords")
@js.native
open class ResourceProjectsLocationsAnswerrecords protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1AnswerRecord] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1AnswerRecord]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1AnswerRecord] = js.native
  def get(params: ParamsResourceProjectsLocationsAnswerrecordsGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1AnswerRecord] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAnswerrecordsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1AnswerRecord]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAnswerrecordsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1AnswerRecord],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1AnswerRecord]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAnswerrecordsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1AnswerRecord] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAnswerrecordsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1AnswerRecord]
  ): Unit = js.native
  /**
    * Deprecated. Retrieves a specific answer record.
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
    * const dialogflow = google.dialogflow('v2beta1');
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
    *   const res = await dialogflow.projects.locations.answerRecords.get({
    *     // Required. The name of the answer record to retrieve. Format: `projects//locations//answerRecords/`.
    *     name: 'projects/my-project/locations/my-location/answerRecords/my-answerRecord',
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
  def get(params: ParamsResourceProjectsLocationsAnswerrecordsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAnswerrecordsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListAnswerRecordsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListAnswerRecordsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListAnswerRecordsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAnswerrecordsList): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListAnswerRecordsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAnswerrecordsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListAnswerRecordsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAnswerrecordsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ListAnswerRecordsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ListAnswerRecordsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAnswerrecordsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListAnswerRecordsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAnswerrecordsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListAnswerRecordsResponse]
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
    * const dialogflow = google.dialogflow('v2beta1');
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
    *   const res = await dialogflow.projects.locations.answerRecords.list({
    *     // Optional. Filters to restrict results to specific answer records. For more information about filtering, see [API Filtering](https://aip.dev/160).
    *     filter: 'placeholder-value',
    *     // Optional. The maximum number of records to return in a single page. The server may return fewer records than this. If unspecified, we use 10. The maximum is 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. The ListAnswerRecordsResponse.next_page_token value returned from a previous list request used to continue listing on the next page.
    *     pageToken: 'placeholder-value',
    *     // Required. The project to list all answer records for in reverse chronological order. Format: `projects//locations/`.
    *     parent: 'projects/my-project/locations/my-location',
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
  def list(params: ParamsResourceProjectsLocationsAnswerrecordsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAnswerrecordsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1AnswerRecord] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1AnswerRecord]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1AnswerRecord] = js.native
  def patch(params: ParamsResourceProjectsLocationsAnswerrecordsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1AnswerRecord] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAnswerrecordsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1AnswerRecord]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAnswerrecordsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1AnswerRecord],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1AnswerRecord]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsAnswerrecordsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1AnswerRecord] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAnswerrecordsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1AnswerRecord]
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
    * const dialogflow = google.dialogflow('v2beta1');
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
    *   const res = await dialogflow.projects.locations.answerRecords.patch({
    *     // The unique identifier of this answer record. Required for AnswerRecords.UpdateAnswerRecord method. Format: `projects//locations//answerRecords/`.
    *     name: 'projects/my-project/locations/my-location/answerRecords/my-answerRecord',
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
  def patch(params: ParamsResourceProjectsLocationsAnswerrecordsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAnswerrecordsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
