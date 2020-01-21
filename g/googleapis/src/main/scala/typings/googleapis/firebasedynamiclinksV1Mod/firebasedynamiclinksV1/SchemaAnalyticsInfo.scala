package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracking parameters supported by Dynamic Link.
  */
@js.native
trait SchemaAnalyticsInfo extends js.Object {
  /**
    * Google Play Campaign Measurements.
    */
  var googlePlayAnalytics: js.UndefOr[SchemaGooglePlayAnalytics] = js.native
  /**
    * iTunes Connect App Analytics.
    */
  var itunesConnectAnalytics: js.UndefOr[SchemaITunesConnectAnalytics] = js.native
}

object SchemaAnalyticsInfo {
  @scala.inline
  def apply(
    googlePlayAnalytics: SchemaGooglePlayAnalytics = null,
    itunesConnectAnalytics: SchemaITunesConnectAnalytics = null
  ): SchemaAnalyticsInfo = {
    val __obj = js.Dynamic.literal()
    if (googlePlayAnalytics != null) __obj.updateDynamic("googlePlayAnalytics")(googlePlayAnalytics.asInstanceOf[js.Any])
    if (itunesConnectAnalytics != null) __obj.updateDynamic("itunesConnectAnalytics")(itunesConnectAnalytics.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnalyticsInfo]
  }
}

