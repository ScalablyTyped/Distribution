package typings
package jsdeferredLib.jsdeferredMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loop extends js.Object {
  var begin: js.UndefOr[scala.Double] = js.undefined
  var end: js.UndefOr[scala.Double] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
}

object Loop {
  @scala.inline
  def apply(
    begin: scala.Int | scala.Double = null,
    end: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null
  ): Loop = {
    val __obj = js.Dynamic.literal()
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loop]
  }
}

