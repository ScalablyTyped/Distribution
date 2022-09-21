package typings.googleapis.speechV1p1beta1Mod.speechV1p1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/speech/v1p1beta1", "speech_v1p1beta1.Resource$Speech")
@js.native
open class ResourceSpeech protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def longrunningrecognize(): GaxiosPromise[SchemaOperation] = js.native
  def longrunningrecognize(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def longrunningrecognize(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def longrunningrecognize(params: ParamsResourceSpeechLongrunningrecognize): GaxiosPromise[SchemaOperation] = js.native
  def longrunningrecognize(params: ParamsResourceSpeechLongrunningrecognize, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def longrunningrecognize(
    params: ParamsResourceSpeechLongrunningrecognize,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def longrunningrecognize(params: ParamsResourceSpeechLongrunningrecognize, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def longrunningrecognize(
    params: ParamsResourceSpeechLongrunningrecognize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Performs asynchronous speech recognition: receive results via the google.longrunning.Operations interface. Returns either an `Operation.error` or an `Operation.response` which contains a `LongRunningRecognizeResponse` message. For more information on asynchronous speech recognition, see the [how-to](https://cloud.google.com/speech-to-text/docs/async-recognize).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/speech.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const speech = google.speech('v1p1beta1');
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
    *   const res = await speech.speech.longrunningrecognize({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "audio": {},
    *       //   "config": {},
    *       //   "outputConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def longrunningrecognize(params: ParamsResourceSpeechLongrunningrecognize, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def longrunningrecognize(
    params: ParamsResourceSpeechLongrunningrecognize,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def recognize(): GaxiosPromise[SchemaRecognizeResponse] = js.native
  def recognize(callback: BodyResponseCallback[SchemaRecognizeResponse]): Unit = js.native
  def recognize(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRecognizeResponse] = js.native
  def recognize(params: ParamsResourceSpeechRecognize): GaxiosPromise[SchemaRecognizeResponse] = js.native
  def recognize(params: ParamsResourceSpeechRecognize, callback: BodyResponseCallback[SchemaRecognizeResponse]): Unit = js.native
  def recognize(
    params: ParamsResourceSpeechRecognize,
    options: BodyResponseCallback[Readable | SchemaRecognizeResponse],
    callback: BodyResponseCallback[Readable | SchemaRecognizeResponse]
  ): Unit = js.native
  def recognize(params: ParamsResourceSpeechRecognize, options: MethodOptions): GaxiosPromise[SchemaRecognizeResponse] = js.native
  def recognize(
    params: ParamsResourceSpeechRecognize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRecognizeResponse]
  ): Unit = js.native
  /**
    * Performs synchronous speech recognition: receive results after all audio has been sent and processed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/speech.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const speech = google.speech('v1p1beta1');
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
    *   const res = await speech.speech.recognize({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "audio": {},
    *       //   "config": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "results": [],
    *   //   "totalBilledTime": "my_totalBilledTime"
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
  def recognize(params: ParamsResourceSpeechRecognize, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def recognize(
    params: ParamsResourceSpeechRecognize,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
