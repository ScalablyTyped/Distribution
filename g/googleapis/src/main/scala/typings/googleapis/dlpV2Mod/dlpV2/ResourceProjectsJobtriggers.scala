package typings.googleapis.dlpV2Mod.dlpV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Projects$Jobtriggers")
@js.native
class ResourceProjectsJobtriggers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dlp.projects.jobTriggers.activate
    * @desc Activate a job trigger. Causes the immediate execute of a trigger
    * instead of waiting on the trigger event to occur.
    * @alias dlp.projects.jobTriggers.activate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the trigger to activate, for example `projects/dlp-test-project/jobTriggers/53234423`.
    * @param {().GooglePrivacyDlpV2ActivateJobTriggerRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def activate(): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def activate(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]): Unit = js.native
  def activate(params: ParamsResourceProjectsJobtriggersActivate): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def activate(
    params: ParamsResourceProjectsJobtriggersActivate,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  def activate(
    params: ParamsResourceProjectsJobtriggersActivate,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  def activate(params: ParamsResourceProjectsJobtriggersActivate, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def activate(
    params: ParamsResourceProjectsJobtriggersActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  /**
    * dlp.projects.jobTriggers.create
    * @desc Creates a job trigger to run DLP actions such as scanning storage
    * for sensitive information on a set schedule. See
    * https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.
    * @alias dlp.projects.jobTriggers.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent resource name, for example projects/my-project-id.
    * @param {().GooglePrivacyDlpV2CreateJobTriggerRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def create(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]): Unit = js.native
  def create(params: ParamsResourceProjectsJobtriggersCreate): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def create(
    params: ParamsResourceProjectsJobtriggersCreate,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsJobtriggersCreate,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsJobtriggersCreate, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def create(
    params: ParamsResourceProjectsJobtriggersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  /**
    * dlp.projects.jobTriggers.delete
    * @desc Deletes a job trigger. See
    * https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.
    * @alias dlp.projects.jobTriggers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the project and the triggeredJob, for example `projects/dlp-test-project/jobTriggers/53234423`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: ParamsResourceProjectsJobtriggersDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsJobtriggersDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsJobtriggersDelete,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsJobtriggersDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsJobtriggersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * dlp.projects.jobTriggers.get
    * @desc Gets a job trigger. See
    * https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.
    * @alias dlp.projects.jobTriggers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the project and the triggeredJob, for example `projects/dlp-test-project/jobTriggers/53234423`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def get(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]): Unit = js.native
  def get(params: ParamsResourceProjectsJobtriggersGet): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def get(
    params: ParamsResourceProjectsJobtriggersGet,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsJobtriggersGet,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsJobtriggersGet, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def get(
    params: ParamsResourceProjectsJobtriggersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  /**
    * dlp.projects.jobTriggers.list
    * @desc Lists job triggers. See
    * https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.
    * @alias dlp.projects.jobTriggers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Optional. Allows filtering.  Supported syntax:  * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `<field> <operator> <value>`. * Supported fields/values for inspect jobs:     - `status` - HEALTHY|PAUSED|CANCELLED     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY     - 'last_run_time` - RFC 3339 formatted timestamp, surrounded by     quotation marks. Nanoseconds are ignored.     - 'error_count' - Number of errors that have occurred while running. * The operator must be `=` or `!=` for status and inspected_storage.  Examples:  * inspected_storage = cloud_storage AND status = HEALTHY * inspected_storage = cloud_storage OR inspected_storage = bigquery * inspected_storage = cloud_storage AND (state = PAUSED OR state = HEALTHY) * last_run_time > \"2017-12-12T00:00:00+00:00\"  The length of this field should be no more than 500 characters.
    * @param {string=} params.orderBy Optional comma separated list of triggeredJob fields to order by, followed by `asc` or `desc` postfix. This list is case-insensitive, default sorting order is ascending, redundant space characters are insignificant.  Example: `name asc,update_time, create_time desc`  Supported fields are:  - `create_time`: corresponds to time the JobTrigger was created. - `update_time`: corresponds to time the JobTrigger was last updated. - `last_run_time`: corresponds to the last time the JobTrigger ran. - `name`: corresponds to JobTrigger's name. - `display_name`: corresponds to JobTrigger's display name. - `status`: corresponds to JobTrigger's status.
    * @param {integer=} params.pageSize Optional size of the page, can be limited by a server.
    * @param {string=} params.pageToken Optional page token to continue retrieval. Comes from previous call to ListJobTriggers. `order_by` field must not change for subsequent calls.
    * @param {string} params.parent The parent resource name, for example `projects/my-project-id`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGooglePrivacyDlpV2ListJobTriggersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListJobTriggersResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsJobtriggersList): GaxiosPromise[SchemaGooglePrivacyDlpV2ListJobTriggersResponse] = js.native
  def list(
    params: ParamsResourceProjectsJobtriggersList,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListJobTriggersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsJobtriggersList,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListJobTriggersResponse],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListJobTriggersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsJobtriggersList, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListJobTriggersResponse] = js.native
  def list(
    params: ParamsResourceProjectsJobtriggersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListJobTriggersResponse]
  ): Unit = js.native
  /**
    * dlp.projects.jobTriggers.patch
    * @desc Updates a job trigger. See
    * https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.
    * @alias dlp.projects.jobTriggers.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the project and the triggeredJob, for example `projects/dlp-test-project/jobTriggers/53234423`.
    * @param {().GooglePrivacyDlpV2UpdateJobTriggerRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def patch(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]): Unit = js.native
  def patch(params: ParamsResourceProjectsJobtriggersPatch): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def patch(
    params: ParamsResourceProjectsJobtriggersPatch,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsJobtriggersPatch,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsJobtriggersPatch, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def patch(
    params: ParamsResourceProjectsJobtriggersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
}

