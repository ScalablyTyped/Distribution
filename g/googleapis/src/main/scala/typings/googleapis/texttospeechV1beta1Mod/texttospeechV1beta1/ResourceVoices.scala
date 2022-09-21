package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/texttospeech/v1beta1", "texttospeech_v1beta1.Resource$Voices")
@js.native
open class ResourceVoices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListVoicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVoicesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVoicesResponse] = js.native
  def list(params: ParamsResourceVoicesList): GaxiosPromise[SchemaListVoicesResponse] = js.native
  def list(params: ParamsResourceVoicesList, callback: BodyResponseCallback[SchemaListVoicesResponse]): Unit = js.native
  def list(
    params: ParamsResourceVoicesList,
    options: BodyResponseCallback[Readable | SchemaListVoicesResponse],
    callback: BodyResponseCallback[Readable | SchemaListVoicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceVoicesList, options: MethodOptions): GaxiosPromise[SchemaListVoicesResponse] = js.native
  def list(
    params: ParamsResourceVoicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVoicesResponse]
  ): Unit = js.native
  /**
    * Returns a list of Voice supported for synthesis.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/texttospeech.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const texttospeech = google.texttospeech('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await texttospeech.voices.list({
    *     // Optional. Recommended. [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. If not specified, the API will return all supported voices. If specified, the ListVoices call will only return voices that can be used to synthesize this language_code. For example, if you specify `"en-NZ"`, all `"en-NZ"` voices will be returned. If you specify `"no"`, both `"no-\*"` (Norwegian) and `"nb-\*"` (Norwegian Bokmal) voices will be returned.
    *     languageCode: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "voices": []
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
  def list(params: ParamsResourceVoicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceVoicesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
