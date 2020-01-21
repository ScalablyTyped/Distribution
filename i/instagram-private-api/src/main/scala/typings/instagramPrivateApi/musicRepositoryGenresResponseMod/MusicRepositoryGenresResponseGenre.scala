package typings.instagramPrivateApi.musicRepositoryGenresResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicRepositoryGenresResponseGenre extends js.Object {
  var cover_artwork_uri: String
  var id: String
  var name: String
}

object MusicRepositoryGenresResponseGenre {
  @scala.inline
  def apply(cover_artwork_uri: String, id: String, name: String): MusicRepositoryGenresResponseGenre = {
    val __obj = js.Dynamic.literal(cover_artwork_uri = cover_artwork_uri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MusicRepositoryGenresResponseGenre]
  }
}

