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

@JSImport("googleapis/build/src/apis/texttospeech/v1beta1", "texttospeech_v1beta1.Resource$Text")
@js.native
open class ResourceText protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def synthesize(): GaxiosPromise[SchemaSynthesizeSpeechResponse] = js.native
  def synthesize(callback: BodyResponseCallback[SchemaSynthesizeSpeechResponse]): Unit = js.native
  def synthesize(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSynthesizeSpeechResponse] = js.native
  def synthesize(params: ParamsResourceTextSynthesize): GaxiosPromise[SchemaSynthesizeSpeechResponse] = js.native
  def synthesize(
    params: ParamsResourceTextSynthesize,
    callback: BodyResponseCallback[SchemaSynthesizeSpeechResponse]
  ): Unit = js.native
  def synthesize(
    params: ParamsResourceTextSynthesize,
    options: BodyResponseCallback[Readable | SchemaSynthesizeSpeechResponse],
    callback: BodyResponseCallback[Readable | SchemaSynthesizeSpeechResponse]
  ): Unit = js.native
  def synthesize(params: ParamsResourceTextSynthesize, options: MethodOptions): GaxiosPromise[SchemaSynthesizeSpeechResponse] = js.native
  def synthesize(
    params: ParamsResourceTextSynthesize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSynthesizeSpeechResponse]
  ): Unit = js.native
  /**
    * Synthesizes speech synchronously: receive results after all text input has been processed.
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
    *   const res = await texttospeech.text.synthesize({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "audioConfig": {},
    *       //   "enableTimePointing": [],
    *       //   "input": {},
    *       //   "voice": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "audioConfig": {},
    *   //   "audioContent": "my_audioContent",
    *   //   "timepoints": []
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
  def synthesize(params: ParamsResourceTextSynthesize, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def synthesize(
    params: ParamsResourceTextSynthesize,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
