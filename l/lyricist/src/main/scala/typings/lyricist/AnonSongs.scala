package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSongs extends js.Object {
  var songs: js.Array[_]
  var `type`: String
}

object AnonSongs {
  @scala.inline
  def apply(songs: js.Array[_], `type`: String): AnonSongs = {
    val __obj = js.Dynamic.literal(songs = songs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSongs]
  }
}

