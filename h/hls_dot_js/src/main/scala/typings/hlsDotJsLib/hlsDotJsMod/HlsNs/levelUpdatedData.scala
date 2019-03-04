package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait levelUpdatedData extends js.Object {
  var details: LevelDetails
  var level: scala.Double
}

object levelUpdatedData {
  @scala.inline
  def apply(details: LevelDetails, level: scala.Double): levelUpdatedData = {
    val __obj = js.Dynamic.literal(details = details, level = level)
  
    __obj.asInstanceOf[levelUpdatedData]
  }
}

