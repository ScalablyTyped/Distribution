package typings.lolex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPerformance extends js.Object {
  /**
    * Mimics performance.now().
    */
  var performance: AnonNow
}

object AnonPerformance {
  @scala.inline
  def apply(performance: AnonNow): AnonPerformance = {
    val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPerformance]
  }
}

