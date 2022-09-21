package typings.hlsJs.mod

import typings.hlsJs.mod.Events.LEVEL_LOADING
import typings.hlsJs.mod.Events.LEVEL_SWITCHING
import typings.hlsJs.mod.Events.MANIFEST_PARSED
import typings.hlsJs.mod.Events.MEDIA_ATTACHED
import typings.hlsJs.mod.Events.SUBTITLE_TRACK_LOADED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubtitleTrackController
  extends StObject
     with BasePlaylistController {
  
  /* private */ var _subtitleDisplay: Any = js.native
  
  /* private */ var asyncPollTrackChange: Any = js.native
  
  /* private */ var findTrackId: Any = js.native
  
  /* private */ var groupId: Any = js.native
  
  /* private */ var media: Any = js.native
  
  /* protected */ def onLevelLoading(event: LEVEL_LOADING, data: LevelLoadingData): Unit = js.native
  
  /* protected */ def onLevelSwitching(event: LEVEL_SWITCHING, data: LevelSwitchingData): Unit = js.native
  
  /* protected */ def onManifestLoading(): Unit = js.native
  
  /* protected */ def onManifestParsed(event: MANIFEST_PARSED, data: ManifestParsedData): Unit = js.native
  
  /* protected */ def onMediaAttached(event: MEDIA_ATTACHED, data: MediaAttachedData): Unit = js.native
  
  /* protected */ def onMediaDetaching(): Unit = js.native
  
  /* protected */ def onSubtitleTrackLoaded(event: SUBTITLE_TRACK_LOADED, data: TrackLoadedData): Unit = js.native
  
  /* private */ var onTextTracksChanged: Any = js.native
  
  /* private */ var pollTrackChange: Any = js.native
  
  /* private */ var queuedDefaultTrack: Any = js.native
  
  /* private */ var registerListeners: Any = js.native
  
  /* private */ var selectDefaultTrack: Any = js.native
  
  /**
    * This method is responsible for validating the subtitle index and periodically reloading if live.
    * Dispatches the SUBTITLE_TRACK_SWITCH event, which instructs the subtitle-stream-controller to load the selected track.
    */
  /* private */ var setSubtitleTrack: Any = js.native
  
  def subtitleDisplay: Boolean = js.native
  def subtitleDisplay_=(value: Boolean): Unit = js.native
  
  /* private */ var subtitlePollingInterval: Any = js.native
  
  /** get/set index of the selected subtitle track (based on index in subtitle track lists) **/
  def subtitleTrack: Double = js.native
  def subtitleTrack_=(newId: Double): Unit = js.native
  
  /** get alternate subtitle tracks list from playlist **/
  def subtitleTracks: js.Array[MediaPlaylist] = js.native
  
  /* private */ var switchLevel: Any = js.native
  
  /**
    * Disables the old subtitleTrack and sets current mode on the next subtitleTrack.
    * This operates on the DOM textTracks.
    * A value of -1 will disable all subtitle tracks.
    */
  /* private */ var toggleTrackModes: Any = js.native
  
  /* private */ var trackChangeListener: Any = js.native
  
  /* private */ var trackId: Any = js.native
  
  /* private */ var tracks: Any = js.native
  
  /* private */ var tracksInGroup: Any = js.native
  
  /* private */ var unregisterListeners: Any = js.native
  
  /* private */ var useTextTrackPolling: Any = js.native
}
