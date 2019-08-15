package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeTicksInfoObject extends TimeNormalizedObject {
  var higherRanks: js.Array[String]
  var totalRange: Double
}

object TimeTicksInfoObject {
  @scala.inline
  def apply(count: Double, higherRanks: js.Array[String], totalRange: Double, unitRange: Double): TimeTicksInfoObject = {
    val __obj = js.Dynamic.literal(count = count, higherRanks = higherRanks, totalRange = totalRange, unitRange = unitRange)
  
    __obj.asInstanceOf[TimeTicksInfoObject]
  }
}

