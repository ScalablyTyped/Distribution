package typings.googleapis.v34Mod.dfareportingV34

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.4", "dfareporting_v3_4.Resource$Orderdocuments")
@js.native
open class ResourceOrderdocuments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaOrderDocument] = js.native
  def get(callback: BodyResponseCallback[SchemaOrderDocument]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderDocument] = js.native
  def get(params: ParamsResourceOrderdocumentsGet): GaxiosPromise[SchemaOrderDocument] = js.native
  def get(params: ParamsResourceOrderdocumentsGet, callback: BodyResponseCallback[SchemaOrderDocument]): Unit = js.native
  def get(
    params: ParamsResourceOrderdocumentsGet,
    options: BodyResponseCallback[Readable | SchemaOrderDocument],
    callback: BodyResponseCallback[Readable | SchemaOrderDocument]
  ): Unit = js.native
  def get(params: ParamsResourceOrderdocumentsGet, options: MethodOptions): GaxiosPromise[SchemaOrderDocument] = js.native
  def get(
    params: ParamsResourceOrderdocumentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderDocument]
  ): Unit = js.native
  /**
    * Gets one order document by ID.
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
    * const dfareporting = google.dfareporting('v3.4');
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
    *   const res = await dfareporting.orderDocuments.get({
    *     // Order document ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Project ID for order documents.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "amendedOrderDocumentId": "my_amendedOrderDocumentId",
    *   //   "approvedByUserProfileIds": [],
    *   //   "cancelled": false,
    *   //   "createdInfo": {},
    *   //   "effectiveDate": "my_effectiveDate",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lastSentRecipients": [],
    *   //   "lastSentTime": "my_lastSentTime",
    *   //   "orderId": "my_orderId",
    *   //   "projectId": "my_projectId",
    *   //   "signed": false,
    *   //   "subaccountId": "my_subaccountId",
    *   //   "title": "my_title",
    *   //   "type": "my_type"
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
  def get(params: ParamsResourceOrderdocumentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOrderdocumentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaOrderDocumentsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaOrderDocumentsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderDocumentsListResponse] = js.native
  def list(params: ParamsResourceOrderdocumentsList): GaxiosPromise[SchemaOrderDocumentsListResponse] = js.native
  def list(
    params: ParamsResourceOrderdocumentsList,
    callback: BodyResponseCallback[SchemaOrderDocumentsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrderdocumentsList,
    options: BodyResponseCallback[Readable | SchemaOrderDocumentsListResponse],
    callback: BodyResponseCallback[Readable | SchemaOrderDocumentsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrderdocumentsList, options: MethodOptions): GaxiosPromise[SchemaOrderDocumentsListResponse] = js.native
  def list(
    params: ParamsResourceOrderdocumentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderDocumentsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of order documents, possibly filtered. This method supports paging.
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
    * const dfareporting = google.dfareporting('v3.4');
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
    *   const res = await dfareporting.orderDocuments.list({
    *     // Select only order documents that have been approved by at least one user.
    *     approved: 'placeholder-value',
    *     // Select only order documents with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Select only order documents for specified orders.
    *     orderId: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Project ID for order documents.
    *     projectId: 'placeholder-value',
    *     // Allows searching for order documents by name or ID. Wildcards (*) are allowed. For example, "orderdocument*2015" will return order documents with names like "orderdocument June 2015", "orderdocument April 2015", or simply "orderdocument 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "orderdocument" will match order documents with name "my orderdocument", "orderdocument 2015", or simply "orderdocument".
    *     searchString: 'placeholder-value',
    *     // Select only order documents that are associated with these sites.
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
    *   //   "orderDocuments": []
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
  def list(params: ParamsResourceOrderdocumentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrderdocumentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
