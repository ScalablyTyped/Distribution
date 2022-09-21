package typings.googleapis.dlpV2Mod.dlpV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Projects$Locations$Dlpjobs")
@js.native
open class ResourceProjectsLocationsDlpjobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def cancel(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def cancel(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def cancel(params: ParamsResourceProjectsLocationsDlpjobsCancel): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsDlpjobsCancel,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsDlpjobsCancel,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def cancel(params: ParamsResourceProjectsLocationsDlpjobsCancel, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsDlpjobsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Starts asynchronous cancellation on a long-running DlpJob. The server makes a best effort to cancel the DlpJob, but success is not guaranteed. See https://cloud.google.com/dlp/docs/inspecting-storage and https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.projects.locations.dlpJobs.cancel({
    *     // Required. The name of the DlpJob resource to be cancelled.
    *     name: 'projects/my-project/locations/my-location/dlpJobs/my-dlpJob',
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
  def cancel(params: ParamsResourceProjectsLocationsDlpjobsCancel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsDlpjobsCancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def create(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def create(params: ParamsResourceProjectsLocationsDlpjobsCreate): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDlpjobsCreate,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDlpjobsCreate,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2DlpJob],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsDlpjobsCreate, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDlpjobsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  /**
    * Creates a new job to inspect storage or calculate risk metrics. See https://cloud.google.com/dlp/docs/inspecting-storage and https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more. When no InfoTypes or CustomInfoTypes are specified in inspect jobs, the system will automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.projects.locations.dlpJobs.create({
    *     // Required. Parent resource name. The format of this value varies depending on whether you have [specified a processing location](https://cloud.google.com/dlp/docs/specifying-location): + Projects scope, location specified: `projects/`PROJECT_ID`/locations/`LOCATION_ID + Projects scope, no location specified (defaults to global): `projects/`PROJECT_ID The following example `parent` string specifies a parent project with the identifier `example-project`, and specifies the `europe-west3` location for processing data: parent=projects/example-project/locations/europe-west3
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "inspectJob": {},
    *       //   "jobId": "my_jobId",
    *       //   "locationId": "my_locationId",
    *       //   "riskJob": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "endTime": "my_endTime",
    *   //   "errors": [],
    *   //   "inspectDetails": {},
    *   //   "jobTriggerName": "my_jobTriggerName",
    *   //   "name": "my_name",
    *   //   "riskDetails": {},
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
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
  def create(params: ParamsResourceProjectsLocationsDlpjobsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDlpjobsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDlpjobsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDlpjobsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDlpjobsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDlpjobsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDlpjobsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a long-running DlpJob. This method indicates that the client is no longer interested in the DlpJob result. The job will be canceled if possible. See https://cloud.google.com/dlp/docs/inspecting-storage and https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.projects.locations.dlpJobs.delete({
    *     // Required. The name of the DlpJob resource to be deleted.
    *     name: 'projects/my-project/locations/my-location/dlpJobs/my-dlpJob',
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
  def delete(params: ParamsResourceProjectsLocationsDlpjobsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDlpjobsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def finish(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def finish(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def finish(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def finish(params: ParamsResourceProjectsLocationsDlpjobsFinish): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def finish(
    params: ParamsResourceProjectsLocationsDlpjobsFinish,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def finish(
    params: ParamsResourceProjectsLocationsDlpjobsFinish,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def finish(params: ParamsResourceProjectsLocationsDlpjobsFinish, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def finish(
    params: ParamsResourceProjectsLocationsDlpjobsFinish,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Finish a running hybrid DlpJob. Triggers the finalization steps and running of any enabled actions that have not yet run.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.projects.locations.dlpJobs.finish({
    *     // Required. The name of the DlpJob resource to be cancelled.
    *     name: 'projects/my-project/locations/my-location/dlpJobs/my-dlpJob',
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
  def finish(params: ParamsResourceProjectsLocationsDlpjobsFinish, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def finish(
    params: ParamsResourceProjectsLocationsDlpjobsFinish,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def get(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def get(params: ParamsResourceProjectsLocationsDlpjobsGet): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDlpjobsGet,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDlpjobsGet,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2DlpJob],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDlpjobsGet, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDlpjobsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  /**
    * Gets the latest state of a long-running DlpJob. See https://cloud.google.com/dlp/docs/inspecting-storage and https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.projects.locations.dlpJobs.get({
    *     // Required. The name of the DlpJob resource.
    *     name: 'projects/my-project/locations/my-location/dlpJobs/my-dlpJob',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "endTime": "my_endTime",
    *   //   "errors": [],
    *   //   "inspectDetails": {},
    *   //   "jobTriggerName": "my_jobTriggerName",
    *   //   "name": "my_name",
    *   //   "riskDetails": {},
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
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
  def get(params: ParamsResourceProjectsLocationsDlpjobsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDlpjobsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def hybridInspect(): GaxiosPromise[SchemaGooglePrivacyDlpV2HybridInspectResponse] = js.native
  def hybridInspect(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2HybridInspectResponse]): Unit = js.native
  def hybridInspect(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2HybridInspectResponse] = js.native
  def hybridInspect(params: ParamsResourceProjectsLocationsDlpjobsHybridinspect): GaxiosPromise[SchemaGooglePrivacyDlpV2HybridInspectResponse] = js.native
  def hybridInspect(
    params: ParamsResourceProjectsLocationsDlpjobsHybridinspect,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2HybridInspectResponse]
  ): Unit = js.native
  def hybridInspect(
    params: ParamsResourceProjectsLocationsDlpjobsHybridinspect,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2HybridInspectResponse],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2HybridInspectResponse]
  ): Unit = js.native
  def hybridInspect(params: ParamsResourceProjectsLocationsDlpjobsHybridinspect, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2HybridInspectResponse] = js.native
  def hybridInspect(
    params: ParamsResourceProjectsLocationsDlpjobsHybridinspect,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2HybridInspectResponse]
  ): Unit = js.native
  /**
    * Inspect hybrid content and store findings to a job. To review the findings, inspect the job. Inspection will occur asynchronously.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.projects.locations.dlpJobs.hybridInspect({
    *     // Required. Resource name of the job to execute a hybrid inspect on, for example `projects/dlp-test-project/dlpJob/53234423`.
    *     name: 'projects/my-project/locations/my-location/dlpJobs/my-dlpJob',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "hybridItem": {}
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
  def hybridInspect(params: ParamsResourceProjectsLocationsDlpjobsHybridinspect, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def hybridInspect(
    params: ParamsResourceProjectsLocationsDlpjobsHybridinspect,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGooglePrivacyDlpV2ListDlpJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListDlpJobsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListDlpJobsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDlpjobsList): GaxiosPromise[SchemaGooglePrivacyDlpV2ListDlpJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDlpjobsList,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListDlpJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDlpjobsList,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2ListDlpJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2ListDlpJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDlpjobsList, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListDlpJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDlpjobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListDlpJobsResponse]
  ): Unit = js.native
  /**
    * Lists DlpJobs that match the specified filter in the request. See https://cloud.google.com/dlp/docs/inspecting-storage and https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.projects.locations.dlpJobs.list({
    *     // Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field\} {operator\} {value\}`. * Supported fields/values for inspect jobs: - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY - `trigger_name` - The name of the trigger that created the job. - 'end_time` - Corresponds to the time the job finished. - 'start_time` - Corresponds to the time the job finished. * Supported fields for risk analysis jobs: - `state` - RUNNING|CANCELED|FINISHED|FAILED - 'end_time` - Corresponds to the time the job finished. - 'start_time` - Corresponds to the time the job finished. * The operator must be `=` or `!=`. Examples: * inspected_storage = cloud_storage AND state = done * inspected_storage = cloud_storage OR inspected_storage = bigquery * inspected_storage = cloud_storage AND (state = done OR state = canceled) * end_time \> \"2017-12-12T00:00:00+00:00\" The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Deprecated. This field has no effect.
    *     locationId: 'placeholder-value',
    *     // Comma separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case-insensitive, default sorting order is ascending, redundant space characters are insignificant. Example: `name asc, end_time asc, create_time desc` Supported fields are: - `create_time`: corresponds to the time the job was created. - `end_time`: corresponds to the time the job ended. - `name`: corresponds to the job's name. - `state`: corresponds to `state`
    *     orderBy: 'placeholder-value',
    *     // The standard list page size.
    *     pageSize: 'placeholder-value',
    *     // The standard list page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent resource name. The format of this value varies depending on whether you have [specified a processing location](https://cloud.google.com/dlp/docs/specifying-location): + Projects scope, location specified: `projects/`PROJECT_ID`/locations/`LOCATION_ID + Projects scope, no location specified (defaults to global): `projects/`PROJECT_ID The following example `parent` string specifies a parent project with the identifier `example-project`, and specifies the `europe-west3` location for processing data: parent=projects/example-project/locations/europe-west3
    *     parent: 'projects/my-project/locations/my-location',
    *     // The type of job. Defaults to `DlpJobType.INSPECT`
    *     type: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "jobs": [],
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
  def list(params: ParamsResourceProjectsLocationsDlpjobsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDlpjobsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
