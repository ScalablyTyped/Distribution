package typings
package hlsDotJsLib.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hls extends js.Object {
  /**
    * get: returns audio track id
    * set: sets audio track id (returned by)
    */
  var audioTrack: scala.Double = js.native
  /**
    * array of audio tracks exposed in manifest
    */
  val audioTracks: js.Array[stdLib.AudioTrack] = js.native
  /**
    * capping/max level (index of level) that could be used by ABR Controller. Defaults to -1
    * which means no limit
    * set: max level value that could be used by the ABR Controller
    */
  var autoLevelCapping: scala.Double = js.native
  /**
    * tell whether auto level selection is enabled or not
    */
  val autoLevelEnabled: scala.Boolean = js.native
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
  var currentLevel: scala.Double = js.native
  /**
    * first level index (index of first level appearing in Manifest. it is usually defined as start level hint for player)
    */
  var firstLevel: scala.Double = js.native
  /**
    * return array of available quality levels
    */
  val levels: js.Array[Level] = js.native
  /**
    * position of live sync point (ie edge of live position minus safety delay defined by hls.config.liveSyncDuration)
    */
  val liveSyncPosition: scala.Double = js.native
  /**
    * get: return last loaded fragment quality level
    * set: quality level for next loaded fragment
    * set to -1 for automatic level selection
    */
  var loadLevel: scala.Double = js.native
  /**
    * get: Return the bound videoElement from the hls instance
    */
  val media: js.UndefOr[stdLib.HTMLVideoElement | scala.Null] = js.native
  /**
    * get: return next playback quality level (playback quality level for next buffered fragment)
    * return -1 if next fragment not buffered yet
    * set: trigger a quality level switch for next fragment
    * this could eventually flush already buffered next fragment
    *
    * set to -1 for automatic level selection
    */
  var nextLevel: scala.Double = js.native
  /**
    * get: return quality level that will be used to load next fragment
    * set: force quality level for next loaded fragment
    * quality level will be forced only for that fragment
    * after a fragment at this quality level has been loaded, hls.loadLevel will prevail
    */
  var nextLoadLevel: scala.Double = js.native
  /**
    * return start level index (level of first fragment that will be played back)
    *      if not overrided by user: first level appearing in manifest will be used as start level
    *      if -1: automatic start level selection, playback will start from level matching download bandwidth (determined from download of first segment)
    *
    *  default valus is hls.firstLevel
    */
  var startLevel: scala.Double = js.native
  /**
    * (default: false)
    * get/set : if set to true the active subtitle track mode will be set to showing and the browser will display the active subtitles.
    * If set to false, the mode will be set to hidden.
    */
  var subtitleDisplay: scala.Boolean = js.native
  /**
    * get/set : subtitle track id (returned by).
    * Returns -1 if no track is visible.
    * Set to -1 to hide all subtitle tracks.
    */
  var subtitleTrack: scala.Double = js.native
  /**
    * get : array of subtitle tracks exposed in manifest
    */
  val subtitleTracks: js.Array[_] = js.native
  /**
    * calling this method will:
    *      bind videoElement and hls instances
    *      create MediaSource and set it as video source
    *      once MediaSource object is successfully created, MEDIA_ATTACHED event will be fired
    */
  def attachMedia(videoElement: stdLib.HTMLVideoElement): scala.Unit = js.native
  /**
    * should be called to free used resources and destroy hls context
    */
  def destroy(): scala.Unit = js.native
  /**
    * calling this method will:
    *      unbind VideoElement from hls instance
    *      signal the end of the stream on MediaSource
    *      reset video source ( video.src = '' )
    */
  def detachMedia(): scala.Unit = js.native
  /**
    * loads provided url as media source
    */
  def loadSource(source: java.lang.String): scala.Unit = js.native
  /**
    * remove hls.js event listener
    */
  def off(event: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_AUDIO_TRACKS_UPDATED,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_AUDIO_TRACKS_UPDATED, 
      /* data */ audioTracksUpdatedData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_AUDIO_TRACK_LOADED,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_AUDIO_TRACK_LOADED, 
      /* data */ audioTrackLoadedData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_AUDIO_TRACK_LOADING,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_AUDIO_TRACK_LOADING, 
      /* data */ audioTrackLoadingData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_AUDIO_TRACK_SWITCHED,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_AUDIO_TRACK_SWITCHED, 
      /* data */ audioTrackSwitchedData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_AUDIO_TRACK_SWITCHING,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_AUDIO_TRACK_SWITCHING, 
      /* data */ audioTrackSwitchingData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_BUFFER_APPENDED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_BUFFER_APPENDED, /* data */ bufferAppendedData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_BUFFER_APPENDING,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_BUFFER_APPENDING, 
      /* data */ bufferAppendingData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_BUFFER_CODECS,
    callback: js.Function2[/* event */ hlsDotJsLib.K_BUFFER_CODECS, /* data */ bufferCodecsData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_BUFFER_CREATED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_BUFFER_CREATED, /* data */ bufferCreatedData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_BUFFER_EOS,
    callback: js.Function2[/* event */ hlsDotJsLib.K_BUFFER_EOS, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_BUFFER_FLUSHED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_BUFFER_FLUSHED, /* data */ bufferFlushedData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_BUFFER_FLUSHING,
    callback: js.Function2[/* event */ hlsDotJsLib.K_BUFFER_FLUSHING, /* data */ bufferFlushingData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_BUFFER_RESET,
    callback: js.Function2[/* event */ hlsDotJsLib.K_BUFFER_RESET, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_DESTROYING,
    callback: js.Function2[/* event */ hlsDotJsLib.K_DESTROYING, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_ERROR,
    callback: js.Function2[/* event */ hlsDotJsLib.K_ERROR, /* data */ errorData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_FPS_DROP_LEVEL_CAPPING,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_FPS_DROP_LEVEL_CAPPING, 
      /* data */ fpsDropLevelCappingData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_FPS_DROP,
    callback: js.Function2[/* event */ hlsDotJsLib.K_FPS_DROP, /* data */ fpsDropData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_FRAG_BUFFERED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_FRAG_BUFFERED, /* data */ fragBufferedData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_FRAG_CHANGED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_FRAG_CHANGED, /* data */ fragChangedData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_FRAG_DECRYPTED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_FRAG_DECRYPTED, /* data */ fragDecryptedData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_FRAG_LOADED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_FRAG_LOADED, /* data */ fragLoadedData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_FRAG_LOADING,
    callback: js.Function2[/* event */ hlsDotJsLib.K_FRAG_LOADING, /* data */ fragLoadingData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_FRAG_LOAD_EMERGENCY_ABORTED,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_FRAG_LOAD_EMERGENCY_ABORTED, 
      /* data */ fragLoadEmergencyAbortedData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_FRAG_LOAD_PROGRESS,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_FRAG_LOAD_PROGRESS, 
      /* data */ fragLoadProgressData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_FRAG_PARSED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_FRAG_PARSED, /* data */ fragParsedData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_FRAG_PARSING_DATA,
    callback: js.Function2[/* event */ hlsDotJsLib.K_FRAG_PARSING_DATA, /* data */ fragParsingData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_FRAG_PARSING_INIT_SEGMENT,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_FRAG_PARSING_INIT_SEGMENT, 
      /* data */ fragParsingInitSegmentData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_FRAG_PARSING_METADATA,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_FRAG_PARSING_METADATA, 
      /* data */ fragParsingMetadata, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_FRAG_PARSING_USERDATA,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_FRAG_PARSING_USERDATA, 
      /* data */ fragParsingUserData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_INIT_PTS_FOUND,
    callback: js.Function2[/* event */ hlsDotJsLib.K_INIT_PTS_FOUND, /* data */ initPtsFoundData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_KEY_LOADED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_KEY_LOADED, /* data */ keyLoadedData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_KEY_LOADING,
    callback: js.Function2[/* event */ hlsDotJsLib.K_KEY_LOADING, /* data */ keyLoadingData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_LEVEL_LOADED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_LEVEL_LOADED, /* data */ levelLoadedData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_LEVEL_LOADING,
    callback: js.Function2[/* event */ hlsDotJsLib.K_LEVEL_LOADING, /* data */ levelLoadingData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_LEVEL_PTS_UPDATED,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_LEVEL_PTS_UPDATED, 
      /* data */ levelPtsUpdatedData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_LEVEL_SWITCHED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_LEVEL_SWITCHED, /* data */ levelSwitchedData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_LEVEL_SWITCHING,
    callback: js.Function2[/* event */ hlsDotJsLib.K_LEVEL_SWITCHING, /* data */ levelSwitchingData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_LEVEL_UPDATED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_LEVEL_UPDATED, /* data */ levelUpdatedData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_MANIFEST_LOADED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_MANIFEST_LOADED, /* data */ manifestLoadedData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_MANIFEST_LOADING,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_MANIFEST_LOADING, 
      /* data */ manifestLoadingData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_MANIFEST_PARSED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_MANIFEST_PARSED, /* data */ manifestParsedData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_MEDIA_ATTACHED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_MEDIA_ATTACHED, /* data */ mediaAttachedData, scala.Unit]
  ): scala.Unit = js.native
  /**
    * hls.js event listener
    */
  def on(
    event: hlsDotJsLib.K_MEDIA_ATTACHING,
    callback: js.Function2[/* event */ hlsDotJsLib.K_MEDIA_ATTACHING, /* data */ mediaAttachedData, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_MEDIA_DETACHED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_MEDIA_DETACHED, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_MEDIA_DETACHING,
    callback: js.Function2[/* event */ hlsDotJsLib.K_MEDIA_DETACHING, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_STREAM_STATE_TRANSITION,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_STREAM_STATE_TRANSITION, 
      /* data */ streamStateTransitionData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_SUBTITLE_FRAG_PROCESSED,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_SUBTITLE_FRAG_PROCESSED, 
      /* data */ subtitleFragProcessedData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_SUBTITLE_TRACKS_UPDATED,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_SUBTITLE_TRACKS_UPDATED, 
      /* data */ subtitleTracksUpdatedData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_SUBTITLE_TRACK_LOADED,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_SUBTITLE_TRACK_LOADED, 
      /* data */ subtitleTrackLoadedData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_SUBTITLE_TRACK_LOADING,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_SUBTITLE_TRACK_LOADING, 
      /* data */ subtitleTrackLoadingData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    event: hlsDotJsLib.K_SUBTITLE_TRACK_SWITCH,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_SUBTITLE_TRACK_SWITCH, 
      /* data */ subtitleTrackSwitchData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_AUDIO_TRACKS_UPDATED,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_AUDIO_TRACKS_UPDATED, 
      /* data */ audioTracksUpdatedData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_AUDIO_TRACK_LOADED,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_AUDIO_TRACK_LOADED, 
      /* data */ audioTrackLoadedData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_AUDIO_TRACK_LOADING,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_AUDIO_TRACK_LOADING, 
      /* data */ audioTrackLoadingData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_AUDIO_TRACK_SWITCHED,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_AUDIO_TRACK_SWITCHED, 
      /* data */ audioTrackSwitchedData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_AUDIO_TRACK_SWITCHING,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_AUDIO_TRACK_SWITCHING, 
      /* data */ audioTrackSwitchingData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_BUFFER_APPENDED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_BUFFER_APPENDED, /* data */ bufferAppendedData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_BUFFER_APPENDING,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_BUFFER_APPENDING, 
      /* data */ bufferAppendingData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_BUFFER_CODECS,
    callback: js.Function2[/* event */ hlsDotJsLib.K_BUFFER_CODECS, /* data */ bufferCodecsData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_BUFFER_CREATED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_BUFFER_CREATED, /* data */ bufferCreatedData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_BUFFER_EOS,
    callback: js.Function2[/* event */ hlsDotJsLib.K_BUFFER_EOS, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_BUFFER_FLUSHED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_BUFFER_FLUSHED, /* data */ bufferFlushedData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_BUFFER_FLUSHING,
    callback: js.Function2[/* event */ hlsDotJsLib.K_BUFFER_FLUSHING, /* data */ bufferFlushingData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_BUFFER_RESET,
    callback: js.Function2[/* event */ hlsDotJsLib.K_BUFFER_RESET, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_DESTROYING,
    callback: js.Function2[/* event */ hlsDotJsLib.K_DESTROYING, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_ERROR,
    callback: js.Function2[/* event */ hlsDotJsLib.K_ERROR, /* data */ errorData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_FPS_DROP_LEVEL_CAPPING,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_FPS_DROP_LEVEL_CAPPING, 
      /* data */ fpsDropLevelCappingData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_FPS_DROP,
    callback: js.Function2[/* event */ hlsDotJsLib.K_FPS_DROP, /* data */ fpsDropData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_FRAG_BUFFERED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_FRAG_BUFFERED, /* data */ fragBufferedData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_FRAG_CHANGED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_FRAG_CHANGED, /* data */ fragChangedData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_FRAG_DECRYPTED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_FRAG_DECRYPTED, /* data */ fragDecryptedData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_FRAG_LOADED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_FRAG_LOADED, /* data */ fragLoadedData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_FRAG_LOADING,
    callback: js.Function2[/* event */ hlsDotJsLib.K_FRAG_LOADING, /* data */ fragLoadingData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_FRAG_LOAD_EMERGENCY_ABORTED,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_FRAG_LOAD_EMERGENCY_ABORTED, 
      /* data */ fragLoadEmergencyAbortedData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_FRAG_LOAD_PROGRESS,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_FRAG_LOAD_PROGRESS, 
      /* data */ fragLoadProgressData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_FRAG_PARSED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_FRAG_PARSED, /* data */ fragParsedData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_FRAG_PARSING_DATA,
    callback: js.Function2[/* event */ hlsDotJsLib.K_FRAG_PARSING_DATA, /* data */ fragParsingData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_FRAG_PARSING_INIT_SEGMENT,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_FRAG_PARSING_INIT_SEGMENT, 
      /* data */ fragParsingInitSegmentData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_FRAG_PARSING_METADATA,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_FRAG_PARSING_METADATA, 
      /* data */ fragParsingMetadata, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_FRAG_PARSING_USERDATA,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_FRAG_PARSING_USERDATA, 
      /* data */ fragParsingUserData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_INIT_PTS_FOUND,
    callback: js.Function2[/* event */ hlsDotJsLib.K_INIT_PTS_FOUND, /* data */ initPtsFoundData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_KEY_LOADED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_KEY_LOADED, /* data */ keyLoadedData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_KEY_LOADING,
    callback: js.Function2[/* event */ hlsDotJsLib.K_KEY_LOADING, /* data */ keyLoadingData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_LEVEL_LOADED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_LEVEL_LOADED, /* data */ levelLoadedData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_LEVEL_LOADING,
    callback: js.Function2[/* event */ hlsDotJsLib.K_LEVEL_LOADING, /* data */ levelLoadingData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_LEVEL_PTS_UPDATED,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_LEVEL_PTS_UPDATED, 
      /* data */ levelPtsUpdatedData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_LEVEL_SWITCHED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_LEVEL_SWITCHED, /* data */ levelSwitchedData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_LEVEL_SWITCHING,
    callback: js.Function2[/* event */ hlsDotJsLib.K_LEVEL_SWITCHING, /* data */ levelSwitchingData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_LEVEL_UPDATED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_LEVEL_UPDATED, /* data */ levelUpdatedData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_MANIFEST_LOADED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_MANIFEST_LOADED, /* data */ manifestLoadedData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_MANIFEST_LOADING,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_MANIFEST_LOADING, 
      /* data */ manifestLoadingData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_MANIFEST_PARSED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_MANIFEST_PARSED, /* data */ manifestParsedData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_MEDIA_ATTACHED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_MEDIA_ATTACHED, /* data */ mediaAttachedData, scala.Unit]
  ): scala.Unit = js.native
  /**
    * hls.js single event listener
    */
  def once(
    event: hlsDotJsLib.K_MEDIA_ATTACHING,
    callback: js.Function2[/* event */ hlsDotJsLib.K_MEDIA_ATTACHING, /* data */ mediaAttachedData, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_MEDIA_DETACHED,
    callback: js.Function2[/* event */ hlsDotJsLib.K_MEDIA_DETACHED, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_MEDIA_DETACHING,
    callback: js.Function2[/* event */ hlsDotJsLib.K_MEDIA_DETACHING, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_STREAM_STATE_TRANSITION,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_STREAM_STATE_TRANSITION, 
      /* data */ streamStateTransitionData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_SUBTITLE_FRAG_PROCESSED,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_SUBTITLE_FRAG_PROCESSED, 
      /* data */ subtitleFragProcessedData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_SUBTITLE_TRACKS_UPDATED,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_SUBTITLE_TRACKS_UPDATED, 
      /* data */ subtitleTracksUpdatedData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_SUBTITLE_TRACK_LOADED,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_SUBTITLE_TRACK_LOADED, 
      /* data */ subtitleTrackLoadedData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_SUBTITLE_TRACK_LOADING,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_SUBTITLE_TRACK_LOADING, 
      /* data */ subtitleTrackLoadingData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def once(
    event: hlsDotJsLib.K_SUBTITLE_TRACK_SWITCH,
    callback: js.Function2[
      /* event */ hlsDotJsLib.K_SUBTITLE_TRACK_SWITCH, 
      /* data */ subtitleTrackSwitchData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * should be invoked to recover media error.
    */
  def recoverMediaError(): scala.Unit = js.native
  /**
    * by default, hls.js will automatically start loading quality level playlists, and fragments after Hls.Events.MANIFEST_PARSED event has been triggered (and video element has been attached)
    * however if config.autoStartLoad is set to false, hls.startLoad() needs to be called to manually start playlist and fragments loading
    *
    * start/restart playlist/fragment loading. this is only effective if MANIFEST_PARSED event has been triggered and video element has been attached to hls object
    * startPosition is the initial position in the playlist
    * ff startPosition is not set to -1, it allows to override default startPosition to the one you want
    * (it will bypass hls.config.liveSync* config params for Live for example, so that user can start playback from whatever position)
    */
  def startLoad(): scala.Unit = js.native
  def startLoad(startPosition: scala.Double): scala.Unit = js.native
  /**
    * stop playlist/fragment loading. could be resumed later on by calling hls.startLoad()
    */
  def stopLoad(): scala.Unit = js.native
  /**
    * if media error are still raised after calling hls.recoverMediaError(), calling this method, could be useful to workaround audio codec mismatch.
    * the workflow should be:
    *  on First Media Error : call hls.recoverMediaError()
    *  if another Media Error is raised 'quickly' after this first Media Error : first call hls.swapAudioCodec(), then call hls.recoverMediaError()
    */
  def swapAudioCodec(): scala.Unit = js.native
}

