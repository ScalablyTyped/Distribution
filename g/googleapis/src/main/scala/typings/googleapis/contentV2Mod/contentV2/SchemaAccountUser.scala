package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAccountUser extends StObject {
  
  /**
    * Whether user is an admin.
    */
  var admin: js.UndefOr[Boolean] = js.native
  
  /**
    * User&#39;s email address.
    */
  var emailAddress: js.UndefOr[String] = js.native
  
  /**
    * Whether user is an order manager.
    */
  var orderManager: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether user can access payment statements.
    */
  var paymentsAnalyst: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether user can manage payment settings.
    */
  var paymentsManager: js.UndefOr[Boolean] = js.native
}
object SchemaAccountUser {
  
  @scala.inline
  def apply(): SchemaAccountUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountUser]
  }
  
  @scala.inline
  implicit class SchemaAccountUserMutableBuilder[Self <: SchemaAccountUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setOrderManager(value: Boolean): Self = StObject.set(x, "orderManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderManagerUndefined: Self = StObject.set(x, "orderManager", js.undefined)
    
    @scala.inline
    def setPaymentsAnalyst(value: Boolean): Self = StObject.set(x, "paymentsAnalyst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentsAnalystUndefined: Self = StObject.set(x, "paymentsAnalyst", js.undefined)
    
    @scala.inline
    def setPaymentsManager(value: Boolean): Self = StObject.set(x, "paymentsManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentsManagerUndefined: Self = StObject.set(x, "paymentsManager", js.undefined)
  }
}
