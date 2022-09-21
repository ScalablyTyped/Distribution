package typings.hlsJs.mod

import typings.hlsJs.anon.PartialHlsConfig
import typings.std.HTMLMediaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @module Hls
  * @class
  * @constructor
  */
@js.native
trait Hls
  extends StObject
     with HlsEventEmitter {
  
  /* private */ var _autoLevelCapping: Any = js.native
  
  /* private */ var _emitter: Any = js.native
  
  /* private */ var _media: Any = js.native
  
  /* private */ var abrController: Any = js.native
  
  /**
    * Attaches Hls.js to a media element
    * @param {HTMLMediaElement} media
    */
  def attachMedia(media: HTMLMediaElement): Unit = js.native
  
  /**
    * index of the selected audio track (index in audio track lists)
    * @type {number}
    */
  def audioTrack: Double = js.native
  
  /* private */ var audioTrackController: Any = js.native
  
  /**
    * selects an audio track, based on its index in audio track lists
    * @type {number}
    */
  def audioTrack_=(audioTrackId: Double): Unit = js.native
  
  /**
    * @type {AudioTrack[]}
    */
  def audioTracks: js.Array[MediaPlaylist] = js.native
  
  /**
    * Capping/max level value that should be used by automatic level selection algorithm (`ABRController`)
    * @type {number}
    */
  def autoLevelCapping: Double = js.native
  /**
    * Capping/max level value that should be used by automatic level selection algorithm (`ABRController`)
    * @type {number}
    */
  def autoLevelCapping_=(newLevel: Double): Unit = js.native
  
  /**
    * True when automatic level selection enabled
    * @type {boolean}
    */
  def autoLevelEnabled: Boolean = js.native
  
  /**
    * get bandwidth estimate
    * @type {number}
    */
  def bandwidthEstimate: Double = js.native
  
  /* private */ var bufferController: Any = js.native
  
  /* private */ var capLevelController: Any = js.native
  
  /**
    * Get the current setting for capLevelToPlayerSize
    *
    * @type {boolean}
    */
  def capLevelToPlayerSize: Boolean = js.native
  /**
    * set  dynamically set capLevelToPlayerSize against (`CapLevelController`)
    *
    * @type {boolean}
    */
  def capLevelToPlayerSize_=(shouldStartCapping: Boolean): Unit = js.native
  
  /* private */ var cmcdController: Any = js.native
  
  val config: HlsConfig = js.native
  
  /* private */ var coreComponents: Any = js.native
  
  def createController(ControllerClass: Any, fragmentTracker: Any, components: Any): Any = js.native
  
  /**
    * Index of quality level currently played
    * @type {number}
    */
  def currentLevel: Double = js.native
  /**
    * Set quality level index immediately .
    * This will flush the current buffer to replace the quality asap.
    * That means playback will interrupt at least shortly to re-buffer and re-sync eventually.
    * @type {number} -1 for automatic level selection
    */
  def currentLevel_=(newLevel: Double): Unit = js.native
  
  /**
    * Dispose of the instance
    */
  def destroy(): Unit = js.native
  
  /**
    * Detach Hls.js from the media
    */
  def detachMedia(): Unit = js.native
  
  /**
    * the rate at which the edge of the current live playlist is advancing or 1 if there is none
    * @type {number}
    */
  def drift: Double | Null = js.native
  
  /* private */ var emeController: Any = js.native
  
  /**
    * Return "first level": like a default level, if not set,
    * falls back to index of first level referenced in manifest
    * @type {number}
    */
  def firstLevel: Double = js.native
  /**
    * Sets "first-level", see getter.
    * @type {number}
    */
  def firstLevel_=(newLevel: Double): Unit = js.native
  
  /**
    * set to true when startLoad is called before MANIFEST_PARSED event
    * @type {boolean}
    */
  def forceStartLoad: Boolean = js.native
  
  /**
    * estimated position (in seconds) of live edge (ie edge of live playlist plus time sync playlist advanced)
    * returns 0 before first playlist is loaded
    * @type {number}
    */
  def latency: Double = js.native
  
  /* private */ var latencyController: Any = js.native
  
  /* private */ var levelController: Any = js.native
  
  /**
    * @type {Level[]}
    */
  def levels: js.Array[Level] = js.native
  
  /**
    * position (in seconds) of live sync point (ie edge of live position minus safety delay defined by ```hls.config.liveSyncDuration```)
    * @type {number}
    */
  def liveSyncPosition: Double | Null = js.native
  
  /**
    * Return the quality level of the currently or last (of none is loaded currently) segment
    * @type {number}
    */
  def loadLevel: Double = js.native
  /**
    * Set quality level index for next loaded data in a conservative way.
    * This will switch the quality without flushing, but interrupt current loading.
    * Thus the moment when the quality switch will appear in effect will only be after the already existing buffer.
    * @type {number} newLevel -1 for automatic level selection
    */
  def loadLevel_=(newLevel: Double): Unit = js.native
  
  /**
    * Set the source URL. Can be relative or absolute.
    * @param {string} url
    */
  def loadSource(url: String): Unit = js.native
  
  /**
    * get mode for Low-Latency HLS loading
    * @type {boolean}
    */
  def lowLatencyMode: Boolean = js.native
  /**
    * Enable/disable Low-Latency HLS part playlist and segment loading, and start live streams at playlist PART-HOLD-BACK rather than HOLD-BACK.
    * @type {boolean}
    */
  def lowLatencyMode_=(mode: Boolean): Unit = js.native
  
  /**
    * Level set manually (if any)
    * @type {number}
    */
  def manualLevel: Double = js.native
  
  /**
    * max level selectable in auto mode according to autoLevelCapping
    * @type {number}
    */
  def maxAutoLevel: Double = js.native
  
  /**
    * maximum distance from the edge before the player seeks forward to ```hls.liveSyncPosition```
    * configured using ```liveMaxLatencyDurationCount``` (multiple of target duration) or ```liveMaxLatencyDuration```
    * returns 0 before first playlist is loaded
    * @type {number}
    */
  def maxLatency: Double = js.native
  
  def media: HTMLMediaElement | Null = js.native
  
  /**
    * min level selectable in auto mode according to config.minAutoBitrate
    * @type {number}
    */
  def minAutoLevel: Double = js.native
  
  /* private */ var networkControllers: Any = js.native
  
  /**
    * next automatically selected quality level
    * @type {number}
    */
  def nextAutoLevel: Double = js.native
  /**
    * this setter is used to force next auto level.
    * this is useful to force a switch down in auto mode:
    * in case of load error on level N, hls.js can set nextAutoLevel to N-1 for example)
    * forced value is valid for one fragment. upon successful frag loading at forced level,
    * this value will be resetted to -1 by ABR controller.
    * @type {number}
    */
  def nextAutoLevel_=(nextLevel: Double): Unit = js.native
  
  /**
    * Index of next quality level loaded as scheduled by stream controller.
    * @type {number}
    */
  def nextLevel: Double = js.native
  /**
    * Set quality level index for next loaded data.
    * This will switch the video quality asap, without interrupting playback.
    * May abort current loading of data, and flush parts of buffer (outside currently played fragment region).
    * @type {number} -1 for automatic level selection
    */
  def nextLevel_=(newLevel: Double): Unit = js.native
  
  /**
    * get next quality level loaded
    * @type {number}
    */
  def nextLoadLevel: Double = js.native
  /**
    * Set quality level of next loaded segment in a fully "non-destructive" way.
    * Same as `loadLevel` but will wait for next switch (until current loading is done).
    * @type {number} level
    */
  def nextLoadLevel_=(level: Double): Unit = js.native
  
  /**
    * get the datetime value relative to media.currentTime for the active level Program Date Time if present
    * @type {Date}
    */
  def playingDate: js.Date | Null = js.native
  
  /**
    * When the media-element fails, this allows to detach and then re-attach it
    * as one call (convenience method).
    *
    * Automatic recovery of media-errors by this process is configurable.
    */
  def recoverMediaError(): Unit = js.native
  
  def removeLevel(levelIndex: Any): Unit = js.native
  def removeLevel(levelIndex: Any, urlId: Double): Unit = js.native
  
  /**
    * Return start level (level of first fragment that will be played back)
    * if not overrided by user, first level appearing in manifest will be used as start level
    * if -1 : automatic start level selection, playback will start from level matching download bandwidth
    * (determined from download of first segment)
    * @type {number}
    */
  def startLevel: Double = js.native
  /**
    * set  start level (level of first fragment that will be played back)
    * if not overrided by user, first level appearing in manifest will be used as start level
    * if -1 : automatic start level selection, playback will start from level matching download bandwidth
    * (determined from download of first segment)
    * @type {number} newLevel
    */
  def startLevel_=(newLevel: Double): Unit = js.native
  
  /**
    * Start loading data from the stream source.
    * Depending on default config, client starts loading automatically when a source is set.
    *
    * @param {number} startPosition Set the start position to stream from
    * @default -1 None (from earliest point)
    */
  def startLoad(): Unit = js.native
  def startLoad(startPosition: Double): Unit = js.native
  
  /**
    * Stop loading of any stream data.
    */
  def stopLoad(): Unit = js.native
  
  /* private */ var streamController: Any = js.native
  
  /**
    * @type {boolean}
    */
  def subtitleDisplay: Boolean = js.native
  /**
    * Enable/disable subtitle display rendering
    * @type {boolean}
    */
  def subtitleDisplay_=(value: Boolean): Unit = js.native
  
  /**
    * index of the selected subtitle track (index in subtitle track lists)
    * @type {number}
    */
  def subtitleTrack: Double = js.native
  
  /* private */ var subtitleTrackController: Any = js.native
  
  /**
    * select an subtitle track, based on its index in subtitle track lists
    * @type {number}
    */
  def subtitleTrack_=(subtitleTrackId: Double): Unit = js.native
  
  /**
    * get alternate subtitle tracks list from playlist
    * @type {MediaPlaylist[]}
    */
  def subtitleTracks: js.Array[MediaPlaylist] = js.native
  
  /**
    * Swap through possible audio codecs in the stream (for example to switch from stereo to 5.1)
    */
  def swapAudioCodec(): Unit = js.native
  
  /**
    * target distance from the edge as calculated by the latency controller
    * @type {number}
    */
  def targetLatency: Double | Null = js.native
  
  @JSName("trigger")
  def trigger_1[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */](
    event: E,
    eventObject: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<hls.js.hls.js.HlsListeners[E]>[1] */ js.Any
  ): Boolean = js.native
  
  /* private */ var url: Any = js.native
  
  val userConfig: PartialHlsConfig = js.native
}
