package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for an alert listing request.
  */
@js.native
trait SchemaListAlertsResponse extends js.Object {
  /**
    * The list of alerts.
    */
  var alerts: js.UndefOr[js.Array[SchemaAlert]] = js.native
  /**
    * The token for the next page. If not empty, indicates that there may be
    * more alerts that match the listing request; this value can be used in a
    * subsequent ListAlertsRequest to get alerts continuing from last result of
    * the current list call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAlertsResponse {
  @scala.inline
  def apply(alerts: js.Array[SchemaAlert] = null, nextPageToken: String = null): SchemaListAlertsResponse = {
    val __obj = js.Dynamic.literal()
    if (alerts != null) __obj.updateDynamic("alerts")(alerts.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAlertsResponse]
  }
}

