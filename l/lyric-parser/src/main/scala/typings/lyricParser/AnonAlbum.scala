package typings.lyricParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlbum extends js.Object {
  var album: String
  var artist: String
  var by: String
  var offset: String
  var title: String
}

object AnonAlbum {
  @scala.inline
  def apply(album: String, artist: String, by: String, offset: String, title: String): AnonAlbum = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], by = by.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlbum]
  }
}

