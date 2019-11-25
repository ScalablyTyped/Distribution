package typings.instagramDashPrivateDashApi.distResponsesMusicDotRepositoryDotMoodsDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicRepositoryMoodsResponseRootObject extends js.Object {
  var items: js.Array[MusicRepositoryMoodsResponseItemsItem]
  var status: String
}

object MusicRepositoryMoodsResponseRootObject {
  @scala.inline
  def apply(items: js.Array[MusicRepositoryMoodsResponseItemsItem], status: String): MusicRepositoryMoodsResponseRootObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MusicRepositoryMoodsResponseRootObject]
  }
}

