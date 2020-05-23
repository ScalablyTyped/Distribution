package typings.kendoUi.kendo.stepper

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends Class {
  var options: StepOptions
  def deselect(): Unit
  def enable(value: Boolean): Unit
  def getEnabled(): Boolean
  def getIndex(): Double
  def getSelectable(): Boolean
  def getSelected(): Boolean
  def select(): Unit
  def setPrevious(value: Boolean): Unit
  def setValid(value: Boolean): Unit
}

object Step {
  @scala.inline
  def apply(
    deselect: () => Unit,
    enable: Boolean => Unit,
    getEnabled: () => Boolean,
    getIndex: () => Double,
    getSelectable: () => Boolean,
    getSelected: () => Boolean,
    options: StepOptions,
    select: () => Unit,
    setPrevious: Boolean => Unit,
    setValid: Boolean => Unit
  ): Step = {
    val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction0(deselect), enable = js.Any.fromFunction1(enable), getEnabled = js.Any.fromFunction0(getEnabled), getIndex = js.Any.fromFunction0(getIndex), getSelectable = js.Any.fromFunction0(getSelectable), getSelected = js.Any.fromFunction0(getSelected), options = options.asInstanceOf[js.Any], select = js.Any.fromFunction0(select), setPrevious = js.Any.fromFunction1(setPrevious), setValid = js.Any.fromFunction1(setValid))
    __obj.asInstanceOf[Step]
  }
}

