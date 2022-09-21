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

@JSImport("googleapis/build/src/apis/dfareporting/v3.5", "dfareporting_v3_5.Resource$Accountuserprofiles")
@js.native
open class ResourceAccountuserprofiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def get(callback: BodyResponseCallback[SchemaAccountUserProfile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def get(params: ParamsResourceAccountuserprofilesGet): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def get(
    params: ParamsResourceAccountuserprofilesGet,
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountuserprofilesGet,
    options: BodyResponseCallback[Readable | SchemaAccountUserProfile],
    callback: BodyResponseCallback[Readable | SchemaAccountUserProfile]
  ): Unit = js.native
  def get(params: ParamsResourceAccountuserprofilesGet, options: MethodOptions): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def get(
    params: ParamsResourceAccountuserprofilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  /**
    * Gets one account user profile by ID.
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
    *   const res = await dfareporting.accountUserProfiles.get({
    *     // User profile ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "advertiserFilter": {},
    *   //   "campaignFilter": {},
    *   //   "comments": "my_comments",
    *   //   "email": "my_email",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "locale": "my_locale",
    *   //   "name": "my_name",
    *   //   "siteFilter": {},
    *   //   "subaccountId": "my_subaccountId",
    *   //   "traffickerType": "my_traffickerType",
    *   //   "userAccessType": "my_userAccessType",
    *   //   "userRoleFilter": {},
    *   //   "userRoleId": "my_userRoleId"
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
  def get(params: ParamsResourceAccountuserprofilesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountuserprofilesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def insert(callback: BodyResponseCallback[SchemaAccountUserProfile]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def insert(params: ParamsResourceAccountuserprofilesInsert): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def insert(
    params: ParamsResourceAccountuserprofilesInsert,
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  def insert(
    params: ParamsResourceAccountuserprofilesInsert,
    options: BodyResponseCallback[Readable | SchemaAccountUserProfile],
    callback: BodyResponseCallback[Readable | SchemaAccountUserProfile]
  ): Unit = js.native
  def insert(params: ParamsResourceAccountuserprofilesInsert, options: MethodOptions): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def insert(
    params: ParamsResourceAccountuserprofilesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  /**
    * Inserts a new account user profile.
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
    *   const res = await dfareporting.accountUserProfiles.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "active": false,
    *       //   "advertiserFilter": {},
    *       //   "campaignFilter": {},
    *       //   "comments": "my_comments",
    *       //   "email": "my_email",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "locale": "my_locale",
    *       //   "name": "my_name",
    *       //   "siteFilter": {},
    *       //   "subaccountId": "my_subaccountId",
    *       //   "traffickerType": "my_traffickerType",
    *       //   "userAccessType": "my_userAccessType",
    *       //   "userRoleFilter": {},
    *       //   "userRoleId": "my_userRoleId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "advertiserFilter": {},
    *   //   "campaignFilter": {},
    *   //   "comments": "my_comments",
    *   //   "email": "my_email",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "locale": "my_locale",
    *   //   "name": "my_name",
    *   //   "siteFilter": {},
    *   //   "subaccountId": "my_subaccountId",
    *   //   "traffickerType": "my_traffickerType",
    *   //   "userAccessType": "my_userAccessType",
    *   //   "userRoleFilter": {},
    *   //   "userRoleId": "my_userRoleId"
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
  def insert(params: ParamsResourceAccountuserprofilesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceAccountuserprofilesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAccountUserProfilesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAccountUserProfilesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountUserProfilesListResponse] = js.native
  def list(params: ParamsResourceAccountuserprofilesList): GaxiosPromise[SchemaAccountUserProfilesListResponse] = js.native
  def list(
    params: ParamsResourceAccountuserprofilesList,
    callback: BodyResponseCallback[SchemaAccountUserProfilesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountuserprofilesList,
    options: BodyResponseCallback[Readable | SchemaAccountUserProfilesListResponse],
    callback: BodyResponseCallback[Readable | SchemaAccountUserProfilesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountuserprofilesList, options: MethodOptions): GaxiosPromise[SchemaAccountUserProfilesListResponse] = js.native
  def list(
    params: ParamsResourceAccountuserprofilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountUserProfilesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of account user profiles, possibly filtered. This method supports paging.
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
    *   const res = await dfareporting.accountUserProfiles.list({
    *     // Select only active user profiles.
    *     active: 'placeholder-value',
    *     // Select only user profiles with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for objects by name, ID or email. Wildcards (*) are allowed. For example, "user profile*2015" will return objects with names like "user profile June 2015", "user profile April 2015", or simply "user profile 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "user profile" will match objects with name "my user profile", "user profile 2015", or simply "user profile".
    *     searchString: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *     // Select only user profiles with the specified subaccount ID.
    *     subaccountId: 'placeholder-value',
    *     // Select only user profiles with the specified user role ID.
    *     userRoleId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountUserProfiles": [],
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
  def list(params: ParamsResourceAccountuserprofilesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountuserprofilesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def patch(callback: BodyResponseCallback[SchemaAccountUserProfile]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def patch(params: ParamsResourceAccountuserprofilesPatch): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def patch(
    params: ParamsResourceAccountuserprofilesPatch,
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAccountuserprofilesPatch,
    options: BodyResponseCallback[Readable | SchemaAccountUserProfile],
    callback: BodyResponseCallback[Readable | SchemaAccountUserProfile]
  ): Unit = js.native
  def patch(params: ParamsResourceAccountuserprofilesPatch, options: MethodOptions): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def patch(
    params: ParamsResourceAccountuserprofilesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  /**
    * Updates an existing account user profile. This method supports patch semantics.
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
    *   const res = await dfareporting.accountUserProfiles.patch({
    *     // AccountUserProfile ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "active": false,
    *       //   "advertiserFilter": {},
    *       //   "campaignFilter": {},
    *       //   "comments": "my_comments",
    *       //   "email": "my_email",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "locale": "my_locale",
    *       //   "name": "my_name",
    *       //   "siteFilter": {},
    *       //   "subaccountId": "my_subaccountId",
    *       //   "traffickerType": "my_traffickerType",
    *       //   "userAccessType": "my_userAccessType",
    *       //   "userRoleFilter": {},
    *       //   "userRoleId": "my_userRoleId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "advertiserFilter": {},
    *   //   "campaignFilter": {},
    *   //   "comments": "my_comments",
    *   //   "email": "my_email",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "locale": "my_locale",
    *   //   "name": "my_name",
    *   //   "siteFilter": {},
    *   //   "subaccountId": "my_subaccountId",
    *   //   "traffickerType": "my_traffickerType",
    *   //   "userAccessType": "my_userAccessType",
    *   //   "userRoleFilter": {},
    *   //   "userRoleId": "my_userRoleId"
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
  def patch(params: ParamsResourceAccountuserprofilesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAccountuserprofilesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def update(callback: BodyResponseCallback[SchemaAccountUserProfile]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def update(params: ParamsResourceAccountuserprofilesUpdate): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def update(
    params: ParamsResourceAccountuserprofilesUpdate,
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountuserprofilesUpdate,
    options: BodyResponseCallback[Readable | SchemaAccountUserProfile],
    callback: BodyResponseCallback[Readable | SchemaAccountUserProfile]
  ): Unit = js.native
  def update(params: ParamsResourceAccountuserprofilesUpdate, options: MethodOptions): GaxiosPromise[SchemaAccountUserProfile] = js.native
  def update(
    params: ParamsResourceAccountuserprofilesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountUserProfile]
  ): Unit = js.native
  /**
    * Updates an existing account user profile.
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
    *   const res = await dfareporting.accountUserProfiles.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "active": false,
    *       //   "advertiserFilter": {},
    *       //   "campaignFilter": {},
    *       //   "comments": "my_comments",
    *       //   "email": "my_email",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "locale": "my_locale",
    *       //   "name": "my_name",
    *       //   "siteFilter": {},
    *       //   "subaccountId": "my_subaccountId",
    *       //   "traffickerType": "my_traffickerType",
    *       //   "userAccessType": "my_userAccessType",
    *       //   "userRoleFilter": {},
    *       //   "userRoleId": "my_userRoleId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "advertiserFilter": {},
    *   //   "campaignFilter": {},
    *   //   "comments": "my_comments",
    *   //   "email": "my_email",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "locale": "my_locale",
    *   //   "name": "my_name",
    *   //   "siteFilter": {},
    *   //   "subaccountId": "my_subaccountId",
    *   //   "traffickerType": "my_traffickerType",
    *   //   "userAccessType": "my_userAccessType",
    *   //   "userRoleFilter": {},
    *   //   "userRoleId": "my_userRoleId"
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
  def update(params: ParamsResourceAccountuserprofilesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountuserprofilesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
