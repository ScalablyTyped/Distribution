package typings.googleapis.v34Mod.dfareportingV34

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.4", "dfareporting_v3_4.Resource$Videoformats")
@js.native
open class ResourceVideoformats protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaVideoFormat] = js.native
  def get(callback: BodyResponseCallback[SchemaVideoFormat]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVideoFormat] = js.native
  def get(params: ParamsResourceVideoformatsGet): GaxiosPromise[SchemaVideoFormat] = js.native
  def get(params: ParamsResourceVideoformatsGet, callback: BodyResponseCallback[SchemaVideoFormat]): Unit = js.native
  def get(
    params: ParamsResourceVideoformatsGet,
    options: BodyResponseCallback[Readable | SchemaVideoFormat],
    callback: BodyResponseCallback[Readable | SchemaVideoFormat]
  ): Unit = js.native
  def get(params: ParamsResourceVideoformatsGet, options: MethodOptions): GaxiosPromise[SchemaVideoFormat] = js.native
  def get(
    params: ParamsResourceVideoformatsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVideoFormat]
  ): Unit = js.native
  /**
    * Gets one video format by ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.videoFormats.get({
    *     // Video format ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "fileType": "my_fileType",
    *   //   "id": 0,
    *   //   "kind": "my_kind",
    *   //   "resolution": {},
    *   //   "targetBitRate": 0
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
  def get(params: ParamsResourceVideoformatsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceVideoformatsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaVideoFormatsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaVideoFormatsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVideoFormatsListResponse] = js.native
  def list(params: ParamsResourceVideoformatsList): GaxiosPromise[SchemaVideoFormatsListResponse] = js.native
  def list(
    params: ParamsResourceVideoformatsList,
    callback: BodyResponseCallback[SchemaVideoFormatsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceVideoformatsList,
    options: BodyResponseCallback[Readable | SchemaVideoFormatsListResponse],
    callback: BodyResponseCallback[Readable | SchemaVideoFormatsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceVideoformatsList, options: MethodOptions): GaxiosPromise[SchemaVideoFormatsListResponse] = js.native
  def list(
    params: ParamsResourceVideoformatsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVideoFormatsListResponse]
  ): Unit = js.native
  /**
    * Lists available video formats.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.videoFormats.list({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "videoFormats": []
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
  def list(params: ParamsResourceVideoformatsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceVideoformatsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
