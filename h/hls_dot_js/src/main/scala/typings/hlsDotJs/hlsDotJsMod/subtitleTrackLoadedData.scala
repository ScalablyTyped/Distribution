package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subtitleTrackLoadedData extends js.Object {
  var details: LevelDetails
  var id: String
  var stats: Stats
}

object subtitleTrackLoadedData {
  @scala.inline
  def apply(details: LevelDetails, id: String, stats: Stats): subtitleTrackLoadedData = {
    val __obj = js.Dynamic.literal(details = details, id = id, stats = stats)
  
    __obj.asInstanceOf[subtitleTrackLoadedData]
  }
}

