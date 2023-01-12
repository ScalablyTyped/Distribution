package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressData
import typings.mangopay2NodejsSdk.typingsModelsMod.Models.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsBillingMod {
  
  object billing {
    
    trait BillingData extends StObject {
      
      var Address: typings.mangopay2NodejsSdk.typingsModelsMod.Models.Address | AddressData | String
    }
    object BillingData {
      
      inline def apply(Address: Address | AddressData | String): BillingData = {
        val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any])
        __obj.asInstanceOf[BillingData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BillingData] (val x: Self) extends AnyVal {
        
        inline def setAddress(value: Address | AddressData | String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      }
    }
    
    trait BillingOrShippingRecurringPayInData extends StObject {
      
      var Address: AddressData
      
      var FirstName: String
      
      var LastName: String
    }
    object BillingOrShippingRecurringPayInData {
      
      inline def apply(Address: AddressData, FirstName: String, LastName: String): BillingOrShippingRecurringPayInData = {
        val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any])
        __obj.asInstanceOf[BillingOrShippingRecurringPayInData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BillingOrShippingRecurringPayInData] (val x: Self) extends AnyVal {
        
        inline def setAddress(value: AddressData): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
        
        inline def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
        
        inline def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
      }
    }
  }
}
