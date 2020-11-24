package typings.googleapis.gamesV1Mod.gamesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Metagame")
@js.native
class ResourceMetagame protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * games.metagame.getMetagameConfig
    * @desc Return the metagame configuration data for the calling application.
    * @alias games.metagame.getMetagameConfig
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getMetagameConfig(): GaxiosPromise[SchemaMetagameConfig] = js.native
  def getMetagameConfig(callback: BodyResponseCallback[SchemaMetagameConfig]): Unit = js.native
  def getMetagameConfig(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMetagameConfig] = js.native
  def getMetagameConfig(params: ParamsResourceMetagameGetmetagameconfig): GaxiosPromise[SchemaMetagameConfig] = js.native
  def getMetagameConfig(
    params: ParamsResourceMetagameGetmetagameconfig,
    callback: BodyResponseCallback[SchemaMetagameConfig]
  ): Unit = js.native
  def getMetagameConfig(
    params: ParamsResourceMetagameGetmetagameconfig,
    options: BodyResponseCallback[SchemaMetagameConfig],
    callback: BodyResponseCallback[SchemaMetagameConfig]
  ): Unit = js.native
  def getMetagameConfig(params: ParamsResourceMetagameGetmetagameconfig, options: MethodOptions): GaxiosPromise[SchemaMetagameConfig] = js.native
  def getMetagameConfig(
    params: ParamsResourceMetagameGetmetagameconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMetagameConfig]
  ): Unit = js.native
  
  /**
    * games.metagame.listCategoriesByPlayer
    * @desc List play data aggregated per category for the player corresponding
    * to playerId.
    * @alias games.metagame.listCategoriesByPlayer
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collection The collection of categories for which data will be returned.
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of category resources to return in the response, used for paging. For any response, the actual number of category resources returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {string} params.playerId A player ID. A value of me may be used in place of the authenticated player's ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listCategoriesByPlayer(): GaxiosPromise[SchemaCategoryListResponse] = js.native
  def listCategoriesByPlayer(callback: BodyResponseCallback[SchemaCategoryListResponse]): Unit = js.native
  def listCategoriesByPlayer(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCategoryListResponse] = js.native
  def listCategoriesByPlayer(params: ParamsResourceMetagameListcategoriesbyplayer): GaxiosPromise[SchemaCategoryListResponse] = js.native
  def listCategoriesByPlayer(
    params: ParamsResourceMetagameListcategoriesbyplayer,
    callback: BodyResponseCallback[SchemaCategoryListResponse]
  ): Unit = js.native
  def listCategoriesByPlayer(
    params: ParamsResourceMetagameListcategoriesbyplayer,
    options: BodyResponseCallback[SchemaCategoryListResponse],
    callback: BodyResponseCallback[SchemaCategoryListResponse]
  ): Unit = js.native
  def listCategoriesByPlayer(params: ParamsResourceMetagameListcategoriesbyplayer, options: MethodOptions): GaxiosPromise[SchemaCategoryListResponse] = js.native
  def listCategoriesByPlayer(
    params: ParamsResourceMetagameListcategoriesbyplayer,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCategoryListResponse]
  ): Unit = js.native
}
