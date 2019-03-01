package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subtitleTrackLoadedData extends js.Object {
  var details: LevelDetails
  var id: java.lang.String
  var stats: Stats
}

object subtitleTrackLoadedData {
  @scala.inline
  def apply(details: LevelDetails, id: java.lang.String, stats: Stats): subtitleTrackLoadedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("details")(details)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[subtitleTrackLoadedData]
  }
}

