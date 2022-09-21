package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Orders")
@js.native
open class ResourceOrders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaOrder] = js.native
  def get(callback: BodyResponseCallback[SchemaOrder]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrder] = js.native
  def get(params: ParamsResourceOrdersGet): GaxiosPromise[SchemaOrder] = js.native
  def get(params: ParamsResourceOrdersGet, callback: BodyResponseCallback[SchemaOrder]): Unit = js.native
  def get(
    params: ParamsResourceOrdersGet,
    options: BodyResponseCallback[Readable | SchemaOrder],
    callback: BodyResponseCallback[Readable | SchemaOrder]
  ): Unit = js.native
  def get(params: ParamsResourceOrdersGet, options: MethodOptions): GaxiosPromise[SchemaOrder] = js.native
  def get(
    params: ParamsResourceOrdersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrder]
  ): Unit = js.native
  /**
    * Gets one order by ID.
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
    * const dfareporting = google.dfareporting('v3.3');
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
    *   const res = await dfareporting.orders.get({
    *     // Order ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Project ID for orders.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "approverUserProfileIds": [],
    *   //   "buyerInvoiceId": "my_buyerInvoiceId",
    *   //   "buyerOrganizationName": "my_buyerOrganizationName",
    *   //   "comments": "my_comments",
    *   //   "contacts": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lastModifiedInfo": {},
    *   //   "name": "my_name",
    *   //   "notes": "my_notes",
    *   //   "planningTermId": "my_planningTermId",
    *   //   "projectId": "my_projectId",
    *   //   "sellerOrderId": "my_sellerOrderId",
    *   //   "sellerOrganizationName": "my_sellerOrganizationName",
    *   //   "siteId": [],
    *   //   "siteNames": [],
    *   //   "subaccountId": "my_subaccountId",
    *   //   "termsAndConditions": "my_termsAndConditions"
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
  def get(params: ParamsResourceOrdersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOrdersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaOrdersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaOrdersListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrdersListResponse] = js.native
  def list(params: ParamsResourceOrdersList): GaxiosPromise[SchemaOrdersListResponse] = js.native
  def list(params: ParamsResourceOrdersList, callback: BodyResponseCallback[SchemaOrdersListResponse]): Unit = js.native
  def list(
    params: ParamsResourceOrdersList,
    options: BodyResponseCallback[Readable | SchemaOrdersListResponse],
    callback: BodyResponseCallback[Readable | SchemaOrdersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrdersList, options: MethodOptions): GaxiosPromise[SchemaOrdersListResponse] = js.native
  def list(
    params: ParamsResourceOrdersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of orders, possibly filtered. This method supports paging.
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
    * const dfareporting = google.dfareporting('v3.3');
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
    *   const res = await dfareporting.orders.list({
    *     // Select only orders with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Project ID for orders.
    *     projectId: 'placeholder-value',
    *     // Allows searching for orders by name or ID. Wildcards (*) are allowed. For example, "order*2015" will return orders with names like "order June 2015", "order April 2015", or simply "order 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "order" will match orders with name "my order", "order 2015", or simply "order".
    *     searchString: 'placeholder-value',
    *     // Select only orders that are associated with these site IDs.
    *     siteId: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "orders": []
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
  def list(params: ParamsResourceOrdersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrdersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
