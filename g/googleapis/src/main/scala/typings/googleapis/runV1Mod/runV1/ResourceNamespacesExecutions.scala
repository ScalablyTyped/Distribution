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

@JSImport("googleapis/build/src/apis/run/v1", "run_v1.Resource$Namespaces$Executions")
@js.native
open class ResourceNamespacesExecutions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def cancel(): GaxiosPromise[SchemaExecution] = js.native
  def cancel(callback: BodyResponseCallback[SchemaExecution]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def cancel(params: ParamsResourceNamespacesExecutionsCancel): GaxiosPromise[SchemaExecution] = js.native
  def cancel(params: ParamsResourceNamespacesExecutionsCancel, callback: BodyResponseCallback[SchemaExecution]): Unit = js.native
  def cancel(
    params: ParamsResourceNamespacesExecutionsCancel,
    options: BodyResponseCallback[Readable | SchemaExecution],
    callback: BodyResponseCallback[Readable | SchemaExecution]
  ): Unit = js.native
  def cancel(params: ParamsResourceNamespacesExecutionsCancel, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def cancel(
    params: ParamsResourceNamespacesExecutionsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  /**
    * Cancel an execution.
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
    *   const res = await run.namespaces.executions.cancel({
    *     // Required. The name of the execution to cancel. Replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    *     name: 'namespaces/my-namespace/executions/my-execution',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def cancel(params: ParamsResourceNamespacesExecutionsCancel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancel(
    params: ParamsResourceNamespacesExecutionsCancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaStatus] = js.native
  def delete(callback: BodyResponseCallback[SchemaStatus]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStatus] = js.native
  def delete(params: ParamsResourceNamespacesExecutionsDelete): GaxiosPromise[SchemaStatus] = js.native
  def delete(params: ParamsResourceNamespacesExecutionsDelete, callback: BodyResponseCallback[SchemaStatus]): Unit = js.native
  def delete(
    params: ParamsResourceNamespacesExecutionsDelete,
    options: BodyResponseCallback[Readable | SchemaStatus],
    callback: BodyResponseCallback[Readable | SchemaStatus]
  ): Unit = js.native
  def delete(params: ParamsResourceNamespacesExecutionsDelete, options: MethodOptions): GaxiosPromise[SchemaStatus] = js.native
  def delete(
    params: ParamsResourceNamespacesExecutionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStatus]
  ): Unit = js.native
  /**
    * Delete an execution.
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
    *   const res = await run.namespaces.executions.delete({
    *     // Optional. Cloud Run currently ignores this parameter.
    *     apiVersion: 'placeholder-value',
    *     // Optional. Cloud Run currently ignores this parameter.
    *     kind: 'placeholder-value',
    *     // Required. The name of the execution to delete. Replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    *     name: 'namespaces/my-namespace/executions/my-execution',
    *     // Optional. Specifies the propagation policy of delete. Cloud Run currently ignores this setting, and deletes in the background. Please see kubernetes.io/docs/concepts/workloads/controllers/garbage-collection/ for more information.
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
  def delete(params: ParamsResourceNamespacesExecutionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceNamespacesExecutionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaExecution] = js.native
  def get(callback: BodyResponseCallback[SchemaExecution]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def get(params: ParamsResourceNamespacesExecutionsGet): GaxiosPromise[SchemaExecution] = js.native
  def get(params: ParamsResourceNamespacesExecutionsGet, callback: BodyResponseCallback[SchemaExecution]): Unit = js.native
  def get(
    params: ParamsResourceNamespacesExecutionsGet,
    options: BodyResponseCallback[Readable | SchemaExecution],
    callback: BodyResponseCallback[Readable | SchemaExecution]
  ): Unit = js.native
  def get(params: ParamsResourceNamespacesExecutionsGet, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def get(
    params: ParamsResourceNamespacesExecutionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  /**
    * Get information about an execution.
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
    *   const res = await run.namespaces.executions.get({
    *     // Required. The name of the execution to retrieve. Replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    *     name: 'namespaces/my-namespace/executions/my-execution',
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
  def get(params: ParamsResourceNamespacesExecutionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceNamespacesExecutionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListExecutionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListExecutionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListExecutionsResponse] = js.native
  def list(params: ParamsResourceNamespacesExecutionsList): GaxiosPromise[SchemaListExecutionsResponse] = js.native
  def list(
    params: ParamsResourceNamespacesExecutionsList,
    callback: BodyResponseCallback[SchemaListExecutionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceNamespacesExecutionsList,
    options: BodyResponseCallback[Readable | SchemaListExecutionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListExecutionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceNamespacesExecutionsList, options: MethodOptions): GaxiosPromise[SchemaListExecutionsResponse] = js.native
  def list(
    params: ParamsResourceNamespacesExecutionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListExecutionsResponse]
  ): Unit = js.native
  /**
    * List executions.
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
    *   const res = await run.namespaces.executions.list({
    *     // Optional. Optional encoded string to continue paging.
    *     continue: 'placeholder-value',
    *     // Optional. Allows to filter resources based on a specific value for a field name. Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud Run.
    *     fieldSelector: 'placeholder-value',
    *     // Optional. Not currently used by Cloud Run.
    *     includeUninitialized: 'placeholder-value',
    *     // Optional. Allows to filter resources based on a label. Supported operations are =, !=, exists, in, and notIn.
    *     labelSelector: 'placeholder-value',
    *     // Optional. The maximum number of records that should be returned.
    *     limit: 'placeholder-value',
    *     // Required. The namespace from which the executions should be listed. Replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    *     parent: 'namespaces/my-namespace',
    *     // Optional. The baseline resource version from which the list or watch operation should start. Not currently used by Cloud Run.
    *     resourceVersion: 'placeholder-value',
    *     // Optional. Flag that indicates that the client expects to watch this resource as well. Not currently used by Cloud Run.
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
  def list(params: ParamsResourceNamespacesExecutionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceNamespacesExecutionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
