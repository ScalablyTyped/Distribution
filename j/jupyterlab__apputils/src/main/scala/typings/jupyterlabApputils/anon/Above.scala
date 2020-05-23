package typings.jupyterlabApputils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Above extends js.Object {
  var above: js.UndefOr[Double] = js.undefined
  var below: js.UndefOr[Double] = js.undefined
}

object Above {
  @scala.inline
  def apply(above: js.UndefOr[Double] = js.undefined, below: js.UndefOr[Double] = js.undefined): Above = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(above)) __obj.updateDynamic("above")(above.get.asInstanceOf[js.Any])
    if (!js.isUndefined(below)) __obj.updateDynamic("below")(below.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Above]
  }
}

