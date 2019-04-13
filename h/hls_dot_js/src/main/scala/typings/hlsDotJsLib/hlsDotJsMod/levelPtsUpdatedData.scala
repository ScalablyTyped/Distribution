package typings
package hlsDotJsLib.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait levelPtsUpdatedData extends js.Object {
  var details: LevelDetails
  var drift: scala.Double
  var level: scala.Double
}

object levelPtsUpdatedData {
  @scala.inline
  def apply(details: LevelDetails, drift: scala.Double, level: scala.Double): levelPtsUpdatedData = {
    val __obj = js.Dynamic.literal(details = details, drift = drift, level = level)
  
    __obj.asInstanceOf[levelPtsUpdatedData]
  }
}

