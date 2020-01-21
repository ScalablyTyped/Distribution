package typings.googleapis.gamesV1Mod.gamesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Achievements")
@js.native
class ResourceAchievements protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.achievements.increment
    * @desc Increments the steps of the achievement with the given ID for the
    * currently authenticated player.
    * @alias games.achievements.increment
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {string=} params.requestId A randomly generated numeric ID for each request specified by the caller. This number is used at the server to ensure that the request is handled correctly across retries.
    * @param {integer} params.stepsToIncrement The number of steps to increment.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def increment(): GaxiosPromise[SchemaAchievementIncrementResponse] = js.native
  def increment(callback: BodyResponseCallback[SchemaAchievementIncrementResponse]): Unit = js.native
  def increment(params: ParamsResourceAchievementsIncrement): GaxiosPromise[SchemaAchievementIncrementResponse] = js.native
  def increment(
    params: ParamsResourceAchievementsIncrement,
    callback: BodyResponseCallback[SchemaAchievementIncrementResponse]
  ): Unit = js.native
  def increment(
    params: ParamsResourceAchievementsIncrement,
    options: BodyResponseCallback[SchemaAchievementIncrementResponse],
    callback: BodyResponseCallback[SchemaAchievementIncrementResponse]
  ): Unit = js.native
  def increment(params: ParamsResourceAchievementsIncrement, options: MethodOptions): GaxiosPromise[SchemaAchievementIncrementResponse] = js.native
  def increment(
    params: ParamsResourceAchievementsIncrement,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementIncrementResponse]
  ): Unit = js.native
  /**
    * games.achievements.list
    * @desc Lists the progress for all your application's achievements for the
    * currently authenticated player.
    * @alias games.achievements.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of achievement resources to return in the response, used for paging. For any response, the actual number of achievement resources returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {string} params.playerId A player ID. A value of me may be used in place of the authenticated player's ID.
    * @param {string=} params.state Tells the server to return only achievements with the specified state. If this parameter isn't specified, all achievements are returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPlayerAchievementListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPlayerAchievementListResponse]): Unit = js.native
  def list(params: ParamsResourceAchievementsList): GaxiosPromise[SchemaPlayerAchievementListResponse] = js.native
  def list(
    params: ParamsResourceAchievementsList,
    callback: BodyResponseCallback[SchemaPlayerAchievementListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAchievementsList,
    options: BodyResponseCallback[SchemaPlayerAchievementListResponse],
    callback: BodyResponseCallback[SchemaPlayerAchievementListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAchievementsList, options: MethodOptions): GaxiosPromise[SchemaPlayerAchievementListResponse] = js.native
  def list(
    params: ParamsResourceAchievementsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayerAchievementListResponse]
  ): Unit = js.native
  /**
    * games.achievements.reveal
    * @desc Sets the state of the achievement with the given ID to REVEALED for
    * the currently authenticated player.
    * @alias games.achievements.reveal
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reveal(): GaxiosPromise[SchemaAchievementRevealResponse] = js.native
  def reveal(callback: BodyResponseCallback[SchemaAchievementRevealResponse]): Unit = js.native
  def reveal(params: ParamsResourceAchievementsReveal): GaxiosPromise[SchemaAchievementRevealResponse] = js.native
  def reveal(
    params: ParamsResourceAchievementsReveal,
    callback: BodyResponseCallback[SchemaAchievementRevealResponse]
  ): Unit = js.native
  def reveal(
    params: ParamsResourceAchievementsReveal,
    options: BodyResponseCallback[SchemaAchievementRevealResponse],
    callback: BodyResponseCallback[SchemaAchievementRevealResponse]
  ): Unit = js.native
  def reveal(params: ParamsResourceAchievementsReveal, options: MethodOptions): GaxiosPromise[SchemaAchievementRevealResponse] = js.native
  def reveal(
    params: ParamsResourceAchievementsReveal,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementRevealResponse]
  ): Unit = js.native
  /**
    * games.achievements.setStepsAtLeast
    * @desc Sets the steps for the currently authenticated player towards
    * unlocking an achievement. If the steps parameter is less than the current
    * number of steps that the player already gained for the achievement, the
    * achievement is not modified.
    * @alias games.achievements.setStepsAtLeast
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {integer} params.steps The minimum value to set the steps to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setStepsAtLeast(): GaxiosPromise[SchemaAchievementSetStepsAtLeastResponse] = js.native
  def setStepsAtLeast(callback: BodyResponseCallback[SchemaAchievementSetStepsAtLeastResponse]): Unit = js.native
  def setStepsAtLeast(params: ParamsResourceAchievementsSetstepsatleast): GaxiosPromise[SchemaAchievementSetStepsAtLeastResponse] = js.native
  def setStepsAtLeast(
    params: ParamsResourceAchievementsSetstepsatleast,
    callback: BodyResponseCallback[SchemaAchievementSetStepsAtLeastResponse]
  ): Unit = js.native
  def setStepsAtLeast(
    params: ParamsResourceAchievementsSetstepsatleast,
    options: BodyResponseCallback[SchemaAchievementSetStepsAtLeastResponse],
    callback: BodyResponseCallback[SchemaAchievementSetStepsAtLeastResponse]
  ): Unit = js.native
  def setStepsAtLeast(params: ParamsResourceAchievementsSetstepsatleast, options: MethodOptions): GaxiosPromise[SchemaAchievementSetStepsAtLeastResponse] = js.native
  def setStepsAtLeast(
    params: ParamsResourceAchievementsSetstepsatleast,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementSetStepsAtLeastResponse]
  ): Unit = js.native
  /**
    * games.achievements.unlock
    * @desc Unlocks this achievement for the currently authenticated player.
    * @alias games.achievements.unlock
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {string=} params.builtinGameId Override used only by built-in games in Play Games application.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def unlock(): GaxiosPromise[SchemaAchievementUnlockResponse] = js.native
  def unlock(callback: BodyResponseCallback[SchemaAchievementUnlockResponse]): Unit = js.native
  def unlock(params: ParamsResourceAchievementsUnlock): GaxiosPromise[SchemaAchievementUnlockResponse] = js.native
  def unlock(
    params: ParamsResourceAchievementsUnlock,
    callback: BodyResponseCallback[SchemaAchievementUnlockResponse]
  ): Unit = js.native
  def unlock(
    params: ParamsResourceAchievementsUnlock,
    options: BodyResponseCallback[SchemaAchievementUnlockResponse],
    callback: BodyResponseCallback[SchemaAchievementUnlockResponse]
  ): Unit = js.native
  def unlock(params: ParamsResourceAchievementsUnlock, options: MethodOptions): GaxiosPromise[SchemaAchievementUnlockResponse] = js.native
  def unlock(
    params: ParamsResourceAchievementsUnlock,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementUnlockResponse]
  ): Unit = js.native
  /**
    * games.achievements.updateMultiple
    * @desc Updates multiple achievements for the currently authenticated
    * player.
    * @alias games.achievements.updateMultiple
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.builtinGameId Override used only by built-in games in Play Games application.
    * @param {().AchievementUpdateMultipleRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateMultiple(): GaxiosPromise[SchemaAchievementUpdateMultipleResponse] = js.native
  def updateMultiple(callback: BodyResponseCallback[SchemaAchievementUpdateMultipleResponse]): Unit = js.native
  def updateMultiple(params: ParamsResourceAchievementsUpdatemultiple): GaxiosPromise[SchemaAchievementUpdateMultipleResponse] = js.native
  def updateMultiple(
    params: ParamsResourceAchievementsUpdatemultiple,
    callback: BodyResponseCallback[SchemaAchievementUpdateMultipleResponse]
  ): Unit = js.native
  def updateMultiple(
    params: ParamsResourceAchievementsUpdatemultiple,
    options: BodyResponseCallback[SchemaAchievementUpdateMultipleResponse],
    callback: BodyResponseCallback[SchemaAchievementUpdateMultipleResponse]
  ): Unit = js.native
  def updateMultiple(params: ParamsResourceAchievementsUpdatemultiple, options: MethodOptions): GaxiosPromise[SchemaAchievementUpdateMultipleResponse] = js.native
  def updateMultiple(
    params: ParamsResourceAchievementsUpdatemultiple,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementUpdateMultipleResponse]
  ): Unit = js.native
}

