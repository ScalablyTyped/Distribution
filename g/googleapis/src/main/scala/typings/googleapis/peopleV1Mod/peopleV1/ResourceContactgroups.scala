package typings.googleapis.peopleV1Mod.peopleV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/people/v1", "people_v1.Resource$Contactgroups")
@js.native
open class ResourceContactgroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchGet(): GaxiosPromise[SchemaBatchGetContactGroupsResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaBatchGetContactGroupsResponse]): Unit = js.native
  def batchGet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchGetContactGroupsResponse] = js.native
  def batchGet(params: ParamsResourceContactgroupsBatchget): GaxiosPromise[SchemaBatchGetContactGroupsResponse] = js.native
  def batchGet(
    params: ParamsResourceContactgroupsBatchget,
    callback: BodyResponseCallback[SchemaBatchGetContactGroupsResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsResourceContactgroupsBatchget,
    options: BodyResponseCallback[Readable | SchemaBatchGetContactGroupsResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchGetContactGroupsResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourceContactgroupsBatchget, options: MethodOptions): GaxiosPromise[SchemaBatchGetContactGroupsResponse] = js.native
  def batchGet(
    params: ParamsResourceContactgroupsBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchGetContactGroupsResponse]
  ): Unit = js.native
  /**
    * Get a list of contact groups owned by the authenticated user by specifying a list of contact group resource names.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/contacts',
    *       'https://www.googleapis.com/auth/contacts.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.contactGroups.batchGet({
    *     // Optional. A field mask to restrict which fields on the group are returned. Defaults to `metadata`, `groupType`, `memberCount`, and `name` if not set or set to empty. Valid fields are: * clientData * groupType * memberCount * metadata * name
    *     groupFields: 'placeholder-value',
    *     // Optional. Specifies the maximum number of members to return for each group. Defaults to 0 if not set, which will return zero members.
    *     maxMembers: 'placeholder-value',
    *     // Required. The resource names of the contact groups to get. There is a maximum of 200 resource names.
    *     resourceNames: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "responses": []
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
  def batchGet(params: ParamsResourceContactgroupsBatchget, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchGet(
    params: ParamsResourceContactgroupsBatchget,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaContactGroup] = js.native
  def create(callback: BodyResponseCallback[SchemaContactGroup]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContactGroup] = js.native
  def create(params: ParamsResourceContactgroupsCreate): GaxiosPromise[SchemaContactGroup] = js.native
  def create(params: ParamsResourceContactgroupsCreate, callback: BodyResponseCallback[SchemaContactGroup]): Unit = js.native
  def create(
    params: ParamsResourceContactgroupsCreate,
    options: BodyResponseCallback[Readable | SchemaContactGroup],
    callback: BodyResponseCallback[Readable | SchemaContactGroup]
  ): Unit = js.native
  def create(params: ParamsResourceContactgroupsCreate, options: MethodOptions): GaxiosPromise[SchemaContactGroup] = js.native
  def create(
    params: ParamsResourceContactgroupsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContactGroup]
  ): Unit = js.native
  /**
    * Create a new contact group owned by the authenticated user. Created contact group names must be unique to the users contact groups. Attempting to create a group with a duplicate name will return a HTTP 409 error. Mutate requests for the same user should be sent sequentially to avoid increased latency and failures.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/contacts'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.contactGroups.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contactGroup": {},
    *       //   "readGroupFields": "my_readGroupFields"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientData": [],
    *   //   "etag": "my_etag",
    *   //   "formattedName": "my_formattedName",
    *   //   "groupType": "my_groupType",
    *   //   "memberCount": 0,
    *   //   "memberResourceNames": [],
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "resourceName": "my_resourceName"
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
  def create(params: ParamsResourceContactgroupsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceContactgroupsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceContactgroupsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceContactgroupsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceContactgroupsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceContactgroupsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceContactgroupsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Delete an existing contact group owned by the authenticated user by specifying a contact group resource name. Mutate requests for the same user should be sent sequentially to avoid increased latency and failures.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/contacts'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.contactGroups.delete({
    *     // Optional. Set to true to also delete the contacts in the specified group.
    *     deleteContacts: 'placeholder-value',
    *     // Required. The resource name of the contact group to delete.
    *     resourceName: 'contactGroups/my-contactGroup',
    *   });
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
  def delete(params: ParamsResourceContactgroupsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceContactgroupsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaContactGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaContactGroup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContactGroup] = js.native
  def get(params: ParamsResourceContactgroupsGet): GaxiosPromise[SchemaContactGroup] = js.native
  def get(params: ParamsResourceContactgroupsGet, callback: BodyResponseCallback[SchemaContactGroup]): Unit = js.native
  def get(
    params: ParamsResourceContactgroupsGet,
    options: BodyResponseCallback[Readable | SchemaContactGroup],
    callback: BodyResponseCallback[Readable | SchemaContactGroup]
  ): Unit = js.native
  def get(params: ParamsResourceContactgroupsGet, options: MethodOptions): GaxiosPromise[SchemaContactGroup] = js.native
  def get(
    params: ParamsResourceContactgroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContactGroup]
  ): Unit = js.native
  /**
    * Get a specific contact group owned by the authenticated user by specifying a contact group resource name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/contacts',
    *       'https://www.googleapis.com/auth/contacts.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.contactGroups.get({
    *     // Optional. A field mask to restrict which fields on the group are returned. Defaults to `metadata`, `groupType`, `memberCount`, and `name` if not set or set to empty. Valid fields are: * clientData * groupType * memberCount * metadata * name
    *     groupFields: 'placeholder-value',
    *     // Optional. Specifies the maximum number of members to return. Defaults to 0 if not set, which will return zero members.
    *     maxMembers: 'placeholder-value',
    *     // Required. The resource name of the contact group to get.
    *     resourceName: 'contactGroups/my-contactGroup',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientData": [],
    *   //   "etag": "my_etag",
    *   //   "formattedName": "my_formattedName",
    *   //   "groupType": "my_groupType",
    *   //   "memberCount": 0,
    *   //   "memberResourceNames": [],
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "resourceName": "my_resourceName"
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
  def get(params: ParamsResourceContactgroupsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceContactgroupsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListContactGroupsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListContactGroupsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListContactGroupsResponse] = js.native
  def list(params: ParamsResourceContactgroupsList): GaxiosPromise[SchemaListContactGroupsResponse] = js.native
  def list(
    params: ParamsResourceContactgroupsList,
    callback: BodyResponseCallback[SchemaListContactGroupsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceContactgroupsList,
    options: BodyResponseCallback[Readable | SchemaListContactGroupsResponse],
    callback: BodyResponseCallback[Readable | SchemaListContactGroupsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceContactgroupsList, options: MethodOptions): GaxiosPromise[SchemaListContactGroupsResponse] = js.native
  def list(
    params: ParamsResourceContactgroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListContactGroupsResponse]
  ): Unit = js.native
  /**
    * List all contact groups owned by the authenticated user. Members of the contact groups are not populated.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/contacts',
    *       'https://www.googleapis.com/auth/contacts.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.contactGroups.list({
    *     // Optional. A field mask to restrict which fields on the group are returned. Defaults to `metadata`, `groupType`, `memberCount`, and `name` if not set or set to empty. Valid fields are: * clientData * groupType * memberCount * metadata * name
    *     groupFields: 'placeholder-value',
    *     // Optional. The maximum number of resources to return. Valid values are between 1 and 1000, inclusive. Defaults to 30 if not set or set to 0.
    *     pageSize: 'placeholder-value',
    *     // Optional. The next_page_token value returned from a previous call to [ListContactGroups](/people/api/rest/v1/contactgroups/list). Requests the next page of resources.
    *     pageToken: 'placeholder-value',
    *     // Optional. A sync token, returned by a previous call to `contactgroups.list`. Only resources changed since the sync token was created will be returned.
    *     syncToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contactGroups": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "nextSyncToken": "my_nextSyncToken",
    *   //   "totalItems": 0
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
  def list(params: ParamsResourceContactgroupsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceContactgroupsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var members: ResourceContactgroupsMembers = js.native
  
  def update(): GaxiosPromise[SchemaContactGroup] = js.native
  def update(callback: BodyResponseCallback[SchemaContactGroup]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContactGroup] = js.native
  def update(params: ParamsResourceContactgroupsUpdate): GaxiosPromise[SchemaContactGroup] = js.native
  def update(params: ParamsResourceContactgroupsUpdate, callback: BodyResponseCallback[SchemaContactGroup]): Unit = js.native
  def update(
    params: ParamsResourceContactgroupsUpdate,
    options: BodyResponseCallback[Readable | SchemaContactGroup],
    callback: BodyResponseCallback[Readable | SchemaContactGroup]
  ): Unit = js.native
  def update(params: ParamsResourceContactgroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaContactGroup] = js.native
  def update(
    params: ParamsResourceContactgroupsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContactGroup]
  ): Unit = js.native
  /**
    * Update the name of an existing contact group owned by the authenticated user. Updated contact group names must be unique to the users contact groups. Attempting to create a group with a duplicate name will return a HTTP 409 error. Mutate requests for the same user should be sent sequentially to avoid increased latency and failures.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/contacts'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.contactGroups.update({
    *     // The resource name for the contact group, assigned by the server. An ASCII string, in the form of `contactGroups/{contact_group_id\}`.
    *     resourceName: 'contactGroups/my-contactGroup',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contactGroup": {},
    *       //   "readGroupFields": "my_readGroupFields",
    *       //   "updateGroupFields": "my_updateGroupFields"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientData": [],
    *   //   "etag": "my_etag",
    *   //   "formattedName": "my_formattedName",
    *   //   "groupType": "my_groupType",
    *   //   "memberCount": 0,
    *   //   "memberResourceNames": [],
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "resourceName": "my_resourceName"
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
  def update(params: ParamsResourceContactgroupsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceContactgroupsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
