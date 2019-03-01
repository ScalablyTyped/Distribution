package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferEffect extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object TransferEffect {
  @scala.inline
  def apply(className: java.lang.String = null, to: java.lang.String = null): TransferEffect = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[TransferEffect]
  }
}

