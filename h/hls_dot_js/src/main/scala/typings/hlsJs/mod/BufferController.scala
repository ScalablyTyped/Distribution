package typings.hlsJs.mod

import typings.hlsJs.mod.Events.BUFFER_APPENDING
import typings.hlsJs.mod.Events.BUFFER_CODECS
import typings.hlsJs.mod.Events.BUFFER_EOS
import typings.hlsJs.mod.Events.BUFFER_FLUSHING
import typings.hlsJs.mod.Events.FRAG_PARSED
import typings.hlsJs.mod.Events.LEVEL_UPDATED
import typings.hlsJs.mod.Events.MANIFEST_PARSED
import typings.hlsJs.mod.Events.MEDIA_ATTACHING
import typings.std.HTMLMediaElement
import typings.std.MediaSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "BufferController")
@js.native
open class BufferController protected ()
  extends StObject
     with ComponentAPI {
  def this(hls: Hls) = this()
  
  /* private */ var _bufferCodecEventsTotal: Any = js.native
  
  /* private */ var _initSourceBuffer: Any = js.native
  
  /* private */ var _objectUrl: Any = js.native
  
  /* private */ var _onMediaEmptied: Any = js.native
  
  /* private */ var _onMediaSourceClose: Any = js.native
  
  /* private */ var _onMediaSourceEnded: Any = js.native
  
  /* private */ var _onMediaSourceOpen: Any = js.native
  
  /* private */ var _onSBUpdateEnd: Any = js.native
  
  /* private */ var _onSBUpdateError: Any = js.native
  
  /* private */ var _onSBUpdateStart: Any = js.native
  
  /* private */ var addBufferListener: Any = js.native
  
  /* protected */ def appendChangeType(`type`: Any, mimeType: Any): Unit = js.native
  
  var appendError: Double = js.native
  
  /* private */ var appendExecutor: Any = js.native
  
  /* private */ var blockBuffers: Any = js.native
  
  var bufferCodecEventsExpected: Double = js.native
  
  /* protected */ def checkPendingTracks(): Unit = js.native
  
  /* protected */ def createSourceBuffers(tracks: TrackSet): Unit = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* private */ var details: Any = js.native
  
  def flushBackBuffer(): Unit = js.native
  
  /* private */ var getSourceBufferTypes: Any = js.native
  
  def hasSourceTypes(): Boolean = js.native
  
  /* private */ var hls: Any = js.native
  
  /* private */ var lastMpegAudioChunk: Any = js.native
  
  /* private */ var listeners: Any = js.native
  
  var media: HTMLMediaElement | Null = js.native
  
  var mediaSource: MediaSource | Null = js.native
  
  /* protected */ def onBufferAppending(event: BUFFER_APPENDING, eventData: BufferAppendingData): Unit = js.native
  
  /* protected */ def onBufferCodecs(event: BUFFER_CODECS, data: BufferCodecsData): Unit = js.native
  
  /* protected */ def onBufferEos(event: BUFFER_EOS, data: BufferEOSData): Unit = js.native
  
  /* protected */ def onBufferFlushing(event: BUFFER_FLUSHING, data: BufferFlushingData): Unit = js.native
  
  /* protected */ def onBufferReset(): Unit = js.native
  
  /* private */ var onFragChanged: Any = js.native
  
  /* protected */ def onFragParsed(event: FRAG_PARSED, data: FragParsedData): Unit = js.native
  
  /* protected */ def onLevelUpdated(event: LEVEL_UPDATED, param1: LevelUpdatedData): Unit = js.native
  
  /* private */ var onManifestLoading: Any = js.native
  
  /* protected */ def onManifestParsed(event: MANIFEST_PARSED, data: ManifestParsedData): Unit = js.native
  
  /* protected */ def onMediaAttaching(event: MEDIA_ATTACHING, data: MediaAttachingData): Unit = js.native
  
  /* protected */ def onMediaDetaching(): Unit = js.native
  
  /* private */ var operationQueue: Any = js.native
  
  var pendingTracks: TrackSet = js.native
  
  /* protected */ def registerListeners(): Unit = js.native
  
  /* private */ var removeBufferListeners: Any = js.native
  
  /* private */ var removeExecutor: Any = js.native
  
  var sourceBuffer: SourceBuffers = js.native
  
  var tracks: TrackSet = js.native
  
  /* protected */ def unregisterListeners(): Unit = js.native
  
  /**
    * Update Media Source duration to current level duration or override to Infinity if configuration parameter
    * 'liveDurationInfinity` is set to `true`
    * More details: https://github.com/video-dev/hls.js/issues/355
    */
  /* private */ var updateMediaElementDuration: Any = js.native
  
  def updateSeekableRange(levelDetails: Any): Unit = js.native
}
