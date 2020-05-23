package typings.materialUi.MaterialUI.Switches

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toggle
  extends Component[ToggleProps, js.Object, js.Any] {
  def isToggled(): Boolean = js.native
  def setToggled(newToggledValue: Boolean): Unit = js.native
}

