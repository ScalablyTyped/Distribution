package typings.googleapis.translateV2Mod.translateV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/translate/v2", "translate_v2.Resource$Languages")
@js.native
class ResourceLanguages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * language.languages.list
    * @desc Returns a list of supported languages for translation.
    * @alias language.languages.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.model The model type for which supported languages should be returned.
    * @param {string=} params.target The language to use to return localized, human readable names of supported languages.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaLanguagesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaLanguagesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLanguagesListResponse] = js.native
  def list(params: ParamsResourceLanguagesList): GaxiosPromise[SchemaLanguagesListResponse] = js.native
  def list(params: ParamsResourceLanguagesList, callback: BodyResponseCallback[SchemaLanguagesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceLanguagesList,
    options: BodyResponseCallback[SchemaLanguagesListResponse],
    callback: BodyResponseCallback[SchemaLanguagesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLanguagesList, options: MethodOptions): GaxiosPromise[SchemaLanguagesListResponse] = js.native
  def list(
    params: ParamsResourceLanguagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLanguagesListResponse]
  ): Unit = js.native
}
