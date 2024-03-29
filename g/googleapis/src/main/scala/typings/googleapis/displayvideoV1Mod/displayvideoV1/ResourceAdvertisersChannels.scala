package typings.googleapis.displayvideoV1Mod.displayvideoV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Advertisers$Channels")
@js.native
open class ResourceAdvertisersChannels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaChannel] = js.native
  def create(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def create(params: ParamsResourceAdvertisersChannelsCreate): GaxiosPromise[SchemaChannel] = js.native
  def create(params: ParamsResourceAdvertisersChannelsCreate, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def create(
    params: ParamsResourceAdvertisersChannelsCreate,
    options: BodyResponseCallback[Readable | SchemaChannel],
    callback: BodyResponseCallback[Readable | SchemaChannel]
  ): Unit = js.native
  def create(params: ParamsResourceAdvertisersChannelsCreate, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def create(
    params: ParamsResourceAdvertisersChannelsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  /**
    * Creates a new channel. Returns the newly created channel if successful.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.channels.create({
    *     // The ID of the advertiser that owns the created channel.
    *     advertiserId: '[^/]+',
    *     // The ID of the partner that owns the created channel.
    *     partnerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "channelId": "my_channelId",
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "negativelyTargetedLineItemCount": "my_negativelyTargetedLineItemCount",
    *       //   "partnerId": "my_partnerId",
    *       //   "positivelyTargetedLineItemCount": "my_positivelyTargetedLineItemCount"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "channelId": "my_channelId",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "negativelyTargetedLineItemCount": "my_negativelyTargetedLineItemCount",
    *   //   "partnerId": "my_partnerId",
    *   //   "positivelyTargetedLineItemCount": "my_positivelyTargetedLineItemCount"
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
  def create(params: ParamsResourceAdvertisersChannelsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAdvertisersChannelsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaChannel] = js.native
  def get(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def get(params: ParamsResourceAdvertisersChannelsGet): GaxiosPromise[SchemaChannel] = js.native
  def get(params: ParamsResourceAdvertisersChannelsGet, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def get(
    params: ParamsResourceAdvertisersChannelsGet,
    options: BodyResponseCallback[Readable | SchemaChannel],
    callback: BodyResponseCallback[Readable | SchemaChannel]
  ): Unit = js.native
  def get(params: ParamsResourceAdvertisersChannelsGet, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def get(
    params: ParamsResourceAdvertisersChannelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  /**
    * Gets a channel for a partner or advertiser.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.channels.get({
    *     // The ID of the advertiser that owns the fetched channel.
    *     advertiserId: '[^/]+',
    *     // Required. The ID of the channel to fetch.
    *     channelId: '[^/]+',
    *     // The ID of the partner that owns the fetched channel.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "channelId": "my_channelId",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "negativelyTargetedLineItemCount": "my_negativelyTargetedLineItemCount",
    *   //   "partnerId": "my_partnerId",
    *   //   "positivelyTargetedLineItemCount": "my_positivelyTargetedLineItemCount"
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
  def get(params: ParamsResourceAdvertisersChannelsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdvertisersChannelsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListChannelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListChannelsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListChannelsResponse] = js.native
  def list(params: ParamsResourceAdvertisersChannelsList): GaxiosPromise[SchemaListChannelsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersChannelsList,
    callback: BodyResponseCallback[SchemaListChannelsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersChannelsList,
    options: BodyResponseCallback[Readable | SchemaListChannelsResponse],
    callback: BodyResponseCallback[Readable | SchemaListChannelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertisersChannelsList, options: MethodOptions): GaxiosPromise[SchemaListChannelsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersChannelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListChannelsResponse]
  ): Unit = js.native
  /**
    * Lists channels for a partner or advertiser.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.channels.list({
    *     // The ID of the advertiser that owns the channels.
    *     advertiserId: '[^/]+',
    *     // Allows filtering by channel fields. Supported syntax: * Filter expressions for channel currently can only contain at most one * restriction. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `CONTAINS (:)`. * Supported fields: - `displayName` Examples: * All channels for which the display name contains "google": `displayName : "google"`. The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `displayName` (default) * `channelId` The default sorting order is ascending. To specify descending order for a field, a suffix " desc" should be added to the field name. Example: `displayName desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListChannels` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *     // The ID of the partner that owns the channels.
    *     partnerId: 'placeholder-value',
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
  def list(params: ParamsResourceAdvertisersChannelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertisersChannelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaChannel] = js.native
  def patch(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def patch(params: ParamsResourceAdvertisersChannelsPatch): GaxiosPromise[SchemaChannel] = js.native
  def patch(params: ParamsResourceAdvertisersChannelsPatch, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def patch(
    params: ParamsResourceAdvertisersChannelsPatch,
    options: BodyResponseCallback[Readable | SchemaChannel],
    callback: BodyResponseCallback[Readable | SchemaChannel]
  ): Unit = js.native
  def patch(params: ParamsResourceAdvertisersChannelsPatch, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def patch(
    params: ParamsResourceAdvertisersChannelsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  /**
    * Updates a channel. Returns the updated channel if successful.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.channels.patch({
    *     // The ID of the advertiser that owns the created channel.
    *     advertiserId: '[^/]+',
    *     // Output only. The unique ID of the channel. Assigned by the system.
    *     channelId: 'placeholder-value',
    *     // The ID of the partner that owns the created channel.
    *     partnerId: 'placeholder-value',
    *     // Required. The mask to control which fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "channelId": "my_channelId",
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "negativelyTargetedLineItemCount": "my_negativelyTargetedLineItemCount",
    *       //   "partnerId": "my_partnerId",
    *       //   "positivelyTargetedLineItemCount": "my_positivelyTargetedLineItemCount"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "channelId": "my_channelId",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "negativelyTargetedLineItemCount": "my_negativelyTargetedLineItemCount",
    *   //   "partnerId": "my_partnerId",
    *   //   "positivelyTargetedLineItemCount": "my_positivelyTargetedLineItemCount"
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
  def patch(params: ParamsResourceAdvertisersChannelsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAdvertisersChannelsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var sites: ResourceAdvertisersChannelsSites = js.native
}
