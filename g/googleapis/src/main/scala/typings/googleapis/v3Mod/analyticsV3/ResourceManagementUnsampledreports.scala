package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Unsampledreports")
@js.native
class ResourceManagementUnsampledreports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * analytics.management.unsampledReports.delete
    * @desc Deletes an unsampled report.
    * @alias analytics.management.unsampledReports.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to delete the unsampled report for.
    * @param {string} params.profileId View (Profile) ID to delete the unsampled report for.
    * @param {string} params.unsampledReportId ID of the unsampled report to be deleted.
    * @param {string} params.webPropertyId Web property ID to delete the unsampled reports for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementUnsampledreportsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementUnsampledreportsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagementUnsampledreportsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementUnsampledreportsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementUnsampledreportsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * analytics.management.unsampledReports.get
    * @desc Returns a single unsampled report.
    * @alias analytics.management.unsampledReports.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve unsampled report for.
    * @param {string} params.profileId View (Profile) ID to retrieve unsampled report for.
    * @param {string} params.unsampledReportId ID of the unsampled report to retrieve.
    * @param {string} params.webPropertyId Web property ID to retrieve unsampled reports for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUnsampledReport] = js.native
  def get(callback: BodyResponseCallback[SchemaUnsampledReport]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUnsampledReport] = js.native
  def get(params: ParamsResourceManagementUnsampledreportsGet): GaxiosPromise[SchemaUnsampledReport] = js.native
  def get(
    params: ParamsResourceManagementUnsampledreportsGet,
    callback: BodyResponseCallback[SchemaUnsampledReport]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagementUnsampledreportsGet,
    options: BodyResponseCallback[SchemaUnsampledReport],
    callback: BodyResponseCallback[SchemaUnsampledReport]
  ): Unit = js.native
  def get(params: ParamsResourceManagementUnsampledreportsGet, options: MethodOptions): GaxiosPromise[SchemaUnsampledReport] = js.native
  def get(
    params: ParamsResourceManagementUnsampledreportsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUnsampledReport]
  ): Unit = js.native
  
  /**
    * analytics.management.unsampledReports.insert
    * @desc Create a new unsampled report.
    * @alias analytics.management.unsampledReports.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create the unsampled report for.
    * @param {string} params.profileId View (Profile) ID to create the unsampled report for.
    * @param {string} params.webPropertyId Web property ID to create the unsampled report for.
    * @param {().UnsampledReport} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaUnsampledReport] = js.native
  def insert(callback: BodyResponseCallback[SchemaUnsampledReport]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUnsampledReport] = js.native
  def insert(params: ParamsResourceManagementUnsampledreportsInsert): GaxiosPromise[SchemaUnsampledReport] = js.native
  def insert(
    params: ParamsResourceManagementUnsampledreportsInsert,
    callback: BodyResponseCallback[SchemaUnsampledReport]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementUnsampledreportsInsert,
    options: BodyResponseCallback[SchemaUnsampledReport],
    callback: BodyResponseCallback[SchemaUnsampledReport]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementUnsampledreportsInsert, options: MethodOptions): GaxiosPromise[SchemaUnsampledReport] = js.native
  def insert(
    params: ParamsResourceManagementUnsampledreportsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUnsampledReport]
  ): Unit = js.native
  
  /**
    * analytics.management.unsampledReports.list
    * @desc Lists unsampled reports to which the user has access.
    * @alias analytics.management.unsampledReports.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve unsampled reports for. Must be a specific account ID, ~all is not supported.
    * @param {integer=} params.max-results The maximum number of unsampled reports to include in this response.
    * @param {string} params.profileId View (Profile) ID to retrieve unsampled reports for. Must be a specific view (profile) ID, ~all is not supported.
    * @param {integer=} params.start-index An index of the first unsampled report to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property ID to retrieve unsampled reports for. Must be a specific web property ID, ~all is not supported.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaUnsampledReports] = js.native
  def list(callback: BodyResponseCallback[SchemaUnsampledReports]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUnsampledReports] = js.native
  def list(params: ParamsResourceManagementUnsampledreportsList): GaxiosPromise[SchemaUnsampledReports] = js.native
  def list(
    params: ParamsResourceManagementUnsampledreportsList,
    callback: BodyResponseCallback[SchemaUnsampledReports]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementUnsampledreportsList,
    options: BodyResponseCallback[SchemaUnsampledReports],
    callback: BodyResponseCallback[SchemaUnsampledReports]
  ): Unit = js.native
  def list(params: ParamsResourceManagementUnsampledreportsList, options: MethodOptions): GaxiosPromise[SchemaUnsampledReports] = js.native
  def list(
    params: ParamsResourceManagementUnsampledreportsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUnsampledReports]
  ): Unit = js.native
}
