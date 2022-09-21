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

@JSImport("googleapis/build/src/apis/jobs/v4", "jobs_v4.Resource$Projects$Tenants$Companies")
@js.native
open class ResourceProjectsTenantsCompanies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCompany] = js.native
  def create(callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def create(params: ParamsResourceProjectsTenantsCompaniesCreate): GaxiosPromise[SchemaCompany] = js.native
  def create(
    params: ParamsResourceProjectsTenantsCompaniesCreate,
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsTenantsCompaniesCreate,
    options: BodyResponseCallback[Readable | SchemaCompany],
    callback: BodyResponseCallback[Readable | SchemaCompany]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsTenantsCompaniesCreate, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def create(
    params: ParamsResourceProjectsTenantsCompaniesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  /**
    * Creates a new company entity.
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
    *   const res = await jobs.projects.tenants.companies.create({
    *     // Required. Resource name of the tenant under which the company is created. The format is "projects/{project_id\}/tenants/{tenant_id\}", for example, "projects/foo/tenants/bar".
    *     parent: 'projects/my-project/tenants/my-tenant',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "careerSiteUri": "my_careerSiteUri",
    *       //   "derivedInfo": {},
    *       //   "displayName": "my_displayName",
    *       //   "eeoText": "my_eeoText",
    *       //   "externalId": "my_externalId",
    *       //   "headquartersAddress": "my_headquartersAddress",
    *       //   "hiringAgency": false,
    *       //   "imageUri": "my_imageUri",
    *       //   "keywordSearchableJobCustomAttributes": [],
    *       //   "name": "my_name",
    *       //   "size": "my_size",
    *       //   "suspended": false,
    *       //   "websiteUri": "my_websiteUri"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "careerSiteUri": "my_careerSiteUri",
    *   //   "derivedInfo": {},
    *   //   "displayName": "my_displayName",
    *   //   "eeoText": "my_eeoText",
    *   //   "externalId": "my_externalId",
    *   //   "headquartersAddress": "my_headquartersAddress",
    *   //   "hiringAgency": false,
    *   //   "imageUri": "my_imageUri",
    *   //   "keywordSearchableJobCustomAttributes": [],
    *   //   "name": "my_name",
    *   //   "size": "my_size",
    *   //   "suspended": false,
    *   //   "websiteUri": "my_websiteUri"
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
  def create(params: ParamsResourceProjectsTenantsCompaniesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsTenantsCompaniesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsTenantsCompaniesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsTenantsCompaniesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsTenantsCompaniesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsTenantsCompaniesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsTenantsCompaniesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes specified company. Prerequisite: The company has no jobs associated with it.
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
    *   const res = await jobs.projects.tenants.companies.delete({
    *     // Required. The resource name of the company to be deleted. The format is "projects/{project_id\}/tenants/{tenant_id\}/companies/{company_id\}", for example, "projects/foo/tenants/bar/companies/baz".
    *     name: 'projects/my-project/tenants/my-tenant/companies/my-companie',
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
  def delete(params: ParamsResourceProjectsTenantsCompaniesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsTenantsCompaniesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCompany] = js.native
  def get(callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def get(params: ParamsResourceProjectsTenantsCompaniesGet): GaxiosPromise[SchemaCompany] = js.native
  def get(params: ParamsResourceProjectsTenantsCompaniesGet, callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def get(
    params: ParamsResourceProjectsTenantsCompaniesGet,
    options: BodyResponseCallback[Readable | SchemaCompany],
    callback: BodyResponseCallback[Readable | SchemaCompany]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsTenantsCompaniesGet, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def get(
    params: ParamsResourceProjectsTenantsCompaniesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  /**
    * Retrieves specified company.
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
    *   const res = await jobs.projects.tenants.companies.get({
    *     // Required. The resource name of the company to be retrieved. The format is "projects/{project_id\}/tenants/{tenant_id\}/companies/{company_id\}", for example, "projects/api-test-project/tenants/foo/companies/bar".
    *     name: 'projects/my-project/tenants/my-tenant/companies/my-companie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "careerSiteUri": "my_careerSiteUri",
    *   //   "derivedInfo": {},
    *   //   "displayName": "my_displayName",
    *   //   "eeoText": "my_eeoText",
    *   //   "externalId": "my_externalId",
    *   //   "headquartersAddress": "my_headquartersAddress",
    *   //   "hiringAgency": false,
    *   //   "imageUri": "my_imageUri",
    *   //   "keywordSearchableJobCustomAttributes": [],
    *   //   "name": "my_name",
    *   //   "size": "my_size",
    *   //   "suspended": false,
    *   //   "websiteUri": "my_websiteUri"
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
  def get(params: ParamsResourceProjectsTenantsCompaniesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsTenantsCompaniesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCompaniesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCompaniesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCompaniesResponse] = js.native
  def list(params: ParamsResourceProjectsTenantsCompaniesList): GaxiosPromise[SchemaListCompaniesResponse] = js.native
  def list(
    params: ParamsResourceProjectsTenantsCompaniesList,
    callback: BodyResponseCallback[SchemaListCompaniesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsTenantsCompaniesList,
    options: BodyResponseCallback[Readable | SchemaListCompaniesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCompaniesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTenantsCompaniesList, options: MethodOptions): GaxiosPromise[SchemaListCompaniesResponse] = js.native
  def list(
    params: ParamsResourceProjectsTenantsCompaniesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCompaniesResponse]
  ): Unit = js.native
  /**
    * Lists all companies associated with the project.
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
    *   const res = await jobs.projects.tenants.companies.list({
    *     // The maximum number of companies to be returned, at most 100. Default is 100 if a non-positive number is provided.
    *     pageSize: 'placeholder-value',
    *     // The starting indicator from which to return results.
    *     pageToken: 'placeholder-value',
    *     // Required. Resource name of the tenant under which the company is created. The format is "projects/{project_id\}/tenants/{tenant_id\}", for example, "projects/foo/tenants/bar".
    *     parent: 'projects/my-project/tenants/my-tenant',
    *     // Set to true if the companies requested must have open jobs. Defaults to false. If true, at most page_size of companies are fetched, among which only those with open jobs are returned.
    *     requireOpenJobs: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "companies": [],
    *   //   "metadata": {},
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
  def list(params: ParamsResourceProjectsTenantsCompaniesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsTenantsCompaniesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCompany] = js.native
  def patch(callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def patch(params: ParamsResourceProjectsTenantsCompaniesPatch): GaxiosPromise[SchemaCompany] = js.native
  def patch(params: ParamsResourceProjectsTenantsCompaniesPatch, callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsTenantsCompaniesPatch,
    options: BodyResponseCallback[Readable | SchemaCompany],
    callback: BodyResponseCallback[Readable | SchemaCompany]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsTenantsCompaniesPatch, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def patch(
    params: ParamsResourceProjectsTenantsCompaniesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  /**
    * Updates specified company.
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
    *   const res = await jobs.projects.tenants.companies.patch({
    *     // Required during company update. The resource name for a company. This is generated by the service when a company is created. The format is "projects/{project_id\}/tenants/{tenant_id\}/companies/{company_id\}", for example, "projects/foo/tenants/bar/companies/baz".
    *     name: 'projects/my-project/tenants/my-tenant/companies/my-companie',
    *     // Strongly recommended for the best service experience. If update_mask is provided, only the specified fields in company are updated. Otherwise all the fields are updated. A field mask to specify the company fields to be updated. Only top level fields of Company are supported.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "careerSiteUri": "my_careerSiteUri",
    *       //   "derivedInfo": {},
    *       //   "displayName": "my_displayName",
    *       //   "eeoText": "my_eeoText",
    *       //   "externalId": "my_externalId",
    *       //   "headquartersAddress": "my_headquartersAddress",
    *       //   "hiringAgency": false,
    *       //   "imageUri": "my_imageUri",
    *       //   "keywordSearchableJobCustomAttributes": [],
    *       //   "name": "my_name",
    *       //   "size": "my_size",
    *       //   "suspended": false,
    *       //   "websiteUri": "my_websiteUri"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "careerSiteUri": "my_careerSiteUri",
    *   //   "derivedInfo": {},
    *   //   "displayName": "my_displayName",
    *   //   "eeoText": "my_eeoText",
    *   //   "externalId": "my_externalId",
    *   //   "headquartersAddress": "my_headquartersAddress",
    *   //   "hiringAgency": false,
    *   //   "imageUri": "my_imageUri",
    *   //   "keywordSearchableJobCustomAttributes": [],
    *   //   "name": "my_name",
    *   //   "size": "my_size",
    *   //   "suspended": false,
    *   //   "websiteUri": "my_websiteUri"
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
  def patch(params: ParamsResourceProjectsTenantsCompaniesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsTenantsCompaniesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
