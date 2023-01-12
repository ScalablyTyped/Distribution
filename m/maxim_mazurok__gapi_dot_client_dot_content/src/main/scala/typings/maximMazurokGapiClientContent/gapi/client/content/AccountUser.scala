package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountUser extends StObject {
  
  /** Whether user is an admin. */
  var admin: js.UndefOr[Boolean] = js.undefined
  
  /** User's email address. */
  var emailAddress: js.UndefOr[String] = js.undefined
  
  /** Whether user is an order manager. */
  var orderManager: js.UndefOr[Boolean] = js.undefined
  
  /** Whether user can access payment statements. */
  var paymentsAnalyst: js.UndefOr[Boolean] = js.undefined
  
  /** Whether user can manage payment settings. */
  var paymentsManager: js.UndefOr[Boolean] = js.undefined
  
  /** Whether user is a reporting manager. */
  var reportingManager: js.UndefOr[Boolean] = js.undefined
}
object AccountUser {
  
  inline def apply(): AccountUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountUser] (val x: Self) extends AnyVal {
    
    inline def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setOrderManager(value: Boolean): Self = StObject.set(x, "orderManager", value.asInstanceOf[js.Any])
    
    inline def setOrderManagerUndefined: Self = StObject.set(x, "orderManager", js.undefined)
    
    inline def setPaymentsAnalyst(value: Boolean): Self = StObject.set(x, "paymentsAnalyst", value.asInstanceOf[js.Any])
    
    inline def setPaymentsAnalystUndefined: Self = StObject.set(x, "paymentsAnalyst", js.undefined)
    
    inline def setPaymentsManager(value: Boolean): Self = StObject.set(x, "paymentsManager", value.asInstanceOf[js.Any])
    
    inline def setPaymentsManagerUndefined: Self = StObject.set(x, "paymentsManager", js.undefined)
    
    inline def setReportingManager(value: Boolean): Self = StObject.set(x, "reportingManager", value.asInstanceOf[js.Any])
    
    inline def setReportingManagerUndefined: Self = StObject.set(x, "reportingManager", js.undefined)
  }
}
