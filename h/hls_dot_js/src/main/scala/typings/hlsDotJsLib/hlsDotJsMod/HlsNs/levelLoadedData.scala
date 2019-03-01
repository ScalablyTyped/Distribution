package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait levelLoadedData extends js.Object {
  var details: LevelDetails
  var levelId: scala.Double
  var stats: Stats
}

object levelLoadedData {
  @scala.inline
  def apply(details: LevelDetails, levelId: scala.Double, stats: Stats): levelLoadedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("details")(details)
    __obj.updateDynamic("levelId")(levelId)
    __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[levelLoadedData]
  }
}

