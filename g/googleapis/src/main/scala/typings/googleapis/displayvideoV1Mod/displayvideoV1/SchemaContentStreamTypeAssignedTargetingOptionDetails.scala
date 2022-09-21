package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContentStreamTypeAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The content stream type.
    */
  var contentStreamType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_CONTENT_STREAM_TYPE`.
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaContentStreamTypeAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaContentStreamTypeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentStreamTypeAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaContentStreamTypeAssignedTargetingOptionDetails](x: Self) {
    
    inline def setContentStreamType(value: String): Self = StObject.set(x, "contentStreamType", value.asInstanceOf[js.Any])
    
    inline def setContentStreamTypeNull: Self = StObject.set(x, "contentStreamType", null)
    
    inline def setContentStreamTypeUndefined: Self = StObject.set(x, "contentStreamType", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
