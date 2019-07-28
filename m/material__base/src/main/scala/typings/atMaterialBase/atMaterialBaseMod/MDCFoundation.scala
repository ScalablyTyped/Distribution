package typings.atMaterialBase.atMaterialBaseMod

import typings.atMaterialBase.foundationMod.MDCNumbers
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialBase.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/base", "MDCFoundation")
@js.native
class MDCFoundation[A] protected () extends default[A] {
  def this(adapter: A) = this()
}

/* static members */
@JSImport("@material/base", "MDCFoundation")
@js.native
object MDCFoundation extends js.Object {
  val cssClasses: MDCStrings = js.native
  val defaultAdapter: js.Any = js.native
  val numbers: MDCNumbers = js.native
  val strings: MDCStrings = js.native
}

