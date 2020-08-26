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
  def apply(): SchemaAlert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAlert]
  }
  @scala.inline
  implicit class SchemaAlertOps[Self <: SchemaAlert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlertId(value: String): Self = this.set("alertId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlertId: Self = this.set("alertId", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setSecurityInvestigationToolLink(value: String): Self = this.set("securityInvestigationToolLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityInvestigationToolLink: Self = this.set("securityInvestigationToolLink", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

