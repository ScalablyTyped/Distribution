package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Billinginfo")
@js.native
open class ResourceBillinginfo protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaBillingInfo] = js.native
  def get(callback: BodyResponseCallback[SchemaBillingInfo]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBillingInfo] = js.native
  def get(params: ParamsResourceBillinginfoGet): GaxiosPromise[SchemaBillingInfo] = js.native
  def get(params: ParamsResourceBillinginfoGet, callback: BodyResponseCallback[SchemaBillingInfo]): Unit = js.native
  def get(
    params: ParamsResourceBillinginfoGet,
    options: BodyResponseCallback[Readable | SchemaBillingInfo],
    callback: BodyResponseCallback[Readable | SchemaBillingInfo]
  ): Unit = js.native
  def get(params: ParamsResourceBillinginfoGet, options: MethodOptions): GaxiosPromise[SchemaBillingInfo] = js.native
  def get(
    params: ParamsResourceBillinginfoGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBillingInfo]
  ): Unit = js.native
  /**
    * Returns the billing information for one account specified by account ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.billingInfo.get({
    *     // The account id.
    *     accountId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": 0,
    *   //   "accountName": "my_accountName",
    *   //   "billingId": [],
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
  def get(params: ParamsResourceBillinginfoGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBillinginfoGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaBillingInfoList] = js.native
  def list(callback: BodyResponseCallback[SchemaBillingInfoList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBillingInfoList] = js.native
  def list(params: ParamsResourceBillinginfoList): GaxiosPromise[SchemaBillingInfoList] = js.native
  def list(params: ParamsResourceBillinginfoList, callback: BodyResponseCallback[SchemaBillingInfoList]): Unit = js.native
  def list(
    params: ParamsResourceBillinginfoList,
    options: BodyResponseCallback[Readable | SchemaBillingInfoList],
    callback: BodyResponseCallback[Readable | SchemaBillingInfoList]
  ): Unit = js.native
  def list(params: ParamsResourceBillinginfoList, options: MethodOptions): GaxiosPromise[SchemaBillingInfoList] = js.native
  def list(
    params: ParamsResourceBillinginfoList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBillingInfoList]
  ): Unit = js.native
  /**
    * Retrieves a list of billing information for all accounts of the authenticated user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.billingInfo.list({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
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
  def list(params: ParamsResourceBillinginfoList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBillinginfoList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
