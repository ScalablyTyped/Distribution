package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertMetadata extends js.Object {
  
  /** Output only. The alert identifier. */
  var alertId: js.UndefOr[String] = js.native
  
  /** The email address of the user assigned to the alert. */
  var assignee: js.UndefOr[String] = js.native
  
  /** Output only. The unique identifier of the Google account of the customer. */
  var customerId: js.UndefOr[String] = js.native
  
  /**
    * Optional. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of an alert metadata from overwriting each other. It is strongly suggested
    * that systems make use of the `etag` in the read-modify-write cycle to perform metatdata updates in order to avoid race conditions: An `etag` is returned in the response which
    * contains alert metadata, and systems are expected to put that etag in the request to update alert metadata to ensure that their change will be applied to the same version of the
    * alert metadata. If no `etag` is provided in the call to update alert metadata, then the existing alert metadata is overwritten blindly.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The severity value of the alert. Alert Center will set this field at alert creation time, default's to an empty string when it could not be determined. The supported values for
    * update actions on this field are the following: * HIGH * MEDIUM * LOW
    */
  var severity: js.UndefOr[String] = js.native
  
  /** The current status of the alert. The supported values are the following: * NOT_STARTED * IN_PROGRESS * CLOSED */
  var status: js.UndefOr[String] = js.native
  
  /** Output only. The time this metadata was last updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object AlertMetadata {
  
  @scala.inline
  def apply(): AlertMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertMetadata]
  }
  
  @scala.inline
  implicit class AlertMetadataOps[Self <: AlertMetadata] (val x: Self) extends AnyVal {
    
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
    def setAssignee(value: String): Self = this.set("assignee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignee: Self = this.set("assignee", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
