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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adClick")(adClick)
    __obj.updateDynamic("adCompanions")(adCompanions)
    __obj.updateDynamic("adComplete")(adComplete)
    __obj.updateDynamic("adError")(adError)
    __obj.updateDynamic("adImpression")(adImpression)
    __obj.updateDynamic("adPause")(adPause)
    __obj.updateDynamic("adPlay")(adPlay)
    __obj.updateDynamic("adRequest")(adRequest)
    __obj.updateDynamic("adSchedule")(adSchedule)
    __obj.updateDynamic("adSkipped")(adSkipped)
    __obj.updateDynamic("adStarted")(adStarted)
    __obj.updateDynamic("adTime")(adTime)
    __obj.updateDynamic("audioTrackChanged")(audioTrackChanged)
    __obj.updateDynamic("audioTracks")(audioTracks)
    __obj.updateDynamic("buffer")(buffer)
    __obj.updateDynamic("bufferChange")(bufferChange)
    __obj.updateDynamic("captionsChanged")(captionsChanged)
    __obj.updateDynamic("captionsList")(captionsList)
    __obj.updateDynamic("cast")(cast)
    __obj.updateDynamic("controls")(controls)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("firstFrame")(firstFrame)
    __obj.updateDynamic("fullscreen")(fullscreen)
    __obj.updateDynamic("idle")(idle)
    __obj.updateDynamic("levels")(levels)
    __obj.updateDynamic("levelsChanged")(levelsChanged)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("mute")(mute)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("playlist")(playlist)
    __obj.updateDynamic("playlistItem")(playlistItem)
    __obj.updateDynamic("ready")(ready)
    __obj.updateDynamic("resize")(resize)
    __obj.updateDynamic("seek")(seek)
    __obj.updateDynamic("setupError")(setupError)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("visualQuality")(visualQuality)
    __obj.updateDynamic("volume")(volume)
    __obj.asInstanceOf[EventParams]
  }
}

