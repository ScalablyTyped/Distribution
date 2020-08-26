package typings.kendoUi.kendo.stepper

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Step extends Class {
  var options: StepOptions = js.native
  def deselect(): Unit = js.native
  def enable(value: Boolean): Unit = js.native
  def getEnabled(): Boolean = js.native
  def getIndex(): Double = js.native
  def getSelectable(): Boolean = js.native
  def getSelected(): Boolean = js.native
  def select(): Unit = js.native
  def setPrevious(value: Boolean): Unit = js.native
  def setValid(value: Boolean): Unit = js.native
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
  @scala.inline
  implicit class StepOps[Self <: Step] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeselect(value: () => Unit): Self = this.set("deselect", js.Any.fromFunction0(value))
    @scala.inline
    def setEnable(value: Boolean => Unit): Self = this.set("enable", js.Any.fromFunction1(value))
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = this.set("getEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIndex(value: () => Double): Self = this.set("getIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSelectable(value: () => Boolean): Self = this.set("getSelectable", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSelected(value: () => Boolean): Self = this.set("getSelected", js.Any.fromFunction0(value))
    @scala.inline
    def setOptions(value: StepOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("select", js.Any.fromFunction0(value))
    @scala.inline
    def setSetPrevious(value: Boolean => Unit): Self = this.set("setPrevious", js.Any.fromFunction1(value))
    @scala.inline
    def setSetValid(value: Boolean => Unit): Self = this.set("setValid", js.Any.fromFunction1(value))
  }
  
}

