package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventParams extends js.Object {
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
    val __obj = js.Dynamic.literal(adClick = adClick.asInstanceOf[js.Any], adCompanions = adCompanions.asInstanceOf[js.Any], adComplete = adComplete.asInstanceOf[js.Any], adError = adError.asInstanceOf[js.Any], adImpression = adImpression.asInstanceOf[js.Any], adPause = adPause.asInstanceOf[js.Any], adPlay = adPlay.asInstanceOf[js.Any], adRequest = adRequest.asInstanceOf[js.Any], adSchedule = adSchedule.asInstanceOf[js.Any], adSkipped = adSkipped.asInstanceOf[js.Any], adStarted = adStarted.asInstanceOf[js.Any], adTime = adTime.asInstanceOf[js.Any], audioTrackChanged = audioTrackChanged.asInstanceOf[js.Any], audioTracks = audioTracks.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], bufferChange = bufferChange.asInstanceOf[js.Any], captionsChanged = captionsChanged.asInstanceOf[js.Any], captionsList = captionsList.asInstanceOf[js.Any], cast = cast.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], firstFrame = firstFrame.asInstanceOf[js.Any], fullscreen = fullscreen.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], levelsChanged = levelsChanged.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playlist = playlist.asInstanceOf[js.Any], playlistItem = playlistItem.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], seek = seek.asInstanceOf[js.Any], setupError = setupError.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], visualQuality = visualQuality.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventParams]
  }
}

