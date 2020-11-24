package typings.googleapis.gamesV1Mod.gamesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Leaderboards")
@js.native
class ResourceLeaderboards protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * games.leaderboards.get
    * @desc Retrieves the metadata of the leaderboard with the given ID.
    * @alias games.leaderboards.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaLeaderboard] = js.native
  def get(callback: BodyResponseCallback[SchemaLeaderboard]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLeaderboard] = js.native
  def get(params: ParamsResourceLeaderboardsGet): GaxiosPromise[SchemaLeaderboard] = js.native
  def get(params: ParamsResourceLeaderboardsGet, callback: BodyResponseCallback[SchemaLeaderboard]): Unit = js.native
  def get(
    params: ParamsResourceLeaderboardsGet,
    options: BodyResponseCallback[SchemaLeaderboard],
    callback: BodyResponseCallback[SchemaLeaderboard]
  ): Unit = js.native
  def get(params: ParamsResourceLeaderboardsGet, options: MethodOptions): GaxiosPromise[SchemaLeaderboard] = js.native
  def get(
    params: ParamsResourceLeaderboardsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboard]
  ): Unit = js.native
  
  /**
    * games.leaderboards.list
    * @desc Lists all the leaderboard metadata for your application.
    * @alias games.leaderboards.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of leaderboards to return in the response. For any response, the actual number of leaderboards returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaLeaderboardListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaLeaderboardListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLeaderboardListResponse] = js.native
  def list(params: ParamsResourceLeaderboardsList): GaxiosPromise[SchemaLeaderboardListResponse] = js.native
  def list(
    params: ParamsResourceLeaderboardsList,
    callback: BodyResponseCallback[SchemaLeaderboardListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLeaderboardsList,
    options: BodyResponseCallback[SchemaLeaderboardListResponse],
    callback: BodyResponseCallback[SchemaLeaderboardListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLeaderboardsList, options: MethodOptions): GaxiosPromise[SchemaLeaderboardListResponse] = js.native
  def list(
    params: ParamsResourceLeaderboardsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboardListResponse]
  ): Unit = js.native
}
