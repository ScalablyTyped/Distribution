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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Combinedaudiences")
@js.native
open class ResourceCombinedaudiences protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaCombinedAudience] = js.native
  def get(callback: BodyResponseCallback[SchemaCombinedAudience]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCombinedAudience] = js.native
  def get(params: ParamsResourceCombinedaudiencesGet): GaxiosPromise[SchemaCombinedAudience] = js.native
  def get(params: ParamsResourceCombinedaudiencesGet, callback: BodyResponseCallback[SchemaCombinedAudience]): Unit = js.native
  def get(
    params: ParamsResourceCombinedaudiencesGet,
    options: BodyResponseCallback[Readable | SchemaCombinedAudience],
    callback: BodyResponseCallback[Readable | SchemaCombinedAudience]
  ): Unit = js.native
  def get(params: ParamsResourceCombinedaudiencesGet, options: MethodOptions): GaxiosPromise[SchemaCombinedAudience] = js.native
  def get(
    params: ParamsResourceCombinedaudiencesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCombinedAudience]
  ): Unit = js.native
  /**
    * Gets a combined audience.
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
    *   const res = await displayvideo.combinedAudiences.get({
    *     // The ID of the advertiser that has access to the fetched combined audience.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the combined audience to fetch.
    *     combinedAudienceId: '[^/]+',
    *     // The ID of the partner that has access to the fetched combined audience.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "combinedAudienceId": "my_combinedAudienceId",
    *   //   "displayName": "my_displayName",
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
  def get(params: ParamsResourceCombinedaudiencesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCombinedaudiencesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCombinedAudiencesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCombinedAudiencesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCombinedAudiencesResponse] = js.native
  def list(params: ParamsResourceCombinedaudiencesList): GaxiosPromise[SchemaListCombinedAudiencesResponse] = js.native
  def list(
    params: ParamsResourceCombinedaudiencesList,
    callback: BodyResponseCallback[SchemaListCombinedAudiencesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCombinedaudiencesList,
    options: BodyResponseCallback[Readable | SchemaListCombinedAudiencesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCombinedAudiencesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCombinedaudiencesList, options: MethodOptions): GaxiosPromise[SchemaListCombinedAudiencesResponse] = js.native
  def list(
    params: ParamsResourceCombinedaudiencesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCombinedAudiencesResponse]
  ): Unit = js.native
  /**
    * Lists combined audiences. The order is defined by the order_by parameter.
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
    *   const res = await displayvideo.combinedAudiences.list({
    *     // The ID of the advertiser that has access to the fetched combined audiences.
    *     advertiserId: 'placeholder-value',
    *     // Allows filtering by combined audience fields. Supported syntax: * Filter expressions for combined audiences currently can only contain at most one restriction. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `CONTAINS (:)`. * Supported fields: - `displayName` Examples: * All combined audiences for which the display name contains "Google": `displayName : "Google"`. The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `combinedAudienceId` (default) * `displayName` The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `displayName desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListCombinedAudiences` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *     // The ID of the partner that has access to the fetched combined audiences.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "combinedAudiences": [],
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
  def list(params: ParamsResourceCombinedaudiencesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCombinedaudiencesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
