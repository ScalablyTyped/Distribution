package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PulsateEffect extends js.Object {
  var times: js.UndefOr[scala.Double] = js.undefined
}

object PulsateEffect {
  @scala.inline
  def apply(times: scala.Int | scala.Double = null): PulsateEffect = {
    val __obj = js.Dynamic.literal()
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    __obj.asInstanceOf[PulsateEffect]
  }
}

