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

@JSImport("googleapis/build/src/apis/run/v1", "run_v1.Resource$Namespaces$Revisions")
@js.native
open class ResourceNamespacesRevisions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaStatus] = js.native
  def delete(callback: BodyResponseCallback[SchemaStatus]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStatus] = js.native
  def delete(params: ParamsResourceNamespacesRevisionsDelete): GaxiosPromise[SchemaStatus] = js.native
  def delete(params: ParamsResourceNamespacesRevisionsDelete, callback: BodyResponseCallback[SchemaStatus]): Unit = js.native
  def delete(
    params: ParamsResourceNamespacesRevisionsDelete,
    options: BodyResponseCallback[Readable | SchemaStatus],
    callback: BodyResponseCallback[Readable | SchemaStatus]
  ): Unit = js.native
  def delete(params: ParamsResourceNamespacesRevisionsDelete, options: MethodOptions): GaxiosPromise[SchemaStatus] = js.native
  def delete(
    params: ParamsResourceNamespacesRevisionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStatus]
  ): Unit = js.native
  /**
    * Delete a revision.
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
    *   const res = await run.namespaces.revisions.delete({
    *     // Cloud Run currently ignores this parameter.
    *     apiVersion: 'placeholder-value',
    *     // Indicates that the server should validate the request and populate default values without persisting the request. Supported values: `all`
    *     dryRun: 'placeholder-value',
    *     // Cloud Run currently ignores this parameter.
    *     kind: 'placeholder-value',
    *     // The name of the revision to delete. For Cloud Run (fully managed), replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    *     name: 'namespaces/my-namespace/revisions/my-revision',
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
  def delete(params: ParamsResourceNamespacesRevisionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceNamespacesRevisionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRevision] = js.native
  def get(callback: BodyResponseCallback[SchemaRevision]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRevision] = js.native
  def get(params: ParamsResourceNamespacesRevisionsGet): GaxiosPromise[SchemaRevision] = js.native
  def get(params: ParamsResourceNamespacesRevisionsGet, callback: BodyResponseCallback[SchemaRevision]): Unit = js.native
  def get(
    params: ParamsResourceNamespacesRevisionsGet,
    options: BodyResponseCallback[Readable | SchemaRevision],
    callback: BodyResponseCallback[Readable | SchemaRevision]
  ): Unit = js.native
  def get(params: ParamsResourceNamespacesRevisionsGet, options: MethodOptions): GaxiosPromise[SchemaRevision] = js.native
  def get(
    params: ParamsResourceNamespacesRevisionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevision]
  ): Unit = js.native
  /**
    * Get information about a revision.
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
    *   const res = await run.namespaces.revisions.get({
    *     // The name of the revision to retrieve. For Cloud Run (fully managed), replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    *     name: 'namespaces/my-namespace/revisions/my-revision',
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
  def get(params: ParamsResourceNamespacesRevisionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceNamespacesRevisionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListRevisionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRevisionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListRevisionsResponse] = js.native
  def list(params: ParamsResourceNamespacesRevisionsList): GaxiosPromise[SchemaListRevisionsResponse] = js.native
  def list(
    params: ParamsResourceNamespacesRevisionsList,
    callback: BodyResponseCallback[SchemaListRevisionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceNamespacesRevisionsList,
    options: BodyResponseCallback[Readable | SchemaListRevisionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListRevisionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceNamespacesRevisionsList, options: MethodOptions): GaxiosPromise[SchemaListRevisionsResponse] = js.native
  def list(
    params: ParamsResourceNamespacesRevisionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRevisionsResponse]
  ): Unit = js.native
  /**
    * List revisions.
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
    *   const res = await run.namespaces.revisions.list({
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
    *     // The namespace from which the revisions should be listed. For Cloud Run (fully managed), replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
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
  def list(params: ParamsResourceNamespacesRevisionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceNamespacesRevisionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
