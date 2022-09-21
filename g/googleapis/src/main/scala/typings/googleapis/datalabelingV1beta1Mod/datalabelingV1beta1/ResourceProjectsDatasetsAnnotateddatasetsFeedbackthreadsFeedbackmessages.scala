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

@JSImport("googleapis/build/src/apis/datalabeling/v1beta1", "datalabeling_v1beta1.Resource$Projects$Datasets$Annotateddatasets$Feedbackthreads$Feedbackmessages")
@js.native
open class ResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Create a FeedbackMessage object.
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
    *     await datalabeling.projects.datasets.annotatedDatasets.feedbackThreads.feedbackMessages.create(
    *       {
    *         // Required. FeedbackMessage resource parent, format: projects/{project_id\}/datasets/{dataset_id\}/annotatedDatasets/{annotated_dataset_id\}/feedbackThreads/{feedback_thread_id\}.
    *         parent:
    *           'projects/my-project/datasets/my-dataset/annotatedDatasets/my-annotatedDataset/feedbackThreads/my-feedbackThread',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "body": "my_body",
    *           //   "createTime": "my_createTime",
    *           //   "image": "my_image",
    *           //   "name": "my_name",
    *           //   "operatorFeedbackMetadata": {},
    *           //   "requesterFeedbackMetadata": {}
    *           // }
    *         },
    *       }
    *     );
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
  def create(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Delete a FeedbackMessage.
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
    *     await datalabeling.projects.datasets.annotatedDatasets.feedbackThreads.feedbackMessages.delete(
    *       {
    *         // Required. Name of the FeedbackMessage that is going to be deleted. Format: 'projects/{project_id\}/datasets/{dataset_id\}/annotatedDatasets/{annotated_dataset_id\}/feedbackThreads/{feedback_thread_id\}/feedbackMessages/{feedback_message_id\}'.
    *         name: 'projects/my-project/datasets/my-dataset/annotatedDatasets/my-annotatedDataset/feedbackThreads/my-feedbackThread/feedbackMessages/my-feedbackMessage',
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
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage] = js.native
  def get(params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesGet): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesGet,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage]
  ): Unit = js.native
  /**
    * Get a FeedbackMessage object.
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
    *     await datalabeling.projects.datasets.annotatedDatasets.feedbackThreads.feedbackMessages.get(
    *       {
    *         // Required. Name of the feedback. Format: 'projects/{project_id\}/datasets/{dataset_id\}/annotatedDatasets/{annotated_dataset_id\}/feedbackThreads/{feedback_thread_id\}/feedbackMessages/{feedback_message_id\}'.
    *         name: 'projects/my-project/datasets/my-dataset/annotatedDatasets/my-annotatedDataset/feedbackThreads/my-feedbackThread/feedbackMessages/my-feedbackMessage',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "body": "my_body",
    *   //   "createTime": "my_createTime",
    *   //   "image": "my_image",
    *   //   "name": "my_name",
    *   //   "operatorFeedbackMetadata": {},
    *   //   "requesterFeedbackMetadata": {}
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
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse] = js.native
  def list(params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesList): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesList,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse]
  ): Unit = js.native
  /**
    * List FeedbackMessages with pagination.
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
    *     await datalabeling.projects.datasets.annotatedDatasets.feedbackThreads.feedbackMessages.list(
    *       {
    *         // Optional. Requested page size. Server may return fewer results than requested. Default value is 100.
    *         pageSize: 'placeholder-value',
    *         // Optional. A token identifying a page of results for the server to return. Typically obtained by ListFeedbackMessages.next_page_token of the previous [DataLabelingService.ListFeedbackMessages] call. Return first page if empty.
    *         pageToken: 'placeholder-value',
    *         // Required. FeedbackMessage resource parent. Format: "projects/{project_id\}/datasets/{dataset_id\}/annotatedDatasets/{annotated_dataset_id\}/feedbackThreads/{feedback_thread_id\}"
    *         parent:
    *           'projects/my-project/datasets/my-dataset/annotatedDatasets/my-annotatedDataset/feedbackThreads/my-feedbackThread',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "feedbackMessages": [],
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
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsFeedbackthreadsFeedbackmessagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
