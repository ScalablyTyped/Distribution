package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative Rotation.
  */
trait SchemaCreativeRotation extends StObject {
  
  /**
    * Creative assignments in this creative rotation.
    */
  var creativeAssignments: js.UndefOr[js.Array[SchemaCreativeAssignment]] = js.undefined
  
  /**
    * Creative optimization configuration that is used by this ad. It should
    * refer to one of the existing optimization configurations in the ad&#39;s
    * campaign. If it is unset or set to 0, then the campaign&#39;s default
    * optimization configuration will be used for this ad.
    */
  var creativeOptimizationConfigurationId: js.UndefOr[String] = js.undefined
  
  /**
    * Type of creative rotation. Can be used to specify whether to use
    * sequential or random rotation.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Strategy for calculating weights. Used with
    * CREATIVE_ROTATION_TYPE_RANDOM.
    */
  var weightCalculationStrategy: js.UndefOr[String] = js.undefined
}
object SchemaCreativeRotation {
  
  inline def apply(): SchemaCreativeRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeRotation]
  }
  
  extension [Self <: SchemaCreativeRotation](x: Self) {
    
    inline def setCreativeAssignments(value: js.Array[SchemaCreativeAssignment]): Self = StObject.set(x, "creativeAssignments", value.asInstanceOf[js.Any])
    
    inline def setCreativeAssignmentsUndefined: Self = StObject.set(x, "creativeAssignments", js.undefined)
    
    inline def setCreativeAssignmentsVarargs(value: SchemaCreativeAssignment*): Self = StObject.set(x, "creativeAssignments", js.Array(value :_*))
    
    inline def setCreativeOptimizationConfigurationId(value: String): Self = StObject.set(x, "creativeOptimizationConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setCreativeOptimizationConfigurationIdUndefined: Self = StObject.set(x, "creativeOptimizationConfigurationId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWeightCalculationStrategy(value: String): Self = StObject.set(x, "weightCalculationStrategy", value.asInstanceOf[js.Any])
    
    inline def setWeightCalculationStrategyUndefined: Self = StObject.set(x, "weightCalculationStrategy", js.undefined)
  }
}
