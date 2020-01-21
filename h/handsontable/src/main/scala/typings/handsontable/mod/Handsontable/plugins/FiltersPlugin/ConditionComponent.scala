package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionComponent extends BaseComponent {
  def getInputElement(): InputUI = js.native
  def getInputElement(index: Double): InputUI = js.native
  def getInputElements(): js.Array[InputUI] = js.native
  def getMenuItemDescriptor(): js.Object = js.native
  def getSelectElement(): SelectUI = js.native
  def getState(): js.Object = js.native
  def setState(value: js.Object): Unit = js.native
  def updateState(stateInfo: js.Object): Unit = js.native
}

