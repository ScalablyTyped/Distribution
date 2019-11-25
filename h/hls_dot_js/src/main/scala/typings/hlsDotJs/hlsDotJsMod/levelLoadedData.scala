package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait levelLoadedData extends js.Object {
  var details: LevelDetails
  var levelId: Double
  var stats: Stats
}

object levelLoadedData {
  @scala.inline
  def apply(details: LevelDetails, levelId: Double, stats: Stats): levelLoadedData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], levelId = levelId.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[levelLoadedData]
  }
}

