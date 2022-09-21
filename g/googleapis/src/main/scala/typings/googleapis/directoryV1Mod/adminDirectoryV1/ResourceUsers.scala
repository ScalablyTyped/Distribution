package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Users")
@js.native
open class ResourceUsers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var aliases: ResourceUsersAliases = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.user'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.users.delete({
    *     // Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    *     userKey: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceUsersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUsersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaUser] = js.native
  def get(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def get(params: ParamsResourceUsersGet): GaxiosPromise[SchemaUser] = js.native
  def get(params: ParamsResourceUsersGet, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def get(
    params: ParamsResourceUsersGet,
    options: BodyResponseCallback[Readable | SchemaUser],
    callback: BodyResponseCallback[Readable | SchemaUser]
  ): Unit = js.native
  def get(params: ParamsResourceUsersGet, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def get(params: ParamsResourceUsersGet, options: MethodOptions, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  /**
    * Retrieves a user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.user',
    *       'https://www.googleapis.com/auth/admin.directory.user.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.users.get({
    *     // A comma-separated list of schema names. All fields from these schemas are fetched. This should only be set when `projection=custom`.
    *     customFieldMask: 'placeholder-value',
    *     // What subset of fields to fetch for this user.
    *     projection: 'placeholder-value',
    *     // Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    *     userKey: 'placeholder-value',
    *     // Whether to fetch the administrator-only or domain-wide public view of the user. For more information, see [Retrieve a user as a non-administrator](/admin-sdk/directory/v1/guides/manage-users#retrieve_users_non_admin).
    *     viewType: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "addresses": {},
    *   //   "agreedToTerms": false,
    *   //   "aliases": [],
    *   //   "archived": false,
    *   //   "changePasswordAtNextLogin": false,
    *   //   "creationTime": "my_creationTime",
    *   //   "customSchemas": {},
    *   //   "customerId": "my_customerId",
    *   //   "deletionTime": "my_deletionTime",
    *   //   "emails": {},
    *   //   "etag": "my_etag",
    *   //   "externalIds": {},
    *   //   "gender": {},
    *   //   "hashFunction": "my_hashFunction",
    *   //   "id": "my_id",
    *   //   "ims": {},
    *   //   "includeInGlobalAddressList": false,
    *   //   "ipWhitelisted": false,
    *   //   "isAdmin": false,
    *   //   "isDelegatedAdmin": false,
    *   //   "isEnforcedIn2Sv": false,
    *   //   "isEnrolledIn2Sv": false,
    *   //   "isMailboxSetup": false,
    *   //   "keywords": {},
    *   //   "kind": "my_kind",
    *   //   "languages": {},
    *   //   "lastLoginTime": "my_lastLoginTime",
    *   //   "locations": {},
    *   //   "name": {},
    *   //   "nonEditableAliases": [],
    *   //   "notes": {},
    *   //   "orgUnitPath": "my_orgUnitPath",
    *   //   "organizations": {},
    *   //   "password": "my_password",
    *   //   "phones": {},
    *   //   "posixAccounts": {},
    *   //   "primaryEmail": "my_primaryEmail",
    *   //   "recoveryEmail": "my_recoveryEmail",
    *   //   "recoveryPhone": "my_recoveryPhone",
    *   //   "relations": {},
    *   //   "sshPublicKeys": {},
    *   //   "suspended": false,
    *   //   "suspensionReason": "my_suspensionReason",
    *   //   "thumbnailPhotoEtag": "my_thumbnailPhotoEtag",
    *   //   "thumbnailPhotoUrl": "my_thumbnailPhotoUrl",
    *   //   "websites": {}
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
  def get(params: ParamsResourceUsersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUsersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaUser] = js.native
  def insert(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def insert(params: ParamsResourceUsersInsert): GaxiosPromise[SchemaUser] = js.native
  def insert(params: ParamsResourceUsersInsert, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def insert(
    params: ParamsResourceUsersInsert,
    options: BodyResponseCallback[Readable | SchemaUser],
    callback: BodyResponseCallback[Readable | SchemaUser]
  ): Unit = js.native
  def insert(params: ParamsResourceUsersInsert, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def insert(
    params: ParamsResourceUsersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  /**
    * Creates a user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.user'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.users.insert({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "addresses": {},
    *       //   "agreedToTerms": false,
    *       //   "aliases": [],
    *       //   "archived": false,
    *       //   "changePasswordAtNextLogin": false,
    *       //   "creationTime": "my_creationTime",
    *       //   "customSchemas": {},
    *       //   "customerId": "my_customerId",
    *       //   "deletionTime": "my_deletionTime",
    *       //   "emails": {},
    *       //   "etag": "my_etag",
    *       //   "externalIds": {},
    *       //   "gender": {},
    *       //   "hashFunction": "my_hashFunction",
    *       //   "id": "my_id",
    *       //   "ims": {},
    *       //   "includeInGlobalAddressList": false,
    *       //   "ipWhitelisted": false,
    *       //   "isAdmin": false,
    *       //   "isDelegatedAdmin": false,
    *       //   "isEnforcedIn2Sv": false,
    *       //   "isEnrolledIn2Sv": false,
    *       //   "isMailboxSetup": false,
    *       //   "keywords": {},
    *       //   "kind": "my_kind",
    *       //   "languages": {},
    *       //   "lastLoginTime": "my_lastLoginTime",
    *       //   "locations": {},
    *       //   "name": {},
    *       //   "nonEditableAliases": [],
    *       //   "notes": {},
    *       //   "orgUnitPath": "my_orgUnitPath",
    *       //   "organizations": {},
    *       //   "password": "my_password",
    *       //   "phones": {},
    *       //   "posixAccounts": {},
    *       //   "primaryEmail": "my_primaryEmail",
    *       //   "recoveryEmail": "my_recoveryEmail",
    *       //   "recoveryPhone": "my_recoveryPhone",
    *       //   "relations": {},
    *       //   "sshPublicKeys": {},
    *       //   "suspended": false,
    *       //   "suspensionReason": "my_suspensionReason",
    *       //   "thumbnailPhotoEtag": "my_thumbnailPhotoEtag",
    *       //   "thumbnailPhotoUrl": "my_thumbnailPhotoUrl",
    *       //   "websites": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "addresses": {},
    *   //   "agreedToTerms": false,
    *   //   "aliases": [],
    *   //   "archived": false,
    *   //   "changePasswordAtNextLogin": false,
    *   //   "creationTime": "my_creationTime",
    *   //   "customSchemas": {},
    *   //   "customerId": "my_customerId",
    *   //   "deletionTime": "my_deletionTime",
    *   //   "emails": {},
    *   //   "etag": "my_etag",
    *   //   "externalIds": {},
    *   //   "gender": {},
    *   //   "hashFunction": "my_hashFunction",
    *   //   "id": "my_id",
    *   //   "ims": {},
    *   //   "includeInGlobalAddressList": false,
    *   //   "ipWhitelisted": false,
    *   //   "isAdmin": false,
    *   //   "isDelegatedAdmin": false,
    *   //   "isEnforcedIn2Sv": false,
    *   //   "isEnrolledIn2Sv": false,
    *   //   "isMailboxSetup": false,
    *   //   "keywords": {},
    *   //   "kind": "my_kind",
    *   //   "languages": {},
    *   //   "lastLoginTime": "my_lastLoginTime",
    *   //   "locations": {},
    *   //   "name": {},
    *   //   "nonEditableAliases": [],
    *   //   "notes": {},
    *   //   "orgUnitPath": "my_orgUnitPath",
    *   //   "organizations": {},
    *   //   "password": "my_password",
    *   //   "phones": {},
    *   //   "posixAccounts": {},
    *   //   "primaryEmail": "my_primaryEmail",
    *   //   "recoveryEmail": "my_recoveryEmail",
    *   //   "recoveryPhone": "my_recoveryPhone",
    *   //   "relations": {},
    *   //   "sshPublicKeys": {},
    *   //   "suspended": false,
    *   //   "suspensionReason": "my_suspensionReason",
    *   //   "thumbnailPhotoEtag": "my_thumbnailPhotoEtag",
    *   //   "thumbnailPhotoUrl": "my_thumbnailPhotoUrl",
    *   //   "websites": {}
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
  def insert(params: ParamsResourceUsersInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceUsersInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaUsers] = js.native
  def list(callback: BodyResponseCallback[SchemaUsers]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUsers] = js.native
  def list(params: ParamsResourceUsersList): GaxiosPromise[SchemaUsers] = js.native
  def list(params: ParamsResourceUsersList, callback: BodyResponseCallback[SchemaUsers]): Unit = js.native
  def list(
    params: ParamsResourceUsersList,
    options: BodyResponseCallback[Readable | SchemaUsers],
    callback: BodyResponseCallback[Readable | SchemaUsers]
  ): Unit = js.native
  def list(params: ParamsResourceUsersList, options: MethodOptions): GaxiosPromise[SchemaUsers] = js.native
  def list(
    params: ParamsResourceUsersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUsers]
  ): Unit = js.native
  /**
    * Retrieves a paginated list of either deleted users or all users in a domain.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.user',
    *       'https://www.googleapis.com/auth/admin.directory.user.readonly',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.users.list({
    *     // The unique ID for the customer's Google Workspace account. In case of a multi-domain account, to fetch all groups for a customer, fill this field instead of domain. You can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users). Either the `customer` or the `domain` parameter must be provided.
    *     customer: 'placeholder-value',
    *     // A comma-separated list of schema names. All fields from these schemas are fetched. This should only be set when `projection=custom`.
    *     customFieldMask: 'placeholder-value',
    *     // The domain name. Use this field to get groups from only one domain. To return all domains for a customer account, use the `customer` query parameter instead. Either the `customer` or the `domain` parameter must be provided.
    *     domain: 'placeholder-value',
    *     // Event on which subscription is intended (if subscribing)
    *     event: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Property to use for sorting results.
    *     orderBy: 'placeholder-value',
    *     // Token to specify next page in the list
    *     pageToken: 'placeholder-value',
    *     // What subset of fields to fetch for this user.
    *     projection: 'placeholder-value',
    *     // Query string for searching user fields. For more information on constructing user queries, see [Search for Users](/admin-sdk/directory/v1/guides/search-users).
    *     query: 'placeholder-value',
    *     // If set to `true`, retrieves the list of deleted users. (Default: `false`)
    *     showDeleted: 'placeholder-value',
    *     // Whether to return results in ascending or descending order, ignoring case.
    *     sortOrder: 'placeholder-value',
    *     // Whether to fetch the administrator-only or domain-wide public view of the user. For more information, see [Retrieve a user as a non-administrator](/admin-sdk/directory/v1/guides/manage-users#retrieve_users_non_admin).
    *     viewType: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "trigger_event": "my_trigger_event",
    *   //   "users": []
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
  def list(params: ParamsResourceUsersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUsersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def makeAdmin(): GaxiosPromise[Unit] = js.native
  def makeAdmin(callback: BodyResponseCallback[Unit]): Unit = js.native
  def makeAdmin(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def makeAdmin(params: ParamsResourceUsersMakeadmin): GaxiosPromise[Unit] = js.native
  def makeAdmin(params: ParamsResourceUsersMakeadmin, callback: BodyResponseCallback[Unit]): Unit = js.native
  def makeAdmin(
    params: ParamsResourceUsersMakeadmin,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def makeAdmin(params: ParamsResourceUsersMakeadmin, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def makeAdmin(params: ParamsResourceUsersMakeadmin, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Makes a user a super administrator.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.user'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.users.makeAdmin({
    *     // Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    *     userKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "status": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
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
  def makeAdmin(params: ParamsResourceUsersMakeadmin, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def makeAdmin(
    params: ParamsResourceUsersMakeadmin,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaUser] = js.native
  def patch(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def patch(params: ParamsResourceUsersPatch): GaxiosPromise[SchemaUser] = js.native
  def patch(params: ParamsResourceUsersPatch, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def patch(
    params: ParamsResourceUsersPatch,
    options: BodyResponseCallback[Readable | SchemaUser],
    callback: BodyResponseCallback[Readable | SchemaUser]
  ): Unit = js.native
  def patch(params: ParamsResourceUsersPatch, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def patch(
    params: ParamsResourceUsersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  /**
    * Updates a user using patch semantics. The update method should be used instead, since it also supports patch semantics and has better performance. This method is unable to clear fields that contain repeated objects (`addresses`, `phones`, etc). Use the update method instead.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.user'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.users.patch({
    *     // Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    *     userKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "addresses": {},
    *       //   "agreedToTerms": false,
    *       //   "aliases": [],
    *       //   "archived": false,
    *       //   "changePasswordAtNextLogin": false,
    *       //   "creationTime": "my_creationTime",
    *       //   "customSchemas": {},
    *       //   "customerId": "my_customerId",
    *       //   "deletionTime": "my_deletionTime",
    *       //   "emails": {},
    *       //   "etag": "my_etag",
    *       //   "externalIds": {},
    *       //   "gender": {},
    *       //   "hashFunction": "my_hashFunction",
    *       //   "id": "my_id",
    *       //   "ims": {},
    *       //   "includeInGlobalAddressList": false,
    *       //   "ipWhitelisted": false,
    *       //   "isAdmin": false,
    *       //   "isDelegatedAdmin": false,
    *       //   "isEnforcedIn2Sv": false,
    *       //   "isEnrolledIn2Sv": false,
    *       //   "isMailboxSetup": false,
    *       //   "keywords": {},
    *       //   "kind": "my_kind",
    *       //   "languages": {},
    *       //   "lastLoginTime": "my_lastLoginTime",
    *       //   "locations": {},
    *       //   "name": {},
    *       //   "nonEditableAliases": [],
    *       //   "notes": {},
    *       //   "orgUnitPath": "my_orgUnitPath",
    *       //   "organizations": {},
    *       //   "password": "my_password",
    *       //   "phones": {},
    *       //   "posixAccounts": {},
    *       //   "primaryEmail": "my_primaryEmail",
    *       //   "recoveryEmail": "my_recoveryEmail",
    *       //   "recoveryPhone": "my_recoveryPhone",
    *       //   "relations": {},
    *       //   "sshPublicKeys": {},
    *       //   "suspended": false,
    *       //   "suspensionReason": "my_suspensionReason",
    *       //   "thumbnailPhotoEtag": "my_thumbnailPhotoEtag",
    *       //   "thumbnailPhotoUrl": "my_thumbnailPhotoUrl",
    *       //   "websites": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "addresses": {},
    *   //   "agreedToTerms": false,
    *   //   "aliases": [],
    *   //   "archived": false,
    *   //   "changePasswordAtNextLogin": false,
    *   //   "creationTime": "my_creationTime",
    *   //   "customSchemas": {},
    *   //   "customerId": "my_customerId",
    *   //   "deletionTime": "my_deletionTime",
    *   //   "emails": {},
    *   //   "etag": "my_etag",
    *   //   "externalIds": {},
    *   //   "gender": {},
    *   //   "hashFunction": "my_hashFunction",
    *   //   "id": "my_id",
    *   //   "ims": {},
    *   //   "includeInGlobalAddressList": false,
    *   //   "ipWhitelisted": false,
    *   //   "isAdmin": false,
    *   //   "isDelegatedAdmin": false,
    *   //   "isEnforcedIn2Sv": false,
    *   //   "isEnrolledIn2Sv": false,
    *   //   "isMailboxSetup": false,
    *   //   "keywords": {},
    *   //   "kind": "my_kind",
    *   //   "languages": {},
    *   //   "lastLoginTime": "my_lastLoginTime",
    *   //   "locations": {},
    *   //   "name": {},
    *   //   "nonEditableAliases": [],
    *   //   "notes": {},
    *   //   "orgUnitPath": "my_orgUnitPath",
    *   //   "organizations": {},
    *   //   "password": "my_password",
    *   //   "phones": {},
    *   //   "posixAccounts": {},
    *   //   "primaryEmail": "my_primaryEmail",
    *   //   "recoveryEmail": "my_recoveryEmail",
    *   //   "recoveryPhone": "my_recoveryPhone",
    *   //   "relations": {},
    *   //   "sshPublicKeys": {},
    *   //   "suspended": false,
    *   //   "suspensionReason": "my_suspensionReason",
    *   //   "thumbnailPhotoEtag": "my_thumbnailPhotoEtag",
    *   //   "thumbnailPhotoUrl": "my_thumbnailPhotoUrl",
    *   //   "websites": {}
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
  def patch(params: ParamsResourceUsersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceUsersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var photos: ResourceUsersPhotos = js.native
  
  def signOut(): GaxiosPromise[Unit] = js.native
  def signOut(callback: BodyResponseCallback[Unit]): Unit = js.native
  def signOut(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def signOut(params: ParamsResourceUsersSignout): GaxiosPromise[Unit] = js.native
  def signOut(params: ParamsResourceUsersSignout, callback: BodyResponseCallback[Unit]): Unit = js.native
  def signOut(
    params: ParamsResourceUsersSignout,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def signOut(params: ParamsResourceUsersSignout, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def signOut(params: ParamsResourceUsersSignout, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Signs a user out of all web and device sessions and reset their sign-in cookies. User will have to sign in by authenticating again.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.user.security'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.users.signOut({
    *     // Identifies the target user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    *     userKey: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def signOut(params: ParamsResourceUsersSignout, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def signOut(
    params: ParamsResourceUsersSignout,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def undelete(): GaxiosPromise[Unit] = js.native
  def undelete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def undelete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def undelete(params: ParamsResourceUsersUndelete): GaxiosPromise[Unit] = js.native
  def undelete(params: ParamsResourceUsersUndelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def undelete(
    params: ParamsResourceUsersUndelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def undelete(params: ParamsResourceUsersUndelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def undelete(params: ParamsResourceUsersUndelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Undeletes a deleted user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.user'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.users.undelete({
    *     // The immutable id of the user
    *     userKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "orgUnitPath": "my_orgUnitPath"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
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
  def undelete(params: ParamsResourceUsersUndelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def undelete(
    params: ParamsResourceUsersUndelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaUser] = js.native
  def update(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def update(params: ParamsResourceUsersUpdate): GaxiosPromise[SchemaUser] = js.native
  def update(params: ParamsResourceUsersUpdate, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def update(
    params: ParamsResourceUsersUpdate,
    options: BodyResponseCallback[Readable | SchemaUser],
    callback: BodyResponseCallback[Readable | SchemaUser]
  ): Unit = js.native
  def update(params: ParamsResourceUsersUpdate, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def update(
    params: ParamsResourceUsersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  /**
    * Updates a user. This method supports patch semantics, meaning you only need to include the fields you wish to update. Fields that are not present in the request will be preserved, and fields set to `null` will be cleared.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.user'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.users.update({
    *     // Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    *     userKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "addresses": {},
    *       //   "agreedToTerms": false,
    *       //   "aliases": [],
    *       //   "archived": false,
    *       //   "changePasswordAtNextLogin": false,
    *       //   "creationTime": "my_creationTime",
    *       //   "customSchemas": {},
    *       //   "customerId": "my_customerId",
    *       //   "deletionTime": "my_deletionTime",
    *       //   "emails": {},
    *       //   "etag": "my_etag",
    *       //   "externalIds": {},
    *       //   "gender": {},
    *       //   "hashFunction": "my_hashFunction",
    *       //   "id": "my_id",
    *       //   "ims": {},
    *       //   "includeInGlobalAddressList": false,
    *       //   "ipWhitelisted": false,
    *       //   "isAdmin": false,
    *       //   "isDelegatedAdmin": false,
    *       //   "isEnforcedIn2Sv": false,
    *       //   "isEnrolledIn2Sv": false,
    *       //   "isMailboxSetup": false,
    *       //   "keywords": {},
    *       //   "kind": "my_kind",
    *       //   "languages": {},
    *       //   "lastLoginTime": "my_lastLoginTime",
    *       //   "locations": {},
    *       //   "name": {},
    *       //   "nonEditableAliases": [],
    *       //   "notes": {},
    *       //   "orgUnitPath": "my_orgUnitPath",
    *       //   "organizations": {},
    *       //   "password": "my_password",
    *       //   "phones": {},
    *       //   "posixAccounts": {},
    *       //   "primaryEmail": "my_primaryEmail",
    *       //   "recoveryEmail": "my_recoveryEmail",
    *       //   "recoveryPhone": "my_recoveryPhone",
    *       //   "relations": {},
    *       //   "sshPublicKeys": {},
    *       //   "suspended": false,
    *       //   "suspensionReason": "my_suspensionReason",
    *       //   "thumbnailPhotoEtag": "my_thumbnailPhotoEtag",
    *       //   "thumbnailPhotoUrl": "my_thumbnailPhotoUrl",
    *       //   "websites": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "addresses": {},
    *   //   "agreedToTerms": false,
    *   //   "aliases": [],
    *   //   "archived": false,
    *   //   "changePasswordAtNextLogin": false,
    *   //   "creationTime": "my_creationTime",
    *   //   "customSchemas": {},
    *   //   "customerId": "my_customerId",
    *   //   "deletionTime": "my_deletionTime",
    *   //   "emails": {},
    *   //   "etag": "my_etag",
    *   //   "externalIds": {},
    *   //   "gender": {},
    *   //   "hashFunction": "my_hashFunction",
    *   //   "id": "my_id",
    *   //   "ims": {},
    *   //   "includeInGlobalAddressList": false,
    *   //   "ipWhitelisted": false,
    *   //   "isAdmin": false,
    *   //   "isDelegatedAdmin": false,
    *   //   "isEnforcedIn2Sv": false,
    *   //   "isEnrolledIn2Sv": false,
    *   //   "isMailboxSetup": false,
    *   //   "keywords": {},
    *   //   "kind": "my_kind",
    *   //   "languages": {},
    *   //   "lastLoginTime": "my_lastLoginTime",
    *   //   "locations": {},
    *   //   "name": {},
    *   //   "nonEditableAliases": [],
    *   //   "notes": {},
    *   //   "orgUnitPath": "my_orgUnitPath",
    *   //   "organizations": {},
    *   //   "password": "my_password",
    *   //   "phones": {},
    *   //   "posixAccounts": {},
    *   //   "primaryEmail": "my_primaryEmail",
    *   //   "recoveryEmail": "my_recoveryEmail",
    *   //   "recoveryPhone": "my_recoveryPhone",
    *   //   "relations": {},
    *   //   "sshPublicKeys": {},
    *   //   "suspended": false,
    *   //   "suspensionReason": "my_suspensionReason",
    *   //   "thumbnailPhotoEtag": "my_thumbnailPhotoEtag",
    *   //   "thumbnailPhotoUrl": "my_thumbnailPhotoUrl",
    *   //   "websites": {}
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
  def update(params: ParamsResourceUsersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceUsersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def watch(): GaxiosPromise[SchemaChannel] = js.native
  def watch(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceUsersWatch): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceUsersWatch, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(
    params: ParamsResourceUsersWatch,
    options: BodyResponseCallback[Readable | SchemaChannel],
    callback: BodyResponseCallback[Readable | SchemaChannel]
  ): Unit = js.native
  def watch(params: ParamsResourceUsersWatch, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(
    params: ParamsResourceUsersWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  /**
    * Watches for changes in users list.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.user',
    *       'https://www.googleapis.com/auth/admin.directory.user.readonly',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.users.watch({
    *     // Immutable ID of the Google Workspace account. In case of multi-domain, to fetch all users for a customer, fill this field instead of domain.
    *     customer: 'placeholder-value',
    *     // Comma-separated list of schema names. All fields from these schemas are fetched. This should only be set when projection=custom.
    *     customFieldMask: 'placeholder-value',
    *     // Name of the domain. Fill this field to get users from only this domain. To return all users in a multi-domain fill customer field instead."
    *     domain: 'placeholder-value',
    *     // Events to watch for.
    *     event: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Column to use for sorting results
    *     orderBy: 'placeholder-value',
    *     // Token to specify next page in the list
    *     pageToken: 'placeholder-value',
    *     // What subset of fields to fetch for this user.
    *     projection: 'placeholder-value',
    *     // Query string search. Should be of the form "". Complete documentation is at https: //developers.google.com/admin-sdk/directory/v1/guides/search-users
    *     query: 'placeholder-value',
    *     // If set to true, retrieves the list of deleted users. (Default: false)
    *     showDeleted: 'placeholder-value',
    *     // Whether to return results in ascending or descending order.
    *     sortOrder: 'placeholder-value',
    *     // Whether to fetch the administrator-only or domain-wide public view of the user. For more information, see [Retrieve a user as a non-administrator](/admin-sdk/directory/v1/guides/manage-users#retrieve_users_non_admin).
    *     viewType: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "address": "my_address",
    *       //   "expiration": "my_expiration",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "params": {},
    *       //   "payload": false,
    *       //   "resourceId": "my_resourceId",
    *       //   "resourceUri": "my_resourceUri",
    *       //   "token": "my_token",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "address": "my_address",
    *   //   "expiration": "my_expiration",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "params": {},
    *   //   "payload": false,
    *   //   "resourceId": "my_resourceId",
    *   //   "resourceUri": "my_resourceUri",
    *   //   "token": "my_token",
    *   //   "type": "my_type"
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
  def watch(params: ParamsResourceUsersWatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def watch(
    params: ParamsResourceUsersWatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
