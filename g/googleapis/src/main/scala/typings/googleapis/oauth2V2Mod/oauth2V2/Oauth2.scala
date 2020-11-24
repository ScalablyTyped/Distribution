package typings.googleapis.oauth2V2Mod.oauth2V2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google OAuth2 API
  *
  * Obtains end-user authorization grants for use with other Google APIs.
  *
  * @example
  * const {google} = require('googleapis');
  * const oauth2 = google.oauth2('v2');
  *
  * @namespace oauth2
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Oauth2
  */
@JSImport("googleapis/build/src/apis/oauth2/v2", "oauth2_v2.Oauth2")
@js.native
class Oauth2 protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * oauth2.getCertForOpenIdConnect
    * @alias oauth2.getCertForOpenIdConnect
    * @memberOf! oauth2(v2)
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getCertForOpenIdConnect(): GaxiosPromise[SchemaJwk] = js.native
  def getCertForOpenIdConnect(callback: BodyResponseCallback[SchemaJwk]): Unit = js.native
  def getCertForOpenIdConnect(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaJwk] = js.native
  def getCertForOpenIdConnect(params: ParamsGetcertforopenidconnect): GaxiosPromise[SchemaJwk] = js.native
  def getCertForOpenIdConnect(params: ParamsGetcertforopenidconnect, callback: BodyResponseCallback[SchemaJwk]): Unit = js.native
  def getCertForOpenIdConnect(
    params: ParamsGetcertforopenidconnect,
    options: BodyResponseCallback[SchemaJwk],
    callback: BodyResponseCallback[SchemaJwk]
  ): Unit = js.native
  def getCertForOpenIdConnect(params: ParamsGetcertforopenidconnect, options: MethodOptions): GaxiosPromise[SchemaJwk] = js.native
  def getCertForOpenIdConnect(
    params: ParamsGetcertforopenidconnect,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJwk]
  ): Unit = js.native
  
  /**
    * oauth2.tokeninfo
    * @alias oauth2.tokeninfo
    * @memberOf! oauth2(v2)
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.access_token
    * @param {string=} params.id_token
    * @param {string=} params.token_handle
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def tokeninfo(): GaxiosPromise[SchemaTokeninfo] = js.native
  def tokeninfo(callback: BodyResponseCallback[SchemaTokeninfo]): Unit = js.native
  def tokeninfo(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTokeninfo] = js.native
  def tokeninfo(params: ParamsTokeninfo): GaxiosPromise[SchemaTokeninfo] = js.native
  def tokeninfo(params: ParamsTokeninfo, callback: BodyResponseCallback[SchemaTokeninfo]): Unit = js.native
  def tokeninfo(
    params: ParamsTokeninfo,
    options: BodyResponseCallback[SchemaTokeninfo],
    callback: BodyResponseCallback[SchemaTokeninfo]
  ): Unit = js.native
  def tokeninfo(params: ParamsTokeninfo, options: MethodOptions): GaxiosPromise[SchemaTokeninfo] = js.native
  def tokeninfo(params: ParamsTokeninfo, options: MethodOptions, callback: BodyResponseCallback[SchemaTokeninfo]): Unit = js.native
  
  var userinfo: ResourceUserinfo = js.native
}
