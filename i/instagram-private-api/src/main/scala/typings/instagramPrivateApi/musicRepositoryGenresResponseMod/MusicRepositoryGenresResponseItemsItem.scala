package typings.instagramPrivateApi.musicRepositoryGenresResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicRepositoryGenresResponseItemsItem extends js.Object {
  var genre: MusicRepositoryGenresResponseGenre
}

object MusicRepositoryGenresResponseItemsItem {
  @scala.inline
  def apply(genre: MusicRepositoryGenresResponseGenre): MusicRepositoryGenresResponseItemsItem = {
    val __obj = js.Dynamic.literal(genre = genre.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MusicRepositoryGenresResponseItemsItem]
  }
}

