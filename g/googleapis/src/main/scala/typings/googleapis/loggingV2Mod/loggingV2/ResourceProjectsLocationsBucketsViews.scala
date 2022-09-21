package typings.googleapis.loggingV2Mod.loggingV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Projects$Locations$Buckets$Views")
@js.native
open class ResourceProjectsLocationsBucketsViews protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaLogView] = js.native
  def create(callback: BodyResponseCallback[SchemaLogView]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLogView] = js.native
  def create(params: ParamsResourceProjectsLocationsBucketsViewsCreate): GaxiosPromise[SchemaLogView] = js.native
  def create(
    params: ParamsResourceProjectsLocationsBucketsViewsCreate,
    callback: BodyResponseCallback[SchemaLogView]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsBucketsViewsCreate,
    options: BodyResponseCallback[Readable | SchemaLogView],
    callback: BodyResponseCallback[Readable | SchemaLogView]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsBucketsViewsCreate, options: MethodOptions): GaxiosPromise[SchemaLogView] = js.native
  def create(
    params: ParamsResourceProjectsLocationsBucketsViewsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogView]
  ): Unit = js.native
  /**
    * Creates a view over log entries in a log bucket. A bucket may contain a maximum of 30 views.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/logging.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.projects.locations.buckets.views.create({
    *     // Required. The bucket in which to create the view `"projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"` For example:"projects/my-project/locations/global/buckets/my-bucket"
    *     parent: 'projects/my-project/locations/my-location/buckets/my-bucket',
    *     // Required. The id to use for this view.
    *     viewId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "filter": "my_filter",
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "filter": "my_filter",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
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
  def create(params: ParamsResourceProjectsLocationsBucketsViewsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsBucketsViewsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsBucketsViewsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsBucketsViewsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsBucketsViewsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsBucketsViewsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsBucketsViewsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a view on a log bucket. If an UNAVAILABLE error is returned, this indicates that system is not in a state where it can delete the view. If this occurs, please try again in a few minutes.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/logging.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.projects.locations.buckets.views.delete({
    *     // Required. The full resource name of the view to delete: "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]" For example:"projects/my-project/locations/global/buckets/my-bucket/views/my-view"
    *     name: 'projects/my-project/locations/my-location/buckets/my-bucket/views/my-view',
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
  def delete(params: ParamsResourceProjectsLocationsBucketsViewsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsBucketsViewsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaLogView] = js.native
  def get(callback: BodyResponseCallback[SchemaLogView]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLogView] = js.native
  def get(params: ParamsResourceProjectsLocationsBucketsViewsGet): GaxiosPromise[SchemaLogView] = js.native
  def get(
    params: ParamsResourceProjectsLocationsBucketsViewsGet,
    callback: BodyResponseCallback[SchemaLogView]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsBucketsViewsGet,
    options: BodyResponseCallback[Readable | SchemaLogView],
    callback: BodyResponseCallback[Readable | SchemaLogView]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsBucketsViewsGet, options: MethodOptions): GaxiosPromise[SchemaLogView] = js.native
  def get(
    params: ParamsResourceProjectsLocationsBucketsViewsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogView]
  ): Unit = js.native
  /**
    * Gets a view on a log bucket..
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/logging.admin',
    *       'https://www.googleapis.com/auth/logging.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.projects.locations.buckets.views.get({
    *     // Required. The resource name of the policy: "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]" For example:"projects/my-project/locations/global/buckets/my-bucket/views/my-view"
    *     name: 'projects/my-project/locations/my-location/buckets/my-bucket/views/my-view',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "filter": "my_filter",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsLocationsBucketsViewsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsBucketsViewsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListViewsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListViewsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListViewsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsBucketsViewsList): GaxiosPromise[SchemaListViewsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBucketsViewsList,
    callback: BodyResponseCallback[SchemaListViewsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsBucketsViewsList,
    options: BodyResponseCallback[Readable | SchemaListViewsResponse],
    callback: BodyResponseCallback[Readable | SchemaListViewsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsBucketsViewsList, options: MethodOptions): GaxiosPromise[SchemaListViewsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBucketsViewsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListViewsResponse]
  ): Unit = js.native
  /**
    * Lists views on a log bucket.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/logging.admin',
    *       'https://www.googleapis.com/auth/logging.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.projects.locations.buckets.views.list({
    *     // Optional. The maximum number of results to return from this request.Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
    *     pageSize: 'placeholder-value',
    *     // Optional. If present, then retrieve the next batch of results from the preceding call to this method. pageToken must be the value of nextPageToken from the previous response. The values of other method parameters should be identical to those in the previous call.
    *     pageToken: 'placeholder-value',
    *     // Required. The bucket whose views are to be listed: "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
    *     parent: 'projects/my-project/locations/my-location/buckets/my-bucket',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "views": []
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
  def list(params: ParamsResourceProjectsLocationsBucketsViewsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBucketsViewsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var logs: ResourceProjectsLocationsBucketsViewsLogs = js.native
  
  def patch(): GaxiosPromise[SchemaLogView] = js.native
  def patch(callback: BodyResponseCallback[SchemaLogView]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLogView] = js.native
  def patch(params: ParamsResourceProjectsLocationsBucketsViewsPatch): GaxiosPromise[SchemaLogView] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsBucketsViewsPatch,
    callback: BodyResponseCallback[SchemaLogView]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsBucketsViewsPatch,
    options: BodyResponseCallback[Readable | SchemaLogView],
    callback: BodyResponseCallback[Readable | SchemaLogView]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsBucketsViewsPatch, options: MethodOptions): GaxiosPromise[SchemaLogView] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsBucketsViewsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogView]
  ): Unit = js.native
  /**
    * Updates a view on a log bucket. This method replaces the following fields in the existing view with values from the new view: filter. If an UNAVAILABLE error is returned, this indicates that system is not in a state where it can update the view. If this occurs, please try again in a few minutes.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/logging.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.projects.locations.buckets.views.patch({
    *     // Required. The full resource name of the view to update "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]" For example:"projects/my-project/locations/global/buckets/my-bucket/views/my-view"
    *     name: 'projects/my-project/locations/my-location/buckets/my-bucket/views/my-view',
    *     // Optional. Field mask that specifies the fields in view that need an update. A field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskFor example: updateMask=filter
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "filter": "my_filter",
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "filter": "my_filter",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
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
  def patch(params: ParamsResourceProjectsLocationsBucketsViewsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsBucketsViewsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
