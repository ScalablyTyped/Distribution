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

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Locations$Buckets$Views")
@js.native
open class ResourceLocationsBucketsViews protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaLogView] = js.native
  def create(callback: BodyResponseCallback[SchemaLogView]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLogView] = js.native
  def create(params: ParamsResourceLocationsBucketsViewsCreate): GaxiosPromise[SchemaLogView] = js.native
  def create(params: ParamsResourceLocationsBucketsViewsCreate, callback: BodyResponseCallback[SchemaLogView]): Unit = js.native
  def create(
    params: ParamsResourceLocationsBucketsViewsCreate,
    options: BodyResponseCallback[Readable | SchemaLogView],
    callback: BodyResponseCallback[Readable | SchemaLogView]
  ): Unit = js.native
  def create(params: ParamsResourceLocationsBucketsViewsCreate, options: MethodOptions): GaxiosPromise[SchemaLogView] = js.native
  def create(
    params: ParamsResourceLocationsBucketsViewsCreate,
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
    *   const res = await logging.locations.buckets.views.create({
    *     // Required. The bucket in which to create the view `"projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"` For example:"projects/my-project/locations/global/buckets/my-bucket"
    *     parent: '[^/]+/[^/]+/locations/my-location/buckets/my-bucket',
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
  def create(params: ParamsResourceLocationsBucketsViewsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceLocationsBucketsViewsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceLocationsBucketsViewsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceLocationsBucketsViewsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceLocationsBucketsViewsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceLocationsBucketsViewsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceLocationsBucketsViewsDelete,
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
    *   const res = await logging.locations.buckets.views.delete({
    *     // Required. The full resource name of the view to delete: "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]" For example:"projects/my-project/locations/global/buckets/my-bucket/views/my-view"
    *     name: '[^/]+/[^/]+/locations/my-location/buckets/my-bucket/views/my-view',
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
  def delete(params: ParamsResourceLocationsBucketsViewsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceLocationsBucketsViewsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaLogView] = js.native
  def get(callback: BodyResponseCallback[SchemaLogView]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLogView] = js.native
  def get(params: ParamsResourceLocationsBucketsViewsGet): GaxiosPromise[SchemaLogView] = js.native
  def get(params: ParamsResourceLocationsBucketsViewsGet, callback: BodyResponseCallback[SchemaLogView]): Unit = js.native
  def get(
    params: ParamsResourceLocationsBucketsViewsGet,
    options: BodyResponseCallback[Readable | SchemaLogView],
    callback: BodyResponseCallback[Readable | SchemaLogView]
  ): Unit = js.native
  def get(params: ParamsResourceLocationsBucketsViewsGet, options: MethodOptions): GaxiosPromise[SchemaLogView] = js.native
  def get(
    params: ParamsResourceLocationsBucketsViewsGet,
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
    *   const res = await logging.locations.buckets.views.get({
    *     // Required. The resource name of the policy: "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]" For example:"projects/my-project/locations/global/buckets/my-bucket/views/my-view"
    *     name: '[^/]+/[^/]+/locations/my-location/buckets/my-bucket/views/my-view',
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
  def get(params: ParamsResourceLocationsBucketsViewsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceLocationsBucketsViewsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListViewsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListViewsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListViewsResponse] = js.native
  def list(params: ParamsResourceLocationsBucketsViewsList): GaxiosPromise[SchemaListViewsResponse] = js.native
  def list(
    params: ParamsResourceLocationsBucketsViewsList,
    callback: BodyResponseCallback[SchemaListViewsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLocationsBucketsViewsList,
    options: BodyResponseCallback[Readable | SchemaListViewsResponse],
    callback: BodyResponseCallback[Readable | SchemaListViewsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLocationsBucketsViewsList, options: MethodOptions): GaxiosPromise[SchemaListViewsResponse] = js.native
  def list(
    params: ParamsResourceLocationsBucketsViewsList,
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
    *   const res = await logging.locations.buckets.views.list({
    *     // Optional. The maximum number of results to return from this request.Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
    *     pageSize: 'placeholder-value',
    *     // Optional. If present, then retrieve the next batch of results from the preceding call to this method. pageToken must be the value of nextPageToken from the previous response. The values of other method parameters should be identical to those in the previous call.
    *     pageToken: 'placeholder-value',
    *     // Required. The bucket whose views are to be listed: "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
    *     parent: '[^/]+/[^/]+/locations/my-location/buckets/my-bucket',
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
  def list(params: ParamsResourceLocationsBucketsViewsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceLocationsBucketsViewsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaLogView] = js.native
  def patch(callback: BodyResponseCallback[SchemaLogView]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLogView] = js.native
  def patch(params: ParamsResourceLocationsBucketsViewsPatch): GaxiosPromise[SchemaLogView] = js.native
  def patch(params: ParamsResourceLocationsBucketsViewsPatch, callback: BodyResponseCallback[SchemaLogView]): Unit = js.native
  def patch(
    params: ParamsResourceLocationsBucketsViewsPatch,
    options: BodyResponseCallback[Readable | SchemaLogView],
    callback: BodyResponseCallback[Readable | SchemaLogView]
  ): Unit = js.native
  def patch(params: ParamsResourceLocationsBucketsViewsPatch, options: MethodOptions): GaxiosPromise[SchemaLogView] = js.native
  def patch(
    params: ParamsResourceLocationsBucketsViewsPatch,
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
    *   const res = await logging.locations.buckets.views.patch({
    *     // Required. The full resource name of the view to update "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]" For example:"projects/my-project/locations/global/buckets/my-bucket/views/my-view"
    *     name: '[^/]+/[^/]+/locations/my-location/buckets/my-bucket/views/my-view',
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
  def patch(params: ParamsResourceLocationsBucketsViewsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceLocationsBucketsViewsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
