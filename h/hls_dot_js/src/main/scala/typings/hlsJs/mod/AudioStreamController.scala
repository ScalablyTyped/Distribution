package typings.hlsJs.mod

import typings.hlsJs.mod.Events.AUDIO_TRACKS_UPDATED
import typings.hlsJs.mod.Events.AUDIO_TRACK_LOADED
import typings.hlsJs.mod.Events.AUDIO_TRACK_SWITCHING
import typings.hlsJs.mod.Events.BUFFER_CREATED
import typings.hlsJs.mod.Events.FRAG_BUFFERED
import typings.hlsJs.mod.Events.INIT_PTS_FOUND
import typings.hlsJs.mod.Events.LEVEL_LOADED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioStreamController
  extends StObject
     with BaseStreamController {
  
  /* private */ var _bufferInitSegment: Any = js.native
  
  /* protected */ def _handleFragmentLoadComplete(fragLoadedData: FragLoadedData): Unit = js.native
  
  /* private */ var _handleTransmuxComplete: Any = js.native
  
  /* private */ var _registerListeners: Any = js.native
  
  /* private */ var _unregisterListeners: Any = js.native
  
  /* private */ var audioSwitch: Any = js.native
  
  /* private */ var bufferFlushed: Any = js.native
  
  /* private */ var cachedTrackLoadedData: Any = js.native
  
  def clearWaitingFragment(): Unit = js.native
  
  /* private */ var completeAudioSwitch: Any = js.native
  
  /* InferMemberOverrides */
  override def destroy(): Unit = js.native
  
  /* private */ var doTickIdle: Any = js.native
  
  /* private */ var mainDetails: Any = js.native
  
  def onAudioTrackLoaded(event: AUDIO_TRACK_LOADED, data: TrackLoadedData): Unit = js.native
  
  def onAudioTrackSwitching(event: AUDIO_TRACK_SWITCHING, data: AudioTrackSwitchingData): Unit = js.native
  
  def onAudioTracksUpdated(event: AUDIO_TRACKS_UPDATED, hasAudioTracks: AudioTracksUpdatedData): Unit = js.native
  
  def onBufferCreated(event: BUFFER_CREATED, data: BufferCreatedData): Unit = js.native
  
  /* private */ var onBufferFlushed: Any = js.native
  
  def onBufferReset(): Unit = js.native
  
  /* private */ var onError: Any = js.native
  
  def onFragBuffered(event: FRAG_BUFFERED, data: FragBufferedData): Unit = js.native
  
  def onInitPtsFound(event: INIT_PTS_FOUND, hasFragIdInitPTS: InitPTSFoundData): Unit = js.native
  
  def onLevelLoaded(event: LEVEL_LOADED, data: LevelLoadedData): Unit = js.native
  
  def onManifestLoading(): Unit = js.native
  
  /* private */ var trackId: Any = js.native
  
  /* private */ var videoBuffer: Any = js.native
  
  /* private */ var videoTrackCC: Any = js.native
  
  /* private */ var waitingData: Any = js.native
  
  /* private */ var waitingVideoCC: Any = js.native
}
