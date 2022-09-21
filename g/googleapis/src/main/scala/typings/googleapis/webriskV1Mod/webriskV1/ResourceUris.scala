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

@JSImport("googleapis/build/src/apis/webrisk/v1", "webrisk_v1.Resource$Uris")
@js.native
open class ResourceUris protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def search(): GaxiosPromise[SchemaGoogleCloudWebriskV1SearchUrisResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaGoogleCloudWebriskV1SearchUrisResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudWebriskV1SearchUrisResponse] = js.native
  def search(params: ParamsResourceUrisSearch): GaxiosPromise[SchemaGoogleCloudWebriskV1SearchUrisResponse] = js.native
  def search(
    params: ParamsResourceUrisSearch,
    callback: BodyResponseCallback[SchemaGoogleCloudWebriskV1SearchUrisResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceUrisSearch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudWebriskV1SearchUrisResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudWebriskV1SearchUrisResponse]
  ): Unit = js.native
  def search(params: ParamsResourceUrisSearch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudWebriskV1SearchUrisResponse] = js.native
  def search(
    params: ParamsResourceUrisSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudWebriskV1SearchUrisResponse]
  ): Unit = js.native
  /**
    * This method is used to check whether a URI is on a given threatList. Multiple threatLists may be searched in a single query. The response will list all requested threatLists the URI was found to match. If the URI is not found on any of the requested ThreatList an empty response will be returned.
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
    *   const res = await webrisk.uris.search({
    *     // Required. The ThreatLists to search in. Multiple ThreatLists may be specified.
    *     threatTypes: 'placeholder-value',
    *     // Required. The URI to be checked for matches.
    *     uri: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "threat": {}
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
  def search(params: ParamsResourceUrisSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceUrisSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
