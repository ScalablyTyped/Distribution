package typings.googleapis.dlpV2Mod.dlpV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Projects$Dlpjobs")
@js.native
class ResourceProjectsDlpjobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * dlp.projects.dlpJobs.cancel
    * @desc Starts asynchronous cancellation on a long-running DlpJob. The
    * server makes a best effort to cancel the DlpJob, but success is not
    * guaranteed. See https://cloud.google.com/dlp/docs/inspecting-storage and
    * https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.
    * @alias dlp.projects.dlpJobs.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the DlpJob resource to be cancelled.
    * @param {().GooglePrivacyDlpV2CancelDlpJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def cancel(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def cancel(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def cancel(params: ParamsResourceProjectsDlpjobsCancel): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def cancel(
    params: ParamsResourceProjectsDlpjobsCancel,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def cancel(
    params: ParamsResourceProjectsDlpjobsCancel,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def cancel(params: ParamsResourceProjectsDlpjobsCancel, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def cancel(
    params: ParamsResourceProjectsDlpjobsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * dlp.projects.dlpJobs.create
    * @desc Creates a new job to inspect storage or calculate risk metrics. See
    * https://cloud.google.com/dlp/docs/inspecting-storage and
    * https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.
    * When no InfoTypes or CustomInfoTypes are specified in inspect jobs, the
    * system will automatically choose what detectors to run. By default this
    * may be all types, but may change over time as detectors are updated.
    * @alias dlp.projects.dlpJobs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent resource name, for example projects/my-project-id.
    * @param {().GooglePrivacyDlpV2CreateDlpJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def create(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def create(params: ParamsResourceProjectsDlpjobsCreate): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def create(
    params: ParamsResourceProjectsDlpjobsCreate,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsDlpjobsCreate,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsDlpjobsCreate, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def create(
    params: ParamsResourceProjectsDlpjobsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  
  /**
    * dlp.projects.dlpJobs.delete
    * @desc Deletes a long-running DlpJob. This method indicates that the
    * client is no longer interested in the DlpJob result. The job will be
    * cancelled if possible. See
    * https://cloud.google.com/dlp/docs/inspecting-storage and
    * https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.
    * @alias dlp.projects.dlpJobs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the DlpJob resource to be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsDlpjobsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDlpjobsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsDlpjobsDelete,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsDlpjobsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDlpjobsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  
  /**
    * dlp.projects.dlpJobs.get
    * @desc Gets the latest state of a long-running DlpJob. See
    * https://cloud.google.com/dlp/docs/inspecting-storage and
    * https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.
    * @alias dlp.projects.dlpJobs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the DlpJob resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def get(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def get(params: ParamsResourceProjectsDlpjobsGet): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def get(
    params: ParamsResourceProjectsDlpjobsGet,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsDlpjobsGet,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDlpjobsGet, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def get(
    params: ParamsResourceProjectsDlpjobsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  
  /**
    * dlp.projects.dlpJobs.list
    * @desc Lists DlpJobs that match the specified filter in the request. See
    * https://cloud.google.com/dlp/docs/inspecting-storage and
    * https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.
    * @alias dlp.projects.dlpJobs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Optional. Allows filtering.  Supported syntax:  * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `<field> <operator> <value>`. * Supported fields/values for inspect jobs:     - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY     - `trigger_name` - The resource name of the trigger that created job. * Supported fields for risk analysis jobs:     - `state` - RUNNING|CANCELED|FINISHED|FAILED * The operator must be `=` or `!=`.  Examples:  * inspected_storage = cloud_storage AND state = done * inspected_storage = cloud_storage OR inspected_storage = bigquery * inspected_storage = cloud_storage AND (state = done OR state = canceled)  The length of this field should be no more than 500 characters.
    * @param {string=} params.orderBy Optional comma separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case-insensitive, default sorting order is ascending, redundant space characters are insignificant.  Example: `name asc, end_time asc, create_time desc`  Supported fields are:  - `create_time`: corresponds to time the job was created. - `end_time`: corresponds to time the job ended. - `name`: corresponds to job's name. - `state`: corresponds to `state`
    * @param {integer=} params.pageSize The standard list page size.
    * @param {string=} params.pageToken The standard list page token.
    * @param {string} params.parent The parent resource name, for example projects/my-project-id.
    * @param {string=} params.type The type of job. Defaults to `DlpJobType.INSPECT`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGooglePrivacyDlpV2ListDlpJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListDlpJobsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListDlpJobsResponse] = js.native
  def list(params: ParamsResourceProjectsDlpjobsList): GaxiosPromise[SchemaGooglePrivacyDlpV2ListDlpJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDlpjobsList,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListDlpJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDlpjobsList,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListDlpJobsResponse],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListDlpJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDlpjobsList, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListDlpJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDlpjobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListDlpJobsResponse]
  ): Unit = js.native
}
