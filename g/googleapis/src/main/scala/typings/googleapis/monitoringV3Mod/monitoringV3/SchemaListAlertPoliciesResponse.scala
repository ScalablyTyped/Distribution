package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The protocol for the ListAlertPolicies response.
  */
@js.native
trait SchemaListAlertPoliciesResponse extends js.Object {
  /**
    * The returned alert policies.
    */
  var alertPolicies: js.UndefOr[js.Array[SchemaAlertPolicy]] = js.native
  /**
    * If there might be more results than were returned, then this field is set
    * to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAlertPoliciesResponse {
  @scala.inline
  def apply(alertPolicies: js.Array[SchemaAlertPolicy] = null, nextPageToken: String = null): SchemaListAlertPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (alertPolicies != null) __obj.updateDynamic("alertPolicies")(alertPolicies.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAlertPoliciesResponse]
  }
}

