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

@JSImport("googleapis/build/src/apis/datalabeling/v1beta1", "datalabeling_v1beta1.Resource$Projects$Datasets$Annotateddatasets$Dataitems")
@js.native
open class ResourceProjectsDatasetsAnnotateddatasetsDataitems protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1DataItem] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1DataItem]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1DataItem] = js.native
  def get(params: ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsGet): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1DataItem] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1DataItem]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1DataItem],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1DataItem]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1DataItem] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1DataItem]
  ): Unit = js.native
  /**
    * Gets a data item in a dataset by resource name. This API can be called after data are imported into dataset.
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
    *     await datalabeling.projects.datasets.annotatedDatasets.dataItems.get({
    *       // Required. The name of the data item to get, format: projects/{project_id\}/datasets/{dataset_id\}/dataItems/{data_item_id\}
    *       name: 'projects/my-project/datasets/my-dataset/annotatedDatasets/my-annotatedDataset/dataItems/my-dataItem',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "imagePayload": {},
    *   //   "name": "my_name",
    *   //   "textPayload": {},
    *   //   "videoPayload": {}
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
  def get(params: ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListDataItemsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListDataItemsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListDataItemsResponse] = js.native
  def list(params: ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsList): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListDataItemsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListDataItemsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1ListDataItemsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1ListDataItemsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListDataItemsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListDataItemsResponse]
  ): Unit = js.native
  /**
    * Lists data items in a dataset. This API can be called after data are imported into dataset. Pagination is supported.
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
    *     await datalabeling.projects.datasets.annotatedDatasets.dataItems.list({
    *       // Optional. Filter is not supported at this moment.
    *       filter: 'placeholder-value',
    *       // Optional. Requested page size. Server may return fewer results than requested. Default value is 100.
    *       pageSize: 'placeholder-value',
    *       // Optional. A token identifying a page of results for the server to return. Typically obtained by ListDataItemsResponse.next_page_token of the previous [DataLabelingService.ListDataItems] call. Return first page if empty.
    *       pageToken: 'placeholder-value',
    *       // Required. Name of the dataset to list data items, format: projects/{project_id\}/datasets/{dataset_id\}
    *       parent:
    *         'projects/my-project/datasets/my-dataset/annotatedDatasets/my-annotatedDataset',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataItems": [],
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
  def list(params: ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
