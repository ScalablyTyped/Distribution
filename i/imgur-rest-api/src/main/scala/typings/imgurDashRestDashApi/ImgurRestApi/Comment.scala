package typings.imgurDashRestDashApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var album_cover: String
  var author: String
  var author_id: Double
  var children: js.Array[Comment]
  var comment: String
  var datetime: Double
  var deleted: Boolean
  var downs: Double
  var id: Double
  var image_id: String
  var on_album: Boolean
  var parent_id: Double
  var points: Double
  var ups: Double
  var vote: js.UndefOr[String] = js.undefined
}

object Comment {
  @scala.inline
  def apply(
    album_cover: String,
    author: String,
    author_id: Double,
    children: js.Array[Comment],
    comment: String,
    datetime: Double,
    deleted: Boolean,
    downs: Double,
    id: Double,
    image_id: String,
    on_album: Boolean,
    parent_id: Double,
    points: Double,
    ups: Double,
    vote: String = null
  ): Comment = {
    val __obj = js.Dynamic.literal(album_cover = album_cover.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], author_id = author_id.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_id = image_id.asInstanceOf[js.Any], on_album = on_album.asInstanceOf[js.Any], parent_id = parent_id.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any])
    if (vote != null) __obj.updateDynamic("vote")(vote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

