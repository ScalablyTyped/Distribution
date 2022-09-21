package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/doubleclickbidmanager/v1.1", "doubleclickbidmanager_v1_1.Resource$Queries")
@js.native
open class ResourceQueries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def createquery(): GaxiosPromise[SchemaQuery] = js.native
  def createquery(callback: BodyResponseCallback[SchemaQuery]): Unit = js.native
  def createquery(params: Unit, options: MethodOptions): GaxiosPromise[SchemaQuery] = js.native
  def createquery(params: ParamsResourceQueriesCreatequery): GaxiosPromise[SchemaQuery] = js.native
  def createquery(params: ParamsResourceQueriesCreatequery, callback: BodyResponseCallback[SchemaQuery]): Unit = js.native
  def createquery(
    params: ParamsResourceQueriesCreatequery,
    options: BodyResponseCallback[Readable | SchemaQuery],
    callback: BodyResponseCallback[Readable | SchemaQuery]
  ): Unit = js.native
  def createquery(params: ParamsResourceQueriesCreatequery, options: MethodOptions): GaxiosPromise[SchemaQuery] = js.native
  def createquery(
    params: ParamsResourceQueriesCreatequery,
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
    * const doubleclickbidmanager = google.doubleclickbidmanager('v1.1');
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
    *   const res = await doubleclickbidmanager.queries.createquery({
    *     // If true, tries to run the query asynchronously. Only applicable when the frequency is ONE_TIME.
    *     asynchronous: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "kind": "my_kind",
    *       //   "metadata": {},
    *       //   "params": {},
    *       //   "queryId": "my_queryId",
    *       //   "reportDataEndTimeMs": "my_reportDataEndTimeMs",
    *       //   "reportDataStartTimeMs": "my_reportDataStartTimeMs",
    *       //   "schedule": {},
    *       //   "timezoneCode": "my_timezoneCode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "params": {},
    *   //   "queryId": "my_queryId",
    *   //   "reportDataEndTimeMs": "my_reportDataEndTimeMs",
    *   //   "reportDataStartTimeMs": "my_reportDataStartTimeMs",
    *   //   "schedule": {},
    *   //   "timezoneCode": "my_timezoneCode"
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
  def createquery(params: ParamsResourceQueriesCreatequery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createquery(
    params: ParamsResourceQueriesCreatequery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deletequery(): GaxiosPromise[Unit] = js.native
  def deletequery(callback: BodyResponseCallback[Unit]): Unit = js.native
  def deletequery(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deletequery(params: ParamsResourceQueriesDeletequery): GaxiosPromise[Unit] = js.native
  def deletequery(params: ParamsResourceQueriesDeletequery, callback: BodyResponseCallback[Unit]): Unit = js.native
  def deletequery(
    params: ParamsResourceQueriesDeletequery,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def deletequery(params: ParamsResourceQueriesDeletequery, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deletequery(
    params: ParamsResourceQueriesDeletequery,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a stored query as well as the associated stored reports.
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
    * const doubleclickbidmanager = google.doubleclickbidmanager('v1.1');
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
    *   const res = await doubleclickbidmanager.queries.deletequery({
    *     // Query ID to delete.
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
  def deletequery(params: ParamsResourceQueriesDeletequery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deletequery(
    params: ParamsResourceQueriesDeletequery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getquery(): GaxiosPromise[SchemaQuery] = js.native
  def getquery(callback: BodyResponseCallback[SchemaQuery]): Unit = js.native
  def getquery(params: Unit, options: MethodOptions): GaxiosPromise[SchemaQuery] = js.native
  def getquery(params: ParamsResourceQueriesGetquery): GaxiosPromise[SchemaQuery] = js.native
  def getquery(params: ParamsResourceQueriesGetquery, callback: BodyResponseCallback[SchemaQuery]): Unit = js.native
  def getquery(
    params: ParamsResourceQueriesGetquery,
    options: BodyResponseCallback[Readable | SchemaQuery],
    callback: BodyResponseCallback[Readable | SchemaQuery]
  ): Unit = js.native
  def getquery(params: ParamsResourceQueriesGetquery, options: MethodOptions): GaxiosPromise[SchemaQuery] = js.native
  def getquery(
    params: ParamsResourceQueriesGetquery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQuery]
  ): Unit = js.native
  /**
    * Retrieves a stored query.
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
    * const doubleclickbidmanager = google.doubleclickbidmanager('v1.1');
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
    *   const res = await doubleclickbidmanager.queries.getquery({
    *     // Query ID to retrieve.
    *     queryId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "params": {},
    *   //   "queryId": "my_queryId",
    *   //   "reportDataEndTimeMs": "my_reportDataEndTimeMs",
    *   //   "reportDataStartTimeMs": "my_reportDataStartTimeMs",
    *   //   "schedule": {},
    *   //   "timezoneCode": "my_timezoneCode"
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
  def getquery(params: ParamsResourceQueriesGetquery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getquery(
    params: ParamsResourceQueriesGetquery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listqueries(): GaxiosPromise[SchemaListQueriesResponse] = js.native
  def listqueries(callback: BodyResponseCallback[SchemaListQueriesResponse]): Unit = js.native
  def listqueries(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListQueriesResponse] = js.native
  def listqueries(params: ParamsResourceQueriesListqueries): GaxiosPromise[SchemaListQueriesResponse] = js.native
  def listqueries(
    params: ParamsResourceQueriesListqueries,
    callback: BodyResponseCallback[SchemaListQueriesResponse]
  ): Unit = js.native
  def listqueries(
    params: ParamsResourceQueriesListqueries,
    options: BodyResponseCallback[Readable | SchemaListQueriesResponse],
    callback: BodyResponseCallback[Readable | SchemaListQueriesResponse]
  ): Unit = js.native
  def listqueries(params: ParamsResourceQueriesListqueries, options: MethodOptions): GaxiosPromise[SchemaListQueriesResponse] = js.native
  def listqueries(
    params: ParamsResourceQueriesListqueries,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListQueriesResponse]
  ): Unit = js.native
  /**
    * Retrieves stored queries.
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
    * const doubleclickbidmanager = google.doubleclickbidmanager('v1.1');
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
    *   const res = await doubleclickbidmanager.queries.listqueries({
    *     // Maximum number of results per page. Must be between 1 and 100. Defaults to 100 if unspecified.
    *     pageSize: 'placeholder-value',
    *     // Optional pagination token.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
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
  def listqueries(params: ParamsResourceQueriesListqueries, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listqueries(
    params: ParamsResourceQueriesListqueries,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def runquery(): GaxiosPromise[Unit] = js.native
  def runquery(callback: BodyResponseCallback[Unit]): Unit = js.native
  def runquery(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def runquery(params: ParamsResourceQueriesRunquery): GaxiosPromise[Unit] = js.native
  def runquery(params: ParamsResourceQueriesRunquery, callback: BodyResponseCallback[Unit]): Unit = js.native
  def runquery(
    params: ParamsResourceQueriesRunquery,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def runquery(params: ParamsResourceQueriesRunquery, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def runquery(
    params: ParamsResourceQueriesRunquery,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
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
    * const doubleclickbidmanager = google.doubleclickbidmanager('v1.1');
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
    *   const res = await doubleclickbidmanager.queries.runquery({
    *     // If true, tries to run the query asynchronously.
    *     asynchronous: 'placeholder-value',
    *     // Query ID to run.
    *     queryId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dataRange": "my_dataRange",
    *       //   "reportDataEndTimeMs": "my_reportDataEndTimeMs",
    *       //   "reportDataStartTimeMs": "my_reportDataStartTimeMs",
    *       //   "timezoneCode": "my_timezoneCode"
    *       // }
    *     },
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
  def runquery(params: ParamsResourceQueriesRunquery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def runquery(
    params: ParamsResourceQueriesRunquery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
