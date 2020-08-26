package typings.googleapis.plusV1Mod.plusV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/plus/v1", "plus_v1.Resource$Activities")
@js.native
class ResourceActivities protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * plus.activities.get
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for
    * more details.
    * @alias plus.activities.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.activityId The ID of the activity to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaActivity] = js.native
  def get(callback: BodyResponseCallback[SchemaActivity]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaActivity] = js.native
  def get(params: ParamsResourceActivitiesGet): GaxiosPromise[SchemaActivity] = js.native
  def get(params: ParamsResourceActivitiesGet, callback: BodyResponseCallback[SchemaActivity]): Unit = js.native
  def get(
    params: ParamsResourceActivitiesGet,
    options: BodyResponseCallback[SchemaActivity],
    callback: BodyResponseCallback[SchemaActivity]
  ): Unit = js.native
  def get(params: ParamsResourceActivitiesGet, options: MethodOptions): GaxiosPromise[SchemaActivity] = js.native
  def get(
    params: ParamsResourceActivitiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaActivity]
  ): Unit = js.native
  /**
    * plus.activities.list
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for
    * more details.
    * @alias plus.activities.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collection The collection of activities to list.
    * @param {integer=} params.maxResults The maximum number of activities to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {string} params.userId The ID of the user to get activities for. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaActivityFeed] = js.native
  def list(callback: BodyResponseCallback[SchemaActivityFeed]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaActivityFeed] = js.native
  def list(params: ParamsResourceActivitiesList): GaxiosPromise[SchemaActivityFeed] = js.native
  def list(params: ParamsResourceActivitiesList, callback: BodyResponseCallback[SchemaActivityFeed]): Unit = js.native
  def list(
    params: ParamsResourceActivitiesList,
    options: BodyResponseCallback[SchemaActivityFeed],
    callback: BodyResponseCallback[SchemaActivityFeed]
  ): Unit = js.native
  def list(params: ParamsResourceActivitiesList, options: MethodOptions): GaxiosPromise[SchemaActivityFeed] = js.native
  def list(
    params: ParamsResourceActivitiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaActivityFeed]
  ): Unit = js.native
  /**
    * plus.activities.search
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for
    * more details.
    * @alias plus.activities.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language Specify the preferred language to search with. See search language codes for available values.
    * @param {integer=} params.maxResults The maximum number of activities to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    * @param {string=} params.orderBy Specifies how to order search results.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response. This token can be of any length.
    * @param {string} params.query Full-text search query string.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[SchemaActivityFeed] = js.native
  def search(callback: BodyResponseCallback[SchemaActivityFeed]): Unit = js.native
  def search(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaActivityFeed] = js.native
  def search(params: ParamsResourceActivitiesSearch): GaxiosPromise[SchemaActivityFeed] = js.native
  def search(params: ParamsResourceActivitiesSearch, callback: BodyResponseCallback[SchemaActivityFeed]): Unit = js.native
  def search(
    params: ParamsResourceActivitiesSearch,
    options: BodyResponseCallback[SchemaActivityFeed],
    callback: BodyResponseCallback[SchemaActivityFeed]
  ): Unit = js.native
  def search(params: ParamsResourceActivitiesSearch, options: MethodOptions): GaxiosPromise[SchemaActivityFeed] = js.native
  def search(
    params: ParamsResourceActivitiesSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaActivityFeed]
  ): Unit = js.native
}

