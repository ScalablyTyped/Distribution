package typings.googleapis.peopleV1Mod.peopleV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/people/v1", "people_v1.Resource$People$Connections")
@js.native
class ResourcePeopleConnections protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * people.people.connections.list
    * @desc Provides a list of the authenticated user's contacts merged with
    * any connected profiles. <br> The request throws a 400 error if
    * 'personFields' is not specified.
    * @alias people.people.connections.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The number of connections to include in the response. Valid values are between 1 and 2000, inclusive. Defaults to 100.
    * @param {string=} params.pageToken The token of the page to be returned.
    * @param {string=} params.personFields **Required.** A field mask to restrict which fields on each person are returned. Multiple fields can be specified by separating them with commas. Valid values are:  * addresses * ageRanges * biographies * birthdays * braggingRights * coverPhotos * emailAddresses * events * genders * imClients * interests * locales * memberships * metadata * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * relationshipInterests * relationshipStatuses * residences * sipAddresses * skills * taglines * urls * userDefined
    * @param {string=} params.requestMask.includeField **Required.** Comma-separated list of person fields to be included in the response. Each path should start with `person.`: for example, `person.names` or `person.photos`.
    * @param {boolean=} params.requestSyncToken Whether the response should include a sync token, which can be used to get all changes since the last request. For subsequent sync requests use the `sync_token` param instead. Initial sync requests that specify `request_sync_token` have an additional rate limit.
    * @param {string} params.resourceName The resource name to return connections for. Only `people/me` is valid.
    * @param {string=} params.sortOrder The order in which the connections should be sorted. Defaults to `LAST_MODIFIED_ASCENDING`.
    * @param {string=} params.syncToken A sync token returned by a previous call to `people.connections.list`. Only resources changed since the sync token was created will be returned. Sync requests that specify `sync_token` have an additional rate limit.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListConnectionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListConnectionsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListConnectionsResponse] = js.native
  def list(params: ParamsResourcePeopleConnectionsList): GaxiosPromise[SchemaListConnectionsResponse] = js.native
  def list(
    params: ParamsResourcePeopleConnectionsList,
    callback: BodyResponseCallback[SchemaListConnectionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePeopleConnectionsList,
    options: BodyResponseCallback[SchemaListConnectionsResponse],
    callback: BodyResponseCallback[SchemaListConnectionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePeopleConnectionsList, options: MethodOptions): GaxiosPromise[SchemaListConnectionsResponse] = js.native
  def list(
    params: ParamsResourcePeopleConnectionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListConnectionsResponse]
  ): Unit = js.native
}
