package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimaryAdminChangedEvent extends StObject {
  
  /** domain in which actioned occurred */
  var domain: js.UndefOr[String] = js.undefined
  
  /** Email of person who was the primary admin before the action */
  var previousAdminEmail: js.UndefOr[String] = js.undefined
  
  /** Email of person who is the primary admin after the action */
  var updatedAdminEmail: js.UndefOr[String] = js.undefined
}
object PrimaryAdminChangedEvent {
  
  inline def apply(): PrimaryAdminChangedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryAdminChangedEvent]
  }
  
  extension [Self <: PrimaryAdminChangedEvent](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setPreviousAdminEmail(value: String): Self = StObject.set(x, "previousAdminEmail", value.asInstanceOf[js.Any])
    
    inline def setPreviousAdminEmailUndefined: Self = StObject.set(x, "previousAdminEmail", js.undefined)
    
    inline def setUpdatedAdminEmail(value: String): Self = StObject.set(x, "updatedAdminEmail", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAdminEmailUndefined: Self = StObject.set(x, "updatedAdminEmail", js.undefined)
  }
}
