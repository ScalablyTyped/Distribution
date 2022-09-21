package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountTaxTaxRule extends StObject {
  
  /**
    * Country code in which tax is applicable.
    */
  var country: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. State (or province) is which the tax is applicable, described by its location ID (also called criteria ID).
    */
  var locationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Explicit tax rate in percent, represented as a floating point number without the percentage character. Must not be negative.
    */
  var ratePercent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, shipping charges are also taxed.
    */
  var shippingTaxed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the tax rate is taken from a global tax table or specified explicitly.
    */
  var useGlobalRate: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAccountTaxTaxRule {
  
  inline def apply(): SchemaAccountTaxTaxRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountTaxTaxRule]
  }
  
  extension [Self <: SchemaAccountTaxTaxRule](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdNull: Self = StObject.set(x, "locationId", null)
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setRatePercent(value: String): Self = StObject.set(x, "ratePercent", value.asInstanceOf[js.Any])
    
    inline def setRatePercentNull: Self = StObject.set(x, "ratePercent", null)
    
    inline def setRatePercentUndefined: Self = StObject.set(x, "ratePercent", js.undefined)
    
    inline def setShippingTaxed(value: Boolean): Self = StObject.set(x, "shippingTaxed", value.asInstanceOf[js.Any])
    
    inline def setShippingTaxedNull: Self = StObject.set(x, "shippingTaxed", null)
    
    inline def setShippingTaxedUndefined: Self = StObject.set(x, "shippingTaxed", js.undefined)
    
    inline def setUseGlobalRate(value: Boolean): Self = StObject.set(x, "useGlobalRate", value.asInstanceOf[js.Any])
    
    inline def setUseGlobalRateNull: Self = StObject.set(x, "useGlobalRate", null)
    
    inline def setUseGlobalRateUndefined: Self = StObject.set(x, "useGlobalRate", js.undefined)
  }
}
