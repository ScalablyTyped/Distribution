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

trait BufferController
  extends StObject
     with ComponentAPI {
  
  /* private */ var _bufferCodecEventsTotal: Any
  
  /* private */ var _initSourceBuffer: Any
  
  /* private */ var _objectUrl: Any
  
  /* private */ var _onMediaSourceClose: Any
  
  /* private */ var _onMediaSourceEnded: Any
  
  /* private */ var _onMediaSourceOpen: Any
  
  /* private */ var _onSBUpdateEnd: Any
  
  /* private */ var _onSBUpdateError: Any
  
  /* private */ var _onSBUpdateStart: Any
  
  /* private */ var addBufferListener: Any
  
  /* protected */ def appendChangeType(`type`: Any, mimeType: Any): Unit
  
  var appendError: Double
  
  /* private */ var appendExecutor: Any
  
  /* private */ var blockBuffers: Any
  
  var bufferCodecEventsExpected: Double
  
  /* protected */ def checkPendingTracks(): Unit
  
  /* protected */ def createSourceBuffers(tracks: TrackSet): Unit
  
  /* private */ var details: Any
  
  def flushBackBuffer(): Unit
  
  /* private */ var getSourceBufferTypes: Any
  
  def hasSourceTypes(): Boolean
  
  /* private */ var hls: Any
  
  /* private */ var listeners: Any
  
  var media: HTMLMediaElement | Null
  
  var mediaSource: MediaSource | Null
  
  /* protected */ def onBufferAppending(event: BUFFER_APPENDING, eventData: BufferAppendingData): Unit
  
  /* protected */ def onBufferCodecs(event: BUFFER_CODECS, data: BufferCodecsData): Unit
  
  /* protected */ def onBufferEos(event: BUFFER_EOS, data: BufferEOSData): Unit
  
  /* protected */ def onBufferFlushing(event: BUFFER_FLUSHING, data: BufferFlushingData): Unit
  
  /* protected */ def onBufferReset(): Unit
  
  /* private */ var onFragChanged: Any
  
  /* protected */ def onFragParsed(event: FRAG_PARSED, data: FragParsedData): Unit
  
  /* protected */ def onLevelUpdated(event: LEVEL_UPDATED, param1: LevelUpdatedData): Unit
  
  /* protected */ def onManifestParsed(event: MANIFEST_PARSED, data: ManifestParsedData): Unit
  
  /* protected */ def onMediaAttaching(event: MEDIA_ATTACHING, data: MediaAttachingData): Unit
  
  /* protected */ def onMediaDetaching(): Unit
  
  /* private */ var operationQueue: Any
  
  var pendingTracks: TrackSet
  
  /* protected */ def registerListeners(): Unit
  
  /* private */ var removeBufferListeners: Any
  
  /* private */ var removeExecutor: Any
  
  var sourceBuffer: SourceBuffers
  
  var tracks: TrackSet
  
  /* protected */ def unregisterListeners(): Unit
  
  /**
    * Update Media Source duration to current level duration or override to Infinity if configuration parameter
    * 'liveDurationInfinity` is set to `true`
    * More details: https://github.com/video-dev/hls.js/issues/355
    */
  /* private */ var updateMediaElementDuration: Any
  
  def updateSeekableRange(levelDetails: Any): Unit
}
object BufferController {
  
