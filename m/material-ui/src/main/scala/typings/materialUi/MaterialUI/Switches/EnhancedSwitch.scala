package typings.materialUi.MaterialUI.Switches

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnhancedSwitch
  extends Component[EnhancedSwitchProps, js.Object, js.Any] {
  def getValue(): String = js.native
  def isKeyboardFocused(): Boolean = js.native
  def isSwitched(): Boolean = js.native
  def setSwitched(newSwitchedValue: Boolean): Unit = js.native
}

