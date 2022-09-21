package typings.googleapis.runV1Mod.runV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/run/v1", "run_v1.Resource$Namespaces$Services")
@js.native
open class ResourceNamespacesServices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaService] = js.native
  def create(callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def create(params: ParamsResourceNamespacesServicesCreate): GaxiosPromise[SchemaService] = js.native
  def create(params: ParamsResourceNamespacesServicesCreate, callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def create(
    params: ParamsResourceNamespacesServicesCreate,
    options: BodyResponseCallback[Readable | SchemaService],
    callback: BodyResponseCallback[Readable | SchemaService]
  ): Unit = js.native
  def create(params: ParamsResourceNamespacesServicesCreate, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def create(
    params: ParamsResourceNamespacesServicesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  /**
    * Create a service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/run.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const run = google.run('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await run.namespaces.services.create({
    *     // Indicates that the server should validate the request and populate default values without persisting the request. Supported values: `all`
    *     dryRun: 'placeholder-value',
    *     // The namespace in which the service should be created. For Cloud Run (fully managed), replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    *     parent: 'namespaces/my-namespace',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apiVersion": "my_apiVersion",
    *       //   "kind": "my_kind",
    *       //   "metadata": {},
    *       //   "spec": {},
    *       //   "status": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiVersion": "my_apiVersion",
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "spec": {},
    *   //   "status": {}
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
  def create(params: ParamsResourceNamespacesServicesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceNamespacesServicesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaStatus] = js.native
  def delete(callback: BodyResponseCallback[SchemaStatus]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStatus] = js.native
  def delete(params: ParamsResourceNamespacesServicesDelete): GaxiosPromise[SchemaStatus] = js.native
  def delete(params: ParamsResourceNamespacesServicesDelete, callback: BodyResponseCallback[SchemaStatus]): Unit = js.native
  def delete(
    params: ParamsResourceNamespacesServicesDelete,
    options: BodyResponseCallback[Readable | SchemaStatus],
    callback: BodyResponseCallback[Readable | SchemaStatus]
  ): Unit = js.native
  def delete(params: ParamsResourceNamespacesServicesDelete, options: MethodOptions): GaxiosPromise[SchemaStatus] = js.native
  def delete(
    params: ParamsResourceNamespacesServicesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStatus]
  ): Unit = js.native
  /**
    * Delete a service. This will cause the Service to stop serving traffic and will delete the child entities like Routes, Configurations and Revisions.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/run.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const run = google.run('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await run.namespaces.services.delete({
    *     // Cloud Run currently ignores this parameter.
    *     apiVersion: 'placeholder-value',
    *     // Indicates that the server should validate the request and populate default values without persisting the request. Supported values: `all`
    *     dryRun: 'placeholder-value',
    *     // Cloud Run currently ignores this parameter.
    *     kind: 'placeholder-value',
    *     // The name of the service to delete. For Cloud Run (fully managed), replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    *     name: 'namespaces/my-namespace/services/my-service',
    *     // Specifies the propagation policy of delete. Cloud Run currently ignores this setting, and deletes in the background. Please see kubernetes.io/docs/concepts/workloads/controllers/garbage-collection/ for more information.
    *     propagationPolicy: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "code": 0,
    *   //   "details": {},
    *   //   "message": "my_message",
    *   //   "metadata": {},
    *   //   "reason": "my_reason",
    *   //   "status": "my_status"
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
  def delete(params: ParamsResourceNamespacesServicesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceNamespacesServicesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaService] = js.native
  def get(callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def get(params: ParamsResourceNamespacesServicesGet): GaxiosPromise[SchemaService] = js.native
  def get(params: ParamsResourceNamespacesServicesGet, callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def get(
    params: ParamsResourceNamespacesServicesGet,
    options: BodyResponseCallback[Readable | SchemaService],
    callback: BodyResponseCallback[Readable | SchemaService]
  ): Unit = js.native
  def get(params: ParamsResourceNamespacesServicesGet, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def get(
    params: ParamsResourceNamespacesServicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  /**
    * Get information about a service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/run.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const run = google.run('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await run.namespaces.services.get({
    *     // The name of the service to retrieve. For Cloud Run (fully managed), replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    *     name: 'namespaces/my-namespace/services/my-service',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiVersion": "my_apiVersion",
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "spec": {},
    *   //   "status": {}
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
  def get(params: ParamsResourceNamespacesServicesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceNamespacesServicesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListServicesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(params: ParamsResourceNamespacesServicesList): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(
    params: ParamsResourceNamespacesServicesList,
    callback: BodyResponseCallback[SchemaListServicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceNamespacesServicesList,
    options: BodyResponseCallback[Readable | SchemaListServicesResponse],
    callback: BodyResponseCallback[Readable | SchemaListServicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceNamespacesServicesList, options: MethodOptions): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(
    params: ParamsResourceNamespacesServicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListServicesResponse]
  ): Unit = js.native
  /**
    * List services.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/run.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const run = google.run('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await run.namespaces.services.list({
    *     // Optional. Encoded string to continue paging.
    *     continue: 'placeholder-value',
    *     // Allows to filter resources based on a specific value for a field name. Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud Run.
    *     fieldSelector: 'placeholder-value',
    *     // Not currently used by Cloud Run.
    *     includeUninitialized: 'placeholder-value',
    *     // Allows to filter resources based on a label. Supported operations are =, !=, exists, in, and notIn.
    *     labelSelector: 'placeholder-value',
    *     // Optional. The maximum number of records that should be returned.
    *     limit: 'placeholder-value',
    *     // The namespace from which the services should be listed. For Cloud Run (fully managed), replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    *     parent: 'namespaces/my-namespace',
    *     // The baseline resource version from which the list or watch operation should start. Not currently used by Cloud Run.
    *     resourceVersion: 'placeholder-value',
    *     // Flag that indicates that the client expects to watch this resource as well. Not currently used by Cloud Run.
    *     watch: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiVersion": "my_apiVersion",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "unreachable": []
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
  def list(params: ParamsResourceNamespacesServicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceNamespacesServicesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def replaceService(): GaxiosPromise[SchemaService] = js.native
  def replaceService(callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def replaceService(params: Unit, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def replaceService(params: ParamsResourceNamespacesServicesReplaceservice): GaxiosPromise[SchemaService] = js.native
  def replaceService(
    params: ParamsResourceNamespacesServicesReplaceservice,
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  def replaceService(
    params: ParamsResourceNamespacesServicesReplaceservice,
    options: BodyResponseCallback[Readable | SchemaService],
    callback: BodyResponseCallback[Readable | SchemaService]
  ): Unit = js.native
  def replaceService(params: ParamsResourceNamespacesServicesReplaceservice, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def replaceService(
    params: ParamsResourceNamespacesServicesReplaceservice,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  /**
    * Replace a service. Only the spec and metadata labels and annotations are modifiable. After the Update request, Cloud Run will work to make the 'status' match the requested 'spec'. May provide metadata.resourceVersion to enforce update from last read for optimistic concurrency control.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/run.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const run = google.run('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await run.namespaces.services.replaceService({
    *     // Indicates that the server should validate the request and populate default values without persisting the request. Supported values: `all`
    *     dryRun: 'placeholder-value',
    *     // The name of the service being replaced. For Cloud Run (fully managed), replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    *     name: 'namespaces/my-namespace/services/my-service',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apiVersion": "my_apiVersion",
    *       //   "kind": "my_kind",
    *       //   "metadata": {},
    *       //   "spec": {},
    *       //   "status": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiVersion": "my_apiVersion",
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "spec": {},
    *   //   "status": {}
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
  def replaceService(params: ParamsResourceNamespacesServicesReplaceservice, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def replaceService(
    params: ParamsResourceNamespacesServicesReplaceservice,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
