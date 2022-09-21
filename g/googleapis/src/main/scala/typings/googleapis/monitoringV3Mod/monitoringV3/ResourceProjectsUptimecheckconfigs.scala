package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Uptimecheckconfigs")
@js.native
open class ResourceProjectsUptimecheckconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaUptimeCheckConfig]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def create(params: ParamsResourceProjectsUptimecheckconfigsCreate): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def create(
    params: ParamsResourceProjectsUptimecheckconfigsCreate,
    callback: BodyResponseCallback[SchemaUptimeCheckConfig]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsUptimecheckconfigsCreate,
    options: BodyResponseCallback[Readable | SchemaUptimeCheckConfig],
    callback: BodyResponseCallback[Readable | SchemaUptimeCheckConfig]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsUptimecheckconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def create(
    params: ParamsResourceProjectsUptimecheckconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUptimeCheckConfig]
  ): Unit = js.native
  /**
    * Creates a new Uptime check configuration.
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
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.uptimeCheckConfigs.create({
    *     // Required. The project (https://cloud.google.com/monitoring/api/v3#project_name) in which to create the Uptime check. The format is: projects/[PROJECT_ID_OR_NUMBER]
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "checkerType": "my_checkerType",
    *       //   "contentMatchers": [],
    *       //   "displayName": "my_displayName",
    *       //   "httpCheck": {},
    *       //   "internalCheckers": [],
    *       //   "isInternal": false,
    *       //   "monitoredResource": {},
    *       //   "name": "my_name",
    *       //   "period": "my_period",
    *       //   "resourceGroup": {},
    *       //   "selectedRegions": [],
    *       //   "tcpCheck": {},
    *       //   "timeout": "my_timeout",
    *       //   "userLabels": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "checkerType": "my_checkerType",
    *   //   "contentMatchers": [],
    *   //   "displayName": "my_displayName",
    *   //   "httpCheck": {},
    *   //   "internalCheckers": [],
    *   //   "isInternal": false,
    *   //   "monitoredResource": {},
    *   //   "name": "my_name",
    *   //   "period": "my_period",
    *   //   "resourceGroup": {},
    *   //   "selectedRegions": [],
    *   //   "tcpCheck": {},
    *   //   "timeout": "my_timeout",
    *   //   "userLabels": {}
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
  def create(params: ParamsResourceProjectsUptimecheckconfigsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsUptimecheckconfigsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsUptimecheckconfigsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsUptimecheckconfigsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsUptimecheckconfigsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsUptimecheckconfigsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsUptimecheckconfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an Uptime check configuration. Note that this method will fail if the Uptime check configuration is referenced by an alert policy or other dependent configs that would be rendered invalid by the deletion.
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
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.uptimeCheckConfigs.delete({
    *     // Required. The Uptime check configuration to delete. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID]
    *     name: 'projects/my-project/uptimeCheckConfigs/my-uptimeCheckConfig',
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
  def delete(params: ParamsResourceProjectsUptimecheckconfigsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsUptimecheckconfigsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaUptimeCheckConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def get(params: ParamsResourceProjectsUptimecheckconfigsGet): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def get(
    params: ParamsResourceProjectsUptimecheckconfigsGet,
    callback: BodyResponseCallback[SchemaUptimeCheckConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsUptimecheckconfigsGet,
    options: BodyResponseCallback[Readable | SchemaUptimeCheckConfig],
    callback: BodyResponseCallback[Readable | SchemaUptimeCheckConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsUptimecheckconfigsGet, options: MethodOptions): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def get(
    params: ParamsResourceProjectsUptimecheckconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUptimeCheckConfig]
  ): Unit = js.native
  /**
    * Gets a single Uptime check configuration.
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
    * const monitoring = google.monitoring('v3');
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
    *   const res = await monitoring.projects.uptimeCheckConfigs.get({
    *     // Required. The Uptime check configuration to retrieve. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID]
    *     name: 'projects/my-project/uptimeCheckConfigs/my-uptimeCheckConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "checkerType": "my_checkerType",
    *   //   "contentMatchers": [],
    *   //   "displayName": "my_displayName",
    *   //   "httpCheck": {},
    *   //   "internalCheckers": [],
    *   //   "isInternal": false,
    *   //   "monitoredResource": {},
    *   //   "name": "my_name",
    *   //   "period": "my_period",
    *   //   "resourceGroup": {},
    *   //   "selectedRegions": [],
    *   //   "tcpCheck": {},
    *   //   "timeout": "my_timeout",
    *   //   "userLabels": {}
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
  def get(params: ParamsResourceProjectsUptimecheckconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsUptimecheckconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListUptimeCheckConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUptimeCheckConfigsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListUptimeCheckConfigsResponse] = js.native
  def list(params: ParamsResourceProjectsUptimecheckconfigsList): GaxiosPromise[SchemaListUptimeCheckConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsUptimecheckconfigsList,
    callback: BodyResponseCallback[SchemaListUptimeCheckConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsUptimecheckconfigsList,
    options: BodyResponseCallback[Readable | SchemaListUptimeCheckConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaListUptimeCheckConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsUptimecheckconfigsList, options: MethodOptions): GaxiosPromise[SchemaListUptimeCheckConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsUptimecheckconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUptimeCheckConfigsResponse]
  ): Unit = js.native
  /**
    * Lists the existing valid Uptime check configurations for the project (leaving out any invalid configurations).
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
    * const monitoring = google.monitoring('v3');
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
    *   const res = await monitoring.projects.uptimeCheckConfigs.list({
    *     // The maximum number of results to return in a single response. The server may further constrain the maximum number of results returned in a single page. If the page_size is <=0, the server will decide the number of results to be returned.
    *     pageSize: 'placeholder-value',
    *     // If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return more results from the previous method call.
    *     pageToken: 'placeholder-value',
    *     // Required. The project (https://cloud.google.com/monitoring/api/v3#project_name) whose Uptime check configurations are listed. The format is: projects/[PROJECT_ID_OR_NUMBER]
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "totalSize": 0,
    *   //   "uptimeCheckConfigs": []
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
  def list(params: ParamsResourceProjectsUptimecheckconfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsUptimecheckconfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaUptimeCheckConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def patch(params: ParamsResourceProjectsUptimecheckconfigsPatch): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def patch(
    params: ParamsResourceProjectsUptimecheckconfigsPatch,
    callback: BodyResponseCallback[SchemaUptimeCheckConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsUptimecheckconfigsPatch,
    options: BodyResponseCallback[Readable | SchemaUptimeCheckConfig],
    callback: BodyResponseCallback[Readable | SchemaUptimeCheckConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsUptimecheckconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaUptimeCheckConfig] = js.native
  def patch(
    params: ParamsResourceProjectsUptimecheckconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUptimeCheckConfig]
  ): Unit = js.native
  /**
    * Updates an Uptime check configuration. You can either replace the entire configuration with a new one or replace only certain fields in the current configuration by specifying the fields to be updated via updateMask. Returns the updated configuration.
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
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.uptimeCheckConfigs.patch({
    *     // A unique resource name for this Uptime check configuration. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is the Workspace host project associated with the Uptime check.This field should be omitted when creating the Uptime check configuration; on create, the resource name is assigned by the server and included in the response.
    *     name: 'projects/my-project/uptimeCheckConfigs/my-uptimeCheckConfig',
    *     // Optional. If present, only the listed fields in the current Uptime check configuration are updated with values from the new configuration. If this field is empty, then the current configuration is completely replaced with the new configuration.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "checkerType": "my_checkerType",
    *       //   "contentMatchers": [],
    *       //   "displayName": "my_displayName",
    *       //   "httpCheck": {},
    *       //   "internalCheckers": [],
    *       //   "isInternal": false,
    *       //   "monitoredResource": {},
    *       //   "name": "my_name",
    *       //   "period": "my_period",
    *       //   "resourceGroup": {},
    *       //   "selectedRegions": [],
    *       //   "tcpCheck": {},
    *       //   "timeout": "my_timeout",
    *       //   "userLabels": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "checkerType": "my_checkerType",
    *   //   "contentMatchers": [],
    *   //   "displayName": "my_displayName",
    *   //   "httpCheck": {},
    *   //   "internalCheckers": [],
    *   //   "isInternal": false,
    *   //   "monitoredResource": {},
    *   //   "name": "my_name",
    *   //   "period": "my_period",
    *   //   "resourceGroup": {},
    *   //   "selectedRegions": [],
    *   //   "tcpCheck": {},
    *   //   "timeout": "my_timeout",
    *   //   "userLabels": {}
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
  def patch(params: ParamsResourceProjectsUptimecheckconfigsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsUptimecheckconfigsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
