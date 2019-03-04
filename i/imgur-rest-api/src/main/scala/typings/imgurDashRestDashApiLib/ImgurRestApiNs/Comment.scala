package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var album_cover: java.lang.String
  var author: java.lang.String
  var author_id: scala.Double
  var children: js.Array[Comment]
  var comment: java.lang.String
  var datetime: scala.Double
  var deleted: scala.Boolean
  var downs: scala.Double
  var id: scala.Double
  var image_id: java.lang.String
  var on_album: scala.Boolean
  var parent_id: scala.Double
  var points: scala.Double
  var ups: scala.Double
  var vote: js.UndefOr[java.lang.String] = js.undefined
}

object Comment {
  @scala.inline
  def apply(
    album_cover: java.lang.String,
    author: java.lang.String,
    author_id: scala.Double,
    children: js.Array[Comment],
    comment: java.lang.String,
    datetime: scala.Double,
    deleted: scala.Boolean,
    downs: scala.Double,
    id: scala.Double,
    image_id: java.lang.String,
    on_album: scala.Boolean,
    parent_id: scala.Double,
    points: scala.Double,
    ups: scala.Double,
    vote: java.lang.String = null
  ): Comment = {
    val __obj = js.Dynamic.literal(album_cover = album_cover, author = author, author_id = author_id, children = children, comment = comment, datetime = datetime, deleted = deleted, downs = downs, id = id, image_id = image_id, on_album = on_album, parent_id = parent_id, points = points, ups = ups)
    if (vote != null) __obj.updateDynamic("vote")(vote)
    __obj.asInstanceOf[Comment]
  }
}

