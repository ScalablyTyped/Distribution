package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoOverlayOptions extends ImageOverlayOptions {
  
  /** Whether the video starts playing automatically when loaded. */
  var autoplay: js.UndefOr[Boolean] = js.native
  
  /** Whether the video will save aspect ratio after the projection. */
  var keepAspectRatio: js.UndefOr[Boolean] = js.native
  
  /** Whether the video will loop back to the beginning when played. */
  var loop: js.UndefOr[Boolean] = js.native
}
object VideoOverlayOptions {
  
  @scala.inline
  def apply(): VideoOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoOverlayOptions]
  }
  
  @scala.inline
  implicit class VideoOverlayOptionsMutableBuilder[Self <: VideoOverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    @scala.inline
    def setKeepAspectRatio(value: Boolean): Self = StObject.set(x, "keepAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAspectRatioUndefined: Self = StObject.set(x, "keepAspectRatio", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
  }
}
