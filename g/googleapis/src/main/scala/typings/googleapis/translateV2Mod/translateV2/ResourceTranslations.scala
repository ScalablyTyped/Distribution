package typings.googleapis.translateV2Mod.translateV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/translate/v2", "translate_v2.Resource$Translations")
@js.native
open class ResourceTranslations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaTranslationsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaTranslationsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTranslationsListResponse] = js.native
  def list(params: ParamsResourceTranslationsList): GaxiosPromise[SchemaTranslationsListResponse] = js.native
  def list(
    params: ParamsResourceTranslationsList,
    callback: BodyResponseCallback[SchemaTranslationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceTranslationsList,
    options: BodyResponseCallback[Readable | SchemaTranslationsListResponse],
    callback: BodyResponseCallback[Readable | SchemaTranslationsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTranslationsList, options: MethodOptions): GaxiosPromise[SchemaTranslationsListResponse] = js.native
  def list(
    params: ParamsResourceTranslationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTranslationsListResponse]
  ): Unit = js.native
  /**
    * Translates input text, returning translated text.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/translate.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const translate = google.translate('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-translation',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await language.translations.list({
    *     // The customization id for translate
    *     cid: 'placeholder-value',
    *     // The format of the source text, in either HTML (default) or plain-text. A
    *     // value of "html" indicates HTML and a value of "text" indicates plain-text.
    *     format: 'placeholder-value',
    *     // The `model` type requested for this translation. Valid values are
    *     // listed in public documentation.
    *     model: 'placeholder-value',
    *     // The input text to translate. Repeat this parameter to perform translation
    *     // operations on multiple text inputs.
    *     q: 'placeholder-value',
    *     // The language of the source text, set to one of the language codes listed in
    *     // Language Support. If the source language is not specified, the API will
    *     // attempt to identify the source language automatically and return it within
    *     // the response.
    *     source: 'placeholder-value',
    *     // The language to use for translation of the input text, set to one of the
    *     // language codes listed in Language Support.
    *     target: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "translations": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceTranslationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceTranslationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def translate(): GaxiosPromise[SchemaTranslationsListResponse] = js.native
  def translate(callback: BodyResponseCallback[SchemaTranslationsListResponse]): Unit = js.native
  def translate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTranslationsListResponse] = js.native
  def translate(params: ParamsResourceTranslationsTranslate): GaxiosPromise[SchemaTranslationsListResponse] = js.native
  def translate(
    params: ParamsResourceTranslationsTranslate,
    callback: BodyResponseCallback[SchemaTranslationsListResponse]
  ): Unit = js.native
  def translate(
    params: ParamsResourceTranslationsTranslate,
    options: BodyResponseCallback[Readable | SchemaTranslationsListResponse],
    callback: BodyResponseCallback[Readable | SchemaTranslationsListResponse]
  ): Unit = js.native
  def translate(params: ParamsResourceTranslationsTranslate, options: MethodOptions): GaxiosPromise[SchemaTranslationsListResponse] = js.native
  def translate(
    params: ParamsResourceTranslationsTranslate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTranslationsListResponse]
  ): Unit = js.native
  /**
    * Translates input text, returning translated text.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/translate.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const translate = google.translate('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-translation',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await language.translations.translate({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "format": "my_format",
    *       //   "model": "my_model",
    *       //   "q": [],
    *       //   "source": "my_source",
    *       //   "target": "my_target"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "translations": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def translate(params: ParamsResourceTranslationsTranslate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def translate(
    params: ParamsResourceTranslationsTranslate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
