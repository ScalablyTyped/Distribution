package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait audioTrackLoadedData extends js.Object {
  var details: LevelDetails
  var id: String
  var stats: Stats
}

object audioTrackLoadedData {
  @scala.inline
  def apply(details: LevelDetails, id: String, stats: Stats): audioTrackLoadedData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[audioTrackLoadedData]
  }
}

