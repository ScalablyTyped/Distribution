package typings.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotTopsearchDashFlatDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FbsearchRepositoryTopsearchFlatResponsePlace extends js.Object {
  var header_media: FbsearchRepositoryTopsearchFlatResponseHeader_media
  var location: FbsearchRepositoryTopsearchFlatResponseLocation
  var media_bundles: js.Array[_]
  var subtitle: String
  var title: String
}

object FbsearchRepositoryTopsearchFlatResponsePlace {
  @scala.inline
  def apply(
    header_media: FbsearchRepositoryTopsearchFlatResponseHeader_media,
    location: FbsearchRepositoryTopsearchFlatResponseLocation,
    media_bundles: js.Array[_],
    subtitle: String,
    title: String
  ): FbsearchRepositoryTopsearchFlatResponsePlace = {
    val __obj = js.Dynamic.literal(header_media = header_media, location = location, media_bundles = media_bundles, subtitle = subtitle, title = title)
  
    __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponsePlace]
  }
}

