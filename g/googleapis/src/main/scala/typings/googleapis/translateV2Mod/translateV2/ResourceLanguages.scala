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

@JSImport("googleapis/build/src/apis/translate/v2", "translate_v2.Resource$Languages")
@js.native
open class ResourceLanguages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaLanguagesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaLanguagesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLanguagesListResponse] = js.native
  def list(params: ParamsResourceLanguagesList): GaxiosPromise[SchemaLanguagesListResponse] = js.native
  def list(params: ParamsResourceLanguagesList, callback: BodyResponseCallback[SchemaLanguagesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceLanguagesList,
    options: BodyResponseCallback[Readable | SchemaLanguagesListResponse],
    callback: BodyResponseCallback[Readable | SchemaLanguagesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLanguagesList, options: MethodOptions): GaxiosPromise[SchemaLanguagesListResponse] = js.native
  def list(
    params: ParamsResourceLanguagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLanguagesListResponse]
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
    *   const res = await language.languages.list({
    *     // The model type for which supported languages should be returned.
    *     model: 'placeholder-value',
    *     // The language to use to return localized, human readable names of supported
    *     // languages.
    *     target: 'placeholder-value',
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
  def list(params: ParamsResourceLanguagesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceLanguagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
