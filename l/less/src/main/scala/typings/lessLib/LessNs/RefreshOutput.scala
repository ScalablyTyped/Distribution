package typings
package lessLib.LessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshOutput extends js.Object {
  var endTime: stdLib.Date
  var sheets: scala.Double
  var startTime: stdLib.Date
  var totalMilliseconds: scala.Double
}

object RefreshOutput {
  @scala.inline
  def apply(
    endTime: stdLib.Date,
    sheets: scala.Double,
    startTime: stdLib.Date,
    totalMilliseconds: scala.Double
  ): RefreshOutput = {
    val __obj = js.Dynamic.literal(endTime = endTime, sheets = sheets, startTime = startTime, totalMilliseconds = totalMilliseconds)
  
    __obj.asInstanceOf[RefreshOutput]
  }
}

