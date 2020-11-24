package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Verificationcodes")
@js.native
class ResourceVerificationcodes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * directory.verificationCodes.generate
    * @desc Generate new backup verification codes for the user.
    * @alias directory.verificationCodes.generate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generate(): GaxiosPromise[Unit] = js.native
  def generate(callback: BodyResponseCallback[Unit]): Unit = js.native
  def generate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def generate(params: ParamsResourceVerificationcodesGenerate): GaxiosPromise[Unit] = js.native
  def generate(params: ParamsResourceVerificationcodesGenerate, callback: BodyResponseCallback[Unit]): Unit = js.native
  def generate(
    params: ParamsResourceVerificationcodesGenerate,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def generate(params: ParamsResourceVerificationcodesGenerate, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def generate(
    params: ParamsResourceVerificationcodesGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * directory.verificationCodes.invalidate
    * @desc Invalidate the current backup verification codes for the user.
    * @alias directory.verificationCodes.invalidate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def invalidate(): GaxiosPromise[Unit] = js.native
  def invalidate(callback: BodyResponseCallback[Unit]): Unit = js.native
  def invalidate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def invalidate(params: ParamsResourceVerificationcodesInvalidate): GaxiosPromise[Unit] = js.native
  def invalidate(params: ParamsResourceVerificationcodesInvalidate, callback: BodyResponseCallback[Unit]): Unit = js.native
  def invalidate(
    params: ParamsResourceVerificationcodesInvalidate,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def invalidate(params: ParamsResourceVerificationcodesInvalidate, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def invalidate(
    params: ParamsResourceVerificationcodesInvalidate,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * directory.verificationCodes.list
    * @desc Returns the current set of valid backup verification codes for the
    * specified user.
    * @alias directory.verificationCodes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaVerificationCodes] = js.native
  def list(callback: BodyResponseCallback[SchemaVerificationCodes]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVerificationCodes] = js.native
  def list(params: ParamsResourceVerificationcodesList): GaxiosPromise[SchemaVerificationCodes] = js.native
  def list(
    params: ParamsResourceVerificationcodesList,
    callback: BodyResponseCallback[SchemaVerificationCodes]
  ): Unit = js.native
  def list(
    params: ParamsResourceVerificationcodesList,
    options: BodyResponseCallback[SchemaVerificationCodes],
    callback: BodyResponseCallback[SchemaVerificationCodes]
  ): Unit = js.native
  def list(params: ParamsResourceVerificationcodesList, options: MethodOptions): GaxiosPromise[SchemaVerificationCodes] = js.native
  def list(
    params: ParamsResourceVerificationcodesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVerificationCodes]
  ): Unit = js.native
}
