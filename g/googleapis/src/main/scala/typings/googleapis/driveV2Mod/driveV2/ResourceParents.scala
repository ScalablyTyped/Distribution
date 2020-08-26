package typings.googleapis.driveV2Mod.driveV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Parents")
@js.native
class ResourceParents protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.parents.delete
    * @desc Removes a parent from a file.
    * @alias drive.parents.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.parentId The ID of the parent.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceParentsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceParentsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceParentsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceParentsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceParentsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * drive.parents.get
    * @desc Gets a specific parent reference.
    * @alias drive.parents.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.parentId The ID of the parent.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaParentReference] = js.native
  def get(callback: BodyResponseCallback[SchemaParentReference]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaParentReference] = js.native
  def get(params: ParamsResourceParentsGet): GaxiosPromise[SchemaParentReference] = js.native
  def get(params: ParamsResourceParentsGet, callback: BodyResponseCallback[SchemaParentReference]): Unit = js.native
  def get(
    params: ParamsResourceParentsGet,
    options: BodyResponseCallback[SchemaParentReference],
    callback: BodyResponseCallback[SchemaParentReference]
  ): Unit = js.native
  def get(params: ParamsResourceParentsGet, options: MethodOptions): GaxiosPromise[SchemaParentReference] = js.native
  def get(
    params: ParamsResourceParentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaParentReference]
  ): Unit = js.native
  /**
    * drive.parents.insert
    * @desc Adds a parent folder for a file.
    * @alias drive.parents.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {().ParentReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaParentReference] = js.native
  def insert(callback: BodyResponseCallback[SchemaParentReference]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaParentReference] = js.native
  def insert(params: ParamsResourceParentsInsert): GaxiosPromise[SchemaParentReference] = js.native
  def insert(params: ParamsResourceParentsInsert, callback: BodyResponseCallback[SchemaParentReference]): Unit = js.native
  def insert(
    params: ParamsResourceParentsInsert,
    options: BodyResponseCallback[SchemaParentReference],
    callback: BodyResponseCallback[SchemaParentReference]
  ): Unit = js.native
  def insert(params: ParamsResourceParentsInsert, options: MethodOptions): GaxiosPromise[SchemaParentReference] = js.native
  def insert(
    params: ParamsResourceParentsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaParentReference]
  ): Unit = js.native
  /**
    * drive.parents.list
    * @desc Lists a file's parents.
    * @alias drive.parents.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaParentList] = js.native
  def list(callback: BodyResponseCallback[SchemaParentList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaParentList] = js.native
  def list(params: ParamsResourceParentsList): GaxiosPromise[SchemaParentList] = js.native
  def list(params: ParamsResourceParentsList, callback: BodyResponseCallback[SchemaParentList]): Unit = js.native
  def list(
    params: ParamsResourceParentsList,
    options: BodyResponseCallback[SchemaParentList],
    callback: BodyResponseCallback[SchemaParentList]
  ): Unit = js.native
  def list(params: ParamsResourceParentsList, options: MethodOptions): GaxiosPromise[SchemaParentList] = js.native
  def list(
    params: ParamsResourceParentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaParentList]
  ): Unit = js.native
}

