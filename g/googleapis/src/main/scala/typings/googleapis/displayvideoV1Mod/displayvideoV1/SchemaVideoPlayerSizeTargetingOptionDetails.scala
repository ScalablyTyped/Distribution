package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoPlayerSizeTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The video player size.
    */
  var videoPlayerSize: js.UndefOr[String | Null] = js.undefined
}
object SchemaVideoPlayerSizeTargetingOptionDetails {
  
  inline def apply(): SchemaVideoPlayerSizeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoPlayerSizeTargetingOptionDetails]
  }
  
  extension [Self <: SchemaVideoPlayerSizeTargetingOptionDetails](x: Self) {
    
    inline def setVideoPlayerSize(value: String): Self = StObject.set(x, "videoPlayerSize", value.asInstanceOf[js.Any])
    
    inline def setVideoPlayerSizeNull: Self = StObject.set(x, "videoPlayerSize", null)
    
    inline def setVideoPlayerSizeUndefined: Self = StObject.set(x, "videoPlayerSize", js.undefined)
  }
}
