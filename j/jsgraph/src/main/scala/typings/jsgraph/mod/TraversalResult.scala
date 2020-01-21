package typings.jsgraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversalResult extends js.Object {
  var error: js.UndefOr[js.Any] = js.undefined
  var result: js.UndefOr[TraversalContext] = js.undefined
}

object TraversalResult {
  @scala.inline
  def apply(error: js.Any = null, result: TraversalContext = null): TraversalResult = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraversalResult]
  }
}

