package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionsListParam extends js.Object {
  var tracks: js.Array[_]
}

object CaptionsListParam {
  @scala.inline
  def apply(tracks: js.Array[_]): CaptionsListParam = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionsListParam]
  }
}

