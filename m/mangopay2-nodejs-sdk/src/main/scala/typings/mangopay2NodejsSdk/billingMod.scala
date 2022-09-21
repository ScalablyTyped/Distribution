package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.addressMod.address.AddressData
import typings.mangopay2NodejsSdk.modelsMod.Models.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object billingMod {
  
  object billing {
    
    trait BillingData extends StObject {
      
      var Address: typings.mangopay2NodejsSdk.modelsMod.Models.Address | AddressData | String
    }
    object BillingData {
      
      inline def apply(Address: Address | AddressData | String): BillingData = {
        val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any])
        __obj.asInstanceOf[BillingData]
      }
      
      extension [Self <: BillingData](x: Self) {
        
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
      
      extension [Self <: BillingOrShippingRecurringPayInData](x: Self) {
        
        inline def setAddress(value: AddressData): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
        
        inline def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
        
        inline def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
      }
    }
  }
}
