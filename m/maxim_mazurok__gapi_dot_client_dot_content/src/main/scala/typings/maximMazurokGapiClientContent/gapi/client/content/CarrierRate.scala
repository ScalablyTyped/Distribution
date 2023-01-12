package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CarrierRate extends StObject {
  
  /** Carrier service, such as `"UPS"` or `"Fedex"`. The list of supported carriers can be retrieved through the `getSupportedCarriers` method. Required. */
  var carrierName: js.UndefOr[String] = js.undefined
  
  /** Carrier service, such as `"ground"` or `"2 days"`. The list of supported services for a carrier can be retrieved through the `getSupportedCarriers` method. Required. */
  var carrierService: js.UndefOr[String] = js.undefined
  
  /**
    * Additive shipping rate modifier. Can be negative. For example `{ "value": "1", "currency" : "USD" }` adds $1 to the rate, `{ "value": "-3", "currency" : "USD" }` removes $3 from the
    * rate. Optional.
    */
  var flatAdjustment: js.UndefOr[Price] = js.undefined
  
  /** Name of the carrier rate. Must be unique per rate group. Required. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Shipping origin for this carrier rate. Required. */
  var originPostalCode: js.UndefOr[String] = js.undefined
  
  /** Multiplicative shipping rate modifier as a number in decimal notation. Can be negative. For example `"5.4"` increases the rate by 5.4%, `"-3"` decreases the rate by 3%. Optional. */
  var percentageAdjustment: js.UndefOr[String] = js.undefined
}
object CarrierRate {
  
  inline def apply(): CarrierRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarrierRate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CarrierRate] (val x: Self) extends AnyVal {
    
    inline def setCarrierName(value: String): Self = StObject.set(x, "carrierName", value.asInstanceOf[js.Any])
    
    inline def setCarrierNameUndefined: Self = StObject.set(x, "carrierName", js.undefined)
    
    inline def setCarrierService(value: String): Self = StObject.set(x, "carrierService", value.asInstanceOf[js.Any])
    
    inline def setCarrierServiceUndefined: Self = StObject.set(x, "carrierService", js.undefined)
    
    inline def setFlatAdjustment(value: Price): Self = StObject.set(x, "flatAdjustment", value.asInstanceOf[js.Any])
    
    inline def setFlatAdjustmentUndefined: Self = StObject.set(x, "flatAdjustment", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginPostalCode(value: String): Self = StObject.set(x, "originPostalCode", value.asInstanceOf[js.Any])
    
    inline def setOriginPostalCodeUndefined: Self = StObject.set(x, "originPostalCode", js.undefined)
    
    inline def setPercentageAdjustment(value: String): Self = StObject.set(x, "percentageAdjustment", value.asInstanceOf[js.Any])
    
    inline def setPercentageAdjustmentUndefined: Self = StObject.set(x, "percentageAdjustment", js.undefined)
  }
}
