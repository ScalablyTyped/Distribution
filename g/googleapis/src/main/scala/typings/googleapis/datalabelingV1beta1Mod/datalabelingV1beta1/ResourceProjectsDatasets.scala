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

@JSImport("googleapis/build/src/apis/datalabeling/v1beta1", "datalabeling_v1beta1.Resource$Projects$Datasets")
@js.native
open class ResourceProjectsDatasets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var annotatedDatasets: ResourceProjectsDatasetsAnnotateddatasets = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Dataset] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1Dataset]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Dataset] = js.native
  def create(params: ParamsResourceProjectsDatasetsCreate): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Dataset] = js.native
  def create(
    params: ParamsResourceProjectsDatasetsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1Dataset]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsDatasetsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1Dataset],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1Dataset]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsDatasetsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Dataset] = js.native
  def create(
    params: ParamsResourceProjectsDatasetsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1Dataset]
  ): Unit = js.native
  /**
    * Creates dataset. If success return a Dataset resource.
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
    *   const res = await datalabeling.projects.datasets.create({
    *     // Required. Dataset resource parent, format: projects/{project_id\}
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dataset": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "blockingResources": [],
    *   //   "createTime": "my_createTime",
    *   //   "dataItemCount": "my_dataItemCount",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "inputConfigs": [],
    *   //   "lastMigrateTime": "my_lastMigrateTime",
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
  def create(params: ParamsResourceProjectsDatasetsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsDatasetsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var dataItems: ResourceProjectsDatasetsDataitems = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsDatasetsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDatasetsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsDatasetsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsDatasetsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDatasetsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a dataset by resource name.
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
    *   const res = await datalabeling.projects.datasets.delete({
    *     // Required. Dataset resource name, format: projects/{project_id\}/datasets/{dataset_id\}
    *     name: 'projects/my-project/datasets/my-dataset',
    *   });
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
  def delete(params: ParamsResourceProjectsDatasetsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsDatasetsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var evaluations: ResourceProjectsDatasetsEvaluations = js.native
  
  def exportData(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def exportData(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def exportData(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def exportData(params: ParamsResourceProjectsDatasetsExportdata): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def exportData(
    params: ParamsResourceProjectsDatasetsExportdata,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def exportData(
    params: ParamsResourceProjectsDatasetsExportdata,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def exportData(params: ParamsResourceProjectsDatasetsExportdata, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def exportData(
    params: ParamsResourceProjectsDatasetsExportdata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Exports data and annotations from dataset.
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
    *   const res = await datalabeling.projects.datasets.exportData({
    *     // Required. Dataset resource name, format: projects/{project_id\}/datasets/{dataset_id\}
    *     name: 'projects/my-project/datasets/my-dataset',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "annotatedDataset": "my_annotatedDataset",
    *       //   "filter": "my_filter",
    *       //   "outputConfig": {},
    *       //   "userEmailAddress": "my_userEmailAddress"
    *       // }
    *     },
    *   });
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
  def exportData(params: ParamsResourceProjectsDatasetsExportdata, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def exportData(
    params: ParamsResourceProjectsDatasetsExportdata,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Dataset] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1Dataset]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Dataset] = js.native
  def get(params: ParamsResourceProjectsDatasetsGet): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Dataset] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1Dataset]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsDatasetsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1Dataset],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1Dataset]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDatasetsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Dataset] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1Dataset]
  ): Unit = js.native
  /**
    * Gets dataset by resource name.
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
    *   const res = await datalabeling.projects.datasets.get({
    *     // Required. Dataset resource name, format: projects/{project_id\}/datasets/{dataset_id\}
    *     name: 'projects/my-project/datasets/my-dataset',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "blockingResources": [],
    *   //   "createTime": "my_createTime",
    *   //   "dataItemCount": "my_dataItemCount",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "inputConfigs": [],
    *   //   "lastMigrateTime": "my_lastMigrateTime",
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
  def get(params: ParamsResourceProjectsDatasetsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var image: ResourceProjectsDatasetsImage = js.native
  
  def importData(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def importData(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def importData(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def importData(params: ParamsResourceProjectsDatasetsImportdata): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def importData(
    params: ParamsResourceProjectsDatasetsImportdata,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def importData(
    params: ParamsResourceProjectsDatasetsImportdata,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def importData(params: ParamsResourceProjectsDatasetsImportdata, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def importData(
    params: ParamsResourceProjectsDatasetsImportdata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Imports data into dataset based on source locations defined in request. It can be called multiple times for the same dataset. Each dataset can only have one long running operation running on it. For example, no labeling task (also long running operation) can be started while importing is still ongoing. Vice versa.
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
    *   const res = await datalabeling.projects.datasets.importData({
    *     // Required. Dataset resource name, format: projects/{project_id\}/datasets/{dataset_id\}
    *     name: 'projects/my-project/datasets/my-dataset',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "inputConfig": {},
    *       //   "userEmailAddress": "my_userEmailAddress"
    *       // }
    *     },
    *   });
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
  def importData(params: ParamsResourceProjectsDatasetsImportdata, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def importData(
    params: ParamsResourceProjectsDatasetsImportdata,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListDatasetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListDatasetsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListDatasetsResponse] = js.native
  def list(params: ParamsResourceProjectsDatasetsList): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListDatasetsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatasetsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListDatasetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDatasetsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1ListDatasetsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1ListDatasetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDatasetsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListDatasetsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatasetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListDatasetsResponse]
  ): Unit = js.native
  /**
    * Lists datasets under a project. Pagination is supported.
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
    *   const res = await datalabeling.projects.datasets.list({
    *     // Optional. Filter on dataset is not supported at this moment.
    *     filter: 'placeholder-value',
    *     // Optional. Requested page size. Server may return fewer results than requested. Default value is 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token identifying a page of results for the server to return. Typically obtained by ListDatasetsResponse.next_page_token of the previous [DataLabelingService.ListDatasets] call. Returns the first page if empty.
    *     pageToken: 'placeholder-value',
    *     // Required. Dataset resource parent, format: projects/{project_id\}
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "datasets": [],
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
  def list(params: ParamsResourceProjectsDatasetsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsDatasetsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var text: ResourceProjectsDatasetsText = js.native
  
  var video: ResourceProjectsDatasetsVideo = js.native
}
