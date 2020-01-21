package typings.googleapis.translateV2Mod.translateV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/translate/v2", "translate_v2.Resource$Translations")
@js.native
class ResourceTranslations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * language.translations.list
    * @desc Translates input text, returning translated text.
    * @alias language.translations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.cid The customization id for translate
    * @param {string=} params.format The format of the source text, in either HTML (default) or plain-text. A value of "html" indicates HTML and a value of "text" indicates plain-text.
    * @param {string=} params.model The `model` type requested for this translation. Valid values are listed in public documentation.
    * @param {string} params.q The input text to translate. Repeat this parameter to perform translation operations on multiple text inputs.
    * @param {string=} params.source The language of the source text, set to one of the language codes listed in Language Support. If the source language is not specified, the API will attempt to identify the source language automatically and return it within the response.
    * @param {string} params.target The language to use for translation of the input text, set to one of the language codes listed in Language Support.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaTranslationsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaTranslationsListResponse]): Unit = js.native
  def list(params: ParamsResourceTranslationsList): GaxiosPromise[SchemaTranslationsListResponse] = js.native
  def list(
    params: ParamsResourceTranslationsList,
    callback: BodyResponseCallback[SchemaTranslationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceTranslationsList,
    options: BodyResponseCallback[SchemaTranslationsListResponse],
    callback: BodyResponseCallback[SchemaTranslationsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTranslationsList, options: MethodOptions): GaxiosPromise[SchemaTranslationsListResponse] = js.native
  def list(
    params: ParamsResourceTranslationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTranslationsListResponse]
  ): Unit = js.native
  /**
    * language.translations.translate
    * @desc Translates input text, returning translated text.
    * @alias language.translations.translate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().TranslateTextRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def translate(): GaxiosPromise[SchemaTranslationsListResponse] = js.native
  def translate(callback: BodyResponseCallback[SchemaTranslationsListResponse]): Unit = js.native
  def translate(params: ParamsResourceTranslationsTranslate): GaxiosPromise[SchemaTranslationsListResponse] = js.native
  def translate(
    params: ParamsResourceTranslationsTranslate,
    callback: BodyResponseCallback[SchemaTranslationsListResponse]
  ): Unit = js.native
  def translate(
    params: ParamsResourceTranslationsTranslate,
    options: BodyResponseCallback[SchemaTranslationsListResponse],
    callback: BodyResponseCallback[SchemaTranslationsListResponse]
  ): Unit = js.native
  def translate(params: ParamsResourceTranslationsTranslate, options: MethodOptions): GaxiosPromise[SchemaTranslationsListResponse] = js.native
  def translate(
    params: ParamsResourceTranslationsTranslate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTranslationsListResponse]
  ): Unit = js.native
}

