package typings.instagramDashPrivateDashApi.distTypesPostingDotAlbumDotOptionsMod

import typings.instagramDashPrivateDashApi.distTypesPostingDotOptionsMod.PostingLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostingAlbumOptions extends js.Object {
  var caption: js.UndefOr[String] = js.undefined
  var items: js.Array[PostingAlbumPhotoItem | PostingAlbumVideoItem]
  var location: js.UndefOr[PostingLocation] = js.undefined
}

object PostingAlbumOptions {
  @scala.inline
  def apply(
    items: js.Array[PostingAlbumPhotoItem | PostingAlbumVideoItem],
    caption: String = null,
    location: PostingLocation = null
  ): PostingAlbumOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingAlbumOptions]
  }
}

