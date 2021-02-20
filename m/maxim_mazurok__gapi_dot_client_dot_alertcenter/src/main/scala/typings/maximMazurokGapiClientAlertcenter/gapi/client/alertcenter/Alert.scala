package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alert extends StObject {
  
  /** Output only. The unique identifier for the alert. */
  var alertId: js.UndefOr[String] = js.native
  
  /** Output only. The time this alert was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The unique identifier of the Google account of the customer. */
  var customerId: js.UndefOr[String] = js.native
  
  /** Optional. The data associated with this alert, for example google.apps.alertcenter.type.DeviceCompromised. */
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientAlertcenter.maximMazurokGapiClientAlertcenterStrings.Alert with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. `True` if this alert is marked for deletion. */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. The time the event that caused this alert ceased being active. If provided, the end time must not be earlier than the start time. If not provided, it indicates an ongoing
    * alert.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Optional. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of an alert from overwriting each other. It is strongly suggested that
    * systems make use of the `etag` in the read-modify-write cycle to perform alert updates in order to avoid race conditions: An `etag` is returned in the response which contains
    * alerts, and systems are expected to put that etag in the request to update alert to ensure that their change will be applied to the same version of the alert. If no `etag` is
    * provided in the call to update alert, then the existing alert is overwritten blindly.
    */
  var etag: js.UndefOr[String] = js.native
  
  /** Output only. The metadata associated with this alert. */
  var metadata: js.UndefOr[AlertMetadata] = js.native
  
  /** Output only. An optional [Security Investigation Tool](https://support.google.com/a/answer/7575955) query for this alert. */
  var securityInvestigationToolLink: js.UndefOr[String] = js.native
  
  /**
    * Required. A unique identifier for the system that reported the alert. This is output only after alert is created. Supported sources are any of the following: * Google Operations *
    * Mobile device management * Gmail phishing * Domain wide takeout * State sponsored attack * Google identity
    */
  var source: js.UndefOr[String] = js.native
  
  /** Required. The time the event that caused this alert was started or detected. */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * Required. The type of the alert. This is output only after alert is created. For a list of available alert types see [G Suite Alert
    * types](/admin-sdk/alertcenter/reference/alert-types).
    */
  var `type`: js.UndefOr[String] = js.native
  
  /** Output only. The time this alert was last updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object Alert {
  
  @scala.inline
  def apply(): Alert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alert]
  }
  
  @scala.inline
  implicit class AlertMutableBuilder[Self <: Alert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlertId(value: String): Self = StObject.set(x, "alertId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertIdUndefined: Self = StObject.set(x, "alertId", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientAlertcenter.maximMazurokGapiClientAlertcenterStrings.Alert with TopLevel[js.Any]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setMetadata(value: AlertMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setSecurityInvestigationToolLink(value: String): Self = StObject.set(x, "securityInvestigationToolLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityInvestigationToolLinkUndefined: Self = StObject.set(x, "securityInvestigationToolLink", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
