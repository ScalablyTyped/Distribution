package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeParam extends js.Object {
  var volume: Boolean
}

object VolumeParam {
  @scala.inline
  def apply(volume: Boolean): VolumeParam = {
    val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeParam]
  }
}

