package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.adClick
import typings.jwplayer.jwplayerStrings.adCompanions
import typings.jwplayer.jwplayerStrings.adComplete
import typings.jwplayer.jwplayerStrings.adError
import typings.jwplayer.jwplayerStrings.adImpression
import typings.jwplayer.jwplayerStrings.adPause
import typings.jwplayer.jwplayerStrings.adPlay
import typings.jwplayer.jwplayerStrings.adRequest
import typings.jwplayer.jwplayerStrings.adSchedule
import typings.jwplayer.jwplayerStrings.adSkipped
import typings.jwplayer.jwplayerStrings.adStarted
import typings.jwplayer.jwplayerStrings.adTime
import typings.jwplayer.jwplayerStrings.audioTrackChanged
import typings.jwplayer.jwplayerStrings.audioTracks
import typings.jwplayer.jwplayerStrings.buffer
import typings.jwplayer.jwplayerStrings.bufferChange
import typings.jwplayer.jwplayerStrings.captionsChanged
import typings.jwplayer.jwplayerStrings.captionsList
import typings.jwplayer.jwplayerStrings.cast
import typings.jwplayer.jwplayerStrings.controls
import typings.jwplayer.jwplayerStrings.error
import typings.jwplayer.jwplayerStrings.firstFrame
import typings.jwplayer.jwplayerStrings.fullscreen
import typings.jwplayer.jwplayerStrings.idle
import typings.jwplayer.jwplayerStrings.levels
import typings.jwplayer.jwplayerStrings.levelsChanged
import typings.jwplayer.jwplayerStrings.meta
import typings.jwplayer.jwplayerStrings.mute
import typings.jwplayer.jwplayerStrings.pause
import typings.jwplayer.jwplayerStrings.play
import typings.jwplayer.jwplayerStrings.playbackRateChanged
import typings.jwplayer.jwplayerStrings.playlist
import typings.jwplayer.jwplayerStrings.playlistItem
import typings.jwplayer.jwplayerStrings.ready
import typings.jwplayer.jwplayerStrings.resize
import typings.jwplayer.jwplayerStrings.seek
import typings.jwplayer.jwplayerStrings.setupError
import typings.jwplayer.jwplayerStrings.time
import typings.jwplayer.jwplayerStrings.visualQuality
import typings.jwplayer.jwplayerStrings.volume
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JWPlayer extends StObject {
  
  def addButton(icon: String, label: String, handler: js.Function0[Unit], id: String): Unit = js.native
  
  def getAudioTracks(): js.Array[_] = js.native
  
  def getBuffer(): Double = js.native
  
  def getCaptionsList(): js.Array[_] = js.native
  
  def getContainer(): HTMLElement = js.native
  
  def getControls(): Boolean = js.native
  
  def getCurrentAudioTrack(): Double = js.native
  
  def getCurrentCaptions(): Double = js.native
  
  def getCurrentQuality(): Double = js.native
  
  def getDuration(): Double = js.native
  
  def getEnvironment(): Environment = js.native
  
  def getFullscreen(): Boolean = js.native
  
  def getHeight(): Double = js.native
  
  def getMute(): Boolean = js.native
  
  def getPlaybackRate(): Double = js.native
  
  def getPlaylist(): js.Array[_] = js.native
  
  def getPlaylistIndex(): Double = js.native
  
  def getPlaylistItem(): js.Any = js.native
  def getPlaylistItem(index: Double): js.Any = js.native
  
  def getPosition(): Double = js.native
  
  def getQualityLevels(): js.Array[_] = js.native
  
  def getRenderingMode(): String = js.native
  
  def getSafeRegion(): Region = js.native
  
  def getState(): String = js.native
  
  def getVisualQuality(): js.UndefOr[QualityLevel] = js.native
  
  def getVolume(): Double = js.native
  
  def getWidth(): Double = js.native
  
  def load(playlist: String): Unit = js.native
  def load(playlist: js.Array[_]): Unit = js.native
  
  def off(
    event: adClick | adCompanions | adComplete | adSkipped | adError | adRequest | adSchedule | adStarted | adImpression | adPlay | adPause | adTime | cast | meta | audioTracks | audioTrackChanged | firstFrame | buffer | bufferChange | captionsChanged | captionsList | controls | error | fullscreen | idle | levelsChanged | mute | volume | pause | play | playlist | playlistItem | ready | resize | visualQuality | playbackRateChanged | levels | seek | setupError | time
  ): Unit = js.native
  def off(event: NoParamEvent): Unit = js.native
  def off(event: NoParamEvent, callback: js.Function0[Unit]): Unit = js.native
  @JSName("off")
  def off_adClick(event: adClick, callback: EventCallback[AdProgressParam]): Unit = js.native
  @JSName("off")
  def off_adCompanions(event: adCompanions, callback: EventCallback[AdCompanionsParam]): Unit = js.native
  @JSName("off")
  def off_adComplete(event: adComplete, callback: EventCallback[AdProgressParam]): Unit = js.native
  @JSName("off")
  def off_adError(event: adError, callback: EventCallback[AdErrorParam]): Unit = js.native
  @JSName("off")
  def off_adImpression(event: adImpression, callback: EventCallback[AdImpressionParam]): Unit = js.native
  @JSName("off")
  def off_adPause(event: adPause, callback: EventCallback[AdPlayParam]): Unit = js.native
  @JSName("off")
  def off_adPlay(event: adPlay, callback: EventCallback[AdPlayParam]): Unit = js.native
  @JSName("off")
  def off_adRequest(event: adRequest, callback: EventCallback[AdRequestParam]): Unit = js.native
  @JSName("off")
  def off_adSchedule(event: adSchedule, callback: EventCallback[AdScheduleParam]): Unit = js.native
  @JSName("off")
  def off_adSkipped(event: adSkipped, callback: EventCallback[AdProgressParam]): Unit = js.native
  @JSName("off")
  def off_adStarted(event: adStarted, callback: EventCallback[AdStartedParam]): Unit = js.native
  @JSName("off")
  def off_adTime(event: adTime, callback: EventCallback[AdTimeParam]): Unit = js.native
  @JSName("off")
  def off_audioTrackChanged(event: audioTrackChanged, callback: EventCallback[AudioTrackChangedParam]): Unit = js.native
  @JSName("off")
  def off_audioTracks(event: audioTracks, callback: EventCallback[AudioTracksParam]): Unit = js.native
  @JSName("off")
  def off_buffer(event: buffer, callback: EventCallback[BufferParam]): Unit = js.native
  @JSName("off")
  def off_bufferChange(event: bufferChange, callback: EventCallback[BufferChangeParam]): Unit = js.native
  @JSName("off")
  def off_captionsChanged(event: captionsChanged, callback: EventCallback[CaptionsChangedParam]): Unit = js.native
  @JSName("off")
  def off_captionsList(event: captionsList, callback: EventCallback[CaptionsListParam]): Unit = js.native
  @JSName("off")
  def off_cast(event: cast, callback: EventCallback[CastParam]): Unit = js.native
  @JSName("off")
  def off_controls(event: controls, callback: EventCallback[ControlsParam]): Unit = js.native
  @JSName("off")
  def off_error(event: error, callback: EventCallback[ErrorParam]): Unit = js.native
  @JSName("off")
  def off_firstFrame(event: firstFrame, callback: EventCallback[FirstFrameParam]): Unit = js.native
  @JSName("off")
  def off_fullscreen(event: fullscreen, callback: EventCallback[FullscreenParam]): Unit = js.native
  @JSName("off")
  def off_idle(event: idle, callback: EventCallback[IdleParam]): Unit = js.native
  @JSName("off")
  def off_levels(event: levels, callback: EventCallback[LevelsParam]): Unit = js.native
  @JSName("off")
  def off_levelsChanged(event: levelsChanged, callback: EventCallback[LevelsChangedParam]): Unit = js.native
  @JSName("off")
  def off_meta(event: meta, callback: EventCallback[MetadataParam]): Unit = js.native
  @JSName("off")
  def off_mute(event: mute, callback: EventCallback[MuteParam]): Unit = js.native
  @JSName("off")
  def off_pause(event: pause, callback: EventCallback[PlayParam]): Unit = js.native
  @JSName("off")
  def off_play(event: play, callback: EventCallback[PlayParam]): Unit = js.native
  @JSName("off")
  def off_playbackRateChanged(event: playbackRateChanged, callback: EventCallback[PlaybackRateChangedParam]): Unit = js.native
  @JSName("off")
  def off_playlist(event: playlist, callback: EventCallback[PlaylistParam]): Unit = js.native
  @JSName("off")
  def off_playlistItem(event: playlistItem, callback: EventCallback[PlaylistItemParam]): Unit = js.native
  @JSName("off")
  def off_ready(event: ready, callback: EventCallback[ReadyParam]): Unit = js.native
  @JSName("off")
  def off_resize(event: resize, callback: EventCallback[ResizeParam]): Unit = js.native
  @JSName("off")
  def off_seek(event: seek, callback: EventCallback[SeekParam]): Unit = js.native
  @JSName("off")
  def off_setupError(event: setupError, callback: EventCallback[ErrorParam]): Unit = js.native
  @JSName("off")
  def off_time(event: time, callback: EventCallback[TimeParam]): Unit = js.native
  @JSName("off")
  def off_visualQuality(event: visualQuality, callback: EventCallback[VisualQualityParam]): Unit = js.native
  @JSName("off")
  def off_volume(event: volume, callback: EventCallback[VolumeParam]): Unit = js.native
  
  def on(event: NoParamEvent, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_adClick(event: adClick, callback: EventCallback[AdProgressParam]): Unit = js.native
  @JSName("on")
  def on_adCompanions(event: adCompanions, callback: EventCallback[AdCompanionsParam]): Unit = js.native
  @JSName("on")
  def on_adComplete(event: adComplete, callback: EventCallback[AdProgressParam]): Unit = js.native
  @JSName("on")
  def on_adError(event: adError, callback: EventCallback[AdErrorParam]): Unit = js.native
  @JSName("on")
  def on_adImpression(event: adImpression, callback: EventCallback[AdImpressionParam]): Unit = js.native
  @JSName("on")
  def on_adPause(event: adPause, callback: EventCallback[AdPlayParam]): Unit = js.native
  @JSName("on")
  def on_adPlay(event: adPlay, callback: EventCallback[AdPlayParam]): Unit = js.native
  @JSName("on")
  def on_adRequest(event: adRequest, callback: EventCallback[AdRequestParam]): Unit = js.native
  @JSName("on")
  def on_adSchedule(event: adSchedule, callback: EventCallback[AdScheduleParam]): Unit = js.native
  @JSName("on")
  def on_adSkipped(event: adSkipped, callback: EventCallback[AdProgressParam]): Unit = js.native
  @JSName("on")
  def on_adStarted(event: adStarted, callback: EventCallback[AdStartedParam]): Unit = js.native
  @JSName("on")
  def on_adTime(event: adTime, callback: EventCallback[AdTimeParam]): Unit = js.native
  @JSName("on")
  def on_audioTrackChanged(event: audioTrackChanged, callback: EventCallback[AudioTrackChangedParam]): Unit = js.native
  @JSName("on")
  def on_audioTracks(event: audioTracks, callback: EventCallback[AudioTracksParam]): Unit = js.native
  @JSName("on")
  def on_buffer(event: buffer, callback: EventCallback[BufferParam]): Unit = js.native
  @JSName("on")
  def on_bufferChange(event: bufferChange, callback: EventCallback[BufferChangeParam]): Unit = js.native
  @JSName("on")
  def on_captionsChanged(event: captionsChanged, callback: EventCallback[CaptionsChangedParam]): Unit = js.native
  @JSName("on")
  def on_captionsList(event: captionsList, callback: EventCallback[CaptionsListParam]): Unit = js.native
  @JSName("on")
  def on_cast(event: cast, callback: EventCallback[CastParam]): Unit = js.native
  @JSName("on")
  def on_controls(event: controls, callback: EventCallback[ControlsParam]): Unit = js.native
  @JSName("on")
  def on_error(event: error, callback: EventCallback[ErrorParam]): Unit = js.native
  @JSName("on")
  def on_firstFrame(event: firstFrame, callback: EventCallback[FirstFrameParam]): Unit = js.native
  @JSName("on")
  def on_fullscreen(event: fullscreen, callback: EventCallback[FullscreenParam]): Unit = js.native
  @JSName("on")
  def on_idle(event: idle, callback: EventCallback[IdleParam]): Unit = js.native
  @JSName("on")
  def on_levels(event: levels, callback: EventCallback[LevelsParam]): Unit = js.native
  @JSName("on")
  def on_levelsChanged(event: levelsChanged, callback: EventCallback[LevelsChangedParam]): Unit = js.native
  @JSName("on")
  def on_meta(event: meta, callback: EventCallback[MetadataParam]): Unit = js.native
  @JSName("on")
  def on_mute(event: mute, callback: EventCallback[MuteParam]): Unit = js.native
  @JSName("on")
  def on_pause(event: pause, callback: EventCallback[PlayParam]): Unit = js.native
  @JSName("on")
  def on_play(event: play, callback: EventCallback[PlayParam]): Unit = js.native
  @JSName("on")
  def on_playbackRateChanged(event: playbackRateChanged, callback: EventCallback[PlaybackRateChangedParam]): Unit = js.native
  @JSName("on")
  def on_playlist(event: playlist, callback: EventCallback[PlaylistParam]): Unit = js.native
  @JSName("on")
  def on_playlistItem(event: playlistItem, callback: EventCallback[PlaylistItemParam]): Unit = js.native
  @JSName("on")
  def on_ready(event: ready, callback: EventCallback[ReadyParam]): Unit = js.native
  @JSName("on")
  def on_resize(event: resize, callback: EventCallback[ResizeParam]): Unit = js.native
  @JSName("on")
  def on_seek(event: seek, callback: EventCallback[SeekParam]): Unit = js.native
  @JSName("on")
  def on_setupError(event: setupError, callback: EventCallback[ErrorParam]): Unit = js.native
  @JSName("on")
  def on_time(event: time, callback: EventCallback[TimeParam]): Unit = js.native
  @JSName("on")
  def on_visualQuality(event: visualQuality, callback: EventCallback[VisualQualityParam]): Unit = js.native
  @JSName("on")
  def on_volume(event: volume, callback: EventCallback[VolumeParam]): Unit = js.native
  
  def once(event: NoParamEvent, callback: js.Function0[Unit]): Unit = js.native
  @JSName("once")
  def once_adClick(event: adClick, callback: EventCallback[AdProgressParam]): Unit = js.native
  @JSName("once")
  def once_adCompanions(event: adCompanions, callback: EventCallback[AdCompanionsParam]): Unit = js.native
  @JSName("once")
  def once_adComplete(event: adComplete, callback: EventCallback[AdProgressParam]): Unit = js.native
  @JSName("once")
  def once_adError(event: adError, callback: EventCallback[AdErrorParam]): Unit = js.native
  @JSName("once")
  def once_adImpression(event: adImpression, callback: EventCallback[AdImpressionParam]): Unit = js.native
  @JSName("once")
  def once_adPause(event: adPause, callback: EventCallback[AdPlayParam]): Unit = js.native
  @JSName("once")
  def once_adPlay(event: adPlay, callback: EventCallback[AdPlayParam]): Unit = js.native
  @JSName("once")
  def once_adRequest(event: adRequest, callback: EventCallback[AdRequestParam]): Unit = js.native
  @JSName("once")
  def once_adSchedule(event: adSchedule, callback: EventCallback[AdScheduleParam]): Unit = js.native
  @JSName("once")
  def once_adSkipped(event: adSkipped, callback: EventCallback[AdProgressParam]): Unit = js.native
  @JSName("once")
  def once_adStarted(event: adStarted, callback: EventCallback[AdStartedParam]): Unit = js.native
  @JSName("once")
  def once_adTime(event: adTime, callback: EventCallback[AdTimeParam]): Unit = js.native
  @JSName("once")
  def once_audioTrackChanged(event: audioTrackChanged, callback: EventCallback[AudioTrackChangedParam]): Unit = js.native
  @JSName("once")
  def once_audioTracks(event: audioTracks, callback: EventCallback[AudioTracksParam]): Unit = js.native
  @JSName("once")
  def once_buffer(event: buffer, callback: EventCallback[BufferParam]): Unit = js.native
  @JSName("once")
  def once_bufferChange(event: bufferChange, callback: EventCallback[BufferChangeParam]): Unit = js.native
  @JSName("once")
  def once_captionsChanged(event: captionsChanged, callback: EventCallback[CaptionsChangedParam]): Unit = js.native
  @JSName("once")
  def once_captionsList(event: captionsList, callback: EventCallback[CaptionsListParam]): Unit = js.native
  @JSName("once")
  def once_cast(event: cast, callback: EventCallback[CastParam]): Unit = js.native
  @JSName("once")
  def once_controls(event: controls, callback: EventCallback[ControlsParam]): Unit = js.native
  @JSName("once")
  def once_error(event: error, callback: EventCallback[ErrorParam]): Unit = js.native
  @JSName("once")
  def once_firstFrame(event: firstFrame, callback: EventCallback[FirstFrameParam]): Unit = js.native
  @JSName("once")
  def once_fullscreen(event: fullscreen, callback: EventCallback[FullscreenParam]): Unit = js.native
  @JSName("once")
  def once_idle(event: idle, callback: EventCallback[IdleParam]): Unit = js.native
  @JSName("once")
  def once_levels(event: levels, callback: EventCallback[LevelsParam]): Unit = js.native
  @JSName("once")
  def once_levelsChanged(event: levelsChanged, callback: EventCallback[LevelsChangedParam]): Unit = js.native
  @JSName("once")
  def once_meta(event: meta, callback: EventCallback[MetadataParam]): Unit = js.native
  @JSName("once")
  def once_mute(event: mute, callback: EventCallback[MuteParam]): Unit = js.native
  @JSName("once")
  def once_pause(event: pause, callback: EventCallback[PlayParam]): Unit = js.native
  @JSName("once")
  def once_play(event: play, callback: EventCallback[PlayParam]): Unit = js.native
  @JSName("once")
  def once_playbackRateChanged(event: playbackRateChanged, callback: EventCallback[PlaybackRateChangedParam]): Unit = js.native
  @JSName("once")
  def once_playlist(event: playlist, callback: EventCallback[PlaylistParam]): Unit = js.native
  @JSName("once")
  def once_playlistItem(event: playlistItem, callback: EventCallback[PlaylistItemParam]): Unit = js.native
  @JSName("once")
  def once_ready(event: ready, callback: EventCallback[ReadyParam]): Unit = js.native
  @JSName("once")
  def once_resize(event: resize, callback: EventCallback[ResizeParam]): Unit = js.native
  @JSName("once")
  def once_seek(event: seek, callback: EventCallback[SeekParam]): Unit = js.native
  @JSName("once")
  def once_setupError(event: setupError, callback: EventCallback[ErrorParam]): Unit = js.native
  @JSName("once")
  def once_time(event: time, callback: EventCallback[TimeParam]): Unit = js.native
  @JSName("once")
  def once_visualQuality(event: visualQuality, callback: EventCallback[VisualQualityParam]): Unit = js.native
  @JSName("once")
  def once_volume(event: volume, callback: EventCallback[VolumeParam]): Unit = js.native
  
  def pause(): Unit = js.native
  def pause(state: Boolean): Unit = js.native
  
  def play(): Unit = js.native
  def play(state: Boolean): Unit = js.native
  
  def playAd(tag: String): Unit = js.native
  
  def playlistItem(index: Double): Unit = js.native
  
  def registerPlugin(id: String, target: String, jsPlugin: js.Function0[Unit]): Unit = js.native
  def registerPlugin(id: String, target: String, jsPlugin: js.Function0[Unit], swfURL: String): Unit = js.native
  
  def remove(): Unit = js.native
  
  def removeButton(id: String): Unit = js.native
  
  def resize(width: Double, height: Double): Unit = js.native
  
  def seek(position: Double): Unit = js.native
  
  def setCaptions(options: CaptionOptions): Unit = js.native
  
  def setControls(controls: Boolean): Unit = js.native
  
  def setCurrentAudioTrack(index: Double): Unit = js.native
  
  def setCurrentCaptions(index: Double): Unit = js.native
  
  def setCurrentQuality(index: Double): Unit = js.native
  
  def setFullscreen(state: Boolean): Unit = js.native
  
  def setMute(): Unit = js.native
  def setMute(state: Boolean): Unit = js.native
  
  def setPlaybackRate(rate: Double): Unit = js.native
  
  def setVolume(volume: Double): Unit = js.native
  
  def setup(options: js.Any): JWPlayer = js.native
  
  def stop(): Unit = js.native
  
  def trigger(event: NoParamEvent): Unit = js.native
  @JSName("trigger")
  def trigger_adClick(event: adClick, args: AdProgressParam): Unit = js.native
  @JSName("trigger")
  def trigger_adCompanions(event: adCompanions, args: AdCompanionsParam): Unit = js.native
  @JSName("trigger")
  def trigger_adComplete(event: adComplete, args: AdProgressParam): Unit = js.native
  @JSName("trigger")
  def trigger_adError(event: adError, args: AdErrorParam): Unit = js.native
  @JSName("trigger")
  def trigger_adImpression(event: adImpression, args: AdImpressionParam): Unit = js.native
  @JSName("trigger")
  def trigger_adPause(event: adPause, args: AdPlayParam): Unit = js.native
  @JSName("trigger")
  def trigger_adPlay(event: adPlay, args: AdPlayParam): Unit = js.native
  @JSName("trigger")
  def trigger_adRequest(event: adRequest, args: AdRequestParam): Unit = js.native
  @JSName("trigger")
  def trigger_adSchedule(event: adSchedule, args: AdScheduleParam): Unit = js.native
  @JSName("trigger")
  def trigger_adSkipped(event: adSkipped, args: AdProgressParam): Unit = js.native
  @JSName("trigger")
  def trigger_adStarted(event: adStarted, args: AdStartedParam): Unit = js.native
  @JSName("trigger")
  def trigger_adTime(event: adTime, args: AdTimeParam): Unit = js.native
  @JSName("trigger")
  def trigger_audioTrackChanged(event: audioTrackChanged, args: AudioTrackChangedParam): Unit = js.native
  @JSName("trigger")
  def trigger_audioTracks(event: audioTracks, args: AudioTracksParam): Unit = js.native
  @JSName("trigger")
  def trigger_buffer(event: buffer, args: BufferParam): Unit = js.native
  @JSName("trigger")
  def trigger_bufferChange(event: bufferChange, args: BufferChangeParam): Unit = js.native
  @JSName("trigger")
  def trigger_captionsChanged(event: captionsChanged, args: CaptionsChangedParam): Unit = js.native
  @JSName("trigger")
  def trigger_captionsList(event: captionsList, args: CaptionsListParam): Unit = js.native
  @JSName("trigger")
  def trigger_cast(event: cast, args: CastParam): Unit = js.native
  @JSName("trigger")
  def trigger_controls(event: controls, args: ControlsParam): Unit = js.native
  @JSName("trigger")
  def trigger_error(event: error, args: ErrorParam): Unit = js.native
  @JSName("trigger")
  def trigger_firstFrame(event: firstFrame, args: FirstFrameParam): Unit = js.native
  @JSName("trigger")
  def trigger_fullscreen(event: fullscreen, args: FullscreenParam): Unit = js.native
  @JSName("trigger")
  def trigger_idle(event: idle, args: IdleParam): Unit = js.native
  @JSName("trigger")
  def trigger_levels(event: levels, args: LevelsParam): Unit = js.native
  @JSName("trigger")
  def trigger_levelsChanged(event: levelsChanged, args: LevelsChangedParam): Unit = js.native
  @JSName("trigger")
  def trigger_meta(event: meta, args: MetadataParam): Unit = js.native
  @JSName("trigger")
  def trigger_mute(event: mute, args: MuteParam): Unit = js.native
  @JSName("trigger")
  def trigger_pause(event: pause, args: PlayParam): Unit = js.native
  @JSName("trigger")
  def trigger_play(event: play, args: PlayParam): Unit = js.native
  @JSName("trigger")
  def trigger_playbackRateChanged(event: playbackRateChanged, args: PlaybackRateChangedParam): Unit = js.native
  @JSName("trigger")
  def trigger_playlist(event: playlist, args: PlaylistParam): Unit = js.native
  @JSName("trigger")
  def trigger_playlistItem(event: playlistItem, args: PlaylistItemParam): Unit = js.native
  @JSName("trigger")
  def trigger_ready(event: ready, args: ReadyParam): Unit = js.native
  @JSName("trigger")
  def trigger_resize(event: resize, args: ResizeParam): Unit = js.native
  @JSName("trigger")
  def trigger_seek(event: seek, args: SeekParam): Unit = js.native
  @JSName("trigger")
  def trigger_setupError(event: setupError, args: ErrorParam): Unit = js.native
  @JSName("trigger")
  def trigger_time(event: time, args: TimeParam): Unit = js.native
  @JSName("trigger")
  def trigger_visualQuality(event: visualQuality, args: VisualQualityParam): Unit = js.native
  @JSName("trigger")
  def trigger_volume(event: volume, args: VolumeParam): Unit = js.native
}
