package typings.googleapis.v1managementMod.gamesManagementV1management

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Scores")
@js.native
class ResourceScores protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gamesManagement.scores.reset
    * @desc Resets scores for the leaderboard with the given ID for the
    * currently authenticated player. This method is only accessible to
    * whitelisted tester accounts for your application.
    * @alias gamesManagement.scores.reset
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reset(): GaxiosPromise[SchemaPlayerScoreResetResponse] = js.native
  def reset(callback: BodyResponseCallback[SchemaPlayerScoreResetResponse]): Unit = js.native
  def reset(params: ParamsResourceScoresReset): GaxiosPromise[SchemaPlayerScoreResetResponse] = js.native
  def reset(params: ParamsResourceScoresReset, callback: BodyResponseCallback[SchemaPlayerScoreResetResponse]): Unit = js.native
  def reset(
    params: ParamsResourceScoresReset,
    options: BodyResponseCallback[SchemaPlayerScoreResetResponse],
    callback: BodyResponseCallback[SchemaPlayerScoreResetResponse]
  ): Unit = js.native
  def reset(params: ParamsResourceScoresReset, options: MethodOptions): GaxiosPromise[SchemaPlayerScoreResetResponse] = js.native
  def reset(
    params: ParamsResourceScoresReset,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayerScoreResetResponse]
  ): Unit = js.native
  /**
    * gamesManagement.scores.resetAll
    * @desc Resets all scores for all leaderboards for the currently
    * authenticated players. This method is only accessible to whitelisted
    * tester accounts for your application.
    * @alias gamesManagement.scores.resetAll
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetAll(): GaxiosPromise[SchemaPlayerScoreResetAllResponse] = js.native
  def resetAll(callback: BodyResponseCallback[SchemaPlayerScoreResetAllResponse]): Unit = js.native
  def resetAll(params: ParamsResourceScoresResetall): GaxiosPromise[SchemaPlayerScoreResetAllResponse] = js.native
  def resetAll(
    params: ParamsResourceScoresResetall,
    callback: BodyResponseCallback[SchemaPlayerScoreResetAllResponse]
  ): Unit = js.native
  def resetAll(
    params: ParamsResourceScoresResetall,
    options: BodyResponseCallback[SchemaPlayerScoreResetAllResponse],
    callback: BodyResponseCallback[SchemaPlayerScoreResetAllResponse]
  ): Unit = js.native
  def resetAll(params: ParamsResourceScoresResetall, options: MethodOptions): GaxiosPromise[SchemaPlayerScoreResetAllResponse] = js.native
  def resetAll(
    params: ParamsResourceScoresResetall,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayerScoreResetAllResponse]
  ): Unit = js.native
  /**
    * gamesManagement.scores.resetAllForAllPlayers
    * @desc Resets scores for all draft leaderboards for all players. This
    * method is only available to user accounts for your developer console.
    * @alias gamesManagement.scores.resetAllForAllPlayers
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetAllForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAllForAllPlayers(params: ParamsResourceScoresResetallforallplayers): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(params: ParamsResourceScoresResetallforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAllForAllPlayers(
    params: ParamsResourceScoresResetallforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetAllForAllPlayers(params: ParamsResourceScoresResetallforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(
    params: ParamsResourceScoresResetallforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.scores.resetForAllPlayers
    * @desc Resets scores for the leaderboard with the given ID for all
    * players. This method is only available to user accounts for your
    * developer console. Only draft leaderboards can be reset.
    * @alias gamesManagement.scores.resetForAllPlayers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(params: ParamsResourceScoresResetforallplayers): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(params: ParamsResourceScoresResetforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(
    params: ParamsResourceScoresResetforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(params: ParamsResourceScoresResetforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsResourceScoresResetforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.scores.resetMultipleForAllPlayers
    * @desc Resets scores for the leaderboards with the given IDs for all
    * players. This method is only available to user accounts for your
    * developer console. Only draft leaderboards may be reset.
    * @alias gamesManagement.scores.resetMultipleForAllPlayers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ScoresResetMultipleForAllRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetMultipleForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetMultipleForAllPlayers(params: ParamsResourceScoresResetmultipleforallplayers): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(params: ParamsResourceScoresResetmultipleforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetMultipleForAllPlayers(
    params: ParamsResourceScoresResetmultipleforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetMultipleForAllPlayers(params: ParamsResourceScoresResetmultipleforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(
    params: ParamsResourceScoresResetmultipleforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

