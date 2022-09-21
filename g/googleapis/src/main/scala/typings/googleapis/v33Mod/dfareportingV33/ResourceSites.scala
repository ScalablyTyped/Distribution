package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Sites")
@js.native
open class ResourceSites protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaSite] = js.native
  def get(callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def get(params: ParamsResourceSitesGet): GaxiosPromise[SchemaSite] = js.native
  def get(params: ParamsResourceSitesGet, callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def get(
    params: ParamsResourceSitesGet,
    options: BodyResponseCallback[Readable | SchemaSite],
    callback: BodyResponseCallback[Readable | SchemaSite]
  ): Unit = js.native
  def get(params: ParamsResourceSitesGet, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def get(params: ParamsResourceSitesGet, options: MethodOptions, callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  /**
    * Gets one site by ID.
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
    * const dfareporting = google.dfareporting('v3.3');
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
    *   const res = await dfareporting.sites.get({
    *     // Site ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "approved": false,
    *   //   "directorySiteId": "my_directorySiteId",
    *   //   "directorySiteIdDimensionValue": {},
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "keyName": "my_keyName",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "siteContacts": [],
    *   //   "siteSettings": {},
    *   //   "subaccountId": "my_subaccountId",
    *   //   "videoSettings": {}
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
  def get(params: ParamsResourceSitesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSitesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaSite] = js.native
  def insert(callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def insert(params: ParamsResourceSitesInsert): GaxiosPromise[SchemaSite] = js.native
  def insert(params: ParamsResourceSitesInsert, callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def insert(
    params: ParamsResourceSitesInsert,
    options: BodyResponseCallback[Readable | SchemaSite],
    callback: BodyResponseCallback[Readable | SchemaSite]
  ): Unit = js.native
  def insert(params: ParamsResourceSitesInsert, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def insert(
    params: ParamsResourceSitesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSite]
  ): Unit = js.native
  /**
    * Inserts a new site.
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
    * const dfareporting = google.dfareporting('v3.3');
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
    *   const res = await dfareporting.sites.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "approved": false,
    *       //   "directorySiteId": "my_directorySiteId",
    *       //   "directorySiteIdDimensionValue": {},
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "keyName": "my_keyName",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "siteContacts": [],
    *       //   "siteSettings": {},
    *       //   "subaccountId": "my_subaccountId",
    *       //   "videoSettings": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "approved": false,
    *   //   "directorySiteId": "my_directorySiteId",
    *   //   "directorySiteIdDimensionValue": {},
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "keyName": "my_keyName",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "siteContacts": [],
    *   //   "siteSettings": {},
    *   //   "subaccountId": "my_subaccountId",
    *   //   "videoSettings": {}
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
  def insert(params: ParamsResourceSitesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceSitesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSitesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSitesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSitesListResponse] = js.native
  def list(params: ParamsResourceSitesList): GaxiosPromise[SchemaSitesListResponse] = js.native
  def list(params: ParamsResourceSitesList, callback: BodyResponseCallback[SchemaSitesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceSitesList,
    options: BodyResponseCallback[Readable | SchemaSitesListResponse],
    callback: BodyResponseCallback[Readable | SchemaSitesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSitesList, options: MethodOptions): GaxiosPromise[SchemaSitesListResponse] = js.native
  def list(
    params: ParamsResourceSitesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSitesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of sites, possibly filtered. This method supports paging.
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
    * const dfareporting = google.dfareporting('v3.3');
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
    *   const res = await dfareporting.sites.list({
    *     // This search filter is no longer supported and will have no effect on the results returned.
    *     acceptsInStreamVideoPlacements: 'placeholder-value',
    *     // This search filter is no longer supported and will have no effect on the results returned.
    *     acceptsInterstitialPlacements: 'placeholder-value',
    *     // Select only sites that accept publisher paid placements.
    *     acceptsPublisherPaidPlacements: 'placeholder-value',
    *     // Select only AdWords sites.
    *     adWordsSite: 'placeholder-value',
    *     // Select only approved sites.
    *     approved: 'placeholder-value',
    *     // Select only sites with these campaign IDs.
    *     campaignIds: 'placeholder-value',
    *     // Select only sites with these directory site IDs.
    *     directorySiteIds: 'placeholder-value',
    *     // Select only sites with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for objects by name, ID or keyName. Wildcards (*) are allowed. For example, "site*2015" will return objects with names like "site June 2015", "site April 2015", or simply "site 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "site" will match objects with name "my site", "site 2015", or simply "site".
    *     searchString: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *     // Select only sites with this subaccount ID.
    *     subaccountId: 'placeholder-value',
    *     // Select only sites that have not been mapped to a directory site.
    *     unmappedSite: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "sites": []
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
  def list(params: ParamsResourceSitesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSitesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaSite] = js.native
  def patch(callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def patch(params: ParamsResourceSitesPatch): GaxiosPromise[SchemaSite] = js.native
  def patch(params: ParamsResourceSitesPatch, callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def patch(
    params: ParamsResourceSitesPatch,
    options: BodyResponseCallback[Readable | SchemaSite],
    callback: BodyResponseCallback[Readable | SchemaSite]
  ): Unit = js.native
  def patch(params: ParamsResourceSitesPatch, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def patch(
    params: ParamsResourceSitesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSite]
  ): Unit = js.native
  /**
    * Updates an existing site. This method supports patch semantics.
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
    * const dfareporting = google.dfareporting('v3.3');
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
    *   const res = await dfareporting.sites.patch({
    *     // Site ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "approved": false,
    *       //   "directorySiteId": "my_directorySiteId",
    *       //   "directorySiteIdDimensionValue": {},
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "keyName": "my_keyName",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "siteContacts": [],
    *       //   "siteSettings": {},
    *       //   "subaccountId": "my_subaccountId",
    *       //   "videoSettings": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "approved": false,
    *   //   "directorySiteId": "my_directorySiteId",
    *   //   "directorySiteIdDimensionValue": {},
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "keyName": "my_keyName",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "siteContacts": [],
    *   //   "siteSettings": {},
    *   //   "subaccountId": "my_subaccountId",
    *   //   "videoSettings": {}
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
  def patch(params: ParamsResourceSitesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceSitesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaSite] = js.native
  def update(callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def update(params: ParamsResourceSitesUpdate): GaxiosPromise[SchemaSite] = js.native
  def update(params: ParamsResourceSitesUpdate, callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def update(
    params: ParamsResourceSitesUpdate,
    options: BodyResponseCallback[Readable | SchemaSite],
    callback: BodyResponseCallback[Readable | SchemaSite]
  ): Unit = js.native
  def update(params: ParamsResourceSitesUpdate, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def update(
    params: ParamsResourceSitesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSite]
  ): Unit = js.native
  /**
    * Updates an existing site.
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
    * const dfareporting = google.dfareporting('v3.3');
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
    *   const res = await dfareporting.sites.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "approved": false,
    *       //   "directorySiteId": "my_directorySiteId",
    *       //   "directorySiteIdDimensionValue": {},
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "keyName": "my_keyName",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "siteContacts": [],
    *       //   "siteSettings": {},
    *       //   "subaccountId": "my_subaccountId",
    *       //   "videoSettings": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "approved": false,
    *   //   "directorySiteId": "my_directorySiteId",
    *   //   "directorySiteIdDimensionValue": {},
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "keyName": "my_keyName",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "siteContacts": [],
    *   //   "siteSettings": {},
    *   //   "subaccountId": "my_subaccountId",
    *   //   "videoSettings": {}
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
  def update(params: ParamsResourceSitesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceSitesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
