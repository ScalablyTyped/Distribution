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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Partners")
@js.native
open class ResourcePartners protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def bulkEditPartnerAssignedTargetingOptions(): GaxiosPromise[SchemaBulkEditPartnerAssignedTargetingOptionsResponse] = js.native
  def bulkEditPartnerAssignedTargetingOptions(callback: BodyResponseCallback[SchemaBulkEditPartnerAssignedTargetingOptionsResponse]): Unit = js.native
  def bulkEditPartnerAssignedTargetingOptions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBulkEditPartnerAssignedTargetingOptionsResponse] = js.native
  def bulkEditPartnerAssignedTargetingOptions(params: ParamsResourcePartnersBulkeditpartnerassignedtargetingoptions): GaxiosPromise[SchemaBulkEditPartnerAssignedTargetingOptionsResponse] = js.native
  def bulkEditPartnerAssignedTargetingOptions(
    params: ParamsResourcePartnersBulkeditpartnerassignedtargetingoptions,
    callback: BodyResponseCallback[SchemaBulkEditPartnerAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def bulkEditPartnerAssignedTargetingOptions(
    params: ParamsResourcePartnersBulkeditpartnerassignedtargetingoptions,
    options: BodyResponseCallback[Readable | SchemaBulkEditPartnerAssignedTargetingOptionsResponse],
    callback: BodyResponseCallback[Readable | SchemaBulkEditPartnerAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def bulkEditPartnerAssignedTargetingOptions(params: ParamsResourcePartnersBulkeditpartnerassignedtargetingoptions, options: MethodOptions): GaxiosPromise[SchemaBulkEditPartnerAssignedTargetingOptionsResponse] = js.native
  def bulkEditPartnerAssignedTargetingOptions(
    params: ParamsResourcePartnersBulkeditpartnerassignedtargetingoptions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBulkEditPartnerAssignedTargetingOptionsResponse]
  ): Unit = js.native
  /**
    * Bulk edits targeting options under a single partner. The operation will delete the assigned targeting options provided in BulkEditPartnerAssignedTargetingOptionsRequest.deleteRequests and then create the assigned targeting options provided in BulkEditPartnerAssignedTargetingOptionsRequest.createRequests .
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
    *   const res =
    *     await displayvideo.partners.bulkEditPartnerAssignedTargetingOptions({
    *       // Required. The ID of the partner.
    *       partnerId: '[^/]+',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "createRequests": [],
    *         //   "deleteRequests": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createdAssignedTargetingOptions": []
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
  def bulkEditPartnerAssignedTargetingOptions(
    params: ParamsResourcePartnersBulkeditpartnerassignedtargetingoptions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def bulkEditPartnerAssignedTargetingOptions(
    params: ParamsResourcePartnersBulkeditpartnerassignedtargetingoptions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var channels: ResourcePartnersChannels = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaPartner] = js.native
  def get(callback: BodyResponseCallback[SchemaPartner]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPartner] = js.native
  def get(params: ParamsResourcePartnersGet): GaxiosPromise[SchemaPartner] = js.native
  def get(params: ParamsResourcePartnersGet, callback: BodyResponseCallback[SchemaPartner]): Unit = js.native
  def get(
    params: ParamsResourcePartnersGet,
    options: BodyResponseCallback[Readable | SchemaPartner],
    callback: BodyResponseCallback[Readable | SchemaPartner]
  ): Unit = js.native
  def get(params: ParamsResourcePartnersGet, options: MethodOptions): GaxiosPromise[SchemaPartner] = js.native
  def get(
    params: ParamsResourcePartnersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPartner]
  ): Unit = js.native
  /**
    * Gets a partner.
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
    *   const res = await displayvideo.partners.get({
    *     // Required. The ID of the partner to fetch.
    *     partnerId: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adServerConfig": {},
    *   //   "dataAccessConfig": {},
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "exchangeConfig": {},
    *   //   "generalConfig": {},
    *   //   "name": "my_name",
    *   //   "partnerId": "my_partnerId",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourcePartnersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePartnersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListPartnersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPartnersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPartnersResponse] = js.native
  def list(params: ParamsResourcePartnersList): GaxiosPromise[SchemaListPartnersResponse] = js.native
  def list(params: ParamsResourcePartnersList, callback: BodyResponseCallback[SchemaListPartnersResponse]): Unit = js.native
  def list(
    params: ParamsResourcePartnersList,
    options: BodyResponseCallback[Readable | SchemaListPartnersResponse],
    callback: BodyResponseCallback[Readable | SchemaListPartnersResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePartnersList, options: MethodOptions): GaxiosPromise[SchemaListPartnersResponse] = js.native
  def list(
    params: ParamsResourcePartnersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPartnersResponse]
  ): Unit = js.native
  /**
    * Lists partners that are accessible to the current user. The order is defined by the order_by parameter.
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
    *   const res = await displayvideo.partners.list({
    *     // Allows filtering by partner properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `EQUALS (=)`. * Supported fields: - `entityStatus` Examples: * All active partners: `entityStatus="ENTITY_STATUS_ACTIVE"` The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `displayName` The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. For example, `displayName desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListPartners` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "partners": []
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
  def list(params: ParamsResourcePartnersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePartnersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var targetingTypes: ResourcePartnersTargetingtypes = js.native
}
