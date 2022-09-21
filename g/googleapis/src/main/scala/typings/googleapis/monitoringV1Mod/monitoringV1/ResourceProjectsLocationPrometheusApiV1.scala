package typings.googleapis.monitoringV1Mod.monitoringV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/monitoring/v1", "monitoring_v1.Resource$Projects$Location$Prometheus$Api$V1")
@js.native
open class ResourceProjectsLocationPrometheusApiV1 protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var label: ResourceProjectsLocationPrometheusApiV1Label = js.native
  
  var metadata: ResourceProjectsLocationPrometheusApiV1Metadata = js.native
  
  def query(): GaxiosPromise[SchemaHttpBody] = js.native
  def query(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def query(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def query(params: ParamsResourceProjectsLocationPrometheusApiV1Query): GaxiosPromise[SchemaHttpBody] = js.native
  def query(
    params: ParamsResourceProjectsLocationPrometheusApiV1Query,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def query(
    params: ParamsResourceProjectsLocationPrometheusApiV1Query,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def query(params: ParamsResourceProjectsLocationPrometheusApiV1Query, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def query(
    params: ParamsResourceProjectsLocationPrometheusApiV1Query,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * Evaluate a PromQL query at a single point in time.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *       'https://www.googleapis.com/auth/monitoring.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.location.prometheus.api.v1.query({
    *     // Location of the resource information. Has to be "global" now.
    *     location: 'placeholder-value',
    *     // The project on which to execute the request. Data associcated with the project's workspace stored under the The format is: projects/PROJECT_ID_OR_NUMBER. Open source API but used as a request path prefix to distinguish different virtual Prometheus instances of Google Prometheus Engine.
    *     name: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "query": "my_query",
    *       //   "time": "my_time",
    *       //   "timeout": "my_timeout"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentType": "my_contentType",
    *   //   "data": "my_data",
    *   //   "extensions": []
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
  def query(params: ParamsResourceProjectsLocationPrometheusApiV1Query, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def query(
    params: ParamsResourceProjectsLocationPrometheusApiV1Query,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def query_range(): GaxiosPromise[SchemaHttpBody] = js.native
  def query_range(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def query_range(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def query_range(params: ParamsResourceProjectsLocationPrometheusApiV1QueryRange): GaxiosPromise[SchemaHttpBody] = js.native
  def query_range(
    params: ParamsResourceProjectsLocationPrometheusApiV1QueryRange,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def query_range(
    params: ParamsResourceProjectsLocationPrometheusApiV1QueryRange,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def query_range(params: ParamsResourceProjectsLocationPrometheusApiV1QueryRange, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def query_range(
    params: ParamsResourceProjectsLocationPrometheusApiV1QueryRange,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * Evaluate a PromQL query with start, end time range.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *       'https://www.googleapis.com/auth/monitoring.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.location.prometheus.api.v1.query_range({
    *     // Location of the resource information. Has to be "global" now.
    *     location: 'placeholder-value',
    *     // The project on which to execute the request. Data associcated with the project's workspace stored under the The format is: projects/PROJECT_ID_OR_NUMBER. Open source API but used as a request path prefix to distinguish different virtual Prometheus instances of Google Prometheus Engine.
    *     name: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "end": "my_end",
    *       //   "query": "my_query",
    *       //   "start": "my_start",
    *       //   "step": "my_step",
    *       //   "timeout": "my_timeout"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentType": "my_contentType",
    *   //   "data": "my_data",
    *   //   "extensions": []
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
  def query_range(params: ParamsResourceProjectsLocationPrometheusApiV1QueryRange, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def query_range(
    params: ParamsResourceProjectsLocationPrometheusApiV1QueryRange,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def series(): GaxiosPromise[SchemaHttpBody] = js.native
  def series(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def series(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def series(params: ParamsResourceProjectsLocationPrometheusApiV1Series): GaxiosPromise[SchemaHttpBody] = js.native
  def series(
    params: ParamsResourceProjectsLocationPrometheusApiV1Series,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def series(
    params: ParamsResourceProjectsLocationPrometheusApiV1Series,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def series(params: ParamsResourceProjectsLocationPrometheusApiV1Series, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def series(
    params: ParamsResourceProjectsLocationPrometheusApiV1Series,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * Lists metadata for metrics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *       'https://www.googleapis.com/auth/monitoring.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.location.prometheus.api.v1.series({
    *     // Location of the resource information. Has to be "global" for now.
    *     location: 'placeholder-value',
    *     // Required. The workspace on which to execute the request. It is not part of the open source API but used as a request path prefix to distinguish different virtual Prometheus instances of Google Prometheus Engine. The format is: projects/PROJECT_ID_OR_NUMBER.
    *     name: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "end": "my_end",
    *       //   "start": "my_start"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentType": "my_contentType",
    *   //   "data": "my_data",
    *   //   "extensions": []
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
  def series(params: ParamsResourceProjectsLocationPrometheusApiV1Series, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def series(
    params: ParamsResourceProjectsLocationPrometheusApiV1Series,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
