package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicemanagement/v1", "servicemanagement_v1.Resource$Services$Configs")
@js.native
open class ResourceServicesConfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaService] = js.native
  def create(callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def create(params: ParamsResourceServicesConfigsCreate): GaxiosPromise[SchemaService] = js.native
  def create(params: ParamsResourceServicesConfigsCreate, callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def create(
    params: ParamsResourceServicesConfigsCreate,
    options: BodyResponseCallback[Readable | SchemaService],
    callback: BodyResponseCallback[Readable | SchemaService]
  ): Unit = js.native
  def create(params: ParamsResourceServicesConfigsCreate, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def create(
    params: ParamsResourceServicesConfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  /**
    * Creates a new service configuration (version) for a managed service. This method only stores the service configuration. To roll out the service configuration to backend systems please call CreateServiceRollout. Only the 100 most recent service configurations and ones referenced by existing rollouts are kept for each service. The rest will be deleted eventually.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicemanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicemanagement = google.servicemanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/service.management',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await servicemanagement.services.configs.create({
    *     // Required. The name of the service. See the [overview](https://cloud.google.com/service-management/overview) for naming requirements. For example: `example.googleapis.com`.
    *     serviceName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apis": [],
    *       //   "authentication": {},
    *       //   "backend": {},
    *       //   "billing": {},
    *       //   "configVersion": 0,
    *       //   "context": {},
    *       //   "control": {},
    *       //   "customError": {},
    *       //   "documentation": {},
    *       //   "endpoints": [],
    *       //   "enums": [],
    *       //   "http": {},
    *       //   "id": "my_id",
    *       //   "logging": {},
    *       //   "logs": [],
    *       //   "metrics": [],
    *       //   "monitoredResources": [],
    *       //   "monitoring": {},
    *       //   "name": "my_name",
    *       //   "producerProjectId": "my_producerProjectId",
    *       //   "quota": {},
    *       //   "sourceInfo": {},
    *       //   "systemParameters": {},
    *       //   "systemTypes": [],
    *       //   "title": "my_title",
    *       //   "types": [],
    *       //   "usage": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apis": [],
    *   //   "authentication": {},
    *   //   "backend": {},
    *   //   "billing": {},
    *   //   "configVersion": 0,
    *   //   "context": {},
    *   //   "control": {},
    *   //   "customError": {},
    *   //   "documentation": {},
    *   //   "endpoints": [],
    *   //   "enums": [],
    *   //   "http": {},
    *   //   "id": "my_id",
    *   //   "logging": {},
    *   //   "logs": [],
    *   //   "metrics": [],
    *   //   "monitoredResources": [],
    *   //   "monitoring": {},
    *   //   "name": "my_name",
    *   //   "producerProjectId": "my_producerProjectId",
    *   //   "quota": {},
    *   //   "sourceInfo": {},
    *   //   "systemParameters": {},
    *   //   "systemTypes": [],
    *   //   "title": "my_title",
    *   //   "types": [],
    *   //   "usage": {}
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
  def create(params: ParamsResourceServicesConfigsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceServicesConfigsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaService] = js.native
  def get(callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def get(params: ParamsResourceServicesConfigsGet): GaxiosPromise[SchemaService] = js.native
  def get(params: ParamsResourceServicesConfigsGet, callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def get(
    params: ParamsResourceServicesConfigsGet,
    options: BodyResponseCallback[Readable | SchemaService],
    callback: BodyResponseCallback[Readable | SchemaService]
  ): Unit = js.native
  def get(params: ParamsResourceServicesConfigsGet, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def get(
    params: ParamsResourceServicesConfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  /**
    * Gets a service configuration (version) for a managed service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicemanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicemanagement = google.servicemanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/service.management',
    *       'https://www.googleapis.com/auth/service.management.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await servicemanagement.services.configs.get({
    *     // Required. The id of the service configuration resource. This field must be specified for the server to return all fields, including `SourceInfo`.
    *     configId: 'placeholder-value',
    *     // Required. The name of the service. See the [overview](https://cloud.google.com/service-management/overview) for naming requirements. For example: `example.googleapis.com`.
    *     serviceName: 'placeholder-value',
    *     // Specifies which parts of the Service Config should be returned in the response.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apis": [],
    *   //   "authentication": {},
    *   //   "backend": {},
    *   //   "billing": {},
    *   //   "configVersion": 0,
    *   //   "context": {},
    *   //   "control": {},
    *   //   "customError": {},
    *   //   "documentation": {},
    *   //   "endpoints": [],
    *   //   "enums": [],
    *   //   "http": {},
    *   //   "id": "my_id",
    *   //   "logging": {},
    *   //   "logs": [],
    *   //   "metrics": [],
    *   //   "monitoredResources": [],
    *   //   "monitoring": {},
    *   //   "name": "my_name",
    *   //   "producerProjectId": "my_producerProjectId",
    *   //   "quota": {},
    *   //   "sourceInfo": {},
    *   //   "systemParameters": {},
    *   //   "systemTypes": [],
    *   //   "title": "my_title",
    *   //   "types": [],
    *   //   "usage": {}
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
  def get(params: ParamsResourceServicesConfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceServicesConfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListServiceConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListServiceConfigsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListServiceConfigsResponse] = js.native
  def list(params: ParamsResourceServicesConfigsList): GaxiosPromise[SchemaListServiceConfigsResponse] = js.native
  def list(
    params: ParamsResourceServicesConfigsList,
    callback: BodyResponseCallback[SchemaListServiceConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceServicesConfigsList,
    options: BodyResponseCallback[Readable | SchemaListServiceConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaListServiceConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceServicesConfigsList, options: MethodOptions): GaxiosPromise[SchemaListServiceConfigsResponse] = js.native
  def list(
    params: ParamsResourceServicesConfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListServiceConfigsResponse]
  ): Unit = js.native
  /**
    * Lists the history of the service configuration for a managed service, from the newest to the oldest.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicemanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicemanagement = google.servicemanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/service.management',
    *       'https://www.googleapis.com/auth/service.management.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await servicemanagement.services.configs.list({
    *     // The max number of items to include in the response list. Page size is 50 if not specified. Maximum value is 100.
    *     pageSize: 'placeholder-value',
    *     // The token of the page to retrieve.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the service. See the [overview](https://cloud.google.com/service-management/overview) for naming requirements. For example: `example.googleapis.com`.
    *     serviceName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "serviceConfigs": []
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
  def list(params: ParamsResourceServicesConfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceServicesConfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def submit(): GaxiosPromise[SchemaOperation] = js.native
  def submit(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def submit(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def submit(params: ParamsResourceServicesConfigsSubmit): GaxiosPromise[SchemaOperation] = js.native
  def submit(params: ParamsResourceServicesConfigsSubmit, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def submit(
    params: ParamsResourceServicesConfigsSubmit,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def submit(params: ParamsResourceServicesConfigsSubmit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def submit(
    params: ParamsResourceServicesConfigsSubmit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new service configuration (version) for a managed service based on user-supplied configuration source files (for example: OpenAPI Specification). This method stores the source configurations as well as the generated service configuration. To rollout the service configuration to other services, please call CreateServiceRollout. Only the 100 most recent configuration sources and ones referenced by existing service configurtions are kept for each service. The rest will be deleted eventually. Operation
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicemanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicemanagement = google.servicemanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/service.management',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await servicemanagement.services.configs.submit({
    *     // Required. The name of the service. See the [overview](https://cloud.google.com/service-management/overview) for naming requirements. For example: `example.googleapis.com`.
    *     serviceName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "configSource": {},
    *       //   "validateOnly": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def submit(params: ParamsResourceServicesConfigsSubmit, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def submit(
    params: ParamsResourceServicesConfigsSubmit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
