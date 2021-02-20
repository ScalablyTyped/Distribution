package typings.instagramPrivateApi

import typings.instagramPrivateApi.instagramPrivateApiStrings.once
import typings.instagramPrivateApi.instagramPrivateApiStrings.replayable
import typings.instagramPrivateApi.instagramPrivateApiStrings.story
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directThreadBroadcastMediaOptionsMod {
  
  @js.native
  trait DirectThreadBroadcastPhotoOptions extends StObject {
    
    var allowFullAspectRatio: js.UndefOr[Boolean] = js.native
    
    var file: Buffer = js.native
    
    var uploadId: js.UndefOr[String] = js.native
  }
  object DirectThreadBroadcastPhotoOptions {
    
    @scala.inline
    def apply(file: Buffer): DirectThreadBroadcastPhotoOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadBroadcastPhotoOptions]
    }
    
    @scala.inline
    implicit class DirectThreadBroadcastPhotoOptionsMutableBuilder[Self <: DirectThreadBroadcastPhotoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowFullAspectRatio(value: Boolean): Self = StObject.set(x, "allowFullAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFullAspectRatioUndefined: Self = StObject.set(x, "allowFullAspectRatio", js.undefined)
      
      @scala.inline
      def setFile(value: Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
    }
  }
  
  @js.native
  trait DirectThreadBroadcastPhotoStoryOptions extends DirectThreadBroadcastStoryOptions {
    
    var file: Buffer = js.native
  }
  object DirectThreadBroadcastPhotoStoryOptions {
    
    @scala.inline
    def apply(file: Buffer): DirectThreadBroadcastPhotoStoryOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadBroadcastPhotoStoryOptions]
    }
    
    @scala.inline
    implicit class DirectThreadBroadcastPhotoStoryOptionsMutableBuilder[Self <: DirectThreadBroadcastPhotoStoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadBroadcastStoryOptions extends StObject {
    
    var replyType: js.UndefOr[story | String] = js.native
    
    var uploadId: js.UndefOr[Double] = js.native
    
    var viewMode: js.UndefOr[replayable | once | String] = js.native
  }
  object DirectThreadBroadcastStoryOptions {
    
    @scala.inline
    def apply(): DirectThreadBroadcastStoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectThreadBroadcastStoryOptions]
    }
    
    @scala.inline
    implicit class DirectThreadBroadcastStoryOptionsMutableBuilder[Self <: DirectThreadBroadcastStoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplyType(value: story | String): Self = StObject.set(x, "replyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyTypeUndefined: Self = StObject.set(x, "replyType", js.undefined)
      
      @scala.inline
      def setUploadId(value: Double): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
      
      @scala.inline
      def setViewMode(value: replayable | once | String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
  
  @js.native
  trait DirectThreadBroadcastVideoOptions extends StObject {
    
    var sampled: js.UndefOr[Boolean] = js.native
    
    var transcodeDelay: js.UndefOr[Double] = js.native
    
    var uploadId: js.UndefOr[String] = js.native
    
    var video: Buffer = js.native
  }
  object DirectThreadBroadcastVideoOptions {
    
    @scala.inline
    def apply(video: Buffer): DirectThreadBroadcastVideoOptions = {
      val __obj = js.Dynamic.literal(video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadBroadcastVideoOptions]
    }
    
    @scala.inline
    implicit class DirectThreadBroadcastVideoOptionsMutableBuilder[Self <: DirectThreadBroadcastVideoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSampled(value: Boolean): Self = StObject.set(x, "sampled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampledUndefined: Self = StObject.set(x, "sampled", js.undefined)
      
      @scala.inline
      def setTranscodeDelay(value: Double): Self = StObject.set(x, "transcodeDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranscodeDelayUndefined: Self = StObject.set(x, "transcodeDelay", js.undefined)
      
      @scala.inline
      def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
      
      @scala.inline
      def setVideo(value: Buffer): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadBroadcastVideoStoryOptions extends DirectThreadBroadcastStoryOptions {
    
    var coverImage: Buffer = js.native
    
    var video: Buffer = js.native
  }
  object DirectThreadBroadcastVideoStoryOptions {
    
    @scala.inline
    def apply(coverImage: Buffer, video: Buffer): DirectThreadBroadcastVideoStoryOptions = {
      val __obj = js.Dynamic.literal(coverImage = coverImage.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadBroadcastVideoStoryOptions]
    }
    
    @scala.inline
    implicit class DirectThreadBroadcastVideoStoryOptionsMutableBuilder[Self <: DirectThreadBroadcastVideoStoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoverImage(value: Buffer): Self = StObject.set(x, "coverImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo(value: Buffer): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadBroadcastVoiceOptions extends StObject {
    
    var file: Buffer = js.native
    
    var transcodeDelay: js.UndefOr[Double] = js.native
    
    var uploadId: js.UndefOr[String] = js.native
    
    var waveform: js.UndefOr[js.Array[Double]] = js.native
    
    var waveformSamplingFrequencyHz: js.UndefOr[Double] = js.native
  }
  object DirectThreadBroadcastVoiceOptions {
    
    @scala.inline
    def apply(file: Buffer): DirectThreadBroadcastVoiceOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadBroadcastVoiceOptions]
    }
    
    @scala.inline
    implicit class DirectThreadBroadcastVoiceOptionsMutableBuilder[Self <: DirectThreadBroadcastVoiceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranscodeDelay(value: Double): Self = StObject.set(x, "transcodeDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranscodeDelayUndefined: Self = StObject.set(x, "transcodeDelay", js.undefined)
      
      @scala.inline
      def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
      
      @scala.inline
      def setWaveform(value: js.Array[Double]): Self = StObject.set(x, "waveform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaveformSamplingFrequencyHz(value: Double): Self = StObject.set(x, "waveformSamplingFrequencyHz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaveformSamplingFrequencyHzUndefined: Self = StObject.set(x, "waveformSamplingFrequencyHz", js.undefined)
      
      @scala.inline
      def setWaveformUndefined: Self = StObject.set(x, "waveform", js.undefined)
      
      @scala.inline
      def setWaveformVarargs(value: Double*): Self = StObject.set(x, "waveform", js.Array(value :_*))
    }
  }
}
