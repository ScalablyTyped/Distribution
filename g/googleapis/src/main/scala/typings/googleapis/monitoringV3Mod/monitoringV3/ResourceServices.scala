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

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Services")
@js.native
open class ResourceServices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaService] = js.native
  def create(callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def create(params: ParamsResourceServicesCreate): GaxiosPromise[SchemaService] = js.native
  def create(params: ParamsResourceServicesCreate, callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def create(
    params: ParamsResourceServicesCreate,
    options: BodyResponseCallback[Readable | SchemaService],
    callback: BodyResponseCallback[Readable | SchemaService]
  ): Unit = js.native
  def create(params: ParamsResourceServicesCreate, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def create(
    params: ParamsResourceServicesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  /**
    * Create a Service.
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
    *   const res = await monitoring.services.create({
    *     // Required. Resource name (https://cloud.google.com/monitoring/api/v3#project_name) of the parent Metrics Scope. The format is: projects/[PROJECT_ID_OR_NUMBER]
    *     parent: '[^/]+/[^/]+',
    *     // Optional. The Service id to use for this Service. If omitted, an id will be generated instead. Must match the pattern [a-z0-9\-]+
    *     serviceId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appEngine": {},
    *       //   "cloudEndpoints": {},
    *       //   "cloudRun": {},
    *       //   "clusterIstio": {},
    *       //   "custom": {},
    *       //   "displayName": "my_displayName",
    *       //   "gkeNamespace": {},
    *       //   "gkeService": {},
    *       //   "gkeWorkload": {},
    *       //   "istioCanonicalService": {},
    *       //   "meshIstio": {},
    *       //   "name": "my_name",
    *       //   "telemetry": {},
    *       //   "userLabels": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appEngine": {},
    *   //   "cloudEndpoints": {},
    *   //   "cloudRun": {},
    *   //   "clusterIstio": {},
    *   //   "custom": {},
    *   //   "displayName": "my_displayName",
    *   //   "gkeNamespace": {},
    *   //   "gkeService": {},
    *   //   "gkeWorkload": {},
    *   //   "istioCanonicalService": {},
    *   //   "meshIstio": {},
    *   //   "name": "my_name",
    *   //   "telemetry": {},
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
  def create(params: ParamsResourceServicesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceServicesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceServicesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceServicesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceServicesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceServicesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceServicesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Soft delete this Service.
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
    *   const res = await monitoring.services.delete({
    *     // Required. Resource name of the Service to delete. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
    *     name: '[^/]+/[^/]+/services/my-service',
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
  def delete(params: ParamsResourceServicesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceServicesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaService] = js.native
  def get(callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def get(params: ParamsResourceServicesGet): GaxiosPromise[SchemaService] = js.native
  def get(params: ParamsResourceServicesGet, callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def get(
    params: ParamsResourceServicesGet,
    options: BodyResponseCallback[Readable | SchemaService],
    callback: BodyResponseCallback[Readable | SchemaService]
  ): Unit = js.native
  def get(params: ParamsResourceServicesGet, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def get(
    params: ParamsResourceServicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  /**
    * Get the named Service.
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
    *   const res = await monitoring.services.get({
    *     // Required. Resource name of the Service. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
    *     name: '[^/]+/[^/]+/services/my-service',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appEngine": {},
    *   //   "cloudEndpoints": {},
    *   //   "cloudRun": {},
    *   //   "clusterIstio": {},
    *   //   "custom": {},
    *   //   "displayName": "my_displayName",
    *   //   "gkeNamespace": {},
    *   //   "gkeService": {},
    *   //   "gkeWorkload": {},
    *   //   "istioCanonicalService": {},
    *   //   "meshIstio": {},
    *   //   "name": "my_name",
    *   //   "telemetry": {},
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
  def get(params: ParamsResourceServicesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceServicesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListServicesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(params: ParamsResourceServicesList): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(params: ParamsResourceServicesList, callback: BodyResponseCallback[SchemaListServicesResponse]): Unit = js.native
  def list(
    params: ParamsResourceServicesList,
    options: BodyResponseCallback[Readable | SchemaListServicesResponse],
    callback: BodyResponseCallback[Readable | SchemaListServicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceServicesList, options: MethodOptions): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(
    params: ParamsResourceServicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListServicesResponse]
  ): Unit = js.native
  /**
    * List Services for this Metrics Scope.
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
    *   const res = await monitoring.services.list({
    *     // A filter specifying what Services to return. The filter supports filtering on a particular service-identifier type or one of its attributes.To filter on a particular service-identifier type, the identifier_case refers to which option in the identifier field is populated. For example, the filter identifier_case = "CUSTOM" would match all services with a value for the custom field. Valid options include "CUSTOM", "APP_ENGINE", "MESH_ISTIO", and the other options listed at https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services#ServiceTo filter on an attribute of a service-identifier type, apply the filter name by using the snake case of the service-identifier type and the attribute of that service-identifier type, and join the two with a period. For example, to filter by the meshUid field of the MeshIstio service-identifier type, you must filter on mesh_istio.mesh_uid = "123" to match all services with mesh UID "123". Service-identifier types and their attributes are described at https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services#Service
    *     filter: 'placeholder-value',
    *     // A non-negative number that is the maximum number of results to return. When 0, use default page size.
    *     pageSize: 'placeholder-value',
    *     // If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return additional results from the previous method call.
    *     pageToken: 'placeholder-value',
    *     // Required. Resource name of the parent containing the listed services, either a project (https://cloud.google.com/monitoring/api/v3#project_name) or a Monitoring Metrics Scope. The formats are: projects/[PROJECT_ID_OR_NUMBER] workspaces/[HOST_PROJECT_ID_OR_NUMBER]
    *     parent: '[^/]+/[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "services": []
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
  def list(params: ParamsResourceServicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceServicesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaService] = js.native
  def patch(callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def patch(params: ParamsResourceServicesPatch): GaxiosPromise[SchemaService] = js.native
  def patch(params: ParamsResourceServicesPatch, callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def patch(
    params: ParamsResourceServicesPatch,
    options: BodyResponseCallback[Readable | SchemaService],
    callback: BodyResponseCallback[Readable | SchemaService]
  ): Unit = js.native
  def patch(params: ParamsResourceServicesPatch, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def patch(
    params: ParamsResourceServicesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  /**
    * Update this Service.
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
    *   const res = await monitoring.services.patch({
    *     // Resource name for this Service. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
    *     name: '[^/]+/[^/]+/services/my-service',
    *     // A set of field paths defining which fields to use for the update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appEngine": {},
    *       //   "cloudEndpoints": {},
    *       //   "cloudRun": {},
    *       //   "clusterIstio": {},
    *       //   "custom": {},
    *       //   "displayName": "my_displayName",
    *       //   "gkeNamespace": {},
    *       //   "gkeService": {},
    *       //   "gkeWorkload": {},
    *       //   "istioCanonicalService": {},
    *       //   "meshIstio": {},
    *       //   "name": "my_name",
    *       //   "telemetry": {},
    *       //   "userLabels": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appEngine": {},
    *   //   "cloudEndpoints": {},
    *   //   "cloudRun": {},
    *   //   "clusterIstio": {},
    *   //   "custom": {},
    *   //   "displayName": "my_displayName",
    *   //   "gkeNamespace": {},
    *   //   "gkeService": {},
    *   //   "gkeWorkload": {},
    *   //   "istioCanonicalService": {},
    *   //   "meshIstio": {},
    *   //   "name": "my_name",
    *   //   "telemetry": {},
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
  def patch(params: ParamsResourceServicesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceServicesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var serviceLevelObjectives: ResourceServicesServicelevelobjectives = js.native
}
