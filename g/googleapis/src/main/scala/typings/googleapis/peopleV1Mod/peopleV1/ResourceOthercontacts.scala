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

@JSImport("googleapis/build/src/apis/people/v1", "people_v1.Resource$Othercontacts")
@js.native
open class ResourceOthercontacts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def copyOtherContactToMyContactsGroup(): GaxiosPromise[SchemaPerson] = js.native
  def copyOtherContactToMyContactsGroup(callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def copyOtherContactToMyContactsGroup(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def copyOtherContactToMyContactsGroup(params: ParamsResourceOthercontactsCopyothercontacttomycontactsgroup): GaxiosPromise[SchemaPerson] = js.native
  def copyOtherContactToMyContactsGroup(
    params: ParamsResourceOthercontactsCopyothercontacttomycontactsgroup,
    callback: BodyResponseCallback[SchemaPerson]
  ): Unit = js.native
  def copyOtherContactToMyContactsGroup(
    params: ParamsResourceOthercontactsCopyothercontacttomycontactsgroup,
    options: BodyResponseCallback[Readable | SchemaPerson],
    callback: BodyResponseCallback[Readable | SchemaPerson]
  ): Unit = js.native
  def copyOtherContactToMyContactsGroup(params: ParamsResourceOthercontactsCopyothercontacttomycontactsgroup, options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def copyOtherContactToMyContactsGroup(
    params: ParamsResourceOthercontactsCopyothercontacttomycontactsgroup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPerson]
  ): Unit = js.native
  /**
    * Copies an "Other contact" to a new contact in the user's "myContacts" group Mutate requests for the same user should be sent sequentially to avoid increased latency and failures.
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
    *       'https://www.googleapis.com/auth/contacts.other.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.otherContacts.copyOtherContactToMyContactsGroup({
    *     // Required. The resource name of the "Other contact" to copy.
    *     resourceName: 'otherContacts/my-otherContact',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "copyMask": "my_copyMask",
    *       //   "readMask": "my_readMask",
    *       //   "sources": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "addresses": [],
    *   //   "ageRange": "my_ageRange",
    *   //   "ageRanges": [],
    *   //   "biographies": [],
    *   //   "birthdays": [],
    *   //   "braggingRights": [],
    *   //   "calendarUrls": [],
    *   //   "clientData": [],
    *   //   "coverPhotos": [],
    *   //   "emailAddresses": [],
    *   //   "etag": "my_etag",
    *   //   "events": [],
    *   //   "externalIds": [],
    *   //   "fileAses": [],
    *   //   "genders": [],
    *   //   "imClients": [],
    *   //   "interests": [],
    *   //   "locales": [],
    *   //   "locations": [],
    *   //   "memberships": [],
    *   //   "metadata": {},
    *   //   "miscKeywords": [],
    *   //   "names": [],
    *   //   "nicknames": [],
    *   //   "occupations": [],
    *   //   "organizations": [],
    *   //   "phoneNumbers": [],
    *   //   "photos": [],
    *   //   "relations": [],
    *   //   "relationshipInterests": [],
    *   //   "relationshipStatuses": [],
    *   //   "residences": [],
    *   //   "resourceName": "my_resourceName",
    *   //   "sipAddresses": [],
    *   //   "skills": [],
    *   //   "taglines": [],
    *   //   "urls": [],
    *   //   "userDefined": []
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
  def copyOtherContactToMyContactsGroup(params: ParamsResourceOthercontactsCopyothercontacttomycontactsgroup, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def copyOtherContactToMyContactsGroup(
    params: ParamsResourceOthercontactsCopyothercontacttomycontactsgroup,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListOtherContactsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListOtherContactsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListOtherContactsResponse] = js.native
  def list(params: ParamsResourceOthercontactsList): GaxiosPromise[SchemaListOtherContactsResponse] = js.native
  def list(
    params: ParamsResourceOthercontactsList,
    callback: BodyResponseCallback[SchemaListOtherContactsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOthercontactsList,
    options: BodyResponseCallback[Readable | SchemaListOtherContactsResponse],
    callback: BodyResponseCallback[Readable | SchemaListOtherContactsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOthercontactsList, options: MethodOptions): GaxiosPromise[SchemaListOtherContactsResponse] = js.native
  def list(
    params: ParamsResourceOthercontactsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListOtherContactsResponse]
  ): Unit = js.native
  /**
    * List all "Other contacts", that is contacts that are not in a contact group. "Other contacts" are typically auto created contacts from interactions. Sync tokens expire 7 days after the full sync. A request with an expired sync token will get an error with an [google.rpc.ErrorInfo](https://cloud.google.com/apis/design/errors#error_info) with reason "EXPIRED_SYNC_TOKEN". In the case of such an error clients should make a full sync request without a `sync_token`. The first page of a full sync request has an additional quota. If the quota is exceeded, a 429 error will be returned. This quota is fixed and can not be increased. When the `sync_token` is specified, resources deleted since the last sync will be returned as a person with `PersonMetadata.deleted` set to true. When the `page_token` or `sync_token` is specified, all other request parameters must match the first call. Writes may have a propagation delay of several minutes for sync requests. Incremental syncs are not intended for read-after-write use cases. See example usage at [List the user's other contacts that have changed](/people/v1/other-contacts#list_the_users_other_contacts_that_have_changed).
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
    *     scopes: ['https://www.googleapis.com/auth/contacts.other.readonly'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.otherContacts.list({
    *     // Optional. The number of "Other contacts" to include in the response. Valid values are between 1 and 1000, inclusive. Defaults to 100 if not set or set to 0.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous response `next_page_token`. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `otherContacts.list` must match the first call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. A field mask to restrict which fields on each person are returned. Multiple fields can be specified by separating them with commas. What values are valid depend on what ReadSourceType is used. If READ_SOURCE_TYPE_CONTACT is used, valid values are: * emailAddresses * metadata * names * phoneNumbers * photos If READ_SOURCE_TYPE_PROFILE is used, valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * sipAddresses * skills * urls * userDefined
    *     readMask: 'placeholder-value',
    *     // Optional. Whether the response should return `next_sync_token` on the last page of results. It can be used to get incremental changes since the last request by setting it on the request `sync_token`. More details about sync behavior at `otherContacts.list`.
    *     requestSyncToken: 'placeholder-value',
    *     // Optional. A mask of what source types to return. Defaults to READ_SOURCE_TYPE_CONTACT if not set. Possible values for this field are: * READ_SOURCE_TYPE_CONTACT * READ_SOURCE_TYPE_CONTACT,READ_SOURCE_TYPE_PROFILE Specifying READ_SOURCE_TYPE_PROFILE without specifying READ_SOURCE_TYPE_CONTACT is not permitted.
    *     sources: 'placeholder-value',
    *     // Optional. A sync token, received from a previous response `next_sync_token` Provide this to retrieve only the resources changed since the last request. When syncing, all other parameters provided to `otherContacts.list` must match the first call that provided the sync token. More details about sync behavior at `otherContacts.list`.
    *     syncToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "nextSyncToken": "my_nextSyncToken",
    *   //   "otherContacts": [],
    *   //   "totalSize": 0
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
  def list(params: ParamsResourceOthercontactsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOthercontactsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def search(): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(params: ParamsResourceOthercontactsSearch): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(params: ParamsResourceOthercontactsSearch, callback: BodyResponseCallback[SchemaSearchResponse]): Unit = js.native
  def search(
    params: ParamsResourceOthercontactsSearch,
    options: BodyResponseCallback[Readable | SchemaSearchResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchResponse]
  ): Unit = js.native
  def search(params: ParamsResourceOthercontactsSearch, options: MethodOptions): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(
    params: ParamsResourceOthercontactsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchResponse]
  ): Unit = js.native
  /**
    * Provides a list of contacts in the authenticated user's other contacts that matches the search query. The query matches on a contact's `names`, `emailAddresses`, and `phoneNumbers` fields that are from the OTHER_CONTACT source. **IMPORTANT**: Before searching, clients should send a warmup request with an empty query to update the cache. See https://developers.google.com/people/v1/other-contacts#search_the_users_other_contacts
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
    *     scopes: ['https://www.googleapis.com/auth/contacts.other.readonly'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.otherContacts.search({
    *     // Optional. The number of results to return. Defaults to 10 if field is not set, or set to 0. Values greater than 30 will be capped to 30.
    *     pageSize: 'placeholder-value',
    *     // Required. The plain-text query for the request. The query is used to match prefix phrases of the fields on a person. For example, a person with name "foo name" matches queries such as "f", "fo", "foo", "foo n", "nam", etc., but not "oo n".
    *     query: 'placeholder-value',
    *     // Required. A field mask to restrict which fields on each person are returned. Multiple fields can be specified by separating them with commas. Valid values are: * emailAddresses * metadata * names * phoneNumbers
    *     readMask: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "results": []
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
  def search(params: ParamsResourceOthercontactsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceOthercontactsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
