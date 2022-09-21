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

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Urlchannels")
@js.native
open class ResourceUrlchannels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaUrlChannel] = js.native
  def delete(callback: BodyResponseCallback[SchemaUrlChannel]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUrlChannel] = js.native
  def delete(params: ParamsResourceUrlchannelsDelete): GaxiosPromise[SchemaUrlChannel] = js.native
  def delete(params: ParamsResourceUrlchannelsDelete, callback: BodyResponseCallback[SchemaUrlChannel]): Unit = js.native
  def delete(
    params: ParamsResourceUrlchannelsDelete,
    options: BodyResponseCallback[Readable | SchemaUrlChannel],
    callback: BodyResponseCallback[Readable | SchemaUrlChannel]
  ): Unit = js.native
  def delete(params: ParamsResourceUrlchannelsDelete, options: MethodOptions): GaxiosPromise[SchemaUrlChannel] = js.native
  def delete(
    params: ParamsResourceUrlchannelsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUrlChannel]
  ): Unit = js.native
  /**
    * Delete a URL channel from the host AdSense account.
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
    *   const res = await adsensehost.urlchannels.delete({
    *     // Ad client from which to delete the URL channel.
    *     adClientId: 'placeholder-value',
    *     // URL channel to delete.
    *     urlChannelId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "urlPattern": "my_urlPattern"
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
  def delete(params: ParamsResourceUrlchannelsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUrlchannelsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaUrlChannel] = js.native
  def insert(callback: BodyResponseCallback[SchemaUrlChannel]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUrlChannel] = js.native
  def insert(params: ParamsResourceUrlchannelsInsert): GaxiosPromise[SchemaUrlChannel] = js.native
  def insert(params: ParamsResourceUrlchannelsInsert, callback: BodyResponseCallback[SchemaUrlChannel]): Unit = js.native
  def insert(
    params: ParamsResourceUrlchannelsInsert,
    options: BodyResponseCallback[Readable | SchemaUrlChannel],
    callback: BodyResponseCallback[Readable | SchemaUrlChannel]
  ): Unit = js.native
  def insert(params: ParamsResourceUrlchannelsInsert, options: MethodOptions): GaxiosPromise[SchemaUrlChannel] = js.native
  def insert(
    params: ParamsResourceUrlchannelsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUrlChannel]
  ): Unit = js.native
  /**
    * Add a new URL channel to the host AdSense account.
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
    *   const res = await adsensehost.urlchannels.insert({
    *     // Ad client to which the new URL channel will be added.
    *     adClientId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "urlPattern": "my_urlPattern"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "urlPattern": "my_urlPattern"
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
  def insert(params: ParamsResourceUrlchannelsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceUrlchannelsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaUrlChannels] = js.native
  def list(callback: BodyResponseCallback[SchemaUrlChannels]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUrlChannels] = js.native
  def list(params: ParamsResourceUrlchannelsList): GaxiosPromise[SchemaUrlChannels] = js.native
  def list(params: ParamsResourceUrlchannelsList, callback: BodyResponseCallback[SchemaUrlChannels]): Unit = js.native
  def list(
    params: ParamsResourceUrlchannelsList,
    options: BodyResponseCallback[Readable | SchemaUrlChannels],
    callback: BodyResponseCallback[Readable | SchemaUrlChannels]
  ): Unit = js.native
  def list(params: ParamsResourceUrlchannelsList, options: MethodOptions): GaxiosPromise[SchemaUrlChannels] = js.native
  def list(
    params: ParamsResourceUrlchannelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUrlChannels]
  ): Unit = js.native
  /**
    * List all host URL channels in the host AdSense account.
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
    *   const res = await adsensehost.urlchannels.list({
    *     // Ad client for which to list URL channels.
    *     adClientId: 'placeholder-value',
    *     // The maximum number of URL channels to include in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // A continuation token, used to page through URL channels. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
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
  def list(params: ParamsResourceUrlchannelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUrlchannelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
