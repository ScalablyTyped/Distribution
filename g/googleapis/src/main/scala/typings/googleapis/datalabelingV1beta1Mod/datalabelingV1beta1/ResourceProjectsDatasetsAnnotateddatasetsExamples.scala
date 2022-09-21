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

@JSImport("googleapis/build/src/apis/datalabeling/v1beta1", "datalabeling_v1beta1.Resource$Projects$Datasets$Annotateddatasets$Examples")
@js.native
open class ResourceProjectsDatasetsAnnotateddatasetsExamples protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Example] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1Example]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Example] = js.native
  def get(params: ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesGet): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Example] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1Example]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1Example],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1Example]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Example] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1Example]
  ): Unit = js.native
  /**
    * Gets an example by resource name, including both data and annotation.
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
    *     await datalabeling.projects.datasets.annotatedDatasets.examples.get({
    *       // Optional. An expression for filtering Examples. Filter by annotation_spec.display_name is supported. Format "annotation_spec.display_name = {display_name\}"
    *       filter: 'placeholder-value',
    *       // Required. Name of example, format: projects/{project_id\}/datasets/{dataset_id\}/annotatedDatasets/ {annotated_dataset_id\}/examples/{example_id\}
    *       name: 'projects/my-project/datasets/my-dataset/annotatedDatasets/my-annotatedDataset/examples/my-example',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": [],
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
  def get(params: ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListExamplesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListExamplesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListExamplesResponse] = js.native
  def list(params: ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesList): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListExamplesResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListExamplesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1ListExamplesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1ListExamplesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListExamplesResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListExamplesResponse]
  ): Unit = js.native
  /**
    * Lists examples in an annotated dataset. Pagination is supported.
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
    *     await datalabeling.projects.datasets.annotatedDatasets.examples.list({
    *       // Optional. An expression for filtering Examples. For annotated datasets that have annotation spec set, filter by annotation_spec.display_name is supported. Format "annotation_spec.display_name = {display_name\}"
    *       filter: 'placeholder-value',
    *       // Optional. Requested page size. Server may return fewer results than requested. Default value is 100.
    *       pageSize: 'placeholder-value',
    *       // Optional. A token identifying a page of results for the server to return. Typically obtained by ListExamplesResponse.next_page_token of the previous [DataLabelingService.ListExamples] call. Return first page if empty.
    *       pageToken: 'placeholder-value',
    *       // Required. Example resource parent.
    *       parent:
    *         'projects/my-project/datasets/my-dataset/annotatedDatasets/my-annotatedDataset',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "examples": [],
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
  def list(params: ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
