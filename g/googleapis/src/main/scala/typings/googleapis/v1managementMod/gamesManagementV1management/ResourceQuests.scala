package typings.googleapis.v1managementMod.gamesManagementV1management

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Quests")
@js.native
class ResourceQuests protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * gamesManagement.quests.reset
    * @desc Resets all player progress on the quest with the given ID for the
    * currently authenticated player. This method is only accessible to
    * whitelisted tester accounts for your application.
    * @alias gamesManagement.quests.reset
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.questId The ID of the quest.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reset(): GaxiosPromise[Unit] = js.native
  def reset(callback: BodyResponseCallback[Unit]): Unit = js.native
  def reset(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def reset(params: ParamsResourceQuestsReset): GaxiosPromise[Unit] = js.native
  def reset(params: ParamsResourceQuestsReset, callback: BodyResponseCallback[Unit]): Unit = js.native
  def reset(
    params: ParamsResourceQuestsReset,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def reset(params: ParamsResourceQuestsReset, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def reset(params: ParamsResourceQuestsReset, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * gamesManagement.quests.resetAll
    * @desc Resets all player progress on all quests for the currently
    * authenticated player. This method is only accessible to whitelisted
    * tester accounts for your application.
    * @alias gamesManagement.quests.resetAll
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetAll(): GaxiosPromise[Unit] = js.native
  def resetAll(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAll(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetAll(params: ParamsResourceQuestsResetall): GaxiosPromise[Unit] = js.native
  def resetAll(params: ParamsResourceQuestsResetall, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAll(
    params: ParamsResourceQuestsResetall,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetAll(params: ParamsResourceQuestsResetall, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetAll(params: ParamsResourceQuestsResetall, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * gamesManagement.quests.resetAllForAllPlayers
    * @desc Resets all draft quests for all players. This method is only
    * available to user accounts for your developer console.
    * @alias gamesManagement.quests.resetAllForAllPlayers
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
  def resetAllForAllPlayers(params: ParamsResourceQuestsResetallforallplayers): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(params: ParamsResourceQuestsResetallforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAllForAllPlayers(
    params: ParamsResourceQuestsResetallforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetAllForAllPlayers(params: ParamsResourceQuestsResetallforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(
    params: ParamsResourceQuestsResetallforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * gamesManagement.quests.resetForAllPlayers
    * @desc Resets all player progress on the quest with the given ID for all
    * players. This method is only available to user accounts for your
    * developer console. Only draft quests can be reset.
    * @alias gamesManagement.quests.resetForAllPlayers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.questId The ID of the quest.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(params: ParamsResourceQuestsResetforallplayers): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(params: ParamsResourceQuestsResetforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(
    params: ParamsResourceQuestsResetforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(params: ParamsResourceQuestsResetforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsResourceQuestsResetforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * gamesManagement.quests.resetMultipleForAllPlayers
    * @desc Resets quests with the given IDs for all players. This method is
    * only available to user accounts for your developer console. Only draft
    * quests may be reset.
    * @alias gamesManagement.quests.resetMultipleForAllPlayers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().QuestsResetMultipleForAllRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetMultipleForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetMultipleForAllPlayers(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(params: ParamsResourceQuestsResetmultipleforallplayers): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(params: ParamsResourceQuestsResetmultipleforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetMultipleForAllPlayers(
    params: ParamsResourceQuestsResetmultipleforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetMultipleForAllPlayers(params: ParamsResourceQuestsResetmultipleforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(
    params: ParamsResourceQuestsResetmultipleforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}
