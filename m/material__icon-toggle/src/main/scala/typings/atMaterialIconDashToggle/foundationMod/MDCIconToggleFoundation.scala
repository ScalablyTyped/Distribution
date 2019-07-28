package typings.atMaterialIconDashToggle.foundationMod

import typings.atMaterialIconDashToggle.adapterMod.MDCIconToggleAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCIconToggleFoundation
  extends typings.atMaterialBase.foundationMod.default[MDCIconToggleAdapter] {
  def isDisabled(): Boolean = js.native
  def isKeyboardActivated(): Boolean = js.native
  def isOn(): Boolean = js.native
  def refreshToggleData(): Unit = js.native
  def setDisabled(isDisabled: Boolean): Unit = js.native
  def toggle(): Unit = js.native
  def toggle(isOn: Boolean): Unit = js.native
}

