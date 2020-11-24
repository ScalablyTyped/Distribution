package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaPlayerMessages extends js.Object {
  
  var fullscreen: js.UndefOr[String] = js.native
  
  var mute: js.UndefOr[String] = js.native
  
  var pause: js.UndefOr[String] = js.native
  
  var play: js.UndefOr[String] = js.native
  
  var quality: js.UndefOr[String] = js.native
  
  var unmute: js.UndefOr[String] = js.native
}
object MediaPlayerMessages {
  
  @scala.inline
  def apply(): MediaPlayerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPlayerMessages]
  }
  
  @scala.inline
  implicit class MediaPlayerMessagesOps[Self <: MediaPlayerMessages] (val x: Self) extends AnyVal {
    
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
    def setFullscreen(value: String): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    
    @scala.inline
    def setMute(value: String): Self = this.set("mute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMute: Self = this.set("mute", js.undefined)
    
    @scala.inline
    def setPause(value: String): Self = this.set("pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    
    @scala.inline
    def setPlay(value: String): Self = this.set("play", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    
    @scala.inline
    def setQuality(value: String): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setUnmute(value: String): Self = this.set("unmute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmute: Self = this.set("unmute", js.undefined)
  }
}
