package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGrow extends js.Object {
  var grow: js.UndefOr[Double] = js.undefined
  var shrink: js.UndefOr[Double] = js.undefined
}

object AnonGrow {
  @scala.inline
  def apply(grow: Int | Double = null, shrink: Int | Double = null): AnonGrow = {
    val __obj = js.Dynamic.literal()
    if (grow != null) __obj.updateDynamic("grow")(grow.asInstanceOf[js.Any])
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGrow]
  }
}

