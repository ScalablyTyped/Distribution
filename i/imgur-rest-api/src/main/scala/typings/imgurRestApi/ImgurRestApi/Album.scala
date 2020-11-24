package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Album extends js.Object {
  
  var account_id: js.UndefOr[Double] = js.native
  
  var account_url: js.UndefOr[String] = js.native
  
  var cover: String = js.native
  
  var cover_height: Double = js.native
  
  var cover_width: Double = js.native
  
  var datetime: Double = js.native
  
  var deletehash: js.UndefOr[String] = js.native
  
  var description: String = js.native
  
  var favorite: Boolean = js.native
  
  var id: String = js.native
  
  var images: js.Array[Image] = js.native
  
  var images_count: Double = js.native
  
  var layout: String = js.native
  
  var link: String = js.native
  
  var nsfw: js.UndefOr[Boolean] = js.native
  
  var order: Double = js.native
  
  var privacy: String = js.native
  
  var section: String = js.native
  
  var title: String = js.native
  
  var views: Double = js.native
}
object Album {
  
  @scala.inline
  def apply(
    cover: String,
    cover_height: Double,
    cover_width: Double,
    datetime: Double,
    description: String,
    favorite: Boolean,
    id: String,
    images: js.Array[Image],
    images_count: Double,
    layout: String,
    link: String,
    order: Double,
    privacy: String,
    section: String,
    title: String,
    views: Double
  ): Album = {
    val __obj = js.Dynamic.literal(cover = cover.asInstanceOf[js.Any], cover_height = cover_height.asInstanceOf[js.Any], cover_width = cover_width.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], images_count = images_count.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[Album]
  }
  
  @scala.inline
  implicit class AlbumOps[Self <: Album] (val x: Self) extends AnyVal {
    
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
    def setCover(value: String): Self = this.set("cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover_height(value: Double): Self = this.set("cover_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover_width(value: Double): Self = this.set("cover_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetime(value: Double): Self = this.set("datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavorite(value: Boolean): Self = this.set("favorite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: Image*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[Image]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages_count(value: Double): Self = this.set("images_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacy(value: String): Self = this.set("privacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: String): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
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
    def setDeletehash(value: String): Self = this.set("deletehash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletehash: Self = this.set("deletehash", js.undefined)
    
    @scala.inline
    def setNsfw(value: Boolean): Self = this.set("nsfw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNsfw: Self = this.set("nsfw", js.undefined)
  }
}
