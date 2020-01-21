package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtubereporting/v1", "youtubereporting_v1.Resource$Jobs")
@js.native
class ResourceJobs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var reports: ResourceJobsReports = js.native
  /**
    * youtubereporting.jobs.create
    * @desc Creates a job and returns it.
    * @alias youtubereporting.jobs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
    * @param {().Job} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaJob] = js.native
  def create(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def create(params: ParamsResourceJobsCreate): GaxiosPromise[SchemaJob] = js.native
  def create(params: ParamsResourceJobsCreate, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def create(
    params: ParamsResourceJobsCreate,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def create(params: ParamsResourceJobsCreate, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def create(
    params: ParamsResourceJobsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * youtubereporting.jobs.delete
    * @desc Deletes a job.
    * @alias youtubereporting.jobs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The ID of the job to delete.
    * @param {string=} params.onBehalfOfContentOwner The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceJobsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceJobsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceJobsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceJobsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceJobsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * youtubereporting.jobs.get
    * @desc Gets a job.
    * @alias youtubereporting.jobs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The ID of the job to retrieve.
    * @param {string=} params.onBehalfOfContentOwner The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaJob] = js.native
  def get(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(params: ParamsResourceJobsGet): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceJobsGet, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(
    params: ParamsResourceJobsGet,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def get(params: ParamsResourceJobsGet, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceJobsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  /**
    * youtubereporting.jobs.list
    * @desc Lists jobs.
    * @alias youtubereporting.jobs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeSystemManaged If set to true, also system-managed jobs will be returned; otherwise only user-created jobs will be returned. System-managed jobs can neither be modified nor deleted.
    * @param {string=} params.onBehalfOfContentOwner The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
    * @param {integer=} params.pageSize Requested page size. Server may return fewer jobs than requested. If unspecified, server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListReportTypesResponse.next_page_token returned in response to the previous call to the `ListJobs` method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListJobsResponse]): Unit = js.native
  def list(params: ParamsResourceJobsList): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(params: ParamsResourceJobsList, callback: BodyResponseCallback[SchemaListJobsResponse]): Unit = js.native
  def list(
    params: ParamsResourceJobsList,
    options: BodyResponseCallback[SchemaListJobsResponse],
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceJobsList, options: MethodOptions): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(
    params: ParamsResourceJobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
}

