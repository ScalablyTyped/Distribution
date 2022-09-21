package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOptimizationActivity extends StObject {
  
  /**
    * Floodlight activity ID of this optimization activity. This is a required field.
    */
  var floodlightActivityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of the floodlight activity. This is a read-only, auto-generated field.
    */
  var floodlightActivityIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Weight associated with this optimization. The weight assigned will be understood in proportion to the weights assigned to the other optimization activities. Value must be greater than or equal to 1.
    */
  var weight: js.UndefOr[Double | Null] = js.undefined
}
object SchemaOptimizationActivity {
  
  inline def apply(): SchemaOptimizationActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptimizationActivity]
  }
  
  extension [Self <: SchemaOptimizationActivity](x: Self) {
    
    inline def setFloodlightActivityId(value: String): Self = StObject.set(x, "floodlightActivityId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "floodlightActivityIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityIdDimensionValueUndefined: Self = StObject.set(x, "floodlightActivityIdDimensionValue", js.undefined)
    
    inline def setFloodlightActivityIdNull: Self = StObject.set(x, "floodlightActivityId", null)
    
    inline def setFloodlightActivityIdUndefined: Self = StObject.set(x, "floodlightActivityId", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightNull: Self = StObject.set(x, "weight", null)
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
