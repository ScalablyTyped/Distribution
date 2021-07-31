package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<instagram-private-api.instagram-private-api/dist/types/upload.video.options.UploadVideoOptions> */
trait PartialUploadVideoOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var forAlbum: js.UndefOr[Boolean] = js.undefined
  
  var forDirectStory: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var isDirect: js.UndefOr[Boolean] = js.undefined
  
  var isDirectVoice: js.UndefOr[Boolean] = js.undefined
  
  var isIgtvVideo: js.UndefOr[Boolean] = js.undefined
  
  var isSidecar: js.UndefOr[Boolean] = js.undefined
  
  var mediaType: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var uploadId: js.UndefOr[String] = js.undefined
  
  var uploadName: js.UndefOr[String] = js.undefined
  
  var video: js.UndefOr[typings.node.Buffer] = js.undefined
  
  var waterfallId: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PartialUploadVideoOptions {
  
  @scala.inline
  def apply(): PartialUploadVideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUploadVideoOptions]
  }
  
  @scala.inline
  implicit class PartialUploadVideoOptionsMutableBuilder[Self <: PartialUploadVideoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setForAlbum(value: Boolean): Self = StObject.set(x, "forAlbum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForAlbumUndefined: Self = StObject.set(x, "forAlbum", js.undefined)
    
    @scala.inline
    def setForDirectStory(value: Boolean): Self = StObject.set(x, "forDirectStory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForDirectStoryUndefined: Self = StObject.set(x, "forDirectStory", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIsDirect(value: Boolean): Self = StObject.set(x, "isDirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirectUndefined: Self = StObject.set(x, "isDirect", js.undefined)
    
    @scala.inline
    def setIsDirectVoice(value: Boolean): Self = StObject.set(x, "isDirectVoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirectVoiceUndefined: Self = StObject.set(x, "isDirectVoice", js.undefined)
    
    @scala.inline
    def setIsIgtvVideo(value: Boolean): Self = StObject.set(x, "isIgtvVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIgtvVideoUndefined: Self = StObject.set(x, "isIgtvVideo", js.undefined)
    
    @scala.inline
    def setIsSidecar(value: Boolean): Self = StObject.set(x, "isSidecar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSidecarUndefined: Self = StObject.set(x, "isSidecar", js.undefined)
    
    @scala.inline
    def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
    
    @scala.inline
    def setUploadName(value: String): Self = StObject.set(x, "uploadName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadNameUndefined: Self = StObject.set(x, "uploadName", js.undefined)
    
    @scala.inline
    def setVideo(value: typings.node.Buffer): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    @scala.inline
    def setWaterfallId(value: String): Self = StObject.set(x, "waterfallId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaterfallIdUndefined: Self = StObject.set(x, "waterfallId", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
