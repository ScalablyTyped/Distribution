package typings.googleapis.gamesV1Mod.gamesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Quests")
@js.native
class ResourceQuests protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * games.quests.accept
    * @desc Indicates that the currently authorized user will participate in
    * the quest.
    * @alias games.quests.accept
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.questId The ID of the quest.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def accept(): GaxiosPromise[SchemaQuest] = js.native
  def accept(callback: BodyResponseCallback[SchemaQuest]): Unit = js.native
  def accept(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaQuest] = js.native
  def accept(params: ParamsResourceQuestsAccept): GaxiosPromise[SchemaQuest] = js.native
  def accept(params: ParamsResourceQuestsAccept, callback: BodyResponseCallback[SchemaQuest]): Unit = js.native
  def accept(
    params: ParamsResourceQuestsAccept,
    options: BodyResponseCallback[SchemaQuest],
    callback: BodyResponseCallback[SchemaQuest]
  ): Unit = js.native
  def accept(params: ParamsResourceQuestsAccept, options: MethodOptions): GaxiosPromise[SchemaQuest] = js.native
  def accept(
    params: ParamsResourceQuestsAccept,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQuest]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * games.quests.list
    * @desc Get a list of quests for your application and the currently
    * authenticated player.
    * @alias games.quests.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of quest resources to return in the response, used for paging. For any response, the actual number of quest resources returned may be less than the specified maxResults. Acceptable values are 1 to 50, inclusive. (Default: 50).
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {string} params.playerId A player ID. A value of me may be used in place of the authenticated player's ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaQuestListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaQuestListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaQuestListResponse] = js.native
  def list(params: ParamsResourceQuestsList): GaxiosPromise[SchemaQuestListResponse] = js.native
  def list(params: ParamsResourceQuestsList, callback: BodyResponseCallback[SchemaQuestListResponse]): Unit = js.native
  def list(
    params: ParamsResourceQuestsList,
    options: BodyResponseCallback[SchemaQuestListResponse],
    callback: BodyResponseCallback[SchemaQuestListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceQuestsList, options: MethodOptions): GaxiosPromise[SchemaQuestListResponse] = js.native
  def list(
    params: ParamsResourceQuestsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQuestListResponse]
  ): Unit = js.native
}
