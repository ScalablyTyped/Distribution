package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Accounts$Alerts")
@js.native
class ResourceAccountsAlerts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adsense.accounts.alerts.delete
    * @desc Dismiss (delete) the specified alert from the specified publisher
    * AdSense account.
    * @alias adsense.accounts.alerts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad unit.
    * @param {string} params.alertId Alert to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsAlertsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsAlertsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsAlertsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsAlertsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsAlertsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * adsense.accounts.alerts.list
    * @desc List the alerts for the specified AdSense account.
    * @alias adsense.accounts.alerts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account for which to retrieve the alerts.
    * @param {string=} params.locale The locale to use for translating alert messages. The account locale will be used if this is not supplied. The AdSense default (English) will be used if the supplied locale is invalid or unsupported.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAlerts] = js.native
  def list(callback: BodyResponseCallback[SchemaAlerts]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAlerts] = js.native
  def list(params: ParamsResourceAccountsAlertsList): GaxiosPromise[SchemaAlerts] = js.native
  def list(params: ParamsResourceAccountsAlertsList, callback: BodyResponseCallback[SchemaAlerts]): Unit = js.native
  def list(
    params: ParamsResourceAccountsAlertsList,
    options: BodyResponseCallback[SchemaAlerts],
    callback: BodyResponseCallback[SchemaAlerts]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsAlertsList, options: MethodOptions): GaxiosPromise[SchemaAlerts] = js.native
  def list(
    params: ParamsResourceAccountsAlertsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlerts]
  ): Unit = js.native
}
