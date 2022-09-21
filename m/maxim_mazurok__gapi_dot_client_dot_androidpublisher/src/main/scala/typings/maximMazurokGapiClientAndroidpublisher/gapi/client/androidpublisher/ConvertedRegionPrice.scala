package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConvertedRegionPrice extends StObject {
  
  /** The converted price tax inclusive. */
  var price: js.UndefOr[Money] = js.undefined
  
  /** The region code of the region. */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /** The tax amount of the converted price. */
  var taxAmount: js.UndefOr[Money] = js.undefined
}
object ConvertedRegionPrice {
  
  inline def apply(): ConvertedRegionPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertedRegionPrice]
  }
  
  extension [Self <: ConvertedRegionPrice](x: Self) {
    
    inline def setPrice(value: Money): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setTaxAmount(value: Money): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    inline def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
  }
}
