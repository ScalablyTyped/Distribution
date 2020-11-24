package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Floodlightconfigurations")
@js.native
class ResourceFloodlightconfigurations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.floodlightConfigurations.get
    * @desc Gets one floodlight configuration by ID.
    * @alias dfareporting.floodlightConfigurations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Floodlight configuration ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def get(callback: BodyResponseCallback[SchemaFloodlightConfiguration]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def get(params: ParamsResourceFloodlightconfigurationsGet): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def get(
    params: ParamsResourceFloodlightconfigurationsGet,
    callback: BodyResponseCallback[SchemaFloodlightConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsResourceFloodlightconfigurationsGet,
    options: BodyResponseCallback[SchemaFloodlightConfiguration],
    callback: BodyResponseCallback[SchemaFloodlightConfiguration]
  ): Unit = js.native
  def get(params: ParamsResourceFloodlightconfigurationsGet, options: MethodOptions): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def get(
    params: ParamsResourceFloodlightconfigurationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightConfiguration]
  ): Unit = js.native
  
  /**
    * dfareporting.floodlightConfigurations.list
    * @desc Retrieves a list of floodlight configurations, possibly filtered.
    * @alias dfareporting.floodlightConfigurations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ids Set of IDs of floodlight configurations to retrieve. Required field; otherwise an empty list will be returned.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaFloodlightConfigurationsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaFloodlightConfigurationsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFloodlightConfigurationsListResponse] = js.native
  def list(params: ParamsResourceFloodlightconfigurationsList): GaxiosPromise[SchemaFloodlightConfigurationsListResponse] = js.native
  def list(
    params: ParamsResourceFloodlightconfigurationsList,
    callback: BodyResponseCallback[SchemaFloodlightConfigurationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceFloodlightconfigurationsList,
    options: BodyResponseCallback[SchemaFloodlightConfigurationsListResponse],
    callback: BodyResponseCallback[SchemaFloodlightConfigurationsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFloodlightconfigurationsList, options: MethodOptions): GaxiosPromise[SchemaFloodlightConfigurationsListResponse] = js.native
  def list(
    params: ParamsResourceFloodlightconfigurationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightConfigurationsListResponse]
  ): Unit = js.native
  
  /**
    * dfareporting.floodlightConfigurations.patch
    * @desc Updates an existing floodlight configuration. This method supports
    * patch semantics.
    * @alias dfareporting.floodlightConfigurations.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Floodlight configuration ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().FloodlightConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def patch(callback: BodyResponseCallback[SchemaFloodlightConfiguration]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def patch(params: ParamsResourceFloodlightconfigurationsPatch): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def patch(
    params: ParamsResourceFloodlightconfigurationsPatch,
    callback: BodyResponseCallback[SchemaFloodlightConfiguration]
  ): Unit = js.native
  def patch(
    params: ParamsResourceFloodlightconfigurationsPatch,
    options: BodyResponseCallback[SchemaFloodlightConfiguration],
    callback: BodyResponseCallback[SchemaFloodlightConfiguration]
  ): Unit = js.native
  def patch(params: ParamsResourceFloodlightconfigurationsPatch, options: MethodOptions): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def patch(
    params: ParamsResourceFloodlightconfigurationsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightConfiguration]
  ): Unit = js.native
  
  /**
    * dfareporting.floodlightConfigurations.update
    * @desc Updates an existing floodlight configuration.
    * @alias dfareporting.floodlightConfigurations.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().FloodlightConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def update(callback: BodyResponseCallback[SchemaFloodlightConfiguration]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def update(params: ParamsResourceFloodlightconfigurationsUpdate): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def update(
    params: ParamsResourceFloodlightconfigurationsUpdate,
    callback: BodyResponseCallback[SchemaFloodlightConfiguration]
  ): Unit = js.native
  def update(
    params: ParamsResourceFloodlightconfigurationsUpdate,
    options: BodyResponseCallback[SchemaFloodlightConfiguration],
    callback: BodyResponseCallback[SchemaFloodlightConfiguration]
  ): Unit = js.native
  def update(params: ParamsResourceFloodlightconfigurationsUpdate, options: MethodOptions): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def update(
    params: ParamsResourceFloodlightconfigurationsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightConfiguration]
  ): Unit = js.native
}
