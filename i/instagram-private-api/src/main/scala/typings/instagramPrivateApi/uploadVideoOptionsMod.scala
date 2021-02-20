package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadVideoOptionsMod {
  
  object SEGMENT_DIVIDERS {
    
    @JSImport("instagram-private-api/dist/types/upload.video.options", "SEGMENT_DIVIDERS.sectionSize")
    @js.native
    def sectionSize(sectionSize: js.Any): SegmentDivider = js.native
    
    @JSImport("instagram-private-api/dist/types/upload.video.options", "SEGMENT_DIVIDERS.totalSections")
    @js.native
    def totalSections(numSections: js.Any): SegmentDivider = js.native
  }
  
  type SegmentDivider = js.Function1[/* options */ Buffer, js.Array[typings.node.Buffer]]
  
  @js.native
  trait UploadRetryContext extends StObject {
    
    var num_reupload: Double = js.native
    
    var num_step_auto_retry: Double = js.native
    
    var num_step_manual_retry: Double = js.native
  }
  object UploadRetryContext {
    
    @scala.inline
    def apply(num_reupload: Double, num_step_auto_retry: Double, num_step_manual_retry: Double): UploadRetryContext = {
      val __obj = js.Dynamic.literal(num_reupload = num_reupload.asInstanceOf[js.Any], num_step_auto_retry = num_step_auto_retry.asInstanceOf[js.Any], num_step_manual_retry = num_step_manual_retry.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadRetryContext]
    }
    
    @scala.inline
    implicit class UploadRetryContextMutableBuilder[Self <: UploadRetryContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNum_reupload(value: Double): Self = StObject.set(x, "num_reupload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_step_auto_retry(value: Double): Self = StObject.set(x, "num_step_auto_retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_step_manual_retry(value: Double): Self = StObject.set(x, "num_step_manual_retry", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UploadSegmentedVideoOptions extends UploadVideoOptions {
    
    var retryContext: js.UndefOr[UploadRetryContext] = js.native
    
    var segmentDivider: js.UndefOr[SegmentDivider] = js.native
    
    var segments: js.UndefOr[js.Array[typings.node.Buffer]] = js.native
  }
  object UploadSegmentedVideoOptions {
    
    @scala.inline
    def apply(duration: Double, video: typings.node.Buffer): UploadSegmentedVideoOptions = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadSegmentedVideoOptions]
    }
    
    @scala.inline
    implicit class UploadSegmentedVideoOptionsMutableBuilder[Self <: UploadSegmentedVideoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRetryContext(value: UploadRetryContext): Self = StObject.set(x, "retryContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryContextUndefined: Self = StObject.set(x, "retryContext", js.undefined)
      
      @scala.inline
      def setSegmentDivider(value: /* options */ Buffer => js.Array[typings.node.Buffer]): Self = StObject.set(x, "segmentDivider", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSegmentDividerUndefined: Self = StObject.set(x, "segmentDivider", js.undefined)
      
      @scala.inline
      def setSegments(value: js.Array[typings.node.Buffer]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
      
      @scala.inline
      def setSegmentsVarargs(value: typings.node.Buffer*): Self = StObject.set(x, "segments", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UploadVideoOptions extends StObject {
    
    var duration: Double = js.native
    
    var forAlbum: js.UndefOr[Boolean] = js.native
    
    var forDirectStory: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var isDirect: js.UndefOr[Boolean] = js.native
    
    var isDirectVoice: js.UndefOr[Boolean] = js.native
    
    var isIgtvVideo: js.UndefOr[Boolean] = js.native
    
    var isSidecar: js.UndefOr[Boolean] = js.native
    
    var mediaType: js.UndefOr[String] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var uploadId: js.UndefOr[String] = js.native
    
    var uploadName: js.UndefOr[String] = js.native
    
    var video: typings.node.Buffer = js.native
    
    var waterfallId: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object UploadVideoOptions {
    
    @scala.inline
    def apply(duration: Double, video: typings.node.Buffer): UploadVideoOptions = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadVideoOptions]
    }
    
    @scala.inline
    implicit class UploadVideoOptionsMutableBuilder[Self <: UploadVideoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
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
      def setWaterfallId(value: String): Self = StObject.set(x, "waterfallId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaterfallIdUndefined: Self = StObject.set(x, "waterfallId", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait UploadVideoSegmentInitOptions extends StObject {
    
    var ruploadParams: js.Any = js.native
    
    var startOffset: Double = js.native
    
    var streamId: String = js.native
    
    var transferId: String = js.native
    
    var waterfallId: String = js.native
  }
  object UploadVideoSegmentInitOptions {
    
    @scala.inline
    def apply(
      ruploadParams: js.Any,
      startOffset: Double,
      streamId: String,
      transferId: String,
      waterfallId: String
    ): UploadVideoSegmentInitOptions = {
      val __obj = js.Dynamic.literal(ruploadParams = ruploadParams.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any], transferId = transferId.asInstanceOf[js.Any], waterfallId = waterfallId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadVideoSegmentInitOptions]
    }
    
    @scala.inline
    implicit class UploadVideoSegmentInitOptionsMutableBuilder[Self <: UploadVideoSegmentInitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRuploadParams(value: js.Any): Self = StObject.set(x, "ruploadParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferId(value: String): Self = StObject.set(x, "transferId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaterfallId(value: String): Self = StObject.set(x, "waterfallId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UploadVideoSegmentTransferOptions extends StObject {
    
    var ruploadParams: js.Any = js.native
    
    var segment: typings.node.Buffer = js.native
    
    var startOffset: Double = js.native
    
    var streamId: String = js.native
    
    var transferId: String = js.native
    
    var waterfallId: String = js.native
  }
  object UploadVideoSegmentTransferOptions {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class UploadVideoSegmentTransferOptionsMutableBuilder[Self <: UploadVideoSegmentTransferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRuploadParams(value: js.Any): Self = StObject.set(x, "ruploadParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegment(value: typings.node.Buffer): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferId(value: String): Self = StObject.set(x, "transferId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaterfallId(value: String): Self = StObject.set(x, "waterfallId", value.asInstanceOf[js.Any])
    }
  }
}
