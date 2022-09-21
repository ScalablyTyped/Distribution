package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAudioContentTypeAssignedTargetingOptionDetails extends StObject {
  
  /**
    * The audio content type. Output only in v1. Required in v2.
    */
  var audioContentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_AUDIO_CONTENT_TYPE`.
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaAudioContentTypeAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaAudioContentTypeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudioContentTypeAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaAudioContentTypeAssignedTargetingOptionDetails](x: Self) {
    
    inline def setAudioContentType(value: String): Self = StObject.set(x, "audioContentType", value.asInstanceOf[js.Any])
    
    inline def setAudioContentTypeNull: Self = StObject.set(x, "audioContentType", null)
    
    inline def setAudioContentTypeUndefined: Self = StObject.set(x, "audioContentType", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
