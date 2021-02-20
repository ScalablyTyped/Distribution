package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderCustomerLoyaltyInfo extends StObject {
  
  /** The loyalty card/membership number. */
  var loyaltyNumber: js.UndefOr[String] = js.native
  
  /** Name of card/membership holder, this field will be populated when */
  var name: js.UndefOr[String] = js.native
}
object OrderCustomerLoyaltyInfo {
  
  @scala.inline
  def apply(): OrderCustomerLoyaltyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderCustomerLoyaltyInfo]
  }
  
  @scala.inline
  implicit class OrderCustomerLoyaltyInfoMutableBuilder[Self <: OrderCustomerLoyaltyInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoyaltyNumber(value: String): Self = StObject.set(x, "loyaltyNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoyaltyNumberUndefined: Self = StObject.set(x, "loyaltyNumber", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
