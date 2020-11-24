package typings.googleapis.jobsV3Mod.jobsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/jobs/v3", "jobs_v3.Resource$Projects$Companies")
@js.native
class ResourceProjectsCompanies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * jobs.projects.companies.create
    * @desc Creates a new company entity.
    * @alias jobs.projects.companies.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required.  Resource name of the project under which the company is created.  The format is "projects/{project_id}", for example, "projects/api-test-project".
    * @param {().CreateCompanyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaCompany] = js.native
  def create(callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def create(params: ParamsResourceProjectsCompaniesCreate): GaxiosPromise[SchemaCompany] = js.native
  def create(params: ParamsResourceProjectsCompaniesCreate, callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def create(
    params: ParamsResourceProjectsCompaniesCreate,
    options: BodyResponseCallback[SchemaCompany],
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsCompaniesCreate, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def create(
    params: ParamsResourceProjectsCompaniesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  
  /**
    * jobs.projects.companies.delete
    * @desc Deletes specified company. Prerequisite: The company has no jobs
    * associated with it.
    * @alias jobs.projects.companies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The resource name of the company to be deleted.  The format is "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-project/companies/foo".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsCompaniesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsCompaniesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsCompaniesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsCompaniesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsCompaniesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * jobs.projects.companies.get
    * @desc Retrieves specified company.
    * @alias jobs.projects.companies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The resource name of the company to be retrieved.  The format is "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-project/companies/foo".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCompany] = js.native
  def get(callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def get(params: ParamsResourceProjectsCompaniesGet): GaxiosPromise[SchemaCompany] = js.native
  def get(params: ParamsResourceProjectsCompaniesGet, callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def get(
    params: ParamsResourceProjectsCompaniesGet,
    options: BodyResponseCallback[SchemaCompany],
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsCompaniesGet, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def get(
    params: ParamsResourceProjectsCompaniesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  
  /**
    * jobs.projects.companies.list
    * @desc Lists all companies associated with the service account.
    * @alias jobs.projects.companies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional.  The maximum number of companies to be returned, at most 100. Default is 100 if a non-positive number is provided.
    * @param {string=} params.pageToken Optional.  The starting indicator from which to return results.
    * @param {string} params.parent Required.  Resource name of the project under which the company is created.  The format is "projects/{project_id}", for example, "projects/api-test-project".
    * @param {boolean=} params.requireOpenJobs Optional.  Set to true if the companies requested must have open jobs.  Defaults to false.  If true, at most page_size of companies are fetched, among which only those with open jobs are returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListCompaniesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCompaniesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListCompaniesResponse] = js.native
  def list(params: ParamsResourceProjectsCompaniesList): GaxiosPromise[SchemaListCompaniesResponse] = js.native
  def list(
    params: ParamsResourceProjectsCompaniesList,
    callback: BodyResponseCallback[SchemaListCompaniesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsCompaniesList,
    options: BodyResponseCallback[SchemaListCompaniesResponse],
    callback: BodyResponseCallback[SchemaListCompaniesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsCompaniesList, options: MethodOptions): GaxiosPromise[SchemaListCompaniesResponse] = js.native
  def list(
    params: ParamsResourceProjectsCompaniesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCompaniesResponse]
  ): Unit = js.native
  
  /**
    * jobs.projects.companies.patch
    * @desc Updates specified company. Company names can't be updated. To
    * update a company name, delete the company and all jobs associated with
    * it, and only then re-create them.
    * @alias jobs.projects.companies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required during company update.  The resource name for a company. This is generated by the service when a company is created.  The format is "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-project/companies/foo".
    * @param {().UpdateCompanyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCompany] = js.native
  def patch(callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def patch(params: ParamsResourceProjectsCompaniesPatch): GaxiosPromise[SchemaCompany] = js.native
  def patch(params: ParamsResourceProjectsCompaniesPatch, callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsCompaniesPatch,
    options: BodyResponseCallback[SchemaCompany],
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsCompaniesPatch, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def patch(
    params: ParamsResourceProjectsCompaniesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
}
