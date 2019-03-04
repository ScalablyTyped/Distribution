package typings
package jwplayerLib.jwplayerNs

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
    val __obj = js.Dynamic.literal(adClick = adClick, adCompanions = adCompanions, adComplete = adComplete, adError = adError, adImpression = adImpression, adPause = adPause, adPlay = adPlay, adRequest = adRequest, adSchedule = adSchedule, adSkipped = adSkipped, adStarted = adStarted, adTime = adTime, audioTrackChanged = audioTrackChanged, audioTracks = audioTracks, buffer = buffer, bufferChange = bufferChange, captionsChanged = captionsChanged, captionsList = captionsList, cast = cast, controls = controls, error = error, firstFrame = firstFrame, fullscreen = fullscreen, idle = idle, levels = levels, levelsChanged = levelsChanged, meta = meta, mute = mute, pause = pause, play = play, playlist = playlist, playlistItem = playlistItem, ready = ready, resize = resize, seek = seek, setupError = setupError, time = time, visualQuality = visualQuality, volume = volume)
  
    __obj.asInstanceOf[EventParams]
  }
}

