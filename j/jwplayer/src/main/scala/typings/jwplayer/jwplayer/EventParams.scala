package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventParams extends js.Object {
  
  var adClick: AdProgressParam = js.native
  
  var adCompanions: AdCompanionsParam = js.native
  
  var adComplete: AdProgressParam = js.native
  
  var adError: AdErrorParam = js.native
  
  var adImpression: AdImpressionParam = js.native
  
  var adPause: AdPlayParam = js.native
  
  var adPlay: AdPlayParam = js.native
  
  var adRequest: AdRequestParam = js.native
  
  var adSchedule: AdScheduleParam = js.native
  
  var adSkipped: AdProgressParam = js.native
  
  var adStarted: AdStartedParam = js.native
  
  var adTime: AdTimeParam = js.native
  
  var audioTrackChanged: AudioTrackChangedParam = js.native
  
  var audioTracks: AudioTracksParam = js.native
  
  var buffer: BufferParam = js.native
  
  var bufferChange: BufferChangeParam = js.native
  
  var captionsChanged: CaptionsChangedParam = js.native
  
  var captionsList: CaptionsListParam = js.native
  
  var cast: CastParam = js.native
  
  var controls: ControlsParam = js.native
  
  var error: ErrorParam = js.native
  
  var firstFrame: FirstFrameParam = js.native
  
  var fullscreen: FullscreenParam = js.native
  
  var idle: IdleParam = js.native
  
  var levels: LevelsParam = js.native
  
  var levelsChanged: LevelsChangedParam = js.native
  
  var meta: MetadataParam = js.native
  
  var mute: MuteParam = js.native
  
  var pause: PlayParam = js.native
  
  var play: PlayParam = js.native
  
  var playbackRateChanged: PlaybackRateChangedParam = js.native
  
  var playlist: PlaylistParam = js.native
  
  var playlistItem: PlaylistItemParam = js.native
  
  var ready: ReadyParam = js.native
  
  var resize: ResizeParam = js.native
  
  var seek: SeekParam = js.native
  
  var setupError: ErrorParam = js.native
  
  var time: TimeParam = js.native
  
  var visualQuality: VisualQualityParam = js.native
  
  var volume: VolumeParam = js.native
}
object EventParams {
  
  @scala.inline
  def apply(
    adClick: AdProgressParam,
    adCompanions: AdCompanionsParam,
    adComplete: AdProgressParam,
    adError: AdErrorParam,
    adImpression: AdImpressionParam,
    adPause: AdPlayParam,
    adPlay: AdPlayParam,
    adRequest: AdRequestParam,
    adSchedule: AdScheduleParam,
    adSkipped: AdProgressParam,
    adStarted: AdStartedParam,
    adTime: AdTimeParam,
    audioTrackChanged: AudioTrackChangedParam,
    audioTracks: AudioTracksParam,
    buffer: BufferParam,
    bufferChange: BufferChangeParam,
    captionsChanged: CaptionsChangedParam,
    captionsList: CaptionsListParam,
    cast: CastParam,
    controls: ControlsParam,
    error: ErrorParam,
    firstFrame: FirstFrameParam,
    fullscreen: FullscreenParam,
    idle: IdleParam,
    levels: LevelsParam,
    levelsChanged: LevelsChangedParam,
    meta: MetadataParam,
    mute: MuteParam,
    pause: PlayParam,
    play: PlayParam,
    playbackRateChanged: PlaybackRateChangedParam,
    playlist: PlaylistParam,
    playlistItem: PlaylistItemParam,
    ready: ReadyParam,
    resize: ResizeParam,
    seek: SeekParam,
    setupError: ErrorParam,
    time: TimeParam,
    visualQuality: VisualQualityParam,
    volume: VolumeParam
  ): EventParams = {
    val __obj = js.Dynamic.literal(adClick = adClick.asInstanceOf[js.Any], adCompanions = adCompanions.asInstanceOf[js.Any], adComplete = adComplete.asInstanceOf[js.Any], adError = adError.asInstanceOf[js.Any], adImpression = adImpression.asInstanceOf[js.Any], adPause = adPause.asInstanceOf[js.Any], adPlay = adPlay.asInstanceOf[js.Any], adRequest = adRequest.asInstanceOf[js.Any], adSchedule = adSchedule.asInstanceOf[js.Any], adSkipped = adSkipped.asInstanceOf[js.Any], adStarted = adStarted.asInstanceOf[js.Any], adTime = adTime.asInstanceOf[js.Any], audioTrackChanged = audioTrackChanged.asInstanceOf[js.Any], audioTracks = audioTracks.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], bufferChange = bufferChange.asInstanceOf[js.Any], captionsChanged = captionsChanged.asInstanceOf[js.Any], captionsList = captionsList.asInstanceOf[js.Any], cast = cast.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], firstFrame = firstFrame.asInstanceOf[js.Any], fullscreen = fullscreen.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], levelsChanged = levelsChanged.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playbackRateChanged = playbackRateChanged.asInstanceOf[js.Any], playlist = playlist.asInstanceOf[js.Any], playlistItem = playlistItem.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], seek = seek.asInstanceOf[js.Any], setupError = setupError.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], visualQuality = visualQuality.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventParams]
  }
  
  @scala.inline
  implicit class EventParamsOps[Self <: EventParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdClick(value: AdProgressParam): Self = this.set("adClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdCompanions(value: AdCompanionsParam): Self = this.set("adCompanions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdComplete(value: AdProgressParam): Self = this.set("adComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdError(value: AdErrorParam): Self = this.set("adError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdImpression(value: AdImpressionParam): Self = this.set("adImpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdPause(value: AdPlayParam): Self = this.set("adPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdPlay(value: AdPlayParam): Self = this.set("adPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdRequest(value: AdRequestParam): Self = this.set("adRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdSchedule(value: AdScheduleParam): Self = this.set("adSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdSkipped(value: AdProgressParam): Self = this.set("adSkipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdStarted(value: AdStartedParam): Self = this.set("adStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdTime(value: AdTimeParam): Self = this.set("adTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioTrackChanged(value: AudioTrackChangedParam): Self = this.set("audioTrackChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioTracks(value: AudioTracksParam): Self = this.set("audioTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer(value: BufferParam): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferChange(value: BufferChangeParam): Self = this.set("bufferChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionsChanged(value: CaptionsChangedParam): Self = this.set("captionsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionsList(value: CaptionsListParam): Self = this.set("captionsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCast(value: CastParam): Self = this.set("cast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControls(value: ControlsParam): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: ErrorParam): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstFrame(value: FirstFrameParam): Self = this.set("firstFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreen(value: FullscreenParam): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdle(value: IdleParam): Self = this.set("idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevels(value: LevelsParam): Self = this.set("levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsChanged(value: LevelsChangedParam): Self = this.set("levelsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: MetadataParam): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMute(value: MuteParam): Self = this.set("mute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: PlayParam): Self = this.set("pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlay(value: PlayParam): Self = this.set("play", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackRateChanged(value: PlaybackRateChangedParam): Self = this.set("playbackRateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylist(value: PlaylistParam): Self = this.set("playlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistItem(value: PlaylistItemParam): Self = this.set("playlistItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: ReadyParam): Self = this.set("ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize(value: ResizeParam): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeek(value: SeekParam): Self = this.set("seek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupError(value: ErrorParam): Self = this.set("setupError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: TimeParam): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualQuality(value: VisualQualityParam): Self = this.set("visualQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: VolumeParam): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
}
