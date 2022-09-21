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

@JSImport("googleapis/build/src/apis/people/v1", "people_v1.Resource$People$Connections")
@js.native
open class ResourcePeopleConnections protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListConnectionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListConnectionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListConnectionsResponse] = js.native
  def list(params: ParamsResourcePeopleConnectionsList): GaxiosPromise[SchemaListConnectionsResponse] = js.native
  def list(
    params: ParamsResourcePeopleConnectionsList,
    callback: BodyResponseCallback[SchemaListConnectionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePeopleConnectionsList,
    options: BodyResponseCallback[Readable | SchemaListConnectionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListConnectionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePeopleConnectionsList, options: MethodOptions): GaxiosPromise[SchemaListConnectionsResponse] = js.native
  def list(
    params: ParamsResourcePeopleConnectionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListConnectionsResponse]
  ): Unit = js.native
  /**
    * Provides a list of the authenticated user's contacts. Sync tokens expire 7 days after the full sync. A request with an expired sync token will get an error with an [google.rpc.ErrorInfo](https://cloud.google.com/apis/design/errors#error_info) with reason "EXPIRED_SYNC_TOKEN". In the case of such an error clients should make a full sync request without a `sync_token`. The first page of a full sync request has an additional quota. If the quota is exceeded, a 429 error will be returned. This quota is fixed and can not be increased. When the `sync_token` is specified, resources deleted since the last sync will be returned as a person with `PersonMetadata.deleted` set to true. When the `page_token` or `sync_token` is specified, all other request parameters must match the first call. Writes may have a propagation delay of several minutes for sync requests. Incremental syncs are not intended for read-after-write use cases. See example usage at [List the user's contacts that have changed](/people/v1/contacts#list_the_users_contacts_that_have_changed).
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
    *   const res = await people.people.connections.list({
    *     // Optional. The number of connections to include in the response. Valid values are between 1 and 1000, inclusive. Defaults to 100 if not set or set to 0.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous response `next_page_token`. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `people.connections.list` must match the first call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. A field mask to restrict which fields on each person are returned. Multiple fields can be specified by separating them with commas. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * sipAddresses * skills * urls * userDefined
    *     personFields: 'placeholder-value',
    *     // Required. Comma-separated list of person fields to be included in the response. Each path should start with `person.`: for example, `person.names` or `person.photos`.
    *     'requestMask.includeField': 'placeholder-value',
    *     // Optional. Whether the response should return `next_sync_token` on the last page of results. It can be used to get incremental changes since the last request by setting it on the request `sync_token`. More details about sync behavior at `people.connections.list`.
    *     requestSyncToken: 'placeholder-value',
    *     // Required. The resource name to return connections for. Only `people/me` is valid.
    *     resourceName: 'people/[^/]+',
    *     // Optional. The order in which the connections should be sorted. Defaults to `LAST_MODIFIED_ASCENDING`.
    *     sortOrder: 'placeholder-value',
    *     // Optional. A mask of what source types to return. Defaults to READ_SOURCE_TYPE_CONTACT and READ_SOURCE_TYPE_PROFILE if not set.
    *     sources: 'placeholder-value',
    *     // Optional. A sync token, received from a previous response `next_sync_token` Provide this to retrieve only the resources changed since the last request. When syncing, all other parameters provided to `people.connections.list` must match the first call that provided the sync token. More details about sync behavior at `people.connections.list`.
    *     syncToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "connections": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "nextSyncToken": "my_nextSyncToken",
    *   //   "totalItems": 0,
    *   //   "totalPeople": 0
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
  def list(params: ParamsResourcePeopleConnectionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePeopleConnectionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
