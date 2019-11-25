package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeEffect extends js.Object {
  var origin: js.UndefOr[js.Array[String]] = js.undefined
  var scale: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[js.Any] = js.undefined
}

object SizeEffect {
  @scala.inline
  def apply(origin: js.Array[String] = null, scale: String = null, to: js.Any = null): SizeEffect = {
    val __obj = js.Dynamic.literal()
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeEffect]
  }
}

