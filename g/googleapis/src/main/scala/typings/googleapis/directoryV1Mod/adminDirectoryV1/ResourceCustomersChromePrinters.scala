package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Customers$Chrome$Printers")
@js.native
open class ResourceCustomersChromePrinters protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchCreatePrinters(): GaxiosPromise[SchemaBatchCreatePrintersResponse] = js.native
  def batchCreatePrinters(callback: BodyResponseCallback[SchemaBatchCreatePrintersResponse]): Unit = js.native
  def batchCreatePrinters(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchCreatePrintersResponse] = js.native
  def batchCreatePrinters(params: ParamsResourceCustomersChromePrintersBatchcreateprinters): GaxiosPromise[SchemaBatchCreatePrintersResponse] = js.native
  def batchCreatePrinters(
    params: ParamsResourceCustomersChromePrintersBatchcreateprinters,
    callback: BodyResponseCallback[SchemaBatchCreatePrintersResponse]
  ): Unit = js.native
  def batchCreatePrinters(
    params: ParamsResourceCustomersChromePrintersBatchcreateprinters,
    options: BodyResponseCallback[Readable | SchemaBatchCreatePrintersResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchCreatePrintersResponse]
  ): Unit = js.native
  def batchCreatePrinters(params: ParamsResourceCustomersChromePrintersBatchcreateprinters, options: MethodOptions): GaxiosPromise[SchemaBatchCreatePrintersResponse] = js.native
  def batchCreatePrinters(
    params: ParamsResourceCustomersChromePrintersBatchcreateprinters,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchCreatePrintersResponse]
  ): Unit = js.native
  /**
    * Creates printers under given Organization Unit.
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
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.chrome.printers'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await admin.customers.chrome.printers.batchCreatePrinters({
    *     // Required. The name of the customer. Format: customers/{customer_id\}
    *     parent: 'customers/my-customer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "failures": [],
    *   //   "printers": []
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
  def batchCreatePrinters(params: ParamsResourceCustomersChromePrintersBatchcreateprinters, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchCreatePrinters(
    params: ParamsResourceCustomersChromePrintersBatchcreateprinters,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchDeletePrinters(): GaxiosPromise[SchemaBatchDeletePrintersResponse] = js.native
  def batchDeletePrinters(callback: BodyResponseCallback[SchemaBatchDeletePrintersResponse]): Unit = js.native
  def batchDeletePrinters(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchDeletePrintersResponse] = js.native
  def batchDeletePrinters(params: ParamsResourceCustomersChromePrintersBatchdeleteprinters): GaxiosPromise[SchemaBatchDeletePrintersResponse] = js.native
  def batchDeletePrinters(
    params: ParamsResourceCustomersChromePrintersBatchdeleteprinters,
    callback: BodyResponseCallback[SchemaBatchDeletePrintersResponse]
  ): Unit = js.native
  def batchDeletePrinters(
    params: ParamsResourceCustomersChromePrintersBatchdeleteprinters,
    options: BodyResponseCallback[Readable | SchemaBatchDeletePrintersResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchDeletePrintersResponse]
  ): Unit = js.native
  def batchDeletePrinters(params: ParamsResourceCustomersChromePrintersBatchdeleteprinters, options: MethodOptions): GaxiosPromise[SchemaBatchDeletePrintersResponse] = js.native
  def batchDeletePrinters(
    params: ParamsResourceCustomersChromePrintersBatchdeleteprinters,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchDeletePrintersResponse]
  ): Unit = js.native
  /**
    * Deletes printers in batch.
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
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.chrome.printers'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await admin.customers.chrome.printers.batchDeletePrinters({
    *     // Required. The name of the customer. Format: customers/{customer_id\}
    *     parent: 'customers/my-customer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "printerIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "failedPrinters": [],
    *   //   "printerIds": []
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
  def batchDeletePrinters(params: ParamsResourceCustomersChromePrintersBatchdeleteprinters, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchDeletePrinters(
    params: ParamsResourceCustomersChromePrintersBatchdeleteprinters,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaPrinter] = js.native
  def create(callback: BodyResponseCallback[SchemaPrinter]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPrinter] = js.native
  def create(params: ParamsResourceCustomersChromePrintersCreate): GaxiosPromise[SchemaPrinter] = js.native
  def create(params: ParamsResourceCustomersChromePrintersCreate, callback: BodyResponseCallback[SchemaPrinter]): Unit = js.native
  def create(
    params: ParamsResourceCustomersChromePrintersCreate,
    options: BodyResponseCallback[Readable | SchemaPrinter],
    callback: BodyResponseCallback[Readable | SchemaPrinter]
  ): Unit = js.native
  def create(params: ParamsResourceCustomersChromePrintersCreate, options: MethodOptions): GaxiosPromise[SchemaPrinter] = js.native
  def create(
    params: ParamsResourceCustomersChromePrintersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPrinter]
  ): Unit = js.native
  /**
    * Creates a printer under given Organization Unit.
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
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.chrome.printers'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await admin.customers.chrome.printers.create({
    *     // Required. The name of the customer. Format: customers/{customer_id\}
    *     parent: 'customers/my-customer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "auxiliaryMessages": [],
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "id": "my_id",
    *       //   "makeAndModel": "my_makeAndModel",
    *       //   "name": "my_name",
    *       //   "orgUnitId": "my_orgUnitId",
    *       //   "uri": "my_uri",
    *       //   "useDriverlessConfig": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auxiliaryMessages": [],
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "id": "my_id",
    *   //   "makeAndModel": "my_makeAndModel",
    *   //   "name": "my_name",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "uri": "my_uri",
    *   //   "useDriverlessConfig": false
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
  def create(params: ParamsResourceCustomersChromePrintersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCustomersChromePrintersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCustomersChromePrintersDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCustomersChromePrintersDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceCustomersChromePrintersDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCustomersChromePrintersDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceCustomersChromePrintersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a `Printer`.
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
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.chrome.printers'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await admin.customers.chrome.printers.delete({
    *     // Required. The name of the printer to be updated. Format: customers/{customer_id\}/chrome/printers/{printer_id\}
    *     name: 'customers/my-customer/chrome/printers/my-printer',
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
  def delete(params: ParamsResourceCustomersChromePrintersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCustomersChromePrintersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPrinter] = js.native
  def get(callback: BodyResponseCallback[SchemaPrinter]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPrinter] = js.native
  def get(params: ParamsResourceCustomersChromePrintersGet): GaxiosPromise[SchemaPrinter] = js.native
  def get(params: ParamsResourceCustomersChromePrintersGet, callback: BodyResponseCallback[SchemaPrinter]): Unit = js.native
  def get(
    params: ParamsResourceCustomersChromePrintersGet,
    options: BodyResponseCallback[Readable | SchemaPrinter],
    callback: BodyResponseCallback[Readable | SchemaPrinter]
  ): Unit = js.native
  def get(params: ParamsResourceCustomersChromePrintersGet, options: MethodOptions): GaxiosPromise[SchemaPrinter] = js.native
  def get(
    params: ParamsResourceCustomersChromePrintersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPrinter]
  ): Unit = js.native
  /**
    * Returns a `Printer` resource (printer's config).
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
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.chrome.printers',
    *       'https://www.googleapis.com/auth/admin.chrome.printers.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await admin.customers.chrome.printers.get({
    *     // Required. The name of the printer to retrieve. Format: customers/{customer_id\}/chrome/printers/{printer_id\}
    *     name: 'customers/my-customer/chrome/printers/my-printer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auxiliaryMessages": [],
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "id": "my_id",
    *   //   "makeAndModel": "my_makeAndModel",
    *   //   "name": "my_name",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "uri": "my_uri",
    *   //   "useDriverlessConfig": false
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
  def get(params: ParamsResourceCustomersChromePrintersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCustomersChromePrintersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListPrintersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPrintersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPrintersResponse] = js.native
  def list(params: ParamsResourceCustomersChromePrintersList): GaxiosPromise[SchemaListPrintersResponse] = js.native
  def list(
    params: ParamsResourceCustomersChromePrintersList,
    callback: BodyResponseCallback[SchemaListPrintersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomersChromePrintersList,
    options: BodyResponseCallback[Readable | SchemaListPrintersResponse],
    callback: BodyResponseCallback[Readable | SchemaListPrintersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomersChromePrintersList, options: MethodOptions): GaxiosPromise[SchemaListPrintersResponse] = js.native
  def list(
    params: ParamsResourceCustomersChromePrintersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPrintersResponse]
  ): Unit = js.native
  /**
    * List printers configs.
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
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.chrome.printers',
    *       'https://www.googleapis.com/auth/admin.chrome.printers.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await admin.customers.chrome.printers.list({
    *     // Search query. Search syntax is shared between this api and Admin Console printers pages.
    *     filter: 'placeholder-value',
    *     // The order to sort results by. Must be one of display_name, description, make_and_model, or create_time. Default order is ascending, but descending order can be returned by appending "desc" to the order_by field. For instance, "description desc" will return the printers sorted by description in descending order.
    *     orderBy: 'placeholder-value',
    *     // Organization Unit that we want to list the printers for. When org_unit is not present in the request then all printers of the customer are returned (or filtered). When org_unit is present in the request then only printers available to this OU will be returned (owned or inherited). You may see if printer is owned or inherited for this OU by looking at Printer.org_unit_id.
    *     orgUnitId: 'placeholder-value',
    *     // The maximum number of objects to return. The service may return fewer than this value.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous call.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the customer who owns this collection of printers. Format: customers/{customer_id\}
    *     parent: 'customers/my-customer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "printers": []
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
  def list(params: ParamsResourceCustomersChromePrintersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustomersChromePrintersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listPrinterModels(): GaxiosPromise[SchemaListPrinterModelsResponse] = js.native
  def listPrinterModels(callback: BodyResponseCallback[SchemaListPrinterModelsResponse]): Unit = js.native
  def listPrinterModels(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPrinterModelsResponse] = js.native
  def listPrinterModels(params: ParamsResourceCustomersChromePrintersListprintermodels): GaxiosPromise[SchemaListPrinterModelsResponse] = js.native
  def listPrinterModels(
    params: ParamsResourceCustomersChromePrintersListprintermodels,
    callback: BodyResponseCallback[SchemaListPrinterModelsResponse]
  ): Unit = js.native
  def listPrinterModels(
    params: ParamsResourceCustomersChromePrintersListprintermodels,
    options: BodyResponseCallback[Readable | SchemaListPrinterModelsResponse],
    callback: BodyResponseCallback[Readable | SchemaListPrinterModelsResponse]
  ): Unit = js.native
  def listPrinterModels(params: ParamsResourceCustomersChromePrintersListprintermodels, options: MethodOptions): GaxiosPromise[SchemaListPrinterModelsResponse] = js.native
  def listPrinterModels(
    params: ParamsResourceCustomersChromePrintersListprintermodels,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPrinterModelsResponse]
  ): Unit = js.native
  /**
    * Lists the supported printer models.
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
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.chrome.printers',
    *       'https://www.googleapis.com/auth/admin.chrome.printers.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await admin.customers.chrome.printers.listPrinterModels({
    *     // Filer to list only models by a given manufacturer in format: "manufacturer:Brother". Search syntax is shared between this api and Admin Console printers pages.
    *     filter: 'placeholder-value',
    *     // The maximum number of objects to return. The service may return fewer than this value.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous call.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the customer who owns this collection of printers. Format: customers/{customer_id\}
    *     parent: 'customers/my-customer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "printerModels": []
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
  def listPrinterModels(params: ParamsResourceCustomersChromePrintersListprintermodels, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listPrinterModels(
    params: ParamsResourceCustomersChromePrintersListprintermodels,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaPrinter] = js.native
  def patch(callback: BodyResponseCallback[SchemaPrinter]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPrinter] = js.native
  def patch(params: ParamsResourceCustomersChromePrintersPatch): GaxiosPromise[SchemaPrinter] = js.native
  def patch(params: ParamsResourceCustomersChromePrintersPatch, callback: BodyResponseCallback[SchemaPrinter]): Unit = js.native
  def patch(
    params: ParamsResourceCustomersChromePrintersPatch,
    options: BodyResponseCallback[Readable | SchemaPrinter],
    callback: BodyResponseCallback[Readable | SchemaPrinter]
  ): Unit = js.native
  def patch(params: ParamsResourceCustomersChromePrintersPatch, options: MethodOptions): GaxiosPromise[SchemaPrinter] = js.native
  def patch(
    params: ParamsResourceCustomersChromePrintersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPrinter]
  ): Unit = js.native
  /**
    * Updates a `Printer` resource.
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
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.chrome.printers'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await admin.customers.chrome.printers.patch({
    *     // The list of fields to be cleared. Note, some of the fields are read only and cannot be updated. Values for not specified fields will be patched.
    *     clearMask: 'placeholder-value',
    *     // The resource name of the Printer object, in the format customers/{customer-id\}/printers/{printer-id\} (During printer creation leave empty)
    *     name: 'customers/my-customer/chrome/printers/my-printer',
    *     // The list of fields to be updated. Note, some of the fields are read only and cannot be updated. Values for not specified fields will be patched.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "auxiliaryMessages": [],
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "id": "my_id",
    *       //   "makeAndModel": "my_makeAndModel",
    *       //   "name": "my_name",
    *       //   "orgUnitId": "my_orgUnitId",
    *       //   "uri": "my_uri",
    *       //   "useDriverlessConfig": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auxiliaryMessages": [],
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "id": "my_id",
    *   //   "makeAndModel": "my_makeAndModel",
    *   //   "name": "my_name",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "uri": "my_uri",
    *   //   "useDriverlessConfig": false
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
  def patch(params: ParamsResourceCustomersChromePrintersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCustomersChromePrintersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
