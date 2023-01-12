package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainId extends StObject {
  
  /** The primary domain for the customer. */
  var customerPrimaryDomain: js.UndefOr[String] = js.undefined
}
object DomainId {
  
  inline def apply(): DomainId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainId] (val x: Self) extends AnyVal {
    
    inline def setCustomerPrimaryDomain(value: String): Self = StObject.set(x, "customerPrimaryDomain", value.asInstanceOf[js.Any])
    
    inline def setCustomerPrimaryDomainUndefined: Self = StObject.set(x, "customerPrimaryDomain", js.undefined)
  }
}
