package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Clientid")
@js.native
open class ResourceManagementClientid protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def hashClientId(): GaxiosPromise[SchemaHashClientIdResponse] = js.native
  def hashClientId(callback: BodyResponseCallback[SchemaHashClientIdResponse]): Unit = js.native
  def hashClientId(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHashClientIdResponse] = js.native
  def hashClientId(params: ParamsResourceManagementClientidHashclientid): GaxiosPromise[SchemaHashClientIdResponse] = js.native
  def hashClientId(
    params: ParamsResourceManagementClientidHashclientid,
    callback: BodyResponseCallback[SchemaHashClientIdResponse]
  ): Unit = js.native
  def hashClientId(
    params: ParamsResourceManagementClientidHashclientid,
    options: BodyResponseCallback[Readable | SchemaHashClientIdResponse],
    callback: BodyResponseCallback[Readable | SchemaHashClientIdResponse]
  ): Unit = js.native
  def hashClientId(params: ParamsResourceManagementClientidHashclientid, options: MethodOptions): GaxiosPromise[SchemaHashClientIdResponse] = js.native
  def hashClientId(
    params: ParamsResourceManagementClientidHashclientid,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHashClientIdResponse]
  ): Unit = js.native
  /**
    * Hashes the given Client ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.clientId.hashClientId({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clientId": "my_clientId",
    *       //   "kind": "my_kind",
    *       //   "webPropertyId": "my_webPropertyId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientId": "my_clientId",
    *   //   "hashedClientId": "my_hashedClientId",
    *   //   "kind": "my_kind",
    *   //   "webPropertyId": "my_webPropertyId"
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
  def hashClientId(params: ParamsResourceManagementClientidHashclientid, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def hashClientId(
    params: ParamsResourceManagementClientidHashclientid,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
