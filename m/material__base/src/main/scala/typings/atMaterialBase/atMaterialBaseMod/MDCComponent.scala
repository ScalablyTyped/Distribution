package typings.atMaterialBase.atMaterialBaseMod

import typings.atMaterialBase.foundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/base", "MDCComponent")
@js.native
class MDCComponent[A, F /* <: default[A] */] protected ()
  extends typings.atMaterialBase.componentMod.default[A, F] {
  def this(root: Element) = this()
  def this(root: Element, foundation: F, args: js.Any*) = this()
}

/* static members */
@JSImport("@material/base", "MDCComponent")
@js.native
object MDCComponent extends js.Object {
  def attachTo(root: Element): typings.atMaterialBase.componentMod.MDCComponent[_, default[_]] = js.native
}

