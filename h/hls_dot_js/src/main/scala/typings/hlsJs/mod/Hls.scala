package typings.hlsJs.mod

import typings.std.HTMLMediaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hls extends StObject {
  
  /**
    * calling this method will:
    *      bind mediaElement (of type HTMLMediaElement, aka. HTMLVideoElement or HTMLAudioElement) and hls instances
    *      create MediaSource and set it as video or audio source
    *      once MediaSource object is successfully created, MEDIA_ATTACHED event will be fired
    */
  def attachMedia(mediaElement: HTMLMediaElement): Unit = js.native
  
  /**
    * get/set : audio track id (returned by).
    * Returns -1 if no track is selected.
    * Set to -1 to play default audio track.
    */
  var audioTrack: Double = js.native
  
  /**
    * get : array of audio tracks exposed in manifest
    */
  val audioTracks: js.Array[HlsAudioTrack] = js.native
  
  /**
    * capping/max level (index of level) that could be used by ABR Controller. Defaults to -1
    * which means no limit
    * set: max level value that could be used by the ABR Controller
    */
  var autoLevelCapping: Double = js.native
  
  /**
    * tell whether auto level selection is enabled or not
    */
  val autoLevelEnabled: Boolean = js.native
  
  /**
    *  hls.js config
    */
  var config: Config = js.native
  
  /**
    * get: return current playback quality level
    * set:  trigger an immediate quality level switch to new quality level
    * this will pause the video if it was playing, flush the whole buffer,
    * and fetch fragment matching with current position and requested quality level
    * then resume the video if needed once fetched fragment will have been buffered
    *
    * set to -1 for automatic level selection
    */
  var currentLevel: Double = js.native
  
  /**
    * should be called to free used resources and destroy hls context
    */
  def destroy(): Unit = js.native
  
  /**
    * calling this method will:
    *      unbind HTMLMediaElement (aka. HTMLVideoElement or HTMLAudioElement) from hls instance
    *      signal the end of the stream on MediaSource
    *      resets media source ( media.src = '',  )
    */
  def detachMedia(): Unit = js.native
  
  /**
    * first level index (index of first level appearing in Manifest. it is usually defined as start level hint for player)
    */
  var firstLevel: Double = js.native
  
  /**
    * return array of available quality levels
    */
  val levels: js.Array[Level] = js.native
  
  /**
    * position of live sync point (ie edge of live position minus safety delay defined by hls.config.liveSyncDuration)
    */
  val liveSyncPosition: Double = js.native
  
  /**
    * get: return last loaded fragment quality level
    * set: quality level for next loaded fragment
    * set to -1 for automatic level selection
    */
  var loadLevel: Double = js.native
  
  /**
    * loads provided url as media source
    */
  def loadSource(source: String): Unit = js.native
  
  /**
    * get: Return the bound mediaElement (of type HTMLMediaElement, aka. HTMLVideoElement or HTMLAudioElement) from the hls instance
    */
  val media: js.UndefOr[HTMLMediaElement | Null] = js.native
  
  /**
    * get: return next playback quality level (playback quality level for next buffered fragment)
    * return -1 if next fragment not buffered yet
    * set: trigger a quality level switch for next fragment
    * this could eventually flush already buffered next fragment
    *
    * set to -1 for automatic level selection
    */
  var nextLevel: Double = js.native
  
  /**
    * get: return quality level that will be used to load next fragment
    * set: force quality level for next loaded fragment
    * quality level will be forced only for that fragment
    * after a fragment at this quality level has been loaded, hls.loadLevel will prevail
    */
  var nextLoadLevel: Double = js.native
  
  /**
    * remove hls.js event listener
    */
  def off(event: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  def on(
    event: K_AUDIO_TRACKS_UPDATED,
    callback: js.Function2[/* event */ K_AUDIO_TRACKS_UPDATED, /* data */ audioTracksUpdatedData, Unit]
  ): Unit = js.native
  def on(
    event: K_AUDIO_TRACK_LOADED,
    callback: js.Function2[/* event */ K_AUDIO_TRACK_LOADED, /* data */ audioTrackLoadedData, Unit]
  ): Unit = js.native
  def on(
    event: K_AUDIO_TRACK_LOADING,
    callback: js.Function2[/* event */ K_AUDIO_TRACK_LOADING, /* data */ audioTrackLoadingData, Unit]
  ): Unit = js.native
  def on(
    event: K_AUDIO_TRACK_SWITCHED,
    callback: js.Function2[/* event */ K_AUDIO_TRACK_SWITCHED, /* data */ audioTrackSwitchedData, Unit]
  ): Unit = js.native
  def on(
    event: K_AUDIO_TRACK_SWITCHING,
    callback: js.Function2[/* event */ K_AUDIO_TRACK_SWITCHING, /* data */ audioTrackSwitchingData, Unit]
  ): Unit = js.native
  def on(
    event: K_BUFFER_APPENDED,
    callback: js.Function2[/* event */ K_BUFFER_APPENDED, /* data */ bufferAppendedData, Unit]
  ): Unit = js.native
  def on(
    event: K_BUFFER_APPENDING,
    callback: js.Function2[/* event */ K_BUFFER_APPENDING, /* data */ bufferAppendingData, Unit]
  ): Unit = js.native
  def on(
    event: K_BUFFER_CODECS,
    callback: js.Function2[/* event */ K_BUFFER_CODECS, /* data */ bufferCodecsData, Unit]
  ): Unit = js.native
  def on(
    event: K_BUFFER_CREATED,
    callback: js.Function2[/* event */ K_BUFFER_CREATED, /* data */ bufferCreatedData, Unit]
  ): Unit = js.native
  def on(event: K_BUFFER_EOS, callback: js.Function2[/* event */ K_BUFFER_EOS, /* data */ js.Object, Unit]): Unit = js.native
  def on(
    event: K_BUFFER_FLUSHED,
    callback: js.Function2[/* event */ K_BUFFER_FLUSHED, /* data */ bufferFlushedData, Unit]
  ): Unit = js.native
  def on(
    event: K_BUFFER_FLUSHING,
    callback: js.Function2[/* event */ K_BUFFER_FLUSHING, /* data */ bufferFlushingData, Unit]
  ): Unit = js.native
  def on(
    event: K_BUFFER_RESET,
    callback: js.Function2[/* event */ K_BUFFER_RESET, /* data */ js.Object, Unit]
  ): Unit = js.native
  def on(event: K_DESTROYING, callback: js.Function2[/* event */ K_DESTROYING, /* data */ js.Object, Unit]): Unit = js.native
  def on(event: K_ERROR, callback: js.Function2[/* event */ K_ERROR, /* data */ errorData, Unit]): Unit = js.native
  def on(
    event: K_FPS_DROP_LEVEL_CAPPING,
    callback: js.Function2[/* event */ K_FPS_DROP_LEVEL_CAPPING, /* data */ fpsDropLevelCappingData, Unit]
  ): Unit = js.native
  def on(event: K_FPS_DROP, callback: js.Function2[/* event */ K_FPS_DROP, /* data */ fpsDropData, Unit]): Unit = js.native
  def on(
    event: K_FRAG_BUFFERED,
    callback: js.Function2[/* event */ K_FRAG_BUFFERED, /* data */ fragBufferedData, Unit]
  ): Unit = js.native
  def on(
    event: K_FRAG_CHANGED,
    callback: js.Function2[/* event */ K_FRAG_CHANGED, /* data */ fragChangedData, Unit]
  ): Unit = js.native
  def on(
    event: K_FRAG_DECRYPTED,
    callback: js.Function2[/* event */ K_FRAG_DECRYPTED, /* data */ fragDecryptedData, Unit]
  ): Unit = js.native
  def on(
    event: K_FRAG_LOADED,
    callback: js.Function2[/* event */ K_FRAG_LOADED, /* data */ fragLoadedData, Unit]
  ): Unit = js.native
  def on(
    event: K_FRAG_LOADING,
    callback: js.Function2[/* event */ K_FRAG_LOADING, /* data */ fragLoadingData, Unit]
  ): Unit = js.native
  def on(
    event: K_FRAG_LOAD_EMERGENCY_ABORTED,
    callback: js.Function2[
      /* event */ K_FRAG_LOAD_EMERGENCY_ABORTED, 
      /* data */ fragLoadEmergencyAbortedData, 
      Unit
    ]
  ): Unit = js.native
  def on(
    event: K_FRAG_LOAD_PROGRESS,
    callback: js.Function2[/* event */ K_FRAG_LOAD_PROGRESS, /* data */ fragLoadProgressData, Unit]
  ): Unit = js.native
  def on(
    event: K_FRAG_PARSED,
    callback: js.Function2[/* event */ K_FRAG_PARSED, /* data */ fragParsedData, Unit]
  ): Unit = js.native
  def on(
    event: K_FRAG_PARSING_DATA,
    callback: js.Function2[/* event */ K_FRAG_PARSING_DATA, /* data */ fragParsingData, Unit]
  ): Unit = js.native
  def on(
    event: K_FRAG_PARSING_INIT_SEGMENT,
    callback: js.Function2[/* event */ K_FRAG_PARSING_INIT_SEGMENT, /* data */ fragParsingInitSegmentData, Unit]
  ): Unit = js.native
  def on(
    event: K_FRAG_PARSING_METADATA,
    callback: js.Function2[/* event */ K_FRAG_PARSING_METADATA, /* data */ fragParsingMetadata, Unit]
  ): Unit = js.native
  def on(
    event: K_FRAG_PARSING_USERDATA,
    callback: js.Function2[/* event */ K_FRAG_PARSING_USERDATA, /* data */ fragParsingUserData, Unit]
  ): Unit = js.native
  def on(
    event: K_INIT_PTS_FOUND,
    callback: js.Function2[/* event */ K_INIT_PTS_FOUND, /* data */ initPtsFoundData, Unit]
  ): Unit = js.native
  def on(
    event: K_KEY_LOADED,
    callback: js.Function2[/* event */ K_KEY_LOADED, /* data */ keyLoadedData, Unit]
  ): Unit = js.native
  def on(
    event: K_KEY_LOADING,
    callback: js.Function2[/* event */ K_KEY_LOADING, /* data */ keyLoadingData, Unit]
  ): Unit = js.native
  def on(
    event: K_LEVEL_LOADED,
    callback: js.Function2[/* event */ K_LEVEL_LOADED, /* data */ levelLoadedData, Unit]
  ): Unit = js.native
  def on(
    event: K_LEVEL_LOADING,
    callback: js.Function2[/* event */ K_LEVEL_LOADING, /* data */ levelLoadingData, Unit]
  ): Unit = js.native
  def on(
    event: K_LEVEL_PTS_UPDATED,
    callback: js.Function2[/* event */ K_LEVEL_PTS_UPDATED, /* data */ levelPtsUpdatedData, Unit]
  ): Unit = js.native
  def on(
    event: K_LEVEL_SWITCHED,
    callback: js.Function2[/* event */ K_LEVEL_SWITCHED, /* data */ levelSwitchedData, Unit]
  ): Unit = js.native
  def on(
    event: K_LEVEL_SWITCHING,
    callback: js.Function2[/* event */ K_LEVEL_SWITCHING, /* data */ levelSwitchingData, Unit]
  ): Unit = js.native
  def on(
    event: K_LEVEL_UPDATED,
    callback: js.Function2[/* event */ K_LEVEL_UPDATED, /* data */ levelUpdatedData, Unit]
  ): Unit = js.native
  def on(
    event: K_MANIFEST_LOADED,
    callback: js.Function2[/* event */ K_MANIFEST_LOADED, /* data */ manifestLoadedData, Unit]
  ): Unit = js.native
  def on(
    event: K_MANIFEST_LOADING,
    callback: js.Function2[/* event */ K_MANIFEST_LOADING, /* data */ manifestLoadingData, Unit]
  ): Unit = js.native
  def on(
    event: K_MANIFEST_PARSED,
    callback: js.Function2[/* event */ K_MANIFEST_PARSED, /* data */ manifestParsedData, Unit]
  ): Unit = js.native
  def on(
    event: K_MEDIA_ATTACHED,
    callback: js.Function2[/* event */ K_MEDIA_ATTACHED, /* data */ mediaAttachedData, Unit]
  ): Unit = js.native
  /**
    * hls.js event listener
    */
  def on(
    event: K_MEDIA_ATTACHING,
    callback: js.Function2[/* event */ K_MEDIA_ATTACHING, /* data */ mediaAttachingData, Unit]
  ): Unit = js.native
  def on(
    event: K_MEDIA_DETACHED,
    callback: js.Function2[/* event */ K_MEDIA_DETACHED, /* data */ js.Object, Unit]
  ): Unit = js.native
  def on(
    event: K_MEDIA_DETACHING,
    callback: js.Function2[/* event */ K_MEDIA_DETACHING, /* data */ js.Object, Unit]
  ): Unit = js.native
  def on(
    event: K_STREAM_STATE_TRANSITION,
    callback: js.Function2[/* event */ K_STREAM_STATE_TRANSITION, /* data */ streamStateTransitionData, Unit]
  ): Unit = js.native
  def on(
    event: K_SUBTITLE_FRAG_PROCESSED,
    callback: js.Function2[/* event */ K_SUBTITLE_FRAG_PROCESSED, /* data */ subtitleFragProcessedData, Unit]
  ): Unit = js.native
  def on(
    event: K_SUBTITLE_TRACKS_UPDATED,
    callback: js.Function2[/* event */ K_SUBTITLE_TRACKS_UPDATED, /* data */ subtitleTracksUpdatedData, Unit]
  ): Unit = js.native
  def on(
    event: K_SUBTITLE_TRACK_LOADED,
    callback: js.Function2[/* event */ K_SUBTITLE_TRACK_LOADED, /* data */ subtitleTrackLoadedData, Unit]
  ): Unit = js.native
  def on(
    event: K_SUBTITLE_TRACK_LOADING,
    callback: js.Function2[/* event */ K_SUBTITLE_TRACK_LOADING, /* data */ subtitleTrackLoadingData, Unit]
  ): Unit = js.native
  def on(
    event: K_SUBTITLE_TRACK_SWITCH,
    callback: js.Function2[/* event */ K_SUBTITLE_TRACK_SWITCH, /* data */ subtitleTrackSwitchData, Unit]
  ): Unit = js.native
  
  def once(
    event: K_AUDIO_TRACKS_UPDATED,
    callback: js.Function2[/* event */ K_AUDIO_TRACKS_UPDATED, /* data */ audioTracksUpdatedData, Unit]
  ): Unit = js.native
  def once(
    event: K_AUDIO_TRACK_LOADED,
    callback: js.Function2[/* event */ K_AUDIO_TRACK_LOADED, /* data */ audioTrackLoadedData, Unit]
  ): Unit = js.native
  def once(
    event: K_AUDIO_TRACK_LOADING,
    callback: js.Function2[/* event */ K_AUDIO_TRACK_LOADING, /* data */ audioTrackLoadingData, Unit]
  ): Unit = js.native
  def once(
    event: K_AUDIO_TRACK_SWITCHED,
    callback: js.Function2[/* event */ K_AUDIO_TRACK_SWITCHED, /* data */ audioTrackSwitchedData, Unit]
  ): Unit = js.native
  def once(
    event: K_AUDIO_TRACK_SWITCHING,
    callback: js.Function2[/* event */ K_AUDIO_TRACK_SWITCHING, /* data */ audioTrackSwitchingData, Unit]
  ): Unit = js.native
  def once(
    event: K_BUFFER_APPENDED,
    callback: js.Function2[/* event */ K_BUFFER_APPENDED, /* data */ bufferAppendedData, Unit]
  ): Unit = js.native
  def once(
    event: K_BUFFER_APPENDING,
    callback: js.Function2[/* event */ K_BUFFER_APPENDING, /* data */ bufferAppendingData, Unit]
  ): Unit = js.native
  def once(
    event: K_BUFFER_CODECS,
    callback: js.Function2[/* event */ K_BUFFER_CODECS, /* data */ bufferCodecsData, Unit]
  ): Unit = js.native
  def once(
    event: K_BUFFER_CREATED,
    callback: js.Function2[/* event */ K_BUFFER_CREATED, /* data */ bufferCreatedData, Unit]
  ): Unit = js.native
  def once(event: K_BUFFER_EOS, callback: js.Function2[/* event */ K_BUFFER_EOS, /* data */ js.Object, Unit]): Unit = js.native
  def once(
    event: K_BUFFER_FLUSHED,
    callback: js.Function2[/* event */ K_BUFFER_FLUSHED, /* data */ bufferFlushedData, Unit]
  ): Unit = js.native
  def once(
    event: K_BUFFER_FLUSHING,
    callback: js.Function2[/* event */ K_BUFFER_FLUSHING, /* data */ bufferFlushingData, Unit]
  ): Unit = js.native
  def once(
    event: K_BUFFER_RESET,
    callback: js.Function2[/* event */ K_BUFFER_RESET, /* data */ js.Object, Unit]
  ): Unit = js.native
  def once(event: K_DESTROYING, callback: js.Function2[/* event */ K_DESTROYING, /* data */ js.Object, Unit]): Unit = js.native
  def once(event: K_ERROR, callback: js.Function2[/* event */ K_ERROR, /* data */ errorData, Unit]): Unit = js.native
  def once(
    event: K_FPS_DROP_LEVEL_CAPPING,
    callback: js.Function2[/* event */ K_FPS_DROP_LEVEL_CAPPING, /* data */ fpsDropLevelCappingData, Unit]
  ): Unit = js.native
  def once(event: K_FPS_DROP, callback: js.Function2[/* event */ K_FPS_DROP, /* data */ fpsDropData, Unit]): Unit = js.native
  def once(
    event: K_FRAG_BUFFERED,
    callback: js.Function2[/* event */ K_FRAG_BUFFERED, /* data */ fragBufferedData, Unit]
  ): Unit = js.native
  def once(
    event: K_FRAG_CHANGED,
    callback: js.Function2[/* event */ K_FRAG_CHANGED, /* data */ fragChangedData, Unit]
  ): Unit = js.native
  def once(
    event: K_FRAG_DECRYPTED,
    callback: js.Function2[/* event */ K_FRAG_DECRYPTED, /* data */ fragDecryptedData, Unit]
  ): Unit = js.native
  def once(
    event: K_FRAG_LOADED,
    callback: js.Function2[/* event */ K_FRAG_LOADED, /* data */ fragLoadedData, Unit]
  ): Unit = js.native
  def once(
    event: K_FRAG_LOADING,
    callback: js.Function2[/* event */ K_FRAG_LOADING, /* data */ fragLoadingData, Unit]
  ): Unit = js.native
  def once(
    event: K_FRAG_LOAD_EMERGENCY_ABORTED,
    callback: js.Function2[
      /* event */ K_FRAG_LOAD_EMERGENCY_ABORTED, 
      /* data */ fragLoadEmergencyAbortedData, 
      Unit
    ]
  ): Unit = js.native
  def once(
    event: K_FRAG_LOAD_PROGRESS,
    callback: js.Function2[/* event */ K_FRAG_LOAD_PROGRESS, /* data */ fragLoadProgressData, Unit]
  ): Unit = js.native
  def once(
    event: K_FRAG_PARSED,
    callback: js.Function2[/* event */ K_FRAG_PARSED, /* data */ fragParsedData, Unit]
  ): Unit = js.native
  def once(
    event: K_FRAG_PARSING_DATA,
    callback: js.Function2[/* event */ K_FRAG_PARSING_DATA, /* data */ fragParsingData, Unit]
  ): Unit = js.native
  def once(
    event: K_FRAG_PARSING_INIT_SEGMENT,
    callback: js.Function2[/* event */ K_FRAG_PARSING_INIT_SEGMENT, /* data */ fragParsingInitSegmentData, Unit]
  ): Unit = js.native
  def once(
    event: K_FRAG_PARSING_METADATA,
    callback: js.Function2[/* event */ K_FRAG_PARSING_METADATA, /* data */ fragParsingMetadata, Unit]
  ): Unit = js.native
  def once(
    event: K_FRAG_PARSING_USERDATA,
    callback: js.Function2[/* event */ K_FRAG_PARSING_USERDATA, /* data */ fragParsingUserData, Unit]
  ): Unit = js.native
  def once(
    event: K_INIT_PTS_FOUND,
    callback: js.Function2[/* event */ K_INIT_PTS_FOUND, /* data */ initPtsFoundData, Unit]
  ): Unit = js.native
  def once(
    event: K_KEY_LOADED,
    callback: js.Function2[/* event */ K_KEY_LOADED, /* data */ keyLoadedData, Unit]
  ): Unit = js.native
  def once(
    event: K_KEY_LOADING,
    callback: js.Function2[/* event */ K_KEY_LOADING, /* data */ keyLoadingData, Unit]
  ): Unit = js.native
  def once(
    event: K_LEVEL_LOADED,
    callback: js.Function2[/* event */ K_LEVEL_LOADED, /* data */ levelLoadedData, Unit]
  ): Unit = js.native
  def once(
    event: K_LEVEL_LOADING,
    callback: js.Function2[/* event */ K_LEVEL_LOADING, /* data */ levelLoadingData, Unit]
  ): Unit = js.native
  def once(
    event: K_LEVEL_PTS_UPDATED,
    callback: js.Function2[/* event */ K_LEVEL_PTS_UPDATED, /* data */ levelPtsUpdatedData, Unit]
  ): Unit = js.native
  def once(
    event: K_LEVEL_SWITCHED,
    callback: js.Function2[/* event */ K_LEVEL_SWITCHED, /* data */ levelSwitchedData, Unit]
  ): Unit = js.native
  def once(
    event: K_LEVEL_SWITCHING,
    callback: js.Function2[/* event */ K_LEVEL_SWITCHING, /* data */ levelSwitchingData, Unit]
  ): Unit = js.native
  def once(
    event: K_LEVEL_UPDATED,
    callback: js.Function2[/* event */ K_LEVEL_UPDATED, /* data */ levelUpdatedData, Unit]
  ): Unit = js.native
  def once(
    event: K_MANIFEST_LOADED,
    callback: js.Function2[/* event */ K_MANIFEST_LOADED, /* data */ manifestLoadedData, Unit]
  ): Unit = js.native
  def once(
    event: K_MANIFEST_LOADING,
    callback: js.Function2[/* event */ K_MANIFEST_LOADING, /* data */ manifestLoadingData, Unit]
  ): Unit = js.native
  def once(
    event: K_MANIFEST_PARSED,
    callback: js.Function2[/* event */ K_MANIFEST_PARSED, /* data */ manifestParsedData, Unit]
  ): Unit = js.native
  def once(
    event: K_MEDIA_ATTACHED,
    callback: js.Function2[/* event */ K_MEDIA_ATTACHED, /* data */ mediaAttachedData, Unit]
  ): Unit = js.native
  /**
    * hls.js single event listener
    */
  def once(
    event: K_MEDIA_ATTACHING,
    callback: js.Function2[/* event */ K_MEDIA_ATTACHING, /* data */ mediaAttachedData, Unit]
  ): Unit = js.native
  def once(
    event: K_MEDIA_DETACHED,
    callback: js.Function2[/* event */ K_MEDIA_DETACHED, /* data */ js.Object, Unit]
  ): Unit = js.native
  def once(
    event: K_MEDIA_DETACHING,
    callback: js.Function2[/* event */ K_MEDIA_DETACHING, /* data */ js.Object, Unit]
  ): Unit = js.native
  def once(
    event: K_STREAM_STATE_TRANSITION,
    callback: js.Function2[/* event */ K_STREAM_STATE_TRANSITION, /* data */ streamStateTransitionData, Unit]
  ): Unit = js.native
  def once(
    event: K_SUBTITLE_FRAG_PROCESSED,
    callback: js.Function2[/* event */ K_SUBTITLE_FRAG_PROCESSED, /* data */ subtitleFragProcessedData, Unit]
  ): Unit = js.native
  def once(
    event: K_SUBTITLE_TRACKS_UPDATED,
    callback: js.Function2[/* event */ K_SUBTITLE_TRACKS_UPDATED, /* data */ subtitleTracksUpdatedData, Unit]
  ): Unit = js.native
  def once(
    event: K_SUBTITLE_TRACK_LOADED,
    callback: js.Function2[/* event */ K_SUBTITLE_TRACK_LOADED, /* data */ subtitleTrackLoadedData, Unit]
  ): Unit = js.native
  def once(
    event: K_SUBTITLE_TRACK_LOADING,
    callback: js.Function2[/* event */ K_SUBTITLE_TRACK_LOADING, /* data */ subtitleTrackLoadingData, Unit]
  ): Unit = js.native
  def once(
    event: K_SUBTITLE_TRACK_SWITCH,
    callback: js.Function2[/* event */ K_SUBTITLE_TRACK_SWITCH, /* data */ subtitleTrackSwitchData, Unit]
  ): Unit = js.native
  
  /**
    * should be invoked to recover media error.
    */
  def recoverMediaError(): Unit = js.native
  
  /**
    * return start level index (level of first fragment that will be played back)
    *      if not overrided by user: first level appearing in manifest will be used as start level
    *      if -1: automatic start level selection, playback will start from level matching download bandwidth (determined from download of first segment)
    *
    *  default valus is hls.firstLevel
    */
  var startLevel: Double = js.native
  
  /**
    * by default, hls.js will automatically start loading quality level playlists, and fragments after Hls.Events.MANIFEST_PARSED event has been triggered (and video element has been attached)
    * however if config.autoStartLoad is set to false, hls.startLoad() needs to be called to manually start playlist and fragments loading
    *
    * start/restart playlist/fragment loading. this is only effective if MANIFEST_PARSED event has been triggered and video element has been attached to hls object
    * startPosition is the initial position in the playlist
    * ff startPosition is not set to -1, it allows to override default startPosition to the one you want
    * (it will bypass hls.config.liveSync* config params for Live for example, so that user can start playback from whatever position)
    */
  def startLoad(): Unit = js.native
  def startLoad(startPosition: Double): Unit = js.native
  
  /**
    * stop playlist/fragment loading. could be resumed later on by calling hls.startLoad()
    */
  def stopLoad(): Unit = js.native
  
  /**
    * (default: false)
    * get/set : if set to true the active subtitle track mode will be set to showing and the browser will display the active subtitles.
    * If set to false, the mode will be set to hidden.
    */
  var subtitleDisplay: Boolean = js.native
  
  /**
    * get/set : subtitle track id (returned by).
    * Returns -1 if no track is visible.
    * Set to -1 to hide all subtitle tracks.
    */
  var subtitleTrack: Double = js.native
  
  /**
    * get : array of subtitle tracks exposed in manifest
    */
  val subtitleTracks: js.Array[SubtitleTrack] = js.native
  
  /**
    * if media error are still raised after calling hls.recoverMediaError(), calling this method, could be useful to workaround audio codec mismatch.
    * the workflow should be:
    *  on First Media Error : call hls.recoverMediaError()
    *  if another Media Error is raised 'quickly' after this first Media Error : first call hls.swapAudioCodec(), then call hls.recoverMediaError()
    */
  def swapAudioCodec(): Unit = js.native
}
