package typings.jqueryPin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bottom extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object Bottom {
  @scala.inline
  def apply(bottom: js.UndefOr[Double] = js.undefined, top: js.UndefOr[Double] = js.undefined): Bottom = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
}

