package typings.ionicReact

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  children ? :react.react.ReactNode}> */
trait ReadonlychildrenReactNode extends js.Object {
  val children: js.UndefOr[ReactNode] = js.undefined
}

object ReadonlychildrenReactNode {
  @scala.inline
  def apply(children: ReactNode = null): ReadonlychildrenReactNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlychildrenReactNode]
  }
}

