package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Timeseries")
@js.native
class ResourceProjectsTimeseries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * monitoring.projects.timeSeries.create
    * @desc Creates or adds data to one or more time series. The response is
    * empty if all time series in the request were written. If any time series
    * could not be written, a corresponding failure message is included in the
    * error response.
    * @example
    * * // PRE-REQUISITES:
    * // ---------------
    * // 1. If not already done, enable the Google Monitoring API and check the
    * quota for your project at
    * //
    * https://console.developers.google.com/apis/api/monitoring_component/quotas
    * // 2. This sample uses Application Default Credentials for Auth. If not
    * already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk/ and run 'gcloud beta auth
    * application-default login'
    * // 3. To install the client library and Application Default Credentials
    * library, run:
    * //    'npm install googleapis --save'
    * var google = require('googleapis');
    * var monitoring = google.monitoring('v3');
    *
    * google.auth.getApplicationDefault(function(err, authClient) {
    *   if (err) {
    *     console.log('Authentication failed because of ', err);
    *     return;
    *   }
    *   if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *   }
    *
    *   var request = {
    *     // TODO: Change placeholders below to appropriate parameter values
    * for the 'create' method:
    *
    *     // The project on which to execute the request. The format is
    * `"projects/{project_id_or_number}"`. name: "projects/{MY-PROJECT}",
    *     resource: {},
    *     // Auth client
    *     auth: authClient
    *   };
    *
    *   monitoring.projects.timeSeries.create(request, function(err, result) {
    *     if (err) {
    *       console.log(err);
    *     } else {
    *       console.log(result);
    *     }
    *   });
    * });
    * @alias monitoring.projects.timeSeries.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The project on which to execute the request. The format is "projects/{project_id_or_number}".
    * @param {().CreateTimeSeriesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaEmpty] = js.native
  def create(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def create(params: ParamsResourceProjectsTimeseriesCreate): GaxiosPromise[SchemaEmpty] = js.native
  def create(params: ParamsResourceProjectsTimeseriesCreate, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def create(
    params: ParamsResourceProjectsTimeseriesCreate,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsTimeseriesCreate, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def create(
    params: ParamsResourceProjectsTimeseriesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * monitoring.projects.timeSeries.list
    * @desc Lists time series that match a filter. This method does not require
    * a Stackdriver account.
    * @example
    * * // PRE-REQUISITES:
    * // ---------------
    * // 1. If not already done, enable the Google Monitoring API and check the
    * quota for your project at
    * //
    * https://console.developers.google.com/apis/api/monitoring_component/quotas
    * // 2. This sample uses Application Default Credentials for Auth. If not
    * already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk/ and run 'gcloud beta auth
    * application-default login'
    * // 3. To install the client library and Application Default Credentials
    * library, run:
    * //    'npm install googleapis --save'
    * var google = require('googleapis');
    * var monitoring = google.monitoring('v3');
    *
    * google.auth.getApplicationDefault(function(err, authClient) {
    *   if (err) {
    *     console.log('Authentication failed because of ', err);
    *     return;
    *   }
    *   if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *   }
    *
    *   var request = {
    *     // TODO: Change placeholders below to appropriate parameter values
    * for the 'list' method:
    *
    *     // The project on which to execute the request. The format is
    * "projects/{project_id_or_number}". name: "projects/{MY-PROJECT}",
    *     // Auth client
    *     auth: authClient
    *   };
    *
    *
    *   var recur = function(err, result) {
    *     if (err) {
    *       console.log(err);
    *     } else {
    *       console.log(result);
    *       if (result.nextPageToken) {
    *         request.pageToken = result.nextPageToken;
    *         monitoring.projects.timeSeries.list(request, recur);
    *       }
    *     }
    *   };
    *
    *   monitoring.projects.timeSeries.list(request, recur);
    * });
    * @alias monitoring.projects.timeSeries.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.aggregation.alignmentPeriod The alignment period for per-time series alignment. If present, alignmentPeriod must be at least 60 seconds. After per-time series alignment, each time series will contain data points only on the period boundaries. If perSeriesAligner is not specified or equals ALIGN_NONE, then this field is ignored. If perSeriesAligner is specified and does not equal ALIGN_NONE, then this field must be defined; otherwise an error is returned.
    * @param {string=} params.aggregation.crossSeriesReducer The approach to be used to combine time series. Not all reducer functions may be applied to all time series, depending on the metric type and the value type of the original time series. Reduction may change the metric type of value type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If crossSeriesReducer is specified, then perSeriesAligner must be specified and not equal ALIGN_NONE and alignmentPeriod must be specified; otherwise, an error is returned.
    * @param {string=} params.aggregation.groupByFields The set of fields to preserve when crossSeriesReducer is specified. The groupByFields determine how the time series are partitioned into subsets prior to applying the aggregation function. Each subset contains time series that have the same value for each of the grouping fields. Each individual time series is a member of exactly one subset. The crossSeriesReducer is applied to each subset of time series. It is not possible to reduce across different resource types, so this field implicitly contains resource.type. Fields not specified in groupByFields are aggregated away. If groupByFields is not specified and all the time series have the same resource type, then the time series are aggregated into a single output time series. If crossSeriesReducer is not defined, this field is ignored.
    * @param {string=} params.aggregation.perSeriesAligner The approach to be used to align individual time series. Not all alignment functions may be applied to all time series, depending on the metric type and value type of the original time series. Alignment may change the metric type or the value type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If crossSeriesReducer is specified, then perSeriesAligner must be specified and not equal ALIGN_NONE and alignmentPeriod must be specified; otherwise, an error is returned.
    * @param {string=} params.filter A monitoring filter that specifies which time series should be returned. The filter must specify a single metric type, and can additionally specify metric labels and other information. For example: metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND     metric.label.instance_name = "my-instance-name"
    * @param {string=} params.interval.endTime Required. The end of the time interval.
    * @param {string=} params.interval.startTime Optional. The beginning of the time interval. The default value for the start time is the end time. The start time must not be later than the end time.
    * @param {string} params.name The project on which to execute the request. The format is "projects/{project_id_or_number}".
    * @param {string=} params.orderBy Unsupported: must be left blank. The points in each time series are returned in reverse time order.
    * @param {integer=} params.pageSize A positive number that is the maximum number of results to return. If page_size is empty or more than 100,000 results, the effective page_size is 100,000 results. If view is set to FULL, this is the maximum number of Points returned. If view is set to HEADERS, this is the maximum number of TimeSeries returned.
    * @param {string=} params.pageToken If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return additional results from the previous method call.
    * @param {string=} params.view Specifies which information is returned about the time series.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListTimeSeriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTimeSeriesResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsTimeseriesList): GaxiosPromise[SchemaListTimeSeriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsTimeseriesList,
    callback: BodyResponseCallback[SchemaListTimeSeriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsTimeseriesList,
    options: BodyResponseCallback[SchemaListTimeSeriesResponse],
    callback: BodyResponseCallback[SchemaListTimeSeriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTimeseriesList, options: MethodOptions): GaxiosPromise[SchemaListTimeSeriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsTimeseriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTimeSeriesResponse]
  ): Unit = js.native
}

