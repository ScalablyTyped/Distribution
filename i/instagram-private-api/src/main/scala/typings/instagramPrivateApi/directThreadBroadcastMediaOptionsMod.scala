package typings.instagramPrivateApi

import typings.instagramPrivateApi.instagramPrivateApiStrings.once
import typings.instagramPrivateApi.instagramPrivateApiStrings.replayable
import typings.instagramPrivateApi.instagramPrivateApiStrings.story
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directThreadBroadcastMediaOptionsMod {
  
  trait DirectThreadBroadcastPhotoOptions extends StObject {
    
    var allowFullAspectRatio: js.UndefOr[Boolean] = js.undefined
    
    var file: Buffer
    
    var uploadId: js.UndefOr[String] = js.undefined
  }
  object DirectThreadBroadcastPhotoOptions {
    
    inline def apply(file: Buffer): DirectThreadBroadcastPhotoOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadBroadcastPhotoOptions]
    }
    
    extension [Self <: DirectThreadBroadcastPhotoOptions](x: Self) {
      
      inline def setAllowFullAspectRatio(value: Boolean): Self = StObject.set(x, "allowFullAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAllowFullAspectRatioUndefined: Self = StObject.set(x, "allowFullAspectRatio", js.undefined)
      
      inline def setFile(value: Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      inline def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
    }
  }
  
  trait DirectThreadBroadcastPhotoStoryOptions
    extends StObject
       with DirectThreadBroadcastStoryOptions {
    
    var file: Buffer
  }
  object DirectThreadBroadcastPhotoStoryOptions {
    
    inline def apply(file: Buffer): DirectThreadBroadcastPhotoStoryOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadBroadcastPhotoStoryOptions]
    }
    
    extension [Self <: DirectThreadBroadcastPhotoStoryOptions](x: Self) {
      
      inline def setFile(value: Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadBroadcastStoryOptions extends StObject {
    
    var replyType: js.UndefOr[story | String] = js.undefined
    
    var uploadId: js.UndefOr[Double] = js.undefined
    
    var viewMode: js.UndefOr[replayable | once | String] = js.undefined
  }
  object DirectThreadBroadcastStoryOptions {
    
    inline def apply(): DirectThreadBroadcastStoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectThreadBroadcastStoryOptions]
    }
    
    extension [Self <: DirectThreadBroadcastStoryOptions](x: Self) {
      
      inline def setReplyType(value: story | String): Self = StObject.set(x, "replyType", value.asInstanceOf[js.Any])
      
      inline def setReplyTypeUndefined: Self = StObject.set(x, "replyType", js.undefined)
      
      inline def setUploadId(value: Double): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      inline def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
      
      inline def setViewMode(value: replayable | once | String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
  
  trait DirectThreadBroadcastVideoOptions extends StObject {
    
    var sampled: js.UndefOr[Boolean] = js.undefined
    
    var transcodeDelay: js.UndefOr[Double] = js.undefined
    
    var uploadId: js.UndefOr[String] = js.undefined
    
    var video: Buffer
  }
  object DirectThreadBroadcastVideoOptions {
    
    inline def apply(video: Buffer): DirectThreadBroadcastVideoOptions = {
      val __obj = js.Dynamic.literal(video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadBroadcastVideoOptions]
    }
    
    extension [Self <: DirectThreadBroadcastVideoOptions](x: Self) {
      
      inline def setSampled(value: Boolean): Self = StObject.set(x, "sampled", value.asInstanceOf[js.Any])
      
      inline def setSampledUndefined: Self = StObject.set(x, "sampled", js.undefined)
      
      inline def setTranscodeDelay(value: Double): Self = StObject.set(x, "transcodeDelay", value.asInstanceOf[js.Any])
      
      inline def setTranscodeDelayUndefined: Self = StObject.set(x, "transcodeDelay", js.undefined)
      
      inline def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      inline def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
      
      inline def setVideo(value: Buffer): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadBroadcastVideoStoryOptions
    extends StObject
       with DirectThreadBroadcastStoryOptions {
    
    var coverImage: Buffer
    
    var video: Buffer
  }
  object DirectThreadBroadcastVideoStoryOptions {
    
    inline def apply(coverImage: Buffer, video: Buffer): DirectThreadBroadcastVideoStoryOptions = {
      val __obj = js.Dynamic.literal(coverImage = coverImage.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadBroadcastVideoStoryOptions]
    }
    
    extension [Self <: DirectThreadBroadcastVideoStoryOptions](x: Self) {
      
      inline def setCoverImage(value: Buffer): Self = StObject.set(x, "coverImage", value.asInstanceOf[js.Any])
      
      inline def setVideo(value: Buffer): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadBroadcastVoiceOptions extends StObject {
    
    var file: Buffer
    
    var transcodeDelay: js.UndefOr[Double] = js.undefined
    
    var uploadId: js.UndefOr[String] = js.undefined
    
    var waveform: js.UndefOr[js.Array[Double]] = js.undefined
    
    var waveformSamplingFrequencyHz: js.UndefOr[Double] = js.undefined
  }
  object DirectThreadBroadcastVoiceOptions {
    
    inline def apply(file: Buffer): DirectThreadBroadcastVoiceOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadBroadcastVoiceOptions]
    }
    
    extension [Self <: DirectThreadBroadcastVoiceOptions](x: Self) {
      
      inline def setFile(value: Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setTranscodeDelay(value: Double): Self = StObject.set(x, "transcodeDelay", value.asInstanceOf[js.Any])
      
      inline def setTranscodeDelayUndefined: Self = StObject.set(x, "transcodeDelay", js.undefined)
      
      inline def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      inline def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
      
      inline def setWaveform(value: js.Array[Double]): Self = StObject.set(x, "waveform", value.asInstanceOf[js.Any])
      
      inline def setWaveformSamplingFrequencyHz(value: Double): Self = StObject.set(x, "waveformSamplingFrequencyHz", value.asInstanceOf[js.Any])
      
      inline def setWaveformSamplingFrequencyHzUndefined: Self = StObject.set(x, "waveformSamplingFrequencyHz", js.undefined)
      
      inline def setWaveformUndefined: Self = StObject.set(x, "waveform", js.undefined)
      
      inline def setWaveformVarargs(value: Double*): Self = StObject.set(x, "waveform", js.Array(value :_*))
    }
  }
}
