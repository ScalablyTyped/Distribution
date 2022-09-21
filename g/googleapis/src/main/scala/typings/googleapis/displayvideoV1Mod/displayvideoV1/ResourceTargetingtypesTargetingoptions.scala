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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Targetingtypes$Targetingoptions")
@js.native
open class ResourceTargetingtypesTargetingoptions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaTargetingOption] = js.native
  def get(callback: BodyResponseCallback[SchemaTargetingOption]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTargetingOption] = js.native
  def get(params: ParamsResourceTargetingtypesTargetingoptionsGet): GaxiosPromise[SchemaTargetingOption] = js.native
  def get(
    params: ParamsResourceTargetingtypesTargetingoptionsGet,
    callback: BodyResponseCallback[SchemaTargetingOption]
  ): Unit = js.native
  def get(
    params: ParamsResourceTargetingtypesTargetingoptionsGet,
    options: BodyResponseCallback[Readable | SchemaTargetingOption],
    callback: BodyResponseCallback[Readable | SchemaTargetingOption]
  ): Unit = js.native
  def get(params: ParamsResourceTargetingtypesTargetingoptionsGet, options: MethodOptions): GaxiosPromise[SchemaTargetingOption] = js.native
  def get(
    params: ParamsResourceTargetingtypesTargetingoptionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetingOption]
  ): Unit = js.native
  /**
    * Gets a single targeting option.
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
    *   const res = await displayvideo.targetingTypes.targetingOptions.get({
    *     // Required. The Advertiser this request is being made in the context of.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the of targeting option to retrieve.
    *     targetingOptionId: '[^/]+',
    *     // Required. The type of targeting option to retrieve. Accepted values are: * `TARGETING_TYPE_APP_CATEGORY` * `TARGETING_TYPE_AGE_RANGE` * `TARGETING_TYPE_GENDER` * `TARGETING_TYPE_VIDEO_PLAYER_SIZE` * `TARGETING_TYPE_USER_REWARDED_CONTENT` * `TARGETING_TYPE_PARENTAL_STATUS` * `TARGETING_TYPE_CONTENT_INSTREAM_POSITION` * `TARGETING_TYPE_CONTENT_OUTSTREAM_POSITION` * `TARGETING_TYPE_DEVICE_TYPE` * `TARGETING_TYPE_BROWSER` * `TARGETING_TYPE_HOUSEHOLD_INCOME` * `TARGETING_TYPE_ON_SCREEN_POSITION` * `TARGETING_TYPE_CARRIER_AND_ISP` * `TARGETING_TYPE_OPERATING_SYSTEM` * `TARGETING_TYPE_DEVICE_MAKE_MODEL` * `TARGETING_TYPE_ENVIRONMENT` * `TARGETING_TYPE_CATEGORY` * `TARGETING_TYPE_VIEWABILITY` * `TARGETING_TYPE_AUTHORIZED_SELLER_STATUS` * `TARGETING_TYPE_LANGUAGE` * `TARGETING_TYPE_GEO_REGION` * `TARGETING_TYPE_DIGITAL_CONTENT_LABEL_EXCLUSION` * `TARGETING_TYPE_SENSITIVE_CATEGORY_EXCLUSION` * `TARGETING_TYPE_EXCHANGE` * `TARGETING_TYPE_SUB_EXCHANGE` * `TARGETING_TYPE_NATIVE_CONTENT_POSITION` * `TARGETING_TYPE_OMID`
    *     targetingType: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ageRangeDetails": {},
    *   //   "appCategoryDetails": {},
    *   //   "audioContentTypeDetails": {},
    *   //   "authorizedSellerStatusDetails": {},
    *   //   "browserDetails": {},
    *   //   "businessChainDetails": {},
    *   //   "carrierAndIspDetails": {},
    *   //   "categoryDetails": {},
    *   //   "contentDurationDetails": {},
    *   //   "contentGenreDetails": {},
    *   //   "contentInstreamPositionDetails": {},
    *   //   "contentOutstreamPositionDetails": {},
    *   //   "contentStreamTypeDetails": {},
    *   //   "deviceMakeModelDetails": {},
    *   //   "deviceTypeDetails": {},
    *   //   "digitalContentLabelDetails": {},
    *   //   "environmentDetails": {},
    *   //   "exchangeDetails": {},
    *   //   "genderDetails": {},
    *   //   "geoRegionDetails": {},
    *   //   "householdIncomeDetails": {},
    *   //   "languageDetails": {},
    *   //   "name": "my_name",
    *   //   "nativeContentPositionDetails": {},
    *   //   "omidDetails": {},
    *   //   "onScreenPositionDetails": {},
    *   //   "operatingSystemDetails": {},
    *   //   "parentalStatusDetails": {},
    *   //   "poiDetails": {},
    *   //   "sensitiveCategoryDetails": {},
    *   //   "subExchangeDetails": {},
    *   //   "targetingOptionId": "my_targetingOptionId",
    *   //   "targetingType": "my_targetingType",
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
  def get(params: ParamsResourceTargetingtypesTargetingoptionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceTargetingtypesTargetingoptionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTargetingOptionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTargetingOptionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTargetingOptionsResponse] = js.native
  def list(params: ParamsResourceTargetingtypesTargetingoptionsList): GaxiosPromise[SchemaListTargetingOptionsResponse] = js.native
  def list(
    params: ParamsResourceTargetingtypesTargetingoptionsList,
    callback: BodyResponseCallback[SchemaListTargetingOptionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceTargetingtypesTargetingoptionsList,
    options: BodyResponseCallback[Readable | SchemaListTargetingOptionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListTargetingOptionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTargetingtypesTargetingoptionsList, options: MethodOptions): GaxiosPromise[SchemaListTargetingOptionsResponse] = js.native
  def list(
    params: ParamsResourceTargetingtypesTargetingoptionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTargetingOptionsResponse]
  ): Unit = js.native
  /**
    * Lists targeting options of a given type.
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
    *   const res = await displayvideo.targetingTypes.targetingOptions.list({
    *     // Required. The Advertiser this request is being made in the context of.
    *     advertiserId: 'placeholder-value',
    *     // Allows filtering by targeting option properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `OR` logical operators. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be "=" (equal sign). * Supported fields: - `carrierAndIspDetails.type` - `geoRegionDetails.geoRegionType` - `targetingOptionId` Examples: * All `GEO REGION` targeting options that belong to sub type `GEO_REGION_TYPE_COUNTRY` or `GEO_REGION_TYPE_STATE`: `geoRegionDetails.geoRegionType="GEO_REGION_TYPE_COUNTRY" OR geoRegionDetails.geoRegionType="GEO_REGION_TYPE_STATE"` * All `CARRIER AND ISP` targeting options that belong to sub type `CARRIER_AND_ISP_TYPE_CARRIER`: `carrierAndIspDetails.type="CARRIER_AND_ISP_TYPE_CARRIER"`. The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `targetingOptionId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `targetingOptionId desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListTargetingOptions` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *     // Required. The type of targeting option to be listed. Accepted values are: * `TARGETING_TYPE_APP_CATEGORY` * `TARGETING_TYPE_AGE_RANGE` * `TARGETING_TYPE_GENDER` * `TARGETING_TYPE_VIDEO_PLAYER_SIZE` * `TARGETING_TYPE_USER_REWARDED_CONTENT` * `TARGETING_TYPE_PARENTAL_STATUS` * `TARGETING_TYPE_CONTENT_INSTREAM_POSITION` * `TARGETING_TYPE_CONTENT_OUTSTREAM_POSITION` * `TARGETING_TYPE_DEVICE_TYPE` * `TARGETING_TYPE_BROWSER` * `TARGETING_TYPE_HOUSEHOLD_INCOME` * `TARGETING_TYPE_ON_SCREEN_POSITION` * `TARGETING_TYPE_CARRIER_AND_ISP` * `TARGETING_TYPE_OPERATING_SYSTEM` * `TARGETING_TYPE_DEVICE_MAKE_MODEL` * `TARGETING_TYPE_ENVIRONMENT` * `TARGETING_TYPE_CATEGORY` * `TARGETING_TYPE_VIEWABILITY` * `TARGETING_TYPE_AUTHORIZED_SELLER_STATUS` * `TARGETING_TYPE_LANGUAGE` * `TARGETING_TYPE_GEO_REGION` * `TARGETING_TYPE_DIGITAL_CONTENT_LABEL_EXCLUSION` * `TARGETING_TYPE_SENSITIVE_CATEGORY_EXCLUSION` * `TARGETING_TYPE_EXCHANGE` * `TARGETING_TYPE_SUB_EXCHANGE` * `TARGETING_TYPE_NATIVE_CONTENT_POSITION` * `TARGETING_TYPE_OMID`
    *     targetingType: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "targetingOptions": []
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
  def list(params: ParamsResourceTargetingtypesTargetingoptionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceTargetingtypesTargetingoptionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def search(): GaxiosPromise[SchemaSearchTargetingOptionsResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchTargetingOptionsResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchTargetingOptionsResponse] = js.native
  def search(params: ParamsResourceTargetingtypesTargetingoptionsSearch): GaxiosPromise[SchemaSearchTargetingOptionsResponse] = js.native
  def search(
    params: ParamsResourceTargetingtypesTargetingoptionsSearch,
    callback: BodyResponseCallback[SchemaSearchTargetingOptionsResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceTargetingtypesTargetingoptionsSearch,
    options: BodyResponseCallback[Readable | SchemaSearchTargetingOptionsResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchTargetingOptionsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceTargetingtypesTargetingoptionsSearch, options: MethodOptions): GaxiosPromise[SchemaSearchTargetingOptionsResponse] = js.native
  def search(
    params: ParamsResourceTargetingtypesTargetingoptionsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchTargetingOptionsResponse]
  ): Unit = js.native
  /**
    * Searches for targeting options of a given type based on the given search terms.
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
    *   const res = await displayvideo.targetingTypes.targetingOptions.search({
    *     // Required. The type of targeting options to retrieve. Accepted values are: * `TARGETING_TYPE_GEO_REGION` * `TARGETING_TYPE_POI` * `TARGETING_TYPE_BUSINESS_CHAIN`
    *     targetingType: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "businessChainSearchTerms": {},
    *       //   "geoRegionSearchTerms": {},
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "poiSearchTerms": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "targetingOptions": []
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
  def search(params: ParamsResourceTargetingtypesTargetingoptionsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceTargetingtypesTargetingoptionsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
