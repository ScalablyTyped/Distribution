package typings.googleapis.vaultV1Mod.vaultV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vault/v1", "vault_v1.Resource$Matters$Holds$Accounts")
@js.native
open class ResourceMattersHoldsAccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaHeldAccount] = js.native
  def create(callback: BodyResponseCallback[SchemaHeldAccount]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHeldAccount] = js.native
  def create(params: ParamsResourceMattersHoldsAccountsCreate): GaxiosPromise[SchemaHeldAccount] = js.native
  def create(
    params: ParamsResourceMattersHoldsAccountsCreate,
    callback: BodyResponseCallback[SchemaHeldAccount]
  ): Unit = js.native
  def create(
    params: ParamsResourceMattersHoldsAccountsCreate,
    options: BodyResponseCallback[Readable | SchemaHeldAccount],
    callback: BodyResponseCallback[Readable | SchemaHeldAccount]
  ): Unit = js.native
  def create(params: ParamsResourceMattersHoldsAccountsCreate, options: MethodOptions): GaxiosPromise[SchemaHeldAccount] = js.native
  def create(
    params: ParamsResourceMattersHoldsAccountsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHeldAccount]
  ): Unit = js.native
  /**
    * Adds an account to a hold. Accounts can be added only to a hold that does not have an organizational unit set. If you try to add an account to an organizational unit-based hold, an error is returned.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vault.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vault = google.vault('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/ediscovery'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await vault.matters.holds.accounts.create({
    *     // The hold ID.
    *     holdId: 'placeholder-value',
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "email": "my_email",
    *       //   "firstName": "my_firstName",
    *       //   "holdTime": "my_holdTime",
    *       //   "lastName": "my_lastName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "email": "my_email",
    *   //   "firstName": "my_firstName",
    *   //   "holdTime": "my_holdTime",
    *   //   "lastName": "my_lastName"
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
  def create(params: ParamsResourceMattersHoldsAccountsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceMattersHoldsAccountsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMattersHoldsAccountsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMattersHoldsAccountsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceMattersHoldsAccountsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceMattersHoldsAccountsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceMattersHoldsAccountsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Removes an account from a hold.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vault.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vault = google.vault('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/ediscovery'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await vault.matters.holds.accounts.delete({
    *     // The ID of the account to remove from the hold.
    *     accountId: 'placeholder-value',
    *     // The hold ID.
    *     holdId: 'placeholder-value',
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceMattersHoldsAccountsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceMattersHoldsAccountsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListHeldAccountsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListHeldAccountsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListHeldAccountsResponse] = js.native
  def list(params: ParamsResourceMattersHoldsAccountsList): GaxiosPromise[SchemaListHeldAccountsResponse] = js.native
  def list(
    params: ParamsResourceMattersHoldsAccountsList,
    callback: BodyResponseCallback[SchemaListHeldAccountsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceMattersHoldsAccountsList,
    options: BodyResponseCallback[Readable | SchemaListHeldAccountsResponse],
    callback: BodyResponseCallback[Readable | SchemaListHeldAccountsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMattersHoldsAccountsList, options: MethodOptions): GaxiosPromise[SchemaListHeldAccountsResponse] = js.native
  def list(
    params: ParamsResourceMattersHoldsAccountsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListHeldAccountsResponse]
  ): Unit = js.native
  /**
    * Lists the accounts covered by a hold. This can list only individually-specified accounts covered by the hold. If the hold covers an organizational unit, use the [Admin SDK](https://developers.google.com/admin-sdk/). to list the members of the organizational unit on hold.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vault.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vault = google.vault('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/ediscovery',
    *       'https://www.googleapis.com/auth/ediscovery.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await vault.matters.holds.accounts.list({
    *     // The hold ID.
    *     holdId: 'placeholder-value',
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accounts": []
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
  def list(params: ParamsResourceMattersHoldsAccountsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMattersHoldsAccountsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
