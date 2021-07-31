package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tax calculation rule to apply in a state or province (USA only).
  */
trait SchemaAccountTaxTaxRule extends StObject {
  
  /**
    * Country code in which tax is applicable.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * State (or province) is which the tax is applicable, described by its
    * location ID (also called criteria ID).
    */
  var locationId: js.UndefOr[String] = js.undefined
  
  /**
    * Explicit tax rate in percent, represented as a floating point number
    * without the percentage character. Must not be negative.
    */
  var ratePercent: js.UndefOr[String] = js.undefined
  
  /**
    * If true, shipping charges are also taxed.
    */
  var shippingTaxed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the tax rate is taken from a global tax table or specified
    * explicitly.
    */
  var useGlobalRate: js.UndefOr[Boolean] = js.undefined
}
object SchemaAccountTaxTaxRule {
  
  @scala.inline
  def apply(): SchemaAccountTaxTaxRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountTaxTaxRule]
  }
  
  @scala.inline
  implicit class SchemaAccountTaxTaxRuleMutableBuilder[Self <: SchemaAccountTaxTaxRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    @scala.inline
    def setRatePercent(value: String): Self = StObject.set(x, "ratePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatePercentUndefined: Self = StObject.set(x, "ratePercent", js.undefined)
    
    @scala.inline
    def setShippingTaxed(value: Boolean): Self = StObject.set(x, "shippingTaxed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingTaxedUndefined: Self = StObject.set(x, "shippingTaxed", js.undefined)
    
    @scala.inline
    def setUseGlobalRate(value: Boolean): Self = StObject.set(x, "useGlobalRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseGlobalRateUndefined: Self = StObject.set(x, "useGlobalRate", js.undefined)
  }
}
