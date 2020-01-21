package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An alert affecting a customer.
  */
@js.native
trait SchemaAlert extends js.Object {
  /**
    * Output only. The unique identifier for the alert.
    */
  var alertId: js.UndefOr[String] = js.native
  /**
    * Output only. The time this alert was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The unique identifier of the Google account of the customer.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Optional. The data associated with this alert, for example
    * google.apps.alertcenter.type.DeviceCompromised.
    */
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Output only. `True` if this alert is marked for deletion.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The time the event that caused this alert ceased being active.
    * If provided, the end time must not be earlier than the start time. If not
    * provided, it indicates an ongoing alert.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Output only. An optional [Security Investigation
    * Tool](https://support.google.com/a/answer/7575955) query for this alert.
    */
  var securityInvestigationToolLink: js.UndefOr[String] = js.native
  /**
    * Required. A unique identifier for the system that reported the alert.
    * This is output only after alert is created.  Supported sources are any of
    * the following:  * Google Operations * Mobile device management * Gmail
    * phishing * Domain wide takeout * Government attack warning * Google
    * identity
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Required. The time the event that caused this alert was started or
    * detected.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Required. The type of the alert. This is output only after alert is
    * created. For a list of available alert types see [G Suite Alert
    * types](/admin-sdk/alertcenter/reference/alert-types).
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAlert {
  @scala.inline
  def apply(
    alertId: String = null,
    createTime: String = null,
    customerId: String = null,
    data: StringDictionary[js.Any] = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    endTime: String = null,
    securityInvestigationToolLink: String = null,
    source: String = null,
    startTime: String = null,
    `type`: String = null
  ): SchemaAlert = {
    val __obj = js.Dynamic.literal()
    if (alertId != null) __obj.updateDynamic("alertId")(alertId.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (securityInvestigationToolLink != null) __obj.updateDynamic("securityInvestigationToolLink")(securityInvestigationToolLink.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAlert]
  }
}

