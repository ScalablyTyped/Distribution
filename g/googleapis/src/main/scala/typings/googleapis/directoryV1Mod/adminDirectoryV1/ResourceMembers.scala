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

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Members")
@js.native
open class ResourceMembers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceMembersDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceMembersDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceMembersDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceMembersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceMembersDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Removes a member from a group.
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
    *       'https://www.googleapis.com/auth/admin.directory.group',
    *       'https://www.googleapis.com/auth/admin.directory.group.member',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.members.delete({
    *     // Identifies the group in the API request. The value can be the group's email address, group alias, or the unique group ID.
    *     groupKey: 'placeholder-value',
    *     // Identifies the group member in the API request. A group member can be a user or another group. The value can be the member's (group or user) primary email address, alias, or unique ID.
    *     memberKey: 'placeholder-value',
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
  def delete(params: ParamsResourceMembersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceMembersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaMember] = js.native
  def get(callback: BodyResponseCallback[SchemaMember]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMember] = js.native
  def get(params: ParamsResourceMembersGet): GaxiosPromise[SchemaMember] = js.native
  def get(params: ParamsResourceMembersGet, callback: BodyResponseCallback[SchemaMember]): Unit = js.native
  def get(
    params: ParamsResourceMembersGet,
    options: BodyResponseCallback[Readable | SchemaMember],
    callback: BodyResponseCallback[Readable | SchemaMember]
  ): Unit = js.native
  def get(params: ParamsResourceMembersGet, options: MethodOptions): GaxiosPromise[SchemaMember] = js.native
  def get(
    params: ParamsResourceMembersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMember]
  ): Unit = js.native
  /**
    * Retrieves a group member's properties.
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
    *       'https://www.googleapis.com/auth/admin.directory.group',
    *       'https://www.googleapis.com/auth/admin.directory.group.member',
    *       'https://www.googleapis.com/auth/admin.directory.group.member.readonly',
    *       'https://www.googleapis.com/auth/admin.directory.group.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.members.get({
    *     // Identifies the group in the API request. The value can be the group's email address, group alias, or the unique group ID.
    *     groupKey: 'placeholder-value',
    *     // Identifies the group member in the API request. A group member can be a user or another group. The value can be the member's (group or user) primary email address, alias, or unique ID.
    *     memberKey: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "delivery_settings": "my_delivery_settings",
    *   //   "email": "my_email",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "role": "my_role",
    *   //   "status": "my_status",
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
  def get(params: ParamsResourceMembersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceMembersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def hasMember(): GaxiosPromise[SchemaMembersHasMember] = js.native
  def hasMember(callback: BodyResponseCallback[SchemaMembersHasMember]): Unit = js.native
  def hasMember(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMembersHasMember] = js.native
  def hasMember(params: ParamsResourceMembersHasmember): GaxiosPromise[SchemaMembersHasMember] = js.native
  def hasMember(params: ParamsResourceMembersHasmember, callback: BodyResponseCallback[SchemaMembersHasMember]): Unit = js.native
  def hasMember(
    params: ParamsResourceMembersHasmember,
    options: BodyResponseCallback[Readable | SchemaMembersHasMember],
    callback: BodyResponseCallback[Readable | SchemaMembersHasMember]
  ): Unit = js.native
  def hasMember(params: ParamsResourceMembersHasmember, options: MethodOptions): GaxiosPromise[SchemaMembersHasMember] = js.native
  def hasMember(
    params: ParamsResourceMembersHasmember,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMembersHasMember]
  ): Unit = js.native
  /**
    * Checks whether the given user is a member of the group. Membership can be direct or nested, but if nested, the `memberKey` and `groupKey` must be entities in the same domain or an `Invalid input` error is returned. To check for nested memberships that include entities outside of the group's domain, use the [`checkTransitiveMembership()`](https://cloud.google.com/identity/docs/reference/rest/v1/groups.memberships/checkTransitiveMembership) method in the Cloud Identity Groups API.
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
    *       'https://www.googleapis.com/auth/admin.directory.group',
    *       'https://www.googleapis.com/auth/admin.directory.group.member',
    *       'https://www.googleapis.com/auth/admin.directory.group.member.readonly',
    *       'https://www.googleapis.com/auth/admin.directory.group.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.members.hasMember({
    *     // Identifies the group in the API request. The value can be the group's email address, group alias, or the unique group ID.
    *     groupKey: 'placeholder-value',
    *     // Identifies the user member in the API request. The value can be the user's primary email address, alias, or unique ID.
    *     memberKey: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "isMember": false
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
  def hasMember(params: ParamsResourceMembersHasmember, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def hasMember(
    params: ParamsResourceMembersHasmember,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaMember] = js.native
  def insert(callback: BodyResponseCallback[SchemaMember]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMember] = js.native
  def insert(params: ParamsResourceMembersInsert): GaxiosPromise[SchemaMember] = js.native
  def insert(params: ParamsResourceMembersInsert, callback: BodyResponseCallback[SchemaMember]): Unit = js.native
  def insert(
    params: ParamsResourceMembersInsert,
    options: BodyResponseCallback[Readable | SchemaMember],
    callback: BodyResponseCallback[Readable | SchemaMember]
  ): Unit = js.native
  def insert(params: ParamsResourceMembersInsert, options: MethodOptions): GaxiosPromise[SchemaMember] = js.native
  def insert(
    params: ParamsResourceMembersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMember]
  ): Unit = js.native
  /**
    * Adds a user to the specified group.
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
    *       'https://www.googleapis.com/auth/admin.directory.group',
    *       'https://www.googleapis.com/auth/admin.directory.group.member',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.members.insert({
    *     // Identifies the group in the API request. The value can be the group's email address, group alias, or the unique group ID.
    *     groupKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "delivery_settings": "my_delivery_settings",
    *       //   "email": "my_email",
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "role": "my_role",
    *       //   "status": "my_status",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "delivery_settings": "my_delivery_settings",
    *   //   "email": "my_email",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "role": "my_role",
    *   //   "status": "my_status",
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
  def insert(params: ParamsResourceMembersInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceMembersInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaMembers] = js.native
  def list(callback: BodyResponseCallback[SchemaMembers]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMembers] = js.native
  def list(params: ParamsResourceMembersList): GaxiosPromise[SchemaMembers] = js.native
  def list(params: ParamsResourceMembersList, callback: BodyResponseCallback[SchemaMembers]): Unit = js.native
  def list(
    params: ParamsResourceMembersList,
    options: BodyResponseCallback[Readable | SchemaMembers],
    callback: BodyResponseCallback[Readable | SchemaMembers]
  ): Unit = js.native
  def list(params: ParamsResourceMembersList, options: MethodOptions): GaxiosPromise[SchemaMembers] = js.native
  def list(
    params: ParamsResourceMembersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMembers]
  ): Unit = js.native
  /**
    * Retrieves a paginated list of all members in a group.
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
    *       'https://www.googleapis.com/auth/admin.directory.group',
    *       'https://www.googleapis.com/auth/admin.directory.group.member',
    *       'https://www.googleapis.com/auth/admin.directory.group.member.readonly',
    *       'https://www.googleapis.com/auth/admin.directory.group.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.members.list({
    *     // Identifies the group in the API request. The value can be the group's email address, group alias, or the unique group ID.
    *     groupKey: 'placeholder-value',
    *     // Whether to list indirect memberships. Default: false.
    *     includeDerivedMembership: 'placeholder-value',
    *     // Maximum number of results to return. Max allowed value is 200.
    *     maxResults: 'placeholder-value',
    *     // Token to specify next page in the list.
    *     pageToken: 'placeholder-value',
    *     // The `roles` query parameter allows you to retrieve group members by role. Allowed values are `OWNER`, `MANAGER`, and `MEMBER`.
    *     roles: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "members": [],
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
  def list(params: ParamsResourceMembersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMembersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaMember] = js.native
  def patch(callback: BodyResponseCallback[SchemaMember]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMember] = js.native
  def patch(params: ParamsResourceMembersPatch): GaxiosPromise[SchemaMember] = js.native
  def patch(params: ParamsResourceMembersPatch, callback: BodyResponseCallback[SchemaMember]): Unit = js.native
  def patch(
    params: ParamsResourceMembersPatch,
    options: BodyResponseCallback[Readable | SchemaMember],
    callback: BodyResponseCallback[Readable | SchemaMember]
  ): Unit = js.native
  def patch(params: ParamsResourceMembersPatch, options: MethodOptions): GaxiosPromise[SchemaMember] = js.native
  def patch(
    params: ParamsResourceMembersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMember]
  ): Unit = js.native
  /**
    * Updates the membership properties of a user in the specified group. This method supports [patch semantics](/admin-sdk/directory/v1/guides/performance#patch).
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
    *       'https://www.googleapis.com/auth/admin.directory.group',
    *       'https://www.googleapis.com/auth/admin.directory.group.member',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.members.patch({
    *     // Identifies the group in the API request. The value can be the group's email address, group alias, or the unique group ID.
    *     groupKey: 'placeholder-value',
    *     // Identifies the group member in the API request. A group member can be a user or another group. The value can be the member's (group or user) primary email address, alias, or unique ID.
    *     memberKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "delivery_settings": "my_delivery_settings",
    *       //   "email": "my_email",
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "role": "my_role",
    *       //   "status": "my_status",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "delivery_settings": "my_delivery_settings",
    *   //   "email": "my_email",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "role": "my_role",
    *   //   "status": "my_status",
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
  def patch(params: ParamsResourceMembersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceMembersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaMember] = js.native
  def update(callback: BodyResponseCallback[SchemaMember]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMember] = js.native
  def update(params: ParamsResourceMembersUpdate): GaxiosPromise[SchemaMember] = js.native
  def update(params: ParamsResourceMembersUpdate, callback: BodyResponseCallback[SchemaMember]): Unit = js.native
  def update(
    params: ParamsResourceMembersUpdate,
    options: BodyResponseCallback[Readable | SchemaMember],
    callback: BodyResponseCallback[Readable | SchemaMember]
  ): Unit = js.native
  def update(params: ParamsResourceMembersUpdate, options: MethodOptions): GaxiosPromise[SchemaMember] = js.native
  def update(
    params: ParamsResourceMembersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMember]
  ): Unit = js.native
  /**
    * Updates the membership of a user in the specified group.
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
    *       'https://www.googleapis.com/auth/admin.directory.group',
    *       'https://www.googleapis.com/auth/admin.directory.group.member',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.members.update({
    *     // Identifies the group in the API request. The value can be the group's email address, group alias, or the unique group ID.
    *     groupKey: 'placeholder-value',
    *     // Identifies the group member in the API request. A group member can be a user or another group. The value can be the member's (group or user) primary email address, alias, or unique ID.
    *     memberKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "delivery_settings": "my_delivery_settings",
    *       //   "email": "my_email",
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "role": "my_role",
    *       //   "status": "my_status",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "delivery_settings": "my_delivery_settings",
    *   //   "email": "my_email",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "role": "my_role",
    *   //   "status": "my_status",
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
  def update(params: ParamsResourceMembersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceMembersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
