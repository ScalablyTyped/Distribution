package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeRotation extends StObject {
  
  /** Creative assignments in this creative rotation. */
  var creativeAssignments: js.UndefOr[js.Array[CreativeAssignment]] = js.undefined
  
  /**
    * Creative optimization configuration that is used by this ad. It should refer to one of the existing optimization configurations in the ad's campaign. If it is unset or set to 0,
    * then the campaign's default optimization configuration will be used for this ad.
    */
  var creativeOptimizationConfigurationId: js.UndefOr[String] = js.undefined
  
  /** Type of creative rotation. Can be used to specify whether to use sequential or random rotation. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Strategy for calculating weights. Used with CREATIVE_ROTATION_TYPE_RANDOM. */
  var weightCalculationStrategy: js.UndefOr[String] = js.undefined
}
object CreativeRotation {
  
  @scala.inline
  def apply(): CreativeRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeRotation]
  }
  
  @scala.inline
  implicit class CreativeRotationMutableBuilder[Self <: CreativeRotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeAssignments(value: js.Array[CreativeAssignment]): Self = StObject.set(x, "creativeAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeAssignmentsUndefined: Self = StObject.set(x, "creativeAssignments", js.undefined)
    
    @scala.inline
    def setCreativeAssignmentsVarargs(value: CreativeAssignment*): Self = StObject.set(x, "creativeAssignments", js.Array(value :_*))
    
    @scala.inline
    def setCreativeOptimizationConfigurationId(value: String): Self = StObject.set(x, "creativeOptimizationConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeOptimizationConfigurationIdUndefined: Self = StObject.set(x, "creativeOptimizationConfigurationId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWeightCalculationStrategy(value: String): Self = StObject.set(x, "weightCalculationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightCalculationStrategyUndefined: Self = StObject.set(x, "weightCalculationStrategy", js.undefined)
  }
}
