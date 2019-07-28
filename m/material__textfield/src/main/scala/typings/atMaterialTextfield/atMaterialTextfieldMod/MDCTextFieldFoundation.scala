package typings.atMaterialTextfield.atMaterialTextfieldMod

import typings.atMaterialTextfield.adapterMod.FoundationMapType
import typings.atMaterialTextfield.adapterMod.MDCTextFieldAdapter
import typings.atMaterialTextfield.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield", "MDCTextFieldFoundation")
@js.native
class MDCTextFieldFoundation protected () extends default {
  def this(adapter: MDCTextFieldAdapter) = this()
  def this(adapter: MDCTextFieldAdapter, foundationMap: FoundationMapType) = this()
}

/* static members */
@JSImport("@material/textfield", "MDCTextFieldFoundation")
@js.native
object MDCTextFieldFoundation extends js.Object {
  val cssClasses: typings.atMaterialTextfield.constantsMod.cssClasses = js.native
  val defaultAdapter: MDCTextFieldAdapter = js.native
  val numbers: typings.atMaterialTextfield.constantsMod.numbers = js.native
  val strings: typings.atMaterialTextfield.constantsMod.strings = js.native
}

