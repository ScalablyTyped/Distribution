package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryAlbum extends GalleryItem {
  var cover: java.lang.String
  var cover_height: scala.Double
  var cover_width: scala.Double
  var images: js.Array[Image]
  var images_count: scala.Double
  var layout: java.lang.String
  var privacy: java.lang.String
}

object GalleryAlbum {
  @scala.inline
  def apply(
    comment_count: scala.Double,
    cover: java.lang.String,
    cover_height: scala.Double,
    cover_width: scala.Double,
    datetime: scala.Double,
    description: java.lang.String,
    downs: scala.Double,
    favorite: scala.Boolean,
    id: java.lang.String,
    images: js.Array[Image],
    images_count: scala.Double,
    is_album: scala.Boolean,
    layout: java.lang.String,
    link: java.lang.String,
    privacy: java.lang.String,
    score: scala.Double,
    title: java.lang.String,
    topic: java.lang.String,
    topic_id: scala.Double,
    ups: scala.Double,
    views: scala.Double,
    account_id: scala.Int | scala.Double = null,
    account_url: java.lang.String = null,
    nsfw: js.UndefOr[scala.Boolean] = js.undefined,
    vote: java.lang.String = null
  ): GalleryAlbum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comment_count")(comment_count)
    __obj.updateDynamic("cover")(cover)
    __obj.updateDynamic("cover_height")(cover_height)
    __obj.updateDynamic("cover_width")(cover_width)
    __obj.updateDynamic("datetime")(datetime)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("downs")(downs)
    __obj.updateDynamic("favorite")(favorite)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("images")(images)
    __obj.updateDynamic("images_count")(images_count)
    __obj.updateDynamic("is_album")(is_album)
    __obj.updateDynamic("layout")(layout)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("privacy")(privacy)
    __obj.updateDynamic("score")(score)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("topic")(topic)
    __obj.updateDynamic("topic_id")(topic_id)
    __obj.updateDynamic("ups")(ups)
    __obj.updateDynamic("views")(views)
    if (account_id != null) __obj.updateDynamic("account_id")(account_id.asInstanceOf[js.Any])
    if (account_url != null) __obj.updateDynamic("account_url")(account_url)
    if (!js.isUndefined(nsfw)) __obj.updateDynamic("nsfw")(nsfw)
    if (vote != null) __obj.updateDynamic("vote")(vote)
    __obj.asInstanceOf[GalleryAlbum]
  }
}

