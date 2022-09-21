package typings.googleapis.v35Mod.dfareportingV35

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.5", "dfareporting_v3_5.Resource$Campaigns")
@js.native
open class ResourceCampaigns protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaCampaign] = js.native
  def get(callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def get(params: ParamsResourceCampaignsGet): GaxiosPromise[SchemaCampaign] = js.native
  def get(params: ParamsResourceCampaignsGet, callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def get(
    params: ParamsResourceCampaignsGet,
    options: BodyResponseCallback[Readable | SchemaCampaign],
    callback: BodyResponseCallback[Readable | SchemaCampaign]
  ): Unit = js.native
  def get(params: ParamsResourceCampaignsGet, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def get(
    params: ParamsResourceCampaignsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaign]
  ): Unit = js.native
  /**
    * Gets one campaign by ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.5');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.campaigns.get({
    *     // Campaign ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "adBlockingConfiguration": {},
    *   //   "additionalCreativeOptimizationConfigurations": [],
    *   //   "advertiserGroupId": "my_advertiserGroupId",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "archived": false,
    *   //   "audienceSegmentGroups": [],
    *   //   "billingInvoiceCode": "my_billingInvoiceCode",
    *   //   "clickThroughUrlSuffixProperties": {},
    *   //   "comment": "my_comment",
    *   //   "createInfo": {},
    *   //   "creativeGroupIds": [],
    *   //   "creativeOptimizationConfiguration": {},
    *   //   "defaultClickThroughEventTagProperties": {},
    *   //   "defaultLandingPageId": "my_defaultLandingPageId",
    *   //   "endDate": "my_endDate",
    *   //   "eventTagOverrides": [],
    *   //   "externalId": "my_externalId",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "measurementPartnerLink": {},
    *   //   "name": "my_name",
    *   //   "nielsenOcrEnabled": false,
    *   //   "startDate": "my_startDate",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "traffickerEmails": []
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
  def get(params: ParamsResourceCampaignsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCampaignsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaCampaign] = js.native
  def insert(callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def insert(params: ParamsResourceCampaignsInsert): GaxiosPromise[SchemaCampaign] = js.native
  def insert(params: ParamsResourceCampaignsInsert, callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def insert(
    params: ParamsResourceCampaignsInsert,
    options: BodyResponseCallback[Readable | SchemaCampaign],
    callback: BodyResponseCallback[Readable | SchemaCampaign]
  ): Unit = js.native
  def insert(params: ParamsResourceCampaignsInsert, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def insert(
    params: ParamsResourceCampaignsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaign]
  ): Unit = js.native
  /**
    * Inserts a new campaign.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.5');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.campaigns.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "adBlockingConfiguration": {},
    *       //   "additionalCreativeOptimizationConfigurations": [],
    *       //   "advertiserGroupId": "my_advertiserGroupId",
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "archived": false,
    *       //   "audienceSegmentGroups": [],
    *       //   "billingInvoiceCode": "my_billingInvoiceCode",
    *       //   "clickThroughUrlSuffixProperties": {},
    *       //   "comment": "my_comment",
    *       //   "createInfo": {},
    *       //   "creativeGroupIds": [],
    *       //   "creativeOptimizationConfiguration": {},
    *       //   "defaultClickThroughEventTagProperties": {},
    *       //   "defaultLandingPageId": "my_defaultLandingPageId",
    *       //   "endDate": "my_endDate",
    *       //   "eventTagOverrides": [],
    *       //   "externalId": "my_externalId",
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "lastModifiedInfo": {},
    *       //   "measurementPartnerLink": {},
    *       //   "name": "my_name",
    *       //   "nielsenOcrEnabled": false,
    *       //   "startDate": "my_startDate",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "traffickerEmails": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "adBlockingConfiguration": {},
    *   //   "additionalCreativeOptimizationConfigurations": [],
    *   //   "advertiserGroupId": "my_advertiserGroupId",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "archived": false,
    *   //   "audienceSegmentGroups": [],
    *   //   "billingInvoiceCode": "my_billingInvoiceCode",
    *   //   "clickThroughUrlSuffixProperties": {},
    *   //   "comment": "my_comment",
    *   //   "createInfo": {},
    *   //   "creativeGroupIds": [],
    *   //   "creativeOptimizationConfiguration": {},
    *   //   "defaultClickThroughEventTagProperties": {},
    *   //   "defaultLandingPageId": "my_defaultLandingPageId",
    *   //   "endDate": "my_endDate",
    *   //   "eventTagOverrides": [],
    *   //   "externalId": "my_externalId",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "measurementPartnerLink": {},
    *   //   "name": "my_name",
    *   //   "nielsenOcrEnabled": false,
    *   //   "startDate": "my_startDate",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "traffickerEmails": []
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
  def insert(params: ParamsResourceCampaignsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceCampaignsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCampaignsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCampaignsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCampaignsListResponse] = js.native
  def list(params: ParamsResourceCampaignsList): GaxiosPromise[SchemaCampaignsListResponse] = js.native
  def list(params: ParamsResourceCampaignsList, callback: BodyResponseCallback[SchemaCampaignsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceCampaignsList,
    options: BodyResponseCallback[Readable | SchemaCampaignsListResponse],
    callback: BodyResponseCallback[Readable | SchemaCampaignsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCampaignsList, options: MethodOptions): GaxiosPromise[SchemaCampaignsListResponse] = js.native
  def list(
    params: ParamsResourceCampaignsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaignsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of campaigns, possibly filtered. This method supports paging.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.5');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.campaigns.list({
    *     // Select only campaigns whose advertisers belong to these advertiser groups.
    *     advertiserGroupIds: 'placeholder-value',
    *     // Select only campaigns that belong to these advertisers.
    *     advertiserIds: 'placeholder-value',
    *     // Select only archived campaigns. Don't set this field to select both archived and non-archived campaigns.
    *     archived: 'placeholder-value',
    *     // Select only campaigns that have at least one optimization activity.
    *     atLeastOneOptimizationActivity: 'placeholder-value',
    *     // Exclude campaigns with these IDs.
    *     excludedIds: 'placeholder-value',
    *     // Select only campaigns with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Select only campaigns that have overridden this event tag ID.
    *     overriddenEventTagId: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for campaigns by name or ID. Wildcards (*) are allowed. For example, "campaign*2015" will return campaigns with names like "campaign June 2015", "campaign April 2015", or simply "campaign 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "campaign" will match campaigns with name "my campaign", "campaign 2015", or simply "campaign".
    *     searchString: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *     // Select only campaigns that belong to this subaccount.
    *     subaccountId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "campaigns": [],
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourceCampaignsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCampaignsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCampaign] = js.native
  def patch(callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def patch(params: ParamsResourceCampaignsPatch): GaxiosPromise[SchemaCampaign] = js.native
  def patch(params: ParamsResourceCampaignsPatch, callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def patch(
    params: ParamsResourceCampaignsPatch,
    options: BodyResponseCallback[Readable | SchemaCampaign],
    callback: BodyResponseCallback[Readable | SchemaCampaign]
  ): Unit = js.native
  def patch(params: ParamsResourceCampaignsPatch, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def patch(
    params: ParamsResourceCampaignsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaign]
  ): Unit = js.native
  /**
    * Updates an existing campaign. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.5');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.campaigns.patch({
    *     // Campaign ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "adBlockingConfiguration": {},
    *       //   "additionalCreativeOptimizationConfigurations": [],
    *       //   "advertiserGroupId": "my_advertiserGroupId",
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "archived": false,
    *       //   "audienceSegmentGroups": [],
    *       //   "billingInvoiceCode": "my_billingInvoiceCode",
    *       //   "clickThroughUrlSuffixProperties": {},
    *       //   "comment": "my_comment",
    *       //   "createInfo": {},
    *       //   "creativeGroupIds": [],
    *       //   "creativeOptimizationConfiguration": {},
    *       //   "defaultClickThroughEventTagProperties": {},
    *       //   "defaultLandingPageId": "my_defaultLandingPageId",
    *       //   "endDate": "my_endDate",
    *       //   "eventTagOverrides": [],
    *       //   "externalId": "my_externalId",
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "lastModifiedInfo": {},
    *       //   "measurementPartnerLink": {},
    *       //   "name": "my_name",
    *       //   "nielsenOcrEnabled": false,
    *       //   "startDate": "my_startDate",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "traffickerEmails": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "adBlockingConfiguration": {},
    *   //   "additionalCreativeOptimizationConfigurations": [],
    *   //   "advertiserGroupId": "my_advertiserGroupId",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "archived": false,
    *   //   "audienceSegmentGroups": [],
    *   //   "billingInvoiceCode": "my_billingInvoiceCode",
    *   //   "clickThroughUrlSuffixProperties": {},
    *   //   "comment": "my_comment",
    *   //   "createInfo": {},
    *   //   "creativeGroupIds": [],
    *   //   "creativeOptimizationConfiguration": {},
    *   //   "defaultClickThroughEventTagProperties": {},
    *   //   "defaultLandingPageId": "my_defaultLandingPageId",
    *   //   "endDate": "my_endDate",
    *   //   "eventTagOverrides": [],
    *   //   "externalId": "my_externalId",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "measurementPartnerLink": {},
    *   //   "name": "my_name",
    *   //   "nielsenOcrEnabled": false,
    *   //   "startDate": "my_startDate",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "traffickerEmails": []
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
  def patch(params: ParamsResourceCampaignsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCampaignsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaCampaign] = js.native
  def update(callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def update(params: ParamsResourceCampaignsUpdate): GaxiosPromise[SchemaCampaign] = js.native
  def update(params: ParamsResourceCampaignsUpdate, callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def update(
    params: ParamsResourceCampaignsUpdate,
    options: BodyResponseCallback[Readable | SchemaCampaign],
    callback: BodyResponseCallback[Readable | SchemaCampaign]
  ): Unit = js.native
  def update(params: ParamsResourceCampaignsUpdate, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def update(
    params: ParamsResourceCampaignsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaign]
  ): Unit = js.native
  /**
    * Updates an existing campaign.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.5');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.campaigns.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "adBlockingConfiguration": {},
    *       //   "additionalCreativeOptimizationConfigurations": [],
    *       //   "advertiserGroupId": "my_advertiserGroupId",
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "archived": false,
    *       //   "audienceSegmentGroups": [],
    *       //   "billingInvoiceCode": "my_billingInvoiceCode",
    *       //   "clickThroughUrlSuffixProperties": {},
    *       //   "comment": "my_comment",
    *       //   "createInfo": {},
    *       //   "creativeGroupIds": [],
    *       //   "creativeOptimizationConfiguration": {},
    *       //   "defaultClickThroughEventTagProperties": {},
    *       //   "defaultLandingPageId": "my_defaultLandingPageId",
    *       //   "endDate": "my_endDate",
    *       //   "eventTagOverrides": [],
    *       //   "externalId": "my_externalId",
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "lastModifiedInfo": {},
    *       //   "measurementPartnerLink": {},
    *       //   "name": "my_name",
    *       //   "nielsenOcrEnabled": false,
    *       //   "startDate": "my_startDate",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "traffickerEmails": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "adBlockingConfiguration": {},
    *   //   "additionalCreativeOptimizationConfigurations": [],
    *   //   "advertiserGroupId": "my_advertiserGroupId",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "archived": false,
    *   //   "audienceSegmentGroups": [],
    *   //   "billingInvoiceCode": "my_billingInvoiceCode",
    *   //   "clickThroughUrlSuffixProperties": {},
    *   //   "comment": "my_comment",
    *   //   "createInfo": {},
    *   //   "creativeGroupIds": [],
    *   //   "creativeOptimizationConfiguration": {},
    *   //   "defaultClickThroughEventTagProperties": {},
    *   //   "defaultLandingPageId": "my_defaultLandingPageId",
    *   //   "endDate": "my_endDate",
    *   //   "eventTagOverrides": [],
    *   //   "externalId": "my_externalId",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "measurementPartnerLink": {},
    *   //   "name": "my_name",
    *   //   "nielsenOcrEnabled": false,
    *   //   "startDate": "my_startDate",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "traffickerEmails": []
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
  def update(params: ParamsResourceCampaignsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceCampaignsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
