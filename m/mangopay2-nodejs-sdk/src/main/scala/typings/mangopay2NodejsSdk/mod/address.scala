package typings.mangopay2NodejsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object address {
  
  trait AddressData
    extends StObject
       with _AddressType {
    
    var AddressLine1: String
    
    var AddressLine2: String
    
    var City: String
    
    var Country: String
    
    var PostalCode: String
    
    var Region: String
  }
  object AddressData {
    
    @scala.inline
    def apply(
      AddressLine1: String,
      AddressLine2: String,
      City: String,
      Country: String,
      PostalCode: String,
      Region: String
    ): AddressData = {
      val __obj = js.Dynamic.literal(AddressLine1 = AddressLine1.asInstanceOf[js.Any], AddressLine2 = AddressLine2.asInstanceOf[js.Any], City = City.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], PostalCode = PostalCode.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressData]
    }
    
    @scala.inline
    implicit class AddressDataMutableBuilder[Self <: AddressData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddressLine1(value: String): Self = StObject.set(x, "AddressLine1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressLine2(value: String): Self = StObject.set(x, "AddressLine2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostalCode(value: String): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.mangopay2NodejsSdk.mod.address.AddressData
    - typings.mangopay2NodejsSdk.mod.models.Address
  */
  type AddressType = _AddressType | String
  
  trait _AddressType extends StObject
}
