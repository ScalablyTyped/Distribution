package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait levelUpdatedData extends js.Object {
  var details: LevelDetails
  var level: Double
}

object levelUpdatedData {
  @scala.inline
  def apply(details: LevelDetails, level: Double): levelUpdatedData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[levelUpdatedData]
  }
}

