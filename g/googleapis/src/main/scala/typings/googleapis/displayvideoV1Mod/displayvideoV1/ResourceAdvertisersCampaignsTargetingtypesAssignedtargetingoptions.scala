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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Advertisers$Campaigns$Targetingtypes$Assignedtargetingoptions")
@js.native
open class ResourceAdvertisersCampaignsTargetingtypesAssignedtargetingoptions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaAssignedTargetingOption] = js.native
  def get(callback: BodyResponseCallback[SchemaAssignedTargetingOption]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAssignedTargetingOption] = js.native
  def get(params: ParamsResourceAdvertisersCampaignsTargetingtypesAssignedtargetingoptionsGet): GaxiosPromise[SchemaAssignedTargetingOption] = js.native
  def get(
    params: ParamsResourceAdvertisersCampaignsTargetingtypesAssignedtargetingoptionsGet,
    callback: BodyResponseCallback[SchemaAssignedTargetingOption]
  ): Unit = js.native
  def get(
    params: ParamsResourceAdvertisersCampaignsTargetingtypesAssignedtargetingoptionsGet,
    options: BodyResponseCallback[Readable | SchemaAssignedTargetingOption],
    callback: BodyResponseCallback[Readable | SchemaAssignedTargetingOption]
  ): Unit = js.native
  def get(
    params: ParamsResourceAdvertisersCampaignsTargetingtypesAssignedtargetingoptionsGet,
    options: MethodOptions
  ): GaxiosPromise[SchemaAssignedTargetingOption] = js.native
  def get(
    params: ParamsResourceAdvertisersCampaignsTargetingtypesAssignedtargetingoptionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAssignedTargetingOption]
  ): Unit = js.native
  /**
    * Gets a single targeting option assigned to a campaign.
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
    *     await displayvideo.advertisers.campaigns.targetingTypes.assignedTargetingOptions.get(
    *       {
    *         // Required. The ID of the advertiser the campaign belongs to.
    *         advertiserId: '[^/]+',
    *         // Required. An identifier unique to the targeting type in this campaign that identifies the assigned targeting option being requested.
    *         assignedTargetingOptionId: '[^/]+',
    *         // Required. The ID of the campaign the assigned targeting option belongs to.
    *         campaignId: '[^/]+',
    *         // Required. Identifies the type of this assigned targeting option. Supported targeting types: * `TARGETING_TYPE_AGE_RANGE` * `TARGETING_TYPE_AUTHORIZED_SELLER_STATUS` * `TARGETING_TYPE_CONTENT_INSTREAM_POSITION` * `TARGETING_TYPE_CONTENT_OUTSTREAM_POSITION` * `TARGETING_TYPE_DIGITAL_CONTENT_LABEL_EXCLUSION` * `TARGETING_TYPE_ENVIRONMENT` * `TARGETING_TYPE_EXCHANGE` * `TARGETING_TYPE_GENDER` * `TARGETING_TYPE_GEO_REGION` * `TARGETING_TYPE_HOUSEHOLD_INCOME` * `TARGETING_TYPE_INVENTORY_SOURCE` * `TARGETING_TYPE_INVENTORY_SOURCE_GROUP` * `TARGETING_TYPE_LANGUAGE` * `TARGETING_TYPE_ON_SCREEN_POSITION` * `TARGETING_TYPE_PARENTAL_STATUS` * `TARGETING_TYPE_SENSITIVE_CATEGORY_EXCLUSION` * `TARGETING_TYPE_SUB_EXCHANGE` * `TARGETING_TYPE_THIRD_PARTY_VERIFIER` * `TARGETING_TYPE_VIEWABILITY`
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
    params: ParamsResourceAdvertisersCampaignsTargetingtypesAssignedtargetingoptionsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdvertisersCampaignsTargetingtypesAssignedtargetingoptionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCampaignAssignedTargetingOptionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCampaignAssignedTargetingOptionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCampaignAssignedTargetingOptionsResponse] = js.native
  def list(params: ParamsResourceAdvertisersCampaignsTargetingtypesAssignedtargetingoptionsList): GaxiosPromise[SchemaListCampaignAssignedTargetingOptionsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersCampaignsTargetingtypesAssignedtargetingoptionsList,
    callback: BodyResponseCallback[SchemaListCampaignAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersCampaignsTargetingtypesAssignedtargetingoptionsList,
    options: BodyResponseCallback[Readable | SchemaListCampaignAssignedTargetingOptionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListCampaignAssignedTargetingOptionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersCampaignsTargetingtypesAssignedtargetingoptionsList,
    options: MethodOptions
  ): GaxiosPromise[SchemaListCampaignAssignedTargetingOptionsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersCampaignsTargetingtypesAssignedtargetingoptionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCampaignAssignedTargetingOptionsResponse]
  ): Unit = js.native
  /**
    * Lists the targeting options assigned to a campaign for a specified targeting type.
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
    *     await displayvideo.advertisers.campaigns.targetingTypes.assignedTargetingOptions.list(
    *       {
    *         // Required. The ID of the advertiser the campaign belongs to.
    *         advertiserId: '[^/]+',
    *         // Required. The ID of the campaign to list assigned targeting options for.
    *         campaignId: '[^/]+',
    *         // Allows filtering by assigned targeting option properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR`. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `EQUALS (=)`. * Supported fields: - `assignedTargetingOptionId` - `inheritance` Examples: * AssignedTargetingOptions with ID 1 or 2 `assignedTargetingOptionId="1" OR assignedTargetingOptionId="2"` * AssignedTargetingOptions with inheritance status of NOT_INHERITED or INHERITED_FROM_PARTNER `inheritance="NOT_INHERITED" OR inheritance="INHERITED_FROM_PARTNER"` The length of this field should be no more than 500 characters.
    *         filter: 'placeholder-value',
    *         // Field by which to sort the list. Acceptable values are: * `assignedTargetingOptionId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `assignedTargetingOptionId desc`.
    *         orderBy: 'placeholder-value',
    *         // Requested page size. Must be between `1` and `5000`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *         pageSize: 'placeholder-value',
    *         // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListCampaignAssignedTargetingOptions` method. If not specified, the first page of results will be returned.
    *         pageToken: 'placeholder-value',
    *         // Required. Identifies the type of assigned targeting options to list. Supported targeting types: * `TARGETING_TYPE_AGE_RANGE` * `TARGETING_TYPE_AUTHORIZED_SELLER_STATUS` * `TARGETING_TYPE_CONTENT_INSTREAM_POSITION` * `TARGETING_TYPE_CONTENT_OUTSTREAM_POSITION` * `TARGETING_TYPE_DIGITAL_CONTENT_LABEL_EXCLUSION` * `TARGETING_TYPE_ENVIRONMENT` * `TARGETING_TYPE_EXCHANGE` * `TARGETING_TYPE_GENDER` * `TARGETING_TYPE_GEO_REGION` * `TARGETING_TYPE_HOUSEHOLD_INCOME` * `TARGETING_TYPE_INVENTORY_SOURCE` * `TARGETING_TYPE_INVENTORY_SOURCE_GROUP` * `TARGETING_TYPE_LANGUAGE` * `TARGETING_TYPE_ON_SCREEN_POSITION` * `TARGETING_TYPE_PARENTAL_STATUS` * `TARGETING_TYPE_SENSITIVE_CATEGORY_EXCLUSION` * `TARGETING_TYPE_SUB_EXCHANGE` * `TARGETING_TYPE_THIRD_PARTY_VERIFIER` * `TARGETING_TYPE_VIEWABILITY`
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
    params: ParamsResourceAdvertisersCampaignsTargetingtypesAssignedtargetingoptionsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertisersCampaignsTargetingtypesAssignedtargetingoptionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
