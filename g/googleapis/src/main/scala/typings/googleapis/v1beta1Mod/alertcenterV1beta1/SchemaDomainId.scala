package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Domain ID of Gmail phishing alerts.
  */
@js.native
trait SchemaDomainId extends StObject {
  
  /**
    * The primary domain for the customer.
    */
  var customerPrimaryDomain: js.UndefOr[String] = js.native
}
object SchemaDomainId {
  
  @scala.inline
  def apply(): SchemaDomainId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainId]
  }
  
  @scala.inline
  implicit class SchemaDomainIdMutableBuilder[Self <: SchemaDomainId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerPrimaryDomain(value: String): Self = StObject.set(x, "customerPrimaryDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerPrimaryDomainUndefined: Self = StObject.set(x, "customerPrimaryDomain", js.undefined)
  }
}
