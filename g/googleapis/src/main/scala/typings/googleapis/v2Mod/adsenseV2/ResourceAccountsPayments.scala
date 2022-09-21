package typings.googleapis.v2Mod.adsenseV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v2", "adsense_v2.Resource$Accounts$Payments")
@js.native
open class ResourceAccountsPayments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListPaymentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPaymentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPaymentsResponse] = js.native
  def list(params: ParamsResourceAccountsPaymentsList): GaxiosPromise[SchemaListPaymentsResponse] = js.native
  def list(
    params: ParamsResourceAccountsPaymentsList,
    callback: BodyResponseCallback[SchemaListPaymentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsPaymentsList,
    options: BodyResponseCallback[Readable | SchemaListPaymentsResponse],
    callback: BodyResponseCallback[Readable | SchemaListPaymentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsPaymentsList, options: MethodOptions): GaxiosPromise[SchemaListPaymentsResponse] = js.native
  def list(
    params: ParamsResourceAccountsPaymentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPaymentsResponse]
  ): Unit = js.native
  /**
    * Lists all the payments available for an account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsense.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsense = google.adsense('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/adsense',
    *       'https://www.googleapis.com/auth/adsense.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsense.accounts.payments.list({
    *     // Required. The account which owns the collection of payments. Format: accounts/{account\}
    *     parent: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "payments": []
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
  def list(params: ParamsResourceAccountsPaymentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsPaymentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
