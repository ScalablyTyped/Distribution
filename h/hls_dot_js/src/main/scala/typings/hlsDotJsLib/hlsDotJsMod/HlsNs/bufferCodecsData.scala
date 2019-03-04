package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interface mediaDetachingData {}
// interface mediaDetachedData {}
// interface bufferResetData {}
trait bufferCodecsData extends js.Object {
  var tracks: Tracks
}

object bufferCodecsData {
  @scala.inline
  def apply(tracks: Tracks): bufferCodecsData = {
    val __obj = js.Dynamic.literal(tracks = tracks)
  
    __obj.asInstanceOf[bufferCodecsData]
  }
}

