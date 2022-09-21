package typings.googleapis.translateV3beta1Mod.translateV3beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/translate/v3beta1", "translate_v3beta1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def detectLanguage(): GaxiosPromise[SchemaDetectLanguageResponse] = js.native
  def detectLanguage(callback: BodyResponseCallback[SchemaDetectLanguageResponse]): Unit = js.native
  def detectLanguage(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDetectLanguageResponse] = js.native
  def detectLanguage(params: ParamsResourceProjectsDetectlanguage): GaxiosPromise[SchemaDetectLanguageResponse] = js.native
  def detectLanguage(
    params: ParamsResourceProjectsDetectlanguage,
    callback: BodyResponseCallback[SchemaDetectLanguageResponse]
  ): Unit = js.native
  def detectLanguage(
    params: ParamsResourceProjectsDetectlanguage,
    options: BodyResponseCallback[Readable | SchemaDetectLanguageResponse],
    callback: BodyResponseCallback[Readable | SchemaDetectLanguageResponse]
  ): Unit = js.native
  def detectLanguage(params: ParamsResourceProjectsDetectlanguage, options: MethodOptions): GaxiosPromise[SchemaDetectLanguageResponse] = js.native
  def detectLanguage(
    params: ParamsResourceProjectsDetectlanguage,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDetectLanguageResponse]
  ): Unit = js.native
  /**
    * Detects the language of text within a request.
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
    * const translate = google.translate('v3beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-translation',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await translate.projects.detectLanguage({
    *     // Required. Project or location to make a call. Must refer to a caller's project. Format: `projects/{project-number-or-id\}/locations/{location-id\}` or `projects/{project-number-or-id\}`. For global calls, use `projects/{project-number-or-id\}/locations/global` or `projects/{project-number-or-id\}`. Only models within the same region (has same location-id) can be used. Otherwise an INVALID_ARGUMENT (400) error is returned.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "content": "my_content",
    *       //   "labels": {},
    *       //   "mimeType": "my_mimeType",
    *       //   "model": "my_model"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "languages": []
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
  def detectLanguage(params: ParamsResourceProjectsDetectlanguage, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def detectLanguage(
    params: ParamsResourceProjectsDetectlanguage,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getSupportedLanguages(): GaxiosPromise[SchemaSupportedLanguages] = js.native
  def getSupportedLanguages(callback: BodyResponseCallback[SchemaSupportedLanguages]): Unit = js.native
  def getSupportedLanguages(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSupportedLanguages] = js.native
  def getSupportedLanguages(params: ParamsResourceProjectsGetsupportedlanguages): GaxiosPromise[SchemaSupportedLanguages] = js.native
  def getSupportedLanguages(
    params: ParamsResourceProjectsGetsupportedlanguages,
    callback: BodyResponseCallback[SchemaSupportedLanguages]
  ): Unit = js.native
  def getSupportedLanguages(
    params: ParamsResourceProjectsGetsupportedlanguages,
    options: BodyResponseCallback[Readable | SchemaSupportedLanguages],
    callback: BodyResponseCallback[Readable | SchemaSupportedLanguages]
  ): Unit = js.native
  def getSupportedLanguages(params: ParamsResourceProjectsGetsupportedlanguages, options: MethodOptions): GaxiosPromise[SchemaSupportedLanguages] = js.native
  def getSupportedLanguages(
    params: ParamsResourceProjectsGetsupportedlanguages,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSupportedLanguages]
  ): Unit = js.native
  /**
    * Returns a list of supported languages for translation.
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
    * const translate = google.translate('v3beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-translation',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await translate.projects.getSupportedLanguages({
    *     // Optional. The language to use to return localized, human readable names of supported languages. If missing, then display names are not returned in a response.
    *     displayLanguageCode: 'placeholder-value',
    *     // Optional. Get supported languages of this model. The format depends on model type: - AutoML Translation models: `projects/{project-number-or-id\}/locations/{location-id\}/models/{model-id\}` - General (built-in) models: `projects/{project-number-or-id\}/locations/{location-id\}/models/general/nmt`, Returns languages supported by the specified model. If missing, we get supported languages of Google general NMT model.
    *     model: 'placeholder-value',
    *     // Required. Project or location to make a call. Must refer to a caller's project. Format: `projects/{project-number-or-id\}` or `projects/{project-number-or-id\}/locations/{location-id\}`. For global calls, use `projects/{project-number-or-id\}/locations/global` or `projects/{project-number-or-id\}`. Non-global location is required for AutoML models. Only models within the same region (have same location-id) can be used, otherwise an INVALID_ARGUMENT (400) error is returned.
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "languages": []
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
  def getSupportedLanguages(params: ParamsResourceProjectsGetsupportedlanguages, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getSupportedLanguages(
    params: ParamsResourceProjectsGetsupportedlanguages,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var locations: ResourceProjectsLocations = js.native
  
  def translateText(): GaxiosPromise[SchemaTranslateTextResponse] = js.native
  def translateText(callback: BodyResponseCallback[SchemaTranslateTextResponse]): Unit = js.native
  def translateText(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTranslateTextResponse] = js.native
  def translateText(params: ParamsResourceProjectsTranslatetext): GaxiosPromise[SchemaTranslateTextResponse] = js.native
  def translateText(
    params: ParamsResourceProjectsTranslatetext,
    callback: BodyResponseCallback[SchemaTranslateTextResponse]
  ): Unit = js.native
  def translateText(
    params: ParamsResourceProjectsTranslatetext,
    options: BodyResponseCallback[Readable | SchemaTranslateTextResponse],
    callback: BodyResponseCallback[Readable | SchemaTranslateTextResponse]
  ): Unit = js.native
  def translateText(params: ParamsResourceProjectsTranslatetext, options: MethodOptions): GaxiosPromise[SchemaTranslateTextResponse] = js.native
  def translateText(
    params: ParamsResourceProjectsTranslatetext,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTranslateTextResponse]
  ): Unit = js.native
  /**
    * Translates input text and returns translated text.
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
    * const translate = google.translate('v3beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-translation',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await translate.projects.translateText({
    *     // Required. Project or location to make a call. Must refer to a caller's project. Format: `projects/{project-number-or-id\}` or `projects/{project-number-or-id\}/locations/{location-id\}`. For global calls, use `projects/{project-number-or-id\}/locations/global` or `projects/{project-number-or-id\}`. Non-global location is required for requests using AutoML models or custom glossaries. Models and glossaries must be within the same region (have same location-id), otherwise an INVALID_ARGUMENT (400) error is returned.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contents": [],
    *       //   "glossaryConfig": {},
    *       //   "labels": {},
    *       //   "mimeType": "my_mimeType",
    *       //   "model": "my_model",
    *       //   "sourceLanguageCode": "my_sourceLanguageCode",
    *       //   "targetLanguageCode": "my_targetLanguageCode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "glossaryTranslations": [],
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
  def translateText(params: ParamsResourceProjectsTranslatetext, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def translateText(
    params: ParamsResourceProjectsTranslatetext,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
