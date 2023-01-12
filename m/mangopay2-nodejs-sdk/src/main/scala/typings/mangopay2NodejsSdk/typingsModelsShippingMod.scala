package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsShippingMod {
  
  object shipping {
    
    trait ShippingData extends StObject {
      
      /**
        * The address
        */
      var Address: AddressData
      
      /**
        * The name of the user
        */
      var FirstName: String
      
      /**
        * The last name of the user
        */
      var LastName: String
    }
    object ShippingData {
      
      inline def apply(Address: AddressData, FirstName: String, LastName: String): ShippingData = {
        val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any])
        __obj.asInstanceOf[ShippingData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ShippingData] (val x: Self) extends AnyVal {
        
        inline def setAddress(value: AddressData): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
        
        inline def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
        
        inline def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
      }
    }
  }
}
