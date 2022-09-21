package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCarrierRate extends StObject {
  
  /**
    * Carrier service, such as `"UPS"` or `"Fedex"`. The list of supported carriers can be retrieved via the `getSupportedCarriers` method. Required.
    */
  var carrierName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Carrier service, such as `"ground"` or `"2 days"`. The list of supported services for a carrier can be retrieved via the `getSupportedCarriers` method. Required.
    */
  var carrierService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additive shipping rate modifier. Can be negative. For example `{ "value": "1", "currency" : "USD" \}` adds $1 to the rate, `{ "value": "-3", "currency" : "USD" \}` removes $3 from the rate. Optional.
    */
  var flatAdjustment: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Name of the carrier rate. Must be unique per rate group. Required.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Shipping origin for this carrier rate. Required.
    */
  var originPostalCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Multiplicative shipping rate modifier as a number in decimal notation. Can be negative. For example `"5.4"` increases the rate by 5.4%, `"-3"` decreases the rate by 3%. Optional.
    */
  var percentageAdjustment: js.UndefOr[String | Null] = js.undefined
}
object SchemaCarrierRate {
  
  inline def apply(): SchemaCarrierRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCarrierRate]
  }
  
  extension [Self <: SchemaCarrierRate](x: Self) {
    
    inline def setCarrierName(value: String): Self = StObject.set(x, "carrierName", value.asInstanceOf[js.Any])
    
    inline def setCarrierNameNull: Self = StObject.set(x, "carrierName", null)
    
    inline def setCarrierNameUndefined: Self = StObject.set(x, "carrierName", js.undefined)
    
    inline def setCarrierService(value: String): Self = StObject.set(x, "carrierService", value.asInstanceOf[js.Any])
    
    inline def setCarrierServiceNull: Self = StObject.set(x, "carrierService", null)
    
    inline def setCarrierServiceUndefined: Self = StObject.set(x, "carrierService", js.undefined)
    
    inline def setFlatAdjustment(value: SchemaPrice): Self = StObject.set(x, "flatAdjustment", value.asInstanceOf[js.Any])
    
    inline def setFlatAdjustmentUndefined: Self = StObject.set(x, "flatAdjustment", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginPostalCode(value: String): Self = StObject.set(x, "originPostalCode", value.asInstanceOf[js.Any])
    
    inline def setOriginPostalCodeNull: Self = StObject.set(x, "originPostalCode", null)
    
    inline def setOriginPostalCodeUndefined: Self = StObject.set(x, "originPostalCode", js.undefined)
    
    inline def setPercentageAdjustment(value: String): Self = StObject.set(x, "percentageAdjustment", value.asInstanceOf[js.Any])
    
    inline def setPercentageAdjustmentNull: Self = StObject.set(x, "percentageAdjustment", null)
    
    inline def setPercentageAdjustmentUndefined: Self = StObject.set(x, "percentageAdjustment", js.undefined)
  }
}
