package typings.atLoadableComponent

import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children[TModule] extends js.Object {
  var children: js.UndefOr[js.Function1[/* module */ TModule, ReactNode]] = js.undefined
  var fallback: js.UndefOr[Element] = js.undefined
  var ref: js.UndefOr[Ref[TModule]] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply[TModule](
    children: /* module */ TModule => ReactNode = null,
    fallback: Element = null,
    ref: Ref[TModule] = null
  ): Anon_Children[TModule] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children[TModule]]
  }
}

