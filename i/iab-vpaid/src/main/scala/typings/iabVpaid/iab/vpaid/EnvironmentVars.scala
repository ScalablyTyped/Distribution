package typings.iabVpaid.iab.vpaid

import typings.std.HTMLElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JavaScript specific VPAID init config
  */
@js.native
trait EnvironmentVars extends js.Object {
  
  /**
    * A reference to the HTML element on the page in which the ad is to be rendered.
    * The ad unit essentially gets control of that element.
    */
  var slot: HTMLElement = js.native
  
  /** A reference to the video element on the page where the ad video is to be rendered */
  var videoSlot: HTMLVideoElement = js.native
  
  /** A boolean flag indicating whether the `videoSlot` is capable of autoplaying. */
  var videoSlotCanAutoPlay: Boolean = js.native
}
object EnvironmentVars {
  
  @scala.inline
  def apply(slot: HTMLElement, videoSlot: HTMLVideoElement, videoSlotCanAutoPlay: Boolean): EnvironmentVars = {
    val __obj = js.Dynamic.literal(slot = slot.asInstanceOf[js.Any], videoSlot = videoSlot.asInstanceOf[js.Any], videoSlotCanAutoPlay = videoSlotCanAutoPlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentVars]
  }
  
  @scala.inline
  implicit class EnvironmentVarsOps[Self <: EnvironmentVars] (val x: Self) extends AnyVal {
    
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
    def setSlot(value: HTMLElement): Self = this.set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSlot(value: HTMLVideoElement): Self = this.set("videoSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSlotCanAutoPlay(value: Boolean): Self = this.set("videoSlotCanAutoPlay", value.asInstanceOf[js.Any])
  }
}
