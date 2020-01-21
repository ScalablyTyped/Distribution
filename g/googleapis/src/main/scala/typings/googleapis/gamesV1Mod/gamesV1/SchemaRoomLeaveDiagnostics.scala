package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for room leave diagnostics.
  */
@js.native
trait SchemaRoomLeaveDiagnostics extends js.Object {
  /**
    * Android network subtype.
    * http://developer.android.com/reference/android/net/NetworkInfo.html#getSubtype()
    */
  var androidNetworkSubtype: js.UndefOr[Double] = js.native
  /**
    * Android network type.
    * http://developer.android.com/reference/android/net/NetworkInfo.html#getType()
    */
  var androidNetworkType: js.UndefOr[Double] = js.native
  /**
    * iOS network type as defined in Reachability.h.
    */
  var iosNetworkType: js.UndefOr[Double] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomLeaveDiagnostics.
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
    * Diagnostics about all peer sessions.
    */
  var peerSession: js.UndefOr[js.Array[SchemaPeerSessionDiagnostics]] = js.native
  /**
    * Whether or not sockets were used.
    */
  var socketsUsed: js.UndefOr[Boolean] = js.native
}

object SchemaRoomLeaveDiagnostics {
  @scala.inline
  def apply(
    androidNetworkSubtype: Int | Double = null,
    androidNetworkType: Int | Double = null,
    iosNetworkType: Int | Double = null,
    kind: String = null,
    networkOperatorCode: String = null,
    networkOperatorName: String = null,
    peerSession: js.Array[SchemaPeerSessionDiagnostics] = null,
    socketsUsed: js.UndefOr[Boolean] = js.undefined
  ): SchemaRoomLeaveDiagnostics = {
    val __obj = js.Dynamic.literal()
    if (androidNetworkSubtype != null) __obj.updateDynamic("androidNetworkSubtype")(androidNetworkSubtype.asInstanceOf[js.Any])
    if (androidNetworkType != null) __obj.updateDynamic("androidNetworkType")(androidNetworkType.asInstanceOf[js.Any])
    if (iosNetworkType != null) __obj.updateDynamic("iosNetworkType")(iosNetworkType.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (networkOperatorCode != null) __obj.updateDynamic("networkOperatorCode")(networkOperatorCode.asInstanceOf[js.Any])
    if (networkOperatorName != null) __obj.updateDynamic("networkOperatorName")(networkOperatorName.asInstanceOf[js.Any])
    if (peerSession != null) __obj.updateDynamic("peerSession")(peerSession.asInstanceOf[js.Any])
    if (!js.isUndefined(socketsUsed)) __obj.updateDynamic("socketsUsed")(socketsUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRoomLeaveDiagnostics]
  }
}

