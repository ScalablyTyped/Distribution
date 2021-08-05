package typings.instagramPrivateApi

import typings.instagramPrivateApi.instagramPrivateApiStrings.photo_
import typings.instagramPrivateApi.instagramPrivateApiStrings.video_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directThreadBroadcastReelOptionsMod {
  
  trait DirectThreadBroadcastReelOptions extends StObject {
    
    var mediaId: String
    
    var mediaType: js.UndefOr[photo_ | video_] = js.undefined
    
    var reelId: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object DirectThreadBroadcastReelOptions {
    
    inline def apply(mediaId: String): DirectThreadBroadcastReelOptions = {
      val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadBroadcastReelOptions]
    }
    
    extension [Self <: DirectThreadBroadcastReelOptions](x: Self) {
      
      inline def setMediaId(value: String): Self = StObject.set(x, "mediaId", value.asInstanceOf[js.Any])
      
      inline def setMediaType(value: photo_ | video_): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setReelId(value: String): Self = StObject.set(x, "reelId", value.asInstanceOf[js.Any])
      
      inline def setReelIdUndefined: Self = StObject.set(x, "reelId", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
