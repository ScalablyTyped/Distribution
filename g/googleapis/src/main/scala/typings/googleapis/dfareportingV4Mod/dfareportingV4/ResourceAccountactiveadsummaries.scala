package typings.googleapis.dfareportingV4Mod.dfareportingV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v4", "dfareporting_v4.Resource$Accountactiveadsummaries")
@js.native
open class ResourceAccountactiveadsummaries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaAccountActiveAdSummary] = js.native
  def get(callback: BodyResponseCallback[SchemaAccountActiveAdSummary]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountActiveAdSummary] = js.native
  def get(params: ParamsResourceAccountactiveadsummariesGet): GaxiosPromise[SchemaAccountActiveAdSummary] = js.native
  def get(
    params: ParamsResourceAccountactiveadsummariesGet,
    callback: BodyResponseCallback[SchemaAccountActiveAdSummary]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountactiveadsummariesGet,
    options: BodyResponseCallback[Readable | SchemaAccountActiveAdSummary],
    callback: BodyResponseCallback[Readable | SchemaAccountActiveAdSummary]
  ): Unit = js.native
  def get(params: ParamsResourceAccountactiveadsummariesGet, options: MethodOptions): GaxiosPromise[SchemaAccountActiveAdSummary] = js.native
  def get(
    params: ParamsResourceAccountactiveadsummariesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountActiveAdSummary]
  ): Unit = js.native
  /**
    * Gets the account's active ad summary by account ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.accountActiveAdSummaries.get({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Account ID.
    *     summaryAccountId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "activeAds": "my_activeAds",
    *   //   "activeAdsLimitTier": "my_activeAdsLimitTier",
    *   //   "availableAds": "my_availableAds",
    *   //   "kind": "my_kind"
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
  def get(params: ParamsResourceAccountactiveadsummariesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountactiveadsummariesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
