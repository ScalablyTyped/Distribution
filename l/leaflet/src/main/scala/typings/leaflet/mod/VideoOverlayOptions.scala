package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoOverlayOptions
  extends StObject
     with ImageOverlayOptions {
  
  /** Whether the video starts playing automatically when loaded. */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the video will save aspect ratio after the projection. */
  var keepAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the video will loop back to the beginning when played. */
  var loop: js.UndefOr[Boolean] = js.undefined
}
object VideoOverlayOptions {
  
  inline def apply(): VideoOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoOverlayOptions]
  }
  
  extension [Self <: VideoOverlayOptions](x: Self) {
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setKeepAspectRatio(value: Boolean): Self = StObject.set(x, "keepAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setKeepAspectRatioUndefined: Self = StObject.set(x, "keepAspectRatio", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
  }
}
