package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/alertcenter/v1beta1", "alertcenter_v1beta1.Resource$Alerts")
@js.native
class ResourceAlerts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * alertcenter.alerts.delete
    * @desc Marks the specified alert for deletion. An alert that has been
    * marked for deletion is removed from Alert Center after 30 days. Marking
    * an alert for deletion has no effect on an alert which has already been
    * marked for deletion. Attempting to mark a nonexistent alert for deletion
    * results in a `NOT_FOUND` error.
    * @alias alertcenter.alerts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alertId Required. The identifier of the alert to delete.
    * @param {string=} params.customerId Optional. The unique identifier of the G Suite organization account of the customer the alert is associated with. Inferred from the caller identity if not provided.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAlertsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAlertsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceAlertsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAlertsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAlertsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  var feedback: ResourceAlertsFeedback = js.native
  
  /**
    * alertcenter.alerts.get
    * @desc Gets the specified alert. Attempting to get a nonexistent alert
    * returns `NOT_FOUND` error.
    * @alias alertcenter.alerts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alertId Required. The identifier of the alert to retrieve.
    * @param {string=} params.customerId Optional. The unique identifier of the G Suite organization account of the customer the alert is associated with. Inferred from the caller identity if not provided.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAlert] = js.native
  def get(callback: BodyResponseCallback[SchemaAlert]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAlert] = js.native
  def get(params: ParamsResourceAlertsGet): GaxiosPromise[SchemaAlert] = js.native
  def get(params: ParamsResourceAlertsGet, callback: BodyResponseCallback[SchemaAlert]): Unit = js.native
  def get(
    params: ParamsResourceAlertsGet,
    options: BodyResponseCallback[SchemaAlert],
    callback: BodyResponseCallback[SchemaAlert]
  ): Unit = js.native
  def get(params: ParamsResourceAlertsGet, options: MethodOptions): GaxiosPromise[SchemaAlert] = js.native
  def get(
    params: ParamsResourceAlertsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlert]
  ): Unit = js.native
  
  /**
    * alertcenter.alerts.list
    * @desc Lists the alerts.
    * @alias alertcenter.alerts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customerId Optional. The unique identifier of the G Suite organization account of the customer the alerts are associated with. Inferred from the caller identity if not provided.
    * @param {string=} params.filter Optional. A query string for filtering alert results. For more details, see [Query filters](/admin-sdk/alertcenter/guides/query-filters) and [Supported query filter fields](/admin-sdk/alertcenter/reference/filter-fields#alerts.list).
    * @param {string=} params.orderBy Optional. The sort order of the list results. If not specified results may be returned in arbitrary order. You can sort the results in descending order based on the creation timestamp using `order_by="create_time desc"`. Currently, only sorting by `create_time desc` is supported.
    * @param {integer=} params.pageSize Optional. The requested page size. Server may return fewer items than requested. If unspecified, server picks an appropriate default.
    * @param {string=} params.pageToken Optional. A token identifying a page of results the server should return. If empty, a new iteration is started. To continue an iteration, pass in the value from the previous ListAlertsResponse's next_page_token field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListAlertsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAlertsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListAlertsResponse] = js.native
  def list(params: ParamsResourceAlertsList): GaxiosPromise[SchemaListAlertsResponse] = js.native
  def list(params: ParamsResourceAlertsList, callback: BodyResponseCallback[SchemaListAlertsResponse]): Unit = js.native
  def list(
    params: ParamsResourceAlertsList,
    options: BodyResponseCallback[SchemaListAlertsResponse],
    callback: BodyResponseCallback[SchemaListAlertsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAlertsList, options: MethodOptions): GaxiosPromise[SchemaListAlertsResponse] = js.native
  def list(
    params: ParamsResourceAlertsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAlertsResponse]
  ): Unit = js.native
  
  /**
    * alertcenter.alerts.undelete
    * @desc Restores, or "undeletes", an alert that was marked for deletion
    * within the past 30 days. Attempting to undelete an alert which was marked
    * for deletion over 30 days ago (which has been removed from the Alert
    * Center database) or a nonexistent alert returns a `NOT_FOUND` error.
    * Attempting to undelete an alert which has not been marked for deletion
    * has no effect.
    * @alias alertcenter.alerts.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alertId Required. The identifier of the alert to undelete.
    * @param {().UndeleteAlertRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[SchemaAlert] = js.native
  def undelete(callback: BodyResponseCallback[SchemaAlert]): Unit = js.native
  def undelete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAlert] = js.native
  def undelete(params: ParamsResourceAlertsUndelete): GaxiosPromise[SchemaAlert] = js.native
  def undelete(params: ParamsResourceAlertsUndelete, callback: BodyResponseCallback[SchemaAlert]): Unit = js.native
  def undelete(
    params: ParamsResourceAlertsUndelete,
    options: BodyResponseCallback[SchemaAlert],
    callback: BodyResponseCallback[SchemaAlert]
  ): Unit = js.native
  def undelete(params: ParamsResourceAlertsUndelete, options: MethodOptions): GaxiosPromise[SchemaAlert] = js.native
  def undelete(
    params: ParamsResourceAlertsUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlert]
  ): Unit = js.native
}
