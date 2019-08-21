package typings.jssip.jssipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionMuteEvent extends js.Object {
  var audio: Boolean
  var video: Boolean
}

object SessionMuteEvent {
  @scala.inline
  def apply(audio: Boolean, video: Boolean): SessionMuteEvent = {
    val __obj = js.Dynamic.literal(audio = audio, video = video)
  
    __obj.asInstanceOf[SessionMuteEvent]
  }
}

