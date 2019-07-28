package typings.atMaterialTextfield.foundationMod

import typings.atMaterialTextfield.adapterMod.FoundationMapType
import typings.atMaterialTextfield.adapterMod.MDCTextFieldAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield/foundation", JSImport.Default)
@js.native
class default protected () extends MDCTextFieldFoundation {
  def this(adapter: MDCTextFieldAdapter) = this()
  def this(adapter: MDCTextFieldAdapter, foundationMap: FoundationMapType) = this()
}

/* static members */
@JSImport("@material/textfield/foundation", JSImport.Default)
@js.native
object default extends js.Object {
  val cssClasses: typings.atMaterialTextfield.constantsMod.cssClasses = js.native
  val defaultAdapter: MDCTextFieldAdapter = js.native
  val numbers: typings.atMaterialTextfield.constantsMod.numbers = js.native
  val strings: typings.atMaterialTextfield.constantsMod.strings = js.native
}

