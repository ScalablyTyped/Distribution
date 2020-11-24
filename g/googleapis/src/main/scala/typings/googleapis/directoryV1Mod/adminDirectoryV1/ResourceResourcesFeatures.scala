package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Resources$Features")
@js.native
class ResourceResourcesFeatures protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * directory.resources.features.delete
    * @desc Deletes a feature.
    * @alias directory.resources.features.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {string} params.featureKey The unique ID of the feature to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResourcesFeaturesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResourcesFeaturesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceResourcesFeaturesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceResourcesFeaturesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceResourcesFeaturesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * directory.resources.features.get
    * @desc Retrieves a feature.
    * @alias directory.resources.features.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {string} params.featureKey The unique ID of the feature to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaFeature] = js.native
  def get(callback: BodyResponseCallback[SchemaFeature]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFeature] = js.native
  def get(params: ParamsResourceResourcesFeaturesGet): GaxiosPromise[SchemaFeature] = js.native
  def get(params: ParamsResourceResourcesFeaturesGet, callback: BodyResponseCallback[SchemaFeature]): Unit = js.native
  def get(
    params: ParamsResourceResourcesFeaturesGet,
    options: BodyResponseCallback[SchemaFeature],
    callback: BodyResponseCallback[SchemaFeature]
  ): Unit = js.native
  def get(params: ParamsResourceResourcesFeaturesGet, options: MethodOptions): GaxiosPromise[SchemaFeature] = js.native
  def get(
    params: ParamsResourceResourcesFeaturesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFeature]
  ): Unit = js.native
  
  /**
    * directory.resources.features.insert
    * @desc Inserts a feature.
    * @alias directory.resources.features.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {().Feature} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaFeature] = js.native
  def insert(callback: BodyResponseCallback[SchemaFeature]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFeature] = js.native
  def insert(params: ParamsResourceResourcesFeaturesInsert): GaxiosPromise[SchemaFeature] = js.native
  def insert(params: ParamsResourceResourcesFeaturesInsert, callback: BodyResponseCallback[SchemaFeature]): Unit = js.native
  def insert(
    params: ParamsResourceResourcesFeaturesInsert,
    options: BodyResponseCallback[SchemaFeature],
    callback: BodyResponseCallback[SchemaFeature]
  ): Unit = js.native
  def insert(params: ParamsResourceResourcesFeaturesInsert, options: MethodOptions): GaxiosPromise[SchemaFeature] = js.native
  def insert(
    params: ParamsResourceResourcesFeaturesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFeature]
  ): Unit = js.native
  
  /**
    * directory.resources.features.list
    * @desc Retrieves a list of features for an account.
    * @alias directory.resources.features.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Token to specify the next page in the list.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaFeatures] = js.native
  def list(callback: BodyResponseCallback[SchemaFeatures]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFeatures] = js.native
  def list(params: ParamsResourceResourcesFeaturesList): GaxiosPromise[SchemaFeatures] = js.native
  def list(params: ParamsResourceResourcesFeaturesList, callback: BodyResponseCallback[SchemaFeatures]): Unit = js.native
  def list(
    params: ParamsResourceResourcesFeaturesList,
    options: BodyResponseCallback[SchemaFeatures],
    callback: BodyResponseCallback[SchemaFeatures]
  ): Unit = js.native
  def list(params: ParamsResourceResourcesFeaturesList, options: MethodOptions): GaxiosPromise[SchemaFeatures] = js.native
  def list(
    params: ParamsResourceResourcesFeaturesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFeatures]
  ): Unit = js.native
  
  /**
    * directory.resources.features.patch
    * @desc Updates a feature. This method supports patch semantics.
    * @alias directory.resources.features.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {string} params.featureKey The unique ID of the feature to update.
    * @param {().Feature} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaFeature] = js.native
  def patch(callback: BodyResponseCallback[SchemaFeature]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFeature] = js.native
  def patch(params: ParamsResourceResourcesFeaturesPatch): GaxiosPromise[SchemaFeature] = js.native
  def patch(params: ParamsResourceResourcesFeaturesPatch, callback: BodyResponseCallback[SchemaFeature]): Unit = js.native
  def patch(
    params: ParamsResourceResourcesFeaturesPatch,
    options: BodyResponseCallback[SchemaFeature],
    callback: BodyResponseCallback[SchemaFeature]
  ): Unit = js.native
  def patch(params: ParamsResourceResourcesFeaturesPatch, options: MethodOptions): GaxiosPromise[SchemaFeature] = js.native
  def patch(
    params: ParamsResourceResourcesFeaturesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFeature]
  ): Unit = js.native
  
  /**
    * directory.resources.features.rename
    * @desc Renames a feature.
    * @alias directory.resources.features.rename
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {string} params.oldName The unique ID of the feature to rename.
    * @param {().FeatureRename} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rename(): GaxiosPromise[Unit] = js.native
  def rename(callback: BodyResponseCallback[Unit]): Unit = js.native
  def rename(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def rename(params: ParamsResourceResourcesFeaturesRename): GaxiosPromise[Unit] = js.native
  def rename(params: ParamsResourceResourcesFeaturesRename, callback: BodyResponseCallback[Unit]): Unit = js.native
  def rename(
    params: ParamsResourceResourcesFeaturesRename,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def rename(params: ParamsResourceResourcesFeaturesRename, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def rename(
    params: ParamsResourceResourcesFeaturesRename,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * directory.resources.features.update
    * @desc Updates a feature.
    * @alias directory.resources.features.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {string} params.featureKey The unique ID of the feature to update.
    * @param {().Feature} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaFeature] = js.native
  def update(callback: BodyResponseCallback[SchemaFeature]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFeature] = js.native
  def update(params: ParamsResourceResourcesFeaturesUpdate): GaxiosPromise[SchemaFeature] = js.native
  def update(params: ParamsResourceResourcesFeaturesUpdate, callback: BodyResponseCallback[SchemaFeature]): Unit = js.native
  def update(
    params: ParamsResourceResourcesFeaturesUpdate,
    options: BodyResponseCallback[SchemaFeature],
    callback: BodyResponseCallback[SchemaFeature]
  ): Unit = js.native
  def update(params: ParamsResourceResourcesFeaturesUpdate, options: MethodOptions): GaxiosPromise[SchemaFeature] = js.native
  def update(
    params: ParamsResourceResourcesFeaturesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFeature]
  ): Unit = js.native
}
