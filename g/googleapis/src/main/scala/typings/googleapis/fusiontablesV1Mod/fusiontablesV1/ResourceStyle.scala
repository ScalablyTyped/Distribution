package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/fusiontables/v1", "fusiontables_v1.Resource$Style")
@js.native
class ResourceStyle protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * fusiontables.style.delete
    * @desc Deletes a style.
    * @alias fusiontables.style.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.styleId Identifier (within a table) for the style being deleted
    * @param {string} params.tableId Table from which the style is being deleted
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceStyleDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceStyleDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceStyleDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceStyleDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceStyleDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * fusiontables.style.get
    * @desc Gets a specific style.
    * @alias fusiontables.style.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.styleId Identifier (integer) for a specific style in a table
    * @param {string} params.tableId Table to which the requested style belongs
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaStyleSetting] = js.native
  def get(callback: BodyResponseCallback[SchemaStyleSetting]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaStyleSetting] = js.native
  def get(params: ParamsResourceStyleGet): GaxiosPromise[SchemaStyleSetting] = js.native
  def get(params: ParamsResourceStyleGet, callback: BodyResponseCallback[SchemaStyleSetting]): Unit = js.native
  def get(
    params: ParamsResourceStyleGet,
    options: BodyResponseCallback[SchemaStyleSetting],
    callback: BodyResponseCallback[SchemaStyleSetting]
  ): Unit = js.native
  def get(params: ParamsResourceStyleGet, options: MethodOptions): GaxiosPromise[SchemaStyleSetting] = js.native
  def get(
    params: ParamsResourceStyleGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStyleSetting]
  ): Unit = js.native
  /**
    * fusiontables.style.insert
    * @desc Adds a new style for the table.
    * @alias fusiontables.style.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table for which a new style is being added
    * @param {().StyleSetting} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaStyleSetting] = js.native
  def insert(callback: BodyResponseCallback[SchemaStyleSetting]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaStyleSetting] = js.native
  def insert(params: ParamsResourceStyleInsert): GaxiosPromise[SchemaStyleSetting] = js.native
  def insert(params: ParamsResourceStyleInsert, callback: BodyResponseCallback[SchemaStyleSetting]): Unit = js.native
  def insert(
    params: ParamsResourceStyleInsert,
    options: BodyResponseCallback[SchemaStyleSetting],
    callback: BodyResponseCallback[SchemaStyleSetting]
  ): Unit = js.native
  def insert(params: ParamsResourceStyleInsert, options: MethodOptions): GaxiosPromise[SchemaStyleSetting] = js.native
  def insert(
    params: ParamsResourceStyleInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStyleSetting]
  ): Unit = js.native
  /**
    * fusiontables.style.list
    * @desc Retrieves a list of styles.
    * @alias fusiontables.style.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of styles to return. Optional. Default is 5.
    * @param {string=} params.pageToken Continuation token specifying which result page to return. Optional.
    * @param {string} params.tableId Table whose styles are being listed
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaStyleSettingList] = js.native
  def list(callback: BodyResponseCallback[SchemaStyleSettingList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaStyleSettingList] = js.native
  def list(params: ParamsResourceStyleList): GaxiosPromise[SchemaStyleSettingList] = js.native
  def list(params: ParamsResourceStyleList, callback: BodyResponseCallback[SchemaStyleSettingList]): Unit = js.native
  def list(
    params: ParamsResourceStyleList,
    options: BodyResponseCallback[SchemaStyleSettingList],
    callback: BodyResponseCallback[SchemaStyleSettingList]
  ): Unit = js.native
  def list(params: ParamsResourceStyleList, options: MethodOptions): GaxiosPromise[SchemaStyleSettingList] = js.native
  def list(
    params: ParamsResourceStyleList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStyleSettingList]
  ): Unit = js.native
  /**
    * fusiontables.style.patch
    * @desc Updates an existing style. This method supports patch semantics.
    * @alias fusiontables.style.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.styleId Identifier (within a table) for the style being updated.
    * @param {string} params.tableId Table whose style is being updated.
    * @param {().StyleSetting} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaStyleSetting] = js.native
  def patch(callback: BodyResponseCallback[SchemaStyleSetting]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaStyleSetting] = js.native
  def patch(params: ParamsResourceStylePatch): GaxiosPromise[SchemaStyleSetting] = js.native
  def patch(params: ParamsResourceStylePatch, callback: BodyResponseCallback[SchemaStyleSetting]): Unit = js.native
  def patch(
    params: ParamsResourceStylePatch,
    options: BodyResponseCallback[SchemaStyleSetting],
    callback: BodyResponseCallback[SchemaStyleSetting]
  ): Unit = js.native
  def patch(params: ParamsResourceStylePatch, options: MethodOptions): GaxiosPromise[SchemaStyleSetting] = js.native
  def patch(
    params: ParamsResourceStylePatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStyleSetting]
  ): Unit = js.native
  /**
    * fusiontables.style.update
    * @desc Updates an existing style.
    * @alias fusiontables.style.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.styleId Identifier (within a table) for the style being updated.
    * @param {string} params.tableId Table whose style is being updated.
    * @param {().StyleSetting} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaStyleSetting] = js.native
  def update(callback: BodyResponseCallback[SchemaStyleSetting]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaStyleSetting] = js.native
  def update(params: ParamsResourceStyleUpdate): GaxiosPromise[SchemaStyleSetting] = js.native
  def update(params: ParamsResourceStyleUpdate, callback: BodyResponseCallback[SchemaStyleSetting]): Unit = js.native
  def update(
    params: ParamsResourceStyleUpdate,
    options: BodyResponseCallback[SchemaStyleSetting],
    callback: BodyResponseCallback[SchemaStyleSetting]
  ): Unit = js.native
  def update(params: ParamsResourceStyleUpdate, options: MethodOptions): GaxiosPromise[SchemaStyleSetting] = js.native
  def update(
    params: ParamsResourceStyleUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStyleSetting]
  ): Unit = js.native
}

