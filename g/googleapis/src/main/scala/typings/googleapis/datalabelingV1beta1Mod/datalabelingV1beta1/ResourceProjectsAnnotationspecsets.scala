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

@JSImport("googleapis/build/src/apis/datalabeling/v1beta1", "datalabeling_v1beta1.Resource$Projects$Annotationspecsets")
@js.native
open class ResourceProjectsAnnotationspecsets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet] = js.native
  def create(params: ParamsResourceProjectsAnnotationspecsetsCreate): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet] = js.native
  def create(
    params: ParamsResourceProjectsAnnotationspecsetsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsAnnotationspecsetsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAnnotationspecsetsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet] = js.native
  def create(
    params: ParamsResourceProjectsAnnotationspecsetsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet]
  ): Unit = js.native
  /**
    * Creates an annotation spec set by providing a set of labels.
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
    *   const res = await datalabeling.projects.annotationSpecSets.create({
    *     // Required. AnnotationSpecSet resource parent, format: projects/{project_id\}
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "annotationSpecSet": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotationSpecs": [],
    *   //   "blockingResources": [],
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
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
  def create(params: ParamsResourceProjectsAnnotationspecsetsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsAnnotationspecsetsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsAnnotationspecsetsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAnnotationspecsetsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAnnotationspecsetsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsAnnotationspecsetsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAnnotationspecsetsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes an annotation spec set by resource name.
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
    *   const res = await datalabeling.projects.annotationSpecSets.delete({
    *     // Required. AnnotationSpec resource name, format: `projects/{project_id\}/annotationSpecSets/{annotation_spec_set_id\}`.
    *     name: 'projects/my-project/annotationSpecSets/my-annotationSpecSet',
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
  def delete(params: ParamsResourceProjectsAnnotationspecsetsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsAnnotationspecsetsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet] = js.native
  def get(params: ParamsResourceProjectsAnnotationspecsetsGet): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet] = js.native
  def get(
    params: ParamsResourceProjectsAnnotationspecsetsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAnnotationspecsetsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAnnotationspecsetsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet] = js.native
  def get(
    params: ParamsResourceProjectsAnnotationspecsetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1AnnotationSpecSet]
  ): Unit = js.native
  /**
    * Gets an annotation spec set by resource name.
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
    *   const res = await datalabeling.projects.annotationSpecSets.get({
    *     // Required. AnnotationSpecSet resource name, format: projects/{project_id\}/annotationSpecSets/{annotation_spec_set_id\}
    *     name: 'projects/my-project/annotationSpecSets/my-annotationSpecSet',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotationSpecs": [],
    *   //   "blockingResources": [],
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
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
  def get(params: ParamsResourceProjectsAnnotationspecsetsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsAnnotationspecsetsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse] = js.native
  def list(params: ParamsResourceProjectsAnnotationspecsetsList): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAnnotationspecsetsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAnnotationspecsetsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAnnotationspecsetsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAnnotationspecsetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse]
  ): Unit = js.native
  /**
    * Lists annotation spec sets for a project. Pagination is supported.
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
    *   const res = await datalabeling.projects.annotationSpecSets.list({
    *     // Optional. Filter is not supported at this moment.
    *     filter: 'placeholder-value',
    *     // Optional. Requested page size. Server may return fewer results than requested. Default value is 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token identifying a page of results for the server to return. Typically obtained by ListAnnotationSpecSetsResponse.next_page_token of the previous [DataLabelingService.ListAnnotationSpecSets] call. Return first page if empty.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent of AnnotationSpecSet resource, format: projects/{project_id\}
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotationSpecSets": [],
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
  def list(params: ParamsResourceProjectsAnnotationspecsetsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsAnnotationspecsetsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
