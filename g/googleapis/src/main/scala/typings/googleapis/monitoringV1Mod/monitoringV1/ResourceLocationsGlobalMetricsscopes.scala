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

@JSImport("googleapis/build/src/apis/monitoring/v1", "monitoring_v1.Resource$Locations$Global$Metricsscopes")
@js.native
open class ResourceLocationsGlobalMetricsscopes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaMetricsScope] = js.native
  def get(callback: BodyResponseCallback[SchemaMetricsScope]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMetricsScope] = js.native
  def get(params: ParamsResourceLocationsGlobalMetricsscopesGet): GaxiosPromise[SchemaMetricsScope] = js.native
  def get(
    params: ParamsResourceLocationsGlobalMetricsscopesGet,
    callback: BodyResponseCallback[SchemaMetricsScope]
  ): Unit = js.native
  def get(
    params: ParamsResourceLocationsGlobalMetricsscopesGet,
    options: BodyResponseCallback[Readable | SchemaMetricsScope],
    callback: BodyResponseCallback[Readable | SchemaMetricsScope]
  ): Unit = js.native
  def get(params: ParamsResourceLocationsGlobalMetricsscopesGet, options: MethodOptions): GaxiosPromise[SchemaMetricsScope] = js.native
  def get(
    params: ParamsResourceLocationsGlobalMetricsscopesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMetricsScope]
  ): Unit = js.native
  /**
    * Returns a specific Metrics Scope, including the list of projects monitored by the specified Metrics Scope.
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
    *   const res = await monitoring.locations.global.metricsScopes.get({
    *     // Required. The resource name of the Metrics Scope. Example: locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER\}
    *     name: 'locations/global/metricsScopes/my-metricsScope',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "monitoredProjects": [],
    *   //   "name": "my_name",
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
  def get(params: ParamsResourceLocationsGlobalMetricsscopesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceLocationsGlobalMetricsscopesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listMetricsScopesByMonitoredProject(): GaxiosPromise[SchemaListMetricsScopesByMonitoredProjectResponse] = js.native
  def listMetricsScopesByMonitoredProject(callback: BodyResponseCallback[SchemaListMetricsScopesByMonitoredProjectResponse]): Unit = js.native
  def listMetricsScopesByMonitoredProject(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListMetricsScopesByMonitoredProjectResponse] = js.native
  def listMetricsScopesByMonitoredProject(params: ParamsResourceLocationsGlobalMetricsscopesListmetricsscopesbymonitoredproject): GaxiosPromise[SchemaListMetricsScopesByMonitoredProjectResponse] = js.native
  def listMetricsScopesByMonitoredProject(
    params: ParamsResourceLocationsGlobalMetricsscopesListmetricsscopesbymonitoredproject,
    callback: BodyResponseCallback[SchemaListMetricsScopesByMonitoredProjectResponse]
  ): Unit = js.native
  def listMetricsScopesByMonitoredProject(
    params: ParamsResourceLocationsGlobalMetricsscopesListmetricsscopesbymonitoredproject,
    options: BodyResponseCallback[Readable | SchemaListMetricsScopesByMonitoredProjectResponse],
    callback: BodyResponseCallback[Readable | SchemaListMetricsScopesByMonitoredProjectResponse]
  ): Unit = js.native
  def listMetricsScopesByMonitoredProject(
    params: ParamsResourceLocationsGlobalMetricsscopesListmetricsscopesbymonitoredproject,
    options: MethodOptions
  ): GaxiosPromise[SchemaListMetricsScopesByMonitoredProjectResponse] = js.native
  def listMetricsScopesByMonitoredProject(
    params: ParamsResourceLocationsGlobalMetricsscopesListmetricsscopesbymonitoredproject,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMetricsScopesByMonitoredProjectResponse]
  ): Unit = js.native
  /**
    * Returns a list of every Metrics Scope that a specific MonitoredProject has been added to. The metrics scope representing the specified monitored project will always be the first entry in the response.
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
    *   const res =
    *     await monitoring.locations.global.metricsScopes.listMetricsScopesByMonitoredProject(
    *       {
    *         // Required. The resource name of the Monitored Project being requested. Example: projects/{MONITORED_PROJECT_ID_OR_NUMBER\}
    *         monitoredResourceContainer: 'placeholder-value',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "metricsScopes": []
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
  def listMetricsScopesByMonitoredProject(
    params: ParamsResourceLocationsGlobalMetricsscopesListmetricsscopesbymonitoredproject,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def listMetricsScopesByMonitoredProject(
    params: ParamsResourceLocationsGlobalMetricsscopesListmetricsscopesbymonitoredproject,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var projects: ResourceLocationsGlobalMetricsscopesProjects = js.native
}
