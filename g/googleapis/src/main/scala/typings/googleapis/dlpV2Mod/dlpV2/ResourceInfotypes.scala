package typings.googleapis.dlpV2Mod.dlpV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Infotypes")
@js.native
class ResourceInfotypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dlp.infoTypes.list
    * @desc Returns a list of the sensitive information types that the DLP API
    * supports. See https://cloud.google.com/dlp/docs/infotypes-reference to
    * learn more.
    * @alias dlp.infoTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Optional filter to only return infoTypes supported by certain parts of the API. Defaults to supported_by=INSPECT.
    * @param {string=} params.languageCode Optional BCP-47 language code for localized infoType friendly names. If omitted, or if localized strings are not available, en-US strings will be returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGooglePrivacyDlpV2ListInfoTypesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListInfoTypesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListInfoTypesResponse] = js.native
  def list(params: ParamsResourceInfotypesList): GaxiosPromise[SchemaGooglePrivacyDlpV2ListInfoTypesResponse] = js.native
  def list(
    params: ParamsResourceInfotypesList,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListInfoTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceInfotypesList,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListInfoTypesResponse],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListInfoTypesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceInfotypesList, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListInfoTypesResponse] = js.native
  def list(
    params: ParamsResourceInfotypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListInfoTypesResponse]
  ): Unit = js.native
}
