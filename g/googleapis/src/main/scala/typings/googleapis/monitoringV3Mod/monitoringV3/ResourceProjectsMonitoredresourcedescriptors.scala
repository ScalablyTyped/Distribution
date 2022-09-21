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

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Monitoredresourcedescriptors")
@js.native
open class ResourceProjectsMonitoredresourcedescriptors protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaMonitoredResourceDescriptor] = js.native
  def get(callback: BodyResponseCallback[SchemaMonitoredResourceDescriptor]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMonitoredResourceDescriptor] = js.native
  def get(params: ParamsResourceProjectsMonitoredresourcedescriptorsGet): GaxiosPromise[SchemaMonitoredResourceDescriptor] = js.native
  def get(
    params: ParamsResourceProjectsMonitoredresourcedescriptorsGet,
    callback: BodyResponseCallback[SchemaMonitoredResourceDescriptor]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsMonitoredresourcedescriptorsGet,
    options: BodyResponseCallback[Readable | SchemaMonitoredResourceDescriptor],
    callback: BodyResponseCallback[Readable | SchemaMonitoredResourceDescriptor]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsMonitoredresourcedescriptorsGet, options: MethodOptions): GaxiosPromise[SchemaMonitoredResourceDescriptor] = js.native
  def get(
    params: ParamsResourceProjectsMonitoredresourcedescriptorsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMonitoredResourceDescriptor]
  ): Unit = js.native
  /**
    * Gets a single monitored resource descriptor.
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
    *       'https://www.googleapis.com/auth/monitoring.write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.monitoredResourceDescriptors.get({
    *     // Required. The monitored resource descriptor to get. The format is: projects/[PROJECT_ID_OR_NUMBER]/monitoredResourceDescriptors/[RESOURCE_TYPE] The [RESOURCE_TYPE] is a predefined type, such as cloudsql_database.
    *     name: 'projects/my-project/monitoredResourceDescriptors/.*',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "labels": [],
    *   //   "launchStage": "my_launchStage",
    *   //   "name": "my_name",
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
  def get(params: ParamsResourceProjectsMonitoredresourcedescriptorsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsMonitoredresourcedescriptorsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListMonitoredResourceDescriptorsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMonitoredResourceDescriptorsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListMonitoredResourceDescriptorsResponse] = js.native
  def list(params: ParamsResourceProjectsMonitoredresourcedescriptorsList): GaxiosPromise[SchemaListMonitoredResourceDescriptorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsMonitoredresourcedescriptorsList,
    callback: BodyResponseCallback[SchemaListMonitoredResourceDescriptorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsMonitoredresourcedescriptorsList,
    options: BodyResponseCallback[Readable | SchemaListMonitoredResourceDescriptorsResponse],
    callback: BodyResponseCallback[Readable | SchemaListMonitoredResourceDescriptorsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsMonitoredresourcedescriptorsList, options: MethodOptions): GaxiosPromise[SchemaListMonitoredResourceDescriptorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsMonitoredresourcedescriptorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMonitoredResourceDescriptorsResponse]
  ): Unit = js.native
  /**
    * Lists monitored resource descriptors that match a filter.
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
    *       'https://www.googleapis.com/auth/monitoring.write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.monitoredResourceDescriptors.list({
    *     // An optional filter (https://cloud.google.com/monitoring/api/v3/filters) describing the descriptors to be returned. The filter can reference the descriptor's type and labels. For example, the following filter returns only Google Compute Engine descriptors that have an id label: resource.type = starts_with("gce_") AND resource.label:id
    *     filter: 'placeholder-value',
    *     // Required. The project (https://cloud.google.com/monitoring/api/v3#project_name) on which to execute the request. The format is: projects/[PROJECT_ID_OR_NUMBER]
    *     name: 'projects/my-project',
    *     // A positive number that is the maximum number of results to return.
    *     pageSize: 'placeholder-value',
    *     // If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return additional results from the previous method call.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "resourceDescriptors": []
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
  def list(params: ParamsResourceProjectsMonitoredresourcedescriptorsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsMonitoredresourcedescriptorsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
