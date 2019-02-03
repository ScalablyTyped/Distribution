package typings
package atMaterialBaseLib.atMaterialBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/base", "MDCFoundation")
@js.native
class MDCFoundation[A] protected ()
  extends atMaterialBaseLib.foundationMod.default[A] {
  def this(adapter: A) = this()
}

/* static members */
@JSImport("@material/base", "MDCFoundation")
@js.native
object MDCFoundation extends js.Object {
  val cssClasses: atMaterialBaseLib.foundationMod.MDCStrings = js.native
  val defaultAdapter: js.Any = js.native
  val numbers: atMaterialBaseLib.foundationMod.MDCNumbers = js.native
  val strings: atMaterialBaseLib.foundationMod.MDCStrings = js.native
}

