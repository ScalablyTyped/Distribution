package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightsRepositoryEditReelResponseCoverMedia extends StObject {
  
  var crop_rect: js.Array[Double] = js.native
  
  var cropped_image_version: HighlightsRepositoryEditReelResponseCroppedImageVersion = js.native
  
  var full_image_version: HighlightsRepositoryEditReelResponseFullImageVersion = js.native
  
  var media_id: String = js.native
}
object HighlightsRepositoryEditReelResponseCoverMedia {
  
  @scala.inline
  def apply(
    crop_rect: js.Array[Double],
    cropped_image_version: HighlightsRepositoryEditReelResponseCroppedImageVersion,
    full_image_version: HighlightsRepositoryEditReelResponseFullImageVersion,
    media_id: String
  ): HighlightsRepositoryEditReelResponseCoverMedia = {
    val __obj = js.Dynamic.literal(crop_rect = crop_rect.asInstanceOf[js.Any], cropped_image_version = cropped_image_version.asInstanceOf[js.Any], full_image_version = full_image_version.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseCoverMedia]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseCoverMediaMutableBuilder[Self <: HighlightsRepositoryEditReelResponseCoverMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrop_rect(value: js.Array[Double]): Self = StObject.set(x, "crop_rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrop_rectVarargs(value: Double*): Self = StObject.set(x, "crop_rect", js.Array(value :_*))
    
    @scala.inline
    def setCropped_image_version(value: HighlightsRepositoryEditReelResponseCroppedImageVersion): Self = StObject.set(x, "cropped_image_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_image_version(value: HighlightsRepositoryEditReelResponseFullImageVersion): Self = StObject.set(x, "full_image_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
  }
}
