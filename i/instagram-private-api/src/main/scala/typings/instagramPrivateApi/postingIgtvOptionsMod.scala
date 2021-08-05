package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Bottom
import typings.instagramPrivateApi.anon.PartialMediaConfigureToIg
import typings.instagramPrivateApi.anon.PartialUploadVideoOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postingIgtvOptionsMod {
  
  trait PostingIgtvOptions extends StObject {
    
    var audioMuted: js.UndefOr[Boolean] = js.undefined
    
    var caption: js.UndefOr[String] = js.undefined
    
    var configureOptions: js.UndefOr[PartialMediaConfigureToIg] = js.undefined
    
    var coverFrame: Buffer
    
    var feedPreviewCrop: js.UndefOr[Bottom] = js.undefined
    
    var maxTranscodeTries: js.UndefOr[Double] = js.undefined
    
    var shareToFeed: js.UndefOr[Boolean] = js.undefined
    
    var title: String
    
    var transcodeDelay: js.UndefOr[Double] = js.undefined
    
    var uploadOptions: js.UndefOr[PartialUploadVideoOptions] = js.undefined
    
    var video: Buffer
  }
  object PostingIgtvOptions {
    
    inline def apply(coverFrame: Buffer, title: String, video: Buffer): PostingIgtvOptions = {
      val __obj = js.Dynamic.literal(coverFrame = coverFrame.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingIgtvOptions]
    }
    
    extension [Self <: PostingIgtvOptions](x: Self) {
      
      inline def setAudioMuted(value: Boolean): Self = StObject.set(x, "audioMuted", value.asInstanceOf[js.Any])
      
      inline def setAudioMutedUndefined: Self = StObject.set(x, "audioMuted", js.undefined)
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setConfigureOptions(value: PartialMediaConfigureToIg): Self = StObject.set(x, "configureOptions", value.asInstanceOf[js.Any])
      
      inline def setConfigureOptionsUndefined: Self = StObject.set(x, "configureOptions", js.undefined)
      
      inline def setCoverFrame(value: Buffer): Self = StObject.set(x, "coverFrame", value.asInstanceOf[js.Any])
      
      inline def setFeedPreviewCrop(value: Bottom): Self = StObject.set(x, "feedPreviewCrop", value.asInstanceOf[js.Any])
      
      inline def setFeedPreviewCropUndefined: Self = StObject.set(x, "feedPreviewCrop", js.undefined)
      
      inline def setMaxTranscodeTries(value: Double): Self = StObject.set(x, "maxTranscodeTries", value.asInstanceOf[js.Any])
      
      inline def setMaxTranscodeTriesUndefined: Self = StObject.set(x, "maxTranscodeTries", js.undefined)
      
      inline def setShareToFeed(value: Boolean): Self = StObject.set(x, "shareToFeed", value.asInstanceOf[js.Any])
      
      inline def setShareToFeedUndefined: Self = StObject.set(x, "shareToFeed", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTranscodeDelay(value: Double): Self = StObject.set(x, "transcodeDelay", value.asInstanceOf[js.Any])
      
      inline def setTranscodeDelayUndefined: Self = StObject.set(x, "transcodeDelay", js.undefined)
      
      inline def setUploadOptions(value: PartialUploadVideoOptions): Self = StObject.set(x, "uploadOptions", value.asInstanceOf[js.Any])
      
      inline def setUploadOptionsUndefined: Self = StObject.set(x, "uploadOptions", js.undefined)
      
      inline def setVideo(value: Buffer): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
}
