package typings.googleapis.plusV1Mod.plusV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/plus/v1", "plus_v1.Resource$People")
@js.native
class ResourcePeople protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * plus.people.get
    * @desc Get a person's profile. If your app uses scope
    * https://www.googleapis.com/auth/plus.login, this method is guaranteed to
    * return ageRange and language.
    * @alias plus.people.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The ID of the person to get the profile for. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPerson] = js.native
  def get(callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def get(params: ParamsResourcePeopleGet): GaxiosPromise[SchemaPerson] = js.native
  def get(params: ParamsResourcePeopleGet, callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def get(
    params: ParamsResourcePeopleGet,
    options: BodyResponseCallback[SchemaPerson],
    callback: BodyResponseCallback[SchemaPerson]
  ): Unit = js.native
  def get(params: ParamsResourcePeopleGet, options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def get(
    params: ParamsResourcePeopleGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPerson]
  ): Unit = js.native
  /**
    * plus.people.list
    * @desc List all of the people in the specified collection.
    * @alias plus.people.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collection The collection of people to list.
    * @param {integer=} params.maxResults The maximum number of people to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    * @param {string=} params.orderBy The order to return people in.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {string} params.userId Get the collection of people for the person identified. Use "me" to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPeopleFeed] = js.native
  def list(callback: BodyResponseCallback[SchemaPeopleFeed]): Unit = js.native
  def list(params: ParamsResourcePeopleList): GaxiosPromise[SchemaPeopleFeed] = js.native
  def list(params: ParamsResourcePeopleList, callback: BodyResponseCallback[SchemaPeopleFeed]): Unit = js.native
  def list(
    params: ParamsResourcePeopleList,
    options: BodyResponseCallback[SchemaPeopleFeed],
    callback: BodyResponseCallback[SchemaPeopleFeed]
  ): Unit = js.native
  def list(params: ParamsResourcePeopleList, options: MethodOptions): GaxiosPromise[SchemaPeopleFeed] = js.native
  def list(
    params: ParamsResourcePeopleList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPeopleFeed]
  ): Unit = js.native
  /**
    * plus.people.listByActivity
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for
    * more details.
    * @alias plus.people.listByActivity
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.activityId The ID of the activity to get the list of people for.
    * @param {string} params.collection The collection of people to list.
    * @param {integer=} params.maxResults The maximum number of people to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listByActivity(): GaxiosPromise[SchemaPeopleFeed] = js.native
  def listByActivity(callback: BodyResponseCallback[SchemaPeopleFeed]): Unit = js.native
  def listByActivity(params: ParamsResourcePeopleListbyactivity): GaxiosPromise[SchemaPeopleFeed] = js.native
  def listByActivity(params: ParamsResourcePeopleListbyactivity, callback: BodyResponseCallback[SchemaPeopleFeed]): Unit = js.native
  def listByActivity(
    params: ParamsResourcePeopleListbyactivity,
    options: BodyResponseCallback[SchemaPeopleFeed],
    callback: BodyResponseCallback[SchemaPeopleFeed]
  ): Unit = js.native
  def listByActivity(params: ParamsResourcePeopleListbyactivity, options: MethodOptions): GaxiosPromise[SchemaPeopleFeed] = js.native
  def listByActivity(
    params: ParamsResourcePeopleListbyactivity,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPeopleFeed]
  ): Unit = js.native
  /**
    * plus.people.search
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for
    * more details.
    * @alias plus.people.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language Specify the preferred language to search with. See search language codes for available values.
    * @param {integer=} params.maxResults The maximum number of people to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response. This token can be of any length.
    * @param {string} params.query Specify a query string for full text search of public text in all profiles.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[SchemaPeopleFeed] = js.native
  def search(callback: BodyResponseCallback[SchemaPeopleFeed]): Unit = js.native
  def search(params: ParamsResourcePeopleSearch): GaxiosPromise[SchemaPeopleFeed] = js.native
  def search(params: ParamsResourcePeopleSearch, callback: BodyResponseCallback[SchemaPeopleFeed]): Unit = js.native
  def search(
    params: ParamsResourcePeopleSearch,
    options: BodyResponseCallback[SchemaPeopleFeed],
    callback: BodyResponseCallback[SchemaPeopleFeed]
  ): Unit = js.native
  def search(params: ParamsResourcePeopleSearch, options: MethodOptions): GaxiosPromise[SchemaPeopleFeed] = js.native
  def search(
    params: ParamsResourcePeopleSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPeopleFeed]
  ): Unit = js.native
}

