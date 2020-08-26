package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GalleryItem extends js.Object {
  var account_id: js.UndefOr[Double] = js.native
  var account_url: js.UndefOr[String] = js.native
  var comment_count: Double = js.native
  var datetime: Double = js.native
  var description: String = js.native
  var downs: Double = js.native
  var favorite: Boolean = js.native
  var id: String = js.native
  var is_album: Boolean = js.native
  var link: String = js.native
  var nsfw: js.UndefOr[Boolean] = js.native
  var score: Double = js.native
  var title: String = js.native
  var topic: String = js.native
  var topic_id: Double = js.native
  var ups: Double = js.native
  var views: Double = js.native
  var vote: js.UndefOr[String] = js.native
}

object GalleryItem {
  @scala.inline
  def apply(
    comment_count: Double,
    datetime: Double,
    description: String,
    downs: Double,
    favorite: Boolean,
    id: String,
    is_album: Boolean,
    link: String,
    score: Double,
    title: String,
    topic: String,
    topic_id: Double,
    ups: Double,
    views: Double
  ): GalleryItem = {
    val __obj = js.Dynamic.literal(comment_count = comment_count.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_album = is_album.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], topic_id = topic_id.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryItem]
  }
  @scala.inline
  implicit class GalleryItemOps[Self <: GalleryItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComment_count(value: Double): Self = this.set("comment_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatetime(value: Double): Self = this.set("datetime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDowns(value: Double): Self = this.set("downs", value.asInstanceOf[js.Any])
    @scala.inline
    def setFavorite(value: Boolean): Self = this.set("favorite", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_album(value: Boolean): Self = this.set("is_album", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic_id(value: Double): Self = this.set("topic_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUps(value: Double): Self = this.set("ups", value.asInstanceOf[js.Any])
    @scala.inline
    def setViews(value: Double): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccount_id(value: Double): Self = this.set("account_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount_id: Self = this.set("account_id", js.undefined)
    @scala.inline
    def setAccount_url(value: String): Self = this.set("account_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount_url: Self = this.set("account_url", js.undefined)
    @scala.inline
    def setNsfw(value: Boolean): Self = this.set("nsfw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNsfw: Self = this.set("nsfw", js.undefined)
    @scala.inline
    def setVote(value: String): Self = this.set("vote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVote: Self = this.set("vote", js.undefined)
  }
  
}

