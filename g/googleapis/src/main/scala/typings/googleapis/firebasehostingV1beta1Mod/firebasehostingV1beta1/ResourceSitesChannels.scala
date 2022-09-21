package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Resource$Sites$Channels")
@js.native
open class ResourceSitesChannels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaChannel] = js.native
  def create(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def create(params: ParamsResourceSitesChannelsCreate): GaxiosPromise[SchemaChannel] = js.native
  def create(params: ParamsResourceSitesChannelsCreate, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def create(
    params: ParamsResourceSitesChannelsCreate,
    options: BodyResponseCallback[Readable | SchemaChannel],
    callback: BodyResponseCallback[Readable | SchemaChannel]
  ): Unit = js.native
  def create(params: ParamsResourceSitesChannelsCreate, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def create(
    params: ParamsResourceSitesChannelsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  /**
    * Creates a new channel in the specified site.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.channels.create({
    *     // Required. Immutable. A unique ID within the site that identifies the channel.
    *     channelId: 'placeholder-value',
    *     // Required. The site in which to create this channel, in the format: sites/ SITE_ID
    *     parent: 'sites/my-site',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "expireTime": "my_expireTime",
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "release": {},
    *       //   "retainedReleaseCount": 0,
    *       //   "ttl": "my_ttl",
    *       //   "updateTime": "my_updateTime",
    *       //   "url": "my_url"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "expireTime": "my_expireTime",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "release": {},
    *   //   "retainedReleaseCount": 0,
    *   //   "ttl": "my_ttl",
    *   //   "updateTime": "my_updateTime",
    *   //   "url": "my_url"
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
  def create(params: ParamsResourceSitesChannelsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceSitesChannelsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSitesChannelsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSitesChannelsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceSitesChannelsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceSitesChannelsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceSitesChannelsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified channel of the specified site. The `live` channel cannot be deleted.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.channels.delete({
    *     // Required. The fully-qualified resource name for the channel, in the format: sites/SITE_ID/channels/CHANNEL_ID
    *     name: 'sites/my-site/channels/my-channel',
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
  def delete(params: ParamsResourceSitesChannelsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceSitesChannelsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaChannel] = js.native
  def get(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def get(params: ParamsResourceSitesChannelsGet): GaxiosPromise[SchemaChannel] = js.native
  def get(params: ParamsResourceSitesChannelsGet, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def get(
    params: ParamsResourceSitesChannelsGet,
    options: BodyResponseCallback[Readable | SchemaChannel],
    callback: BodyResponseCallback[Readable | SchemaChannel]
  ): Unit = js.native
  def get(params: ParamsResourceSitesChannelsGet, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def get(
    params: ParamsResourceSitesChannelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  /**
    * Retrieves information for the specified channel of the specified site.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.channels.get({
    *     // Required. The fully-qualified resource name for the channel, in the format: sites/SITE_ID/channels/CHANNEL_ID
    *     name: 'sites/my-site/channels/my-channel',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "expireTime": "my_expireTime",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "release": {},
    *   //   "retainedReleaseCount": 0,
    *   //   "ttl": "my_ttl",
    *   //   "updateTime": "my_updateTime",
    *   //   "url": "my_url"
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
  def get(params: ParamsResourceSitesChannelsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSitesChannelsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListChannelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListChannelsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListChannelsResponse] = js.native
  def list(params: ParamsResourceSitesChannelsList): GaxiosPromise[SchemaListChannelsResponse] = js.native
  def list(
    params: ParamsResourceSitesChannelsList,
    callback: BodyResponseCallback[SchemaListChannelsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSitesChannelsList,
    options: BodyResponseCallback[Readable | SchemaListChannelsResponse],
    callback: BodyResponseCallback[Readable | SchemaListChannelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSitesChannelsList, options: MethodOptions): GaxiosPromise[SchemaListChannelsResponse] = js.native
  def list(
    params: ParamsResourceSitesChannelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListChannelsResponse]
  ): Unit = js.native
  /**
    * Lists the channels for the specified site. All sites have a default `live` channel.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.channels.list({
    *     // The maximum number of channels to return. The service may return a lower number if fewer channels exist than this maximum number. If unspecified, defaults to 10. The maximum value is 100; values above 100 will be coerced to 100.
    *     pageSize: 'placeholder-value',
    *     // A token from a previous call to `ListChannels` that tells the server where to resume listing.
    *     pageToken: 'placeholder-value',
    *     // Required. The site for which to list channels, in the format: sites/SITE_ID
    *     parent: 'sites/my-site',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "channels": [],
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
  def list(params: ParamsResourceSitesChannelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSitesChannelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaChannel] = js.native
  def patch(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def patch(params: ParamsResourceSitesChannelsPatch): GaxiosPromise[SchemaChannel] = js.native
  def patch(params: ParamsResourceSitesChannelsPatch, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def patch(
    params: ParamsResourceSitesChannelsPatch,
    options: BodyResponseCallback[Readable | SchemaChannel],
    callback: BodyResponseCallback[Readable | SchemaChannel]
  ): Unit = js.native
  def patch(params: ParamsResourceSitesChannelsPatch, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def patch(
    params: ParamsResourceSitesChannelsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  /**
    * Updates information for the specified channel of the specified site. Implicitly creates the channel if it doesn't already exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.channels.patch({
    *     // The fully-qualified resource name for the channel, in the format: sites/ SITE_ID/channels/CHANNEL_ID
    *     name: 'sites/my-site/channels/my-channel',
    *     // A comma-separated list of fields to be updated in this request.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "expireTime": "my_expireTime",
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "release": {},
    *       //   "retainedReleaseCount": 0,
    *       //   "ttl": "my_ttl",
    *       //   "updateTime": "my_updateTime",
    *       //   "url": "my_url"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "expireTime": "my_expireTime",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "release": {},
    *   //   "retainedReleaseCount": 0,
    *   //   "ttl": "my_ttl",
    *   //   "updateTime": "my_updateTime",
    *   //   "url": "my_url"
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
  def patch(params: ParamsResourceSitesChannelsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceSitesChannelsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var releases: ResourceSitesChannelsReleases = js.native
}
