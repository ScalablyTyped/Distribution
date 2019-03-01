package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PuffEffect extends js.Object {
  var percent: js.UndefOr[scala.Double] = js.undefined
}

object PuffEffect {
  @scala.inline
  def apply(percent: scala.Int | scala.Double = null): PuffEffect = {
    val __obj = js.Dynamic.literal()
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PuffEffect]
  }
}

