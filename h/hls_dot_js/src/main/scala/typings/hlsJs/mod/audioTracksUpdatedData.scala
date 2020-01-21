package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait audioTracksUpdatedData extends js.Object {
  var audioTracks: js.Array[AudioTrack]
}

object audioTracksUpdatedData {
  @scala.inline
  def apply(audioTracks: js.Array[AudioTrack]): audioTracksUpdatedData = {
    val __obj = js.Dynamic.literal(audioTracks = audioTracks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[audioTracksUpdatedData]
  }
}

