package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  var account_id: js.UndefOr[Double] = js.native
  var account_url: js.UndefOr[String] = js.native
  var animated: Boolean = js.native
  var bandwidth: Double = js.native
  var datetime: Double = js.native
  var deletehash: js.UndefOr[String] = js.native
  var description: String = js.native
  var favorite: Boolean = js.native
  var gifv: js.UndefOr[String] = js.native
  var height: Double = js.native
  var id: String = js.native
  var link: String = js.native
  var looping: js.UndefOr[Boolean] = js.native
  var mp4: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var nsfw: js.UndefOr[Boolean] = js.native
  var section: String = js.native
  var size: Double = js.native
  var title: String = js.native
  var `type`: String = js.native
  var views: Double = js.native
  var vote: js.UndefOr[String] = js.native
  var webm: js.UndefOr[String] = js.native
  var width: Double = js.native
}

object Image {
  @scala.inline
  def apply(
    animated: Boolean,
    bandwidth: Double,
    datetime: Double,
    description: String,
    favorite: Boolean,
    height: Double,
    id: String,
    link: String,
    section: String,
    size: Double,
    title: String,
    `type`: String,
    views: Double,
    width: Double
  ): Image = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], bandwidth = bandwidth.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def setBandwidth(value: Double): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatetime(value: Double): Self = this.set("datetime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFavorite(value: Boolean): Self = this.set("favorite", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setSection(value: String): Self = this.set("section", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setViews(value: Double): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccount_id(value: Double): Self = this.set("account_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount_id: Self = this.set("account_id", js.undefined)
    @scala.inline
    def setAccount_url(value: String): Self = this.set("account_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount_url: Self = this.set("account_url", js.undefined)
    @scala.inline
    def setDeletehash(value: String): Self = this.set("deletehash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletehash: Self = this.set("deletehash", js.undefined)
    @scala.inline
    def setGifv(value: String): Self = this.set("gifv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGifv: Self = this.set("gifv", js.undefined)
    @scala.inline
    def setLooping(value: Boolean): Self = this.set("looping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLooping: Self = this.set("looping", js.undefined)
    @scala.inline
    def setMp4(value: String): Self = this.set("mp4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMp4: Self = this.set("mp4", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNsfw(value: Boolean): Self = this.set("nsfw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNsfw: Self = this.set("nsfw", js.undefined)
    @scala.inline
    def setVote(value: String): Self = this.set("vote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVote: Self = this.set("vote", js.undefined)
    @scala.inline
    def setWebm(value: String): Self = this.set("webm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebm: Self = this.set("webm", js.undefined)
  }
  
}

