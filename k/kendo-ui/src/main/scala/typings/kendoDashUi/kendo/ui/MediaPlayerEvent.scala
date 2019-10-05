package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaPlayerEvent extends js.Object {
  var preventDefault: js.Function
  var sender: MediaPlayer
  def isDefaultPrevented(): Boolean
}

object MediaPlayerEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: MediaPlayer): MediaPlayerEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[MediaPlayerEvent]
  }
}

