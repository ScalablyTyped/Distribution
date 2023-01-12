package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoOverlayOptions
  extends StObject
     with ImageOverlayOptions {
  
  /** Whether the video starts playing automatically when loaded. */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the video will save aspect ratio after the projection. Relevant for supported browsers. See
    * [browser compatibility](https://developer.mozilla.org/en-US/docs/Web/CSS/object-fit)
    */
  var keepAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the video will loop back to the beginning when played. */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the video starts on mute when loaded. */
  var muted: js.UndefOr[Boolean] = js.undefined
  
  var playsInline: js.UndefOr[Boolean] = js.undefined
}
object VideoOverlayOptions {
  
  inline def apply(): VideoOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoOverlayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoOverlayOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setKeepAspectRatio(value: Boolean): Self = StObject.set(x, "keepAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setKeepAspectRatioUndefined: Self = StObject.set(x, "keepAspectRatio", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
    
    inline def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
  }
}
