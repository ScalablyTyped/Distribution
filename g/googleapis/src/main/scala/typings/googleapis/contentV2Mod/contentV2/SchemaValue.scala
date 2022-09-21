package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValue extends StObject {
  
  /**
    * The name of a carrier rate referring to a carrier rate defined in the same rate group. Can only be set if all other fields are not set.
    */
  var carrierRateName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A flat rate. Can only be set if all other fields are not set.
    */
  var flatRate: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * If true, then the product can't ship. Must be true when set, can only be set if all other fields are not set.
    */
  var noShipping: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A percentage of the price represented as a number in decimal notation (e.g., `"5.4"`). Can only be set if all other fields are not set.
    */
  var pricePercentage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of a subtable. Can only be set in table cells (i.e., not for single values), and only if all other fields are not set.
    */
  var subtableName: js.UndefOr[String | Null] = js.undefined
}
object SchemaValue {
  
  inline def apply(): SchemaValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValue]
  }
  
  extension [Self <: SchemaValue](x: Self) {
    
    inline def setCarrierRateName(value: String): Self = StObject.set(x, "carrierRateName", value.asInstanceOf[js.Any])
    
    inline def setCarrierRateNameNull: Self = StObject.set(x, "carrierRateName", null)
    
    inline def setCarrierRateNameUndefined: Self = StObject.set(x, "carrierRateName", js.undefined)
    
    inline def setFlatRate(value: SchemaPrice): Self = StObject.set(x, "flatRate", value.asInstanceOf[js.Any])
    
    inline def setFlatRateUndefined: Self = StObject.set(x, "flatRate", js.undefined)
    
    inline def setNoShipping(value: Boolean): Self = StObject.set(x, "noShipping", value.asInstanceOf[js.Any])
    
    inline def setNoShippingNull: Self = StObject.set(x, "noShipping", null)
    
    inline def setNoShippingUndefined: Self = StObject.set(x, "noShipping", js.undefined)
    
    inline def setPricePercentage(value: String): Self = StObject.set(x, "pricePercentage", value.asInstanceOf[js.Any])
    
    inline def setPricePercentageNull: Self = StObject.set(x, "pricePercentage", null)
    
    inline def setPricePercentageUndefined: Self = StObject.set(x, "pricePercentage", js.undefined)
    
    inline def setSubtableName(value: String): Self = StObject.set(x, "subtableName", value.asInstanceOf[js.Any])
    
    inline def setSubtableNameNull: Self = StObject.set(x, "subtableName", null)
    
    inline def setSubtableNameUndefined: Self = StObject.set(x, "subtableName", js.undefined)
  }
}
