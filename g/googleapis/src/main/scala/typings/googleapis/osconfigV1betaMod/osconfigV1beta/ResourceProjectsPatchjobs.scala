package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/osconfig/v1beta", "osconfig_v1beta.Resource$Projects$Patchjobs")
@js.native
open class ResourceProjectsPatchjobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def cancel(): GaxiosPromise[SchemaPatchJob] = js.native
  def cancel(callback: BodyResponseCallback[SchemaPatchJob]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPatchJob] = js.native
  def cancel(params: ParamsResourceProjectsPatchjobsCancel): GaxiosPromise[SchemaPatchJob] = js.native
  def cancel(params: ParamsResourceProjectsPatchjobsCancel, callback: BodyResponseCallback[SchemaPatchJob]): Unit = js.native
  def cancel(
    params: ParamsResourceProjectsPatchjobsCancel,
    options: BodyResponseCallback[Readable | SchemaPatchJob],
    callback: BodyResponseCallback[Readable | SchemaPatchJob]
  ): Unit = js.native
  def cancel(params: ParamsResourceProjectsPatchjobsCancel, options: MethodOptions): GaxiosPromise[SchemaPatchJob] = js.native
  def cancel(
    params: ParamsResourceProjectsPatchjobsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPatchJob]
  ): Unit = js.native
  /**
    * Cancel a patch job. The patch job must be active. Canceled patch jobs cannot be restarted.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/osconfig.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const osconfig = google.osconfig('v1beta');
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
    *   const res = await osconfig.projects.patchJobs.cancel({
    *     // Required. Name of the patch in the form `projects/x/patchJobs/x`
    *     name: 'projects/my-project/patchJobs/my-patchJob',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "dryRun": false,
    *   //   "duration": "my_duration",
    *   //   "errorMessage": "my_errorMessage",
    *   //   "instanceDetailsSummary": {},
    *   //   "instanceFilter": {},
    *   //   "name": "my_name",
    *   //   "patchConfig": {},
    *   //   "patchDeployment": "my_patchDeployment",
    *   //   "percentComplete": {},
    *   //   "rollout": {},
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime"
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
  def cancel(params: ParamsResourceProjectsPatchjobsCancel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancel(
    params: ParamsResourceProjectsPatchjobsCancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def execute(): GaxiosPromise[SchemaPatchJob] = js.native
  def execute(callback: BodyResponseCallback[SchemaPatchJob]): Unit = js.native
  def execute(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPatchJob] = js.native
  def execute(params: ParamsResourceProjectsPatchjobsExecute): GaxiosPromise[SchemaPatchJob] = js.native
  def execute(params: ParamsResourceProjectsPatchjobsExecute, callback: BodyResponseCallback[SchemaPatchJob]): Unit = js.native
  def execute(
    params: ParamsResourceProjectsPatchjobsExecute,
    options: BodyResponseCallback[Readable | SchemaPatchJob],
    callback: BodyResponseCallback[Readable | SchemaPatchJob]
  ): Unit = js.native
  def execute(params: ParamsResourceProjectsPatchjobsExecute, options: MethodOptions): GaxiosPromise[SchemaPatchJob] = js.native
  def execute(
    params: ParamsResourceProjectsPatchjobsExecute,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPatchJob]
  ): Unit = js.native
  /**
    * Patch VM instances by creating and running a patch job.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/osconfig.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const osconfig = google.osconfig('v1beta');
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
    *   const res = await osconfig.projects.patchJobs.execute({
    *     // Required. The project in which to run this patch in the form `projects/x`
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "dryRun": false,
    *       //   "duration": "my_duration",
    *       //   "instanceFilter": {},
    *       //   "patchConfig": {},
    *       //   "rollout": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "dryRun": false,
    *   //   "duration": "my_duration",
    *   //   "errorMessage": "my_errorMessage",
    *   //   "instanceDetailsSummary": {},
    *   //   "instanceFilter": {},
    *   //   "name": "my_name",
    *   //   "patchConfig": {},
    *   //   "patchDeployment": "my_patchDeployment",
    *   //   "percentComplete": {},
    *   //   "rollout": {},
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime"
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
  def execute(params: ParamsResourceProjectsPatchjobsExecute, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def execute(
    params: ParamsResourceProjectsPatchjobsExecute,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPatchJob] = js.native
  def get(callback: BodyResponseCallback[SchemaPatchJob]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPatchJob] = js.native
  def get(params: ParamsResourceProjectsPatchjobsGet): GaxiosPromise[SchemaPatchJob] = js.native
  def get(params: ParamsResourceProjectsPatchjobsGet, callback: BodyResponseCallback[SchemaPatchJob]): Unit = js.native
  def get(
    params: ParamsResourceProjectsPatchjobsGet,
    options: BodyResponseCallback[Readable | SchemaPatchJob],
    callback: BodyResponseCallback[Readable | SchemaPatchJob]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsPatchjobsGet, options: MethodOptions): GaxiosPromise[SchemaPatchJob] = js.native
  def get(
    params: ParamsResourceProjectsPatchjobsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPatchJob]
  ): Unit = js.native
  /**
    * Get the patch job. This can be used to track the progress of an ongoing patch job or review the details of completed jobs.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/osconfig.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const osconfig = google.osconfig('v1beta');
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
    *   const res = await osconfig.projects.patchJobs.get({
    *     // Required. Name of the patch in the form `projects/x/patchJobs/x`
    *     name: 'projects/my-project/patchJobs/my-patchJob',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "dryRun": false,
    *   //   "duration": "my_duration",
    *   //   "errorMessage": "my_errorMessage",
    *   //   "instanceDetailsSummary": {},
    *   //   "instanceFilter": {},
    *   //   "name": "my_name",
    *   //   "patchConfig": {},
    *   //   "patchDeployment": "my_patchDeployment",
    *   //   "percentComplete": {},
    *   //   "rollout": {},
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsPatchjobsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsPatchjobsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var instanceDetails: ResourceProjectsPatchjobsInstancedetails = js.native
  
  def list(): GaxiosPromise[SchemaListPatchJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPatchJobsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPatchJobsResponse] = js.native
  def list(params: ParamsResourceProjectsPatchjobsList): GaxiosPromise[SchemaListPatchJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsPatchjobsList,
    callback: BodyResponseCallback[SchemaListPatchJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsPatchjobsList,
    options: BodyResponseCallback[Readable | SchemaListPatchJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaListPatchJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsPatchjobsList, options: MethodOptions): GaxiosPromise[SchemaListPatchJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsPatchjobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPatchJobsResponse]
  ): Unit = js.native
  /**
    * Get a list of patch jobs.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/osconfig.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const osconfig = google.osconfig('v1beta');
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
    *   const res = await osconfig.projects.patchJobs.list({
    *     // If provided, this field specifies the criteria that must be met by patch jobs to be included in the response. Currently, filtering is only available on the patch_deployment field.
    *     filter: 'placeholder-value',
    *     // The maximum number of instance status to return.
    *     pageSize: 'placeholder-value',
    *     // A pagination token returned from a previous call that indicates where this listing should continue from.
    *     pageToken: 'placeholder-value',
    *     // Required. In the form of `projects/x`
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "patchJobs": []
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
  def list(params: ParamsResourceProjectsPatchjobsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsPatchjobsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
