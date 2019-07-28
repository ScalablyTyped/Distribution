package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchEventOptions extends js.Object {
  var target: js.UndefOr[JQuery] = js.undefined
  var x: js.UndefOr[TouchAxis] = js.undefined
  var y: js.UndefOr[TouchAxis] = js.undefined
}

object TouchEventOptions {
  @scala.inline
  def apply(target: JQuery = null, x: TouchAxis = null, y: TouchAxis = null): TouchEventOptions = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target)
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[TouchEventOptions]
  }
}

