package typings.googleapis.cloudtraceV1Mod.cloudtraceV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudtrace/v1", "cloudtrace_v1.Resource$Projects$Traces")
@js.native
class ResourceProjectsTraces protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudtrace.projects.traces.get
    * @desc Gets a single trace by its ID.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Stackdriver Trace API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudtrace
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
    * var cloudTrace = google.cloudtrace('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // ID of the Cloud project where the trace data is stored.
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // ID of the trace to return.
    *     traceId: 'my-trace-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   cloudTrace.projects.traces.get(request, function(err, response) {
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
    * @alias cloudtrace.projects.traces.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId ID of the Cloud project where the trace data is stored.
    * @param {string} params.traceId ID of the trace to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTrace] = js.native
  def get(callback: BodyResponseCallback[SchemaTrace]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTrace] = js.native
  def get(params: ParamsResourceProjectsTracesGet): GaxiosPromise[SchemaTrace] = js.native
  def get(params: ParamsResourceProjectsTracesGet, callback: BodyResponseCallback[SchemaTrace]): Unit = js.native
  def get(
    params: ParamsResourceProjectsTracesGet,
    options: BodyResponseCallback[SchemaTrace],
    callback: BodyResponseCallback[SchemaTrace]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsTracesGet, options: MethodOptions): GaxiosPromise[SchemaTrace] = js.native
  def get(
    params: ParamsResourceProjectsTracesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrace]
  ): Unit = js.native
  
  /**
    * cloudtrace.projects.traces.list
    * @desc Returns of a list of traces that match the specified filter
    * conditions.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Stackdriver Trace API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudtrace
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
    * var cloudTrace = google.cloudtrace('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // ID of the Cloud project where the trace data is stored.
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var tracesPage = response['traces'];
    *     if (!tracesPage) {
    *       return;
    *     }
    *     for (var i = 0; i < tracesPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `tracesPage`: console.log(JSON.stringify(tracesPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       cloudTrace.projects.traces.list(request, handlePage);
    *     }
    *   };
    *
    *   cloudTrace.projects.traces.list(request, handlePage);
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
    * @alias cloudtrace.projects.traces.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.endTime End of the time interval (inclusive) during which the trace data was collected from the application.
    * @param {string=} params.filter An optional filter against labels for the request.  By default, searches use prefix matching. To specify exact match, prepend a plus symbol (`+`) to the search term. Multiple terms are ANDed. Syntax:  *   `root:NAME_PREFIX` or `NAME_PREFIX`: Return traces where any root     span starts with `NAME_PREFIX`. *   `+root:NAME` or `+NAME`: Return traces where any root span's name is     exactly `NAME`. *   `span:NAME_PREFIX`: Return traces where any span starts with     `NAME_PREFIX`. *   `+span:NAME`: Return traces where any span's name is exactly     `NAME`. *   `latency:DURATION`: Return traces whose overall latency is     greater or equal to than `DURATION`. Accepted units are nanoseconds     (`ns`), milliseconds (`ms`), and seconds (`s`). Default is `ms`. For     example, `latency:24ms` returns traces whose overall latency     is greater than or equal to 24 milliseconds. *   `label:LABEL_KEY`: Return all traces containing the specified     label key (exact match, case-sensitive) regardless of the key:value     pair's value (including empty values). *   `LABEL_KEY:VALUE_PREFIX`: Return all traces containing the specified     label key (exact match, case-sensitive) whose value starts with     `VALUE_PREFIX`. Both a key and a value must be specified. *   `+LABEL_KEY:VALUE`: Return all traces containing a key:value pair     exactly matching the specified text. Both a key and a value must be     specified. *   `method:VALUE`: Equivalent to `/http/method:VALUE`. *   `url:VALUE`: Equivalent to `/http/url:VALUE`.
    * @param {string=} params.orderBy Field used to sort the returned traces. Optional. Can be one of the following:  *   `trace_id` *   `name` (`name` field of root span in the trace) *   `duration` (difference between `end_time` and `start_time` fields of      the root span) *   `start` (`start_time` field of the root span)  Descending order can be specified by appending `desc` to the sort field (for example, `name desc`).  Only one sort field is permitted.
    * @param {integer=} params.pageSize Maximum number of traces to return. If not specified or <= 0, the implementation selects a reasonable value.  The implementation may return fewer traces than the requested page size. Optional.
    * @param {string=} params.pageToken Token identifying the page of results to return. If provided, use the value of the `next_page_token` field from a previous request. Optional.
    * @param {string} params.projectId ID of the Cloud project where the trace data is stored.
    * @param {string=} params.startTime Start of the time interval (inclusive) during which the trace data was collected from the application.
    * @param {string=} params.view Type of data returned for traces in the list. Optional. Default is `MINIMAL`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListTracesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTracesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListTracesResponse] = js.native
  def list(params: ParamsResourceProjectsTracesList): GaxiosPromise[SchemaListTracesResponse] = js.native
  def list(params: ParamsResourceProjectsTracesList, callback: BodyResponseCallback[SchemaListTracesResponse]): Unit = js.native
  def list(
    params: ParamsResourceProjectsTracesList,
    options: BodyResponseCallback[SchemaListTracesResponse],
    callback: BodyResponseCallback[SchemaListTracesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTracesList, options: MethodOptions): GaxiosPromise[SchemaListTracesResponse] = js.native
  def list(
    params: ParamsResourceProjectsTracesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTracesResponse]
  ): Unit = js.native
}
