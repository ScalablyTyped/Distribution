package typings.hystrixjs.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthCounts extends js.Object {
  var errorCount: Double
  var errorPercentage: Double
  var totalCount: Double
}

object HealthCounts {
  @scala.inline
  def apply(errorCount: Double, errorPercentage: Double, totalCount: Double): HealthCounts = {
    val __obj = js.Dynamic.literal(errorCount = errorCount, errorPercentage = errorPercentage, totalCount = totalCount)
  
    __obj.asInstanceOf[HealthCounts]
  }
}

