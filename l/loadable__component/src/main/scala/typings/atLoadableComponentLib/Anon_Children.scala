package typings
package atLoadableComponentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children[TModule] extends js.Object {
  var children: js.UndefOr[js.Function1[/* module */ TModule, reactLib.reactMod.ReactNode]] = js.undefined
  var fallback: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var ref: js.UndefOr[reactLib.reactMod.Ref[TModule]] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply[TModule](
    children: /* module */ TModule => reactLib.reactMod.ReactNode = null,
    fallback: reactLib.reactMod.Global.JSXNs.Element = null,
    ref: reactLib.reactMod.Ref[TModule] = null
  ): Anon_Children[TModule] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children[TModule]]
  }
}