  inline def apply(
    _bufferCodecEventsTotal: Any,
    _initSourceBuffer: Any,
    _objectUrl: Any,
    _onMediaSourceClose: Any,
    _onMediaSourceEnded: Any,
    _onMediaSourceOpen: Any,
    _onSBUpdateEnd: Any,
    _onSBUpdateError: Any,
    _onSBUpdateStart: Any,
    addBufferListener: Any,
    appendChangeType: (Any, Any) => Unit,
    appendError: Double,
    appendExecutor: Any,
    blockBuffers: Any,
    bufferCodecEventsExpected: Double,
    checkPendingTracks: () => Unit,
    createSourceBuffers: TrackSet => Unit,
    destroy: () => Unit,
    details: Any,
    flushBackBuffer: () => Unit,
    getSourceBufferTypes: Any,
    hasSourceTypes: () => Boolean,
    hls: Any,
    listeners: Any,
    onBufferAppending: (BUFFER_APPENDING, BufferAppendingData) => Unit,
    onBufferCodecs: (BUFFER_CODECS, BufferCodecsData) => Unit,
    onBufferEos: (BUFFER_EOS, BufferEOSData) => Unit,
    onBufferFlushing: (BUFFER_FLUSHING, BufferFlushingData) => Unit,
    onBufferReset: () => Unit,
    onFragChanged: Any,
    onFragParsed: (FRAG_PARSED, FragParsedData) => Unit,
    onLevelUpdated: (LEVEL_UPDATED, LevelUpdatedData) => Unit,
    onManifestParsed: (MANIFEST_PARSED, ManifestParsedData) => Unit,
    onMediaAttaching: (MEDIA_ATTACHING, MediaAttachingData) => Unit,
    onMediaDetaching: () => Unit,
    operationQueue: Any,
    pendingTracks: TrackSet,
    registerListeners: () => Unit,
    removeBufferListeners: Any,
    removeExecutor: Any,
    sourceBuffer: SourceBuffers,
    tracks: TrackSet,
    unregisterListeners: () => Unit,
    updateMediaElementDuration: Any,
    updateSeekableRange: Any => Unit
  ): BufferController = {
    val __obj = js.Dynamic.literal(_bufferCodecEventsTotal = _bufferCodecEventsTotal.asInstanceOf[js.Any], _initSourceBuffer = _initSourceBuffer.asInstanceOf[js.Any], _objectUrl = _objectUrl.asInstanceOf[js.Any], _onMediaSourceClose = _onMediaSourceClose.asInstanceOf[js.Any], _onMediaSourceEnded = _onMediaSourceEnded.asInstanceOf[js.Any], _onMediaSourceOpen = _onMediaSourceOpen.asInstanceOf[js.Any], _onSBUpdateEnd = _onSBUpdateEnd.asInstanceOf[js.Any], _onSBUpdateError = _onSBUpdateError.asInstanceOf[js.Any], _onSBUpdateStart = _onSBUpdateStart.asInstanceOf[js.Any], addBufferListener = addBufferListener.asInstanceOf[js.Any], appendChangeType = js.Any.fromFunction2(appendChangeType), appendError = appendError.asInstanceOf[js.Any], appendExecutor = appendExecutor.asInstanceOf[js.Any], blockBuffers = blockBuffers.asInstanceOf[js.Any], bufferCodecEventsExpected = bufferCodecEventsExpected.asInstanceOf[js.Any], checkPendingTracks = js.Any.fromFunction0(checkPendingTracks), createSourceBuffers = js.Any.fromFunction1(createSourceBuffers), destroy = js.Any.fromFunction0(destroy), details = details.asInstanceOf[js.Any], flushBackBuffer = js.Any.fromFunction0(flushBackBuffer), getSourceBufferTypes = getSourceBufferTypes.asInstanceOf[js.Any], hasSourceTypes = js.Any.fromFunction0(hasSourceTypes), hls = hls.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], onBufferAppending = js.Any.fromFunction2(onBufferAppending), onBufferCodecs = js.Any.fromFunction2(onBufferCodecs), onBufferEos = js.Any.fromFunction2(onBufferEos), onBufferFlushing = js.Any.fromFunction2(onBufferFlushing), onBufferReset = js.Any.fromFunction0(onBufferReset), onFragChanged = onFragChanged.asInstanceOf[js.Any], onFragParsed = js.Any.fromFunction2(onFragParsed), onLevelUpdated = js.Any.fromFunction2(onLevelUpdated), onManifestParsed = js.Any.fromFunction2(onManifestParsed), onMediaAttaching = js.Any.fromFunction2(onMediaAttaching), onMediaDetaching = js.Any.fromFunction0(onMediaDetaching), operationQueue = operationQueue.asInstanceOf[js.Any], pendingTracks = pendingTracks.asInstanceOf[js.Any], registerListeners = js.Any.fromFunction0(registerListeners), removeBufferListeners = removeBufferListeners.asInstanceOf[js.Any], removeExecutor = removeExecutor.asInstanceOf[js.Any], sourceBuffer = sourceBuffer.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], unregisterListeners = js.Any.fromFunction0(unregisterListeners), updateMediaElementDuration = updateMediaElementDuration.asInstanceOf[js.Any], updateSeekableRange = js.Any.fromFunction1(updateSeekableRange), media = null, mediaSource = null)
    __obj.asInstanceOf[BufferController]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferController] (val x: Self) extends AnyVal {
    
    inline def setAddBufferListener(value: Any): Self = StObject.set(x, "addBufferListener", value.asInstanceOf[js.Any])
    
    inline def setAppendChangeType(value: (Any, Any) => Unit): Self = StObject.set(x, "appendChangeType", js.Any.fromFunction2(value))
    
    inline def setAppendError(value: Double): Self = StObject.set(x, "appendError", value.asInstanceOf[js.Any])
    
    inline def setAppendExecutor(value: Any): Self = StObject.set(x, "appendExecutor", value.asInstanceOf[js.Any])
    
    inline def setBlockBuffers(value: Any): Self = StObject.set(x, "blockBuffers", value.asInstanceOf[js.Any])
    
    inline def setBufferCodecEventsExpected(value: Double): Self = StObject.set(x, "bufferCodecEventsExpected", value.asInstanceOf[js.Any])
    
    inline def setCheckPendingTracks(value: () => Unit): Self = StObject.set(x, "checkPendingTracks", js.Any.fromFunction0(value))
    
    inline def setCreateSourceBuffers(value: TrackSet => Unit): Self = StObject.set(x, "createSourceBuffers", js.Any.fromFunction1(value))
    
    inline def setDetails(value: Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setFlushBackBuffer(value: () => Unit): Self = StObject.set(x, "flushBackBuffer", js.Any.fromFunction0(value))
    
    inline def setGetSourceBufferTypes(value: Any): Self = StObject.set(x, "getSourceBufferTypes", value.asInstanceOf[js.Any])
    
    inline def setHasSourceTypes(value: () => Boolean): Self = StObject.set(x, "hasSourceTypes", js.Any.fromFunction0(value))
    
    inline def setHls(value: Any): Self = StObject.set(x, "hls", value.asInstanceOf[js.Any])
    
    inline def setListeners(value: Any): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: HTMLMediaElement): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaNull: Self = StObject.set(x, "media", null)
    
    inline def setMediaSource(value: MediaSource): Self = StObject.set(x, "mediaSource", value.asInstanceOf[js.Any])
    
    inline def setMediaSourceNull: Self = StObject.set(x, "mediaSource", null)
    
    inline def setOnBufferAppending(value: (BUFFER_APPENDING, BufferAppendingData) => Unit): Self = StObject.set(x, "onBufferAppending", js.Any.fromFunction2(value))
    
    inline def setOnBufferCodecs(value: (BUFFER_CODECS, BufferCodecsData) => Unit): Self = StObject.set(x, "onBufferCodecs", js.Any.fromFunction2(value))
    
    inline def setOnBufferEos(value: (BUFFER_EOS, BufferEOSData) => Unit): Self = StObject.set(x, "onBufferEos", js.Any.fromFunction2(value))
    
    inline def setOnBufferFlushing(value: (BUFFER_FLUSHING, BufferFlushingData) => Unit): Self = StObject.set(x, "onBufferFlushing", js.Any.fromFunction2(value))
    
    inline def setOnBufferReset(value: () => Unit): Self = StObject.set(x, "onBufferReset", js.Any.fromFunction0(value))
    
    inline def setOnFragChanged(value: Any): Self = StObject.set(x, "onFragChanged", value.asInstanceOf[js.Any])
    
    inline def setOnFragParsed(value: (FRAG_PARSED, FragParsedData) => Unit): Self = StObject.set(x, "onFragParsed", js.Any.fromFunction2(value))
    
    inline def setOnLevelUpdated(value: (LEVEL_UPDATED, LevelUpdatedData) => Unit): Self = StObject.set(x, "onLevelUpdated", js.Any.fromFunction2(value))
    
    inline def setOnManifestParsed(value: (MANIFEST_PARSED, ManifestParsedData) => Unit): Self = StObject.set(x, "onManifestParsed", js.Any.fromFunction2(value))
    
    inline def setOnMediaAttaching(value: (MEDIA_ATTACHING, MediaAttachingData) => Unit): Self = StObject.set(x, "onMediaAttaching", js.Any.fromFunction2(value))
    
    inline def setOnMediaDetaching(value: () => Unit): Self = StObject.set(x, "onMediaDetaching", js.Any.fromFunction0(value))
    
    inline def setOperationQueue(value: Any): Self = StObject.set(x, "operationQueue", value.asInstanceOf[js.Any])
    
    inline def setPendingTracks(value: TrackSet): Self = StObject.set(x, "pendingTracks", value.asInstanceOf[js.Any])
    
    inline def setRegisterListeners(value: () => Unit): Self = StObject.set(x, "registerListeners", js.Any.fromFunction0(value))
    
    inline def setRemoveBufferListeners(value: Any): Self = StObject.set(x, "removeBufferListeners", value.asInstanceOf[js.Any])
    
    inline def setRemoveExecutor(value: Any): Self = StObject.set(x, "removeExecutor", value.asInstanceOf[js.Any])
    
    inline def setSourceBuffer(value: SourceBuffers): Self = StObject.set(x, "sourceBuffer", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: TrackSet): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setUnregisterListeners(value: () => Unit): Self = StObject.set(x, "unregisterListeners", js.Any.fromFunction0(value))
    
    inline def setUpdateMediaElementDuration(value: Any): Self = StObject.set(x, "updateMediaElementDuration", value.asInstanceOf[js.Any])
    
    inline def setUpdateSeekableRange(value: Any => Unit): Self = StObject.set(x, "updateSeekableRange", js.Any.fromFunction1(value))
    
    inline def set_bufferCodecEventsTotal(value: Any): Self = StObject.set(x, "_bufferCodecEventsTotal", value.asInstanceOf[js.Any])
    
    inline def set_initSourceBuffer(value: Any): Self = StObject.set(x, "_initSourceBuffer", value.asInstanceOf[js.Any])
    
    inline def set_objectUrl(value: Any): Self = StObject.set(x, "_objectUrl", value.asInstanceOf[js.Any])
    
    inline def set_onMediaSourceClose(value: Any): Self = StObject.set(x, "_onMediaSourceClose", value.asInstanceOf[js.Any])
    
    inline def set_onMediaSourceEnded(value: Any): Self = StObject.set(x, "_onMediaSourceEnded", value.asInstanceOf[js.Any])
    
    inline def set_onMediaSourceOpen(value: Any): Self = StObject.set(x, "_onMediaSourceOpen", value.asInstanceOf[js.Any])
    
    inline def set_onSBUpdateEnd(value: Any): Self = StObject.set(x, "_onSBUpdateEnd", value.asInstanceOf[js.Any])
    
    inline def set_onSBUpdateError(value: Any): Self = StObject.set(x, "_onSBUpdateError", value.asInstanceOf[js.Any])
    
    inline def set_onSBUpdateStart(value: Any): Self = StObject.set(x, "_onSBUpdateStart", value.asInstanceOf[js.Any])
  }
}
