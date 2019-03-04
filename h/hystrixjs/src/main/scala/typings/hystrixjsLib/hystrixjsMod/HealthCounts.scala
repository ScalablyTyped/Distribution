package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthCounts extends js.Object {
  var errorCount: scala.Double
  var errorPercentage: scala.Double
  var totalCount: scala.Double
}

object HealthCounts {
  @scala.inline
  def apply(errorCount: scala.Double, errorPercentage: scala.Double, totalCount: scala.Double): HealthCounts = {
    val __obj = js.Dynamic.literal(errorCount = errorCount, errorPercentage = errorPercentage, totalCount = totalCount)
  
    __obj.asInstanceOf[HealthCounts]
  }
}

