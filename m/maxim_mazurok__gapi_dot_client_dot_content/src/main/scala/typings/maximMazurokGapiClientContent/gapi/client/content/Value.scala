package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  /** The name of a carrier rate referring to a carrier rate defined in the same rate group. Can only be set if all other fields are not set. */
  var carrierRateName: js.UndefOr[String] = js.undefined
  
  /** A flat rate. Can only be set if all other fields are not set. */
  var flatRate: js.UndefOr[Price] = js.undefined
  
  /** If true, then the product can't ship. Must be true when set, can only be set if all other fields are not set. */
  var noShipping: js.UndefOr[Boolean] = js.undefined
  
  /** A percentage of the price represented as a number in decimal notation (e.g., `"5.4"`). Can only be set if all other fields are not set. */
  var pricePercentage: js.UndefOr[String] = js.undefined
  
  /** The name of a subtable. Can only be set in table cells (i.e., not for single values), and only if all other fields are not set. */
  var subtableName: js.UndefOr[String] = js.undefined
}
object Value {
  
  inline def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setCarrierRateName(value: String): Self = StObject.set(x, "carrierRateName", value.asInstanceOf[js.Any])
    
    inline def setCarrierRateNameUndefined: Self = StObject.set(x, "carrierRateName", js.undefined)
    
    inline def setFlatRate(value: Price): Self = StObject.set(x, "flatRate", value.asInstanceOf[js.Any])
    
    inline def setFlatRateUndefined: Self = StObject.set(x, "flatRate", js.undefined)
    
    inline def setNoShipping(value: Boolean): Self = StObject.set(x, "noShipping", value.asInstanceOf[js.Any])
    
    inline def setNoShippingUndefined: Self = StObject.set(x, "noShipping", js.undefined)
    
    inline def setPricePercentage(value: String): Self = StObject.set(x, "pricePercentage", value.asInstanceOf[js.Any])
    
    inline def setPricePercentageUndefined: Self = StObject.set(x, "pricePercentage", js.undefined)
    
    inline def setSubtableName(value: String): Self = StObject.set(x, "subtableName", value.asInstanceOf[js.Any])
    
    inline def setSubtableNameUndefined: Self = StObject.set(x, "subtableName", js.undefined)
  }
}
