package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification extends StObject {
  
  /** Notifications about new app restrictions schema changes. */
  var appRestrictionsSchemaChangeEvent: js.UndefOr[AppRestrictionsSchemaChangeEvent] = js.native
  
  /** Notifications about app updates. */
  var appUpdateEvent: js.UndefOr[AppUpdateEvent] = js.native
  
  /** Notifications about device report updates. */
  var deviceReportUpdateEvent: js.UndefOr[DeviceReportUpdateEvent] = js.native
  
  /** The ID of the enterprise for which the notification is sent. This will always be present. */
  var enterpriseId: js.UndefOr[String] = js.native
  
  /** Notifications about an app installation failure. */
  var installFailureEvent: js.UndefOr[InstallFailureEvent] = js.native
  
  /** Notifications about new devices. */
  var newDeviceEvent: js.UndefOr[NewDeviceEvent] = js.native
  
  /** Notifications about new app permissions. */
  var newPermissionsEvent: js.UndefOr[NewPermissionsEvent] = js.native
  
  /** Type of the notification. */
  var notificationType: js.UndefOr[String] = js.native
  
  /** Notifications about changes to a product's approval status. */
  var productApprovalEvent: js.UndefOr[ProductApprovalEvent] = js.native
  
  /** Notifications about product availability changes. */
  var productAvailabilityChangeEvent: js.UndefOr[ProductAvailabilityChangeEvent] = js.native
  
  /** The time when the notification was published in milliseconds since 1970-01-01T00:00:00Z. This will always be present. */
  var timestampMillis: js.UndefOr[String] = js.native
}
object Notification {
  
  @scala.inline
  def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit class NotificationMutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppRestrictionsSchemaChangeEvent(value: AppRestrictionsSchemaChangeEvent): Self = StObject.set(x, "appRestrictionsSchemaChangeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppRestrictionsSchemaChangeEventUndefined: Self = StObject.set(x, "appRestrictionsSchemaChangeEvent", js.undefined)
    
    @scala.inline
    def setAppUpdateEvent(value: AppUpdateEvent): Self = StObject.set(x, "appUpdateEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppUpdateEventUndefined: Self = StObject.set(x, "appUpdateEvent", js.undefined)
    
    @scala.inline
    def setDeviceReportUpdateEvent(value: DeviceReportUpdateEvent): Self = StObject.set(x, "deviceReportUpdateEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceReportUpdateEventUndefined: Self = StObject.set(x, "deviceReportUpdateEvent", js.undefined)
    
    @scala.inline
    def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    @scala.inline
    def setInstallFailureEvent(value: InstallFailureEvent): Self = StObject.set(x, "installFailureEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallFailureEventUndefined: Self = StObject.set(x, "installFailureEvent", js.undefined)
    
    @scala.inline
    def setNewDeviceEvent(value: NewDeviceEvent): Self = StObject.set(x, "newDeviceEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewDeviceEventUndefined: Self = StObject.set(x, "newDeviceEvent", js.undefined)
    
    @scala.inline
    def setNewPermissionsEvent(value: NewPermissionsEvent): Self = StObject.set(x, "newPermissionsEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPermissionsEventUndefined: Self = StObject.set(x, "newPermissionsEvent", js.undefined)
    
    @scala.inline
    def setNotificationType(value: String): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTypeUndefined: Self = StObject.set(x, "notificationType", js.undefined)
    
    @scala.inline
    def setProductApprovalEvent(value: ProductApprovalEvent): Self = StObject.set(x, "productApprovalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductApprovalEventUndefined: Self = StObject.set(x, "productApprovalEvent", js.undefined)
    
    @scala.inline
    def setProductAvailabilityChangeEvent(value: ProductAvailabilityChangeEvent): Self = StObject.set(x, "productAvailabilityChangeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductAvailabilityChangeEventUndefined: Self = StObject.set(x, "productAvailabilityChangeEvent", js.undefined)
    
    @scala.inline
    def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMillisUndefined: Self = StObject.set(x, "timestampMillis", js.undefined)
  }
}
