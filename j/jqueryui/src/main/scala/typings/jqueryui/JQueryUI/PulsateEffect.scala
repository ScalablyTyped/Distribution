package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PulsateEffect extends js.Object {
  var times: js.UndefOr[Double] = js.undefined
}

object PulsateEffect {
  @scala.inline
  def apply(times: Int | Double = null): PulsateEffect = {
    val __obj = js.Dynamic.literal()
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    __obj.asInstanceOf[PulsateEffect]
  }
}

