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

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Threatmatches")
@js.native
open class ResourceThreatmatches protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def find(): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesResponse] = js.native
  def find(callback: BodyResponseCallback[SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesResponse]): Unit = js.native
  def find(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesResponse] = js.native
  def find(params: ParamsResourceThreatmatchesFind): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesResponse] = js.native
  def find(
    params: ParamsResourceThreatmatchesFind,
    callback: BodyResponseCallback[SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesResponse]
  ): Unit = js.native
  def find(
    params: ParamsResourceThreatmatchesFind,
    options: BodyResponseCallback[Readable | SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesResponse]
  ): Unit = js.native
  def find(params: ParamsResourceThreatmatchesFind, options: MethodOptions): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesResponse] = js.native
  def find(
    params: ParamsResourceThreatmatchesFind,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesResponse]
  ): Unit = js.native
  /**
    * Finds the threat entries that match the Safe Browsing lists.
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
    *   const res = await safebrowsing.threatMatches.find({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "client": {},
    *       //   "threatInfo": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "matches": []
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
  def find(params: ParamsResourceThreatmatchesFind, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def find(
    params: ParamsResourceThreatmatchesFind,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
