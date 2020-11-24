package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Asps")
@js.native
class ResourceAsps protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * directory.asps.delete
    * @desc Delete an ASP issued by a user.
    * @alias directory.asps.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.codeId The unique ID of the ASP to be deleted.
    * @param {string} params.userKey Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAspsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAspsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAspsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAspsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAspsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * directory.asps.get
    * @desc Get information about an ASP issued by a user.
    * @alias directory.asps.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.codeId The unique ID of the ASP.
    * @param {string} params.userKey Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAsp] = js.native
  def get(callback: BodyResponseCallback[SchemaAsp]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAsp] = js.native
  def get(params: ParamsResourceAspsGet): GaxiosPromise[SchemaAsp] = js.native
  def get(params: ParamsResourceAspsGet, callback: BodyResponseCallback[SchemaAsp]): Unit = js.native
  def get(
    params: ParamsResourceAspsGet,
    options: BodyResponseCallback[SchemaAsp],
    callback: BodyResponseCallback[SchemaAsp]
  ): Unit = js.native
  def get(params: ParamsResourceAspsGet, options: MethodOptions): GaxiosPromise[SchemaAsp] = js.native
  def get(params: ParamsResourceAspsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaAsp]): Unit = js.native
  
  /**
    * directory.asps.list
    * @desc List the ASPs issued by a user.
    * @alias directory.asps.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAsps] = js.native
  def list(callback: BodyResponseCallback[SchemaAsps]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAsps] = js.native
  def list(params: ParamsResourceAspsList): GaxiosPromise[SchemaAsps] = js.native
  def list(params: ParamsResourceAspsList, callback: BodyResponseCallback[SchemaAsps]): Unit = js.native
  def list(
    params: ParamsResourceAspsList,
    options: BodyResponseCallback[SchemaAsps],
    callback: BodyResponseCallback[SchemaAsps]
  ): Unit = js.native
  def list(params: ParamsResourceAspsList, options: MethodOptions): GaxiosPromise[SchemaAsps] = js.native
  def list(params: ParamsResourceAspsList, options: MethodOptions, callback: BodyResponseCallback[SchemaAsps]): Unit = js.native
}
