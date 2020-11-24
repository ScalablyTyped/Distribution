package typings.leaflet.mod

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
  implicit class VideoOverlayOptionsOps[Self <: VideoOverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setKeepAspectRatio(value: Boolean): Self = this.set("keepAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAspectRatio: Self = this.set("keepAspectRatio", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
  }
}
