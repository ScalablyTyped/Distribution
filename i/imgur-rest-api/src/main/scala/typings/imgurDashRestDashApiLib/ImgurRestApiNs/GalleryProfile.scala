package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryProfile extends js.Object {
  var total_gallery_comments: scala.Double
  var total_gallery_favorites: scala.Double
  var total_gallery_submissions: scala.Double
  var trophies: js.Array[Trophy]
}

object GalleryProfile {
  @scala.inline
  def apply(
    total_gallery_comments: scala.Double,
    total_gallery_favorites: scala.Double,
    total_gallery_submissions: scala.Double,
    trophies: js.Array[Trophy]
  ): GalleryProfile = {
    val __obj = js.Dynamic.literal(total_gallery_comments = total_gallery_comments, total_gallery_favorites = total_gallery_favorites, total_gallery_submissions = total_gallery_submissions, trophies = trophies)
  
    __obj.asInstanceOf[GalleryProfile]
  }
}

