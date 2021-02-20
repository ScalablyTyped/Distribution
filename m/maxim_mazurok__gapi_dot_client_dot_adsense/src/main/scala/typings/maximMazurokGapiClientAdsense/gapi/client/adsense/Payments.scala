package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payments extends StObject {
  
  /** The list of Payments for the account. One or both of a) the account's most recent payment; and b) the account's upcoming payment. */
  var items: js.UndefOr[js.Array[Payment]] = js.native
  
  /** Kind of list this is, in this case adsense#payments. */
  var kind: js.UndefOr[String] = js.native
}
object Payments {
  
  @scala.inline
  def apply(): Payments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payments]
  }
  
  @scala.inline
  implicit class PaymentsMutableBuilder[Self <: Payments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Payment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Payment*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
