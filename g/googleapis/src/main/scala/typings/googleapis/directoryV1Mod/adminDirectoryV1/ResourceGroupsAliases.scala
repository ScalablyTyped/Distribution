package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Groups$Aliases")
@js.native
class ResourceGroupsAliases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.groups.aliases.delete
    * @desc Remove a alias for the group
    * @alias directory.groups.aliases.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alias The alias to be removed
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGroupsAliasesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGroupsAliasesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceGroupsAliasesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceGroupsAliasesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceGroupsAliasesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.groups.aliases.insert
    * @desc Add a alias for the group
    * @alias directory.groups.aliases.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {().Alias} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaAlias] = js.native
  def insert(callback: BodyResponseCallback[SchemaAlias]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAlias] = js.native
  def insert(params: ParamsResourceGroupsAliasesInsert): GaxiosPromise[SchemaAlias] = js.native
  def insert(params: ParamsResourceGroupsAliasesInsert, callback: BodyResponseCallback[SchemaAlias]): Unit = js.native
  def insert(
    params: ParamsResourceGroupsAliasesInsert,
    options: BodyResponseCallback[SchemaAlias],
    callback: BodyResponseCallback[SchemaAlias]
  ): Unit = js.native
  def insert(params: ParamsResourceGroupsAliasesInsert, options: MethodOptions): GaxiosPromise[SchemaAlias] = js.native
  def insert(
    params: ParamsResourceGroupsAliasesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlias]
  ): Unit = js.native
  /**
    * directory.groups.aliases.list
    * @desc List all aliases for a group
    * @alias directory.groups.aliases.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAliases] = js.native
  def list(callback: BodyResponseCallback[SchemaAliases]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAliases] = js.native
  def list(params: ParamsResourceGroupsAliasesList): GaxiosPromise[SchemaAliases] = js.native
  def list(params: ParamsResourceGroupsAliasesList, callback: BodyResponseCallback[SchemaAliases]): Unit = js.native
  def list(
    params: ParamsResourceGroupsAliasesList,
    options: BodyResponseCallback[SchemaAliases],
    callback: BodyResponseCallback[SchemaAliases]
  ): Unit = js.native
  def list(params: ParamsResourceGroupsAliasesList, options: MethodOptions): GaxiosPromise[SchemaAliases] = js.native
  def list(
    params: ParamsResourceGroupsAliasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAliases]
  ): Unit = js.native
}

