package typings.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotTopsearchDashFlatDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FbsearchRepositoryTopsearchFlatResponseListItem extends js.Object {
  var hashtag: js.UndefOr[FbsearchRepositoryTopsearchFlatResponseHashtag] = js.undefined
  var place: js.UndefOr[FbsearchRepositoryTopsearchFlatResponsePlace] = js.undefined
  var position: Double
  var user: js.UndefOr[FbsearchRepositoryTopsearchFlatResponseUser] = js.undefined
}

object FbsearchRepositoryTopsearchFlatResponseListItem {
  @scala.inline
  def apply(
    position: Double,
    hashtag: FbsearchRepositoryTopsearchFlatResponseHashtag = null,
    place: FbsearchRepositoryTopsearchFlatResponsePlace = null,
    user: FbsearchRepositoryTopsearchFlatResponseUser = null
  ): FbsearchRepositoryTopsearchFlatResponseListItem = {
    val __obj = js.Dynamic.literal(position = position)
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag)
    if (place != null) __obj.updateDynamic("place")(place)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseListItem]
  }
}

