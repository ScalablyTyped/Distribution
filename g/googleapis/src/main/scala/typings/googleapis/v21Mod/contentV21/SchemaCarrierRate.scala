package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCarrierRate extends StObject {
  
  /**
    * Carrier service, such as &quot;UPS&quot; or &quot;Fedex&quot;. The list
    * of supported carriers can be retrieved via the getSupportedCarriers
    * method. Required.
    */
  var carrierName: js.UndefOr[String] = js.native
  
  /**
    * Carrier service, such as &quot;ground&quot; or &quot;2 days&quot;. The
    * list of supported services for a carrier can be retrieved via the
    * getSupportedCarriers method. Required.
    */
  var carrierService: js.UndefOr[String] = js.native
  
  /**
    * Additive shipping rate modifier. Can be negative. For example {
    * &quot;value&quot;: &quot;1&quot;, &quot;currency&quot; : &quot;USD&quot;
    * } adds $1 to the rate, { &quot;value&quot;: &quot;-3&quot;,
    * &quot;currency&quot; : &quot;USD&quot; } removes $3 from the rate.
    * Optional.
    */
  var flatAdjustment: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * Name of the carrier rate. Must be unique per rate group. Required.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Shipping origin for this carrier rate. Required.
    */
  var originPostalCode: js.UndefOr[String] = js.native
  
  /**
    * Multiplicative shipping rate modifier as a number in decimal notation.
    * Can be negative. For example &quot;5.4&quot; increases the rate by 5.4%,
    * &quot;-3&quot; decreases the rate by 3%. Optional.
    */
  var percentageAdjustment: js.UndefOr[String] = js.native
}
object SchemaCarrierRate {
  
  @scala.inline
  def apply(): SchemaCarrierRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCarrierRate]
  }
  
  @scala.inline
  implicit class SchemaCarrierRateMutableBuilder[Self <: SchemaCarrierRate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrierName(value: String): Self = StObject.set(x, "carrierName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierNameUndefined: Self = StObject.set(x, "carrierName", js.undefined)
    
    @scala.inline
    def setCarrierService(value: String): Self = StObject.set(x, "carrierService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierServiceUndefined: Self = StObject.set(x, "carrierService", js.undefined)
    
    @scala.inline
    def setFlatAdjustment(value: SchemaPrice): Self = StObject.set(x, "flatAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatAdjustmentUndefined: Self = StObject.set(x, "flatAdjustment", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginPostalCode(value: String): Self = StObject.set(x, "originPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginPostalCodeUndefined: Self = StObject.set(x, "originPostalCode", js.undefined)
    
    @scala.inline
    def setPercentageAdjustment(value: String): Self = StObject.set(x, "percentageAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageAdjustmentUndefined: Self = StObject.set(x, "percentageAdjustment", js.undefined)
  }
}
