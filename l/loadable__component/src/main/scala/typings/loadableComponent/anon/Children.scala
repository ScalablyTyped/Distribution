package typings.loadableComponent.anon

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children[TModule] extends js.Object {
  var children: js.UndefOr[js.Function1[/* module */ TModule, ReactNode]] = js.undefined
  var fallback: js.UndefOr[Element] = js.undefined
  var ref: js.UndefOr[Ref[TModule]] = js.undefined
}

object Children {
  @scala.inline
  def apply[TModule](
    children: /* module */ TModule => ReactNode = null,
    fallback: Element = null,
    ref: js.UndefOr[Null | Ref[TModule]] = js.undefined
  ): Children[TModule] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children[TModule]]
  }
}

