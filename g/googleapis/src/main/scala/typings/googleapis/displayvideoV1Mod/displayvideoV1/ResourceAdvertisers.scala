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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Advertisers")
@js.native
open class ResourceAdvertisers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var assets: ResourceAdvertisersAssets = js.native
  
  def audit(): GaxiosPromise[SchemaAuditAdvertiserResponse] = js.native
  def audit(callback: BodyResponseCallback[SchemaAuditAdvertiserResponse]): Unit = js.native
  def audit(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAuditAdvertiserResponse] = js.native
  def audit(params: ParamsResourceAdvertisersAudit): GaxiosPromise[SchemaAuditAdvertiserResponse] = js.native
  def audit(
    params: ParamsResourceAdvertisersAudit,
    callback: BodyResponseCallback[SchemaAuditAdvertiserResponse]
  ): Unit = js.native
  def audit(
    params: ParamsResourceAdvertisersAudit,
    options: BodyResponseCallback[Readable | SchemaAuditAdvertiserResponse],
    callback: BodyResponseCallback[Readable | SchemaAuditAdvertiserResponse]
  ): Unit = js.native
  def audit(params: ParamsResourceAdvertisersAudit, options: MethodOptions): GaxiosPromise[SchemaAuditAdvertiserResponse] = js.native
  def audit(
    params: ParamsResourceAdvertisersAudit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAuditAdvertiserResponse]
  ): Unit = js.native
  /**
    * Audits an advertiser. Returns the counts of used entities per resource type under the advertiser provided. Used entities count towards their respective resource limit. See https://support.google.com/displayvideo/answer/6071450.
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
    *   const res = await displayvideo.advertisers.audit({
    *     // Required. The ID of the advertiser to audit.
    *     advertiserId: '[^/]+',
    *     // Optional. The specific fields to return. If no mask is specified, all fields in the response proto will be filled. Valid values are: * usedLineItemsCount * usedInsertionOrdersCount * usedCampaignsCount * channelsCount * negativelyTargetedChannelsCount * negativeKeywordListsCount * adGroupCriteriaCount * campaignCriteriaCount
    *     readMask: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adGroupCriteriaCount": "my_adGroupCriteriaCount",
    *   //   "campaignCriteriaCount": "my_campaignCriteriaCount",
    *   //   "channelsCount": "my_channelsCount",
    *   //   "negativeKeywordListsCount": "my_negativeKeywordListsCount",
    *   //   "negativelyTargetedChannelsCount": "my_negativelyTargetedChannelsCount",
    *   //   "usedCampaignsCount": "my_usedCampaignsCount",
    *   //   "usedInsertionOrdersCount": "my_usedInsertionOrdersCount",
    *   //   "usedLineItemsCount": "my_usedLineItemsCount"
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
  def audit(params: ParamsResourceAdvertisersAudit, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def audit(
    params: ParamsResourceAdvertisersAudit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def bulkEditAdvertiserAssignedTargetingOptions(): GaxiosPromise[SchemaBulkEditAdvertiserAssignedTargetingOptionsResponse] = js.native
  def bulkEditAdvertiserAssignedTargetingOptions(callback: BodyResponseCallback[SchemaBulkEditAdvertiserAssignedTargetingOptionsResponse]): Unit = js.native
  def bulkEditAdvertiserAssignedTargetingOptions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBulkEditAdvertiserAssignedTargetingOptionsResponse] = js.native
  def bulkEditAdvertiserAssignedTargetingOptions(params: ParamsResourceAdvertisersBulkeditadvertiserassignedtargetingoptions): GaxiosPromise[SchemaBulkEditAdvertiserAssignedTargetingOptionsResponse] = js.native
  def bulkEditAdvertiserAssignedTargetingOptions(
    params: ParamsResourceAdvertisersBulkeditadvertiserassignedtargetingoptions,
    callback: BodyResponseCallback[SchemaBulkEditAdvertiserAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def bulkEditAdvertiserAssignedTargetingOptions(
    params: ParamsResourceAdvertisersBulkeditadvertiserassignedtargetingoptions,
    options: BodyResponseCallback[Readable | SchemaBulkEditAdvertiserAssignedTargetingOptionsResponse],
    callback: BodyResponseCallback[Readable | SchemaBulkEditAdvertiserAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def bulkEditAdvertiserAssignedTargetingOptions(
    params: ParamsResourceAdvertisersBulkeditadvertiserassignedtargetingoptions,
    options: MethodOptions
  ): GaxiosPromise[SchemaBulkEditAdvertiserAssignedTargetingOptionsResponse] = js.native
  def bulkEditAdvertiserAssignedTargetingOptions(
    params: ParamsResourceAdvertisersBulkeditadvertiserassignedtargetingoptions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBulkEditAdvertiserAssignedTargetingOptionsResponse]
  ): Unit = js.native
  /**
    * Bulk edits targeting options under a single advertiser. The operation will delete the assigned targeting options provided in BulkEditAdvertiserAssignedTargetingOptionsRequest.delete_requests and then create the assigned targeting options provided in BulkEditAdvertiserAssignedTargetingOptionsRequest.create_requests .
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
    *     await displayvideo.advertisers.bulkEditAdvertiserAssignedTargetingOptions({
    *       // Required. The ID of the advertiser.
    *       advertiserId: '[^/]+',
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
  def bulkEditAdvertiserAssignedTargetingOptions(
    params: ParamsResourceAdvertisersBulkeditadvertiserassignedtargetingoptions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def bulkEditAdvertiserAssignedTargetingOptions(
    params: ParamsResourceAdvertisersBulkeditadvertiserassignedtargetingoptions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def bulkListAdvertiserAssignedTargetingOptions(): GaxiosPromise[SchemaBulkListAdvertiserAssignedTargetingOptionsResponse] = js.native
  def bulkListAdvertiserAssignedTargetingOptions(callback: BodyResponseCallback[SchemaBulkListAdvertiserAssignedTargetingOptionsResponse]): Unit = js.native
  def bulkListAdvertiserAssignedTargetingOptions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBulkListAdvertiserAssignedTargetingOptionsResponse] = js.native
  def bulkListAdvertiserAssignedTargetingOptions(params: ParamsResourceAdvertisersBulklistadvertiserassignedtargetingoptions): GaxiosPromise[SchemaBulkListAdvertiserAssignedTargetingOptionsResponse] = js.native
  def bulkListAdvertiserAssignedTargetingOptions(
    params: ParamsResourceAdvertisersBulklistadvertiserassignedtargetingoptions,
    callback: BodyResponseCallback[SchemaBulkListAdvertiserAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def bulkListAdvertiserAssignedTargetingOptions(
    params: ParamsResourceAdvertisersBulklistadvertiserassignedtargetingoptions,
    options: BodyResponseCallback[Readable | SchemaBulkListAdvertiserAssignedTargetingOptionsResponse],
    callback: BodyResponseCallback[Readable | SchemaBulkListAdvertiserAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def bulkListAdvertiserAssignedTargetingOptions(
    params: ParamsResourceAdvertisersBulklistadvertiserassignedtargetingoptions,
    options: MethodOptions
  ): GaxiosPromise[SchemaBulkListAdvertiserAssignedTargetingOptionsResponse] = js.native
  def bulkListAdvertiserAssignedTargetingOptions(
    params: ParamsResourceAdvertisersBulklistadvertiserassignedtargetingoptions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBulkListAdvertiserAssignedTargetingOptionsResponse]
  ): Unit = js.native
  /**
    * Lists assigned targeting options of an advertiser across targeting types.
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
    *     await displayvideo.advertisers.bulkListAdvertiserAssignedTargetingOptions({
    *       // Required. The ID of the advertiser the line item belongs to.
    *       advertiserId: '[^/]+',
    *       // Allows filtering by assigned targeting option properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR`.. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `EQUALS (=)`. * Supported fields: - `targetingType` Examples: * targetingType with value TARGETING_TYPE_CHANNEL `targetingType="TARGETING_TYPE_CHANNEL"` The length of this field should be no more than 500 characters.
    *       filter: 'placeholder-value',
    *       // Field by which to sort the list. Acceptable values are: * `targetingType` (default) The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `targetingType desc`.
    *       orderBy: 'placeholder-value',
    *       // Requested page size. The size must be an integer between `1` and `5000`. If unspecified, the default is '5000'. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *       pageSize: 'placeholder-value',
    *       // A token that lets the client fetch the next page of results. Typically, this is the value of next_page_token returned from the previous call to `BulkListAdvertiserAssignedTargetingOptions` method. If not specified, the first page of results will be returned.
    *       pageToken: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignedTargetingOptions": [],
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
  def bulkListAdvertiserAssignedTargetingOptions(
    params: ParamsResourceAdvertisersBulklistadvertiserassignedtargetingoptions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def bulkListAdvertiserAssignedTargetingOptions(
    params: ParamsResourceAdvertisersBulklistadvertiserassignedtargetingoptions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var campaigns: ResourceAdvertisersCampaigns = js.native
  
  var channels: ResourceAdvertisersChannels = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAdvertiser] = js.native
  def create(callback: BodyResponseCallback[SchemaAdvertiser]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdvertiser] = js.native
  def create(params: ParamsResourceAdvertisersCreate): GaxiosPromise[SchemaAdvertiser] = js.native
  def create(params: ParamsResourceAdvertisersCreate, callback: BodyResponseCallback[SchemaAdvertiser]): Unit = js.native
  def create(
    params: ParamsResourceAdvertisersCreate,
    options: BodyResponseCallback[Readable | SchemaAdvertiser],
    callback: BodyResponseCallback[Readable | SchemaAdvertiser]
  ): Unit = js.native
  def create(params: ParamsResourceAdvertisersCreate, options: MethodOptions): GaxiosPromise[SchemaAdvertiser] = js.native
  def create(
    params: ParamsResourceAdvertisersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiser]
  ): Unit = js.native
  /**
    * Creates a new advertiser. Returns the newly created advertiser if successful. This method can take up to 180 seconds to complete.
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
    *   const res = await displayvideo.advertisers.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "adServerConfig": {},
    *       //   "advertiserId": "my_advertiserId",
    *       //   "creativeConfig": {},
    *       //   "dataAccessConfig": {},
    *       //   "displayName": "my_displayName",
    *       //   "entityStatus": "my_entityStatus",
    *       //   "generalConfig": {},
    *       //   "integrationDetails": {},
    *       //   "name": "my_name",
    *       //   "partnerId": "my_partnerId",
    *       //   "prismaEnabled": false,
    *       //   "servingConfig": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adServerConfig": {},
    *   //   "advertiserId": "my_advertiserId",
    *   //   "creativeConfig": {},
    *   //   "dataAccessConfig": {},
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "generalConfig": {},
    *   //   "integrationDetails": {},
    *   //   "name": "my_name",
    *   //   "partnerId": "my_partnerId",
    *   //   "prismaEnabled": false,
    *   //   "servingConfig": {},
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
  def create(params: ParamsResourceAdvertisersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAdvertisersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var creatives: ResourceAdvertisersCreatives = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdvertisersDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdvertisersDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceAdvertisersDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAdvertisersDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdvertisersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an advertiser. Deleting an advertiser will delete all of its child resources, for example, campaigns, insertion orders and line items. A deleted advertiser cannot be recovered.
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
    *   const res = await displayvideo.advertisers.delete({
    *     // The ID of the advertiser we need to delete.
    *     advertiserId: '[^/]+',
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
  def delete(params: ParamsResourceAdvertisersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAdvertisersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAdvertiser] = js.native
  def get(callback: BodyResponseCallback[SchemaAdvertiser]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdvertiser] = js.native
  def get(params: ParamsResourceAdvertisersGet): GaxiosPromise[SchemaAdvertiser] = js.native
  def get(params: ParamsResourceAdvertisersGet, callback: BodyResponseCallback[SchemaAdvertiser]): Unit = js.native
  def get(
    params: ParamsResourceAdvertisersGet,
    options: BodyResponseCallback[Readable | SchemaAdvertiser],
    callback: BodyResponseCallback[Readable | SchemaAdvertiser]
  ): Unit = js.native
  def get(params: ParamsResourceAdvertisersGet, options: MethodOptions): GaxiosPromise[SchemaAdvertiser] = js.native
  def get(
    params: ParamsResourceAdvertisersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiser]
  ): Unit = js.native
  /**
    * Gets an advertiser.
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
    *   const res = await displayvideo.advertisers.get({
    *     // Required. The ID of the advertiser to fetch.
    *     advertiserId: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adServerConfig": {},
    *   //   "advertiserId": "my_advertiserId",
    *   //   "creativeConfig": {},
    *   //   "dataAccessConfig": {},
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "generalConfig": {},
    *   //   "integrationDetails": {},
    *   //   "name": "my_name",
    *   //   "partnerId": "my_partnerId",
    *   //   "prismaEnabled": false,
    *   //   "servingConfig": {},
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
  def get(params: ParamsResourceAdvertisersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdvertisersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var insertionOrders: ResourceAdvertisersInsertionorders = js.native
  
  var invoices: ResourceAdvertisersInvoices = js.native
  
  var lineItems: ResourceAdvertisersLineitems = js.native
  
  def list(): GaxiosPromise[SchemaListAdvertisersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAdvertisersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAdvertisersResponse] = js.native
  def list(params: ParamsResourceAdvertisersList): GaxiosPromise[SchemaListAdvertisersResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersList,
    callback: BodyResponseCallback[SchemaListAdvertisersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersList,
    options: BodyResponseCallback[Readable | SchemaListAdvertisersResponse],
    callback: BodyResponseCallback[Readable | SchemaListAdvertisersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertisersList, options: MethodOptions): GaxiosPromise[SchemaListAdvertisersResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAdvertisersResponse]
  ): Unit = js.native
  /**
    * Lists advertisers that are accessible to the current user. The order is defined by the order_by parameter. A single partner_id is required. Cross-partner listing is not supported.
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
    *   const res = await displayvideo.advertisers.list({
    *     // Allows filtering by advertiser properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator used on `updateTime` must be `GREATER THAN OR EQUAL TO (\>=)` or `LESS THAN OR EQUAL TO (<=)`. * The operator must be `EQUALS (=)`. * Supported fields: - `advertiserId` - `displayName` - `entityStatus` - `updateTime` (input in ISO 8601 format, or YYYY-MM-DDTHH:MM:SSZ) Examples: * All active advertisers under a partner: `entityStatus="ENTITY_STATUS_ACTIVE"` * All advertisers with an update time less than or equal to `2020-11-04T18:54:47Z (format of ISO 8601)`: `updateTime<="2020-11-04T18:54:47Z"` * All advertisers with an update time greater than or equal to `2020-11-04T18:54:47Z (format of ISO 8601)`: `updateTime\>="2020-11-04T18:54:47Z"` The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `displayName` (default) * `entityStatus` * `updateTime` The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. For example, `displayName desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListAdvertisers` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *     // Required. The ID of the partner that the fetched advertisers should all belong to. The system only supports listing advertisers for one partner at a time.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertisers": [],
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
  def list(params: ParamsResourceAdvertisersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertisersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var locationLists: ResourceAdvertisersLocationlists = js.native
  
  var manualTriggers: ResourceAdvertisersManualtriggers = js.native
  
  var negativeKeywordLists: ResourceAdvertisersNegativekeywordlists = js.native
  
  def patch(): GaxiosPromise[SchemaAdvertiser] = js.native
  def patch(callback: BodyResponseCallback[SchemaAdvertiser]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdvertiser] = js.native
  def patch(params: ParamsResourceAdvertisersPatch): GaxiosPromise[SchemaAdvertiser] = js.native
  def patch(params: ParamsResourceAdvertisersPatch, callback: BodyResponseCallback[SchemaAdvertiser]): Unit = js.native
  def patch(
    params: ParamsResourceAdvertisersPatch,
    options: BodyResponseCallback[Readable | SchemaAdvertiser],
    callback: BodyResponseCallback[Readable | SchemaAdvertiser]
  ): Unit = js.native
  def patch(params: ParamsResourceAdvertisersPatch, options: MethodOptions): GaxiosPromise[SchemaAdvertiser] = js.native
  def patch(
    params: ParamsResourceAdvertisersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiser]
  ): Unit = js.native
  /**
    * Updates an existing advertiser. Returns the updated advertiser if successful.
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
    *   const res = await displayvideo.advertisers.patch({
    *     // Output only. The unique ID of the advertiser. Assigned by the system.
    *     advertiserId: '[^/]+',
    *     // Required. The mask to control which fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "adServerConfig": {},
    *       //   "advertiserId": "my_advertiserId",
    *       //   "creativeConfig": {},
    *       //   "dataAccessConfig": {},
    *       //   "displayName": "my_displayName",
    *       //   "entityStatus": "my_entityStatus",
    *       //   "generalConfig": {},
    *       //   "integrationDetails": {},
    *       //   "name": "my_name",
    *       //   "partnerId": "my_partnerId",
    *       //   "prismaEnabled": false,
    *       //   "servingConfig": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adServerConfig": {},
    *   //   "advertiserId": "my_advertiserId",
    *   //   "creativeConfig": {},
    *   //   "dataAccessConfig": {},
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "generalConfig": {},
    *   //   "integrationDetails": {},
    *   //   "name": "my_name",
    *   //   "partnerId": "my_partnerId",
    *   //   "prismaEnabled": false,
    *   //   "servingConfig": {},
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
  def patch(params: ParamsResourceAdvertisersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAdvertisersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var targetingTypes: ResourceAdvertisersTargetingtypes = js.native
}
