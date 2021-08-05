package typings.mangopay2NodejsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.address.AddressData> */
trait PartialAddressData extends StObject {
  
  var AddressLine1: js.UndefOr[String] = js.undefined
  
  var AddressLine2: js.UndefOr[String] = js.undefined
  
  var City: js.UndefOr[String] = js.undefined
  
  var Country: js.UndefOr[String] = js.undefined
  
  var PostalCode: js.UndefOr[String] = js.undefined
  
  var Region: js.UndefOr[String] = js.undefined
}
object PartialAddressData {
  
  inline def apply(): PartialAddressData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAddressData]
  }
  
  extension [Self <: PartialAddressData](x: Self) {
    
    inline def setAddressLine1(value: String): Self = StObject.set(x, "AddressLine1", value.asInstanceOf[js.Any])
    
    inline def setAddressLine1Undefined: Self = StObject.set(x, "AddressLine1", js.undefined)
    
    inline def setAddressLine2(value: String): Self = StObject.set(x, "AddressLine2", value.asInstanceOf[js.Any])
    
    inline def setAddressLine2Undefined: Self = StObject.set(x, "AddressLine2", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "PostalCode", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}
