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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Advertisers$Lineitems$Targetingtypes$Assignedtargetingoptions")
@js.native
open class ResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAssignedTargetingOption] = js.native
  def create(callback: BodyResponseCallback[SchemaAssignedTargetingOption]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAssignedTargetingOption] = js.native
  def create(params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsCreate): GaxiosPromise[SchemaAssignedTargetingOption] = js.native
  def create(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsCreate,
    callback: BodyResponseCallback[SchemaAssignedTargetingOption]
  ): Unit = js.native
  def create(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsCreate,
    options: BodyResponseCallback[Readable | SchemaAssignedTargetingOption],
    callback: BodyResponseCallback[Readable | SchemaAssignedTargetingOption]
  ): Unit = js.native
  def create(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaAssignedTargetingOption] = js.native
  def create(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAssignedTargetingOption]
  ): Unit = js.native
  /**
    * Assigns a targeting option to a line item. Returns the assigned targeting option if successful. Requests to this endpoint cannot be made concurrently with the following requests updating the same line item: * BulkEditLineItemAssignedTargetingOptions * UpdateLineItem * CreateLineItemAssignedTargetingOption * DeleteLineItemAssignedTargetingOption
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
    *     await displayvideo.advertisers.lineItems.targetingTypes.assignedTargetingOptions.create(
    *       {
    *         // Required. The ID of the advertiser the line item belongs to.
    *         advertiserId: '[^/]+',
    *         // Required. The ID of the line item the assigned targeting option will belong to.
    *         lineItemId: '[^/]+',
    *         // Required. Identifies the type of this assigned targeting option.
    *         targetingType: '[^/]+',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "ageRangeDetails": {},
    *           //   "appCategoryDetails": {},
    *           //   "appDetails": {},
    *           //   "assignedTargetingOptionId": "my_assignedTargetingOptionId",
    *           //   "audienceGroupDetails": {},
    *           //   "audioContentTypeDetails": {},
    *           //   "authorizedSellerStatusDetails": {},
    *           //   "browserDetails": {},
    *           //   "businessChainDetails": {},
    *           //   "carrierAndIspDetails": {},
    *           //   "categoryDetails": {},
    *           //   "channelDetails": {},
    *           //   "contentDurationDetails": {},
    *           //   "contentGenreDetails": {},
    *           //   "contentInstreamPositionDetails": {},
    *           //   "contentOutstreamPositionDetails": {},
    *           //   "contentStreamTypeDetails": {},
    *           //   "dayAndTimeDetails": {},
    *           //   "deviceMakeModelDetails": {},
    *           //   "deviceTypeDetails": {},
    *           //   "digitalContentLabelExclusionDetails": {},
    *           //   "environmentDetails": {},
    *           //   "exchangeDetails": {},
    *           //   "genderDetails": {},
    *           //   "geoRegionDetails": {},
    *           //   "householdIncomeDetails": {},
    *           //   "inheritance": "my_inheritance",
    *           //   "inventorySourceDetails": {},
    *           //   "inventorySourceGroupDetails": {},
    *           //   "keywordDetails": {},
    *           //   "languageDetails": {},
    *           //   "name": "my_name",
    *           //   "nativeContentPositionDetails": {},
    *           //   "negativeKeywordListDetails": {},
    *           //   "omidDetails": {},
    *           //   "onScreenPositionDetails": {},
    *           //   "operatingSystemDetails": {},
    *           //   "parentalStatusDetails": {},
    *           //   "poiDetails": {},
    *           //   "proximityLocationListDetails": {},
    *           //   "regionalLocationListDetails": {},
    *           //   "sensitiveCategoryExclusionDetails": {},
    *           //   "subExchangeDetails": {},
    *           //   "targetingType": "my_targetingType",
    *           //   "thirdPartyVerifierDetails": {},
    *           //   "urlDetails": {},
    *           //   "userRewardedContentDetails": {},
    *           //   "videoPlayerSizeDetails": {},
    *           //   "viewabilityDetails": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ageRangeDetails": {},
    *   //   "appCategoryDetails": {},
    *   //   "appDetails": {},
    *   //   "assignedTargetingOptionId": "my_assignedTargetingOptionId",
    *   //   "audienceGroupDetails": {},
    *   //   "audioContentTypeDetails": {},
    *   //   "authorizedSellerStatusDetails": {},
    *   //   "browserDetails": {},
    *   //   "businessChainDetails": {},
    *   //   "carrierAndIspDetails": {},
    *   //   "categoryDetails": {},
    *   //   "channelDetails": {},
    *   //   "contentDurationDetails": {},
    *   //   "contentGenreDetails": {},
    *   //   "contentInstreamPositionDetails": {},
    *   //   "contentOutstreamPositionDetails": {},
    *   //   "contentStreamTypeDetails": {},
    *   //   "dayAndTimeDetails": {},
    *   //   "deviceMakeModelDetails": {},
    *   //   "deviceTypeDetails": {},
    *   //   "digitalContentLabelExclusionDetails": {},
    *   //   "environmentDetails": {},
    *   //   "exchangeDetails": {},
    *   //   "genderDetails": {},
    *   //   "geoRegionDetails": {},
    *   //   "householdIncomeDetails": {},
    *   //   "inheritance": "my_inheritance",
    *   //   "inventorySourceDetails": {},
    *   //   "inventorySourceGroupDetails": {},
    *   //   "keywordDetails": {},
    *   //   "languageDetails": {},
    *   //   "name": "my_name",
    *   //   "nativeContentPositionDetails": {},
    *   //   "negativeKeywordListDetails": {},
    *   //   "omidDetails": {},
    *   //   "onScreenPositionDetails": {},
    *   //   "operatingSystemDetails": {},
    *   //   "parentalStatusDetails": {},
    *   //   "poiDetails": {},
    *   //   "proximityLocationListDetails": {},
    *   //   "regionalLocationListDetails": {},
    *   //   "sensitiveCategoryExclusionDetails": {},
    *   //   "subExchangeDetails": {},
    *   //   "targetingType": "my_targetingType",
    *   //   "thirdPartyVerifierDetails": {},
    *   //   "urlDetails": {},
    *   //   "userRewardedContentDetails": {},
    *   //   "videoPlayerSizeDetails": {},
    *   //   "viewabilityDetails": {}
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
  def create(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an assigned targeting option from a line item. Requests to this endpoint cannot be made concurrently with the following requests updating the same line item: * BulkEditLineItemAssignedTargetingOptions * UpdateLineItem * CreateLineItemAssignedTargetingOption * DeleteLineItemAssignedTargetingOption
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
    *     await displayvideo.advertisers.lineItems.targetingTypes.assignedTargetingOptions.delete(
    *       {
    *         // Required. The ID of the advertiser the line item belongs to.
    *         advertiserId: '[^/]+',
    *         // Required. The ID of the assigned targeting option to delete.
    *         assignedTargetingOptionId: '[^/]+',
    *         // Required. The ID of the line item the assigned targeting option belongs to.
    *         lineItemId: '[^/]+',
    *         // Required. Identifies the type of this assigned targeting option.
    *         targetingType: '[^/]+',
    *       }
    *     );
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
  def delete(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAssignedTargetingOption] = js.native
  def get(callback: BodyResponseCallback[SchemaAssignedTargetingOption]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAssignedTargetingOption] = js.native
  def get(params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsGet): GaxiosPromise[SchemaAssignedTargetingOption] = js.native
  def get(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsGet,
    callback: BodyResponseCallback[SchemaAssignedTargetingOption]
  ): Unit = js.native
  def get(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsGet,
    options: BodyResponseCallback[Readable | SchemaAssignedTargetingOption],
    callback: BodyResponseCallback[Readable | SchemaAssignedTargetingOption]
  ): Unit = js.native
  def get(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsGet,
    options: MethodOptions
  ): GaxiosPromise[SchemaAssignedTargetingOption] = js.native
  def get(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAssignedTargetingOption]
  ): Unit = js.native
  /**
    * Gets a single targeting option assigned to a line item.
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
    *     await displayvideo.advertisers.lineItems.targetingTypes.assignedTargetingOptions.get(
    *       {
    *         // Required. The ID of the advertiser the line item belongs to.
    *         advertiserId: '[^/]+',
    *         // Required. An identifier unique to the targeting type in this line item that identifies the assigned targeting option being requested.
    *         assignedTargetingOptionId: '[^/]+',
    *         // Required. The ID of the line item the assigned targeting option belongs to.
    *         lineItemId: '[^/]+',
    *         // Required. Identifies the type of this assigned targeting option.
    *         targetingType: '[^/]+',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ageRangeDetails": {},
    *   //   "appCategoryDetails": {},
    *   //   "appDetails": {},
    *   //   "assignedTargetingOptionId": "my_assignedTargetingOptionId",
    *   //   "audienceGroupDetails": {},
    *   //   "audioContentTypeDetails": {},
    *   //   "authorizedSellerStatusDetails": {},
    *   //   "browserDetails": {},
    *   //   "businessChainDetails": {},
    *   //   "carrierAndIspDetails": {},
    *   //   "categoryDetails": {},
    *   //   "channelDetails": {},
    *   //   "contentDurationDetails": {},
    *   //   "contentGenreDetails": {},
    *   //   "contentInstreamPositionDetails": {},
    *   //   "contentOutstreamPositionDetails": {},
    *   //   "contentStreamTypeDetails": {},
    *   //   "dayAndTimeDetails": {},
    *   //   "deviceMakeModelDetails": {},
    *   //   "deviceTypeDetails": {},
    *   //   "digitalContentLabelExclusionDetails": {},
    *   //   "environmentDetails": {},
    *   //   "exchangeDetails": {},
    *   //   "genderDetails": {},
    *   //   "geoRegionDetails": {},
    *   //   "householdIncomeDetails": {},
    *   //   "inheritance": "my_inheritance",
    *   //   "inventorySourceDetails": {},
    *   //   "inventorySourceGroupDetails": {},
    *   //   "keywordDetails": {},
    *   //   "languageDetails": {},
    *   //   "name": "my_name",
    *   //   "nativeContentPositionDetails": {},
    *   //   "negativeKeywordListDetails": {},
    *   //   "omidDetails": {},
    *   //   "onScreenPositionDetails": {},
    *   //   "operatingSystemDetails": {},
    *   //   "parentalStatusDetails": {},
    *   //   "poiDetails": {},
    *   //   "proximityLocationListDetails": {},
    *   //   "regionalLocationListDetails": {},
    *   //   "sensitiveCategoryExclusionDetails": {},
    *   //   "subExchangeDetails": {},
    *   //   "targetingType": "my_targetingType",
    *   //   "thirdPartyVerifierDetails": {},
    *   //   "urlDetails": {},
    *   //   "userRewardedContentDetails": {},
    *   //   "videoPlayerSizeDetails": {},
    *   //   "viewabilityDetails": {}
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
  def get(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListLineItemAssignedTargetingOptionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLineItemAssignedTargetingOptionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListLineItemAssignedTargetingOptionsResponse] = js.native
  def list(params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsList): GaxiosPromise[SchemaListLineItemAssignedTargetingOptionsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsList,
    callback: BodyResponseCallback[SchemaListLineItemAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsList,
    options: BodyResponseCallback[Readable | SchemaListLineItemAssignedTargetingOptionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListLineItemAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsList,
    options: MethodOptions
  ): GaxiosPromise[SchemaListLineItemAssignedTargetingOptionsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLineItemAssignedTargetingOptionsResponse]
  ): Unit = js.native
  /**
    * Lists the targeting options assigned to a line item.
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
    *     await displayvideo.advertisers.lineItems.targetingTypes.assignedTargetingOptions.list(
    *       {
    *         // Required. The ID of the advertiser the line item belongs to.
    *         advertiserId: '[^/]+',
    *         // Allows filtering by assigned targeting option properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR`. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `EQUALS (=)`. * Supported fields: - `assignedTargetingOptionId` - `inheritance` Examples: * AssignedTargetingOptions with ID 1 or 2 `assignedTargetingOptionId="1" OR assignedTargetingOptionId="2"` * AssignedTargetingOptions with inheritance status of NOT_INHERITED or INHERITED_FROM_PARTNER `inheritance="NOT_INHERITED" OR inheritance="INHERITED_FROM_PARTNER"` The length of this field should be no more than 500 characters.
    *         filter: 'placeholder-value',
    *         // Required. The ID of the line item to list assigned targeting options for.
    *         lineItemId: '[^/]+',
    *         // Field by which to sort the list. Acceptable values are: * `assignedTargetingOptionId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `assignedTargetingOptionId desc`.
    *         orderBy: 'placeholder-value',
    *         // Requested page size. Must be between `1` and `5000`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *         pageSize: 'placeholder-value',
    *         // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListLineItemAssignedTargetingOptions` method. If not specified, the first page of results will be returned.
    *         pageToken: 'placeholder-value',
    *         // Required. Identifies the type of assigned targeting options to list.
    *         targetingType: '[^/]+',
    *       }
    *     );
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
  def list(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertisersLineitemsTargetingtypesAssignedtargetingoptionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
