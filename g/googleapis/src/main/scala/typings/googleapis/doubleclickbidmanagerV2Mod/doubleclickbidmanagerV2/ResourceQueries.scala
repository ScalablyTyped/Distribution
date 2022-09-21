package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/doubleclickbidmanager/v2", "doubleclickbidmanager_v2.Resource$Queries")
@js.native
open class ResourceQueries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaQuery] = js.native
  def create(callback: BodyResponseCallback[SchemaQuery]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaQuery] = js.native
  def create(params: ParamsResourceQueriesCreate): GaxiosPromise[SchemaQuery] = js.native
  def create(params: ParamsResourceQueriesCreate, callback: BodyResponseCallback[SchemaQuery]): Unit = js.native
  def create(
    params: ParamsResourceQueriesCreate,
    options: BodyResponseCallback[Readable | SchemaQuery],
    callback: BodyResponseCallback[Readable | SchemaQuery]
  ): Unit = js.native
  def create(params: ParamsResourceQueriesCreate, options: MethodOptions): GaxiosPromise[SchemaQuery] = js.native
  def create(
    params: ParamsResourceQueriesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQuery]
  ): Unit = js.native
  /**
    * Creates a query.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclickbidmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclickbidmanager = google.doubleclickbidmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclickbidmanager'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclickbidmanager.queries.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "metadata": {},
    *       //   "params": {},
    *       //   "queryId": "my_queryId",
    *       //   "schedule": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "metadata": {},
    *   //   "params": {},
    *   //   "queryId": "my_queryId",
    *   //   "schedule": {}
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
  def create(params: ParamsResourceQueriesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceQueriesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceQueriesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceQueriesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceQueriesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceQueriesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceQueriesDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a query as well as the associated reports.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclickbidmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclickbidmanager = google.doubleclickbidmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclickbidmanager'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclickbidmanager.queries.delete({
    *     // Required. ID of query to delete.
    *     queryId: 'placeholder-value',
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
  def delete(params: ParamsResourceQueriesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceQueriesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaQuery] = js.native
  def get(callback: BodyResponseCallback[SchemaQuery]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaQuery] = js.native
  def get(params: ParamsResourceQueriesGet): GaxiosPromise[SchemaQuery] = js.native
  def get(params: ParamsResourceQueriesGet, callback: BodyResponseCallback[SchemaQuery]): Unit = js.native
  def get(
    params: ParamsResourceQueriesGet,
    options: BodyResponseCallback[Readable | SchemaQuery],
    callback: BodyResponseCallback[Readable | SchemaQuery]
  ): Unit = js.native
  def get(params: ParamsResourceQueriesGet, options: MethodOptions): GaxiosPromise[SchemaQuery] = js.native
  def get(
    params: ParamsResourceQueriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQuery]
  ): Unit = js.native
  /**
    * Retrieves a query.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclickbidmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclickbidmanager = google.doubleclickbidmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclickbidmanager'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclickbidmanager.queries.get({
    *     // Required. ID of query to retrieve.
    *     queryId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "metadata": {},
    *   //   "params": {},
    *   //   "queryId": "my_queryId",
    *   //   "schedule": {}
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
  def get(params: ParamsResourceQueriesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceQueriesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListQueriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListQueriesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListQueriesResponse] = js.native
  def list(params: ParamsResourceQueriesList): GaxiosPromise[SchemaListQueriesResponse] = js.native
  def list(params: ParamsResourceQueriesList, callback: BodyResponseCallback[SchemaListQueriesResponse]): Unit = js.native
  def list(
    params: ParamsResourceQueriesList,
    options: BodyResponseCallback[Readable | SchemaListQueriesResponse],
    callback: BodyResponseCallback[Readable | SchemaListQueriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceQueriesList, options: MethodOptions): GaxiosPromise[SchemaListQueriesResponse] = js.native
  def list(
    params: ParamsResourceQueriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListQueriesResponse]
  ): Unit = js.native
  /**
    * Lists queries created by the current user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclickbidmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclickbidmanager = google.doubleclickbidmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclickbidmanager'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclickbidmanager.queries.list({
    *     // Name of a field used to order results. The default sorting order is ascending. To specify descending order for a field, append a " desc" suffix. For example "metadata.title desc". Sorting is only supported for the following fields: * `queryId` * `metadata.title`
    *     orderBy: 'placeholder-value',
    *     // Maximum number of results per page. Must be between `1` and `100`. Defaults to `100` if unspecified.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous list call. Provide this to retrieve the subsequent page of queries.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "queries": []
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
  def list(params: ParamsResourceQueriesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceQueriesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var reports: ResourceQueriesReports = js.native
  
  def run(): GaxiosPromise[SchemaReport] = js.native
  def run(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def run(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def run(params: ParamsResourceQueriesRun): GaxiosPromise[SchemaReport] = js.native
  def run(params: ParamsResourceQueriesRun, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def run(
    params: ParamsResourceQueriesRun,
    options: BodyResponseCallback[Readable | SchemaReport],
    callback: BodyResponseCallback[Readable | SchemaReport]
  ): Unit = js.native
  def run(params: ParamsResourceQueriesRun, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def run(
    params: ParamsResourceQueriesRun,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  /**
    * Runs a stored query to generate a report.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclickbidmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclickbidmanager = google.doubleclickbidmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclickbidmanager'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclickbidmanager.queries.run({
    *     // Required. ID of query to run.
    *     queryId: 'placeholder-value',
    *     // Whether the query should be run synchronously. When true, this method will not return until the query has finished running. When false or not specified, this method will return immediately.
    *     synchronous: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dataRange": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "key": {},
    *   //   "metadata": {},
    *   //   "params": {}
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
  def run(params: ParamsResourceQueriesRun, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def run(
    params: ParamsResourceQueriesRun,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
