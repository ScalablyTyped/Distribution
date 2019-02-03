package typings
package atMaterialBaseLib.atMaterialBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/base", "MDCComponent")
@js.native
class MDCComponent[A, F /* <: atMaterialBaseLib.foundationMod.default[A] */] protected ()
  extends atMaterialBaseLib.componentMod.default[A, F] {
  def this(root: stdLib.Element) = this()
  def this(root: stdLib.Element, foundation: F, args: js.Any*) = this()
}

/* static members */
@JSImport("@material/base", "MDCComponent")
@js.native
object MDCComponent extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialBaseLib.componentMod.MDCComponent[_, atMaterialBaseLib.foundationMod.default[_]] = js.native
}

