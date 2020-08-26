package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Tokens")
@js.native
class ResourceTokens protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.tokens.delete
    * @desc Delete all access tokens issued by a user for an application.
    * @alias directory.tokens.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clientId The Client ID of the application the token is issued to.
    * @param {string} params.userKey Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTokensDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTokensDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceTokensDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceTokensDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTokensDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * directory.tokens.get
    * @desc Get information about an access token issued by a user.
    * @alias directory.tokens.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clientId The Client ID of the application the token is issued to.
    * @param {string} params.userKey Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaToken] = js.native
  def get(callback: BodyResponseCallback[SchemaToken]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaToken] = js.native
  def get(params: ParamsResourceTokensGet): GaxiosPromise[SchemaToken] = js.native
  def get(params: ParamsResourceTokensGet, callback: BodyResponseCallback[SchemaToken]): Unit = js.native
  def get(
    params: ParamsResourceTokensGet,
    options: BodyResponseCallback[SchemaToken],
    callback: BodyResponseCallback[SchemaToken]
  ): Unit = js.native
  def get(params: ParamsResourceTokensGet, options: MethodOptions): GaxiosPromise[SchemaToken] = js.native
  def get(
    params: ParamsResourceTokensGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaToken]
  ): Unit = js.native
  /**
    * directory.tokens.list
    * @desc Returns the set of tokens specified user has issued to 3rd party
    * applications.
    * @alias directory.tokens.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaTokens] = js.native
  def list(callback: BodyResponseCallback[SchemaTokens]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTokens] = js.native
  def list(params: ParamsResourceTokensList): GaxiosPromise[SchemaTokens] = js.native
  def list(params: ParamsResourceTokensList, callback: BodyResponseCallback[SchemaTokens]): Unit = js.native
  def list(
    params: ParamsResourceTokensList,
    options: BodyResponseCallback[SchemaTokens],
    callback: BodyResponseCallback[SchemaTokens]
  ): Unit = js.native
  def list(params: ParamsResourceTokensList, options: MethodOptions): GaxiosPromise[SchemaTokens] = js.native
  def list(
    params: ParamsResourceTokensList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTokens]
  ): Unit = js.native
}

