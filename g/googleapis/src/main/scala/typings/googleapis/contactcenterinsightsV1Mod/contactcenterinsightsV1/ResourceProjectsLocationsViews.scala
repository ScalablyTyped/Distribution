package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/contactcenterinsights/v1", "contactcenterinsights_v1.Resource$Projects$Locations$Views")
@js.native
open class ResourceProjectsLocationsViews protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1View] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1View]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1View] = js.native
  def create(params: ParamsResourceProjectsLocationsViewsCreate): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1View] = js.native
  def create(
    params: ParamsResourceProjectsLocationsViewsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1View]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsViewsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1View],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1View]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsViewsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1View] = js.native
  def create(
    params: ParamsResourceProjectsLocationsViewsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1View]
  ): Unit = js.native
  /**
    * Creates a view.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res = await contactcenterinsights.projects.locations.views.create({
    *     // Required. The parent resource of the view. Required. The location to create a view for. Format: `projects//locations/` or `projects//locations/`
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime",
    *       //   "value": "my_value"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime",
    *   //   "value": "my_value"
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
  def create(params: ParamsResourceProjectsLocationsViewsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsViewsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsViewsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsViewsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsViewsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsViewsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsViewsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a view.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res = await contactcenterinsights.projects.locations.views.delete({
    *     // Required. The name of the view to delete.
    *     name: 'projects/my-project/locations/my-location/views/my-view',
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
  def delete(params: ParamsResourceProjectsLocationsViewsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsViewsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1View] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1View]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1View] = js.native
  def get(params: ParamsResourceProjectsLocationsViewsGet): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1View] = js.native
  def get(
    params: ParamsResourceProjectsLocationsViewsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1View]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsViewsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1View],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1View]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsViewsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1View] = js.native
  def get(
    params: ParamsResourceProjectsLocationsViewsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1View]
  ): Unit = js.native
  /**
    * Gets a view.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res = await contactcenterinsights.projects.locations.views.get({
    *     // Required. The name of the view to get.
    *     name: 'projects/my-project/locations/my-location/views/my-view',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime",
    *   //   "value": "my_value"
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
  def get(params: ParamsResourceProjectsLocationsViewsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsViewsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListViewsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1ListViewsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListViewsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsViewsList): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListViewsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsViewsList,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1ListViewsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsViewsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1ListViewsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1ListViewsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsViewsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListViewsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsViewsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1ListViewsResponse]
  ): Unit = js.native
  /**
    * Lists views.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res = await contactcenterinsights.projects.locations.views.list({
    *     // The maximum number of views to return in the response. If this value is zero, the service will select a default size. A call may return fewer objects than requested. A non-empty `next_page_token` in the response indicates that more data is available.
    *     pageSize: 'placeholder-value',
    *     // The value returned by the last `ListViewsResponse`; indicates that this is a continuation of a prior `ListViews` call and the system should return the next page of data.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource of the views.
    *     parent: 'projects/my-project/locations/my-location',
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
  def list(params: ParamsResourceProjectsLocationsViewsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsViewsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1View] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1View]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1View] = js.native
  def patch(params: ParamsResourceProjectsLocationsViewsPatch): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1View] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsViewsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1View]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsViewsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1View],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1View]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsViewsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1View] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsViewsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1View]
  ): Unit = js.native
  /**
    * Updates a view.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res = await contactcenterinsights.projects.locations.views.patch({
    *     // Immutable. The resource name of the view. Format: projects/{project\}/locations/{location\}/views/{view\}
    *     name: 'projects/my-project/locations/my-location/views/my-view',
    *     // The list of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime",
    *       //   "value": "my_value"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime",
    *   //   "value": "my_value"
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
  def patch(params: ParamsResourceProjectsLocationsViewsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsViewsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
