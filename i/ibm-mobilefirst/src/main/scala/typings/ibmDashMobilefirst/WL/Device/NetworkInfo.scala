package typings.ibmDashMobilefirst.WL.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInfo extends js.Object {
  var Ipv4Addresses: js.UndefOr[js.Array[AddressPair]] = js.undefined
  var Ipv6Addresses: js.UndefOr[js.Array[AddressPair]] = js.undefined
  var carrierName: js.UndefOr[String] = js.undefined
  var ipAddress: js.UndefOr[String] = js.undefined
  var isAirplaneMode: js.UndefOr[Boolean] = js.undefined
  var isNetworkConnected: js.UndefOr[Boolean] = js.undefined
  var isRoaming: js.UndefOr[Boolean] = js.undefined
  var networkConnectionType: js.UndefOr[String] = js.undefined
  var telephonyNetworkType: js.UndefOr[String] = js.undefined
  var wifiName: js.UndefOr[String] = js.undefined
}

object NetworkInfo {
  @scala.inline
  def apply(
    Ipv4Addresses: js.Array[AddressPair] = null,
    Ipv6Addresses: js.Array[AddressPair] = null,
    carrierName: String = null,
    ipAddress: String = null,
    isAirplaneMode: js.UndefOr[Boolean] = js.undefined,
    isNetworkConnected: js.UndefOr[Boolean] = js.undefined,
    isRoaming: js.UndefOr[Boolean] = js.undefined,
    networkConnectionType: String = null,
    telephonyNetworkType: String = null,
    wifiName: String = null
  ): NetworkInfo = {
    val __obj = js.Dynamic.literal()
    if (Ipv4Addresses != null) __obj.updateDynamic("Ipv4Addresses")(Ipv4Addresses)
    if (Ipv6Addresses != null) __obj.updateDynamic("Ipv6Addresses")(Ipv6Addresses)
    if (carrierName != null) __obj.updateDynamic("carrierName")(carrierName)
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress)
    if (!js.isUndefined(isAirplaneMode)) __obj.updateDynamic("isAirplaneMode")(isAirplaneMode)
    if (!js.isUndefined(isNetworkConnected)) __obj.updateDynamic("isNetworkConnected")(isNetworkConnected)
    if (!js.isUndefined(isRoaming)) __obj.updateDynamic("isRoaming")(isRoaming)
    if (networkConnectionType != null) __obj.updateDynamic("networkConnectionType")(networkConnectionType)
    if (telephonyNetworkType != null) __obj.updateDynamic("telephonyNetworkType")(telephonyNetworkType)
    if (wifiName != null) __obj.updateDynamic("wifiName")(wifiName)
    __obj.asInstanceOf[NetworkInfo]
  }
}

