package typings.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FbsearchRepositoryTopsearchFlatResponseHashtag extends js.Object {
  var id: String
  var media_count: Double
  var name: String
  var profile_pic_url: String
  var search_result_subtitle: String
}

object FbsearchRepositoryTopsearchFlatResponseHashtag {
  @scala.inline
  def apply(
    id: String,
    media_count: Double,
    name: String,
    profile_pic_url: String,
    search_result_subtitle: String
  ): FbsearchRepositoryTopsearchFlatResponseHashtag = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], search_result_subtitle = search_result_subtitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseHashtag]
  }
}

