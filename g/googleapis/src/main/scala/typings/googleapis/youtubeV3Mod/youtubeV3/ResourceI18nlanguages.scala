package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$I18nlanguages")
@js.native
class ResourceI18nlanguages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtube.i18nLanguages.list
    * @desc Returns a list of application languages that the YouTube website
    * supports.
    * @alias youtube.i18nLanguages.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.hl The hl parameter specifies the language that should be used for text values in the API response.
    * @param {string} params.part The part parameter specifies the i18nLanguage resource properties that the API response will include. Set the parameter value to snippet.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaI18nLanguageListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaI18nLanguageListResponse]): Unit = js.native
  def list(params: ParamsResourceI18nlanguagesList): GaxiosPromise[SchemaI18nLanguageListResponse] = js.native
  def list(
    params: ParamsResourceI18nlanguagesList,
    callback: BodyResponseCallback[SchemaI18nLanguageListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceI18nlanguagesList,
    options: BodyResponseCallback[SchemaI18nLanguageListResponse],
    callback: BodyResponseCallback[SchemaI18nLanguageListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceI18nlanguagesList, options: MethodOptions): GaxiosPromise[SchemaI18nLanguageListResponse] = js.native
  def list(
    params: ParamsResourceI18nlanguagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaI18nLanguageListResponse]
  ): Unit = js.native
}

