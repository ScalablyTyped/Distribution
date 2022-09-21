package typings.googleapis.storagetransferV1Mod.storagetransferV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/storagetransfer/v1", "storagetransfer_v1.Resource$Transferjobs")
@js.native
open class ResourceTransferjobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTransferJob] = js.native
  def create(callback: BodyResponseCallback[SchemaTransferJob]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTransferJob] = js.native
  def create(params: ParamsResourceTransferjobsCreate): GaxiosPromise[SchemaTransferJob] = js.native
  def create(params: ParamsResourceTransferjobsCreate, callback: BodyResponseCallback[SchemaTransferJob]): Unit = js.native
  def create(
    params: ParamsResourceTransferjobsCreate,
    options: BodyResponseCallback[Readable | SchemaTransferJob],
    callback: BodyResponseCallback[Readable | SchemaTransferJob]
  ): Unit = js.native
  def create(params: ParamsResourceTransferjobsCreate, options: MethodOptions): GaxiosPromise[SchemaTransferJob] = js.native
  def create(
    params: ParamsResourceTransferjobsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTransferJob]
  ): Unit = js.native
  /**
    * Creates a transfer job that runs periodically.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storagetransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storagetransfer = google.storagetransfer('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storagetransfer.transferJobs.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "creationTime": "my_creationTime",
    *       //   "deletionTime": "my_deletionTime",
    *       //   "description": "my_description",
    *       //   "lastModificationTime": "my_lastModificationTime",
    *       //   "latestOperationName": "my_latestOperationName",
    *       //   "loggingConfig": {},
    *       //   "name": "my_name",
    *       //   "notificationConfig": {},
    *       //   "projectId": "my_projectId",
    *       //   "schedule": {},
    *       //   "status": "my_status",
    *       //   "transferSpec": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationTime": "my_creationTime",
    *   //   "deletionTime": "my_deletionTime",
    *   //   "description": "my_description",
    *   //   "lastModificationTime": "my_lastModificationTime",
    *   //   "latestOperationName": "my_latestOperationName",
    *   //   "loggingConfig": {},
    *   //   "name": "my_name",
    *   //   "notificationConfig": {},
    *   //   "projectId": "my_projectId",
    *   //   "schedule": {},
    *   //   "status": "my_status",
    *   //   "transferSpec": {}
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
  def create(params: ParamsResourceTransferjobsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceTransferjobsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTransferJob] = js.native
  def get(callback: BodyResponseCallback[SchemaTransferJob]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTransferJob] = js.native
  def get(params: ParamsResourceTransferjobsGet): GaxiosPromise[SchemaTransferJob] = js.native
  def get(params: ParamsResourceTransferjobsGet, callback: BodyResponseCallback[SchemaTransferJob]): Unit = js.native
  def get(
    params: ParamsResourceTransferjobsGet,
    options: BodyResponseCallback[Readable | SchemaTransferJob],
    callback: BodyResponseCallback[Readable | SchemaTransferJob]
  ): Unit = js.native
  def get(params: ParamsResourceTransferjobsGet, options: MethodOptions): GaxiosPromise[SchemaTransferJob] = js.native
  def get(
    params: ParamsResourceTransferjobsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTransferJob]
  ): Unit = js.native
  /**
    * Gets a transfer job.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storagetransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storagetransfer = google.storagetransfer('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storagetransfer.transferJobs.get({
    *     // Required. The job to get.
    *     jobName: 'transferJobs/.*',
    *     // Required. The ID of the Google Cloud project that owns the job.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationTime": "my_creationTime",
    *   //   "deletionTime": "my_deletionTime",
    *   //   "description": "my_description",
    *   //   "lastModificationTime": "my_lastModificationTime",
    *   //   "latestOperationName": "my_latestOperationName",
    *   //   "loggingConfig": {},
    *   //   "name": "my_name",
    *   //   "notificationConfig": {},
    *   //   "projectId": "my_projectId",
    *   //   "schedule": {},
    *   //   "status": "my_status",
    *   //   "transferSpec": {}
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
  def get(params: ParamsResourceTransferjobsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceTransferjobsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTransferJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTransferJobsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTransferJobsResponse] = js.native
  def list(params: ParamsResourceTransferjobsList): GaxiosPromise[SchemaListTransferJobsResponse] = js.native
  def list(
    params: ParamsResourceTransferjobsList,
    callback: BodyResponseCallback[SchemaListTransferJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceTransferjobsList,
    options: BodyResponseCallback[Readable | SchemaListTransferJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaListTransferJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTransferjobsList, options: MethodOptions): GaxiosPromise[SchemaListTransferJobsResponse] = js.native
  def list(
    params: ParamsResourceTransferjobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTransferJobsResponse]
  ): Unit = js.native
  /**
    * Lists transfer jobs.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storagetransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storagetransfer = google.storagetransfer('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storagetransfer.transferJobs.list({
    *     // Required. A list of query parameters specified as JSON text in the form of: `{"projectId":"my_project_id", "jobNames":["jobid1","jobid2",...], "jobStatuses":["status1","status2",...]\}` Since `jobNames` and `jobStatuses` support multiple values, their values must be specified with array notation. `projectId` is required. `jobNames` and `jobStatuses` are optional. The valid values for `jobStatuses` are case-insensitive: ENABLED, DISABLED, and DELETED.
    *     filter: 'placeholder-value',
    *     // The list page size. The max allowed value is 256.
    *     pageSize: 'placeholder-value',
    *     // The list page token.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "transferJobs": []
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
  def list(params: ParamsResourceTransferjobsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceTransferjobsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaTransferJob] = js.native
  def patch(callback: BodyResponseCallback[SchemaTransferJob]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTransferJob] = js.native
  def patch(params: ParamsResourceTransferjobsPatch): GaxiosPromise[SchemaTransferJob] = js.native
  def patch(params: ParamsResourceTransferjobsPatch, callback: BodyResponseCallback[SchemaTransferJob]): Unit = js.native
  def patch(
    params: ParamsResourceTransferjobsPatch,
    options: BodyResponseCallback[Readable | SchemaTransferJob],
    callback: BodyResponseCallback[Readable | SchemaTransferJob]
  ): Unit = js.native
  def patch(params: ParamsResourceTransferjobsPatch, options: MethodOptions): GaxiosPromise[SchemaTransferJob] = js.native
  def patch(
    params: ParamsResourceTransferjobsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTransferJob]
  ): Unit = js.native
  /**
    * Updates a transfer job. Updating a job's transfer spec does not affect transfer operations that are running already. **Note:** The job's status field can be modified using this RPC (for example, to set a job's status to DELETED, DISABLED, or ENABLED).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storagetransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storagetransfer = google.storagetransfer('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storagetransfer.transferJobs.patch({
    *     // Required. The name of job to update.
    *     jobName: 'transferJobs/.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "projectId": "my_projectId",
    *       //   "transferJob": {},
    *       //   "updateTransferJobFieldMask": "my_updateTransferJobFieldMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationTime": "my_creationTime",
    *   //   "deletionTime": "my_deletionTime",
    *   //   "description": "my_description",
    *   //   "lastModificationTime": "my_lastModificationTime",
    *   //   "latestOperationName": "my_latestOperationName",
    *   //   "loggingConfig": {},
    *   //   "name": "my_name",
    *   //   "notificationConfig": {},
    *   //   "projectId": "my_projectId",
    *   //   "schedule": {},
    *   //   "status": "my_status",
    *   //   "transferSpec": {}
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
  def patch(params: ParamsResourceTransferjobsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceTransferjobsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def run(): GaxiosPromise[SchemaOperation] = js.native
  def run(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def run(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def run(params: ParamsResourceTransferjobsRun): GaxiosPromise[SchemaOperation] = js.native
  def run(params: ParamsResourceTransferjobsRun, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def run(
    params: ParamsResourceTransferjobsRun,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def run(params: ParamsResourceTransferjobsRun, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def run(
    params: ParamsResourceTransferjobsRun,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Attempts to start a new TransferOperation for the current TransferJob. A TransferJob has a maximum of one active TransferOperation. If this method is called while a TransferOperation is active, an error will be returned.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storagetransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storagetransfer = google.storagetransfer('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await storagetransfer.transferJobs.run({
    *     // Required. The name of the transfer job.
    *     jobName: 'transferJobs/.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "projectId": "my_projectId"
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
  def run(params: ParamsResourceTransferjobsRun, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def run(
    params: ParamsResourceTransferjobsRun,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
