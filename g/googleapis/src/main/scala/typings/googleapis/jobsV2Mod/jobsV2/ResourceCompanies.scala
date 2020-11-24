package typings.googleapis.jobsV2Mod.jobsV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/jobs/v2", "jobs_v2.Resource$Companies")
@js.native
class ResourceCompanies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * jobs.companies.create
    * @desc Creates a new company entity.
    * @alias jobs.companies.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Company} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaCompany] = js.native
  def create(callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def create(params: ParamsResourceCompaniesCreate): GaxiosPromise[SchemaCompany] = js.native
  def create(params: ParamsResourceCompaniesCreate, callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def create(
    params: ParamsResourceCompaniesCreate,
    options: BodyResponseCallback[SchemaCompany],
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  def create(params: ParamsResourceCompaniesCreate, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def create(
    params: ParamsResourceCompaniesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  
  /**
    * jobs.companies.delete
    * @desc Deletes the specified company.
    * @alias jobs.companies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The resource name of the company to be deleted, such as, "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCompaniesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCompaniesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceCompaniesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCompaniesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceCompaniesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * jobs.companies.get
    * @desc Retrieves the specified company.
    * @alias jobs.companies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  Resource name of the company to retrieve, such as "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCompany] = js.native
  def get(callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def get(params: ParamsResourceCompaniesGet): GaxiosPromise[SchemaCompany] = js.native
  def get(params: ParamsResourceCompaniesGet, callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def get(
    params: ParamsResourceCompaniesGet,
    options: BodyResponseCallback[SchemaCompany],
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  def get(params: ParamsResourceCompaniesGet, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def get(
    params: ParamsResourceCompaniesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  
  var jobs: ResourceCompaniesJobs = js.native
  
  /**
    * jobs.companies.list
    * @desc Lists all companies associated with a Cloud Talent Solution
    * account.
    * @alias jobs.companies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.mustHaveOpenJobs Optional.  Set to true if the companies request must have open jobs.  Defaults to false.  If true, at most page_size of companies are fetched, among which only those with open jobs are returned.
    * @param {integer=} params.pageSize Optional.  The maximum number of companies to be returned, at most 100. Default is 100 if a non-positive number is provided.
    * @param {string=} params.pageToken Optional.  The starting indicator from which to return results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListCompaniesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCompaniesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListCompaniesResponse] = js.native
  def list(params: ParamsResourceCompaniesList): GaxiosPromise[SchemaListCompaniesResponse] = js.native
  def list(params: ParamsResourceCompaniesList, callback: BodyResponseCallback[SchemaListCompaniesResponse]): Unit = js.native
  def list(
    params: ParamsResourceCompaniesList,
    options: BodyResponseCallback[SchemaListCompaniesResponse],
    callback: BodyResponseCallback[SchemaListCompaniesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCompaniesList, options: MethodOptions): GaxiosPromise[SchemaListCompaniesResponse] = js.native
  def list(
    params: ParamsResourceCompaniesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCompaniesResponse]
  ): Unit = js.native
  
  /**
    * jobs.companies.patch
    * @desc Updates the specified company. Company names can't be updated. To
    * update a company name, delete the company and all jobs associated with
    * it, and only then re-create them.
    * @alias jobs.companies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required during company update.  The resource name for a company. This is generated by the service when a company is created, for example, "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
    * @param {string=} params.updateCompanyFields Optional but strongly recommended to be provided for the best service experience.  If update_company_fields is provided, only the specified fields in company are updated. Otherwise all the fields are updated.  A field mask to specify the company fields to update. Valid values are:  * displayName * website * imageUrl * companySize * distributorBillingCompanyId * companyInfoSources * careerPageLink * hiringAgency * hqLocation * eeoText * keywordSearchableCustomAttributes * title (deprecated) * keywordSearchableCustomFields (deprecated)
    * @param {().Company} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCompany] = js.native
  def patch(callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def patch(params: ParamsResourceCompaniesPatch): GaxiosPromise[SchemaCompany] = js.native
  def patch(params: ParamsResourceCompaniesPatch, callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def patch(
    params: ParamsResourceCompaniesPatch,
    options: BodyResponseCallback[SchemaCompany],
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  def patch(params: ParamsResourceCompaniesPatch, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def patch(
    params: ParamsResourceCompaniesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
}
