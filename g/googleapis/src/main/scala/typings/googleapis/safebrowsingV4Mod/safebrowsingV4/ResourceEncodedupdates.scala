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

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Encodedupdates")
@js.native
open class ResourceEncodedupdates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse] = js.native
  def get(params: ParamsResourceEncodedupdatesGet): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse] = js.native
  def get(
    params: ParamsResourceEncodedupdatesGet,
    callback: BodyResponseCallback[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse]
  ): Unit = js.native
  def get(
    params: ParamsResourceEncodedupdatesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse]
  ): Unit = js.native
  def get(params: ParamsResourceEncodedupdatesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse] = js.native
  def get(
    params: ParamsResourceEncodedupdatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse]
  ): Unit = js.native
  /**
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
    *   const res = await safebrowsing.encodedUpdates.get({
    *     // A client ID that uniquely identifies the client implementation of the Safe Browsing API.
    *     clientId: 'placeholder-value',
    *     // The version of the client implementation.
    *     clientVersion: 'placeholder-value',
    *     // A serialized FetchThreatListUpdatesRequest proto.
    *     encodedRequest: 'placeholder-value',
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
  def get(params: ParamsResourceEncodedupdatesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEncodedupdatesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
