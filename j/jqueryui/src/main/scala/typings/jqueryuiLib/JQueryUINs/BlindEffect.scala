package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlindEffect extends js.Object {
  var direction: js.UndefOr[java.lang.String] = js.undefined
}

object BlindEffect {
  @scala.inline
  def apply(direction: java.lang.String = null): BlindEffect = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    __obj.asInstanceOf[BlindEffect]
  }
}

