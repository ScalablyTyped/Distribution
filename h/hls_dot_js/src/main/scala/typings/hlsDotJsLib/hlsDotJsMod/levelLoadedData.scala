package typings
package hlsDotJsLib.hlsDotJsMod

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
    val __obj = js.Dynamic.literal(details = details, levelId = levelId, stats = stats)
  
    __obj.asInstanceOf[levelLoadedData]
  }
}

