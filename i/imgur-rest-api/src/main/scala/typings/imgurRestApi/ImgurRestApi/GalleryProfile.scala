package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GalleryProfile extends StObject {
  
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
  implicit class GalleryProfileMutableBuilder[Self <: GalleryProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotal_gallery_comments(value: Double): Self = StObject.set(x, "total_gallery_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_gallery_favorites(value: Double): Self = StObject.set(x, "total_gallery_favorites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_gallery_submissions(value: Double): Self = StObject.set(x, "total_gallery_submissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrophies(value: js.Array[Trophy]): Self = StObject.set(x, "trophies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrophiesVarargs(value: Trophy*): Self = StObject.set(x, "trophies", js.Array(value :_*))
  }
}
