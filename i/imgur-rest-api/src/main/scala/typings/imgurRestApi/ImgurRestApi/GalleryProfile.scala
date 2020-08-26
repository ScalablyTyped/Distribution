package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GalleryProfile extends js.Object {
  var total_gallery_comments: Double = js.native
  var total_gallery_favorites: Double = js.native
  var total_gallery_submissions: Double = js.native
  var trophies: js.Array[Trophy] = js.native
}

object GalleryProfile {
  @scala.inline
  def apply(
    total_gallery_comments: Double,
    total_gallery_favorites: Double,
    total_gallery_submissions: Double,
    trophies: js.Array[Trophy]
  ): GalleryProfile = {
    val __obj = js.Dynamic.literal(total_gallery_comments = total_gallery_comments.asInstanceOf[js.Any], total_gallery_favorites = total_gallery_favorites.asInstanceOf[js.Any], total_gallery_submissions = total_gallery_submissions.asInstanceOf[js.Any], trophies = trophies.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryProfile]
  }
  @scala.inline
  implicit class GalleryProfileOps[Self <: GalleryProfile] (val x: Self) extends AnyVal {
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
    def setTotal_gallery_comments(value: Double): Self = this.set("total_gallery_comments", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_gallery_favorites(value: Double): Self = this.set("total_gallery_favorites", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_gallery_submissions(value: Double): Self = this.set("total_gallery_submissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrophiesVarargs(value: Trophy*): Self = this.set("trophies", js.Array(value :_*))
    @scala.inline
    def setTrophies(value: js.Array[Trophy]): Self = this.set("trophies", value.asInstanceOf[js.Any])
  }
  
}

