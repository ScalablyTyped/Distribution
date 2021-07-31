package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventParams extends StObject {
  
  var adClick: AdProgressParam
  
  var adCompanions: AdCompanionsParam
  
  var adComplete: AdProgressParam
  
  var adError: AdErrorParam
  
  var adImpression: AdImpressionParam
  
  var adPause: AdPlayParam
  
  var adPlay: AdPlayParam
  
  var adRequest: AdRequestParam
  
  var adSchedule: AdScheduleParam
  
  var adSkipped: AdProgressParam
  
  var adStarted: AdStartedParam
  
  var adTime: AdTimeParam
  
  var audioTrackChanged: AudioTrackChangedParam
  
  var audioTracks: AudioTracksParam
  
  var buffer: BufferParam
  
  var bufferChange: BufferChangeParam
  
  var captionsChanged: CaptionsChangedParam
  
  var captionsList: CaptionsListParam
  
  var cast: CastParam
  
  var controls: ControlsParam
  
  var error: ErrorParam
  
  var firstFrame: FirstFrameParam
  
  var fullscreen: FullscreenParam
  
  var idle: IdleParam
  
  var levels: LevelsParam
  
  var levelsChanged: LevelsChangedParam
  
  var meta: MetadataParam
  
  var mute: MuteParam
  
  var pause: PlayParam
  
  var play: PlayParam
  
  var playbackRateChanged: PlaybackRateChangedParam
  
  var playlist: PlaylistParam
  
  var playlistItem: PlaylistItemParam
  
  var ready: ReadyParam
  
  var resize: ResizeParam
  
  var seek: SeekParam
  
  var setupError: ErrorParam
  
  var time: TimeParam
  
  var visualQuality: VisualQualityParam
  
  var volume: VolumeParam
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
  implicit class EventParamsMutableBuilder[Self <: EventParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdClick(value: AdProgressParam): Self = StObject.set(x, "adClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdCompanions(value: AdCompanionsParam): Self = StObject.set(x, "adCompanions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdComplete(value: AdProgressParam): Self = StObject.set(x, "adComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdError(value: AdErrorParam): Self = StObject.set(x, "adError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdImpression(value: AdImpressionParam): Self = StObject.set(x, "adImpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdPause(value: AdPlayParam): Self = StObject.set(x, "adPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdPlay(value: AdPlayParam): Self = StObject.set(x, "adPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdRequest(value: AdRequestParam): Self = StObject.set(x, "adRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdSchedule(value: AdScheduleParam): Self = StObject.set(x, "adSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdSkipped(value: AdProgressParam): Self = StObject.set(x, "adSkipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdStarted(value: AdStartedParam): Self = StObject.set(x, "adStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdTime(value: AdTimeParam): Self = StObject.set(x, "adTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioTrackChanged(value: AudioTrackChangedParam): Self = StObject.set(x, "audioTrackChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioTracks(value: AudioTracksParam): Self = StObject.set(x, "audioTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer(value: BufferParam): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferChange(value: BufferChangeParam): Self = StObject.set(x, "bufferChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionsChanged(value: CaptionsChangedParam): Self = StObject.set(x, "captionsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionsList(value: CaptionsListParam): Self = StObject.set(x, "captionsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCast(value: CastParam): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControls(value: ControlsParam): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: ErrorParam): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstFrame(value: FirstFrameParam): Self = StObject.set(x, "firstFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreen(value: FullscreenParam): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdle(value: IdleParam): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevels(value: LevelsParam): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsChanged(value: LevelsChangedParam): Self = StObject.set(x, "levelsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: MetadataParam): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMute(value: MuteParam): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: PlayParam): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlay(value: PlayParam): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackRateChanged(value: PlaybackRateChangedParam): Self = StObject.set(x, "playbackRateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylist(value: PlaylistParam): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistItem(value: PlaylistItemParam): Self = StObject.set(x, "playlistItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: ReadyParam): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize(value: ResizeParam): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeek(value: SeekParam): Self = StObject.set(x, "seek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupError(value: ErrorParam): Self = StObject.set(x, "setupError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: TimeParam): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualQuality(value: VisualQualityParam): Self = StObject.set(x, "visualQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: VolumeParam): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
