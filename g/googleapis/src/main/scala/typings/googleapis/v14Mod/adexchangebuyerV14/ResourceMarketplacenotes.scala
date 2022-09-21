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

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Marketplacenotes")
@js.native
open class ResourceMarketplacenotes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def insert(): GaxiosPromise[SchemaAddOrderNotesResponse] = js.native
  def insert(callback: BodyResponseCallback[SchemaAddOrderNotesResponse]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAddOrderNotesResponse] = js.native
  def insert(params: ParamsResourceMarketplacenotesInsert): GaxiosPromise[SchemaAddOrderNotesResponse] = js.native
  def insert(
    params: ParamsResourceMarketplacenotesInsert,
    callback: BodyResponseCallback[SchemaAddOrderNotesResponse]
  ): Unit = js.native
  def insert(
    params: ParamsResourceMarketplacenotesInsert,
    options: BodyResponseCallback[Readable | SchemaAddOrderNotesResponse],
    callback: BodyResponseCallback[Readable | SchemaAddOrderNotesResponse]
  ): Unit = js.native
  def insert(params: ParamsResourceMarketplacenotesInsert, options: MethodOptions): GaxiosPromise[SchemaAddOrderNotesResponse] = js.native
  def insert(
    params: ParamsResourceMarketplacenotesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAddOrderNotesResponse]
  ): Unit = js.native
  /**
    * Add notes to the proposal
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
    *   const res = await adexchangebuyer.marketplacenotes.insert({
    *     // The proposalId to add notes for.
    *     proposalId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "notes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "notes": []
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
  def insert(params: ParamsResourceMarketplacenotesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceMarketplacenotesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGetOrderNotesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGetOrderNotesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetOrderNotesResponse] = js.native
  def list(params: ParamsResourceMarketplacenotesList): GaxiosPromise[SchemaGetOrderNotesResponse] = js.native
  def list(
    params: ParamsResourceMarketplacenotesList,
    callback: BodyResponseCallback[SchemaGetOrderNotesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceMarketplacenotesList,
    options: BodyResponseCallback[Readable | SchemaGetOrderNotesResponse],
    callback: BodyResponseCallback[Readable | SchemaGetOrderNotesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMarketplacenotesList, options: MethodOptions): GaxiosPromise[SchemaGetOrderNotesResponse] = js.native
  def list(
    params: ParamsResourceMarketplacenotesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetOrderNotesResponse]
  ): Unit = js.native
  /**
    * Get all the notes associated with a proposal
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
    *   const res = await adexchangebuyer.marketplacenotes.list({
    *     // Query string to retrieve specific notes. To search the text contents of notes, please use syntax like "WHERE note.note = "foo" or "WHERE note.note LIKE "%bar%"
    *     pqlQuery: 'placeholder-value',
    *     // The proposalId to get notes for. To search across all proposals specify order_id = '-' as part of the URL.
    *     proposalId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "notes": []
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
  def list(params: ParamsResourceMarketplacenotesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMarketplacenotesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
