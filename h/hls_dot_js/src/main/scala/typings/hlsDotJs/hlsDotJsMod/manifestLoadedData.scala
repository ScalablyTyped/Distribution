package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait manifestLoadedData extends js.Object {
  var audioTracks: js.Array[Double]
  var levels: js.Array[Double]
  var stats: Stats
  var url: String
}

object manifestLoadedData {
  @scala.inline
  def apply(audioTracks: js.Array[Double], levels: js.Array[Double], stats: Stats, url: String): manifestLoadedData = {
    val __obj = js.Dynamic.literal(audioTracks = audioTracks, levels = levels, stats = stats, url = url)
  
    __obj.asInstanceOf[manifestLoadedData]
  }
}

