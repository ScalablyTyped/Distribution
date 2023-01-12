package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConvertedOtherRegionsPrice extends StObject {
  
  /** Price in EUR to use for the "Other regions" location exclusive of taxes. */
  var eurPrice: js.UndefOr[Money] = js.undefined
  
  /** Price in USD to use for the "Other regions" location exclusive of taxes. */
  var usdPrice: js.UndefOr[Money] = js.undefined
}
object ConvertedOtherRegionsPrice {
  
  inline def apply(): ConvertedOtherRegionsPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertedOtherRegionsPrice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConvertedOtherRegionsPrice] (val x: Self) extends AnyVal {
    
    inline def setEurPrice(value: Money): Self = StObject.set(x, "eurPrice", value.asInstanceOf[js.Any])
    
    inline def setEurPriceUndefined: Self = StObject.set(x, "eurPrice", js.undefined)
    
    inline def setUsdPrice(value: Money): Self = StObject.set(x, "usdPrice", value.asInstanceOf[js.Any])
    
    inline def setUsdPriceUndefined: Self = StObject.set(x, "usdPrice", js.undefined)
  }
}
