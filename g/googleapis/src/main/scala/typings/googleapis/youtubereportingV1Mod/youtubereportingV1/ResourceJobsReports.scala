package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtubereporting/v1", "youtubereporting_v1.Resource$Jobs$Reports")
@js.native
class ResourceJobsReports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtubereporting.jobs.reports.get
    * @desc Gets the metadata of a specific report.
    * @alias youtubereporting.jobs.reports.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The ID of the job.
    * @param {string=} params.onBehalfOfContentOwner The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
    * @param {string} params.reportId The ID of the report to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaReport] = js.native
  def get(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def get(params: ParamsResourceJobsReportsGet): GaxiosPromise[SchemaReport] = js.native
  def get(params: ParamsResourceJobsReportsGet, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def get(
    params: ParamsResourceJobsReportsGet,
    options: BodyResponseCallback[SchemaReport],
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  def get(params: ParamsResourceJobsReportsGet, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def get(
    params: ParamsResourceJobsReportsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  
  /**
    * youtubereporting.jobs.reports.list
    * @desc Lists reports created by a specific job. Returns NOT_FOUND if the
    * job does not exist.
    * @alias youtubereporting.jobs.reports.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.createdAfter If set, only reports created after the specified date/time are returned.
    * @param {string} params.jobId The ID of the job.
    * @param {string=} params.onBehalfOfContentOwner The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
    * @param {integer=} params.pageSize Requested page size. Server may return fewer report types than requested. If unspecified, server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListReportsResponse.next_page_token returned in response to the previous call to the `ListReports` method.
    * @param {string=} params.startTimeAtOrAfter If set, only reports whose start time is greater than or equal the specified date/time are returned.
    * @param {string=} params.startTimeBefore If set, only reports whose start time is smaller than the specified date/time are returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListReportsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReportsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListReportsResponse] = js.native
  def list(params: ParamsResourceJobsReportsList): GaxiosPromise[SchemaListReportsResponse] = js.native
  def list(params: ParamsResourceJobsReportsList, callback: BodyResponseCallback[SchemaListReportsResponse]): Unit = js.native
  def list(
    params: ParamsResourceJobsReportsList,
    options: BodyResponseCallback[SchemaListReportsResponse],
    callback: BodyResponseCallback[SchemaListReportsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceJobsReportsList, options: MethodOptions): GaxiosPromise[SchemaListReportsResponse] = js.native
  def list(
    params: ParamsResourceJobsReportsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReportsResponse]
  ): Unit = js.native
}
