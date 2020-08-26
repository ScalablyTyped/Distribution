package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Alerts")
@js.native
class ResourceAlerts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.alerts.delete
    * @desc Dismiss (delete) the specified alert from the publisher's AdSense
    * account.
    * @alias adsense.alerts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alertId Alert to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAlertsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAlertsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAlertsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAlertsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAlertsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * adsense.alerts.list
    * @desc List the alerts for this AdSense account.
    * @alias adsense.alerts.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.locale The locale to use for translating alert messages. The account locale will be used if this is not supplied. The AdSense default (English) will be used if the supplied locale is invalid or unsupported.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAlerts] = js.native
  def list(callback: BodyResponseCallback[SchemaAlerts]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAlerts] = js.native
  def list(params: ParamsResourceAlertsList): GaxiosPromise[SchemaAlerts] = js.native
  def list(params: ParamsResourceAlertsList, callback: BodyResponseCallback[SchemaAlerts]): Unit = js.native
  def list(
    params: ParamsResourceAlertsList,
    options: BodyResponseCallback[SchemaAlerts],
    callback: BodyResponseCallback[SchemaAlerts]
  ): Unit = js.native
  def list(params: ParamsResourceAlertsList, options: MethodOptions): GaxiosPromise[SchemaAlerts] = js.native
  def list(
    params: ParamsResourceAlertsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlerts]
  ): Unit = js.native
}

