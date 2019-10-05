package typings.imgurDashRestDashApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryProfile extends js.Object {
  var total_gallery_comments: Double
  var total_gallery_favorites: Double
  var total_gallery_submissions: Double
  var trophies: js.Array[Trophy]
}

object GalleryProfile {
  @scala.inline
  def apply(
    total_gallery_comments: Double,
    total_gallery_favorites: Double,
    total_gallery_submissions: Double,
    trophies: js.Array[Trophy]
  ): GalleryProfile = {
    val __obj = js.Dynamic.literal(total_gallery_comments = total_gallery_comments, total_gallery_favorites = total_gallery_favorites, total_gallery_submissions = total_gallery_submissions, trophies = trophies)
  
    __obj.asInstanceOf[GalleryProfile]
  }
}

