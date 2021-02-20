package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderDeliveryDetails extends StObject {
  
  /**
    * The delivery address
    */
  var address: js.UndefOr[SchemaOrderAddress] = js.native
  
  /**
    * The phone number of the person receiving the delivery.
    */
  var phoneNumber: js.UndefOr[String] = js.native
}
object SchemaOrderDeliveryDetails {
  
  @scala.inline
  def apply(): SchemaOrderDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderDeliveryDetails]
  }
  
  @scala.inline
  implicit class SchemaOrderDeliveryDetailsMutableBuilder[Self <: SchemaOrderDeliveryDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: SchemaOrderAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
