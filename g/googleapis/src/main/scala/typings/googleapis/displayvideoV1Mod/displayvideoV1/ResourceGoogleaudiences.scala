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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Googleaudiences")
@js.native
open class ResourceGoogleaudiences protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleAudience] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleAudience]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAudience] = js.native
  def get(params: ParamsResourceGoogleaudiencesGet): GaxiosPromise[SchemaGoogleAudience] = js.native
  def get(params: ParamsResourceGoogleaudiencesGet, callback: BodyResponseCallback[SchemaGoogleAudience]): Unit = js.native
  def get(
    params: ParamsResourceGoogleaudiencesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleAudience],
    callback: BodyResponseCallback[Readable | SchemaGoogleAudience]
  ): Unit = js.native
  def get(params: ParamsResourceGoogleaudiencesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleAudience] = js.native
  def get(
    params: ParamsResourceGoogleaudiencesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAudience]
  ): Unit = js.native
  /**
    * Gets a Google audience.
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
    *   const res = await displayvideo.googleAudiences.get({
    *     // The ID of the advertiser that has access to the fetched Google audience.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the Google audience to fetch.
    *     googleAudienceId: '[^/]+',
    *     // The ID of the partner that has access to the fetched Google audience.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "googleAudienceId": "my_googleAudienceId",
    *   //   "googleAudienceType": "my_googleAudienceType",
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
  def get(params: ParamsResourceGoogleaudiencesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceGoogleaudiencesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListGoogleAudiencesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGoogleAudiencesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListGoogleAudiencesResponse] = js.native
  def list(params: ParamsResourceGoogleaudiencesList): GaxiosPromise[SchemaListGoogleAudiencesResponse] = js.native
  def list(
    params: ParamsResourceGoogleaudiencesList,
    callback: BodyResponseCallback[SchemaListGoogleAudiencesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceGoogleaudiencesList,
    options: BodyResponseCallback[Readable | SchemaListGoogleAudiencesResponse],
    callback: BodyResponseCallback[Readable | SchemaListGoogleAudiencesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceGoogleaudiencesList, options: MethodOptions): GaxiosPromise[SchemaListGoogleAudiencesResponse] = js.native
  def list(
    params: ParamsResourceGoogleaudiencesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGoogleAudiencesResponse]
  ): Unit = js.native
  /**
    * Lists Google audiences. The order is defined by the order_by parameter.
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
    *   const res = await displayvideo.googleAudiences.list({
    *     // The ID of the advertiser that has access to the fetched Google audiences.
    *     advertiserId: 'placeholder-value',
    *     // Allows filtering by Google audience fields. Supported syntax: * Filter expressions for Google audiences currently can only contain at most one restriction. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `CONTAINS (:)`. * Supported fields: - `displayName` Examples: * All Google audiences for which the display name contains "Google": `displayName : "Google"`. The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `googleAudienceId` (default) * `displayName` The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `displayName desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListGoogleAudiences` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *     // The ID of the partner that has access to the fetched Google audiences.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "googleAudiences": [],
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
  def list(params: ParamsResourceGoogleaudiencesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceGoogleaudiencesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
