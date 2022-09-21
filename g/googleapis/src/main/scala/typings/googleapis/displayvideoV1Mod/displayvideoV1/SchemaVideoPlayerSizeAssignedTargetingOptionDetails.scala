package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoPlayerSizeAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_VIDEO_PLAYER_SIZE`.
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The video player size. Output only in v1. Required in v2.
    */
  var videoPlayerSize: js.UndefOr[String | Null] = js.undefined
}
object SchemaVideoPlayerSizeAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaVideoPlayerSizeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoPlayerSizeAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaVideoPlayerSizeAssignedTargetingOptionDetails](x: Self) {
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
    
    inline def setVideoPlayerSize(value: String): Self = StObject.set(x, "videoPlayerSize", value.asInstanceOf[js.Any])
    
    inline def setVideoPlayerSizeNull: Self = StObject.set(x, "videoPlayerSize", null)
    
    inline def setVideoPlayerSizeUndefined: Self = StObject.set(x, "videoPlayerSize", js.undefined)
  }
}
