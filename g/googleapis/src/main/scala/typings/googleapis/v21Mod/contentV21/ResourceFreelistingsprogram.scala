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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Freelistingsprogram")
@js.native
open class ResourceFreelistingsprogram protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaFreeListingsProgramStatus] = js.native
  def get(callback: BodyResponseCallback[SchemaFreeListingsProgramStatus]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFreeListingsProgramStatus] = js.native
  def get(params: ParamsResourceFreelistingsprogramGet): GaxiosPromise[SchemaFreeListingsProgramStatus] = js.native
  def get(
    params: ParamsResourceFreelistingsprogramGet,
    callback: BodyResponseCallback[SchemaFreeListingsProgramStatus]
  ): Unit = js.native
  def get(
    params: ParamsResourceFreelistingsprogramGet,
    options: BodyResponseCallback[Readable | SchemaFreeListingsProgramStatus],
    callback: BodyResponseCallback[Readable | SchemaFreeListingsProgramStatus]
  ): Unit = js.native
  def get(params: ParamsResourceFreelistingsprogramGet, options: MethodOptions): GaxiosPromise[SchemaFreeListingsProgramStatus] = js.native
  def get(
    params: ParamsResourceFreelistingsprogramGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFreeListingsProgramStatus]
  ): Unit = js.native
  /**
    * Retrieves the status and review eligibility for the free listing program.
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
    *   const res = await content.freelistingsprogram.get({
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
  def get(params: ParamsResourceFreelistingsprogramGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceFreelistingsprogramGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def requestreview(): GaxiosPromise[Unit] = js.native
  def requestreview(callback: BodyResponseCallback[Unit]): Unit = js.native
  def requestreview(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def requestreview(params: ParamsResourceFreelistingsprogramRequestreview): GaxiosPromise[Unit] = js.native
  def requestreview(params: ParamsResourceFreelistingsprogramRequestreview, callback: BodyResponseCallback[Unit]): Unit = js.native
  def requestreview(
    params: ParamsResourceFreelistingsprogramRequestreview,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def requestreview(params: ParamsResourceFreelistingsprogramRequestreview, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def requestreview(
    params: ParamsResourceFreelistingsprogramRequestreview,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Requests a review of free listings in a specific region. This method is only available to selected merchants.
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
    *   const res = await content.freelistingsprogram.requestreview({
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
  def requestreview(params: ParamsResourceFreelistingsprogramRequestreview, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def requestreview(
    params: ParamsResourceFreelistingsprogramRequestreview,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
