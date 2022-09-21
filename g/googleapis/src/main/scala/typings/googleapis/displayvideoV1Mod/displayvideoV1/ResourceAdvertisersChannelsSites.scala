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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Advertisers$Channels$Sites")
@js.native
open class ResourceAdvertisersChannelsSites protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def bulkEdit(): GaxiosPromise[SchemaBulkEditSitesResponse] = js.native
  def bulkEdit(callback: BodyResponseCallback[SchemaBulkEditSitesResponse]): Unit = js.native
  def bulkEdit(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBulkEditSitesResponse] = js.native
  def bulkEdit(params: ParamsResourceAdvertisersChannelsSitesBulkedit): GaxiosPromise[SchemaBulkEditSitesResponse] = js.native
  def bulkEdit(
    params: ParamsResourceAdvertisersChannelsSitesBulkedit,
    callback: BodyResponseCallback[SchemaBulkEditSitesResponse]
  ): Unit = js.native
  def bulkEdit(
    params: ParamsResourceAdvertisersChannelsSitesBulkedit,
    options: BodyResponseCallback[Readable | SchemaBulkEditSitesResponse],
    callback: BodyResponseCallback[Readable | SchemaBulkEditSitesResponse]
  ): Unit = js.native
  def bulkEdit(params: ParamsResourceAdvertisersChannelsSitesBulkedit, options: MethodOptions): GaxiosPromise[SchemaBulkEditSitesResponse] = js.native
  def bulkEdit(
    params: ParamsResourceAdvertisersChannelsSitesBulkedit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBulkEditSitesResponse]
  ): Unit = js.native
  /**
    * Bulk edits sites under a single channel. The operation will delete the sites provided in BulkEditSitesRequest.deleted_sites and then create the sites provided in BulkEditSitesRequest.created_sites.
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
    *   const res = await displayvideo.advertisers.channels.sites.bulkEdit({
    *     // The ID of the advertiser that owns the parent channel.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the parent channel to which the sites belong.
    *     channelId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "createdSites": [],
    *       //   "deletedSites": [],
    *       //   "partnerId": "my_partnerId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "sites": []
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
  def bulkEdit(params: ParamsResourceAdvertisersChannelsSitesBulkedit, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def bulkEdit(
    params: ParamsResourceAdvertisersChannelsSitesBulkedit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSite] = js.native
  def create(callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def create(params: ParamsResourceAdvertisersChannelsSitesCreate): GaxiosPromise[SchemaSite] = js.native
  def create(params: ParamsResourceAdvertisersChannelsSitesCreate, callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def create(
    params: ParamsResourceAdvertisersChannelsSitesCreate,
    options: BodyResponseCallback[Readable | SchemaSite],
    callback: BodyResponseCallback[Readable | SchemaSite]
  ): Unit = js.native
  def create(params: ParamsResourceAdvertisersChannelsSitesCreate, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def create(
    params: ParamsResourceAdvertisersChannelsSitesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSite]
  ): Unit = js.native
  /**
    * Creates a site in a channel.
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
    *   const res = await displayvideo.advertisers.channels.sites.create({
    *     // The ID of the advertiser that owns the parent channel.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the parent channel in which the site will be created.
    *     channelId: '[^/]+',
    *     // The ID of the partner that owns the parent channel.
    *     partnerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "name": "my_name",
    *       //   "urlOrAppId": "my_urlOrAppId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "urlOrAppId": "my_urlOrAppId"
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
  def create(params: ParamsResourceAdvertisersChannelsSitesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAdvertisersChannelsSitesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdvertisersChannelsSitesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdvertisersChannelsSitesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceAdvertisersChannelsSitesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAdvertisersChannelsSitesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdvertisersChannelsSitesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a site from a channel.
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
    *   const res = await displayvideo.advertisers.channels.sites.delete({
    *     // The ID of the advertiser that owns the parent channel.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the parent channel to which the site belongs.
    *     channelId: '[^/]+',
    *     // The ID of the partner that owns the parent channel.
    *     partnerId: 'placeholder-value',
    *     // Required. The URL or app ID of the site to delete.
    *     urlOrAppId: '[^/]+',
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
  def delete(params: ParamsResourceAdvertisersChannelsSitesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAdvertisersChannelsSitesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSitesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSitesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSitesResponse] = js.native
  def list(params: ParamsResourceAdvertisersChannelsSitesList): GaxiosPromise[SchemaListSitesResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersChannelsSitesList,
    callback: BodyResponseCallback[SchemaListSitesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersChannelsSitesList,
    options: BodyResponseCallback[Readable | SchemaListSitesResponse],
    callback: BodyResponseCallback[Readable | SchemaListSitesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertisersChannelsSitesList, options: MethodOptions): GaxiosPromise[SchemaListSitesResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersChannelsSitesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSitesResponse]
  ): Unit = js.native
  /**
    * Lists sites in a channel.
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
    *   const res = await displayvideo.advertisers.channels.sites.list({
    *     // The ID of the advertiser that owns the parent channel.
    *     advertiserId: '[^/]+',
    *     // Required. The ID of the parent channel to which the requested sites belong.
    *     channelId: '[^/]+',
    *     // Allows filtering by site fields. Supported syntax: * Filter expressions for site currently can only contain at most one * restriction. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `CONTAINS (:)`. * Supported fields: - `urlOrAppId` Examples: * All sites for which the URL or app ID contains "google": `urlOrAppId : "google"`
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `urlOrAppId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix " desc" should be added to the field name. Example: `urlOrAppId desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `10000`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListSites` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *     // The ID of the partner that owns the parent channel.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "sites": []
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
  def list(params: ParamsResourceAdvertisersChannelsSitesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertisersChannelsSitesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def replace(): GaxiosPromise[SchemaReplaceSitesResponse] = js.native
  def replace(callback: BodyResponseCallback[SchemaReplaceSitesResponse]): Unit = js.native
  def replace(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReplaceSitesResponse] = js.native
  def replace(params: ParamsResourceAdvertisersChannelsSitesReplace): GaxiosPromise[SchemaReplaceSitesResponse] = js.native
  def replace(
    params: ParamsResourceAdvertisersChannelsSitesReplace,
    callback: BodyResponseCallback[SchemaReplaceSitesResponse]
  ): Unit = js.native
  def replace(
    params: ParamsResourceAdvertisersChannelsSitesReplace,
    options: BodyResponseCallback[Readable | SchemaReplaceSitesResponse],
    callback: BodyResponseCallback[Readable | SchemaReplaceSitesResponse]
  ): Unit = js.native
  def replace(params: ParamsResourceAdvertisersChannelsSitesReplace, options: MethodOptions): GaxiosPromise[SchemaReplaceSitesResponse] = js.native
  def replace(
    params: ParamsResourceAdvertisersChannelsSitesReplace,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReplaceSitesResponse]
  ): Unit = js.native
  /**
    * Replaces all of the sites under a single channel. The operation will replace the sites under a channel with the sites provided in ReplaceSitesRequest.new_sites.
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
    *   const res = await displayvideo.advertisers.channels.sites.replace({
    *     // The ID of the advertiser that owns the parent channel.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the parent channel whose sites will be replaced.
    *     channelId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "newSites": [],
    *       //   "partnerId": "my_partnerId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "sites": []
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
  def replace(params: ParamsResourceAdvertisersChannelsSitesReplace, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def replace(
    params: ParamsResourceAdvertisersChannelsSitesReplace,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
