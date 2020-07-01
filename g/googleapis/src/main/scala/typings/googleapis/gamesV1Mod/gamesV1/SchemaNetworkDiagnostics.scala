package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for network diagnostics reported for a client.
  */
@js.native
trait SchemaNetworkDiagnostics extends js.Object {
  /**
    * The Android network subtype.
    */
  var androidNetworkSubtype: js.UndefOr[Double] = js.native
  /**
    * The Android network type.
    */
  var androidNetworkType: js.UndefOr[Double] = js.native
  /**
    * iOS network type as defined in Reachability.h.
    */
  var iosNetworkType: js.UndefOr[Double] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#networkDiagnostics.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The MCC+MNC code for the client&#39;s network connection. On Android:
    * http://developer.android.com/reference/android/telephony/TelephonyManager.html#getNetworkOperator()
    * On iOS, see:
    * https://developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/CTCarrier/Reference/Reference.html
    */
  var networkOperatorCode: js.UndefOr[String] = js.native
  /**
    * The name of the carrier of the client&#39;s network connection. On
    * Android:
    * http://developer.android.com/reference/android/telephony/TelephonyManager.html#getNetworkOperatorName()
    * On iOS:
    * https://developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/CTCarrier/Reference/Reference.html#//apple_ref/occ/instp/CTCarrier/carrierName
    */
  var networkOperatorName: js.UndefOr[String] = js.native
  /**
    * The amount of time in milliseconds it took for the client to establish a
    * connection with the XMPP server.
    */
  var registrationLatencyMillis: js.UndefOr[Double] = js.native
}

object SchemaNetworkDiagnostics {
  @scala.inline
  def apply(
    androidNetworkSubtype: js.UndefOr[Double] = js.undefined,
    androidNetworkType: js.UndefOr[Double] = js.undefined,
    iosNetworkType: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    networkOperatorCode: String = null,
    networkOperatorName: String = null,
    registrationLatencyMillis: js.UndefOr[Double] = js.undefined
  ): SchemaNetworkDiagnostics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(androidNetworkSubtype)) __obj.updateDynamic("androidNetworkSubtype")(androidNetworkSubtype.get.asInstanceOf[js.Any])
    if (!js.isUndefined(androidNetworkType)) __obj.updateDynamic("androidNetworkType")(androidNetworkType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iosNetworkType)) __obj.updateDynamic("iosNetworkType")(iosNetworkType.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (networkOperatorCode != null) __obj.updateDynamic("networkOperatorCode")(networkOperatorCode.asInstanceOf[js.Any])
    if (networkOperatorName != null) __obj.updateDynamic("networkOperatorName")(networkOperatorName.asInstanceOf[js.Any])
    if (!js.isUndefined(registrationLatencyMillis)) __obj.updateDynamic("registrationLatencyMillis")(registrationLatencyMillis.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkDiagnostics]
  }
}

