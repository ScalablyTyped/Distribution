package typings.atMaterialSelect.foundationMod

import typings.atMaterialBase.atMaterialBaseMod.MDCFoundation
import typings.atMaterialSelect.adapterMod.MDCSelectAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCSelectFoundation extends MDCFoundation[MDCSelectAdapter] {
  def setDisabled(disabled: Boolean): Unit = js.native
  def setSelectedIndex(index: Double): Unit = js.native
  def setValue(value: String): Unit = js.native
}

