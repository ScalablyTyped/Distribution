package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuteParam extends js.Object {
  var mute: Boolean
}

object MuteParam {
  @scala.inline
  def apply(mute: Boolean): MuteParam = {
    val __obj = js.Dynamic.literal(mute = mute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuteParam]
  }
}

