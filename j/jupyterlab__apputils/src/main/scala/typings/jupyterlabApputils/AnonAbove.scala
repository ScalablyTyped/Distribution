package typings.jupyterlabApputils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbove extends js.Object {
  var above: js.UndefOr[Double] = js.undefined
  var below: js.UndefOr[Double] = js.undefined
}

object AnonAbove {
  @scala.inline
  def apply(above: Int | Double = null, below: Int | Double = null): AnonAbove = {
    val __obj = js.Dynamic.literal()
    if (above != null) __obj.updateDynamic("above")(above.asInstanceOf[js.Any])
    if (below != null) __obj.updateDynamic("below")(below.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbove]
  }
}

