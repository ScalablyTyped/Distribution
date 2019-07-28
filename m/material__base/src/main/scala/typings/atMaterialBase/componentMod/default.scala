package typings.atMaterialBase.componentMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/base/component", JSImport.Default)
@js.native
class default[A, F /* <: typings.atMaterialBase.foundationMod.default[A] */] protected () extends MDCComponent[A, F] {
  def this(root: Element) = this()
  def this(root: Element, foundation: F, args: js.Any*) = this()
}

/* static members */
@JSImport("@material/base/component", JSImport.Default)
@js.native
object default extends js.Object {
  def attachTo(root: Element): MDCComponent[_, typings.atMaterialBase.foundationMod.default[_]] = js.native
}

