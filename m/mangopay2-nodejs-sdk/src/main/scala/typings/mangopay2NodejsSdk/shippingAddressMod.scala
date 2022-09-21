package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.addressMod.address.AddressType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shippingAddressMod {
  
  object shippingAddress {
    
    trait ShippingAddressData extends StObject {
      
      /**
        * The shipping address
        */
      var Address: AddressType
      
      /**
        * Name of the shipping recipient
        */
      var RecipientName: String
    }
    object ShippingAddressData {
      
      inline def apply(Address: AddressType, RecipientName: String): ShippingAddressData = {
        val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], RecipientName = RecipientName.asInstanceOf[js.Any])
        __obj.asInstanceOf[ShippingAddressData]
      }
      
      extension [Self <: ShippingAddressData](x: Self) {
        
        inline def setAddress(value: AddressType): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
        
        inline def setRecipientName(value: String): Self = StObject.set(x, "RecipientName", value.asInstanceOf[js.Any])
      }
    }
  }
}
