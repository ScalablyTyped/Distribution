package typings.atMaterialCheckbox.foundationMod

import typings.atMaterialCheckbox.adapterMod.MDCCheckboxAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCCheckboxFoundation
  extends typings.atMaterialBase.foundationMod.default[MDCCheckboxAdapter] {
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

