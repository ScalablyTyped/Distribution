package typings.googleapis.runV1alpha1Mod.runV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/run/v1alpha1", "run_v1alpha1.Resource$Projects$Locations$Configurations")
@js.native
class ResourceProjectsLocationsConfigurations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * run.projects.locations.configurations.get
    * @desc Rpc to get information about a configuration.
    * @alias run.projects.locations.configurations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the configuration being retrieved. If needed, replace {namespace_id} with the project ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaConfiguration] = js.native
  def get(callback: BodyResponseCallback[SchemaConfiguration]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaConfiguration] = js.native
  def get(params: ParamsResourceProjectsLocationsConfigurationsGet): GaxiosPromise[SchemaConfiguration] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConfigurationsGet,
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsConfigurationsGet,
    options: BodyResponseCallback[SchemaConfiguration],
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsConfigurationsGet, options: MethodOptions): GaxiosPromise[SchemaConfiguration] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConfigurationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  
  /**
    * run.projects.locations.configurations.list
    * @desc Rpc to list configurations.
    * @alias run.projects.locations.configurations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.continue Optional encoded string to continue paging.
    * @param {string=} params.fieldSelector Allows to filter resources based on a specific value for a field name. Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud Run.
    * @param {boolean=} params.includeUninitialized Not currently used by Cloud Run.
    * @param {string=} params.labelSelector Allows to filter resources based on a label. Supported operations are =, !=, exists, in, and notIn.
    * @param {integer=} params.limit The maximum number of records that should be returned.
    * @param {string} params.parent The project ID or project number from which the configurations should be listed.
    * @param {string=} params.resourceVersion The baseline resource version from which the list or watch operation should start. Not currently used by Cloud Run.
    * @param {boolean=} params.watch Flag that indicates that the client expects to watch this resource as well. Not currently used by Cloud Run.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListConfigurationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListConfigurationsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListConfigurationsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsConfigurationsList): GaxiosPromise[SchemaListConfigurationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConfigurationsList,
    callback: BodyResponseCallback[SchemaListConfigurationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsConfigurationsList,
    options: BodyResponseCallback[SchemaListConfigurationsResponse],
    callback: BodyResponseCallback[SchemaListConfigurationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsConfigurationsList, options: MethodOptions): GaxiosPromise[SchemaListConfigurationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConfigurationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListConfigurationsResponse]
  ): Unit = js.native
}
