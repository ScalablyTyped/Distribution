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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Accounts$Returncarrier")
@js.native
open class ResourceAccountsReturncarrier protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAccountReturnCarrier] = js.native
  def create(callback: BodyResponseCallback[SchemaAccountReturnCarrier]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountReturnCarrier] = js.native
  def create(params: ParamsResourceAccountsReturncarrierCreate): GaxiosPromise[SchemaAccountReturnCarrier] = js.native
  def create(
    params: ParamsResourceAccountsReturncarrierCreate,
    callback: BodyResponseCallback[SchemaAccountReturnCarrier]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsReturncarrierCreate,
    options: BodyResponseCallback[Readable | SchemaAccountReturnCarrier],
    callback: BodyResponseCallback[Readable | SchemaAccountReturnCarrier]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsReturncarrierCreate, options: MethodOptions): GaxiosPromise[SchemaAccountReturnCarrier] = js.native
  def create(
    params: ParamsResourceAccountsReturncarrierCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountReturnCarrier]
  ): Unit = js.native
  /**
    * Links return carrier to a merchant account.
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
    *   const res = await content.accounts.returncarrier.create({
    *     // Required. The Merchant Center Account Id under which the Return Carrier is to be linked.
    *     accountId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "carrierAccountId": "my_carrierAccountId",
    *       //   "carrierAccountName": "my_carrierAccountName",
    *       //   "carrierAccountNumber": "my_carrierAccountNumber",
    *       //   "carrierCode": "my_carrierCode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "carrierAccountId": "my_carrierAccountId",
    *   //   "carrierAccountName": "my_carrierAccountName",
    *   //   "carrierAccountNumber": "my_carrierAccountNumber",
    *   //   "carrierCode": "my_carrierCode"
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
  def create(params: ParamsResourceAccountsReturncarrierCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsReturncarrierCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsReturncarrierDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsReturncarrierDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsReturncarrierDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsReturncarrierDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsReturncarrierDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Delete a return carrier in the merchant account.
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
    *   const res = await content.accounts.returncarrier.delete({
    *     // Required. The Merchant Center Account Id under which the Return Carrier is to be linked.
    *     accountId: 'placeholder-value',
    *     // Required. The Google-provided unique carrier ID, used to update the resource.
    *     carrierAccountId: 'placeholder-value',
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
  def delete(params: ParamsResourceAccountsReturncarrierDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsReturncarrierDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAccountReturnCarrierResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAccountReturnCarrierResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAccountReturnCarrierResponse] = js.native
  def list(params: ParamsResourceAccountsReturncarrierList): GaxiosPromise[SchemaListAccountReturnCarrierResponse] = js.native
  def list(
    params: ParamsResourceAccountsReturncarrierList,
    callback: BodyResponseCallback[SchemaListAccountReturnCarrierResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsReturncarrierList,
    options: BodyResponseCallback[Readable | SchemaListAccountReturnCarrierResponse],
    callback: BodyResponseCallback[Readable | SchemaListAccountReturnCarrierResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsReturncarrierList, options: MethodOptions): GaxiosPromise[SchemaListAccountReturnCarrierResponse] = js.native
  def list(
    params: ParamsResourceAccountsReturncarrierList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAccountReturnCarrierResponse]
  ): Unit = js.native
  /**
    * Lists available return carriers in the merchant account.
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
    *   const res = await content.accounts.returncarrier.list({
    *     // Required. The Merchant Center Account Id under which the Return Carrier is to be linked.
    *     accountId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountReturnCarriers": []
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
  def list(params: ParamsResourceAccountsReturncarrierList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsReturncarrierList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAccountReturnCarrier] = js.native
  def patch(callback: BodyResponseCallback[SchemaAccountReturnCarrier]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountReturnCarrier] = js.native
  def patch(params: ParamsResourceAccountsReturncarrierPatch): GaxiosPromise[SchemaAccountReturnCarrier] = js.native
  def patch(
    params: ParamsResourceAccountsReturncarrierPatch,
    callback: BodyResponseCallback[SchemaAccountReturnCarrier]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAccountsReturncarrierPatch,
    options: BodyResponseCallback[Readable | SchemaAccountReturnCarrier],
    callback: BodyResponseCallback[Readable | SchemaAccountReturnCarrier]
  ): Unit = js.native
  def patch(params: ParamsResourceAccountsReturncarrierPatch, options: MethodOptions): GaxiosPromise[SchemaAccountReturnCarrier] = js.native
  def patch(
    params: ParamsResourceAccountsReturncarrierPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountReturnCarrier]
  ): Unit = js.native
  /**
    * Updates a return carrier in the merchant account.
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
    *   const res = await content.accounts.returncarrier.patch({
    *     // Required. The Merchant Center Account Id under which the Return Carrier is to be linked.
    *     accountId: 'placeholder-value',
    *     // Required. The Google-provided unique carrier ID, used to update the resource.
    *     carrierAccountId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "carrierAccountId": "my_carrierAccountId",
    *       //   "carrierAccountName": "my_carrierAccountName",
    *       //   "carrierAccountNumber": "my_carrierAccountNumber",
    *       //   "carrierCode": "my_carrierCode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "carrierAccountId": "my_carrierAccountId",
    *   //   "carrierAccountName": "my_carrierAccountName",
    *   //   "carrierAccountNumber": "my_carrierAccountNumber",
    *   //   "carrierCode": "my_carrierCode"
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
  def patch(params: ParamsResourceAccountsReturncarrierPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAccountsReturncarrierPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
