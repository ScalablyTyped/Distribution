package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The single value of a rate group or the value of a rate group table&#39;s
  * cell. Exactly one of noShipping, flatRate, pricePercentage,
  * carrierRateName, subtableName must be set.
  */
@js.native
trait SchemaValue extends StObject {
  
  /**
    * The name of a carrier rate referring to a carrier rate defined in the
    * same rate group. Can only be set if all other fields are not set.
    */
  var carrierRateName: js.UndefOr[String] = js.native
  
  /**
    * A flat rate. Can only be set if all other fields are not set.
    */
  var flatRate: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * If true, then the product can&#39;t ship. Must be true when set, can only
    * be set if all other fields are not set.
    */
  var noShipping: js.UndefOr[Boolean] = js.native
  
  /**
    * A percentage of the price represented as a number in decimal notation
    * (e.g., &quot;5.4&quot;). Can only be set if all other fields are not set.
    */
  var pricePercentage: js.UndefOr[String] = js.native
  
  /**
    * The name of a subtable. Can only be set in table cells (i.e., not for
    * single values), and only if all other fields are not set.
    */
  var subtableName: js.UndefOr[String] = js.native
}
object SchemaValue {
  
  @scala.inline
  def apply(): SchemaValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValue]
  }
  
  @scala.inline
  implicit class SchemaValueMutableBuilder[Self <: SchemaValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrierRateName(value: String): Self = StObject.set(x, "carrierRateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierRateNameUndefined: Self = StObject.set(x, "carrierRateName", js.undefined)
    
    @scala.inline
    def setFlatRate(value: SchemaPrice): Self = StObject.set(x, "flatRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatRateUndefined: Self = StObject.set(x, "flatRate", js.undefined)
    
    @scala.inline
    def setNoShipping(value: Boolean): Self = StObject.set(x, "noShipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoShippingUndefined: Self = StObject.set(x, "noShipping", js.undefined)
    
    @scala.inline
    def setPricePercentage(value: String): Self = StObject.set(x, "pricePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricePercentageUndefined: Self = StObject.set(x, "pricePercentage", js.undefined)
    
    @scala.inline
    def setSubtableName(value: String): Self = StObject.set(x, "subtableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtableNameUndefined: Self = StObject.set(x, "subtableName", js.undefined)
  }
}
