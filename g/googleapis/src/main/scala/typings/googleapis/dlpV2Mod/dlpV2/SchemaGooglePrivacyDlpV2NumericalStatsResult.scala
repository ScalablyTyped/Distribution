package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of the numerical stats computation.
  */
trait SchemaGooglePrivacyDlpV2NumericalStatsResult extends StObject {
  
  /**
    * Maximum value appearing in the column.
    */
  var maxValue: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.undefined
  
  /**
    * Minimum value appearing in the column.
    */
  var minValue: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.undefined
  
  /**
    * List of 99 values that partition the set of field values into 100 equal
    * sized buckets.
    */
  var quantileValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.undefined
}
object SchemaGooglePrivacyDlpV2NumericalStatsResult {
  
  inline def apply(): SchemaGooglePrivacyDlpV2NumericalStatsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2NumericalStatsResult]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2NumericalStatsResult](x: Self) {
    
    inline def setMaxValue(value: SchemaGooglePrivacyDlpV2Value): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: SchemaGooglePrivacyDlpV2Value): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setQuantileValues(value: js.Array[SchemaGooglePrivacyDlpV2Value]): Self = StObject.set(x, "quantileValues", value.asInstanceOf[js.Any])
    
    inline def setQuantileValuesUndefined: Self = StObject.set(x, "quantileValues", js.undefined)
    
    inline def setQuantileValuesVarargs(value: SchemaGooglePrivacyDlpV2Value*): Self = StObject.set(x, "quantileValues", js.Array(value :_*))
  }
}
