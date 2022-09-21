package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Fullhashes")
@js.native
open class ResourceFullhashes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def find(): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4FindFullHashesResponse] = js.native
  def find(callback: BodyResponseCallback[SchemaGoogleSecuritySafebrowsingV4FindFullHashesResponse]): Unit = js.native
  def find(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4FindFullHashesResponse] = js.native
  def find(params: ParamsResourceFullhashesFind): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4FindFullHashesResponse] = js.native
  def find(
    params: ParamsResourceFullhashesFind,
    callback: BodyResponseCallback[SchemaGoogleSecuritySafebrowsingV4FindFullHashesResponse]
  ): Unit = js.native
  def find(
    params: ParamsResourceFullhashesFind,
    options: BodyResponseCallback[Readable | SchemaGoogleSecuritySafebrowsingV4FindFullHashesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleSecuritySafebrowsingV4FindFullHashesResponse]
  ): Unit = js.native
  def find(params: ParamsResourceFullhashesFind, options: MethodOptions): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4FindFullHashesResponse] = js.native
  def find(
    params: ParamsResourceFullhashesFind,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleSecuritySafebrowsingV4FindFullHashesResponse]
  ): Unit = js.native
  /**
    * Finds the full hashes that match the requested hash prefixes.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/safebrowsing.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const safebrowsing = google.safebrowsing('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await safebrowsing.fullHashes.find({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apiClient": {},
    *       //   "client": {},
    *       //   "clientStates": [],
    *       //   "threatInfo": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "matches": [],
    *   //   "minimumWaitDuration": "my_minimumWaitDuration",
    *   //   "negativeCacheDuration": "my_negativeCacheDuration"
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
  def find(params: ParamsResourceFullhashesFind, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def find(
    params: ParamsResourceFullhashesFind,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
