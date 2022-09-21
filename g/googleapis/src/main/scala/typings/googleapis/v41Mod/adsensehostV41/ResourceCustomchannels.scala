package typings.googleapis.v41Mod.adsensehostV41

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Customchannels")
@js.native
open class ResourceCustomchannels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaCustomChannel] = js.native
  def delete(callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def delete(params: ParamsResourceCustomchannelsDelete): GaxiosPromise[SchemaCustomChannel] = js.native
  def delete(params: ParamsResourceCustomchannelsDelete, callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def delete(
    params: ParamsResourceCustomchannelsDelete,
    options: BodyResponseCallback[Readable | SchemaCustomChannel],
    callback: BodyResponseCallback[Readable | SchemaCustomChannel]
  ): Unit = js.native
  def delete(params: ParamsResourceCustomchannelsDelete, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def delete(
    params: ParamsResourceCustomchannelsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  /**
    * Delete a specific custom channel from the host AdSense account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsensehost.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsensehost'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsensehost.customchannels.delete({
    *     // Ad client from which to delete the custom channel.
    *     adClientId: 'placeholder-value',
    *     // Custom channel to delete.
    *     customChannelId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "code": "my_code",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
  def delete(params: ParamsResourceCustomchannelsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCustomchannelsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(params: ParamsResourceCustomchannelsGet): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(params: ParamsResourceCustomchannelsGet, callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def get(
    params: ParamsResourceCustomchannelsGet,
    options: BodyResponseCallback[Readable | SchemaCustomChannel],
    callback: BodyResponseCallback[Readable | SchemaCustomChannel]
  ): Unit = js.native
  def get(params: ParamsResourceCustomchannelsGet, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(
    params: ParamsResourceCustomchannelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  /**
    * Get a specific custom channel from the host AdSense account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsensehost.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsensehost'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsensehost.customchannels.get({
    *     // Ad client from which to get the custom channel.
    *     adClientId: 'placeholder-value',
    *     // Custom channel to get.
    *     customChannelId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "code": "my_code",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
  def get(params: ParamsResourceCustomchannelsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCustomchannelsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaCustomChannel] = js.native
  def insert(callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def insert(params: ParamsResourceCustomchannelsInsert): GaxiosPromise[SchemaCustomChannel] = js.native
  def insert(params: ParamsResourceCustomchannelsInsert, callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def insert(
    params: ParamsResourceCustomchannelsInsert,
    options: BodyResponseCallback[Readable | SchemaCustomChannel],
    callback: BodyResponseCallback[Readable | SchemaCustomChannel]
  ): Unit = js.native
  def insert(params: ParamsResourceCustomchannelsInsert, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def insert(
    params: ParamsResourceCustomchannelsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  /**
    * Add a new custom channel to the host AdSense account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsensehost.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsensehost'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsensehost.customchannels.insert({
    *     // Ad client to which the new custom channel will be added.
    *     adClientId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "code": "my_code",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "code": "my_code",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
  def insert(params: ParamsResourceCustomchannelsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceCustomchannelsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomChannels]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(params: ParamsResourceCustomchannelsList): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(params: ParamsResourceCustomchannelsList, callback: BodyResponseCallback[SchemaCustomChannels]): Unit = js.native
  def list(
    params: ParamsResourceCustomchannelsList,
    options: BodyResponseCallback[Readable | SchemaCustomChannels],
    callback: BodyResponseCallback[Readable | SchemaCustomChannels]
  ): Unit = js.native
  def list(params: ParamsResourceCustomchannelsList, options: MethodOptions): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(
    params: ParamsResourceCustomchannelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannels]
  ): Unit = js.native
  /**
    * List all host custom channels in this AdSense account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsensehost.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsensehost'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsensehost.customchannels.list({
    *     // Ad client for which to list custom channels.
    *     adClientId: 'placeholder-value',
    *     // The maximum number of custom channels to include in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // A continuation token, used to page through custom channels. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def list(params: ParamsResourceCustomchannelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustomchannelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCustomChannel] = js.native
  def patch(callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def patch(params: ParamsResourceCustomchannelsPatch): GaxiosPromise[SchemaCustomChannel] = js.native
  def patch(params: ParamsResourceCustomchannelsPatch, callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def patch(
    params: ParamsResourceCustomchannelsPatch,
    options: BodyResponseCallback[Readable | SchemaCustomChannel],
    callback: BodyResponseCallback[Readable | SchemaCustomChannel]
  ): Unit = js.native
  def patch(params: ParamsResourceCustomchannelsPatch, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def patch(
    params: ParamsResourceCustomchannelsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  /**
    * Update a custom channel in the host AdSense account. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsensehost.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsensehost'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsensehost.customchannels.patch({
    *     // Ad client in which the custom channel will be updated.
    *     adClientId: 'placeholder-value',
    *     // Custom channel to get.
    *     customChannelId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "code": "my_code",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "code": "my_code",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
  def patch(params: ParamsResourceCustomchannelsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCustomchannelsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaCustomChannel] = js.native
  def update(callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def update(params: ParamsResourceCustomchannelsUpdate): GaxiosPromise[SchemaCustomChannel] = js.native
  def update(params: ParamsResourceCustomchannelsUpdate, callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def update(
    params: ParamsResourceCustomchannelsUpdate,
    options: BodyResponseCallback[Readable | SchemaCustomChannel],
    callback: BodyResponseCallback[Readable | SchemaCustomChannel]
  ): Unit = js.native
  def update(params: ParamsResourceCustomchannelsUpdate, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def update(
    params: ParamsResourceCustomchannelsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  /**
    * Update a custom channel in the host AdSense account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsensehost.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsensehost'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsensehost.customchannels.update({
    *     // Ad client in which the custom channel will be updated.
    *     adClientId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "code": "my_code",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "code": "my_code",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
  def update(params: ParamsResourceCustomchannelsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceCustomchannelsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
