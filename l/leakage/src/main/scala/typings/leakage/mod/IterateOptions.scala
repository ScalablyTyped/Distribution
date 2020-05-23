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
  def apply(gcollections: js.UndefOr[Double] = js.undefined, iterations: js.UndefOr[Double] = js.undefined): IterateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gcollections)) __obj.updateDynamic("gcollections")(gcollections.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterateOptions]
  }
}

