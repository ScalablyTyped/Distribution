package typings.iabVpaid.iab.vpaid

import typings.std.HTMLElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JavaScript specific VPAID init config
  */
trait EnvironmentVars extends js.Object {
  /**
    * A reference to the HTML element on the page in which the ad is to be rendered.
    * The ad unit essentially gets control of that element.
    */
  var slot: HTMLElement
  /** A reference to the video element on the page where the ad video is to be rendered */
  var videoSlot: HTMLVideoElement
  /** A boolean flag indicating whether the `videoSlot` is capable of autoplaying. */
  var videoSlotCanAutoPlay: Boolean
}

object EnvironmentVars {
  @scala.inline
  def apply(slot: HTMLElement, videoSlot: HTMLVideoElement, videoSlotCanAutoPlay: Boolean): EnvironmentVars = {
    val __obj = js.Dynamic.literal(slot = slot.asInstanceOf[js.Any], videoSlot = videoSlot.asInstanceOf[js.Any], videoSlotCanAutoPlay = videoSlotCanAutoPlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentVars]
  }
}

