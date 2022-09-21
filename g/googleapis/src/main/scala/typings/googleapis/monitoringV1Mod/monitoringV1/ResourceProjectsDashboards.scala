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

@JSImport("googleapis/build/src/apis/monitoring/v1", "monitoring_v1.Resource$Projects$Dashboards")
@js.native
open class ResourceProjectsDashboards protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaDashboard] = js.native
  def create(callback: BodyResponseCallback[SchemaDashboard]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDashboard] = js.native
  def create(params: ParamsResourceProjectsDashboardsCreate): GaxiosPromise[SchemaDashboard] = js.native
  def create(params: ParamsResourceProjectsDashboardsCreate, callback: BodyResponseCallback[SchemaDashboard]): Unit = js.native
  def create(
    params: ParamsResourceProjectsDashboardsCreate,
    options: BodyResponseCallback[Readable | SchemaDashboard],
    callback: BodyResponseCallback[Readable | SchemaDashboard]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsDashboardsCreate, options: MethodOptions): GaxiosPromise[SchemaDashboard] = js.native
  def create(
    params: ParamsResourceProjectsDashboardsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDashboard]
  ): Unit = js.native
  /**
    * Creates a new custom dashboard. For examples on how you can use this API to create dashboards, see Managing dashboards by API (https://cloud.google.com/monitoring/dashboards/api-dashboard). This method requires the monitoring.dashboards.create permission on the specified project. For more information about permissions, see Cloud Identity and Access Management (https://cloud.google.com/iam).
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
    *       'https://www.googleapis.com/auth/monitoring.write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.dashboards.create({
    *     // Required. The project on which to execute the request. The format is: projects/[PROJECT_ID_OR_NUMBER] The [PROJECT_ID_OR_NUMBER] must match the dashboard resource name.
    *     parent: 'projects/my-project',
    *     // If set, validate the request and preview the review, but do not actually save it.
    *     validateOnly: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "columnLayout": {},
    *       //   "dashboardFilters": [],
    *       //   "displayName": "my_displayName",
    *       //   "etag": "my_etag",
    *       //   "gridLayout": {},
    *       //   "labels": {},
    *       //   "mosaicLayout": {},
    *       //   "name": "my_name",
    *       //   "rowLayout": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "columnLayout": {},
    *   //   "dashboardFilters": [],
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "gridLayout": {},
    *   //   "labels": {},
    *   //   "mosaicLayout": {},
    *   //   "name": "my_name",
    *   //   "rowLayout": {}
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
  def create(params: ParamsResourceProjectsDashboardsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsDashboardsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsDashboardsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsDashboardsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsDashboardsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsDashboardsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDashboardsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an existing custom dashboard.This method requires the monitoring.dashboards.delete permission on the specified dashboard. For more information, see Cloud Identity and Access Management (https://cloud.google.com/iam).
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
    *       'https://www.googleapis.com/auth/monitoring.write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.dashboards.delete({
    *     // Required. The resource name of the Dashboard. The format is: projects/[PROJECT_ID_OR_NUMBER]/dashboards/[DASHBOARD_ID]
    *     name: 'projects/my-project/dashboards/my-dashboard',
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
  def delete(params: ParamsResourceProjectsDashboardsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsDashboardsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDashboard] = js.native
  def get(callback: BodyResponseCallback[SchemaDashboard]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDashboard] = js.native
  def get(params: ParamsResourceProjectsDashboardsGet): GaxiosPromise[SchemaDashboard] = js.native
  def get(params: ParamsResourceProjectsDashboardsGet, callback: BodyResponseCallback[SchemaDashboard]): Unit = js.native
  def get(
    params: ParamsResourceProjectsDashboardsGet,
    options: BodyResponseCallback[Readable | SchemaDashboard],
    callback: BodyResponseCallback[Readable | SchemaDashboard]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDashboardsGet, options: MethodOptions): GaxiosPromise[SchemaDashboard] = js.native
  def get(
    params: ParamsResourceProjectsDashboardsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDashboard]
  ): Unit = js.native
  /**
    * Fetches a specific dashboard.This method requires the monitoring.dashboards.get permission on the specified dashboard. For more information, see Cloud Identity and Access Management (https://cloud.google.com/iam).
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
    *   const res = await monitoring.projects.dashboards.get({
    *     // Required. The resource name of the Dashboard. The format is one of: dashboards/[DASHBOARD_ID] (for system dashboards) projects/[PROJECT_ID_OR_NUMBER]/dashboards/[DASHBOARD_ID] (for custom dashboards).
    *     name: 'projects/my-project/dashboards/my-dashboard',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "columnLayout": {},
    *   //   "dashboardFilters": [],
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "gridLayout": {},
    *   //   "labels": {},
    *   //   "mosaicLayout": {},
    *   //   "name": "my_name",
    *   //   "rowLayout": {}
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
  def get(params: ParamsResourceProjectsDashboardsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsDashboardsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDashboardsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDashboardsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDashboardsResponse] = js.native
  def list(params: ParamsResourceProjectsDashboardsList): GaxiosPromise[SchemaListDashboardsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDashboardsList,
    callback: BodyResponseCallback[SchemaListDashboardsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDashboardsList,
    options: BodyResponseCallback[Readable | SchemaListDashboardsResponse],
    callback: BodyResponseCallback[Readable | SchemaListDashboardsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDashboardsList, options: MethodOptions): GaxiosPromise[SchemaListDashboardsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDashboardsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDashboardsResponse]
  ): Unit = js.native
  /**
    * Lists the existing dashboards.This method requires the monitoring.dashboards.list permission on the specified project. For more information, see Cloud Identity and Access Management (https://cloud.google.com/iam).
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
    *   const res = await monitoring.projects.dashboards.list({
    *     // A positive number that is the maximum number of results to return. If unspecified, a default of 1000 is used.
    *     pageSize: 'placeholder-value',
    *     // If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return additional results from the previous method call.
    *     pageToken: 'placeholder-value',
    *     // Required. The scope of the dashboards to list. The format is: projects/[PROJECT_ID_OR_NUMBER]
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dashboards": [],
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
  def list(params: ParamsResourceProjectsDashboardsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsDashboardsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaDashboard] = js.native
  def patch(callback: BodyResponseCallback[SchemaDashboard]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDashboard] = js.native
  def patch(params: ParamsResourceProjectsDashboardsPatch): GaxiosPromise[SchemaDashboard] = js.native
  def patch(params: ParamsResourceProjectsDashboardsPatch, callback: BodyResponseCallback[SchemaDashboard]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsDashboardsPatch,
    options: BodyResponseCallback[Readable | SchemaDashboard],
    callback: BodyResponseCallback[Readable | SchemaDashboard]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsDashboardsPatch, options: MethodOptions): GaxiosPromise[SchemaDashboard] = js.native
  def patch(
    params: ParamsResourceProjectsDashboardsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDashboard]
  ): Unit = js.native
  /**
    * Replaces an existing custom dashboard with a new definition.This method requires the monitoring.dashboards.update permission on the specified dashboard. For more information, see Cloud Identity and Access Management (https://cloud.google.com/iam).
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
    *       'https://www.googleapis.com/auth/monitoring.write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.dashboards.patch({
    *     // Immutable. The resource name of the dashboard.
    *     name: 'projects/my-project/dashboards/my-dashboard',
    *     // If set, validate the request and preview the review, but do not actually save it.
    *     validateOnly: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "columnLayout": {},
    *       //   "dashboardFilters": [],
    *       //   "displayName": "my_displayName",
    *       //   "etag": "my_etag",
    *       //   "gridLayout": {},
    *       //   "labels": {},
    *       //   "mosaicLayout": {},
    *       //   "name": "my_name",
    *       //   "rowLayout": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "columnLayout": {},
    *   //   "dashboardFilters": [],
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "gridLayout": {},
    *   //   "labels": {},
    *   //   "mosaicLayout": {},
    *   //   "name": "my_name",
    *   //   "rowLayout": {}
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
  def patch(params: ParamsResourceProjectsDashboardsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsDashboardsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
