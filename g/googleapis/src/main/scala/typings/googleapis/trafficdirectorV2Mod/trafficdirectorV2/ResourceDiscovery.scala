package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/trafficdirector/v2", "trafficdirector_v2.Resource$Discovery")
@js.native
open class ResourceDiscovery protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def client_status(): GaxiosPromise[SchemaClientStatusResponse] = js.native
  def client_status(callback: BodyResponseCallback[SchemaClientStatusResponse]): Unit = js.native
  def client_status(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClientStatusResponse] = js.native
  def client_status(params: ParamsResourceDiscoveryClientStatus): GaxiosPromise[SchemaClientStatusResponse] = js.native
  def client_status(
    params: ParamsResourceDiscoveryClientStatus,
    callback: BodyResponseCallback[SchemaClientStatusResponse]
  ): Unit = js.native
  def client_status(
    params: ParamsResourceDiscoveryClientStatus,
    options: BodyResponseCallback[Readable | SchemaClientStatusResponse],
    callback: BodyResponseCallback[Readable | SchemaClientStatusResponse]
  ): Unit = js.native
  def client_status(params: ParamsResourceDiscoveryClientStatus, options: MethodOptions): GaxiosPromise[SchemaClientStatusResponse] = js.native
  def client_status(
    params: ParamsResourceDiscoveryClientStatus,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClientStatusResponse]
  ): Unit = js.native
  /**
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/trafficdirector.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const trafficdirector = google.trafficdirector('v2');
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
    *   const res = await trafficdirector.discovery.client_status({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "nodeMatchers": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "config": []
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
  def client_status(params: ParamsResourceDiscoveryClientStatus, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def client_status(
    params: ParamsResourceDiscoveryClientStatus,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
