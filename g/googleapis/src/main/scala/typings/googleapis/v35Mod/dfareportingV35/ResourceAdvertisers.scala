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

@JSImport("googleapis/build/src/apis/dfareporting/v3.5", "dfareporting_v3_5.Resource$Advertisers")
@js.native
open class ResourceAdvertisers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
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
    * Gets one advertiser by ID.
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
    *   const res = await dfareporting.advertisers.get({
    *     // Advertiser ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advertiserGroupId": "my_advertiserGroupId",
    *   //   "clickThroughUrlSuffix": "my_clickThroughUrlSuffix",
    *   //   "defaultClickThroughEventTagId": "my_defaultClickThroughEventTagId",
    *   //   "defaultEmail": "my_defaultEmail",
    *   //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *   //   "floodlightConfigurationIdDimensionValue": {},
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "measurementPartnerLink": {},
    *   //   "name": "my_name",
    *   //   "originalFloodlightConfigurationId": "my_originalFloodlightConfigurationId",
    *   //   "status": "my_status",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "suspended": false
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
  
  def insert(): GaxiosPromise[SchemaAdvertiser] = js.native
  def insert(callback: BodyResponseCallback[SchemaAdvertiser]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdvertiser] = js.native
  def insert(params: ParamsResourceAdvertisersInsert): GaxiosPromise[SchemaAdvertiser] = js.native
  def insert(params: ParamsResourceAdvertisersInsert, callback: BodyResponseCallback[SchemaAdvertiser]): Unit = js.native
  def insert(
    params: ParamsResourceAdvertisersInsert,
    options: BodyResponseCallback[Readable | SchemaAdvertiser],
    callback: BodyResponseCallback[Readable | SchemaAdvertiser]
  ): Unit = js.native
  def insert(params: ParamsResourceAdvertisersInsert, options: MethodOptions): GaxiosPromise[SchemaAdvertiser] = js.native
  def insert(
    params: ParamsResourceAdvertisersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiser]
  ): Unit = js.native
  /**
    * Inserts a new advertiser.
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
    *   const res = await dfareporting.advertisers.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "advertiserGroupId": "my_advertiserGroupId",
    *       //   "clickThroughUrlSuffix": "my_clickThroughUrlSuffix",
    *       //   "defaultClickThroughEventTagId": "my_defaultClickThroughEventTagId",
    *       //   "defaultEmail": "my_defaultEmail",
    *       //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *       //   "floodlightConfigurationIdDimensionValue": {},
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "measurementPartnerLink": {},
    *       //   "name": "my_name",
    *       //   "originalFloodlightConfigurationId": "my_originalFloodlightConfigurationId",
    *       //   "status": "my_status",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "suspended": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advertiserGroupId": "my_advertiserGroupId",
    *   //   "clickThroughUrlSuffix": "my_clickThroughUrlSuffix",
    *   //   "defaultClickThroughEventTagId": "my_defaultClickThroughEventTagId",
    *   //   "defaultEmail": "my_defaultEmail",
    *   //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *   //   "floodlightConfigurationIdDimensionValue": {},
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "measurementPartnerLink": {},
    *   //   "name": "my_name",
    *   //   "originalFloodlightConfigurationId": "my_originalFloodlightConfigurationId",
    *   //   "status": "my_status",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "suspended": false
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
  def insert(params: ParamsResourceAdvertisersInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceAdvertisersInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAdvertisersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAdvertisersListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdvertisersListResponse] = js.native
  def list(params: ParamsResourceAdvertisersList): GaxiosPromise[SchemaAdvertisersListResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersList,
    callback: BodyResponseCallback[SchemaAdvertisersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersList,
    options: BodyResponseCallback[Readable | SchemaAdvertisersListResponse],
    callback: BodyResponseCallback[Readable | SchemaAdvertisersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertisersList, options: MethodOptions): GaxiosPromise[SchemaAdvertisersListResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertisersListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of advertisers, possibly filtered. This method supports paging.
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
    *   const res = await dfareporting.advertisers.list({
    *     // Select only advertisers with these advertiser group IDs.
    *     advertiserGroupIds: 'placeholder-value',
    *     // Select only advertisers with these floodlight configuration IDs.
    *     floodlightConfigurationIds: 'placeholder-value',
    *     // Select only advertisers with these IDs.
    *     ids: 'placeholder-value',
    *     // Select only advertisers which do not belong to any advertiser group.
    *     includeAdvertisersWithoutGroupsOnly: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Select only advertisers which use another advertiser's floodlight configuration.
    *     onlyParent: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "advertiser*2015" will return objects with names like "advertiser June 2015", "advertiser April 2015", or simply "advertiser 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "advertiser" will match objects with name "my advertiser", "advertiser 2015", or simply "advertiser" .
    *     searchString: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *     // Select only advertisers with the specified status.
    *     status: 'placeholder-value',
    *     // Select only advertisers with these subaccount IDs.
    *     subaccountId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertisers": [],
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
  def list(params: ParamsResourceAdvertisersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertisersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
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
    * Updates an existing advertiser. This method supports patch semantics.
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
    *   const res = await dfareporting.advertisers.patch({
    *     // Advertiser ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "advertiserGroupId": "my_advertiserGroupId",
    *       //   "clickThroughUrlSuffix": "my_clickThroughUrlSuffix",
    *       //   "defaultClickThroughEventTagId": "my_defaultClickThroughEventTagId",
    *       //   "defaultEmail": "my_defaultEmail",
    *       //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *       //   "floodlightConfigurationIdDimensionValue": {},
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "measurementPartnerLink": {},
    *       //   "name": "my_name",
    *       //   "originalFloodlightConfigurationId": "my_originalFloodlightConfigurationId",
    *       //   "status": "my_status",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "suspended": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advertiserGroupId": "my_advertiserGroupId",
    *   //   "clickThroughUrlSuffix": "my_clickThroughUrlSuffix",
    *   //   "defaultClickThroughEventTagId": "my_defaultClickThroughEventTagId",
    *   //   "defaultEmail": "my_defaultEmail",
    *   //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *   //   "floodlightConfigurationIdDimensionValue": {},
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "measurementPartnerLink": {},
    *   //   "name": "my_name",
    *   //   "originalFloodlightConfigurationId": "my_originalFloodlightConfigurationId",
    *   //   "status": "my_status",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "suspended": false
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
  
  def update(): GaxiosPromise[SchemaAdvertiser] = js.native
  def update(callback: BodyResponseCallback[SchemaAdvertiser]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdvertiser] = js.native
  def update(params: ParamsResourceAdvertisersUpdate): GaxiosPromise[SchemaAdvertiser] = js.native
  def update(params: ParamsResourceAdvertisersUpdate, callback: BodyResponseCallback[SchemaAdvertiser]): Unit = js.native
  def update(
    params: ParamsResourceAdvertisersUpdate,
    options: BodyResponseCallback[Readable | SchemaAdvertiser],
    callback: BodyResponseCallback[Readable | SchemaAdvertiser]
  ): Unit = js.native
  def update(params: ParamsResourceAdvertisersUpdate, options: MethodOptions): GaxiosPromise[SchemaAdvertiser] = js.native
  def update(
    params: ParamsResourceAdvertisersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiser]
  ): Unit = js.native
  /**
    * Updates an existing advertiser.
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
    *   const res = await dfareporting.advertisers.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "advertiserGroupId": "my_advertiserGroupId",
    *       //   "clickThroughUrlSuffix": "my_clickThroughUrlSuffix",
    *       //   "defaultClickThroughEventTagId": "my_defaultClickThroughEventTagId",
    *       //   "defaultEmail": "my_defaultEmail",
    *       //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *       //   "floodlightConfigurationIdDimensionValue": {},
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "kind": "my_kind",
    *       //   "measurementPartnerLink": {},
    *       //   "name": "my_name",
    *       //   "originalFloodlightConfigurationId": "my_originalFloodlightConfigurationId",
    *       //   "status": "my_status",
    *       //   "subaccountId": "my_subaccountId",
    *       //   "suspended": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advertiserGroupId": "my_advertiserGroupId",
    *   //   "clickThroughUrlSuffix": "my_clickThroughUrlSuffix",
    *   //   "defaultClickThroughEventTagId": "my_defaultClickThroughEventTagId",
    *   //   "defaultEmail": "my_defaultEmail",
    *   //   "floodlightConfigurationId": "my_floodlightConfigurationId",
    *   //   "floodlightConfigurationIdDimensionValue": {},
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "kind": "my_kind",
    *   //   "measurementPartnerLink": {},
    *   //   "name": "my_name",
    *   //   "originalFloodlightConfigurationId": "my_originalFloodlightConfigurationId",
    *   //   "status": "my_status",
    *   //   "subaccountId": "my_subaccountId",
    *   //   "suspended": false
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
  def update(params: ParamsResourceAdvertisersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAdvertisersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
