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

@JSImport("googleapis/build/src/apis/run/v1", "run_v1.Resource$Projects$Locations$Domainmappings")
@js.native
open class ResourceProjectsLocationsDomainmappings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaDomainMapping] = js.native
  def create(callback: BodyResponseCallback[SchemaDomainMapping]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDomainMapping] = js.native
  def create(params: ParamsResourceProjectsLocationsDomainmappingsCreate): GaxiosPromise[SchemaDomainMapping] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDomainmappingsCreate,
    callback: BodyResponseCallback[SchemaDomainMapping]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDomainmappingsCreate,
    options: BodyResponseCallback[Readable | SchemaDomainMapping],
    callback: BodyResponseCallback[Readable | SchemaDomainMapping]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsDomainmappingsCreate, options: MethodOptions): GaxiosPromise[SchemaDomainMapping] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDomainmappingsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomainMapping]
  ): Unit = js.native
  /**
    * Create a new domain mapping.
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
    *   const res = await run.projects.locations.domainmappings.create({
    *     // Indicates that the server should validate the request and populate default values without persisting the request. Supported values: `all`
    *     dryRun: 'placeholder-value',
    *     // The namespace in which the domain mapping should be created. For Cloud Run (fully managed), replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    *     parent: 'projects/my-project/locations/my-location',
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
  def create(params: ParamsResourceProjectsLocationsDomainmappingsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDomainmappingsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaStatus] = js.native
  def delete(callback: BodyResponseCallback[SchemaStatus]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStatus] = js.native
  def delete(params: ParamsResourceProjectsLocationsDomainmappingsDelete): GaxiosPromise[SchemaStatus] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDomainmappingsDelete,
    callback: BodyResponseCallback[SchemaStatus]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDomainmappingsDelete,
    options: BodyResponseCallback[Readable | SchemaStatus],
    callback: BodyResponseCallback[Readable | SchemaStatus]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDomainmappingsDelete, options: MethodOptions): GaxiosPromise[SchemaStatus] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDomainmappingsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStatus]
  ): Unit = js.native
  /**
    * Delete a domain mapping.
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
    *   const res = await run.projects.locations.domainmappings.delete({
    *     // Cloud Run currently ignores this parameter.
    *     apiVersion: 'placeholder-value',
    *     // Indicates that the server should validate the request and populate default values without persisting the request. Supported values: `all`
    *     dryRun: 'placeholder-value',
    *     // Cloud Run currently ignores this parameter.
    *     kind: 'placeholder-value',
    *     // The name of the domain mapping to delete. For Cloud Run (fully managed), replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    *     name: 'projects/my-project/locations/my-location/domainmappings/my-domainmapping',
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
  def delete(params: ParamsResourceProjectsLocationsDomainmappingsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDomainmappingsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDomainMapping] = js.native
  def get(callback: BodyResponseCallback[SchemaDomainMapping]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDomainMapping] = js.native
  def get(params: ParamsResourceProjectsLocationsDomainmappingsGet): GaxiosPromise[SchemaDomainMapping] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDomainmappingsGet,
    callback: BodyResponseCallback[SchemaDomainMapping]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDomainmappingsGet,
    options: BodyResponseCallback[Readable | SchemaDomainMapping],
    callback: BodyResponseCallback[Readable | SchemaDomainMapping]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDomainmappingsGet, options: MethodOptions): GaxiosPromise[SchemaDomainMapping] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDomainmappingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomainMapping]
  ): Unit = js.native
  /**
    * Get information about a domain mapping.
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
    *   const res = await run.projects.locations.domainmappings.get({
    *     // The name of the domain mapping to retrieve. For Cloud Run (fully managed), replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    *     name: 'projects/my-project/locations/my-location/domainmappings/my-domainmapping',
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
  def get(params: ParamsResourceProjectsLocationsDomainmappingsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDomainmappingsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDomainMappingsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDomainMappingsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDomainMappingsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDomainmappingsList): GaxiosPromise[SchemaListDomainMappingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDomainmappingsList,
    callback: BodyResponseCallback[SchemaListDomainMappingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDomainmappingsList,
    options: BodyResponseCallback[Readable | SchemaListDomainMappingsResponse],
    callback: BodyResponseCallback[Readable | SchemaListDomainMappingsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDomainmappingsList, options: MethodOptions): GaxiosPromise[SchemaListDomainMappingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDomainmappingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDomainMappingsResponse]
  ): Unit = js.native
  /**
    * List domain mappings.
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
    *   const res = await run.projects.locations.domainmappings.list({
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
    *     // The namespace from which the domain mappings should be listed. For Cloud Run (fully managed), replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    *     parent: 'projects/my-project/locations/my-location',
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
  def list(params: ParamsResourceProjectsLocationsDomainmappingsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDomainmappingsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
