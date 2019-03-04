package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait audioTracksUpdatedData extends js.Object {
  var audioTracks: js.Array[stdLib.AudioTrack]
}

object audioTracksUpdatedData {
  @scala.inline
  def apply(audioTracks: js.Array[stdLib.AudioTrack]): audioTracksUpdatedData = {
    val __obj = js.Dynamic.literal(audioTracks = audioTracks)
  
    __obj.asInstanceOf[audioTracksUpdatedData]
  }
}

