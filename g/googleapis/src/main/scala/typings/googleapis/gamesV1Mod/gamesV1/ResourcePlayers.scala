package typings.googleapis.gamesV1Mod.gamesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Players")
@js.native
class ResourcePlayers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.players.get
    * @desc Retrieves the Player resource with the given ID. To retrieve the
    * player for the currently authenticated user, set playerId to me.
    * @alias games.players.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.playerId A player ID. A value of me may be used in place of the authenticated player's ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPlayer] = js.native
  def get(callback: BodyResponseCallback[SchemaPlayer]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlayer] = js.native
  def get(params: ParamsResourcePlayersGet): GaxiosPromise[SchemaPlayer] = js.native
  def get(params: ParamsResourcePlayersGet, callback: BodyResponseCallback[SchemaPlayer]): Unit = js.native
  def get(
    params: ParamsResourcePlayersGet,
    options: BodyResponseCallback[SchemaPlayer],
    callback: BodyResponseCallback[SchemaPlayer]
  ): Unit = js.native
  def get(params: ParamsResourcePlayersGet, options: MethodOptions): GaxiosPromise[SchemaPlayer] = js.native
  def get(
    params: ParamsResourcePlayersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayer]
  ): Unit = js.native
  /**
    * games.players.list
    * @desc Get the collection of players for the currently authenticated user.
    * @alias games.players.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collection Collection of players being retrieved
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of player resources to return in the response, used for paging. For any response, the actual number of player resources returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPlayerListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPlayerListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlayerListResponse] = js.native
  def list(params: ParamsResourcePlayersList): GaxiosPromise[SchemaPlayerListResponse] = js.native
  def list(params: ParamsResourcePlayersList, callback: BodyResponseCallback[SchemaPlayerListResponse]): Unit = js.native
  def list(
    params: ParamsResourcePlayersList,
    options: BodyResponseCallback[SchemaPlayerListResponse],
    callback: BodyResponseCallback[SchemaPlayerListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlayersList, options: MethodOptions): GaxiosPromise[SchemaPlayerListResponse] = js.native
  def list(
    params: ParamsResourcePlayersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayerListResponse]
  ): Unit = js.native
}

