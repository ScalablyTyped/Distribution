package typings
package leakageLib.leakageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterateOptions extends js.Object {
  var gcollections: js.UndefOr[scala.Double] = js.undefined
  var iterations: js.UndefOr[scala.Double] = js.undefined
}

object IterateOptions {
  @scala.inline
  def apply(gcollections: scala.Int | scala.Double = null, iterations: scala.Int | scala.Double = null): IterateOptions = {
    val __obj = js.Dynamic.literal()
    if (gcollections != null) __obj.updateDynamic("gcollections")(gcollections.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterateOptions]
  }
}

