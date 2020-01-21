package typings.loadableComponent

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFallback extends js.Object {
  var fallback: js.UndefOr[Element] = js.undefined
}

object AnonFallback {
  @scala.inline
  def apply(fallback: Element = null): AnonFallback = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFallback]
  }
}

