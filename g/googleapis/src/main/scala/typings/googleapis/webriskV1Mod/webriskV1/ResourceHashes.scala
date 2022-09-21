package typings.googleapis.webriskV1Mod.webriskV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/webrisk/v1", "webrisk_v1.Resource$Hashes")
@js.native
open class ResourceHashes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def search(): GaxiosPromise[SchemaGoogleCloudWebriskV1SearchHashesResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaGoogleCloudWebriskV1SearchHashesResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudWebriskV1SearchHashesResponse] = js.native
  def search(params: ParamsResourceHashesSearch): GaxiosPromise[SchemaGoogleCloudWebriskV1SearchHashesResponse] = js.native
  def search(
    params: ParamsResourceHashesSearch,
    callback: BodyResponseCallback[SchemaGoogleCloudWebriskV1SearchHashesResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceHashesSearch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudWebriskV1SearchHashesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudWebriskV1SearchHashesResponse]
  ): Unit = js.native
  def search(params: ParamsResourceHashesSearch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudWebriskV1SearchHashesResponse] = js.native
  def search(
    params: ParamsResourceHashesSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudWebriskV1SearchHashesResponse]
  ): Unit = js.native
  /**
    * Gets the full hashes that match the requested hash prefix. This is used after a hash prefix is looked up in a threatList and there is a match. The client side threatList only holds partial hashes so the client must query this method to determine if there is a full hash match of a threat.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/webrisk.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const webrisk = google.webrisk('v1');
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
    *   const res = await webrisk.hashes.search({
    *     // A hash prefix, consisting of the most significant 4-32 bytes of a SHA256 hash. For JSON requests, this field is base64-encoded. Note that if this parameter is provided by a URI, it must be encoded using the web safe base64 variant (RFC 4648).
    *     hashPrefix: 'placeholder-value',
    *     // Required. The ThreatLists to search in. Multiple ThreatLists may be specified.
    *     threatTypes: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "negativeExpireTime": "my_negativeExpireTime",
    *   //   "threats": []
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
  def search(params: ParamsResourceHashesSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceHashesSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
