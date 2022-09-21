package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConvertRegionPricesResponse extends StObject {
  
  /** Converted other regions prices in USD and EUR, to use for countries where Play doesn't support a country's local currency. */
  var convertedOtherRegionsPrice: js.UndefOr[ConvertedOtherRegionsPrice] = js.undefined
  
  /** Map from region code to converted region price. */
  var convertedRegionPrices: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.androidpublisher.gapi.client.androidpublisher.ConvertedRegionPrice}
    */ typings.maximMazurokGapiClientAndroidpublisher.maximMazurokGapiClientAndroidpublisherStrings.ConvertRegionPricesResponse & TopLevel[Any]
  ] = js.undefined
}
object ConvertRegionPricesResponse {
  
  inline def apply(): ConvertRegionPricesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertRegionPricesResponse]
  }
  
  extension [Self <: ConvertRegionPricesResponse](x: Self) {
    
    inline def setConvertedOtherRegionsPrice(value: ConvertedOtherRegionsPrice): Self = StObject.set(x, "convertedOtherRegionsPrice", value.asInstanceOf[js.Any])
    
    inline def setConvertedOtherRegionsPriceUndefined: Self = StObject.set(x, "convertedOtherRegionsPrice", js.undefined)
    
    inline def setConvertedRegionPrices(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.androidpublisher.gapi.client.androidpublisher.ConvertedRegionPrice}
      */ typings.maximMazurokGapiClientAndroidpublisher.maximMazurokGapiClientAndroidpublisherStrings.ConvertRegionPricesResponse & TopLevel[Any]
    ): Self = StObject.set(x, "convertedRegionPrices", value.asInstanceOf[js.Any])
    
    inline def setConvertedRegionPricesUndefined: Self = StObject.set(x, "convertedRegionPrices", js.undefined)
  }
}
