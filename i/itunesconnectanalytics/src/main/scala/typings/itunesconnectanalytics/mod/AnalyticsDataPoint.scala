package typings.itunesconnectanalytics.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsDataPoint extends js.Object {
  var activeDevices: js.UndefOr[Double] = js.undefined
  var crashes: js.UndefOr[Double] = js.undefined
  var date: Date
  var iap: js.UndefOr[Double] = js.undefined
  var impressionsTotal: js.UndefOr[Double] = js.undefined
  var impressionsTotalUnique: js.UndefOr[Double] = js.undefined
  var installs: js.UndefOr[Double] = js.undefined
  var pageViewCount: js.UndefOr[Double] = js.undefined
  var pageViewUnique: js.UndefOr[Double] = js.undefined
  var payingUsers: js.UndefOr[Double] = js.undefined
  var rollingActiveDevices: js.UndefOr[Double] = js.undefined
  var sales: js.UndefOr[Double] = js.undefined
  var sessions: js.UndefOr[Double] = js.undefined
  var uninstalls: js.UndefOr[Double] = js.undefined
  var units: js.UndefOr[Double] = js.undefined
}

object AnalyticsDataPoint {
  @scala.inline
  def apply(
    date: Date,
    activeDevices: js.UndefOr[Double] = js.undefined,
    crashes: js.UndefOr[Double] = js.undefined,
    iap: js.UndefOr[Double] = js.undefined,
    impressionsTotal: js.UndefOr[Double] = js.undefined,
    impressionsTotalUnique: js.UndefOr[Double] = js.undefined,
    installs: js.UndefOr[Double] = js.undefined,
    pageViewCount: js.UndefOr[Double] = js.undefined,
    pageViewUnique: js.UndefOr[Double] = js.undefined,
    payingUsers: js.UndefOr[Double] = js.undefined,
    rollingActiveDevices: js.UndefOr[Double] = js.undefined,
    sales: js.UndefOr[Double] = js.undefined,
    sessions: js.UndefOr[Double] = js.undefined,
    uninstalls: js.UndefOr[Double] = js.undefined,
    units: js.UndefOr[Double] = js.undefined
  ): AnalyticsDataPoint = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (!js.isUndefined(activeDevices)) __obj.updateDynamic("activeDevices")(activeDevices.get.asInstanceOf[js.Any])
    if (!js.isUndefined(crashes)) __obj.updateDynamic("crashes")(crashes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iap)) __obj.updateDynamic("iap")(iap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(impressionsTotal)) __obj.updateDynamic("impressionsTotal")(impressionsTotal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(impressionsTotalUnique)) __obj.updateDynamic("impressionsTotalUnique")(impressionsTotalUnique.get.asInstanceOf[js.Any])
    if (!js.isUndefined(installs)) __obj.updateDynamic("installs")(installs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageViewCount)) __obj.updateDynamic("pageViewCount")(pageViewCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageViewUnique)) __obj.updateDynamic("pageViewUnique")(pageViewUnique.get.asInstanceOf[js.Any])
    if (!js.isUndefined(payingUsers)) __obj.updateDynamic("payingUsers")(payingUsers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rollingActiveDevices)) __obj.updateDynamic("rollingActiveDevices")(rollingActiveDevices.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sales)) __obj.updateDynamic("sales")(sales.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sessions)) __obj.updateDynamic("sessions")(sessions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uninstalls)) __obj.updateDynamic("uninstalls")(uninstalls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(units)) __obj.updateDynamic("units")(units.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsDataPoint]
  }
}

