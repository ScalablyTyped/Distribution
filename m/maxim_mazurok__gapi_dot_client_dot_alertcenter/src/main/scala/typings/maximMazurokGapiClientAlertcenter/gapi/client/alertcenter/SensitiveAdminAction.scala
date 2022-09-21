package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensitiveAdminAction extends StObject {
  
  /** Email of person who performed the action */
  var actorEmail: js.UndefOr[String] = js.undefined
  
  /** The time at which event occurred */
  var eventTime: js.UndefOr[String] = js.undefined
  
  /** Event occurred when primary admin changed in customer's account */
  var primaryAdminChangedEvent: js.UndefOr[PrimaryAdminChangedEvent] = js.undefined
  
  /** Event occurred when SSO Profile created in customer's account */
  var ssoProfileCreatedEvent: js.UndefOr[SSOProfileCreatedEvent] = js.undefined
  
  /** Event occurred when SSO Profile deleted in customer's account */
  var ssoProfileDeletedEvent: js.UndefOr[SSOProfileDeletedEvent] = js.undefined
  
  /** Event occurred when SSO Profile updated in customer's account */
  var ssoProfileUpdatedEvent: js.UndefOr[SSOProfileUpdatedEvent] = js.undefined
  
  /** Event occurred when password was reset for super admin in customer's account */
  var superAdminPasswordResetEvent: js.UndefOr[SuperAdminPasswordResetEvent] = js.undefined
}
object SensitiveAdminAction {
  
  inline def apply(): SensitiveAdminAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensitiveAdminAction]
  }
  
  extension [Self <: SensitiveAdminAction](x: Self) {
    
    inline def setActorEmail(value: String): Self = StObject.set(x, "actorEmail", value.asInstanceOf[js.Any])
    
    inline def setActorEmailUndefined: Self = StObject.set(x, "actorEmail", js.undefined)
    
    inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setPrimaryAdminChangedEvent(value: PrimaryAdminChangedEvent): Self = StObject.set(x, "primaryAdminChangedEvent", value.asInstanceOf[js.Any])
    
    inline def setPrimaryAdminChangedEventUndefined: Self = StObject.set(x, "primaryAdminChangedEvent", js.undefined)
    
    inline def setSsoProfileCreatedEvent(value: SSOProfileCreatedEvent): Self = StObject.set(x, "ssoProfileCreatedEvent", value.asInstanceOf[js.Any])
    
    inline def setSsoProfileCreatedEventUndefined: Self = StObject.set(x, "ssoProfileCreatedEvent", js.undefined)
    
    inline def setSsoProfileDeletedEvent(value: SSOProfileDeletedEvent): Self = StObject.set(x, "ssoProfileDeletedEvent", value.asInstanceOf[js.Any])
    
    inline def setSsoProfileDeletedEventUndefined: Self = StObject.set(x, "ssoProfileDeletedEvent", js.undefined)
    
    inline def setSsoProfileUpdatedEvent(value: SSOProfileUpdatedEvent): Self = StObject.set(x, "ssoProfileUpdatedEvent", value.asInstanceOf[js.Any])
    
    inline def setSsoProfileUpdatedEventUndefined: Self = StObject.set(x, "ssoProfileUpdatedEvent", js.undefined)
    
    inline def setSuperAdminPasswordResetEvent(value: SuperAdminPasswordResetEvent): Self = StObject.set(x, "superAdminPasswordResetEvent", value.asInstanceOf[js.Any])
    
    inline def setSuperAdminPasswordResetEventUndefined: Self = StObject.set(x, "superAdminPasswordResetEvent", js.undefined)
  }
}
