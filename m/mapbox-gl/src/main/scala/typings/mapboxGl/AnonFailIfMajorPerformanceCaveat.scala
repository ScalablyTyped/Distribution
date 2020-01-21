package typings.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailIfMajorPerformanceCaveat extends js.Object {
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined
}

object AnonFailIfMajorPerformanceCaveat {
  @scala.inline
  def apply(failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined): AnonFailIfMajorPerformanceCaveat = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failIfMajorPerformanceCaveat)) __obj.updateDynamic("failIfMajorPerformanceCaveat")(failIfMajorPerformanceCaveat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFailIfMajorPerformanceCaveat]
  }
}

