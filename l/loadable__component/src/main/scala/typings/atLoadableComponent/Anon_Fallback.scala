package typings.atLoadableComponent

import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fallback extends js.Object {
  var fallback: js.UndefOr[Element] = js.undefined
}

object Anon_Fallback {
  @scala.inline
  def apply(fallback: Element = null): Anon_Fallback = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Fallback]
  }
}

