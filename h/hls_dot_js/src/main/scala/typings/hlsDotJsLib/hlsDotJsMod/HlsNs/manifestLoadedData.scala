package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait manifestLoadedData extends js.Object {
  var audioTracks: js.Array[scala.Double]
  var levels: js.Array[scala.Double]
  var stats: Stats
  var url: java.lang.String
}

object manifestLoadedData {
  @scala.inline
  def apply(
    audioTracks: js.Array[scala.Double],
    levels: js.Array[scala.Double],
    stats: Stats,
    url: java.lang.String
  ): manifestLoadedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audioTracks")(audioTracks)
    __obj.updateDynamic("levels")(levels)
    __obj.updateDynamic("stats")(stats)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[manifestLoadedData]
  }
}

