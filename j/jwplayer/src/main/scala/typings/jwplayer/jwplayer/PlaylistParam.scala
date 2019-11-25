package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistParam extends js.Object {
  var playlist: js.Array[_]
}

object PlaylistParam {
  @scala.inline
  def apply(playlist: js.Array[_]): PlaylistParam = {
    val __obj = js.Dynamic.literal(playlist = playlist.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlaylistParam]
  }
}

