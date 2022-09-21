package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContentDurationAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The content duration.
    */
  var contentDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_CONTENT_DURATION`.
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaContentDurationAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaContentDurationAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentDurationAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaContentDurationAssignedTargetingOptionDetails](x: Self) {
    
    inline def setContentDuration(value: String): Self = StObject.set(x, "contentDuration", value.asInstanceOf[js.Any])
    
    inline def setContentDurationNull: Self = StObject.set(x, "contentDuration", null)
    
    inline def setContentDurationUndefined: Self = StObject.set(x, "contentDuration", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
