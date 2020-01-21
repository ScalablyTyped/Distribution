package typings.googleapis.gamesV1Mod.gamesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Achievementdefinitions")
@js.native
class ResourceAchievementdefinitions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.achievementDefinitions.list
    * @desc Lists all the achievement definitions for your application.
    * @alias games.achievementDefinitions.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of achievement resources to return in the response, used for paging. For any response, the actual number of achievement resources returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAchievementDefinitionsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAchievementDefinitionsListResponse]): Unit = js.native
  def list(params: ParamsResourceAchievementdefinitionsList): GaxiosPromise[SchemaAchievementDefinitionsListResponse] = js.native
  def list(
    params: ParamsResourceAchievementdefinitionsList,
    callback: BodyResponseCallback[SchemaAchievementDefinitionsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAchievementdefinitionsList,
    options: BodyResponseCallback[SchemaAchievementDefinitionsListResponse],
    callback: BodyResponseCallback[SchemaAchievementDefinitionsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAchievementdefinitionsList, options: MethodOptions): GaxiosPromise[SchemaAchievementDefinitionsListResponse] = js.native
  def list(
    params: ParamsResourceAchievementdefinitionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementDefinitionsListResponse]
  ): Unit = js.native
}

