package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertMetadata extends StObject {
  
  /** Output only. The alert identifier. */
  var alertId: js.UndefOr[String] = js.undefined
  
  /** The email address of the user assigned to the alert. */
  var assignee: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique identifier of the Google account of the customer. */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of an alert metadata from overwriting each other. It is strongly suggested
    * that systems make use of the `etag` in the read-modify-write cycle to perform metatdata updates in order to avoid race conditions: An `etag` is returned in the response which
    * contains alert metadata, and systems are expected to put that etag in the request to update alert metadata to ensure that their change will be applied to the same version of the
    * alert metadata. If no `etag` is provided in the call to update alert metadata, then the existing alert metadata is overwritten blindly.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The severity value of the alert. Alert Center will set this field at alert creation time, default's to an empty string when it could not be determined. The supported values for
    * update actions on this field are the following: * HIGH * MEDIUM * LOW
    */
  var severity: js.UndefOr[String] = js.undefined
  
  /** The current status of the alert. The supported values are the following: * NOT_STARTED * IN_PROGRESS * CLOSED */
  var status: js.UndefOr[String] = js.undefined
  
  /** Output only. The time this metadata was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object AlertMetadata {
  
  @scala.inline
  def apply(): AlertMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertMetadata]
  }
  
  @scala.inline
  implicit class AlertMetadataMutableBuilder[Self <: AlertMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlertId(value: String): Self = StObject.set(x, "alertId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertIdUndefined: Self = StObject.set(x, "alertId", js.undefined)
    
    @scala.inline
    def setAssignee(value: String): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
