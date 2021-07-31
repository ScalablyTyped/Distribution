package typings.googleapis.gmailV1Mod.gmailV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Settings$Sendas$Smimeinfo")
@js.native
class ResourceUsersSettingsSendasSmimeinfo protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * gmail.users.settings.sendAs.smimeInfo.delete
    * @desc Deletes the specified S/MIME config for the specified send-as
    * alias.
    * @alias gmail.users.settings.sendAs.smimeInfo.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The immutable ID for the SmimeInfo.
    * @param {string} params.sendAsEmail The email address that appears in the "From:" header for mail sent using this alias.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsSendasSmimeinfoDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsSendasSmimeinfoDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersSettingsSendasSmimeinfoDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersSettingsSendasSmimeinfoDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersSettingsSendasSmimeinfoDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * gmail.users.settings.sendAs.smimeInfo.get
    * @desc Gets the specified S/MIME config for the specified send-as alias.
    * @alias gmail.users.settings.sendAs.smimeInfo.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The immutable ID for the SmimeInfo.
    * @param {string} params.sendAsEmail The email address that appears in the "From:" header for mail sent using this alias.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSmimeInfo] = js.native
  def get(callback: BodyResponseCallback[SchemaSmimeInfo]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSmimeInfo] = js.native
  def get(params: ParamsResourceUsersSettingsSendasSmimeinfoGet): GaxiosPromise[SchemaSmimeInfo] = js.native
  def get(
    params: ParamsResourceUsersSettingsSendasSmimeinfoGet,
    callback: BodyResponseCallback[SchemaSmimeInfo]
  ): Unit = js.native
  def get(
    params: ParamsResourceUsersSettingsSendasSmimeinfoGet,
    options: BodyResponseCallback[SchemaSmimeInfo],
    callback: BodyResponseCallback[SchemaSmimeInfo]
  ): Unit = js.native
  def get(params: ParamsResourceUsersSettingsSendasSmimeinfoGet, options: MethodOptions): GaxiosPromise[SchemaSmimeInfo] = js.native
  def get(
    params: ParamsResourceUsersSettingsSendasSmimeinfoGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSmimeInfo]
  ): Unit = js.native
  
  /**
    * gmail.users.settings.sendAs.smimeInfo.insert
    * @desc Insert (upload) the given S/MIME config for the specified send-as
    * alias. Note that pkcs12 format is required for the key.
    * @alias gmail.users.settings.sendAs.smimeInfo.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.sendAsEmail The email address that appears in the "From:" header for mail sent using this alias.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {().SmimeInfo} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaSmimeInfo] = js.native
  def insert(callback: BodyResponseCallback[SchemaSmimeInfo]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSmimeInfo] = js.native
  def insert(params: ParamsResourceUsersSettingsSendasSmimeinfoInsert): GaxiosPromise[SchemaSmimeInfo] = js.native
  def insert(
    params: ParamsResourceUsersSettingsSendasSmimeinfoInsert,
    callback: BodyResponseCallback[SchemaSmimeInfo]
  ): Unit = js.native
  def insert(
    params: ParamsResourceUsersSettingsSendasSmimeinfoInsert,
    options: BodyResponseCallback[SchemaSmimeInfo],
    callback: BodyResponseCallback[SchemaSmimeInfo]
  ): Unit = js.native
  def insert(params: ParamsResourceUsersSettingsSendasSmimeinfoInsert, options: MethodOptions): GaxiosPromise[SchemaSmimeInfo] = js.native
  def insert(
    params: ParamsResourceUsersSettingsSendasSmimeinfoInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSmimeInfo]
  ): Unit = js.native
  
  /**
    * gmail.users.settings.sendAs.smimeInfo.list
    * @desc Lists S/MIME configs for the specified send-as alias.
    * @alias gmail.users.settings.sendAs.smimeInfo.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.sendAsEmail The email address that appears in the "From:" header for mail sent using this alias.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListSmimeInfoResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSmimeInfoResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSmimeInfoResponse] = js.native
  def list(params: ParamsResourceUsersSettingsSendasSmimeinfoList): GaxiosPromise[SchemaListSmimeInfoResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsSendasSmimeinfoList,
    callback: BodyResponseCallback[SchemaListSmimeInfoResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersSettingsSendasSmimeinfoList,
    options: BodyResponseCallback[SchemaListSmimeInfoResponse],
    callback: BodyResponseCallback[SchemaListSmimeInfoResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersSettingsSendasSmimeinfoList, options: MethodOptions): GaxiosPromise[SchemaListSmimeInfoResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsSendasSmimeinfoList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSmimeInfoResponse]
  ): Unit = js.native
  
  /**
    * gmail.users.settings.sendAs.smimeInfo.setDefault
    * @desc Sets the default S/MIME config for the specified send-as alias.
    * @alias gmail.users.settings.sendAs.smimeInfo.setDefault
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The immutable ID for the SmimeInfo.
    * @param {string} params.sendAsEmail The email address that appears in the "From:" header for mail sent using this alias.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setDefault(): GaxiosPromise[Unit] = js.native
  def setDefault(callback: BodyResponseCallback[Unit]): Unit = js.native
  def setDefault(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def setDefault(params: ParamsResourceUsersSettingsSendasSmimeinfoSetdefault): GaxiosPromise[Unit] = js.native
  def setDefault(params: ParamsResourceUsersSettingsSendasSmimeinfoSetdefault, callback: BodyResponseCallback[Unit]): Unit = js.native
  def setDefault(
    params: ParamsResourceUsersSettingsSendasSmimeinfoSetdefault,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def setDefault(params: ParamsResourceUsersSettingsSendasSmimeinfoSetdefault, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def setDefault(
    params: ParamsResourceUsersSettingsSendasSmimeinfoSetdefault,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}
