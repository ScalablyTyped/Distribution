package typings.hlsJs.mod

import typings.hlsJs.mod.Events.BUFFER_FLUSHING
import typings.hlsJs.mod.Events.ERROR
import typings.hlsJs.mod.Events.FRAG_BUFFERED
import typings.hlsJs.mod.Events.LEVEL_LOADED
import typings.hlsJs.mod.Events.SUBTITLE_FRAG_PROCESSED
import typings.hlsJs.mod.Events.SUBTITLE_TRACKS_UPDATED
import typings.hlsJs.mod.Events.SUBTITLE_TRACK_LOADED
import typings.hlsJs.mod.Events.SUBTITLE_TRACK_SWITCH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "SubtitleStreamController")
@js.native
open class SubtitleStreamController protected () extends BaseStreamController {
  def this(hls: Hls, fragmentTracker: FragmentTracker, keyLoader: KeyLoader) = this()
  
  def _handleFragmentLoadComplete(fragLoadedData: FragLoadedData): Unit = js.native
  
  /* private */ var _registerListeners: Any = js.native
  
  /* private */ var _unregisterListeners: Any = js.native
  
  /* private */ var currentTrackId: Any = js.native
  
  /* protected */ @JSName("levels")
  var levels_SubtitleStreamController: js.Array[Level] = js.native
  
  /* private */ var mainDetails: Any = js.native
  
  def mediaBufferTimeRanges: Bufferable = js.native
  
  def onBufferFlushing(event: BUFFER_FLUSHING, data: BufferFlushingData): Unit = js.native
  
  def onError(event: ERROR, data: ErrorData): Unit = js.native
  
  def onFragBuffered(event: FRAG_BUFFERED, data: FragBufferedData): Unit = js.native
  
  def onLevelLoaded(event: LEVEL_LOADED, data: LevelLoadedData): Unit = js.native
  
  def onManifestLoading(): Unit = js.native
  
  def onSubtitleFragProcessed(event: SUBTITLE_FRAG_PROCESSED, data: SubtitleFragProcessed): Unit = js.native
  
  def onSubtitleTrackLoaded(event: SUBTITLE_TRACK_LOADED, data: TrackLoadedData): Unit = js.native
  
  def onSubtitleTrackSwitch(event: SUBTITLE_TRACK_SWITCH, data: TrackSwitchedData): Unit = js.native
  
  def onSubtitleTracksUpdated(event: SUBTITLE_TRACKS_UPDATED, param1: SubtitleTracksUpdatedData): Unit = js.native
  
  /* private */ var tracksBuffered: Any = js.native
}
