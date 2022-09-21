package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.3", "adexchangebuyer_v1_3.Resource$Budget")
@js.native
open class ResourceBudget protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaBudget] = js.native
  def get(callback: BodyResponseCallback[SchemaBudget]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBudget] = js.native
  def get(params: ParamsResourceBudgetGet): GaxiosPromise[SchemaBudget] = js.native
  def get(params: ParamsResourceBudgetGet, callback: BodyResponseCallback[SchemaBudget]): Unit = js.native
  def get(
    params: ParamsResourceBudgetGet,
    options: BodyResponseCallback[Readable | SchemaBudget],
    callback: BodyResponseCallback[Readable | SchemaBudget]
  ): Unit = js.native
  def get(params: ParamsResourceBudgetGet, options: MethodOptions): GaxiosPromise[SchemaBudget] = js.native
  def get(
    params: ParamsResourceBudgetGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBudget]
  ): Unit = js.native
  /**
    * Returns the budget information for the adgroup specified by the accountId and billingId.
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
    * const adexchangebuyer = google.adexchangebuyer('v1.3');
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
    *   const res = await adexchangebuyer.budget.get({
    *     // The account id to get the budget information for.
    *     accountId: 'placeholder-value',
    *     // The billing id to get the budget information for.
    *     billingId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "billingId": "my_billingId",
    *   //   "budgetAmount": "my_budgetAmount",
    *   //   "currencyCode": "my_currencyCode",
    *   //   "id": "my_id",
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
  def get(params: ParamsResourceBudgetGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBudgetGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaBudget] = js.native
  def patch(callback: BodyResponseCallback[SchemaBudget]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBudget] = js.native
  def patch(params: ParamsResourceBudgetPatch): GaxiosPromise[SchemaBudget] = js.native
  def patch(params: ParamsResourceBudgetPatch, callback: BodyResponseCallback[SchemaBudget]): Unit = js.native
  def patch(
    params: ParamsResourceBudgetPatch,
    options: BodyResponseCallback[Readable | SchemaBudget],
    callback: BodyResponseCallback[Readable | SchemaBudget]
  ): Unit = js.native
  def patch(params: ParamsResourceBudgetPatch, options: MethodOptions): GaxiosPromise[SchemaBudget] = js.native
  def patch(
    params: ParamsResourceBudgetPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBudget]
  ): Unit = js.native
  /**
    * Updates the budget amount for the budget of the adgroup specified by the accountId and billingId, with the budget amount in the request. This method supports patch semantics.
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
    * const adexchangebuyer = google.adexchangebuyer('v1.3');
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
    *   const res = await adexchangebuyer.budget.patch({
    *     // The account id associated with the budget being updated.
    *     accountId: 'placeholder-value',
    *     // The billing id associated with the budget being updated.
    *     billingId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "billingId": "my_billingId",
    *       //   "budgetAmount": "my_budgetAmount",
    *       //   "currencyCode": "my_currencyCode",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "billingId": "my_billingId",
    *   //   "budgetAmount": "my_budgetAmount",
    *   //   "currencyCode": "my_currencyCode",
    *   //   "id": "my_id",
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
  def patch(params: ParamsResourceBudgetPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceBudgetPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaBudget] = js.native
  def update(callback: BodyResponseCallback[SchemaBudget]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBudget] = js.native
  def update(params: ParamsResourceBudgetUpdate): GaxiosPromise[SchemaBudget] = js.native
  def update(params: ParamsResourceBudgetUpdate, callback: BodyResponseCallback[SchemaBudget]): Unit = js.native
  def update(
    params: ParamsResourceBudgetUpdate,
    options: BodyResponseCallback[Readable | SchemaBudget],
    callback: BodyResponseCallback[Readable | SchemaBudget]
  ): Unit = js.native
  def update(params: ParamsResourceBudgetUpdate, options: MethodOptions): GaxiosPromise[SchemaBudget] = js.native
  def update(
    params: ParamsResourceBudgetUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBudget]
  ): Unit = js.native
  /**
    * Updates the budget amount for the budget of the adgroup specified by the accountId and billingId, with the budget amount in the request.
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
    * const adexchangebuyer = google.adexchangebuyer('v1.3');
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
    *   const res = await adexchangebuyer.budget.update({
    *     // The account id associated with the budget being updated.
    *     accountId: 'placeholder-value',
    *     // The billing id associated with the budget being updated.
    *     billingId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "billingId": "my_billingId",
    *       //   "budgetAmount": "my_budgetAmount",
    *       //   "currencyCode": "my_currencyCode",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "billingId": "my_billingId",
    *   //   "budgetAmount": "my_budgetAmount",
    *   //   "currencyCode": "my_currencyCode",
    *   //   "id": "my_id",
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
  def update(params: ParamsResourceBudgetUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceBudgetUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
