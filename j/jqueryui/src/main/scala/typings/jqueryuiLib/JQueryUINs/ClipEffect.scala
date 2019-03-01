package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipEffect extends js.Object {
  var direction: js.UndefOr[scala.Double] = js.undefined
}

object ClipEffect {
  @scala.inline
  def apply(direction: scala.Int | scala.Double = null): ClipEffect = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipEffect]
  }
}

