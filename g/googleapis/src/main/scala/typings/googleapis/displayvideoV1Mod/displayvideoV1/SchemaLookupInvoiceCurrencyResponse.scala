package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLookupInvoiceCurrencyResponse extends StObject {
  
  /**
    * Currency used by the advertiser in ISO 4217 format.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaLookupInvoiceCurrencyResponse {
  
  inline def apply(): SchemaLookupInvoiceCurrencyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupInvoiceCurrencyResponse]
  }
  
  extension [Self <: SchemaLookupInvoiceCurrencyResponse](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
  }
}
