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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Partners$Channels$Sites")
@js.native
open class ResourcePartnersChannelsSites protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def bulkEdit(): GaxiosPromise[SchemaBulkEditSitesResponse] = js.native
  def bulkEdit(callback: BodyResponseCallback[SchemaBulkEditSitesResponse]): Unit = js.native
  def bulkEdit(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBulkEditSitesResponse] = js.native
  def bulkEdit(params: ParamsResourcePartnersChannelsSitesBulkedit): GaxiosPromise[SchemaBulkEditSitesResponse] = js.native
  def bulkEdit(
    params: ParamsResourcePartnersChannelsSitesBulkedit,
    callback: BodyResponseCallback[SchemaBulkEditSitesResponse]
  ): Unit = js.native
  def bulkEdit(
    params: ParamsResourcePartnersChannelsSitesBulkedit,
    options: BodyResponseCallback[Readable | SchemaBulkEditSitesResponse],
    callback: BodyResponseCallback[Readable | SchemaBulkEditSitesResponse]
  ): Unit = js.native
  def bulkEdit(params: ParamsResourcePartnersChannelsSitesBulkedit, options: MethodOptions): GaxiosPromise[SchemaBulkEditSitesResponse] = js.native
  def bulkEdit(
    params: ParamsResourcePartnersChannelsSitesBulkedit,
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
    *   const res = await displayvideo.partners.channels.sites.bulkEdit({
    *     // Required. The ID of the parent channel to which the sites belong.
    *     channelId: '[^/]+',
    *     // The ID of the partner that owns the parent channel.
    *     partnerId: 'placeholder-value',
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
  def bulkEdit(params: ParamsResourcePartnersChannelsSitesBulkedit, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def bulkEdit(
    params: ParamsResourcePartnersChannelsSitesBulkedit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSite] = js.native
  def create(callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def create(params: ParamsResourcePartnersChannelsSitesCreate): GaxiosPromise[SchemaSite] = js.native
  def create(params: ParamsResourcePartnersChannelsSitesCreate, callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def create(
    params: ParamsResourcePartnersChannelsSitesCreate,
    options: BodyResponseCallback[Readable | SchemaSite],
    callback: BodyResponseCallback[Readable | SchemaSite]
  ): Unit = js.native
  def create(params: ParamsResourcePartnersChannelsSitesCreate, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def create(
    params: ParamsResourcePartnersChannelsSitesCreate,
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
    *   const res = await displayvideo.partners.channels.sites.create({
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
  def create(params: ParamsResourcePartnersChannelsSitesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePartnersChannelsSitesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourcePartnersChannelsSitesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourcePartnersChannelsSitesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourcePartnersChannelsSitesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourcePartnersChannelsSitesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourcePartnersChannelsSitesDelete,
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
    *   const res = await displayvideo.partners.channels.sites.delete({
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
  def delete(params: ParamsResourcePartnersChannelsSitesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePartnersChannelsSitesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSitesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSitesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSitesResponse] = js.native
  def list(params: ParamsResourcePartnersChannelsSitesList): GaxiosPromise[SchemaListSitesResponse] = js.native
  def list(
    params: ParamsResourcePartnersChannelsSitesList,
    callback: BodyResponseCallback[SchemaListSitesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePartnersChannelsSitesList,
    options: BodyResponseCallback[Readable | SchemaListSitesResponse],
    callback: BodyResponseCallback[Readable | SchemaListSitesResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePartnersChannelsSitesList, options: MethodOptions): GaxiosPromise[SchemaListSitesResponse] = js.native
  def list(
    params: ParamsResourcePartnersChannelsSitesList,
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
    *   const res = await displayvideo.partners.channels.sites.list({
    *     // The ID of the advertiser that owns the parent channel.
    *     advertiserId: 'placeholder-value',
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
    *     partnerId: '[^/]+',
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
  def list(params: ParamsResourcePartnersChannelsSitesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePartnersChannelsSitesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def replace(): GaxiosPromise[SchemaReplaceSitesResponse] = js.native
  def replace(callback: BodyResponseCallback[SchemaReplaceSitesResponse]): Unit = js.native
  def replace(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReplaceSitesResponse] = js.native
  def replace(params: ParamsResourcePartnersChannelsSitesReplace): GaxiosPromise[SchemaReplaceSitesResponse] = js.native
  def replace(
    params: ParamsResourcePartnersChannelsSitesReplace,
    callback: BodyResponseCallback[SchemaReplaceSitesResponse]
  ): Unit = js.native
  def replace(
    params: ParamsResourcePartnersChannelsSitesReplace,
    options: BodyResponseCallback[Readable | SchemaReplaceSitesResponse],
    callback: BodyResponseCallback[Readable | SchemaReplaceSitesResponse]
  ): Unit = js.native
  def replace(params: ParamsResourcePartnersChannelsSitesReplace, options: MethodOptions): GaxiosPromise[SchemaReplaceSitesResponse] = js.native
  def replace(
    params: ParamsResourcePartnersChannelsSitesReplace,
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
    *   const res = await displayvideo.partners.channels.sites.replace({
    *     // Required. The ID of the parent channel whose sites will be replaced.
    *     channelId: '[^/]+',
    *     // The ID of the partner that owns the parent channel.
    *     partnerId: 'placeholder-value',
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
  def replace(params: ParamsResourcePartnersChannelsSitesReplace, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def replace(
    params: ParamsResourcePartnersChannelsSitesReplace,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
