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

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Metricdescriptors")
@js.native
open class ResourceProjectsMetricdescriptors protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaMetricDescriptor] = js.native
  def create(callback: BodyResponseCallback[SchemaMetricDescriptor]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMetricDescriptor] = js.native
  def create(params: ParamsResourceProjectsMetricdescriptorsCreate): GaxiosPromise[SchemaMetricDescriptor] = js.native
  def create(
    params: ParamsResourceProjectsMetricdescriptorsCreate,
    callback: BodyResponseCallback[SchemaMetricDescriptor]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsMetricdescriptorsCreate,
    options: BodyResponseCallback[Readable | SchemaMetricDescriptor],
    callback: BodyResponseCallback[Readable | SchemaMetricDescriptor]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsMetricdescriptorsCreate, options: MethodOptions): GaxiosPromise[SchemaMetricDescriptor] = js.native
  def create(
    params: ParamsResourceProjectsMetricdescriptorsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMetricDescriptor]
  ): Unit = js.native
  /**
    * Creates a new metric descriptor. The creation is executed asynchronously. User-created metric descriptors define custom metrics (https://cloud.google.com/monitoring/custom-metrics). The metric descriptor is updated if it already exists, except that metric labels are never removed.
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
    *       'https://www.googleapis.com/auth/monitoring.write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.metricDescriptors.create({
    *     // Required. The project (https://cloud.google.com/monitoring/api/v3#project_name) on which to execute the request. The format is: 4 projects/PROJECT_ID_OR_NUMBER
    *     name: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "labels": [],
    *       //   "launchStage": "my_launchStage",
    *       //   "metadata": {},
    *       //   "metricKind": "my_metricKind",
    *       //   "monitoredResourceTypes": [],
    *       //   "name": "my_name",
    *       //   "type": "my_type",
    *       //   "unit": "my_unit",
    *       //   "valueType": "my_valueType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "labels": [],
    *   //   "launchStage": "my_launchStage",
    *   //   "metadata": {},
    *   //   "metricKind": "my_metricKind",
    *   //   "monitoredResourceTypes": [],
    *   //   "name": "my_name",
    *   //   "type": "my_type",
    *   //   "unit": "my_unit",
    *   //   "valueType": "my_valueType"
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
  def create(params: ParamsResourceProjectsMetricdescriptorsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsMetricdescriptorsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsMetricdescriptorsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsMetricdescriptorsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsMetricdescriptorsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsMetricdescriptorsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsMetricdescriptorsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a metric descriptor. Only user-created custom metrics (https://cloud.google.com/monitoring/custom-metrics) can be deleted.
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
    *   const res = await monitoring.projects.metricDescriptors.delete({
    *     // Required. The metric descriptor on which to execute the request. The format is: projects/[PROJECT_ID_OR_NUMBER]/metricDescriptors/[METRIC_ID] An example of [METRIC_ID] is: "custom.googleapis.com/my_test_metric".
    *     name: 'projects/my-project/metricDescriptors/.*',
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
  def delete(params: ParamsResourceProjectsMetricdescriptorsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsMetricdescriptorsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaMetricDescriptor] = js.native
  def get(callback: BodyResponseCallback[SchemaMetricDescriptor]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMetricDescriptor] = js.native
  def get(params: ParamsResourceProjectsMetricdescriptorsGet): GaxiosPromise[SchemaMetricDescriptor] = js.native
  def get(
    params: ParamsResourceProjectsMetricdescriptorsGet,
    callback: BodyResponseCallback[SchemaMetricDescriptor]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsMetricdescriptorsGet,
    options: BodyResponseCallback[Readable | SchemaMetricDescriptor],
    callback: BodyResponseCallback[Readable | SchemaMetricDescriptor]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsMetricdescriptorsGet, options: MethodOptions): GaxiosPromise[SchemaMetricDescriptor] = js.native
  def get(
    params: ParamsResourceProjectsMetricdescriptorsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMetricDescriptor]
  ): Unit = js.native
  /**
    * Gets a single metric descriptor.
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
    *   const res = await monitoring.projects.metricDescriptors.get({
    *     // Required. The metric descriptor on which to execute the request. The format is: projects/[PROJECT_ID_OR_NUMBER]/metricDescriptors/[METRIC_ID] An example value of [METRIC_ID] is "compute.googleapis.com/instance/disk/read_bytes_count".
    *     name: 'projects/my-project/metricDescriptors/.*',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "labels": [],
    *   //   "launchStage": "my_launchStage",
    *   //   "metadata": {},
    *   //   "metricKind": "my_metricKind",
    *   //   "monitoredResourceTypes": [],
    *   //   "name": "my_name",
    *   //   "type": "my_type",
    *   //   "unit": "my_unit",
    *   //   "valueType": "my_valueType"
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
  def get(params: ParamsResourceProjectsMetricdescriptorsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsMetricdescriptorsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListMetricDescriptorsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMetricDescriptorsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListMetricDescriptorsResponse] = js.native
  def list(params: ParamsResourceProjectsMetricdescriptorsList): GaxiosPromise[SchemaListMetricDescriptorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsMetricdescriptorsList,
    callback: BodyResponseCallback[SchemaListMetricDescriptorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsMetricdescriptorsList,
    options: BodyResponseCallback[Readable | SchemaListMetricDescriptorsResponse],
    callback: BodyResponseCallback[Readable | SchemaListMetricDescriptorsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsMetricdescriptorsList, options: MethodOptions): GaxiosPromise[SchemaListMetricDescriptorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsMetricdescriptorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMetricDescriptorsResponse]
  ): Unit = js.native
  /**
    * Lists metric descriptors that match a filter.
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
    *   const res = await monitoring.projects.metricDescriptors.list({
    *     // If this field is empty, all custom and system-defined metric descriptors are returned. Otherwise, the filter (https://cloud.google.com/monitoring/api/v3/filters) specifies which metric descriptors are to be returned. For example, the following filter matches all custom metrics (https://cloud.google.com/monitoring/custom-metrics): metric.type = starts_with("custom.googleapis.com/")
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
    *   //   "metricDescriptors": [],
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
  def list(params: ParamsResourceProjectsMetricdescriptorsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsMetricdescriptorsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
