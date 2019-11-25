package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioTrackChangedParam extends js.Object {
  var currentTrack: Double
}

object AudioTrackChangedParam {
  @scala.inline
  def apply(currentTrack: Double): AudioTrackChangedParam = {
    val __obj = js.Dynamic.literal(currentTrack = currentTrack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AudioTrackChangedParam]
  }
}

