package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Shoppingadsprogram")
@js.native
open class ResourceShoppingadsprogram protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaShoppingAdsProgramStatus] = js.native
  def get(callback: BodyResponseCallback[SchemaShoppingAdsProgramStatus]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaShoppingAdsProgramStatus] = js.native
  def get(params: ParamsResourceShoppingadsprogramGet): GaxiosPromise[SchemaShoppingAdsProgramStatus] = js.native
  def get(
    params: ParamsResourceShoppingadsprogramGet,
    callback: BodyResponseCallback[SchemaShoppingAdsProgramStatus]
  ): Unit = js.native
  def get(
    params: ParamsResourceShoppingadsprogramGet,
    options: BodyResponseCallback[Readable | SchemaShoppingAdsProgramStatus],
    callback: BodyResponseCallback[Readable | SchemaShoppingAdsProgramStatus]
  ): Unit = js.native
  def get(params: ParamsResourceShoppingadsprogramGet, options: MethodOptions): GaxiosPromise[SchemaShoppingAdsProgramStatus] = js.native
  def get(
    params: ParamsResourceShoppingadsprogramGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaShoppingAdsProgramStatus]
  ): Unit = js.native
  /**
    * Retrieves the status and review eligibility for the Shopping Ads program.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.shoppingadsprogram.get({
    *     // Required. The ID of the account.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "globalState": "my_globalState",
    *   //   "regionStatuses": []
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
  def get(params: ParamsResourceShoppingadsprogramGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceShoppingadsprogramGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def requestreview(): GaxiosPromise[Unit] = js.native
  def requestreview(callback: BodyResponseCallback[Unit]): Unit = js.native
  def requestreview(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def requestreview(params: ParamsResourceShoppingadsprogramRequestreview): GaxiosPromise[Unit] = js.native
  def requestreview(params: ParamsResourceShoppingadsprogramRequestreview, callback: BodyResponseCallback[Unit]): Unit = js.native
  def requestreview(
    params: ParamsResourceShoppingadsprogramRequestreview,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def requestreview(params: ParamsResourceShoppingadsprogramRequestreview, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def requestreview(
    params: ParamsResourceShoppingadsprogramRequestreview,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Requests a review of Shopping ads in a specific region. This method is only available to selected merchants.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.shoppingadsprogram.requestreview({
    *     // Required. The ID of the account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "regionCode": "my_regionCode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
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
  def requestreview(params: ParamsResourceShoppingadsprogramRequestreview, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def requestreview(
    params: ParamsResourceShoppingadsprogramRequestreview,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
