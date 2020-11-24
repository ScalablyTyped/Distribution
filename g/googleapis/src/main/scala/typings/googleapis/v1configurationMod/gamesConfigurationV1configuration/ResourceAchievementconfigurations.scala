package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gamesConfiguration/v1configuration", "gamesConfiguration_v1configuration.Resource$Achievementconfigurations")
@js.native
class ResourceAchievementconfigurations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * gamesConfiguration.achievementConfigurations.delete
    * @desc Delete the achievement configuration with the given ID.
    * @alias gamesConfiguration.achievementConfigurations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAchievementconfigurationsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAchievementconfigurationsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAchievementconfigurationsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAchievementconfigurationsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAchievementconfigurationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * gamesConfiguration.achievementConfigurations.get
    * @desc Retrieves the metadata of the achievement configuration with the
    * given ID.
    * @alias gamesConfiguration.achievementConfigurations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def get(callback: BodyResponseCallback[SchemaAchievementConfiguration]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def get(params: ParamsResourceAchievementconfigurationsGet): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def get(
    params: ParamsResourceAchievementconfigurationsGet,
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsResourceAchievementconfigurationsGet,
    options: BodyResponseCallback[SchemaAchievementConfiguration],
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  def get(params: ParamsResourceAchievementconfigurationsGet, options: MethodOptions): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def get(
    params: ParamsResourceAchievementconfigurationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  
  /**
    * gamesConfiguration.achievementConfigurations.insert
    * @desc Insert a new achievement configuration in this application.
    * @alias gamesConfiguration.achievementConfigurations.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId The application ID from the Google Play developer console.
    * @param {().AchievementConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def insert(callback: BodyResponseCallback[SchemaAchievementConfiguration]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def insert(params: ParamsResourceAchievementconfigurationsInsert): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def insert(
    params: ParamsResourceAchievementconfigurationsInsert,
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  def insert(
    params: ParamsResourceAchievementconfigurationsInsert,
    options: BodyResponseCallback[SchemaAchievementConfiguration],
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  def insert(params: ParamsResourceAchievementconfigurationsInsert, options: MethodOptions): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def insert(
    params: ParamsResourceAchievementconfigurationsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  
  /**
    * gamesConfiguration.achievementConfigurations.list
    * @desc Returns a list of the achievement configurations in this
    * application.
    * @alias gamesConfiguration.achievementConfigurations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId The application ID from the Google Play developer console.
    * @param {integer=} params.maxResults The maximum number of resource configurations to return in the response, used for paging. For any response, the actual number of resources returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAchievementConfigurationListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAchievementConfigurationListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAchievementConfigurationListResponse] = js.native
  def list(params: ParamsResourceAchievementconfigurationsList): GaxiosPromise[SchemaAchievementConfigurationListResponse] = js.native
  def list(
    params: ParamsResourceAchievementconfigurationsList,
    callback: BodyResponseCallback[SchemaAchievementConfigurationListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAchievementconfigurationsList,
    options: BodyResponseCallback[SchemaAchievementConfigurationListResponse],
    callback: BodyResponseCallback[SchemaAchievementConfigurationListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAchievementconfigurationsList, options: MethodOptions): GaxiosPromise[SchemaAchievementConfigurationListResponse] = js.native
  def list(
    params: ParamsResourceAchievementconfigurationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementConfigurationListResponse]
  ): Unit = js.native
  
  /**
    * gamesConfiguration.achievementConfigurations.patch
    * @desc Update the metadata of the achievement configuration with the given
    * ID. This method supports patch semantics.
    * @alias gamesConfiguration.achievementConfigurations.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {().AchievementConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def patch(callback: BodyResponseCallback[SchemaAchievementConfiguration]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def patch(params: ParamsResourceAchievementconfigurationsPatch): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def patch(
    params: ParamsResourceAchievementconfigurationsPatch,
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAchievementconfigurationsPatch,
    options: BodyResponseCallback[SchemaAchievementConfiguration],
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  def patch(params: ParamsResourceAchievementconfigurationsPatch, options: MethodOptions): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def patch(
    params: ParamsResourceAchievementconfigurationsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  
  /**
    * gamesConfiguration.achievementConfigurations.update
    * @desc Update the metadata of the achievement configuration with the given
    * ID.
    * @alias gamesConfiguration.achievementConfigurations.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {().AchievementConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def update(callback: BodyResponseCallback[SchemaAchievementConfiguration]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def update(params: ParamsResourceAchievementconfigurationsUpdate): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def update(
    params: ParamsResourceAchievementconfigurationsUpdate,
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  def update(
    params: ParamsResourceAchievementconfigurationsUpdate,
    options: BodyResponseCallback[SchemaAchievementConfiguration],
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
  def update(params: ParamsResourceAchievementconfigurationsUpdate, options: MethodOptions): GaxiosPromise[SchemaAchievementConfiguration] = js.native
  def update(
    params: ParamsResourceAchievementconfigurationsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAchievementConfiguration]
  ): Unit = js.native
}
