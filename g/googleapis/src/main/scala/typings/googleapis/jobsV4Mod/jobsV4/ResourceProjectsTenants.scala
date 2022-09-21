package typings.googleapis.jobsV4Mod.jobsV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/jobs/v4", "jobs_v4.Resource$Projects$Tenants")
@js.native
open class ResourceProjectsTenants protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var clientEvents: ResourceProjectsTenantsClientevents = js.native
  
  var companies: ResourceProjectsTenantsCompanies = js.native
  
  def completeQuery(): GaxiosPromise[SchemaCompleteQueryResponse] = js.native
  def completeQuery(callback: BodyResponseCallback[SchemaCompleteQueryResponse]): Unit = js.native
  def completeQuery(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCompleteQueryResponse] = js.native
  def completeQuery(params: ParamsResourceProjectsTenantsCompletequery): GaxiosPromise[SchemaCompleteQueryResponse] = js.native
  def completeQuery(
    params: ParamsResourceProjectsTenantsCompletequery,
    callback: BodyResponseCallback[SchemaCompleteQueryResponse]
  ): Unit = js.native
  def completeQuery(
    params: ParamsResourceProjectsTenantsCompletequery,
    options: BodyResponseCallback[Readable | SchemaCompleteQueryResponse],
    callback: BodyResponseCallback[Readable | SchemaCompleteQueryResponse]
  ): Unit = js.native
  def completeQuery(params: ParamsResourceProjectsTenantsCompletequery, options: MethodOptions): GaxiosPromise[SchemaCompleteQueryResponse] = js.native
  def completeQuery(
    params: ParamsResourceProjectsTenantsCompletequery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompleteQueryResponse]
  ): Unit = js.native
  /**
    * Completes the specified prefix with keyword suggestions. Intended for use by a job search auto-complete search box.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/jobs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/jobs',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await jobs.projects.tenants.completeQuery({
    *     // If provided, restricts completion to specified company. The format is "projects/{project_id\}/tenants/{tenant_id\}/companies/{company_id\}", for example, "projects/foo/tenants/bar/companies/baz".
    *     company: 'placeholder-value',
    *     // The list of languages of the query. This is the BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47). The maximum number of allowed characters is 255.
    *     languageCodes: 'placeholder-value',
    *     // Required. Completion result count. The maximum allowed page size is 10.
    *     pageSize: 'placeholder-value',
    *     // Required. The query used to generate suggestions. The maximum number of allowed characters is 255.
    *     query: 'placeholder-value',
    *     // The scope of the completion. The defaults is CompletionScope.PUBLIC.
    *     scope: 'placeholder-value',
    *     // Required. Resource name of tenant the completion is performed within. The format is "projects/{project_id\}/tenants/{tenant_id\}", for example, "projects/foo/tenants/bar".
    *     tenant: 'projects/my-project/tenants/my-tenant',
    *     // The completion topic. The default is CompletionType.COMBINED.
    *     type: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "completionResults": [],
    *   //   "metadata": {}
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
  def completeQuery(params: ParamsResourceProjectsTenantsCompletequery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def completeQuery(
    params: ParamsResourceProjectsTenantsCompletequery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTenant] = js.native
  def create(callback: BodyResponseCallback[SchemaTenant]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTenant] = js.native
  def create(params: ParamsResourceProjectsTenantsCreate): GaxiosPromise[SchemaTenant] = js.native
  def create(params: ParamsResourceProjectsTenantsCreate, callback: BodyResponseCallback[SchemaTenant]): Unit = js.native
  def create(
    params: ParamsResourceProjectsTenantsCreate,
    options: BodyResponseCallback[Readable | SchemaTenant],
    callback: BodyResponseCallback[Readable | SchemaTenant]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsTenantsCreate, options: MethodOptions): GaxiosPromise[SchemaTenant] = js.native
  def create(
    params: ParamsResourceProjectsTenantsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTenant]
  ): Unit = js.native
  /**
    * Creates a new tenant entity.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/jobs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/jobs',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await jobs.projects.tenants.create({
    *     // Required. Resource name of the project under which the tenant is created. The format is "projects/{project_id\}", for example, "projects/foo".
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "externalId": "my_externalId",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "externalId": "my_externalId",
    *   //   "name": "my_name"
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
  def create(params: ParamsResourceProjectsTenantsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsTenantsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsTenantsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsTenantsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsTenantsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsTenantsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsTenantsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes specified tenant.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/jobs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/jobs',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await jobs.projects.tenants.delete({
    *     // Required. The resource name of the tenant to be deleted. The format is "projects/{project_id\}/tenants/{tenant_id\}", for example, "projects/foo/tenants/bar".
    *     name: 'projects/my-project/tenants/my-tenant',
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
  def delete(params: ParamsResourceProjectsTenantsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsTenantsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTenant] = js.native
  def get(callback: BodyResponseCallback[SchemaTenant]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTenant] = js.native
  def get(params: ParamsResourceProjectsTenantsGet): GaxiosPromise[SchemaTenant] = js.native
  def get(params: ParamsResourceProjectsTenantsGet, callback: BodyResponseCallback[SchemaTenant]): Unit = js.native
  def get(
    params: ParamsResourceProjectsTenantsGet,
    options: BodyResponseCallback[Readable | SchemaTenant],
    callback: BodyResponseCallback[Readable | SchemaTenant]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsTenantsGet, options: MethodOptions): GaxiosPromise[SchemaTenant] = js.native
  def get(
    params: ParamsResourceProjectsTenantsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTenant]
  ): Unit = js.native
  /**
    * Retrieves specified tenant.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/jobs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/jobs',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await jobs.projects.tenants.get({
    *     // Required. The resource name of the tenant to be retrieved. The format is "projects/{project_id\}/tenants/{tenant_id\}", for example, "projects/foo/tenants/bar".
    *     name: 'projects/my-project/tenants/my-tenant',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "externalId": "my_externalId",
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceProjectsTenantsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsTenantsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var jobs: ResourceProjectsTenantsJobs = js.native
  
  def list(): GaxiosPromise[SchemaListTenantsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTenantsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTenantsResponse] = js.native
  def list(params: ParamsResourceProjectsTenantsList): GaxiosPromise[SchemaListTenantsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTenantsList,
    callback: BodyResponseCallback[SchemaListTenantsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsTenantsList,
    options: BodyResponseCallback[Readable | SchemaListTenantsResponse],
    callback: BodyResponseCallback[Readable | SchemaListTenantsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTenantsList, options: MethodOptions): GaxiosPromise[SchemaListTenantsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTenantsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTenantsResponse]
  ): Unit = js.native
  /**
    * Lists all tenants associated with the project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/jobs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/jobs',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await jobs.projects.tenants.list({
    *     // The maximum number of tenants to be returned, at most 100. Default is 100 if a non-positive number is provided.
    *     pageSize: 'placeholder-value',
    *     // The starting indicator from which to return results.
    *     pageToken: 'placeholder-value',
    *     // Required. Resource name of the project under which the tenant is created. The format is "projects/{project_id\}", for example, "projects/foo".
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "metadata": {},
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "tenants": []
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
  def list(params: ParamsResourceProjectsTenantsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsTenantsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaTenant] = js.native
  def patch(callback: BodyResponseCallback[SchemaTenant]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTenant] = js.native
  def patch(params: ParamsResourceProjectsTenantsPatch): GaxiosPromise[SchemaTenant] = js.native
  def patch(params: ParamsResourceProjectsTenantsPatch, callback: BodyResponseCallback[SchemaTenant]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsTenantsPatch,
    options: BodyResponseCallback[Readable | SchemaTenant],
    callback: BodyResponseCallback[Readable | SchemaTenant]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsTenantsPatch, options: MethodOptions): GaxiosPromise[SchemaTenant] = js.native
  def patch(
    params: ParamsResourceProjectsTenantsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTenant]
  ): Unit = js.native
  /**
    * Updates specified tenant.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/jobs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/jobs',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await jobs.projects.tenants.patch({
    *     // Required during tenant update. The resource name for a tenant. This is generated by the service when a tenant is created. The format is "projects/{project_id\}/tenants/{tenant_id\}", for example, "projects/foo/tenants/bar".
    *     name: 'projects/my-project/tenants/my-tenant',
    *     // Strongly recommended for the best service experience. If update_mask is provided, only the specified fields in tenant are updated. Otherwise all the fields are updated. A field mask to specify the tenant fields to be updated. Only top level fields of Tenant are supported.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "externalId": "my_externalId",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "externalId": "my_externalId",
    *   //   "name": "my_name"
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
  def patch(params: ParamsResourceProjectsTenantsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsTenantsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
