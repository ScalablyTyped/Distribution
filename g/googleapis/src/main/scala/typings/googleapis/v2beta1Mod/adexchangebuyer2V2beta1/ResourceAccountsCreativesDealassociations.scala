package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Creatives$Dealassociations")
@js.native
open class ResourceAccountsCreativesDealassociations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def add(): GaxiosPromise[SchemaEmpty] = js.native
  def add(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def add(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def add(params: ParamsResourceAccountsCreativesDealassociationsAdd): GaxiosPromise[SchemaEmpty] = js.native
  def add(
    params: ParamsResourceAccountsCreativesDealassociationsAdd,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def add(
    params: ParamsResourceAccountsCreativesDealassociationsAdd,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def add(params: ParamsResourceAccountsCreativesDealassociationsAdd, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def add(
    params: ParamsResourceAccountsCreativesDealassociationsAdd,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Associate an existing deal with a creative.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.creatives.dealAssociations.add({
    *     // The account the creative belongs to.
    *     accountId: 'placeholder-value',
    *     // The ID of the creative associated with the deal.
    *     creativeId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "association": {}
    *       // }
    *     },
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
  def add(params: ParamsResourceAccountsCreativesDealassociationsAdd, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def add(
    params: ParamsResourceAccountsCreativesDealassociationsAdd,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListDealAssociationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDealAssociationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDealAssociationsResponse] = js.native
  def list(params: ParamsResourceAccountsCreativesDealassociationsList): GaxiosPromise[SchemaListDealAssociationsResponse] = js.native
  def list(
    params: ParamsResourceAccountsCreativesDealassociationsList,
    callback: BodyResponseCallback[SchemaListDealAssociationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsCreativesDealassociationsList,
    options: BodyResponseCallback[Readable | SchemaListDealAssociationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListDealAssociationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsCreativesDealassociationsList, options: MethodOptions): GaxiosPromise[SchemaListDealAssociationsResponse] = js.native
  def list(
    params: ParamsResourceAccountsCreativesDealassociationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDealAssociationsResponse]
  ): Unit = js.native
  /**
    * List all creative-deal associations.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.creatives.dealAssociations.list({
    *     // The account to list the associations from. Specify "-" to list all creatives the current user has access to.
    *     accountId: 'placeholder-value',
    *     // The creative ID to list the associations from. Specify "-" to list all creatives under the above account.
    *     creativeId: 'placeholder-value',
    *     // Requested page size. Server may return fewer associations than requested. If unspecified, server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of ListDealAssociationsResponse.next_page_token returned from the previous call to 'ListDealAssociations' method.
    *     pageToken: 'placeholder-value',
    *     // An optional query string to filter deal associations. If no filter is specified, all associations will be returned. Supported queries are: - accountId=*account_id_string* - creativeId=*creative_id_string* - dealsId=*deals_id_string* - dealsStatus:{approved, conditionally_approved, disapproved, not_checked\} - openAuctionStatus:{approved, conditionally_approved, disapproved, not_checked\} Example: 'dealsId=12345 AND dealsStatus:disapproved'
    *     query: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "associations": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceAccountsCreativesDealassociationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsCreativesDealassociationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def remove(): GaxiosPromise[SchemaEmpty] = js.native
  def remove(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def remove(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def remove(params: ParamsResourceAccountsCreativesDealassociationsRemove): GaxiosPromise[SchemaEmpty] = js.native
  def remove(
    params: ParamsResourceAccountsCreativesDealassociationsRemove,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def remove(
    params: ParamsResourceAccountsCreativesDealassociationsRemove,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def remove(params: ParamsResourceAccountsCreativesDealassociationsRemove, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def remove(
    params: ParamsResourceAccountsCreativesDealassociationsRemove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Remove the association between a deal and a creative.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.creatives.dealAssociations.remove(
    *     {
    *       // The account the creative belongs to.
    *       accountId: 'placeholder-value',
    *       // The ID of the creative associated with the deal.
    *       creativeId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "association": {}
    *         // }
    *       },
    *     }
    *   );
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
  def remove(params: ParamsResourceAccountsCreativesDealassociationsRemove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def remove(
    params: ParamsResourceAccountsCreativesDealassociationsRemove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
