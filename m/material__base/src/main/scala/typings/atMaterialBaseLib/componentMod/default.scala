package typings
package atMaterialBaseLib.componentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/base/component", JSImport.Default)
@js.native
class default[A, F /* <: atMaterialBaseLib.foundationMod.default[A] */] protected () extends MDCComponent[A, F] {
  def this(root: stdLib.Element) = this()
  def this(root: stdLib.Element, foundation: F, args: js.Any*) = this()
}

/* static members */
@JSImport("@material/base/component", JSImport.Default)
@js.native
object default extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialBaseLib.componentMod.MDCComponent[_, atMaterialBaseLib.foundationMod.default[_]] = js.native
}

