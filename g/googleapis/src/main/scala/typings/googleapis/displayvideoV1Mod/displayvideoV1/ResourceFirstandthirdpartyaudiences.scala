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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Firstandthirdpartyaudiences")
@js.native
open class ResourceFirstandthirdpartyaudiences protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaFirstAndThirdPartyAudience] = js.native
  def create(callback: BodyResponseCallback[SchemaFirstAndThirdPartyAudience]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFirstAndThirdPartyAudience] = js.native
  def create(params: ParamsResourceFirstandthirdpartyaudiencesCreate): GaxiosPromise[SchemaFirstAndThirdPartyAudience] = js.native
  def create(
    params: ParamsResourceFirstandthirdpartyaudiencesCreate,
    callback: BodyResponseCallback[SchemaFirstAndThirdPartyAudience]
  ): Unit = js.native
  def create(
    params: ParamsResourceFirstandthirdpartyaudiencesCreate,
    options: BodyResponseCallback[Readable | SchemaFirstAndThirdPartyAudience],
    callback: BodyResponseCallback[Readable | SchemaFirstAndThirdPartyAudience]
  ): Unit = js.native
  def create(params: ParamsResourceFirstandthirdpartyaudiencesCreate, options: MethodOptions): GaxiosPromise[SchemaFirstAndThirdPartyAudience] = js.native
  def create(
    params: ParamsResourceFirstandthirdpartyaudiencesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFirstAndThirdPartyAudience]
  ): Unit = js.native
  /**
    * Creates a FirstAndThirdPartyAudience. Only supported for the following audience_type: * `CUSTOMER_MATCH_CONTACT_INFO` * `CUSTOMER_MATCH_DEVICE_ID`
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
    *   const res = await displayvideo.firstAndThirdPartyAudiences.create({
    *     // Required. The ID of the advertiser under whom the FirstAndThirdPartyAudience will be created.
    *     advertiserId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "activeDisplayAudienceSize": "my_activeDisplayAudienceSize",
    *       //   "appId": "my_appId",
    *       //   "audienceSource": "my_audienceSource",
    *       //   "audienceType": "my_audienceType",
    *       //   "contactInfoList": {},
    *       //   "description": "my_description",
    *       //   "displayAudienceSize": "my_displayAudienceSize",
    *       //   "displayDesktopAudienceSize": "my_displayDesktopAudienceSize",
    *       //   "displayMobileAppAudienceSize": "my_displayMobileAppAudienceSize",
    *       //   "displayMobileWebAudienceSize": "my_displayMobileWebAudienceSize",
    *       //   "displayName": "my_displayName",
    *       //   "firstAndThirdPartyAudienceId": "my_firstAndThirdPartyAudienceId",
    *       //   "firstAndThirdPartyAudienceType": "my_firstAndThirdPartyAudienceType",
    *       //   "gmailAudienceSize": "my_gmailAudienceSize",
    *       //   "membershipDurationDays": "my_membershipDurationDays",
    *       //   "mobileDeviceIdList": {},
    *       //   "name": "my_name",
    *       //   "youtubeAudienceSize": "my_youtubeAudienceSize"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeDisplayAudienceSize": "my_activeDisplayAudienceSize",
    *   //   "appId": "my_appId",
    *   //   "audienceSource": "my_audienceSource",
    *   //   "audienceType": "my_audienceType",
    *   //   "contactInfoList": {},
    *   //   "description": "my_description",
    *   //   "displayAudienceSize": "my_displayAudienceSize",
    *   //   "displayDesktopAudienceSize": "my_displayDesktopAudienceSize",
    *   //   "displayMobileAppAudienceSize": "my_displayMobileAppAudienceSize",
    *   //   "displayMobileWebAudienceSize": "my_displayMobileWebAudienceSize",
    *   //   "displayName": "my_displayName",
    *   //   "firstAndThirdPartyAudienceId": "my_firstAndThirdPartyAudienceId",
    *   //   "firstAndThirdPartyAudienceType": "my_firstAndThirdPartyAudienceType",
    *   //   "gmailAudienceSize": "my_gmailAudienceSize",
    *   //   "membershipDurationDays": "my_membershipDurationDays",
    *   //   "mobileDeviceIdList": {},
    *   //   "name": "my_name",
    *   //   "youtubeAudienceSize": "my_youtubeAudienceSize"
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
  def create(params: ParamsResourceFirstandthirdpartyaudiencesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceFirstandthirdpartyaudiencesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def editCustomerMatchMembers(): GaxiosPromise[SchemaEditCustomerMatchMembersResponse] = js.native
  def editCustomerMatchMembers(callback: BodyResponseCallback[SchemaEditCustomerMatchMembersResponse]): Unit = js.native
  def editCustomerMatchMembers(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEditCustomerMatchMembersResponse] = js.native
  def editCustomerMatchMembers(params: ParamsResourceFirstandthirdpartyaudiencesEditcustomermatchmembers): GaxiosPromise[SchemaEditCustomerMatchMembersResponse] = js.native
  def editCustomerMatchMembers(
    params: ParamsResourceFirstandthirdpartyaudiencesEditcustomermatchmembers,
    callback: BodyResponseCallback[SchemaEditCustomerMatchMembersResponse]
  ): Unit = js.native
  def editCustomerMatchMembers(
    params: ParamsResourceFirstandthirdpartyaudiencesEditcustomermatchmembers,
    options: BodyResponseCallback[Readable | SchemaEditCustomerMatchMembersResponse],
    callback: BodyResponseCallback[Readable | SchemaEditCustomerMatchMembersResponse]
  ): Unit = js.native
  def editCustomerMatchMembers(params: ParamsResourceFirstandthirdpartyaudiencesEditcustomermatchmembers, options: MethodOptions): GaxiosPromise[SchemaEditCustomerMatchMembersResponse] = js.native
  def editCustomerMatchMembers(
    params: ParamsResourceFirstandthirdpartyaudiencesEditcustomermatchmembers,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEditCustomerMatchMembersResponse]
  ): Unit = js.native
  /**
    * Updates the member list of a Customer Match audience. Only supported for the following audience_type: * `CUSTOMER_MATCH_CONTACT_INFO` * `CUSTOMER_MATCH_DEVICE_ID`
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
    *     await displayvideo.firstAndThirdPartyAudiences.editCustomerMatchMembers({
    *       // Required. The ID of the Customer Match FirstAndThirdPartyAudience whose members will be edited.
    *       firstAndThirdPartyAudienceId: '[^/]+',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "addedContactInfoList": {},
    *         //   "addedMobileDeviceIdList": {},
    *         //   "advertiserId": "my_advertiserId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "firstAndThirdPartyAudienceId": "my_firstAndThirdPartyAudienceId"
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
  def editCustomerMatchMembers(
    params: ParamsResourceFirstandthirdpartyaudiencesEditcustomermatchmembers,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def editCustomerMatchMembers(
    params: ParamsResourceFirstandthirdpartyaudiencesEditcustomermatchmembers,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaFirstAndThirdPartyAudience] = js.native
  def get(callback: BodyResponseCallback[SchemaFirstAndThirdPartyAudience]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFirstAndThirdPartyAudience] = js.native
  def get(params: ParamsResourceFirstandthirdpartyaudiencesGet): GaxiosPromise[SchemaFirstAndThirdPartyAudience] = js.native
  def get(
    params: ParamsResourceFirstandthirdpartyaudiencesGet,
    callback: BodyResponseCallback[SchemaFirstAndThirdPartyAudience]
  ): Unit = js.native
  def get(
    params: ParamsResourceFirstandthirdpartyaudiencesGet,
    options: BodyResponseCallback[Readable | SchemaFirstAndThirdPartyAudience],
    callback: BodyResponseCallback[Readable | SchemaFirstAndThirdPartyAudience]
  ): Unit = js.native
  def get(params: ParamsResourceFirstandthirdpartyaudiencesGet, options: MethodOptions): GaxiosPromise[SchemaFirstAndThirdPartyAudience] = js.native
  def get(
    params: ParamsResourceFirstandthirdpartyaudiencesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFirstAndThirdPartyAudience]
  ): Unit = js.native
  /**
    * Gets a first and third party audience.
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
    *   const res = await displayvideo.firstAndThirdPartyAudiences.get({
    *     // The ID of the advertiser that has access to the fetched first and third party audience.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the first and third party audience to fetch.
    *     firstAndThirdPartyAudienceId: '[^/]+',
    *     // The ID of the partner that has access to the fetched first and third party audience.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeDisplayAudienceSize": "my_activeDisplayAudienceSize",
    *   //   "appId": "my_appId",
    *   //   "audienceSource": "my_audienceSource",
    *   //   "audienceType": "my_audienceType",
    *   //   "contactInfoList": {},
    *   //   "description": "my_description",
    *   //   "displayAudienceSize": "my_displayAudienceSize",
    *   //   "displayDesktopAudienceSize": "my_displayDesktopAudienceSize",
    *   //   "displayMobileAppAudienceSize": "my_displayMobileAppAudienceSize",
    *   //   "displayMobileWebAudienceSize": "my_displayMobileWebAudienceSize",
    *   //   "displayName": "my_displayName",
    *   //   "firstAndThirdPartyAudienceId": "my_firstAndThirdPartyAudienceId",
    *   //   "firstAndThirdPartyAudienceType": "my_firstAndThirdPartyAudienceType",
    *   //   "gmailAudienceSize": "my_gmailAudienceSize",
    *   //   "membershipDurationDays": "my_membershipDurationDays",
    *   //   "mobileDeviceIdList": {},
    *   //   "name": "my_name",
    *   //   "youtubeAudienceSize": "my_youtubeAudienceSize"
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
  def get(params: ParamsResourceFirstandthirdpartyaudiencesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceFirstandthirdpartyaudiencesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListFirstAndThirdPartyAudiencesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFirstAndThirdPartyAudiencesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFirstAndThirdPartyAudiencesResponse] = js.native
  def list(params: ParamsResourceFirstandthirdpartyaudiencesList): GaxiosPromise[SchemaListFirstAndThirdPartyAudiencesResponse] = js.native
  def list(
    params: ParamsResourceFirstandthirdpartyaudiencesList,
    callback: BodyResponseCallback[SchemaListFirstAndThirdPartyAudiencesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceFirstandthirdpartyaudiencesList,
    options: BodyResponseCallback[Readable | SchemaListFirstAndThirdPartyAudiencesResponse],
    callback: BodyResponseCallback[Readable | SchemaListFirstAndThirdPartyAudiencesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFirstandthirdpartyaudiencesList, options: MethodOptions): GaxiosPromise[SchemaListFirstAndThirdPartyAudiencesResponse] = js.native
  def list(
    params: ParamsResourceFirstandthirdpartyaudiencesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFirstAndThirdPartyAudiencesResponse]
  ): Unit = js.native
  /**
    * Lists first and third party audiences. The order is defined by the order_by parameter.
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
    *   const res = await displayvideo.firstAndThirdPartyAudiences.list({
    *     // The ID of the advertiser that has access to the fetched first and third party audiences.
    *     advertiserId: 'placeholder-value',
    *     // Allows filtering by first and third party audience fields. Supported syntax: * Filter expressions for first and third party audiences currently can only contain at most one restriction. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `CONTAINS (:)`. * Supported fields: - `displayName` Examples: * All first and third party audiences for which the display name contains "Google": `displayName : "Google"`. The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `firstAndThirdPartyAudienceId` (default) * `displayName` The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `displayName desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListFirstAndThirdPartyAudiences` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *     // The ID of the partner that has access to the fetched first and third party audiences.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "firstAndThirdPartyAudiences": [],
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
  def list(params: ParamsResourceFirstandthirdpartyaudiencesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceFirstandthirdpartyaudiencesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaFirstAndThirdPartyAudience] = js.native
  def patch(callback: BodyResponseCallback[SchemaFirstAndThirdPartyAudience]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFirstAndThirdPartyAudience] = js.native
  def patch(params: ParamsResourceFirstandthirdpartyaudiencesPatch): GaxiosPromise[SchemaFirstAndThirdPartyAudience] = js.native
  def patch(
    params: ParamsResourceFirstandthirdpartyaudiencesPatch,
    callback: BodyResponseCallback[SchemaFirstAndThirdPartyAudience]
  ): Unit = js.native
  def patch(
    params: ParamsResourceFirstandthirdpartyaudiencesPatch,
    options: BodyResponseCallback[Readable | SchemaFirstAndThirdPartyAudience],
    callback: BodyResponseCallback[Readable | SchemaFirstAndThirdPartyAudience]
  ): Unit = js.native
  def patch(params: ParamsResourceFirstandthirdpartyaudiencesPatch, options: MethodOptions): GaxiosPromise[SchemaFirstAndThirdPartyAudience] = js.native
  def patch(
    params: ParamsResourceFirstandthirdpartyaudiencesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFirstAndThirdPartyAudience]
  ): Unit = js.native
  /**
    * Updates an existing FirstAndThirdPartyAudience. Only supported for the following audience_type: * `CUSTOMER_MATCH_CONTACT_INFO` * `CUSTOMER_MATCH_DEVICE_ID`
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
    *   const res = await displayvideo.firstAndThirdPartyAudiences.patch({
    *     // Required. The ID of the owner advertiser of the updated FirstAndThirdPartyAudience.
    *     advertiserId: 'placeholder-value',
    *     // Output only. The unique ID of the first and third party audience. Assigned by the system.
    *     firstAndThirdPartyAudienceId: '[^/]+',
    *     // Required. The mask to control which fields to update. Updates are only supported for the following fields: * `displayName` * `description` * `membershipDurationDays`
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "activeDisplayAudienceSize": "my_activeDisplayAudienceSize",
    *       //   "appId": "my_appId",
    *       //   "audienceSource": "my_audienceSource",
    *       //   "audienceType": "my_audienceType",
    *       //   "contactInfoList": {},
    *       //   "description": "my_description",
    *       //   "displayAudienceSize": "my_displayAudienceSize",
    *       //   "displayDesktopAudienceSize": "my_displayDesktopAudienceSize",
    *       //   "displayMobileAppAudienceSize": "my_displayMobileAppAudienceSize",
    *       //   "displayMobileWebAudienceSize": "my_displayMobileWebAudienceSize",
    *       //   "displayName": "my_displayName",
    *       //   "firstAndThirdPartyAudienceId": "my_firstAndThirdPartyAudienceId",
    *       //   "firstAndThirdPartyAudienceType": "my_firstAndThirdPartyAudienceType",
    *       //   "gmailAudienceSize": "my_gmailAudienceSize",
    *       //   "membershipDurationDays": "my_membershipDurationDays",
    *       //   "mobileDeviceIdList": {},
    *       //   "name": "my_name",
    *       //   "youtubeAudienceSize": "my_youtubeAudienceSize"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeDisplayAudienceSize": "my_activeDisplayAudienceSize",
    *   //   "appId": "my_appId",
    *   //   "audienceSource": "my_audienceSource",
    *   //   "audienceType": "my_audienceType",
    *   //   "contactInfoList": {},
    *   //   "description": "my_description",
    *   //   "displayAudienceSize": "my_displayAudienceSize",
    *   //   "displayDesktopAudienceSize": "my_displayDesktopAudienceSize",
    *   //   "displayMobileAppAudienceSize": "my_displayMobileAppAudienceSize",
    *   //   "displayMobileWebAudienceSize": "my_displayMobileWebAudienceSize",
    *   //   "displayName": "my_displayName",
    *   //   "firstAndThirdPartyAudienceId": "my_firstAndThirdPartyAudienceId",
    *   //   "firstAndThirdPartyAudienceType": "my_firstAndThirdPartyAudienceType",
    *   //   "gmailAudienceSize": "my_gmailAudienceSize",
    *   //   "membershipDurationDays": "my_membershipDurationDays",
    *   //   "mobileDeviceIdList": {},
    *   //   "name": "my_name",
    *   //   "youtubeAudienceSize": "my_youtubeAudienceSize"
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
  def patch(params: ParamsResourceFirstandthirdpartyaudiencesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceFirstandthirdpartyaudiencesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
