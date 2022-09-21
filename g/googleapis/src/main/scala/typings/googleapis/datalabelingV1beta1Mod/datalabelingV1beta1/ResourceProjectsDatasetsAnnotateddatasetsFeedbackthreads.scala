package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datalabeling/v1beta1", "datalabeling_v1beta1.Resource$Projects$Datasets$Annotateddatasets$Feedbackthreads")
@js.native
open class ResourceProjectsDatasetsAnnotateddatasetsFeedbackthreads protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Delete a FeedbackThread.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datalabeling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datalabeling = google.datalabeling('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await datalabeling.projects.datasets.annotatedDatasets.feedbackThreads.delete(
    *       {
    *         // Required. Name of the FeedbackThread that is going to be deleted. Format: 'projects/{project_id\}/datasets/{dataset_id\}/annotatedDatasets/{annotated_dataset_id\}/feedbackThreads/{feedback_thread_id\}'.
    *         name: 'projects/my-project/datasets/my-dataset/annotatedDatasets/my-annotatedDataset/feedbackThreads/my-feedbackThread',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var feedbackMessages: ResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessages = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1FeedbackThread] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1FeedbackThread]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1FeedbackThread] = js.native
  def get(params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsGet): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1FeedbackThread] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1FeedbackThread]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1FeedbackThread],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1FeedbackThread]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1FeedbackThread] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1FeedbackThread]
  ): Unit = js.native
  /**
    * Get a FeedbackThread object.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datalabeling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datalabeling = google.datalabeling('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await datalabeling.projects.datasets.annotatedDatasets.feedbackThreads.get({
    *       // Required. Name of the feedback. Format: 'projects/{project_id\}/datasets/{dataset_id\}/annotatedDatasets/{annotated_dataset_id\}/feedbackThreads/{feedback_thread_id\}'.
    *       name: 'projects/my-project/datasets/my-dataset/annotatedDatasets/my-annotatedDataset/feedbackThreads/my-feedbackThread',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "feedbackThreadMetadata": {},
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
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse] = js.native
  def list(params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsList): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse]
  ): Unit = js.native
  /**
    * List FeedbackThreads with pagination.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datalabeling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datalabeling = google.datalabeling('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await datalabeling.projects.datasets.annotatedDatasets.feedbackThreads.list(
    *       {
    *         // Optional. Requested page size. Server may return fewer results than requested. Default value is 100.
    *         pageSize: 'placeholder-value',
    *         // Optional. A token identifying a page of results for the server to return. Typically obtained by ListFeedbackThreads.next_page_token of the previous [DataLabelingService.ListFeedbackThreads] call. Return first page if empty.
    *         pageToken: 'placeholder-value',
    *         // Required. FeedbackThread resource parent. Format: "projects/{project_id\}/datasets/{dataset_id\}/annotatedDatasets/{annotated_dataset_id\}"
    *         parent:
    *           'projects/my-project/datasets/my-dataset/annotatedDatasets/my-annotatedDataset',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "feedbackThreads": [],
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
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
