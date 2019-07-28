package typings.atMaterialRadio.foundationMod

import typings.atMaterialRadio.adapterMod.MDCRadioAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCRadioFoundation
  extends typings.atMaterialBase.foundationMod.default[MDCRadioAdapter] {
  def getValue(): String = js.native
  def isChecked(): Boolean = js.native
  def isDisabled(): Boolean = js.native
  def setChecked(checked: Boolean): Unit = js.native
  def setDisabled(disabled: Boolean): Unit = js.native
  def setValue(): Unit = js.native
  def setValue(value: String): Unit = js.native
}

