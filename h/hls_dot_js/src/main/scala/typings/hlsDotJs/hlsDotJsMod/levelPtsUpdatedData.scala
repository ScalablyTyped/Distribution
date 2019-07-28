package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait levelPtsUpdatedData extends js.Object {
  var details: LevelDetails
  var drift: Double
  var level: Double
}

object levelPtsUpdatedData {
  @scala.inline
  def apply(details: LevelDetails, drift: Double, level: Double): levelPtsUpdatedData = {
    val __obj = js.Dynamic.literal(details = details, drift = drift, level = level)
  
    __obj.asInstanceOf[levelPtsUpdatedData]
  }
}

