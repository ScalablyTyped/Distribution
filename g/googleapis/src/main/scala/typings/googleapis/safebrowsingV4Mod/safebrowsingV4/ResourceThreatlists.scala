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

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Threatlists")
@js.native
open class ResourceThreatlists protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4ListThreatListsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleSecuritySafebrowsingV4ListThreatListsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4ListThreatListsResponse] = js.native
  def list(params: ParamsResourceThreatlistsList): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4ListThreatListsResponse] = js.native
  def list(
    params: ParamsResourceThreatlistsList,
    callback: BodyResponseCallback[SchemaGoogleSecuritySafebrowsingV4ListThreatListsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceThreatlistsList,
    options: BodyResponseCallback[Readable | SchemaGoogleSecuritySafebrowsingV4ListThreatListsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleSecuritySafebrowsingV4ListThreatListsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceThreatlistsList, options: MethodOptions): GaxiosPromise[SchemaGoogleSecuritySafebrowsingV4ListThreatListsResponse] = js.native
  def list(
    params: ParamsResourceThreatlistsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleSecuritySafebrowsingV4ListThreatListsResponse]
  ): Unit = js.native
  /**
    * Lists the Safe Browsing threat lists available for download.
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
    *   const res = await safebrowsing.threatLists.list({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "threatLists": []
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
  def list(params: ParamsResourceThreatlistsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceThreatlistsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
