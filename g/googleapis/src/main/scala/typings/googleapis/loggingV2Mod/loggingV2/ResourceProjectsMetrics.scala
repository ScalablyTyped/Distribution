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

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Projects$Metrics")
@js.native
open class ResourceProjectsMetrics protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaLogMetric] = js.native
  def create(callback: BodyResponseCallback[SchemaLogMetric]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLogMetric] = js.native
  def create(params: ParamsResourceProjectsMetricsCreate): GaxiosPromise[SchemaLogMetric] = js.native
  def create(params: ParamsResourceProjectsMetricsCreate, callback: BodyResponseCallback[SchemaLogMetric]): Unit = js.native
  def create(
    params: ParamsResourceProjectsMetricsCreate,
    options: BodyResponseCallback[Readable | SchemaLogMetric],
    callback: BodyResponseCallback[Readable | SchemaLogMetric]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsMetricsCreate, options: MethodOptions): GaxiosPromise[SchemaLogMetric] = js.native
  def create(
    params: ParamsResourceProjectsMetricsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogMetric]
  ): Unit = js.native
  /**
    * Creates a logs-based metric.
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
    *   const res = await logging.projects.metrics.create({
    *     // Required. The resource name of the project in which to create the metric: "projects/[PROJECT_ID]" The new metric must be provided in the request.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bucketName": "my_bucketName",
    *       //   "bucketOptions": {},
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "disabled": false,
    *       //   "filter": "my_filter",
    *       //   "labelExtractors": {},
    *       //   "metricDescriptor": {},
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime",
    *       //   "valueExtractor": "my_valueExtractor",
    *       //   "version": "my_version"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bucketName": "my_bucketName",
    *   //   "bucketOptions": {},
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "disabled": false,
    *   //   "filter": "my_filter",
    *   //   "labelExtractors": {},
    *   //   "metricDescriptor": {},
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime",
    *   //   "valueExtractor": "my_valueExtractor",
    *   //   "version": "my_version"
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
  def create(params: ParamsResourceProjectsMetricsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsMetricsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsMetricsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsMetricsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsMetricsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsMetricsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsMetricsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a logs-based metric.
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
    *   const res = await logging.projects.metrics.delete({
    *     // Required. The resource name of the metric to delete: "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
    *     metricName: 'projects/my-project/metrics/my-metric',
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
  def delete(params: ParamsResourceProjectsMetricsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsMetricsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaLogMetric] = js.native
  def get(callback: BodyResponseCallback[SchemaLogMetric]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLogMetric] = js.native
  def get(params: ParamsResourceProjectsMetricsGet): GaxiosPromise[SchemaLogMetric] = js.native
  def get(params: ParamsResourceProjectsMetricsGet, callback: BodyResponseCallback[SchemaLogMetric]): Unit = js.native
  def get(
    params: ParamsResourceProjectsMetricsGet,
    options: BodyResponseCallback[Readable | SchemaLogMetric],
    callback: BodyResponseCallback[Readable | SchemaLogMetric]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsMetricsGet, options: MethodOptions): GaxiosPromise[SchemaLogMetric] = js.native
  def get(
    params: ParamsResourceProjectsMetricsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogMetric]
  ): Unit = js.native
  /**
    * Gets a logs-based metric.
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
    *   const res = await logging.projects.metrics.get({
    *     // Required. The resource name of the desired metric: "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
    *     metricName: 'projects/my-project/metrics/my-metric',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bucketName": "my_bucketName",
    *   //   "bucketOptions": {},
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "disabled": false,
    *   //   "filter": "my_filter",
    *   //   "labelExtractors": {},
    *   //   "metricDescriptor": {},
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime",
    *   //   "valueExtractor": "my_valueExtractor",
    *   //   "version": "my_version"
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
  def get(params: ParamsResourceProjectsMetricsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsMetricsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListLogMetricsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLogMetricsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListLogMetricsResponse] = js.native
  def list(params: ParamsResourceProjectsMetricsList): GaxiosPromise[SchemaListLogMetricsResponse] = js.native
  def list(
    params: ParamsResourceProjectsMetricsList,
    callback: BodyResponseCallback[SchemaListLogMetricsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsMetricsList,
    options: BodyResponseCallback[Readable | SchemaListLogMetricsResponse],
    callback: BodyResponseCallback[Readable | SchemaListLogMetricsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsMetricsList, options: MethodOptions): GaxiosPromise[SchemaListLogMetricsResponse] = js.native
  def list(
    params: ParamsResourceProjectsMetricsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLogMetricsResponse]
  ): Unit = js.native
  /**
    * Lists logs-based metrics.
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
    *   const res = await logging.projects.metrics.list({
    *     // Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
    *     pageSize: 'placeholder-value',
    *     // Optional. If present, then retrieve the next batch of results from the preceding call to this method. pageToken must be the value of nextPageToken from the previous response. The values of other method parameters should be identical to those in the previous call.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the project containing the metrics: "projects/[PROJECT_ID]"
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "metrics": [],
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
  def list(params: ParamsResourceProjectsMetricsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsMetricsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaLogMetric] = js.native
  def update(callback: BodyResponseCallback[SchemaLogMetric]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLogMetric] = js.native
  def update(params: ParamsResourceProjectsMetricsUpdate): GaxiosPromise[SchemaLogMetric] = js.native
  def update(params: ParamsResourceProjectsMetricsUpdate, callback: BodyResponseCallback[SchemaLogMetric]): Unit = js.native
  def update(
    params: ParamsResourceProjectsMetricsUpdate,
    options: BodyResponseCallback[Readable | SchemaLogMetric],
    callback: BodyResponseCallback[Readable | SchemaLogMetric]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsMetricsUpdate, options: MethodOptions): GaxiosPromise[SchemaLogMetric] = js.native
  def update(
    params: ParamsResourceProjectsMetricsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogMetric]
  ): Unit = js.native
  /**
    * Creates or updates a logs-based metric.
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
    *   const res = await logging.projects.metrics.update({
    *     // Required. The resource name of the metric to update: "projects/[PROJECT_ID]/metrics/[METRIC_ID]" The updated metric must be provided in the request and it's name field must be the same as [METRIC_ID] If the metric does not exist in [PROJECT_ID], then a new metric is created.
    *     metricName: 'projects/my-project/metrics/my-metric',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bucketName": "my_bucketName",
    *       //   "bucketOptions": {},
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "disabled": false,
    *       //   "filter": "my_filter",
    *       //   "labelExtractors": {},
    *       //   "metricDescriptor": {},
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime",
    *       //   "valueExtractor": "my_valueExtractor",
    *       //   "version": "my_version"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bucketName": "my_bucketName",
    *   //   "bucketOptions": {},
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "disabled": false,
    *   //   "filter": "my_filter",
    *   //   "labelExtractors": {},
    *   //   "metricDescriptor": {},
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime",
    *   //   "valueExtractor": "my_valueExtractor",
    *   //   "version": "my_version"
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
  def update(params: ParamsResourceProjectsMetricsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceProjectsMetricsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
