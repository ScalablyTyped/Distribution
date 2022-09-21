package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNativeContentPositionAssignedTargetingOptionDetails extends StObject {
  
  /**
    * The content position. Output only in v1. Required in v2.
    */
  var contentPosition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_NATIVE_CONTENT_POSITION`.
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaNativeContentPositionAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaNativeContentPositionAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNativeContentPositionAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaNativeContentPositionAssignedTargetingOptionDetails](x: Self) {
    
    inline def setContentPosition(value: String): Self = StObject.set(x, "contentPosition", value.asInstanceOf[js.Any])
    
    inline def setContentPositionNull: Self = StObject.set(x, "contentPosition", null)
    
    inline def setContentPositionUndefined: Self = StObject.set(x, "contentPosition", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
