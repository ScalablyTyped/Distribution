package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailIfMajorPerformanceCaveat extends js.Object {
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined
}

object FailIfMajorPerformanceCaveat {
  @scala.inline
  def apply(failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined): FailIfMajorPerformanceCaveat = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failIfMajorPerformanceCaveat)) __obj.updateDynamic("failIfMajorPerformanceCaveat")(failIfMajorPerformanceCaveat.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailIfMajorPerformanceCaveat]
  }
}

