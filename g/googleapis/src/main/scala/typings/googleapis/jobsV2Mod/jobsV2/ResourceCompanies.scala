package typings.googleapis.jobsV2Mod.jobsV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/jobs/v2", "jobs_v2.Resource$Companies")
@js.native
open class ResourceCompanies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCompany] = js.native
  def create(callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def create(params: ParamsResourceCompaniesCreate): GaxiosPromise[SchemaCompany] = js.native
  def create(params: ParamsResourceCompaniesCreate, callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def create(
    params: ParamsResourceCompaniesCreate,
    options: BodyResponseCallback[Readable | SchemaCompany],
    callback: BodyResponseCallback[Readable | SchemaCompany]
  ): Unit = js.native
  def create(params: ParamsResourceCompaniesCreate, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def create(
    params: ParamsResourceCompaniesCreate,
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
    * const jobs = google.jobs('v2');
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
    *   const res = await jobs.companies.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "careerPageLink": "my_careerPageLink",
    *       //   "companyInfoSources": [],
    *       //   "companySize": "my_companySize",
    *       //   "disableLocationOptimization": false,
    *       //   "displayName": "my_displayName",
    *       //   "distributorBillingCompanyId": "my_distributorBillingCompanyId",
    *       //   "distributorCompanyId": "my_distributorCompanyId",
    *       //   "eeoText": "my_eeoText",
    *       //   "hiringAgency": false,
    *       //   "hqLocation": "my_hqLocation",
    *       //   "imageUrl": "my_imageUrl",
    *       //   "keywordSearchableCustomAttributes": [],
    *       //   "keywordSearchableCustomFields": [],
    *       //   "name": "my_name",
    *       //   "structuredCompanyHqLocation": {},
    *       //   "suspended": false,
    *       //   "title": "my_title",
    *       //   "website": "my_website"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "careerPageLink": "my_careerPageLink",
    *   //   "companyInfoSources": [],
    *   //   "companySize": "my_companySize",
    *   //   "disableLocationOptimization": false,
    *   //   "displayName": "my_displayName",
    *   //   "distributorBillingCompanyId": "my_distributorBillingCompanyId",
    *   //   "distributorCompanyId": "my_distributorCompanyId",
    *   //   "eeoText": "my_eeoText",
    *   //   "hiringAgency": false,
    *   //   "hqLocation": "my_hqLocation",
    *   //   "imageUrl": "my_imageUrl",
    *   //   "keywordSearchableCustomAttributes": [],
    *   //   "keywordSearchableCustomFields": [],
    *   //   "name": "my_name",
    *   //   "structuredCompanyHqLocation": {},
    *   //   "suspended": false,
    *   //   "title": "my_title",
    *   //   "website": "my_website"
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
  def create(params: ParamsResourceCompaniesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCompaniesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCompaniesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCompaniesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceCompaniesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCompaniesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceCompaniesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified company.
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
    * const jobs = google.jobs('v2');
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
    *   const res = await jobs.companies.delete({
    *     // Required. The resource name of the company to be deleted, such as, "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
    *     name: 'companies/my-companie',
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
  def delete(params: ParamsResourceCompaniesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCompaniesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCompany] = js.native
  def get(callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def get(params: ParamsResourceCompaniesGet): GaxiosPromise[SchemaCompany] = js.native
  def get(params: ParamsResourceCompaniesGet, callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def get(
    params: ParamsResourceCompaniesGet,
    options: BodyResponseCallback[Readable | SchemaCompany],
    callback: BodyResponseCallback[Readable | SchemaCompany]
  ): Unit = js.native
  def get(params: ParamsResourceCompaniesGet, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def get(
    params: ParamsResourceCompaniesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  /**
    * Retrieves the specified company.
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
    * const jobs = google.jobs('v2');
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
    *   const res = await jobs.companies.get({
    *     // Required. Resource name of the company to retrieve, such as "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
    *     name: 'companies/my-companie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "careerPageLink": "my_careerPageLink",
    *   //   "companyInfoSources": [],
    *   //   "companySize": "my_companySize",
    *   //   "disableLocationOptimization": false,
    *   //   "displayName": "my_displayName",
    *   //   "distributorBillingCompanyId": "my_distributorBillingCompanyId",
    *   //   "distributorCompanyId": "my_distributorCompanyId",
    *   //   "eeoText": "my_eeoText",
    *   //   "hiringAgency": false,
    *   //   "hqLocation": "my_hqLocation",
    *   //   "imageUrl": "my_imageUrl",
    *   //   "keywordSearchableCustomAttributes": [],
    *   //   "keywordSearchableCustomFields": [],
    *   //   "name": "my_name",
    *   //   "structuredCompanyHqLocation": {},
    *   //   "suspended": false,
    *   //   "title": "my_title",
    *   //   "website": "my_website"
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
  def get(params: ParamsResourceCompaniesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCompaniesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var jobs: ResourceCompaniesJobs = js.native
  
  def list(): GaxiosPromise[SchemaListCompaniesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCompaniesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCompaniesResponse] = js.native
  def list(params: ParamsResourceCompaniesList): GaxiosPromise[SchemaListCompaniesResponse] = js.native
  def list(params: ParamsResourceCompaniesList, callback: BodyResponseCallback[SchemaListCompaniesResponse]): Unit = js.native
  def list(
    params: ParamsResourceCompaniesList,
    options: BodyResponseCallback[Readable | SchemaListCompaniesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCompaniesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCompaniesList, options: MethodOptions): GaxiosPromise[SchemaListCompaniesResponse] = js.native
  def list(
    params: ParamsResourceCompaniesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCompaniesResponse]
  ): Unit = js.native
  /**
    * Lists all companies associated with a Cloud Talent Solution account.
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
    * const jobs = google.jobs('v2');
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
    *   const res = await jobs.companies.list({
    *     // Optional. Set to true if the companies request must have open jobs. Defaults to false. If true, at most page_size of companies are fetched, among which only those with open jobs are returned.
    *     mustHaveOpenJobs: 'placeholder-value',
    *     // Optional. The maximum number of companies to be returned, at most 100. Default is 100 if a non-positive number is provided.
    *     pageSize: 'placeholder-value',
    *     // Optional. The starting indicator from which to return results.
    *     pageToken: 'placeholder-value',
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
  def list(params: ParamsResourceCompaniesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCompaniesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCompany] = js.native
  def patch(callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def patch(params: ParamsResourceCompaniesPatch): GaxiosPromise[SchemaCompany] = js.native
  def patch(params: ParamsResourceCompaniesPatch, callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def patch(
    params: ParamsResourceCompaniesPatch,
    options: BodyResponseCallback[Readable | SchemaCompany],
    callback: BodyResponseCallback[Readable | SchemaCompany]
  ): Unit = js.native
  def patch(params: ParamsResourceCompaniesPatch, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def patch(
    params: ParamsResourceCompaniesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  /**
    * Updates the specified company. Company names can't be updated. To update a company name, delete the company and all jobs associated with it, and only then re-create them.
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
    * const jobs = google.jobs('v2');
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
    *   const res = await jobs.companies.patch({
    *     // Required during company update. The resource name for a company. This is generated by the service when a company is created, for example, "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
    *     name: 'companies/my-companie',
    *     // Optional but strongly recommended to be provided for the best service experience. If update_company_fields is provided, only the specified fields in company are updated. Otherwise all the fields are updated. A field mask to specify the company fields to update. Valid values are: * displayName * website * imageUrl * companySize * distributorBillingCompanyId * companyInfoSources * careerPageLink * hiringAgency * hqLocation * eeoText * keywordSearchableCustomAttributes * title (deprecated) * keywordSearchableCustomFields (deprecated)
    *     updateCompanyFields: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "careerPageLink": "my_careerPageLink",
    *       //   "companyInfoSources": [],
    *       //   "companySize": "my_companySize",
    *       //   "disableLocationOptimization": false,
    *       //   "displayName": "my_displayName",
    *       //   "distributorBillingCompanyId": "my_distributorBillingCompanyId",
    *       //   "distributorCompanyId": "my_distributorCompanyId",
    *       //   "eeoText": "my_eeoText",
    *       //   "hiringAgency": false,
    *       //   "hqLocation": "my_hqLocation",
    *       //   "imageUrl": "my_imageUrl",
    *       //   "keywordSearchableCustomAttributes": [],
    *       //   "keywordSearchableCustomFields": [],
    *       //   "name": "my_name",
    *       //   "structuredCompanyHqLocation": {},
    *       //   "suspended": false,
    *       //   "title": "my_title",
    *       //   "website": "my_website"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "careerPageLink": "my_careerPageLink",
    *   //   "companyInfoSources": [],
    *   //   "companySize": "my_companySize",
    *   //   "disableLocationOptimization": false,
    *   //   "displayName": "my_displayName",
    *   //   "distributorBillingCompanyId": "my_distributorBillingCompanyId",
    *   //   "distributorCompanyId": "my_distributorCompanyId",
    *   //   "eeoText": "my_eeoText",
    *   //   "hiringAgency": false,
    *   //   "hqLocation": "my_hqLocation",
    *   //   "imageUrl": "my_imageUrl",
    *   //   "keywordSearchableCustomAttributes": [],
    *   //   "keywordSearchableCustomFields": [],
    *   //   "name": "my_name",
    *   //   "structuredCompanyHqLocation": {},
    *   //   "suspended": false,
    *   //   "title": "my_title",
    *   //   "website": "my_website"
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
  def patch(params: ParamsResourceCompaniesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCompaniesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
