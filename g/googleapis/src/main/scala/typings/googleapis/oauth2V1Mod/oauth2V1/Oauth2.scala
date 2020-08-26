package typings.googleapis.oauth2V1Mod.oauth2V1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google OAuth2 API
  *
  * Obtains end-user authorization grants for use with other Google APIs.
  *
  * @example
  * const {google} = require('googleapis');
  * const oauth2 = google.oauth2('v1');
  *
  * @namespace oauth2
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Oauth2
  */
@JSImport("googleapis/build/src/apis/oauth2/v1", "oauth2_v1.Oauth2")
@js.native
class Oauth2 protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var userinfo: ResourceUserinfo = js.native
  /**
    * oauth2.tokeninfo
    * @desc Get token info
    * @alias oauth2.tokeninfo
    * @memberOf! oauth2(v1)
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.access_token The oauth2 access token
    * @param {string=} params.id_token The ID token
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
}

