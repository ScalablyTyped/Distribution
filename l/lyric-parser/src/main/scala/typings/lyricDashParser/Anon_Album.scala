package typings.lyricDashParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Album extends js.Object {
  var album: String
  var artist: String
  var by: String
  var offset: String
  var title: String
}

object Anon_Album {
  @scala.inline
  def apply(album: String, artist: String, by: String, offset: String, title: String): Anon_Album = {
    val __obj = js.Dynamic.literal(album = album, artist = artist, by = by, offset = offset, title = title)
  
    __obj.asInstanceOf[Anon_Album]
  }
}

