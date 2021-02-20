package typings.mangopay2NodejsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.address.AddressData> */
@js.native
trait PartialAddressData extends StObject {
  
  var AddressLine1: js.UndefOr[String] = js.native
  
  var AddressLine2: js.UndefOr[String] = js.native
  
  var City: js.UndefOr[String] = js.native
  
  var Country: js.UndefOr[String] = js.native
  
  var PostalCode: js.UndefOr[String] = js.native
  
  var Region: js.UndefOr[String] = js.native
}
object PartialAddressData {
  
  @scala.inline
  def apply(): PartialAddressData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAddressData]
  }
  
  @scala.inline
  implicit class PartialAddressDataMutableBuilder[Self <: PartialAddressData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressLine1(value: String): Self = StObject.set(x, "AddressLine1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLine1Undefined: Self = StObject.set(x, "AddressLine1", js.undefined)
    
    @scala.inline
    def setAddressLine2(value: String): Self = StObject.set(x, "AddressLine2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLine2Undefined: Self = StObject.set(x, "AddressLine2", js.undefined)
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "PostalCode", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}
