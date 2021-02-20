package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/alertcenter/v1beta1", "alertcenter_v1beta1.Resource$Alerts$Feedback")
@js.native
class ResourceAlertsFeedback protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * alertcenter.alerts.feedback.create
    * @desc Creates new feedback for an alert. Attempting to create a feedback
    * for a non-existent alert returns `NOT_FOUND` error.
    * @alias alertcenter.alerts.feedback.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alertId Required. The identifier of the alert this feedback belongs to.
    * @param {string=} params.customerId Optional. The unique identifier of the G Suite organization account of the customer the alert is associated with. Inferred from the caller identity if not provided.
    * @param {().AlertFeedback} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaAlertFeedback] = js.native
  def create(callback: BodyResponseCallback[SchemaAlertFeedback]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAlertFeedback] = js.native
  def create(params: ParamsResourceAlertsFeedbackCreate): GaxiosPromise[SchemaAlertFeedback] = js.native
  def create(params: ParamsResourceAlertsFeedbackCreate, callback: BodyResponseCallback[SchemaAlertFeedback]): Unit = js.native
  def create(
    params: ParamsResourceAlertsFeedbackCreate,
    options: BodyResponseCallback[SchemaAlertFeedback],
    callback: BodyResponseCallback[SchemaAlertFeedback]
  ): Unit = js.native
  def create(params: ParamsResourceAlertsFeedbackCreate, options: MethodOptions): GaxiosPromise[SchemaAlertFeedback] = js.native
  def create(
    params: ParamsResourceAlertsFeedbackCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlertFeedback]
  ): Unit = js.native
  
  /**
    * alertcenter.alerts.feedback.list
    * @desc Lists all the feedback for an alert. Attempting to list feedbacks
    * for a non-existent alert returns `NOT_FOUND` error.
    * @alias alertcenter.alerts.feedback.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alertId Required. The alert identifier. The "-" wildcard could be used to represent all alerts.
    * @param {string=} params.customerId Optional. The unique identifier of the G Suite organization account of the customer the alert feedback are associated with. Inferred from the caller identity if not provided.
    * @param {string=} params.filter Optional. A query string for filtering alert feedback results. For more details, see [Query filters](/admin-sdk/alertcenter/guides/query-filters) and [Supported query filter fields](/admin-sdk/alertcenter/reference/filter-fields#alerts.feedback.list).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListAlertFeedbackResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAlertFeedbackResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListAlertFeedbackResponse] = js.native
  def list(params: ParamsResourceAlertsFeedbackList): GaxiosPromise[SchemaListAlertFeedbackResponse] = js.native
  def list(
    params: ParamsResourceAlertsFeedbackList,
    callback: BodyResponseCallback[SchemaListAlertFeedbackResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAlertsFeedbackList,
    options: BodyResponseCallback[SchemaListAlertFeedbackResponse],
    callback: BodyResponseCallback[SchemaListAlertFeedbackResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAlertsFeedbackList, options: MethodOptions): GaxiosPromise[SchemaListAlertFeedbackResponse] = js.native
  def list(
    params: ParamsResourceAlertsFeedbackList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAlertFeedbackResponse]
  ): Unit = js.native
}
