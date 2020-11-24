package typings.instagramPrivateApi.highlightsRepositoryCreateReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightsRepositoryCreateReelResponseCoverMedia extends js.Object {
  
  var crop_rect: Null = js.native
  
  var cropped_image_version: HighlightsRepositoryCreateReelResponseCroppedImageVersion = js.native
  
  var full_image_version: HighlightsRepositoryCreateReelResponseFullImageVersion = js.native
  
  var media_id: String = js.native
}
object HighlightsRepositoryCreateReelResponseCoverMedia {
  
  @scala.inline
  def apply(
    crop_rect: Null,
    cropped_image_version: HighlightsRepositoryCreateReelResponseCroppedImageVersion,
    full_image_version: HighlightsRepositoryCreateReelResponseFullImageVersion,
    media_id: String
  ): HighlightsRepositoryCreateReelResponseCoverMedia = {
    val __obj = js.Dynamic.literal(crop_rect = crop_rect.asInstanceOf[js.Any], cropped_image_version = cropped_image_version.asInstanceOf[js.Any], full_image_version = full_image_version.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseCoverMedia]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryCreateReelResponseCoverMediaOps[Self <: HighlightsRepositoryCreateReelResponseCoverMedia] (val x: Self) extends AnyVal {
    
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
    def setCrop_rect(value: Null): Self = this.set("crop_rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropped_image_version(value: HighlightsRepositoryCreateReelResponseCroppedImageVersion): Self = this.set("cropped_image_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_image_version(value: HighlightsRepositoryCreateReelResponseFullImageVersion): Self = this.set("full_image_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_id(value: String): Self = this.set("media_id", value.asInstanceOf[js.Any])
  }
}
