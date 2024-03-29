package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaParentalStatusAssignedTargetingOptionDetails extends StObject {
  
  /**
    * The parental status of the audience. Output only in v1. Required in v2.
    */
  var parentalStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_PARENTAL_STATUS`.
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaParentalStatusAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaParentalStatusAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParentalStatusAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaParentalStatusAssignedTargetingOptionDetails](x: Self) {
    
    inline def setParentalStatus(value: String): Self = StObject.set(x, "parentalStatus", value.asInstanceOf[js.Any])
    
    inline def setParentalStatusNull: Self = StObject.set(x, "parentalStatus", null)
    
    inline def setParentalStatusUndefined: Self = StObject.set(x, "parentalStatus", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
