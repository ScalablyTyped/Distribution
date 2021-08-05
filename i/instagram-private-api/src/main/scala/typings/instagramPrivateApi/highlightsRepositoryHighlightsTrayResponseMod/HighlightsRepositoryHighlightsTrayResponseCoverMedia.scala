package typings.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightsRepositoryHighlightsTrayResponseCoverMedia extends StObject {
  
  var crop_rect: js.Array[Double | String]
  
  var cropped_image_version: HighlightsRepositoryHighlightsTrayResponseCroppedImageVersion
  
  var media_id: String
}
object HighlightsRepositoryHighlightsTrayResponseCoverMedia {
  
  inline def apply(
    crop_rect: js.Array[Double | String],
    cropped_image_version: HighlightsRepositoryHighlightsTrayResponseCroppedImageVersion,
    media_id: String
  ): HighlightsRepositoryHighlightsTrayResponseCoverMedia = {
    val __obj = js.Dynamic.literal(crop_rect = crop_rect.asInstanceOf[js.Any], cropped_image_version = cropped_image_version.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseCoverMedia]
  }
  
  extension [Self <: HighlightsRepositoryHighlightsTrayResponseCoverMedia](x: Self) {
    
    inline def setCrop_rect(value: js.Array[Double | String]): Self = StObject.set(x, "crop_rect", value.asInstanceOf[js.Any])
    
    inline def setCrop_rectVarargs(value: (Double | String)*): Self = StObject.set(x, "crop_rect", js.Array(value :_*))
    
    inline def setCropped_image_version(value: HighlightsRepositoryHighlightsTrayResponseCroppedImageVersion): Self = StObject.set(x, "cropped_image_version", value.asInstanceOf[js.Any])
    
    inline def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
  }
}
