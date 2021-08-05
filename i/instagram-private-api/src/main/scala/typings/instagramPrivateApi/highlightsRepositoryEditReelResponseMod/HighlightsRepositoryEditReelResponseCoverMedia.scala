package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightsRepositoryEditReelResponseCoverMedia extends StObject {
  
  var crop_rect: js.Array[Double]
  
  var cropped_image_version: HighlightsRepositoryEditReelResponseCroppedImageVersion
  
  var full_image_version: HighlightsRepositoryEditReelResponseFullImageVersion
  
  var media_id: String
}
object HighlightsRepositoryEditReelResponseCoverMedia {
  
  inline def apply(
    crop_rect: js.Array[Double],
    cropped_image_version: HighlightsRepositoryEditReelResponseCroppedImageVersion,
    full_image_version: HighlightsRepositoryEditReelResponseFullImageVersion,
    media_id: String
  ): HighlightsRepositoryEditReelResponseCoverMedia = {
    val __obj = js.Dynamic.literal(crop_rect = crop_rect.asInstanceOf[js.Any], cropped_image_version = cropped_image_version.asInstanceOf[js.Any], full_image_version = full_image_version.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseCoverMedia]
  }
  
  extension [Self <: HighlightsRepositoryEditReelResponseCoverMedia](x: Self) {
    
    inline def setCrop_rect(value: js.Array[Double]): Self = StObject.set(x, "crop_rect", value.asInstanceOf[js.Any])
    
    inline def setCrop_rectVarargs(value: Double*): Self = StObject.set(x, "crop_rect", js.Array(value :_*))
    
    inline def setCropped_image_version(value: HighlightsRepositoryEditReelResponseCroppedImageVersion): Self = StObject.set(x, "cropped_image_version", value.asInstanceOf[js.Any])
    
    inline def setFull_image_version(value: HighlightsRepositoryEditReelResponseFullImageVersion): Self = StObject.set(x, "full_image_version", value.asInstanceOf[js.Any])
    
    inline def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
  }
}
