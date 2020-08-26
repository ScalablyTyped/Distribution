package typings.googleapis.spannerV1Mod.spannerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/spanner/v1", "spanner_v1.Resource$Projects$Instanceconfigs")
@js.native
class ResourceProjectsInstanceconfigs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * spanner.projects.instanceConfigs.get
    * @desc Gets information about a particular instance configuration.
    * @alias spanner.projects.instanceConfigs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the requested instance configuration. Values are of the form `projects/<project>/instanceConfigs/<config>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaInstanceConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaInstanceConfig]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstanceConfig] = js.native
  def get(params: ParamsResourceProjectsInstanceconfigsGet): GaxiosPromise[SchemaInstanceConfig] = js.native
  def get(
    params: ParamsResourceProjectsInstanceconfigsGet,
    callback: BodyResponseCallback[SchemaInstanceConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsInstanceconfigsGet,
    options: BodyResponseCallback[SchemaInstanceConfig],
    callback: BodyResponseCallback[SchemaInstanceConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsInstanceconfigsGet, options: MethodOptions): GaxiosPromise[SchemaInstanceConfig] = js.native
  def get(
    params: ParamsResourceProjectsInstanceconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstanceConfig]
  ): Unit = js.native
  /**
    * spanner.projects.instanceConfigs.list
    * @desc Lists the supported instance configurations for a given project.
    * @alias spanner.projects.instanceConfigs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Number of instance configurations to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size.
    * @param {string=} params.pageToken If non-empty, `page_token` should contain a next_page_token from a previous ListInstanceConfigsResponse.
    * @param {string} params.parent Required. The name of the project for which a list of supported instance configurations is requested. Values are of the form `projects/<project>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListInstanceConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListInstanceConfigsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListInstanceConfigsResponse] = js.native
  def list(params: ParamsResourceProjectsInstanceconfigsList): GaxiosPromise[SchemaListInstanceConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstanceconfigsList,
    callback: BodyResponseCallback[SchemaListInstanceConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsInstanceconfigsList,
    options: BodyResponseCallback[SchemaListInstanceConfigsResponse],
    callback: BodyResponseCallback[SchemaListInstanceConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsInstanceconfigsList, options: MethodOptions): GaxiosPromise[SchemaListInstanceConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstanceconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListInstanceConfigsResponse]
  ): Unit = js.native
}

