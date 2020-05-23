package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipEffect extends js.Object {
  var direction: js.UndefOr[Double] = js.undefined
}

object ClipEffect {
  @scala.inline
  def apply(direction: js.UndefOr[Double] = js.undefined): ClipEffect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipEffect]
  }
}

