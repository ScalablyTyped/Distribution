package typings.hystrixjs.mod

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
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], errorPercentage = errorPercentage.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCounts]
  }
}

