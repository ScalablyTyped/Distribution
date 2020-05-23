package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PulsateEffect extends js.Object {
  var times: js.UndefOr[Double] = js.undefined
}

object PulsateEffect {
  @scala.inline
  def apply(times: js.UndefOr[Double] = js.undefined): PulsateEffect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(times)) __obj.updateDynamic("times")(times.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PulsateEffect]
  }
}

