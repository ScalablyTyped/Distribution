package typings.imgurDashRestDashApi.ImgurRestApiNs

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
    val __obj = js.Dynamic.literal(album_cover = album_cover, author = author, author_id = author_id, children = children, comment = comment, datetime = datetime, deleted = deleted, downs = downs, id = id, image_id = image_id, on_album = on_album, parent_id = parent_id, points = points, ups = ups)
    if (vote != null) __obj.updateDynamic("vote")(vote)
    __obj.asInstanceOf[Comment]
  }
}

