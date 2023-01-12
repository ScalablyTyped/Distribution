package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsAddressMod {
  
  object address {
    
    trait AddressData
      extends StObject
         with _AddressType {
      
      /**
        * The first line of the address
        */
      var AddressLine1: String
      
      /**
        * The second line of the address
        */
      var AddressLine2: String
      
      /**
        * The city of the address
        */
      var City: String
      
      /**
        * The Country of the Address
        */
      var Country: CountryISO
      
      /**
        * The postal code of the address - can be alphanumeric, dashes or spaces
        */
      var PostalCode: String
      
      /**
        * The region of the address - this is optional except if the Country is US, CA or MX
        */
      var Region: String
    }
    object AddressData {
      
      inline def apply(
        AddressLine1: String,
        AddressLine2: String,
        City: String,
        Country: CountryISO,
        PostalCode: String,
        Region: String
      ): AddressData = {
        val __obj = js.Dynamic.literal(AddressLine1 = AddressLine1.asInstanceOf[js.Any], AddressLine2 = AddressLine2.asInstanceOf[js.Any], City = City.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], PostalCode = PostalCode.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any])
        __obj.asInstanceOf[AddressData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AddressData] (val x: Self) extends AnyVal {
        
        inline def setAddressLine1(value: String): Self = StObject.set(x, "AddressLine1", value.asInstanceOf[js.Any])
        
        inline def setAddressLine2(value: String): Self = StObject.set(x, "AddressLine2", value.asInstanceOf[js.Any])
        
        inline def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
        
        inline def setCountry(value: CountryISO): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
        
        inline def setPostalCode(value: String): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
        
        inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - java.lang.String
      - typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressData
      - typings.mangopay2NodejsSdk.typingsModelsMod.Models.Address
    */
    type AddressType = _AddressType | String
    
    trait _AddressType extends StObject
  }
}
