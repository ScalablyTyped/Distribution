package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadVideoOptionsMod {
  
  object SEGMENT_DIVIDERS {
    
    @JSImport("instagram-private-api/dist/types/upload.video.options", "SEGMENT_DIVIDERS")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sectionSize(sectionSize: js.Any): SegmentDivider = ^.asInstanceOf[js.Dynamic].applyDynamic("sectionSize")(sectionSize.asInstanceOf[js.Any]).asInstanceOf[SegmentDivider]
    
    inline def totalSections(numSections: js.Any): SegmentDivider = ^.asInstanceOf[js.Dynamic].applyDynamic("totalSections")(numSections.asInstanceOf[js.Any]).asInstanceOf[SegmentDivider]
  }
  
  type SegmentDivider = js.Function1[/* options */ Buffer, js.Array[typings.node.Buffer]]
  
  trait UploadRetryContext extends StObject {
    
    var num_reupload: Double
    
    var num_step_auto_retry: Double
    
    var num_step_manual_retry: Double
  }
  object UploadRetryContext {
    
    inline def apply(num_reupload: Double, num_step_auto_retry: Double, num_step_manual_retry: Double): UploadRetryContext = {
      val __obj = js.Dynamic.literal(num_reupload = num_reupload.asInstanceOf[js.Any], num_step_auto_retry = num_step_auto_retry.asInstanceOf[js.Any], num_step_manual_retry = num_step_manual_retry.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadRetryContext]
    }
    
    extension [Self <: UploadRetryContext](x: Self) {
      
      inline def setNum_reupload(value: Double): Self = StObject.set(x, "num_reupload", value.asInstanceOf[js.Any])
      
      inline def setNum_step_auto_retry(value: Double): Self = StObject.set(x, "num_step_auto_retry", value.asInstanceOf[js.Any])
      
      inline def setNum_step_manual_retry(value: Double): Self = StObject.set(x, "num_step_manual_retry", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadSegmentedVideoOptions
    extends StObject
       with UploadVideoOptions {
    
    var retryContext: js.UndefOr[UploadRetryContext] = js.undefined
    
    var segmentDivider: js.UndefOr[SegmentDivider] = js.undefined
    
    var segments: js.UndefOr[js.Array[typings.node.Buffer]] = js.undefined
  }
  object UploadSegmentedVideoOptions {
    
    inline def apply(duration: Double, video: typings.node.Buffer): UploadSegmentedVideoOptions = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadSegmentedVideoOptions]
    }
    
    extension [Self <: UploadSegmentedVideoOptions](x: Self) {
      
      inline def setRetryContext(value: UploadRetryContext): Self = StObject.set(x, "retryContext", value.asInstanceOf[js.Any])
      
      inline def setRetryContextUndefined: Self = StObject.set(x, "retryContext", js.undefined)
      
      inline def setSegmentDivider(value: /* options */ Buffer => js.Array[typings.node.Buffer]): Self = StObject.set(x, "segmentDivider", js.Any.fromFunction1(value))
      
      inline def setSegmentDividerUndefined: Self = StObject.set(x, "segmentDivider", js.undefined)
      
      inline def setSegments(value: js.Array[typings.node.Buffer]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
      
      inline def setSegmentsVarargs(value: typings.node.Buffer*): Self = StObject.set(x, "segments", js.Array(value :_*))
    }
  }
  
  trait UploadVideoOptions extends StObject {
    
    var duration: Double
    
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
    
    var video: typings.node.Buffer
    
    var waterfallId: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object UploadVideoOptions {
    
    inline def apply(duration: Double, video: typings.node.Buffer): UploadVideoOptions = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadVideoOptions]
    }
    
    extension [Self <: UploadVideoOptions](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setForAlbum(value: Boolean): Self = StObject.set(x, "forAlbum", value.asInstanceOf[js.Any])
      
      inline def setForAlbumUndefined: Self = StObject.set(x, "forAlbum", js.undefined)
      
      inline def setForDirectStory(value: Boolean): Self = StObject.set(x, "forDirectStory", value.asInstanceOf[js.Any])
      
      inline def setForDirectStoryUndefined: Self = StObject.set(x, "forDirectStory", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsDirect(value: Boolean): Self = StObject.set(x, "isDirect", value.asInstanceOf[js.Any])
      
      inline def setIsDirectUndefined: Self = StObject.set(x, "isDirect", js.undefined)
      
      inline def setIsDirectVoice(value: Boolean): Self = StObject.set(x, "isDirectVoice", value.asInstanceOf[js.Any])
      
      inline def setIsDirectVoiceUndefined: Self = StObject.set(x, "isDirectVoice", js.undefined)
      
      inline def setIsIgtvVideo(value: Boolean): Self = StObject.set(x, "isIgtvVideo", value.asInstanceOf[js.Any])
      
      inline def setIsIgtvVideoUndefined: Self = StObject.set(x, "isIgtvVideo", js.undefined)
      
      inline def setIsSidecar(value: Boolean): Self = StObject.set(x, "isSidecar", value.asInstanceOf[js.Any])
      
      inline def setIsSidecarUndefined: Self = StObject.set(x, "isSidecar", js.undefined)
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
      
      inline def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
      
      inline def setUploadName(value: String): Self = StObject.set(x, "uploadName", value.asInstanceOf[js.Any])
      
      inline def setUploadNameUndefined: Self = StObject.set(x, "uploadName", js.undefined)
      
      inline def setVideo(value: typings.node.Buffer): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setWaterfallId(value: String): Self = StObject.set(x, "waterfallId", value.asInstanceOf[js.Any])
      
      inline def setWaterfallIdUndefined: Self = StObject.set(x, "waterfallId", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait UploadVideoSegmentInitOptions extends StObject {
    
    var ruploadParams: js.Any
    
    var startOffset: Double
    
    var streamId: String
    
    var transferId: String
    
    var waterfallId: String
  }
  object UploadVideoSegmentInitOptions {
    
    inline def apply(
      ruploadParams: js.Any,
      startOffset: Double,
      streamId: String,
      transferId: String,
      waterfallId: String
    ): UploadVideoSegmentInitOptions = {
      val __obj = js.Dynamic.literal(ruploadParams = ruploadParams.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any], transferId = transferId.asInstanceOf[js.Any], waterfallId = waterfallId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadVideoSegmentInitOptions]
    }
    
    extension [Self <: UploadVideoSegmentInitOptions](x: Self) {
      
      inline def setRuploadParams(value: js.Any): Self = StObject.set(x, "ruploadParams", value.asInstanceOf[js.Any])
      
      inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
      
      inline def setTransferId(value: String): Self = StObject.set(x, "transferId", value.asInstanceOf[js.Any])
      
      inline def setWaterfallId(value: String): Self = StObject.set(x, "waterfallId", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadVideoSegmentTransferOptions extends StObject {
    
    var ruploadParams: js.Any
    
    var segment: typings.node.Buffer
    
    var startOffset: Double
    
    var streamId: String
    
    var transferId: String
    
    var waterfallId: String
  }
  object UploadVideoSegmentTransferOptions {
    
    inline def apply(
      ruploadParams: js.Any,
      segment: typings.node.Buffer,
      startOffset: Double,
      streamId: String,
      transferId: String,
      waterfallId: String
    ): UploadVideoSegmentTransferOptions = {
      val __obj = js.Dynamic.literal(ruploadParams = ruploadParams.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any], transferId = transferId.asInstanceOf[js.Any], waterfallId = waterfallId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadVideoSegmentTransferOptions]
    }
    
    extension [Self <: UploadVideoSegmentTransferOptions](x: Self) {
      
      inline def setRuploadParams(value: js.Any): Self = StObject.set(x, "ruploadParams", value.asInstanceOf[js.Any])
      
      inline def setSegment(value: typings.node.Buffer): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
      
      inline def setTransferId(value: String): Self = StObject.set(x, "transferId", value.asInstanceOf[js.Any])
      
      inline def setWaterfallId(value: String): Self = StObject.set(x, "waterfallId", value.asInstanceOf[js.Any])
    }
  }
}
