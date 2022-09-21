package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtubeAnalytics/v2", "youtubeAnalytics_v2.Resource$Groups")
@js.native
open class ResourceGroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaEmptyResponse] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmptyResponse]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmptyResponse] = js.native
  def delete(params: ParamsResourceGroupsDelete): GaxiosPromise[SchemaEmptyResponse] = js.native
  def delete(params: ParamsResourceGroupsDelete, callback: BodyResponseCallback[SchemaEmptyResponse]): Unit = js.native
  def delete(
    params: ParamsResourceGroupsDelete,
    options: BodyResponseCallback[Readable | SchemaEmptyResponse],
    callback: BodyResponseCallback[Readable | SchemaEmptyResponse]
  ): Unit = js.native
  def delete(params: ParamsResourceGroupsDelete, options: MethodOptions): GaxiosPromise[SchemaEmptyResponse] = js.native
  def delete(
    params: ParamsResourceGroupsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmptyResponse]
  ): Unit = js.native
  /**
    * Deletes a group.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtubeAnalytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtubeAnalytics = google.youtubeAnalytics('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube',
    *       'https://www.googleapis.com/auth/youtube.readonly',
    *       'https://www.googleapis.com/auth/youtubepartner',
    *       'https://www.googleapis.com/auth/yt-analytics-monetary.readonly',
    *       'https://www.googleapis.com/auth/yt-analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtubeAnalytics.groups.delete({
    *     // The `id` parameter specifies the YouTube group ID of the group that is being deleted.
    *     id: 'placeholder-value',
    *     // This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels. The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "errors": {}
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
  def delete(params: ParamsResourceGroupsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceGroupsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaGroup] = js.native
  def insert(callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def insert(params: ParamsResourceGroupsInsert): GaxiosPromise[SchemaGroup] = js.native
  def insert(params: ParamsResourceGroupsInsert, callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def insert(
    params: ParamsResourceGroupsInsert,
    options: BodyResponseCallback[Readable | SchemaGroup],
    callback: BodyResponseCallback[Readable | SchemaGroup]
  ): Unit = js.native
  def insert(params: ParamsResourceGroupsInsert, options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def insert(
    params: ParamsResourceGroupsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  /**
    * Creates a group.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtubeAnalytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtubeAnalytics = google.youtubeAnalytics('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube',
    *       'https://www.googleapis.com/auth/youtube.readonly',
    *       'https://www.googleapis.com/auth/youtubepartner',
    *       'https://www.googleapis.com/auth/yt-analytics-monetary.readonly',
    *       'https://www.googleapis.com/auth/yt-analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtubeAnalytics.groups.insert({
    *     // This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels. The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contentDetails": {},
    *       //   "errors": {},
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "snippet": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentDetails": {},
    *   //   "errors": {},
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "snippet": {}
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
  def insert(params: ParamsResourceGroupsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceGroupsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListGroupsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGroupsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListGroupsResponse] = js.native
  def list(params: ParamsResourceGroupsList): GaxiosPromise[SchemaListGroupsResponse] = js.native
  def list(params: ParamsResourceGroupsList, callback: BodyResponseCallback[SchemaListGroupsResponse]): Unit = js.native
  def list(
    params: ParamsResourceGroupsList,
    options: BodyResponseCallback[Readable | SchemaListGroupsResponse],
    callback: BodyResponseCallback[Readable | SchemaListGroupsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceGroupsList, options: MethodOptions): GaxiosPromise[SchemaListGroupsResponse] = js.native
  def list(
    params: ParamsResourceGroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGroupsResponse]
  ): Unit = js.native
  /**
    * Returns a collection of groups that match the API request parameters. For example, you can retrieve all groups that the authenticated user owns, or you can retrieve one or more groups by their unique IDs.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtubeAnalytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtubeAnalytics = google.youtubeAnalytics('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube',
    *       'https://www.googleapis.com/auth/youtube.readonly',
    *       'https://www.googleapis.com/auth/youtubepartner',
    *       'https://www.googleapis.com/auth/yt-analytics-monetary.readonly',
    *       'https://www.googleapis.com/auth/yt-analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtubeAnalytics.groups.list({
    *     // The `id` parameter specifies a comma-separated list of the YouTube group ID(s) for the resource(s) that are being retrieved. Each group must be owned by the authenticated user. In a `group` resource, the `id` property specifies the group's YouTube group ID. Note that if you do not specify a value for the `id` parameter, then you must set the `mine` parameter to `true`.
    *     id: 'placeholder-value',
    *     // This parameter can only be used in a properly authorized request. Set this parameter's value to true to retrieve all groups owned by the authenticated user.
    *     mine: 'placeholder-value',
    *     // This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels. The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // The `pageToken` parameter identifies a specific page in the result set that should be returned. In an API response, the `nextPageToken` property identifies the next page that can be retrieved.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "errors": {},
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourceGroupsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceGroupsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaGroup] = js.native
  def update(callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def update(params: ParamsResourceGroupsUpdate): GaxiosPromise[SchemaGroup] = js.native
  def update(params: ParamsResourceGroupsUpdate, callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def update(
    params: ParamsResourceGroupsUpdate,
    options: BodyResponseCallback[Readable | SchemaGroup],
    callback: BodyResponseCallback[Readable | SchemaGroup]
  ): Unit = js.native
  def update(params: ParamsResourceGroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def update(
    params: ParamsResourceGroupsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  /**
    * Modifies a group. For example, you could change a group's title.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtubeAnalytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtubeAnalytics = google.youtubeAnalytics('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube',
    *       'https://www.googleapis.com/auth/youtube.readonly',
    *       'https://www.googleapis.com/auth/youtubepartner',
    *       'https://www.googleapis.com/auth/yt-analytics-monetary.readonly',
    *       'https://www.googleapis.com/auth/yt-analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtubeAnalytics.groups.update({
    *     // This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels. The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contentDetails": {},
    *       //   "errors": {},
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "snippet": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentDetails": {},
    *   //   "errors": {},
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "snippet": {}
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
  def update(params: ParamsResourceGroupsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceGroupsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
