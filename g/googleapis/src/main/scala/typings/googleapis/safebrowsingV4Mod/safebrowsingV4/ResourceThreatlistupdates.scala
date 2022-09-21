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

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Threatlistupdates")
@js.native
open class ResourceThreatlistupdates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def fetch(): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse] = js.native
  def fetch(callback: BodyResponseCallback[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse]): Unit = js.native
  def fetch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse] = js.native
  def fetch(params: ParamsResourceThreatlistupdatesFetch): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse] = js.native
  def fetch(
    params: ParamsResourceThreatlistupdatesFetch,
    callback: BodyResponseCallback[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse]
  ): Unit = js.native
  def fetch(
    params: ParamsResourceThreatlistupdatesFetch,
    options: BodyResponseCallback[Readable | SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse]
  ): Unit = js.native
  def fetch(params: ParamsResourceThreatlistupdatesFetch, options: MethodOptions): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse] = js.native
  def fetch(
    params: ParamsResourceThreatlistupdatesFetch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse]
  ): Unit = js.native
  /**
    * Fetches the most recent threat list updates. A client can request updates for multiple lists at once.
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
    *   const res = await safebrowsing.threatListUpdates.fetch({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "client": {},
    *       //   "listUpdateRequests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "listUpdateResponses": [],
    *   //   "minimumWaitDuration": "my_minimumWaitDuration"
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
  def fetch(params: ParamsResourceThreatlistupdatesFetch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def fetch(
    params: ParamsResourceThreatlistupdatesFetch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
