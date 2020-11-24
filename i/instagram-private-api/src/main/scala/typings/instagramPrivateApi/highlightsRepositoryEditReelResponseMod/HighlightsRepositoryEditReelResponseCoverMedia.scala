package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightsRepositoryEditReelResponseCoverMedia extends js.Object {
  
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
  implicit class HighlightsRepositoryEditReelResponseCoverMediaOps[Self <: HighlightsRepositoryEditReelResponseCoverMedia] (val x: Self) extends AnyVal {
    
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
    def setCrop_rectVarargs(value: Double*): Self = this.set("crop_rect", js.Array(value :_*))
    
    @scala.inline
    def setCrop_rect(value: js.Array[Double]): Self = this.set("crop_rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropped_image_version(value: HighlightsRepositoryEditReelResponseCroppedImageVersion): Self = this.set("cropped_image_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_image_version(value: HighlightsRepositoryEditReelResponseFullImageVersion): Self = this.set("full_image_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_id(value: String): Self = this.set("media_id", value.asInstanceOf[js.Any])
  }
}
