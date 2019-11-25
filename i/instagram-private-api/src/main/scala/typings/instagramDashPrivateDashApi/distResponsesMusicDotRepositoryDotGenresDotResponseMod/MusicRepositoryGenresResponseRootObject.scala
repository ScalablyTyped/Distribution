package typings.instagramDashPrivateDashApi.distResponsesMusicDotRepositoryDotGenresDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicRepositoryGenresResponseRootObject extends js.Object {
  var items: js.Array[MusicRepositoryGenresResponseItemsItem]
  var status: String
}

object MusicRepositoryGenresResponseRootObject {
  @scala.inline
  def apply(items: js.Array[MusicRepositoryGenresResponseItemsItem], status: String): MusicRepositoryGenresResponseRootObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MusicRepositoryGenresResponseRootObject]
  }
}

