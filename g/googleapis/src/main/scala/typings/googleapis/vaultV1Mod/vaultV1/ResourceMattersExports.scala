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

@JSImport("googleapis/build/src/apis/vault/v1", "vault_v1.Resource$Matters$Exports")
@js.native
open class ResourceMattersExports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaExport] = js.native
  def create(callback: BodyResponseCallback[SchemaExport]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExport] = js.native
  def create(params: ParamsResourceMattersExportsCreate): GaxiosPromise[SchemaExport] = js.native
  def create(params: ParamsResourceMattersExportsCreate, callback: BodyResponseCallback[SchemaExport]): Unit = js.native
  def create(
    params: ParamsResourceMattersExportsCreate,
    options: BodyResponseCallback[Readable | SchemaExport],
    callback: BodyResponseCallback[Readable | SchemaExport]
  ): Unit = js.native
  def create(params: ParamsResourceMattersExportsCreate, options: MethodOptions): GaxiosPromise[SchemaExport] = js.native
  def create(
    params: ParamsResourceMattersExportsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExport]
  ): Unit = js.native
  /**
    * Creates an export.
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
    *   const res = await vault.matters.exports.create({
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cloudStorageSink": {},
    *       //   "createTime": "my_createTime",
    *       //   "exportOptions": {},
    *       //   "id": "my_id",
    *       //   "matterId": "my_matterId",
    *       //   "name": "my_name",
    *       //   "query": {},
    *       //   "requester": {},
    *       //   "stats": {},
    *       //   "status": "my_status"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloudStorageSink": {},
    *   //   "createTime": "my_createTime",
    *   //   "exportOptions": {},
    *   //   "id": "my_id",
    *   //   "matterId": "my_matterId",
    *   //   "name": "my_name",
    *   //   "query": {},
    *   //   "requester": {},
    *   //   "stats": {},
    *   //   "status": "my_status"
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
  def create(params: ParamsResourceMattersExportsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceMattersExportsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMattersExportsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMattersExportsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceMattersExportsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceMattersExportsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceMattersExportsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an export.
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
    *   const res = await vault.matters.exports.delete({
    *     // The export ID.
    *     exportId: 'placeholder-value',
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
  def delete(params: ParamsResourceMattersExportsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceMattersExportsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaExport] = js.native
  def get(callback: BodyResponseCallback[SchemaExport]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExport] = js.native
  def get(params: ParamsResourceMattersExportsGet): GaxiosPromise[SchemaExport] = js.native
  def get(params: ParamsResourceMattersExportsGet, callback: BodyResponseCallback[SchemaExport]): Unit = js.native
  def get(
    params: ParamsResourceMattersExportsGet,
    options: BodyResponseCallback[Readable | SchemaExport],
    callback: BodyResponseCallback[Readable | SchemaExport]
  ): Unit = js.native
  def get(params: ParamsResourceMattersExportsGet, options: MethodOptions): GaxiosPromise[SchemaExport] = js.native
  def get(
    params: ParamsResourceMattersExportsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExport]
  ): Unit = js.native
  /**
    * Gets an export.
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
    *   const res = await vault.matters.exports.get({
    *     // The export ID.
    *     exportId: 'placeholder-value',
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloudStorageSink": {},
    *   //   "createTime": "my_createTime",
    *   //   "exportOptions": {},
    *   //   "id": "my_id",
    *   //   "matterId": "my_matterId",
    *   //   "name": "my_name",
    *   //   "query": {},
    *   //   "requester": {},
    *   //   "stats": {},
    *   //   "status": "my_status"
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
  def get(params: ParamsResourceMattersExportsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceMattersExportsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListExportsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListExportsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListExportsResponse] = js.native
  def list(params: ParamsResourceMattersExportsList): GaxiosPromise[SchemaListExportsResponse] = js.native
  def list(
    params: ParamsResourceMattersExportsList,
    callback: BodyResponseCallback[SchemaListExportsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceMattersExportsList,
    options: BodyResponseCallback[Readable | SchemaListExportsResponse],
    callback: BodyResponseCallback[Readable | SchemaListExportsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMattersExportsList, options: MethodOptions): GaxiosPromise[SchemaListExportsResponse] = js.native
  def list(
    params: ParamsResourceMattersExportsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListExportsResponse]
  ): Unit = js.native
  /**
    * Lists details about the exports in the specified matter.
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
    *   const res = await vault.matters.exports.list({
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *     // The number of exports to return in the response.
    *     pageSize: 'placeholder-value',
    *     // The pagination token as returned in the response.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "exports": [],
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
  def list(params: ParamsResourceMattersExportsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMattersExportsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
