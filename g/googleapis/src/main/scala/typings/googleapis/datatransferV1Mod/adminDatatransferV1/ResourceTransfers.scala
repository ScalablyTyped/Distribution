package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/datatransfer_v1", "admin_datatransfer_v1.Resource$Transfers")
@js.native
open class ResourceTransfers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaDataTransfer] = js.native
  def get(callback: BodyResponseCallback[SchemaDataTransfer]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataTransfer] = js.native
  def get(params: ParamsResourceTransfersGet): GaxiosPromise[SchemaDataTransfer] = js.native
  def get(params: ParamsResourceTransfersGet, callback: BodyResponseCallback[SchemaDataTransfer]): Unit = js.native
  def get(
    params: ParamsResourceTransfersGet,
    options: BodyResponseCallback[Readable | SchemaDataTransfer],
    callback: BodyResponseCallback[Readable | SchemaDataTransfer]
  ): Unit = js.native
  def get(params: ParamsResourceTransfersGet, options: MethodOptions): GaxiosPromise[SchemaDataTransfer] = js.native
  def get(
    params: ParamsResourceTransfersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataTransfer]
  ): Unit = js.native
  /**
    * Retrieves a data transfer request by its resource ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('datatransfer_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.datatransfer',
    *       'https://www.googleapis.com/auth/admin.datatransfer.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await datatransfer.transfers.get({
    *     // ID of the resource to be retrieved. This is returned in the response from the insert method.
    *     dataTransferId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "applicationDataTransfers": [],
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "newOwnerUserId": "my_newOwnerUserId",
    *   //   "oldOwnerUserId": "my_oldOwnerUserId",
    *   //   "overallTransferStatusCode": "my_overallTransferStatusCode",
    *   //   "requestTime": "my_requestTime"
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
  def get(params: ParamsResourceTransfersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceTransfersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaDataTransfer] = js.native
  def insert(callback: BodyResponseCallback[SchemaDataTransfer]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataTransfer] = js.native
  def insert(params: ParamsResourceTransfersInsert): GaxiosPromise[SchemaDataTransfer] = js.native
  def insert(params: ParamsResourceTransfersInsert, callback: BodyResponseCallback[SchemaDataTransfer]): Unit = js.native
  def insert(
    params: ParamsResourceTransfersInsert,
    options: BodyResponseCallback[Readable | SchemaDataTransfer],
    callback: BodyResponseCallback[Readable | SchemaDataTransfer]
  ): Unit = js.native
  def insert(params: ParamsResourceTransfersInsert, options: MethodOptions): GaxiosPromise[SchemaDataTransfer] = js.native
  def insert(
    params: ParamsResourceTransfersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataTransfer]
  ): Unit = js.native
  /**
    * Inserts a data transfer request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('datatransfer_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.datatransfer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await datatransfer.transfers.insert({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "applicationDataTransfers": [],
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "newOwnerUserId": "my_newOwnerUserId",
    *       //   "oldOwnerUserId": "my_oldOwnerUserId",
    *       //   "overallTransferStatusCode": "my_overallTransferStatusCode",
    *       //   "requestTime": "my_requestTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "applicationDataTransfers": [],
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "newOwnerUserId": "my_newOwnerUserId",
    *   //   "oldOwnerUserId": "my_oldOwnerUserId",
    *   //   "overallTransferStatusCode": "my_overallTransferStatusCode",
    *   //   "requestTime": "my_requestTime"
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
  def insert(params: ParamsResourceTransfersInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceTransfersInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaDataTransfersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDataTransfersListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataTransfersListResponse] = js.native
  def list(params: ParamsResourceTransfersList): GaxiosPromise[SchemaDataTransfersListResponse] = js.native
  def list(
    params: ParamsResourceTransfersList,
    callback: BodyResponseCallback[SchemaDataTransfersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceTransfersList,
    options: BodyResponseCallback[Readable | SchemaDataTransfersListResponse],
    callback: BodyResponseCallback[Readable | SchemaDataTransfersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTransfersList, options: MethodOptions): GaxiosPromise[SchemaDataTransfersListResponse] = js.native
  def list(
    params: ParamsResourceTransfersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataTransfersListResponse]
  ): Unit = js.native
  /**
    * Lists the transfers for a customer by source user, destination user, or status.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('datatransfer_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.datatransfer',
    *       'https://www.googleapis.com/auth/admin.datatransfer.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await datatransfer.transfers.list({
    *     // Immutable ID of the Google Workspace account.
    *     customerId: 'placeholder-value',
    *     // Maximum number of results to return. Default is 100.
    *     maxResults: 'placeholder-value',
    *     // Destination user's profile ID.
    *     newOwnerUserId: 'placeholder-value',
    *     // Source user's profile ID.
    *     oldOwnerUserId: 'placeholder-value',
    *     // Token to specify the next page in the list.
    *     pageToken: 'placeholder-value',
    *     // Status of the transfer.
    *     status: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataTransfers": [],
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourceTransfersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceTransfersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
