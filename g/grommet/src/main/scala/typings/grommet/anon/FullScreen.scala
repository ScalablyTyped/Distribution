package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullScreen extends js.Object {
  
  var closeMenu: js.UndefOr[String] = js.native
  
  var fullScreen: js.UndefOr[String] = js.native
  
  var openMenu: js.UndefOr[String] = js.native
  
  var pauseButton: js.UndefOr[String] = js.native
  
  var playButton: js.UndefOr[String] = js.native
  
  var progressMeter: js.UndefOr[String] = js.native
  
  var scrubber: js.UndefOr[String] = js.native
  
  var volueDown: js.UndefOr[String] = js.native
  
  var volumeUp: js.UndefOr[String] = js.native
}
object FullScreen {
  
  @scala.inline
  def apply(): FullScreen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullScreen]
  }
  
  @scala.inline
  implicit class FullScreenOps[Self <: FullScreen] (val x: Self) extends AnyVal {
    
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
    def setCloseMenu(value: String): Self = this.set("closeMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseMenu: Self = this.set("closeMenu", js.undefined)
    
    @scala.inline
    def setFullScreen(value: String): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    
    @scala.inline
    def setOpenMenu(value: String): Self = this.set("openMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenMenu: Self = this.set("openMenu", js.undefined)
    
    @scala.inline
    def setPauseButton(value: String): Self = this.set("pauseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseButton: Self = this.set("pauseButton", js.undefined)
    
    @scala.inline
    def setPlayButton(value: String): Self = this.set("playButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayButton: Self = this.set("playButton", js.undefined)
    
    @scala.inline
    def setProgressMeter(value: String): Self = this.set("progressMeter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressMeter: Self = this.set("progressMeter", js.undefined)
    
    @scala.inline
    def setScrubber(value: String): Self = this.set("scrubber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrubber: Self = this.set("scrubber", js.undefined)
    
    @scala.inline
    def setVolueDown(value: String): Self = this.set("volueDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolueDown: Self = this.set("volueDown", js.undefined)
    
    @scala.inline
    def setVolumeUp(value: String): Self = this.set("volumeUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeUp: Self = this.set("volumeUp", js.undefined)
  }
}
