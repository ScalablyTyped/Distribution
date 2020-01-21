package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Pretargetingconfig")
@js.native
class ResourcePretargetingconfig protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.pretargetingConfig.delete
    * @desc Deletes an existing pretargeting config.
    * @alias adexchangebuyer.pretargetingConfig.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id to delete the pretargeting config for.
    * @param {string} params.configId The specific id of the configuration to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourcePretargetingconfigDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePretargetingconfigDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePretargetingconfigDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePretargetingconfigDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourcePretargetingconfigDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * adexchangebuyer.pretargetingConfig.get
    * @desc Gets a specific pretargeting configuration
    * @alias adexchangebuyer.pretargetingConfig.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id to get the pretargeting config for.
    * @param {string} params.configId The specific id of the configuration to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def get(params: ParamsResourcePretargetingconfigGet): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def get(
    params: ParamsResourcePretargetingconfigGet,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourcePretargetingconfigGet,
    options: BodyResponseCallback[SchemaPretargetingConfig],
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def get(params: ParamsResourcePretargetingconfigGet, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def get(
    params: ParamsResourcePretargetingconfigGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * adexchangebuyer.pretargetingConfig.insert
    * @desc Inserts a new pretargeting configuration.
    * @alias adexchangebuyer.pretargetingConfig.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id to insert the pretargeting config for.
    * @param {().PretargetingConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def insert(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def insert(params: ParamsResourcePretargetingconfigInsert): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def insert(
    params: ParamsResourcePretargetingconfigInsert,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def insert(
    params: ParamsResourcePretargetingconfigInsert,
    options: BodyResponseCallback[SchemaPretargetingConfig],
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def insert(params: ParamsResourcePretargetingconfigInsert, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def insert(
    params: ParamsResourcePretargetingconfigInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * adexchangebuyer.pretargetingConfig.list
    * @desc Retrieves a list of the authenticated user's pretargeting
    * configurations.
    * @alias adexchangebuyer.pretargetingConfig.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id to get the pretargeting configs for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPretargetingConfigList] = js.native
  def list(callback: BodyResponseCallback[SchemaPretargetingConfigList]): Unit = js.native
  def list(params: ParamsResourcePretargetingconfigList): GaxiosPromise[SchemaPretargetingConfigList] = js.native
  def list(
    params: ParamsResourcePretargetingconfigList,
    callback: BodyResponseCallback[SchemaPretargetingConfigList]
  ): Unit = js.native
  def list(
    params: ParamsResourcePretargetingconfigList,
    options: BodyResponseCallback[SchemaPretargetingConfigList],
    callback: BodyResponseCallback[SchemaPretargetingConfigList]
  ): Unit = js.native
  def list(params: ParamsResourcePretargetingconfigList, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfigList] = js.native
  def list(
    params: ParamsResourcePretargetingconfigList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfigList]
  ): Unit = js.native
  /**
    * adexchangebuyer.pretargetingConfig.patch
    * @desc Updates an existing pretargeting config. This method supports patch
    * semantics.
    * @alias adexchangebuyer.pretargetingConfig.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id to update the pretargeting config for.
    * @param {string} params.configId The specific id of the configuration to update.
    * @param {().PretargetingConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def patch(params: ParamsResourcePretargetingconfigPatch): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def patch(
    params: ParamsResourcePretargetingconfigPatch,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourcePretargetingconfigPatch,
    options: BodyResponseCallback[SchemaPretargetingConfig],
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def patch(params: ParamsResourcePretargetingconfigPatch, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def patch(
    params: ParamsResourcePretargetingconfigPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * adexchangebuyer.pretargetingConfig.update
    * @desc Updates an existing pretargeting config.
    * @alias adexchangebuyer.pretargetingConfig.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id to update the pretargeting config for.
    * @param {string} params.configId The specific id of the configuration to update.
    * @param {().PretargetingConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def update(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def update(params: ParamsResourcePretargetingconfigUpdate): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def update(
    params: ParamsResourcePretargetingconfigUpdate,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def update(
    params: ParamsResourcePretargetingconfigUpdate,
    options: BodyResponseCallback[SchemaPretargetingConfig],
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def update(params: ParamsResourcePretargetingconfigUpdate, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def update(
    params: ParamsResourcePretargetingconfigUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
}

