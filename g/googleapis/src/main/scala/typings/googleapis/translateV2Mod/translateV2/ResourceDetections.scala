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

@JSImport("googleapis/build/src/apis/translate/v2", "translate_v2.Resource$Detections")
@js.native
open class ResourceDetections protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def detect(): GaxiosPromise[SchemaDetectionsListResponse] = js.native
  def detect(callback: BodyResponseCallback[SchemaDetectionsListResponse]): Unit = js.native
  def detect(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDetectionsListResponse] = js.native
  def detect(params: ParamsResourceDetectionsDetect): GaxiosPromise[SchemaDetectionsListResponse] = js.native
  def detect(
    params: ParamsResourceDetectionsDetect,
    callback: BodyResponseCallback[SchemaDetectionsListResponse]
  ): Unit = js.native
  def detect(
    params: ParamsResourceDetectionsDetect,
    options: BodyResponseCallback[Readable | SchemaDetectionsListResponse],
    callback: BodyResponseCallback[Readable | SchemaDetectionsListResponse]
  ): Unit = js.native
  def detect(params: ParamsResourceDetectionsDetect, options: MethodOptions): GaxiosPromise[SchemaDetectionsListResponse] = js.native
  def detect(
    params: ParamsResourceDetectionsDetect,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDetectionsListResponse]
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
    *   const res = await language.detections.detect({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "q": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "detections": []
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
  def detect(params: ParamsResourceDetectionsDetect, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def detect(
    params: ParamsResourceDetectionsDetect,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaDetectionsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDetectionsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDetectionsListResponse] = js.native
  def list(params: ParamsResourceDetectionsList): GaxiosPromise[SchemaDetectionsListResponse] = js.native
  def list(params: ParamsResourceDetectionsList, callback: BodyResponseCallback[SchemaDetectionsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceDetectionsList,
    options: BodyResponseCallback[Readable | SchemaDetectionsListResponse],
    callback: BodyResponseCallback[Readable | SchemaDetectionsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDetectionsList, options: MethodOptions): GaxiosPromise[SchemaDetectionsListResponse] = js.native
  def list(
    params: ParamsResourceDetectionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDetectionsListResponse]
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
    *   const res = await language.detections.list({
    *     // The input text upon which to perform language detection. Repeat this
    *     // parameter to perform language detection on multiple text inputs.
    *     q: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "detections": []
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
  def list(params: ParamsResourceDetectionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDetectionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
