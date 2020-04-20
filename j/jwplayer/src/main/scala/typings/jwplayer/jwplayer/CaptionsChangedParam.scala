package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionsChangedParam extends js.Object {
  var currentTrack: Double
}

object CaptionsChangedParam {
  @scala.inline
  def apply(currentTrack: Double): CaptionsChangedParam = {
    val __obj = js.Dynamic.literal(currentTrack = currentTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionsChangedParam]
  }
}

