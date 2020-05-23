package typings.loadableComponent.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fallback extends js.Object {
  var fallback: js.UndefOr[Element] = js.undefined
}

object Fallback {
  @scala.inline
  def apply(fallback: Element = null): Fallback = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fallback]
  }
}

