package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountUser extends StObject {
  
  /**
    * Whether user is an admin.
    */
  var admin: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * User's email address.
    */
  var emailAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether user is an order manager.
    */
  var orderManager: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether user can access payment statements.
    */
  var paymentsAnalyst: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether user can manage payment settings.
    */
  var paymentsManager: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether user is a reporting manager.
    */
  var reportingManager: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAccountUser {
  
  inline def apply(): SchemaAccountUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountUser]
  }
  
  extension [Self <: SchemaAccountUser](x: Self) {
    
    inline def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setAdminNull: Self = StObject.set(x, "admin", null)
    
    inline def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setOrderManager(value: Boolean): Self = StObject.set(x, "orderManager", value.asInstanceOf[js.Any])
    
    inline def setOrderManagerNull: Self = StObject.set(x, "orderManager", null)
    
    inline def setOrderManagerUndefined: Self = StObject.set(x, "orderManager", js.undefined)
    
    inline def setPaymentsAnalyst(value: Boolean): Self = StObject.set(x, "paymentsAnalyst", value.asInstanceOf[js.Any])
    
    inline def setPaymentsAnalystNull: Self = StObject.set(x, "paymentsAnalyst", null)
    
    inline def setPaymentsAnalystUndefined: Self = StObject.set(x, "paymentsAnalyst", js.undefined)
    
    inline def setPaymentsManager(value: Boolean): Self = StObject.set(x, "paymentsManager", value.asInstanceOf[js.Any])
    
    inline def setPaymentsManagerNull: Self = StObject.set(x, "paymentsManager", null)
    
    inline def setPaymentsManagerUndefined: Self = StObject.set(x, "paymentsManager", js.undefined)
    
    inline def setReportingManager(value: Boolean): Self = StObject.set(x, "reportingManager", value.asInstanceOf[js.Any])
    
    inline def setReportingManagerNull: Self = StObject.set(x, "reportingManager", null)
    
    inline def setReportingManagerUndefined: Self = StObject.set(x, "reportingManager", js.undefined)
  }
}
