package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.addressMod.address.AddressType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/shippingAddress.shippingAddress.ShippingAddressData> */
trait PartialShippingAddressDat extends StObject {
  
  var Address: js.UndefOr[AddressType] = js.undefined
  
  var RecipientName: js.UndefOr[String] = js.undefined
}
object PartialShippingAddressDat {
  
  inline def apply(): PartialShippingAddressDat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShippingAddressDat]
  }
  
  extension [Self <: PartialShippingAddressDat](x: Self) {
    
    inline def setAddress(value: AddressType): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setRecipientName(value: String): Self = StObject.set(x, "RecipientName", value.asInstanceOf[js.Any])
    
    inline def setRecipientNameUndefined: Self = StObject.set(x, "RecipientName", js.undefined)
  }
}
