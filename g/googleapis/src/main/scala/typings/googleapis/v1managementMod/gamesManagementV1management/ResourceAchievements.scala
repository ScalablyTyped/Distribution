package typings.googleapis.v1managementMod.gamesManagementV1management

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Achievements")
@js.native
class ResourceAchievements protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * gamesManagement.achievements.reset
    * @desc Resets the achievement with the given ID for the currently
    * authenticated player. This method is only accessible to whitelisted
    * tester accounts for your application.
    * @alias gamesManagement.achievements.reset
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reset(): GaxiosPromise[SchemaAchievementResetResponse] = js.native
  def reset(callback: BodyResponseCallback[SchemaAchievementResetResponse]): Unit = js.native
  def reset(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAchievementResetResponse] = js.native
  def reset(params: ParamsResourceAchievementsReset): GaxiosPromise[SchemaAchievementResetResponse] = js.native
  def reset(
    params: ParamsResourceAchievementsReset,
    callback: BodyResponseCallback[SchemaAchievementResetResponse]
  ): Unit = js.native
  def reset(
    params: ParamsResourceAchievementsReset,
    options: BodyResponseCallback[SchemaAchievementResetResponse],
    callback: BodyResponseCallback[SchemaAchievementResetResponse]
  ): Unit = js.native
  def reset(params: ParamsResourceAchievementsReset, options: MethodOptions): GaxiosPromise[SchemaAchievementResetResponse] = js.native
  def reset(
    params: ParamsResourceAchievementsReset,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementResetResponse]
  ): Unit = js.native
  
  /**
    * gamesManagement.achievements.resetAll
    * @desc Resets all achievements for the currently authenticated player for
    * your application. This method is only accessible to whitelisted tester
    * accounts for your application.
    * @alias gamesManagement.achievements.resetAll
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetAll(): GaxiosPromise[SchemaAchievementResetAllResponse] = js.native
  def resetAll(callback: BodyResponseCallback[SchemaAchievementResetAllResponse]): Unit = js.native
  def resetAll(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAchievementResetAllResponse] = js.native
  def resetAll(params: ParamsResourceAchievementsResetall): GaxiosPromise[SchemaAchievementResetAllResponse] = js.native
  def resetAll(
    params: ParamsResourceAchievementsResetall,
    callback: BodyResponseCallback[SchemaAchievementResetAllResponse]
  ): Unit = js.native
  def resetAll(
    params: ParamsResourceAchievementsResetall,
    options: BodyResponseCallback[SchemaAchievementResetAllResponse],
    callback: BodyResponseCallback[SchemaAchievementResetAllResponse]
  ): Unit = js.native
  def resetAll(params: ParamsResourceAchievementsResetall, options: MethodOptions): GaxiosPromise[SchemaAchievementResetAllResponse] = js.native
  def resetAll(
    params: ParamsResourceAchievementsResetall,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementResetAllResponse]
  ): Unit = js.native
  
  /**
    * gamesManagement.achievements.resetAllForAllPlayers
    * @desc Resets all draft achievements for all players. This method is only
    * available to user accounts for your developer console.
    * @alias gamesManagement.achievements.resetAllForAllPlayers
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetAllForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAllForAllPlayers(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(params: ParamsResourceAchievementsResetallforallplayers): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(params: ParamsResourceAchievementsResetallforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAllForAllPlayers(
    params: ParamsResourceAchievementsResetallforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetAllForAllPlayers(params: ParamsResourceAchievementsResetallforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(
    params: ParamsResourceAchievementsResetallforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * gamesManagement.achievements.resetForAllPlayers
    * @desc Resets the achievement with the given ID for all players. This
    * method is only available to user accounts for your developer console.
    * Only draft achievements can be reset.
    * @alias gamesManagement.achievements.resetForAllPlayers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(params: ParamsResourceAchievementsResetforallplayers): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(params: ParamsResourceAchievementsResetforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(
    params: ParamsResourceAchievementsResetforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(params: ParamsResourceAchievementsResetforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsResourceAchievementsResetforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * gamesManagement.achievements.resetMultipleForAllPlayers
    * @desc Resets achievements with the given IDs for all players. This method
    * is only available to user accounts for your developer console. Only draft
    * achievements may be reset.
    * @alias gamesManagement.achievements.resetMultipleForAllPlayers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AchievementResetMultipleForAllRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetMultipleForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetMultipleForAllPlayers(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(params: ParamsResourceAchievementsResetmultipleforallplayers): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(params: ParamsResourceAchievementsResetmultipleforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetMultipleForAllPlayers(
    params: ParamsResourceAchievementsResetmultipleforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetMultipleForAllPlayers(params: ParamsResourceAchievementsResetmultipleforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(
    params: ParamsResourceAchievementsResetmultipleforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}
