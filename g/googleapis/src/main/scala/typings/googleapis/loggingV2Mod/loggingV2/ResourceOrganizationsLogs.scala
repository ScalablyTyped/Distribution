package typings.googleapis.loggingV2Mod.loggingV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Organizations$Logs")
@js.native
class ResourceOrganizationsLogs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * logging.organizations.logs.delete
    * @desc Deletes all the log entries in a log. The log reappears if it
    * receives new entries. Log entries written shortly before the delete
    * operation might not be deleted.
    * @alias logging.organizations.logs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.logName Required. The resource name of the log to delete: "projects/[PROJECT_ID]/logs/[LOG_ID]" "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]" "folders/[FOLDER_ID]/logs/[LOG_ID]" [LOG_ID] must be URL-encoded. For example, "projects/my-project-id/logs/syslog", "organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity". For more information about log names, see LogEntry.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceOrganizationsLogsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceOrganizationsLogsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceOrganizationsLogsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceOrganizationsLogsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsLogsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * logging.organizations.logs.list
    * @desc Lists the logs in projects, organizations, folders, or billing
    * accounts. Only logs that have entries are listed.
    * @alias logging.organizations.logs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
    * @param {string=} params.pageToken Optional. If present, then retrieve the next batch of results from the preceding call to this method. pageToken must be the value of nextPageToken from the previous response. The values of other method parameters should be identical to those in the previous call.
    * @param {string} params.parent Required. The resource name that owns the logs: "projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListLogsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLogsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListLogsResponse] = js.native
  def list(params: ParamsResourceOrganizationsLogsList): GaxiosPromise[SchemaListLogsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsLogsList,
    callback: BodyResponseCallback[SchemaListLogsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsLogsList,
    options: BodyResponseCallback[SchemaListLogsResponse],
    callback: BodyResponseCallback[SchemaListLogsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsLogsList, options: MethodOptions): GaxiosPromise[SchemaListLogsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsLogsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLogsResponse]
  ): Unit = js.native
}

