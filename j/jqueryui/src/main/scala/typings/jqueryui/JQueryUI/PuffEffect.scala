package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PuffEffect extends js.Object {
  var percent: js.UndefOr[Double] = js.undefined
}

object PuffEffect {
  @scala.inline
  def apply(percent: js.UndefOr[Double] = js.undefined): PuffEffect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PuffEffect]
  }
}

