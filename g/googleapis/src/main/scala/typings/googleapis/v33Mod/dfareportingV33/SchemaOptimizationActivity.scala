package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative optimization activity.
  */
@js.native
trait SchemaOptimizationActivity extends StObject {
  
  /**
    * Floodlight activity ID of this optimization activity. This is a required
    * field.
    */
  var floodlightActivityId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the floodlight activity. This is a
    * read-only, auto-generated field.
    */
  var floodlightActivityIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Weight associated with this optimization. The weight assigned will be
    * understood in proportion to the weights assigned to the other
    * optimization activities. Value must be greater than or equal to 1.
    */
  var weight: js.UndefOr[Double] = js.native
}
object SchemaOptimizationActivity {
  
  @scala.inline
  def apply(): SchemaOptimizationActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptimizationActivity]
  }
  
  @scala.inline
  implicit class SchemaOptimizationActivityMutableBuilder[Self <: SchemaOptimizationActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloodlightActivityId(value: String): Self = StObject.set(x, "floodlightActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivityIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "floodlightActivityIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivityIdDimensionValueUndefined: Self = StObject.set(x, "floodlightActivityIdDimensionValue", js.undefined)
    
    @scala.inline
    def setFloodlightActivityIdUndefined: Self = StObject.set(x, "floodlightActivityId", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
