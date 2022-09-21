package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaViewabilityAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_VIEWABILITY` (e.g., "509010" for targeting the `VIEWABILITY_10_PERCENT_OR_MORE` option).
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The predicted viewability percentage. Output only in v1. Required in v2.
    */
  var viewability: js.UndefOr[String | Null] = js.undefined
}
object SchemaViewabilityAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaViewabilityAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaViewabilityAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaViewabilityAssignedTargetingOptionDetails](x: Self) {
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
    
    inline def setViewability(value: String): Self = StObject.set(x, "viewability", value.asInstanceOf[js.Any])
    
    inline def setViewabilityNull: Self = StObject.set(x, "viewability", null)
    
    inline def setViewabilityUndefined: Self = StObject.set(x, "viewability", js.undefined)
  }
}
