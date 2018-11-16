package typings
package atMaterialIconDashToggleLib.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCIconToggleFoundation
  extends atMaterialBaseLib.foundationMod.default[atMaterialIconDashToggleLib.adapterMod.MDCIconToggleAdapter] {
  def isDisabled(): scala.Boolean = js.native
  def isKeyboardActivated(): scala.Boolean = js.native
  def isOn(): scala.Boolean = js.native
  def refreshToggleData(): scala.Unit = js.native
  def setDisabled(isDisabled: scala.Boolean): scala.Unit = js.native
  def toggle(): scala.Unit = js.native
  def toggle(isOn: scala.Boolean): scala.Unit = js.native
}

