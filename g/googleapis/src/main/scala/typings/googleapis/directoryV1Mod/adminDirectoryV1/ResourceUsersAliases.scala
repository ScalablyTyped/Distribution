package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Users$Aliases")
@js.native
class ResourceUsersAliases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * directory.users.aliases.delete
    * @desc Remove a alias for the user
    * @alias directory.users.aliases.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alias The alias to be removed
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersAliasesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersAliasesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersAliasesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersAliasesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersAliasesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * directory.users.aliases.insert
    * @desc Add a alias for the user
    * @alias directory.users.aliases.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {().Alias} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaAlias] = js.native
  def insert(callback: BodyResponseCallback[SchemaAlias]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAlias] = js.native
  def insert(params: ParamsResourceUsersAliasesInsert): GaxiosPromise[SchemaAlias] = js.native
  def insert(params: ParamsResourceUsersAliasesInsert, callback: BodyResponseCallback[SchemaAlias]): Unit = js.native
  def insert(
    params: ParamsResourceUsersAliasesInsert,
    options: BodyResponseCallback[SchemaAlias],
    callback: BodyResponseCallback[SchemaAlias]
  ): Unit = js.native
  def insert(params: ParamsResourceUsersAliasesInsert, options: MethodOptions): GaxiosPromise[SchemaAlias] = js.native
  def insert(
    params: ParamsResourceUsersAliasesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlias]
  ): Unit = js.native
  
  /**
    * directory.users.aliases.list
    * @desc List all aliases for a user
    * @alias directory.users.aliases.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.event Event on which subscription is intended (if subscribing)
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAliases] = js.native
  def list(callback: BodyResponseCallback[SchemaAliases]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAliases] = js.native
  def list(params: ParamsResourceUsersAliasesList): GaxiosPromise[SchemaAliases] = js.native
  def list(params: ParamsResourceUsersAliasesList, callback: BodyResponseCallback[SchemaAliases]): Unit = js.native
  def list(
    params: ParamsResourceUsersAliasesList,
    options: BodyResponseCallback[SchemaAliases],
    callback: BodyResponseCallback[SchemaAliases]
  ): Unit = js.native
  def list(params: ParamsResourceUsersAliasesList, options: MethodOptions): GaxiosPromise[SchemaAliases] = js.native
  def list(
    params: ParamsResourceUsersAliasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAliases]
  ): Unit = js.native
  
  /**
    * directory.users.aliases.watch
    * @desc Watch for changes in user aliases list
    * @alias directory.users.aliases.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.event Event on which subscription is intended (if subscribing)
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[SchemaChannel] = js.native
  def watch(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceUsersAliasesWatch): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceUsersAliasesWatch, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(
    params: ParamsResourceUsersAliasesWatch,
    options: BodyResponseCallback[SchemaChannel],
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  def watch(params: ParamsResourceUsersAliasesWatch, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(
    params: ParamsResourceUsersAliasesWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
}
