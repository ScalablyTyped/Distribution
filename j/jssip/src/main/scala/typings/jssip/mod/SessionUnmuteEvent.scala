package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionUnmuteEvent extends js.Object {
  var audio: Boolean
  var video: Boolean
}

object SessionUnmuteEvent {
  @scala.inline
  def apply(audio: Boolean, video: Boolean): SessionUnmuteEvent = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionUnmuteEvent]
  }
}

