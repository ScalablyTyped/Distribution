package typings.googleapis.loggingV2Mod.loggingV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Entries")
@js.native
open class ResourceEntries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def copy(): GaxiosPromise[SchemaOperation] = js.native
  def copy(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def copy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def copy(params: ParamsResourceEntriesCopy): GaxiosPromise[SchemaOperation] = js.native
  def copy(params: ParamsResourceEntriesCopy, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def copy(
    params: ParamsResourceEntriesCopy,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def copy(params: ParamsResourceEntriesCopy, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def copy(
    params: ParamsResourceEntriesCopy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Copies a set of log entries from a log bucket to a Cloud Storage bucket.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/logging.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.entries.copy({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "destination": "my_destination",
    *       //   "filter": "my_filter",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def copy(params: ParamsResourceEntriesCopy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def copy(
    params: ParamsResourceEntriesCopy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListLogEntriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLogEntriesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListLogEntriesResponse] = js.native
  def list(params: ParamsResourceEntriesList): GaxiosPromise[SchemaListLogEntriesResponse] = js.native
  def list(params: ParamsResourceEntriesList, callback: BodyResponseCallback[SchemaListLogEntriesResponse]): Unit = js.native
  def list(
    params: ParamsResourceEntriesList,
    options: BodyResponseCallback[Readable | SchemaListLogEntriesResponse],
    callback: BodyResponseCallback[Readable | SchemaListLogEntriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEntriesList, options: MethodOptions): GaxiosPromise[SchemaListLogEntriesResponse] = js.native
  def list(
    params: ParamsResourceEntriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLogEntriesResponse]
  ): Unit = js.native
  /**
    * Lists log entries. Use this method to retrieve log entries that originated from a project/folder/organization/billing account. For ways to export log entries, see Exporting Logs (https://cloud.google.com/logging/docs/export).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/logging.admin',
    *       'https://www.googleapis.com/auth/logging.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.entries.list({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "filter": "my_filter",
    *       //   "orderBy": "my_orderBy",
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "projectIds": [],
    *       //   "resourceNames": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entries": [],
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
  def list(params: ParamsResourceEntriesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEntriesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def tail(): GaxiosPromise[SchemaTailLogEntriesResponse] = js.native
  def tail(callback: BodyResponseCallback[SchemaTailLogEntriesResponse]): Unit = js.native
  def tail(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTailLogEntriesResponse] = js.native
  def tail(params: ParamsResourceEntriesTail): GaxiosPromise[SchemaTailLogEntriesResponse] = js.native
  def tail(params: ParamsResourceEntriesTail, callback: BodyResponseCallback[SchemaTailLogEntriesResponse]): Unit = js.native
  def tail(
    params: ParamsResourceEntriesTail,
    options: BodyResponseCallback[Readable | SchemaTailLogEntriesResponse],
    callback: BodyResponseCallback[Readable | SchemaTailLogEntriesResponse]
  ): Unit = js.native
  def tail(params: ParamsResourceEntriesTail, options: MethodOptions): GaxiosPromise[SchemaTailLogEntriesResponse] = js.native
  def tail(
    params: ParamsResourceEntriesTail,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTailLogEntriesResponse]
  ): Unit = js.native
  /**
    * Streaming read of log entries as they are ingested. Until the stream is terminated, it will continue reading logs.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/logging.admin',
    *       'https://www.googleapis.com/auth/logging.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.entries.tail({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bufferWindow": "my_bufferWindow",
    *       //   "filter": "my_filter",
    *       //   "resourceNames": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entries": [],
    *   //   "suppressionInfo": []
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
  def tail(params: ParamsResourceEntriesTail, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def tail(
    params: ParamsResourceEntriesTail,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def write(): GaxiosPromise[SchemaWriteLogEntriesResponse] = js.native
  def write(callback: BodyResponseCallback[SchemaWriteLogEntriesResponse]): Unit = js.native
  def write(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWriteLogEntriesResponse] = js.native
  def write(params: ParamsResourceEntriesWrite): GaxiosPromise[SchemaWriteLogEntriesResponse] = js.native
  def write(params: ParamsResourceEntriesWrite, callback: BodyResponseCallback[SchemaWriteLogEntriesResponse]): Unit = js.native
  def write(
    params: ParamsResourceEntriesWrite,
    options: BodyResponseCallback[Readable | SchemaWriteLogEntriesResponse],
    callback: BodyResponseCallback[Readable | SchemaWriteLogEntriesResponse]
  ): Unit = js.native
  def write(params: ParamsResourceEntriesWrite, options: MethodOptions): GaxiosPromise[SchemaWriteLogEntriesResponse] = js.native
  def write(
    params: ParamsResourceEntriesWrite,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWriteLogEntriesResponse]
  ): Unit = js.native
  /**
    * Writes log entries to Logging. This API method is the only way to send log entries to Logging. This method is used, directly or indirectly, by the Logging agent (fluentd) and all logging libraries configured to use Logging. A single request may contain log entries for a maximum of 1000 different resources (projects, organizations, billing accounts or folders)
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/logging.admin',
    *       'https://www.googleapis.com/auth/logging.write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.entries.write({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dryRun": false,
    *       //   "entries": [],
    *       //   "labels": {},
    *       //   "logName": "my_logName",
    *       //   "partialSuccess": false,
    *       //   "resource": {}
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
  def write(params: ParamsResourceEntriesWrite, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def write(
    params: ParamsResourceEntriesWrite,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
