package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Bottom
import typings.instagramPrivateApi.anon.PartialMediaConfigureToIg
import typings.instagramPrivateApi.anon.PartialUploadVideoOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postingIgtvOptionsMod {
  
  @js.native
  trait PostingIgtvOptions extends StObject {
    
    var audioMuted: js.UndefOr[Boolean] = js.native
    
    var caption: js.UndefOr[String] = js.native
    
    var configureOptions: js.UndefOr[PartialMediaConfigureToIg] = js.native
    
    var coverFrame: Buffer = js.native
    
    var feedPreviewCrop: js.UndefOr[Bottom] = js.native
    
    var maxTranscodeTries: js.UndefOr[Double] = js.native
    
    var shareToFeed: js.UndefOr[Boolean] = js.native
    
    var title: String = js.native
    
    var transcodeDelay: js.UndefOr[Double] = js.native
    
    var uploadOptions: js.UndefOr[PartialUploadVideoOptions] = js.native
    
    var video: Buffer = js.native
  }
  object PostingIgtvOptions {
    
    @scala.inline
    def apply(coverFrame: Buffer, title: String, video: Buffer): PostingIgtvOptions = {
      val __obj = js.Dynamic.literal(coverFrame = coverFrame.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingIgtvOptions]
    }
    
    @scala.inline
    implicit class PostingIgtvOptionsMutableBuilder[Self <: PostingIgtvOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudioMuted(value: Boolean): Self = StObject.set(x, "audioMuted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioMutedUndefined: Self = StObject.set(x, "audioMuted", js.undefined)
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setConfigureOptions(value: PartialMediaConfigureToIg): Self = StObject.set(x, "configureOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigureOptionsUndefined: Self = StObject.set(x, "configureOptions", js.undefined)
      
      @scala.inline
      def setCoverFrame(value: Buffer): Self = StObject.set(x, "coverFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeedPreviewCrop(value: Bottom): Self = StObject.set(x, "feedPreviewCrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeedPreviewCropUndefined: Self = StObject.set(x, "feedPreviewCrop", js.undefined)
      
      @scala.inline
      def setMaxTranscodeTries(value: Double): Self = StObject.set(x, "maxTranscodeTries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTranscodeTriesUndefined: Self = StObject.set(x, "maxTranscodeTries", js.undefined)
      
      @scala.inline
      def setShareToFeed(value: Boolean): Self = StObject.set(x, "shareToFeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShareToFeedUndefined: Self = StObject.set(x, "shareToFeed", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranscodeDelay(value: Double): Self = StObject.set(x, "transcodeDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranscodeDelayUndefined: Self = StObject.set(x, "transcodeDelay", js.undefined)
      
      @scala.inline
      def setUploadOptions(value: PartialUploadVideoOptions): Self = StObject.set(x, "uploadOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadOptionsUndefined: Self = StObject.set(x, "uploadOptions", js.undefined)
      
      @scala.inline
      def setVideo(value: Buffer): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
}
