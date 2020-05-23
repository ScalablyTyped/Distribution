package typings.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Songs extends js.Object {
  var songs: js.Array[_]
  var `type`: String
}

object Songs {
  @scala.inline
  def apply(songs: js.Array[_], `type`: String): Songs = {
    val __obj = js.Dynamic.literal(songs = songs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Songs]
  }
}

