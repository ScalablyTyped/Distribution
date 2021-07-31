package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gamesConfiguration/v1configuration", "gamesConfiguration_v1configuration.Resource$Leaderboardconfigurations")
@js.native
class ResourceLeaderboardconfigurations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * gamesConfiguration.leaderboardConfigurations.delete
    * @desc Delete the leaderboard configuration with the given ID.
    * @alias gamesConfiguration.leaderboardConfigurations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceLeaderboardconfigurationsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceLeaderboardconfigurationsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceLeaderboardconfigurationsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceLeaderboardconfigurationsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceLeaderboardconfigurationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * gamesConfiguration.leaderboardConfigurations.get
    * @desc Retrieves the metadata of the leaderboard configuration with the
    * given ID.
    * @alias gamesConfiguration.leaderboardConfigurations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def get(callback: BodyResponseCallback[SchemaLeaderboardConfiguration]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def get(params: ParamsResourceLeaderboardconfigurationsGet): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def get(
    params: ParamsResourceLeaderboardconfigurationsGet,
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsResourceLeaderboardconfigurationsGet,
    options: BodyResponseCallback[SchemaLeaderboardConfiguration],
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  def get(params: ParamsResourceLeaderboardconfigurationsGet, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def get(
    params: ParamsResourceLeaderboardconfigurationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  
  /**
    * gamesConfiguration.leaderboardConfigurations.insert
    * @desc Insert a new leaderboard configuration in this application.
    * @alias gamesConfiguration.leaderboardConfigurations.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId The application ID from the Google Play developer console.
    * @param {().LeaderboardConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def insert(callback: BodyResponseCallback[SchemaLeaderboardConfiguration]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def insert(params: ParamsResourceLeaderboardconfigurationsInsert): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def insert(
    params: ParamsResourceLeaderboardconfigurationsInsert,
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  def insert(
    params: ParamsResourceLeaderboardconfigurationsInsert,
    options: BodyResponseCallback[SchemaLeaderboardConfiguration],
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  def insert(params: ParamsResourceLeaderboardconfigurationsInsert, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def insert(
    params: ParamsResourceLeaderboardconfigurationsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  
  /**
    * gamesConfiguration.leaderboardConfigurations.list
    * @desc Returns a list of the leaderboard configurations in this
    * application.
    * @alias gamesConfiguration.leaderboardConfigurations.list
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
  def list(): GaxiosPromise[SchemaLeaderboardConfigurationListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaLeaderboardConfigurationListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfigurationListResponse] = js.native
  def list(params: ParamsResourceLeaderboardconfigurationsList): GaxiosPromise[SchemaLeaderboardConfigurationListResponse] = js.native
  def list(
    params: ParamsResourceLeaderboardconfigurationsList,
    callback: BodyResponseCallback[SchemaLeaderboardConfigurationListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLeaderboardconfigurationsList,
    options: BodyResponseCallback[SchemaLeaderboardConfigurationListResponse],
    callback: BodyResponseCallback[SchemaLeaderboardConfigurationListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLeaderboardconfigurationsList, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfigurationListResponse] = js.native
  def list(
    params: ParamsResourceLeaderboardconfigurationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboardConfigurationListResponse]
  ): Unit = js.native
  
  /**
    * gamesConfiguration.leaderboardConfigurations.patch
    * @desc Update the metadata of the leaderboard configuration with the given
    * ID. This method supports patch semantics.
    * @alias gamesConfiguration.leaderboardConfigurations.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {().LeaderboardConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def patch(callback: BodyResponseCallback[SchemaLeaderboardConfiguration]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def patch(params: ParamsResourceLeaderboardconfigurationsPatch): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def patch(
    params: ParamsResourceLeaderboardconfigurationsPatch,
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  def patch(
    params: ParamsResourceLeaderboardconfigurationsPatch,
    options: BodyResponseCallback[SchemaLeaderboardConfiguration],
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  def patch(params: ParamsResourceLeaderboardconfigurationsPatch, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def patch(
    params: ParamsResourceLeaderboardconfigurationsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  
  /**
    * gamesConfiguration.leaderboardConfigurations.update
    * @desc Update the metadata of the leaderboard configuration with the given
    * ID.
    * @alias gamesConfiguration.leaderboardConfigurations.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {().LeaderboardConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def update(callback: BodyResponseCallback[SchemaLeaderboardConfiguration]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def update(params: ParamsResourceLeaderboardconfigurationsUpdate): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def update(
    params: ParamsResourceLeaderboardconfigurationsUpdate,
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  def update(
    params: ParamsResourceLeaderboardconfigurationsUpdate,
    options: BodyResponseCallback[SchemaLeaderboardConfiguration],
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
  def update(params: ParamsResourceLeaderboardconfigurationsUpdate, options: MethodOptions): GaxiosPromise[SchemaLeaderboardConfiguration] = js.native
  def update(
    params: ParamsResourceLeaderboardconfigurationsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLeaderboardConfiguration]
  ): Unit = js.native
}
