package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An alert affecting a customer.
  */
trait SchemaAlert extends StObject {
  
  /**
    * Output only. The unique identifier for the alert.
    */
  var alertId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The time this alert was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The unique identifier of the Google account of the customer.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The data associated with this alert, for example
    * google.apps.alertcenter.type.DeviceCompromised.
    */
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Output only. `True` if this alert is marked for deletion.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. The time the event that caused this alert ceased being active.
    * If provided, the end time must not be earlier than the start time. If not
    * provided, it indicates an ongoing alert.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. An optional [Security Investigation
    * Tool](https://support.google.com/a/answer/7575955) query for this alert.
    */
  var securityInvestigationToolLink: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A unique identifier for the system that reported the alert.
    * This is output only after alert is created.  Supported sources are any of
    * the following:  * Google Operations * Mobile device management * Gmail
    * phishing * Domain wide takeout * Government attack warning * Google
    * identity
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The time the event that caused this alert was started or
    * detected.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The type of the alert. This is output only after alert is
    * created. For a list of available alert types see [G Suite Alert
    * types](/admin-sdk/alertcenter/reference/alert-types).
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaAlert {
  
  inline def apply(): SchemaAlert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAlert]
  }
  
  extension [Self <: SchemaAlert](x: Self) {
    
    inline def setAlertId(value: String): Self = StObject.set(x, "alertId", value.asInstanceOf[js.Any])
    
    inline def setAlertIdUndefined: Self = StObject.set(x, "alertId", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setSecurityInvestigationToolLink(value: String): Self = StObject.set(x, "securityInvestigationToolLink", value.asInstanceOf[js.Any])
    
    inline def setSecurityInvestigationToolLinkUndefined: Self = StObject.set(x, "securityInvestigationToolLink", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
