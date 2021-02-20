package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/logging/v2beta1", "logging_v2beta1.Resource$Projects$Metrics")
@js.native
class ResourceProjectsMetrics protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * logging.projects.metrics.create
    * @desc Creates a logs-based metric.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Stackdriver Logging API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/logging
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
    * var logging = google.logging('v2beta1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The resource name of the project in which to create the metric:
    *     // "projects/[PROJECT_ID]"
    *     // The new metric must be provided in the request.
    *     parent: 'projects/my-project',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   logging.projects.metrics.create(request, function(err, response) {
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
    * @alias logging.projects.metrics.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The resource name of the project in which to create the metric: "projects/[PROJECT_ID]" The new metric must be provided in the request.
    * @param {().LogMetric} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaLogMetric] = js.native
  def create(callback: BodyResponseCallback[SchemaLogMetric]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLogMetric] = js.native
  def create(params: ParamsResourceProjectsMetricsCreate): GaxiosPromise[SchemaLogMetric] = js.native
  def create(params: ParamsResourceProjectsMetricsCreate, callback: BodyResponseCallback[SchemaLogMetric]): Unit = js.native
  def create(
    params: ParamsResourceProjectsMetricsCreate,
    options: BodyResponseCallback[SchemaLogMetric],
    callback: BodyResponseCallback[SchemaLogMetric]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsMetricsCreate, options: MethodOptions): GaxiosPromise[SchemaLogMetric] = js.native
  def create(
    params: ParamsResourceProjectsMetricsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogMetric]
  ): Unit = js.native
  
  /**
    * logging.projects.metrics.delete
    * @desc Deletes a logs-based metric.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Stackdriver Logging API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/logging
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
    * var logging = google.logging('v2beta1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The resource name of the metric to delete:
    *     // "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
    *     metricName: 'projects/my-project/metrics/my-metric',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   logging.projects.metrics.delete(request, function(err) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
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
    * @alias logging.projects.metrics.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.metricName The resource name of the metric to delete: "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsMetricsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsMetricsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsMetricsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsMetricsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsMetricsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * logging.projects.metrics.get
    * @desc Gets a logs-based metric.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Stackdriver Logging API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/logging
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
    * var logging = google.logging('v2beta1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The resource name of the desired metric:
    *     // "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
    *     metricName: 'projects/my-project/metrics/my-metric',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   logging.projects.metrics.get(request, function(err, response) {
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
    * @alias logging.projects.metrics.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.metricName The resource name of the desired metric: "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaLogMetric] = js.native
  def get(callback: BodyResponseCallback[SchemaLogMetric]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLogMetric] = js.native
  def get(params: ParamsResourceProjectsMetricsGet): GaxiosPromise[SchemaLogMetric] = js.native
  def get(params: ParamsResourceProjectsMetricsGet, callback: BodyResponseCallback[SchemaLogMetric]): Unit = js.native
  def get(
    params: ParamsResourceProjectsMetricsGet,
    options: BodyResponseCallback[SchemaLogMetric],
    callback: BodyResponseCallback[SchemaLogMetric]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsMetricsGet, options: MethodOptions): GaxiosPromise[SchemaLogMetric] = js.native
  def get(
    params: ParamsResourceProjectsMetricsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogMetric]
  ): Unit = js.native
  
  /**
    * logging.projects.metrics.list
    * @desc Lists logs-based metrics.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Stackdriver Logging API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/logging
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
    * var logging = google.logging('v2beta1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Required. The name of the project containing the metrics:
    *     // "projects/[PROJECT_ID]"
    *     parent: 'projects/my-project',  // TODO: Update placeholder value.
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
    *     var metricsPage = response['metrics'];
    *     if (!metricsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < metricsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `metricsPage`: console.log(JSON.stringify(metricsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       logging.projects.metrics.list(request, handlePage);
    *     }
    *   };
    *
    *   logging.projects.metrics.list(request, handlePage);
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
    * @alias logging.projects.metrics.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
    * @param {string=} params.pageToken Optional. If present, then retrieve the next batch of results from the preceding call to this method. pageToken must be the value of nextPageToken from the previous response. The values of other method parameters should be identical to those in the previous call.
    * @param {string} params.parent Required. The name of the project containing the metrics: "projects/[PROJECT_ID]"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListLogMetricsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLogMetricsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListLogMetricsResponse] = js.native
  def list(params: ParamsResourceProjectsMetricsList): GaxiosPromise[SchemaListLogMetricsResponse] = js.native
  def list(
    params: ParamsResourceProjectsMetricsList,
    callback: BodyResponseCallback[SchemaListLogMetricsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsMetricsList,
    options: BodyResponseCallback[SchemaListLogMetricsResponse],
    callback: BodyResponseCallback[SchemaListLogMetricsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsMetricsList, options: MethodOptions): GaxiosPromise[SchemaListLogMetricsResponse] = js.native
  def list(
    params: ParamsResourceProjectsMetricsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLogMetricsResponse]
  ): Unit = js.native
  
  /**
    * logging.projects.metrics.update
    * @desc Creates or updates a logs-based metric.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Stackdriver Logging API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/logging
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
    * var logging = google.logging('v2beta1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The resource name of the metric to update:
    *     // "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
    *     // The updated metric must be provided in the request and it's name
    * field must be the same as
    *     // [METRIC_ID] If the metric does not exist in [PROJECT_ID], then a
    * new metric is created. metricName:
    * 'projects/my-project/metrics/my-metric',  // TODO: Update placeholder
    * value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. All existing
    * properties
    *       // will be replaced.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   logging.projects.metrics.update(request, function(err, response) {
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
    * @alias logging.projects.metrics.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.metricName The resource name of the metric to update: "projects/[PROJECT_ID]/metrics/[METRIC_ID]" The updated metric must be provided in the request and it's name field must be the same as [METRIC_ID] If the metric does not exist in [PROJECT_ID], then a new metric is created.
    * @param {().LogMetric} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaLogMetric] = js.native
  def update(callback: BodyResponseCallback[SchemaLogMetric]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLogMetric] = js.native
  def update(params: ParamsResourceProjectsMetricsUpdate): GaxiosPromise[SchemaLogMetric] = js.native
  def update(params: ParamsResourceProjectsMetricsUpdate, callback: BodyResponseCallback[SchemaLogMetric]): Unit = js.native
  def update(
    params: ParamsResourceProjectsMetricsUpdate,
    options: BodyResponseCallback[SchemaLogMetric],
    callback: BodyResponseCallback[SchemaLogMetric]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsMetricsUpdate, options: MethodOptions): GaxiosPromise[SchemaLogMetric] = js.native
  def update(
    params: ParamsResourceProjectsMetricsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogMetric]
  ): Unit = js.native
}
