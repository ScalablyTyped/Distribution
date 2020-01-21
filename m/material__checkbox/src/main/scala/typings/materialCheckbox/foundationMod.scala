package typings.materialCheckbox

import typings.materialCheckbox.adapterMod.MDCCheckboxAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/checkbox/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCCheckboxFoundation
    extends typings.materialBase.foundationMod.default[MDCCheckboxAdapter] {
    def getValue(): String = js.native
    def handleAnimationEnd(): Unit = js.native
    def handleChange(): Unit = js.native
    def isChecked(): Boolean = js.native
    def isDisabled(): Boolean = js.native
    def isIndeterminate(): Boolean = js.native
    def setChecked(checked: Boolean): Unit = js.native
    def setDisabled(disabled: Boolean): Unit = js.native
    def setIndeterminate(indeterminate: Boolean): Unit = js.native
    def setValue(value: String): Unit = js.native
  }
  
  @js.native
  class default () extends MDCCheckboxFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.materialCheckbox.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCCheckboxAdapter = js.native
    val numbers: typings.materialCheckbox.constantsMod.numbers = js.native
    val strings: typings.materialCheckbox.constantsMod.strings = js.native
  }
  
}

