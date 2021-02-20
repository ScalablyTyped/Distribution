package typings.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightsRepositoryHighlightsTrayResponseCoverMedia extends StObject {
  
  var crop_rect: js.Array[Double | String] = js.native
  
  var cropped_image_version: HighlightsRepositoryHighlightsTrayResponseCroppedImageVersion = js.native
  
  var media_id: String = js.native
}
object HighlightsRepositoryHighlightsTrayResponseCoverMedia {
  
  @scala.inline
  def apply(
    crop_rect: js.Array[Double | String],
    cropped_image_version: HighlightsRepositoryHighlightsTrayResponseCroppedImageVersion,
    media_id: String
  ): HighlightsRepositoryHighlightsTrayResponseCoverMedia = {
    val __obj = js.Dynamic.literal(crop_rect = crop_rect.asInstanceOf[js.Any], cropped_image_version = cropped_image_version.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseCoverMedia]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryHighlightsTrayResponseCoverMediaMutableBuilder[Self <: HighlightsRepositoryHighlightsTrayResponseCoverMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrop_rect(value: js.Array[Double | String]): Self = StObject.set(x, "crop_rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrop_rectVarargs(value: (Double | String)*): Self = StObject.set(x, "crop_rect", js.Array(value :_*))
    
    @scala.inline
    def setCropped_image_version(value: HighlightsRepositoryHighlightsTrayResponseCroppedImageVersion): Self = StObject.set(x, "cropped_image_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
  }
}
