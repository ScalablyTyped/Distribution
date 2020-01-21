package typings.ibmMobilefirst.WL.Device

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
    if (Ipv4Addresses != null) __obj.updateDynamic("Ipv4Addresses")(Ipv4Addresses.asInstanceOf[js.Any])
    if (Ipv6Addresses != null) __obj.updateDynamic("Ipv6Addresses")(Ipv6Addresses.asInstanceOf[js.Any])
    if (carrierName != null) __obj.updateDynamic("carrierName")(carrierName.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(isAirplaneMode)) __obj.updateDynamic("isAirplaneMode")(isAirplaneMode.asInstanceOf[js.Any])
    if (!js.isUndefined(isNetworkConnected)) __obj.updateDynamic("isNetworkConnected")(isNetworkConnected.asInstanceOf[js.Any])
    if (!js.isUndefined(isRoaming)) __obj.updateDynamic("isRoaming")(isRoaming.asInstanceOf[js.Any])
    if (networkConnectionType != null) __obj.updateDynamic("networkConnectionType")(networkConnectionType.asInstanceOf[js.Any])
    if (telephonyNetworkType != null) __obj.updateDynamic("telephonyNetworkType")(telephonyNetworkType.asInstanceOf[js.Any])
    if (wifiName != null) __obj.updateDynamic("wifiName")(wifiName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInfo]
  }
}

