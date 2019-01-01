package typings
package jwplayerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWPlayer extends js.Object {
  def addButton(
    icon: java.lang.String,
    label: java.lang.String,
    handler: js.Function0[scala.Unit],
    id: java.lang.String
  ): scala.Unit = js.native
  def getAudioTracks(): js.Array[_] = js.native
  def getBuffer(): scala.Double = js.native
  def getCaptionsList(): js.Array[_] = js.native
  def getContainer(): stdLib.HTMLElement = js.native
  def getControls(): scala.Boolean = js.native
  def getCurrentAudioTrack(): scala.Double = js.native
  def getCurrentCaptions(): scala.Double = js.native
  def getCurrentQuality(): scala.Double = js.native
  def getDuration(): scala.Double = js.native
  def getEnvironment(): Environment = js.native
  def getFullscreen(): scala.Boolean = js.native
  def getHeight(): scala.Double = js.native
  def getMute(): scala.Boolean = js.native
  def getPlaylist(): js.Array[_] = js.native
  def getPlaylistIndex(): scala.Double = js.native
  def getPlaylistItem(): js.Any = js.native
  def getPlaylistItem(index: scala.Double): js.Any = js.native
  def getPosition(): scala.Double = js.native
  def getQualityLevels(): js.Array[_] = js.native
  def getRenderingMode(): java.lang.String = js.native
  def getSafeRegion(): Region = js.native
  def getState(): java.lang.String = js.native
  def getVisualQuality(): js.UndefOr[QualityLevel] = js.native
  def getVolume(): scala.Double = js.native
  def getWidth(): scala.Double = js.native
  def load(playlist: java.lang.String): scala.Unit = js.native
  def load(playlist: js.Array[_]): scala.Unit = js.native
  @JSName("off")
  def off_adBlock(event: jwplayerLib.jwplayerLibStrings.adBlock): scala.Unit = js.native
  @JSName("off")
  def off_adClick(event: jwplayerLib.jwplayerLibStrings.adClick): scala.Unit = js.native
  @JSName("off")
  def off_adCompanions(event: jwplayerLib.jwplayerLibStrings.adCompanions): scala.Unit = js.native
  @JSName("off")
  def off_adComplete(event: jwplayerLib.jwplayerLibStrings.adComplete): scala.Unit = js.native
  @JSName("off")
  def off_adError(event: jwplayerLib.jwplayerLibStrings.adError): scala.Unit = js.native
  @JSName("off")
  def off_adImpression(event: jwplayerLib.jwplayerLibStrings.adImpression): scala.Unit = js.native
  @JSName("off")
  def off_adPause(event: jwplayerLib.jwplayerLibStrings.adPause): scala.Unit = js.native
  @JSName("off")
  def off_adPlay(event: jwplayerLib.jwplayerLibStrings.adPlay): scala.Unit = js.native
  @JSName("off")
  def off_adRequest(event: jwplayerLib.jwplayerLibStrings.adRequest): scala.Unit = js.native
  @JSName("off")
  def off_adSchedule(event: jwplayerLib.jwplayerLibStrings.adSchedule): scala.Unit = js.native
  @JSName("off")
  def off_adSkipped(event: jwplayerLib.jwplayerLibStrings.adSkipped): scala.Unit = js.native
  @JSName("off")
  def off_adStarted(event: jwplayerLib.jwplayerLibStrings.adStarted): scala.Unit = js.native
  @JSName("off")
  def off_adTime(event: jwplayerLib.jwplayerLibStrings.adTime): scala.Unit = js.native
  @JSName("off")
  def off_audioTrackChanged(event: jwplayerLib.jwplayerLibStrings.audioTrackChanged): scala.Unit = js.native
  @JSName("off")
  def off_audioTracks(event: jwplayerLib.jwplayerLibStrings.audioTracks): scala.Unit = js.native
  @JSName("off")
  def off_beforeComplete(event: jwplayerLib.jwplayerLibStrings.beforeComplete): scala.Unit = js.native
  @JSName("off")
  def off_beforePlay(event: jwplayerLib.jwplayerLibStrings.beforePlay): scala.Unit = js.native
  @JSName("off")
  def off_buffer(event: jwplayerLib.jwplayerLibStrings.buffer): scala.Unit = js.native
  @JSName("off")
  def off_bufferChange(event: jwplayerLib.jwplayerLibStrings.bufferChange): scala.Unit = js.native
  @JSName("off")
  def off_captionsChanged(event: jwplayerLib.jwplayerLibStrings.captionsChanged): scala.Unit = js.native
  @JSName("off")
  def off_captionsList(event: jwplayerLib.jwplayerLibStrings.captionsList): scala.Unit = js.native
  @JSName("off")
  def off_complete(event: jwplayerLib.jwplayerLibStrings.complete): scala.Unit = js.native
  @JSName("off")
  def off_controls(event: jwplayerLib.jwplayerLibStrings.controls): scala.Unit = js.native
  @JSName("off")
  def off_displayClick(event: jwplayerLib.jwplayerLibStrings.displayClick): scala.Unit = js.native
  @JSName("off")
  def off_error(event: jwplayerLib.jwplayerLibStrings.error): scala.Unit = js.native
  @JSName("off")
  def off_firstFrame(event: jwplayerLib.jwplayerLibStrings.firstFrame): scala.Unit = js.native
  @JSName("off")
  def off_fullscreen(event: jwplayerLib.jwplayerLibStrings.fullscreen): scala.Unit = js.native
  @JSName("off")
  def off_idle(event: jwplayerLib.jwplayerLibStrings.idle): scala.Unit = js.native
  @JSName("off")
  def off_levels(event: jwplayerLib.jwplayerLibStrings.levels): scala.Unit = js.native
  @JSName("off")
  def off_levelsChanged(event: jwplayerLib.jwplayerLibStrings.levelsChanged): scala.Unit = js.native
  @JSName("off")
  def off_meta(event: jwplayerLib.jwplayerLibStrings.meta): scala.Unit = js.native
  @JSName("off")
  def off_mute(event: jwplayerLib.jwplayerLibStrings.mute): scala.Unit = js.native
  @JSName("off")
  def off_pause(event: jwplayerLib.jwplayerLibStrings.pause): scala.Unit = js.native
  @JSName("off")
  def off_play(event: jwplayerLib.jwplayerLibStrings.play): scala.Unit = js.native
  @JSName("off")
  def off_playlist(event: jwplayerLib.jwplayerLibStrings.playlist): scala.Unit = js.native
  @JSName("off")
  def off_playlistComplete(event: jwplayerLib.jwplayerLibStrings.playlistComplete): scala.Unit = js.native
  @JSName("off")
  def off_playlistItem(event: jwplayerLib.jwplayerLibStrings.playlistItem): scala.Unit = js.native
  @JSName("off")
  def off_ready(event: jwplayerLib.jwplayerLibStrings.ready): scala.Unit = js.native
  @JSName("off")
  def off_remove(event: jwplayerLib.jwplayerLibStrings.remove): scala.Unit = js.native
  @JSName("off")
  def off_resize(event: jwplayerLib.jwplayerLibStrings.resize): scala.Unit = js.native
  @JSName("off")
  def off_seek(event: jwplayerLib.jwplayerLibStrings.seek): scala.Unit = js.native
  @JSName("off")
  def off_seeked(event: jwplayerLib.jwplayerLibStrings.seeked): scala.Unit = js.native
  @JSName("off")
  def off_setupError(event: jwplayerLib.jwplayerLibStrings.setupError): scala.Unit = js.native
  @JSName("off")
  def off_time(event: jwplayerLib.jwplayerLibStrings.time): scala.Unit = js.native
  @JSName("off")
  def off_visualQuality(event: jwplayerLib.jwplayerLibStrings.visualQuality): scala.Unit = js.native
  @JSName("off")
  def off_volume(event: jwplayerLib.jwplayerLibStrings.volume): scala.Unit = js.native
  @JSName("on")
  def on_adBlock(event: jwplayerLib.jwplayerLibStrings.adBlock, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_adClick(event: jwplayerLib.jwplayerLibStrings.adClick, callback: EventCallback[AdProgressParam]): scala.Unit = js.native
  @JSName("on")
  def on_adCompanions(event: jwplayerLib.jwplayerLibStrings.adCompanions, callback: EventCallback[AdCompanionsParam]): scala.Unit = js.native
  @JSName("on")
  def on_adComplete(event: jwplayerLib.jwplayerLibStrings.adComplete, callback: EventCallback[AdProgressParam]): scala.Unit = js.native
  @JSName("on")
  def on_adError(event: jwplayerLib.jwplayerLibStrings.adError, callback: EventCallback[AdErrorParam]): scala.Unit = js.native
  @JSName("on")
  def on_adImpression(event: jwplayerLib.jwplayerLibStrings.adImpression, callback: EventCallback[AdImpressionParam]): scala.Unit = js.native
  @JSName("on")
  def on_adPause(event: jwplayerLib.jwplayerLibStrings.adPause, callback: EventCallback[AdPlayParam]): scala.Unit = js.native
  @JSName("on")
  def on_adPlay(event: jwplayerLib.jwplayerLibStrings.adPlay, callback: EventCallback[AdPlayParam]): scala.Unit = js.native
  @JSName("on")
  def on_adRequest(event: jwplayerLib.jwplayerLibStrings.adRequest, callback: EventCallback[AdRequestParam]): scala.Unit = js.native
  @JSName("on")
  def on_adSchedule(event: jwplayerLib.jwplayerLibStrings.adSchedule, callback: EventCallback[AdScheduleParam]): scala.Unit = js.native
  @JSName("on")
  def on_adSkipped(event: jwplayerLib.jwplayerLibStrings.adSkipped, callback: EventCallback[AdProgressParam]): scala.Unit = js.native
  @JSName("on")
  def on_adStarted(event: jwplayerLib.jwplayerLibStrings.adStarted, callback: EventCallback[AdStartedParam]): scala.Unit = js.native
  @JSName("on")
  def on_adTime(event: jwplayerLib.jwplayerLibStrings.adTime, callback: EventCallback[AdTimeParam]): scala.Unit = js.native
  @JSName("on")
  def on_audioTrackChanged(
    event: jwplayerLib.jwplayerLibStrings.audioTrackChanged,
    callback: EventCallback[AudioTrackChangedParam]
  ): scala.Unit = js.native
  @JSName("on")
  def on_audioTracks(event: jwplayerLib.jwplayerLibStrings.audioTracks, callback: EventCallback[AudioTracksParam]): scala.Unit = js.native
  @JSName("on")
  def on_beforeComplete(event: jwplayerLib.jwplayerLibStrings.beforeComplete, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_beforePlay(event: jwplayerLib.jwplayerLibStrings.beforePlay, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_buffer(event: jwplayerLib.jwplayerLibStrings.buffer, callback: EventCallback[BufferParam]): scala.Unit = js.native
  @JSName("on")
  def on_bufferChange(event: jwplayerLib.jwplayerLibStrings.bufferChange, callback: EventCallback[BufferChangeParam]): scala.Unit = js.native
  @JSName("on")
  def on_captionsChanged(
    event: jwplayerLib.jwplayerLibStrings.captionsChanged,
    callback: EventCallback[CaptionsChangedParam]
  ): scala.Unit = js.native
  @JSName("on")
  def on_captionsList(event: jwplayerLib.jwplayerLibStrings.captionsList, callback: EventCallback[CaptionsListParam]): scala.Unit = js.native
  @JSName("on")
  def on_complete(event: jwplayerLib.jwplayerLibStrings.complete, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_controls(event: jwplayerLib.jwplayerLibStrings.controls, callback: EventCallback[ControlsParam]): scala.Unit = js.native
  @JSName("on")
  def on_displayClick(event: jwplayerLib.jwplayerLibStrings.displayClick, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_error(event: jwplayerLib.jwplayerLibStrings.error, callback: EventCallback[ErrorParam]): scala.Unit = js.native
  @JSName("on")
  def on_firstFrame(event: jwplayerLib.jwplayerLibStrings.firstFrame, callback: EventCallback[FirstFrameParam]): scala.Unit = js.native
  @JSName("on")
  def on_fullscreen(event: jwplayerLib.jwplayerLibStrings.fullscreen, callback: EventCallback[FullscreenParam]): scala.Unit = js.native
  @JSName("on")
  def on_idle(event: jwplayerLib.jwplayerLibStrings.idle, callback: EventCallback[IdleParam]): scala.Unit = js.native
  @JSName("on")
  def on_levels(event: jwplayerLib.jwplayerLibStrings.levels, callback: EventCallback[LevelsParam]): scala.Unit = js.native
  @JSName("on")
  def on_levelsChanged(event: jwplayerLib.jwplayerLibStrings.levelsChanged, callback: EventCallback[LevelsChangedParam]): scala.Unit = js.native
  @JSName("on")
  def on_meta(event: jwplayerLib.jwplayerLibStrings.meta, callback: EventCallback[MetadataParam]): scala.Unit = js.native
  @JSName("on")
  def on_mute(event: jwplayerLib.jwplayerLibStrings.mute, callback: EventCallback[MuteParam]): scala.Unit = js.native
  @JSName("on")
  def on_pause(event: jwplayerLib.jwplayerLibStrings.pause, callback: EventCallback[PlayParam]): scala.Unit = js.native
  @JSName("on")
  def on_play(event: jwplayerLib.jwplayerLibStrings.play, callback: EventCallback[PlayParam]): scala.Unit = js.native
  @JSName("on")
  def on_playlist(event: jwplayerLib.jwplayerLibStrings.playlist, callback: EventCallback[PlaylistParam]): scala.Unit = js.native
  @JSName("on")
  def on_playlistComplete(event: jwplayerLib.jwplayerLibStrings.playlistComplete, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_playlistItem(event: jwplayerLib.jwplayerLibStrings.playlistItem, callback: EventCallback[PlaylistItemParam]): scala.Unit = js.native
  @JSName("on")
  def on_ready(event: jwplayerLib.jwplayerLibStrings.ready, callback: EventCallback[ReadyParam]): scala.Unit = js.native
  @JSName("on")
  def on_remove(event: jwplayerLib.jwplayerLibStrings.remove, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_resize(event: jwplayerLib.jwplayerLibStrings.resize, callback: EventCallback[ResizeParam]): scala.Unit = js.native
  @JSName("on")
  def on_seek(event: jwplayerLib.jwplayerLibStrings.seek, callback: EventCallback[SeekParam]): scala.Unit = js.native
  @JSName("on")
  def on_seeked(event: jwplayerLib.jwplayerLibStrings.seeked, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_setupError(event: jwplayerLib.jwplayerLibStrings.setupError, callback: EventCallback[ErrorParam]): scala.Unit = js.native
  @JSName("on")
  def on_time(event: jwplayerLib.jwplayerLibStrings.time, callback: EventCallback[TimeParam]): scala.Unit = js.native
  @JSName("on")
  def on_visualQuality(event: jwplayerLib.jwplayerLibStrings.visualQuality, callback: EventCallback[VisualQualityParam]): scala.Unit = js.native
  @JSName("on")
  def on_volume(event: jwplayerLib.jwplayerLibStrings.volume, callback: EventCallback[VolumeParam]): scala.Unit = js.native
  @JSName("once")
  def once_adBlock(event: jwplayerLib.jwplayerLibStrings.adBlock, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("once")
  def once_adClick(event: jwplayerLib.jwplayerLibStrings.adClick, callback: EventCallback[AdProgressParam]): scala.Unit = js.native
  @JSName("once")
  def once_adCompanions(event: jwplayerLib.jwplayerLibStrings.adCompanions, callback: EventCallback[AdCompanionsParam]): scala.Unit = js.native
  @JSName("once")
  def once_adComplete(event: jwplayerLib.jwplayerLibStrings.adComplete, callback: EventCallback[AdProgressParam]): scala.Unit = js.native
  @JSName("once")
  def once_adError(event: jwplayerLib.jwplayerLibStrings.adError, callback: EventCallback[AdErrorParam]): scala.Unit = js.native
  @JSName("once")
  def once_adImpression(event: jwplayerLib.jwplayerLibStrings.adImpression, callback: EventCallback[AdImpressionParam]): scala.Unit = js.native
  @JSName("once")
  def once_adPause(event: jwplayerLib.jwplayerLibStrings.adPause, callback: EventCallback[AdPlayParam]): scala.Unit = js.native
  @JSName("once")
  def once_adPlay(event: jwplayerLib.jwplayerLibStrings.adPlay, callback: EventCallback[AdPlayParam]): scala.Unit = js.native
  @JSName("once")
  def once_adRequest(event: jwplayerLib.jwplayerLibStrings.adRequest, callback: EventCallback[AdRequestParam]): scala.Unit = js.native
  @JSName("once")
  def once_adSchedule(event: jwplayerLib.jwplayerLibStrings.adSchedule, callback: EventCallback[AdScheduleParam]): scala.Unit = js.native
  @JSName("once")
  def once_adSkipped(event: jwplayerLib.jwplayerLibStrings.adSkipped, callback: EventCallback[AdProgressParam]): scala.Unit = js.native
  @JSName("once")
  def once_adStarted(event: jwplayerLib.jwplayerLibStrings.adStarted, callback: EventCallback[AdStartedParam]): scala.Unit = js.native
  @JSName("once")
  def once_adTime(event: jwplayerLib.jwplayerLibStrings.adTime, callback: EventCallback[AdTimeParam]): scala.Unit = js.native
  @JSName("once")
  def once_audioTrackChanged(
    event: jwplayerLib.jwplayerLibStrings.audioTrackChanged,
    callback: EventCallback[AudioTrackChangedParam]
  ): scala.Unit = js.native
  @JSName("once")
  def once_audioTracks(event: jwplayerLib.jwplayerLibStrings.audioTracks, callback: EventCallback[AudioTracksParam]): scala.Unit = js.native
  @JSName("once")
  def once_beforeComplete(event: jwplayerLib.jwplayerLibStrings.beforeComplete, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("once")
  def once_beforePlay(event: jwplayerLib.jwplayerLibStrings.beforePlay, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("once")
  def once_buffer(event: jwplayerLib.jwplayerLibStrings.buffer, callback: EventCallback[BufferParam]): scala.Unit = js.native
  @JSName("once")
  def once_bufferChange(event: jwplayerLib.jwplayerLibStrings.bufferChange, callback: EventCallback[BufferChangeParam]): scala.Unit = js.native
  @JSName("once")
  def once_captionsChanged(
    event: jwplayerLib.jwplayerLibStrings.captionsChanged,
    callback: EventCallback[CaptionsChangedParam]
  ): scala.Unit = js.native
  @JSName("once")
  def once_captionsList(event: jwplayerLib.jwplayerLibStrings.captionsList, callback: EventCallback[CaptionsListParam]): scala.Unit = js.native
  @JSName("once")
  def once_complete(event: jwplayerLib.jwplayerLibStrings.complete, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("once")
  def once_controls(event: jwplayerLib.jwplayerLibStrings.controls, callback: EventCallback[ControlsParam]): scala.Unit = js.native
  @JSName("once")
  def once_displayClick(event: jwplayerLib.jwplayerLibStrings.displayClick, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("once")
  def once_error(event: jwplayerLib.jwplayerLibStrings.error, callback: EventCallback[ErrorParam]): scala.Unit = js.native
  @JSName("once")
  def once_firstFrame(event: jwplayerLib.jwplayerLibStrings.firstFrame, callback: EventCallback[FirstFrameParam]): scala.Unit = js.native
  @JSName("once")
  def once_fullscreen(event: jwplayerLib.jwplayerLibStrings.fullscreen, callback: EventCallback[FullscreenParam]): scala.Unit = js.native
  @JSName("once")
  def once_idle(event: jwplayerLib.jwplayerLibStrings.idle, callback: EventCallback[IdleParam]): scala.Unit = js.native
  @JSName("once")
  def once_levels(event: jwplayerLib.jwplayerLibStrings.levels, callback: EventCallback[LevelsParam]): scala.Unit = js.native
  @JSName("once")
  def once_levelsChanged(event: jwplayerLib.jwplayerLibStrings.levelsChanged, callback: EventCallback[LevelsChangedParam]): scala.Unit = js.native
  @JSName("once")
  def once_meta(event: jwplayerLib.jwplayerLibStrings.meta, callback: EventCallback[MetadataParam]): scala.Unit = js.native
  @JSName("once")
  def once_mute(event: jwplayerLib.jwplayerLibStrings.mute, callback: EventCallback[MuteParam]): scala.Unit = js.native
  @JSName("once")
  def once_pause(event: jwplayerLib.jwplayerLibStrings.pause, callback: EventCallback[PlayParam]): scala.Unit = js.native
  @JSName("once")
  def once_play(event: jwplayerLib.jwplayerLibStrings.play, callback: EventCallback[PlayParam]): scala.Unit = js.native
  @JSName("once")
  def once_playlist(event: jwplayerLib.jwplayerLibStrings.playlist, callback: EventCallback[PlaylistParam]): scala.Unit = js.native
  @JSName("once")
  def once_playlistComplete(event: jwplayerLib.jwplayerLibStrings.playlistComplete, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("once")
  def once_playlistItem(event: jwplayerLib.jwplayerLibStrings.playlistItem, callback: EventCallback[PlaylistItemParam]): scala.Unit = js.native
  @JSName("once")
  def once_ready(event: jwplayerLib.jwplayerLibStrings.ready, callback: EventCallback[ReadyParam]): scala.Unit = js.native
  @JSName("once")
  def once_remove(event: jwplayerLib.jwplayerLibStrings.remove, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("once")
  def once_resize(event: jwplayerLib.jwplayerLibStrings.resize, callback: EventCallback[ResizeParam]): scala.Unit = js.native
  @JSName("once")
  def once_seek(event: jwplayerLib.jwplayerLibStrings.seek, callback: EventCallback[SeekParam]): scala.Unit = js.native
  @JSName("once")
  def once_seeked(event: jwplayerLib.jwplayerLibStrings.seeked, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("once")
  def once_setupError(event: jwplayerLib.jwplayerLibStrings.setupError, callback: EventCallback[ErrorParam]): scala.Unit = js.native
  @JSName("once")
  def once_time(event: jwplayerLib.jwplayerLibStrings.time, callback: EventCallback[TimeParam]): scala.Unit = js.native
  @JSName("once")
  def once_visualQuality(event: jwplayerLib.jwplayerLibStrings.visualQuality, callback: EventCallback[VisualQualityParam]): scala.Unit = js.native
  @JSName("once")
  def once_volume(event: jwplayerLib.jwplayerLibStrings.volume, callback: EventCallback[VolumeParam]): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def pause(state: scala.Boolean): scala.Unit = js.native
  def play(): scala.Unit = js.native
  def play(state: scala.Boolean): scala.Unit = js.native
  def playAd(tag: java.lang.String): scala.Unit = js.native
  def playlistItem(index: scala.Double): scala.Unit = js.native
  def registerPlugin(id: java.lang.String, target: java.lang.String, jsPlugin: js.Function0[scala.Unit]): scala.Unit = js.native
  def registerPlugin(
    id: java.lang.String,
    target: java.lang.String,
    jsPlugin: js.Function0[scala.Unit],
    swfURL: java.lang.String
  ): scala.Unit = js.native
  def remove(): scala.Unit = js.native
  def removeButton(id: java.lang.String): scala.Unit = js.native
  def resize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def seek(position: scala.Double): scala.Unit = js.native
  def setCaptions(options: CaptionOptions): scala.Unit = js.native
  def setControls(controls: scala.Boolean): scala.Unit = js.native
  def setCurrentAudioTrack(index: scala.Double): scala.Unit = js.native
  def setCurrentCaptions(index: scala.Double): scala.Unit = js.native
  def setCurrentQuality(index: scala.Double): scala.Unit = js.native
  def setFullscreen(state: scala.Boolean): scala.Unit = js.native
  def setMute(): scala.Unit = js.native
  def setMute(state: scala.Boolean): scala.Unit = js.native
  def setVolume(volume: scala.Double): scala.Unit = js.native
  def setup(options: js.Any): JWPlayer = js.native
  def stop(): scala.Unit = js.native
  @JSName("trigger")
  def trigger_adBlock(event: jwplayerLib.jwplayerLibStrings.adBlock): scala.Unit = js.native
  @JSName("trigger")
  def trigger_adClick(event: jwplayerLib.jwplayerLibStrings.adClick, args: AdProgressParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_adCompanions(event: jwplayerLib.jwplayerLibStrings.adCompanions, args: AdCompanionsParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_adComplete(event: jwplayerLib.jwplayerLibStrings.adComplete, args: AdProgressParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_adError(event: jwplayerLib.jwplayerLibStrings.adError, args: AdErrorParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_adImpression(event: jwplayerLib.jwplayerLibStrings.adImpression, args: AdImpressionParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_adPause(event: jwplayerLib.jwplayerLibStrings.adPause, args: AdPlayParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_adPlay(event: jwplayerLib.jwplayerLibStrings.adPlay, args: AdPlayParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_adRequest(event: jwplayerLib.jwplayerLibStrings.adRequest, args: AdRequestParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_adSchedule(event: jwplayerLib.jwplayerLibStrings.adSchedule, args: AdScheduleParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_adSkipped(event: jwplayerLib.jwplayerLibStrings.adSkipped, args: AdProgressParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_adStarted(event: jwplayerLib.jwplayerLibStrings.adStarted, args: AdStartedParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_adTime(event: jwplayerLib.jwplayerLibStrings.adTime, args: AdTimeParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_audioTrackChanged(event: jwplayerLib.jwplayerLibStrings.audioTrackChanged, args: AudioTrackChangedParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_audioTracks(event: jwplayerLib.jwplayerLibStrings.audioTracks, args: AudioTracksParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_beforeComplete(event: jwplayerLib.jwplayerLibStrings.beforeComplete): scala.Unit = js.native
  @JSName("trigger")
  def trigger_beforePlay(event: jwplayerLib.jwplayerLibStrings.beforePlay): scala.Unit = js.native
  @JSName("trigger")
  def trigger_buffer(event: jwplayerLib.jwplayerLibStrings.buffer, args: BufferParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_bufferChange(event: jwplayerLib.jwplayerLibStrings.bufferChange, args: BufferChangeParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_captionsChanged(event: jwplayerLib.jwplayerLibStrings.captionsChanged, args: CaptionsChangedParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_captionsList(event: jwplayerLib.jwplayerLibStrings.captionsList, args: CaptionsListParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_complete(event: jwplayerLib.jwplayerLibStrings.complete): scala.Unit = js.native
  @JSName("trigger")
  def trigger_controls(event: jwplayerLib.jwplayerLibStrings.controls, args: ControlsParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_displayClick(event: jwplayerLib.jwplayerLibStrings.displayClick): scala.Unit = js.native
  @JSName("trigger")
  def trigger_error(event: jwplayerLib.jwplayerLibStrings.error, args: ErrorParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_firstFrame(event: jwplayerLib.jwplayerLibStrings.firstFrame, args: FirstFrameParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_fullscreen(event: jwplayerLib.jwplayerLibStrings.fullscreen, args: FullscreenParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_idle(event: jwplayerLib.jwplayerLibStrings.idle, args: IdleParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_levels(event: jwplayerLib.jwplayerLibStrings.levels, args: LevelsParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_levelsChanged(event: jwplayerLib.jwplayerLibStrings.levelsChanged, args: LevelsChangedParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_meta(event: jwplayerLib.jwplayerLibStrings.meta, args: MetadataParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_mute(event: jwplayerLib.jwplayerLibStrings.mute, args: MuteParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_pause(event: jwplayerLib.jwplayerLibStrings.pause, args: PlayParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_play(event: jwplayerLib.jwplayerLibStrings.play, args: PlayParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_playlist(event: jwplayerLib.jwplayerLibStrings.playlist, args: PlaylistParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_playlistComplete(event: jwplayerLib.jwplayerLibStrings.playlistComplete): scala.Unit = js.native
  @JSName("trigger")
  def trigger_playlistItem(event: jwplayerLib.jwplayerLibStrings.playlistItem, args: PlaylistItemParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_ready(event: jwplayerLib.jwplayerLibStrings.ready): scala.Unit = js.native
  @JSName("trigger")
  def trigger_remove(event: jwplayerLib.jwplayerLibStrings.remove): scala.Unit = js.native
  @JSName("trigger")
  def trigger_resize(event: jwplayerLib.jwplayerLibStrings.resize, args: ResizeParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_seek(event: jwplayerLib.jwplayerLibStrings.seek, args: SeekParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_seeked(event: jwplayerLib.jwplayerLibStrings.seeked): scala.Unit = js.native
  @JSName("trigger")
  def trigger_setupError(event: jwplayerLib.jwplayerLibStrings.setupError, args: ErrorParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_time(event: jwplayerLib.jwplayerLibStrings.time, args: TimeParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_visualQuality(event: jwplayerLib.jwplayerLibStrings.visualQuality, args: VisualQualityParam): scala.Unit = js.native
  @JSName("trigger")
  def trigger_volume(event: jwplayerLib.jwplayerLibStrings.volume, args: VolumeParam): scala.Unit = js.native
}

