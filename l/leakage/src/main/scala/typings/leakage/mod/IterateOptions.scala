package typings.leakage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterateOptions extends js.Object {
  var gcollections: js.UndefOr[Double] = js.undefined
  var iterations: js.UndefOr[Double] = js.undefined
}

object IterateOptions {
  @scala.inline
  def apply(gcollections: Int | Double = null, iterations: Int | Double = null): IterateOptions = {
    val __obj = js.Dynamic.literal()
    if (gcollections != null) __obj.updateDynamic("gcollections")(gcollections.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterateOptions]
  }
}

