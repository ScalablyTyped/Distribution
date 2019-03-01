package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeEffect extends js.Object {
  var origin: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var scale: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[js.Any] = js.undefined
}

object SizeEffect {
  @scala.inline
  def apply(origin: js.Array[java.lang.String] = null, scale: java.lang.String = null, to: js.Any = null): SizeEffect = {
    val __obj = js.Dynamic.literal()
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[SizeEffect]
  }
}

