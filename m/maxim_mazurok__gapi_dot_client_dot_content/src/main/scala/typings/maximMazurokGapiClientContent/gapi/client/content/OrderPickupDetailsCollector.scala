package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderPickupDetailsCollector extends StObject {
  
  /** Name of the person picking up the shipment. */
  var name: js.UndefOr[String] = js.native
  
  /** Phone number of the person picking up the shipment. */
  var phoneNumber: js.UndefOr[String] = js.native
}
object OrderPickupDetailsCollector {
  
  @scala.inline
  def apply(): OrderPickupDetailsCollector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderPickupDetailsCollector]
  }
  
  @scala.inline
  implicit class OrderPickupDetailsCollectorMutableBuilder[Self <: OrderPickupDetailsCollector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
