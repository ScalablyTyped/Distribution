package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Uptimecheckconfigs")
@js.native
class ResourceProjectsUptimecheckconfigs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * monitoring.projects.uptimeCheckConfigs.create
    * @desc Creates a new uptime check configuration.
    * @alias monitoring.projects.uptimeCheckConfigs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project in which to create the uptime check. The format  is projects/[PROJECT_ID].
    * @param {().UptimeCheckConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaUptimeCheckConfig]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def create(params: ParamsResourceProjectsUptimecheckconfigsCreate): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def create(
    params: ParamsResourceProjectsUptimecheckconfigsCreate,
    callback: BodyResponseCallback[SchemaUptimeCheckConfig]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsUptimecheckconfigsCreate,
    options: BodyResponseCallback[SchemaUptimeCheckConfig],
    callback: BodyResponseCallback[SchemaUptimeCheckConfig]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsUptimecheckconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def create(
    params: ParamsResourceProjectsUptimecheckconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUptimeCheckConfig]
  ): Unit = js.native
  
  /**
    * monitoring.projects.uptimeCheckConfigs.delete
    * @desc Deletes an uptime check configuration. Note that this method will
    * fail if the uptime check configuration is referenced by an alert policy
    * or other dependent configs that would be rendered invalid by the
    * deletion.
    * @alias monitoring.projects.uptimeCheckConfigs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The uptime check configuration to delete. The format  is projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID].
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsUptimecheckconfigsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsUptimecheckconfigsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsUptimecheckconfigsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsUptimecheckconfigsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsUptimecheckconfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * monitoring.projects.uptimeCheckConfigs.get
    * @desc Gets a single uptime check configuration.
    * @alias monitoring.projects.uptimeCheckConfigs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The uptime check configuration to retrieve. The format  is projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID].
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaUptimeCheckConfig]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def get(params: ParamsResourceProjectsUptimecheckconfigsGet): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def get(
    params: ParamsResourceProjectsUptimecheckconfigsGet,
    callback: BodyResponseCallback[SchemaUptimeCheckConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsUptimecheckconfigsGet,
    options: BodyResponseCallback[SchemaUptimeCheckConfig],
    callback: BodyResponseCallback[SchemaUptimeCheckConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsUptimecheckconfigsGet, options: MethodOptions): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def get(
    params: ParamsResourceProjectsUptimecheckconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUptimeCheckConfig]
  ): Unit = js.native
  
  /**
    * monitoring.projects.uptimeCheckConfigs.list
    * @desc Lists the existing valid uptime check configurations for the
    * project, leaving out any invalid configurations.
    * @alias monitoring.projects.uptimeCheckConfigs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of results to return in a single response. The server may further constrain the maximum number of results returned in a single page. If the page_size is <=0, the server will decide the number of results to be returned.
    * @param {string=} params.pageToken If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return more results from the previous method call.
    * @param {string} params.parent The project whose uptime check configurations are listed. The format  is projects/[PROJECT_ID].
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListUptimeCheckConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUptimeCheckConfigsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListUptimeCheckConfigsResponse] = js.native
  def list(params: ParamsResourceProjectsUptimecheckconfigsList): GaxiosPromise[SchemaListUptimeCheckConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsUptimecheckconfigsList,
    callback: BodyResponseCallback[SchemaListUptimeCheckConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsUptimecheckconfigsList,
    options: BodyResponseCallback[SchemaListUptimeCheckConfigsResponse],
    callback: BodyResponseCallback[SchemaListUptimeCheckConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsUptimecheckconfigsList, options: MethodOptions): GaxiosPromise[SchemaListUptimeCheckConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsUptimecheckconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUptimeCheckConfigsResponse]
  ): Unit = js.native
  
  /**
    * monitoring.projects.uptimeCheckConfigs.patch
    * @desc Updates an uptime check configuration. You can either replace the
    * entire configuration with a new one or replace only certain fields in the
    * current configuration by specifying the fields to be updated via
    * "updateMask". Returns the updated configuration.
    * @alias monitoring.projects.uptimeCheckConfigs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name A unique resource name for this UptimeCheckConfig. The format is:projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID].This field should be omitted when creating the uptime check configuration; on create, the resource name is assigned by the server and included in the response.
    * @param {string=} params.updateMask Optional. If present, only the listed fields in the current uptime check configuration are updated with values from the new configuration. If this field is empty, then the current configuration is completely replaced with the new configuration.
    * @param {().UptimeCheckConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaUptimeCheckConfig]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def patch(params: ParamsResourceProjectsUptimecheckconfigsPatch): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def patch(
    params: ParamsResourceProjectsUptimecheckconfigsPatch,
    callback: BodyResponseCallback[SchemaUptimeCheckConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsUptimecheckconfigsPatch,
    options: BodyResponseCallback[SchemaUptimeCheckConfig],
    callback: BodyResponseCallback[SchemaUptimeCheckConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsUptimecheckconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def patch(
    params: ParamsResourceProjectsUptimecheckconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUptimeCheckConfig]
  ): Unit = js.native
}
