package typings.googleapis.storagetransferV1Mod.storagetransferV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/storagetransfer/v1", "storagetransfer_v1.Resource$Transferjobs")
@js.native
class ResourceTransferjobs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * storagetransfer.transferJobs.create
    * @desc Creates a transfer job that runs periodically.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Storage Transfer API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storagetransfer
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storagetransfer = google.storagetransfer('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storagetransfer.transferJobs.create(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storagetransfer.transferJobs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().TransferJob} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaTransferJob] = js.native
  def create(callback: BodyResponseCallback[SchemaTransferJob]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTransferJob] = js.native
  def create(params: ParamsResourceTransferjobsCreate): GaxiosPromise[SchemaTransferJob] = js.native
  def create(params: ParamsResourceTransferjobsCreate, callback: BodyResponseCallback[SchemaTransferJob]): Unit = js.native
  def create(
    params: ParamsResourceTransferjobsCreate,
    options: BodyResponseCallback[SchemaTransferJob],
    callback: BodyResponseCallback[SchemaTransferJob]
  ): Unit = js.native
  def create(params: ParamsResourceTransferjobsCreate, options: MethodOptions): GaxiosPromise[SchemaTransferJob] = js.native
  def create(
    params: ParamsResourceTransferjobsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTransferJob]
  ): Unit = js.native
  
  /**
    * storagetransfer.transferJobs.get
    * @desc Gets a transfer job.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Storage Transfer API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storagetransfer
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storagetransfer = google.storagetransfer('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The job to get.
    *     // Required.
    *     jobName: 'transferJobs/my-transfer-job',  // TODO: Update placeholder
    * value.
    *
    *     auth: authClient,
    *   };
    *
    *   storagetransfer.transferJobs.get(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storagetransfer.transferJobs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobName The job to get. Required.
    * @param {string=} params.projectId The ID of the Google Cloud Platform Console project that owns the job. Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTransferJob] = js.native
  def get(callback: BodyResponseCallback[SchemaTransferJob]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTransferJob] = js.native
  def get(params: ParamsResourceTransferjobsGet): GaxiosPromise[SchemaTransferJob] = js.native
  def get(params: ParamsResourceTransferjobsGet, callback: BodyResponseCallback[SchemaTransferJob]): Unit = js.native
  def get(
    params: ParamsResourceTransferjobsGet,
    options: BodyResponseCallback[SchemaTransferJob],
    callback: BodyResponseCallback[SchemaTransferJob]
  ): Unit = js.native
  def get(params: ParamsResourceTransferjobsGet, options: MethodOptions): GaxiosPromise[SchemaTransferJob] = js.native
  def get(
    params: ParamsResourceTransferjobsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTransferJob]
  ): Unit = js.native
  
  /**
    * storagetransfer.transferJobs.list
    * @desc Lists transfer jobs.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Storage Transfer API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storagetransfer
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storagetransfer = google.storagetransfer('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var transferJobsPage = response['transferJobs'];
    *     if (!transferJobsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < transferJobsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `transferJobsPage`: console.log(JSON.stringify(transferJobsPage[i], null,
    * 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       storagetransfer.transferJobs.list(request, handlePage);
    *     }
    *   };
    *
    *   storagetransfer.transferJobs.list(request, handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storagetransfer.transferJobs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A list of query parameters specified as JSON text in the form of {"project_id":"my_project_id", "job_names":["jobid1","jobid2",...], "job_statuses":["status1","status2",...]}. Since `job_names` and `job_statuses` support multiple values, their values must be specified with array notation. `project_id` is required. `job_names` and `job_statuses` are optional.  The valid values for `job_statuses` are case-insensitive: `ENABLED`, `DISABLED`, and `DELETED`.
    * @param {integer=} params.pageSize The list page size. The max allowed value is 256.
    * @param {string=} params.pageToken The list page token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListTransferJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTransferJobsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListTransferJobsResponse] = js.native
  def list(params: ParamsResourceTransferjobsList): GaxiosPromise[SchemaListTransferJobsResponse] = js.native
  def list(
    params: ParamsResourceTransferjobsList,
    callback: BodyResponseCallback[SchemaListTransferJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceTransferjobsList,
    options: BodyResponseCallback[SchemaListTransferJobsResponse],
    callback: BodyResponseCallback[SchemaListTransferJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTransferjobsList, options: MethodOptions): GaxiosPromise[SchemaListTransferJobsResponse] = js.native
  def list(
    params: ParamsResourceTransferjobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTransferJobsResponse]
  ): Unit = js.native
  
  /**
    * storagetransfer.transferJobs.patch
    * @desc Updates a transfer job. Updating a job's transfer spec does not
    * affect transfer operations that are running already. Updating the
    * scheduling of a job is not allowed.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Storage Transfer API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storagetransfer
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storagetransfer = google.storagetransfer('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The name of job to update.
    *     // Required.
    *     jobName: 'transferJobs/my-transfer-job',  // TODO: Update placeholder
    * value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. Only these
    * properties
    *       // will be changed.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storagetransfer.transferJobs.patch(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storagetransfer.transferJobs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobName The name of job to update. Required.
    * @param {().UpdateTransferJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaTransferJob] = js.native
  def patch(callback: BodyResponseCallback[SchemaTransferJob]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTransferJob] = js.native
  def patch(params: ParamsResourceTransferjobsPatch): GaxiosPromise[SchemaTransferJob] = js.native
  def patch(params: ParamsResourceTransferjobsPatch, callback: BodyResponseCallback[SchemaTransferJob]): Unit = js.native
  def patch(
    params: ParamsResourceTransferjobsPatch,
    options: BodyResponseCallback[SchemaTransferJob],
    callback: BodyResponseCallback[SchemaTransferJob]
  ): Unit = js.native
  def patch(params: ParamsResourceTransferjobsPatch, options: MethodOptions): GaxiosPromise[SchemaTransferJob] = js.native
  def patch(
    params: ParamsResourceTransferjobsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTransferJob]
  ): Unit = js.native
}
