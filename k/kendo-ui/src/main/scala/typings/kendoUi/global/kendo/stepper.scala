package typings.kendoUi.global.kendo

import typings.kendoUi.kendo.stepper.StepOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.stepper")
@js.native
object stepper extends js.Object {
  @js.native
  class Step ()
    extends typings.kendoUi.kendo.stepper.Step {
    def this(options: StepOptions) = this()
    /* CompleteClass */
    override var options: StepOptions = js.native
    /* CompleteClass */
    override def deselect(): Unit = js.native
    /* CompleteClass */
    override def enable(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def getEnabled(): Boolean = js.native
    /* CompleteClass */
    override def getIndex(): Double = js.native
    /* CompleteClass */
    override def getSelectable(): Boolean = js.native
    /* CompleteClass */
    override def getSelected(): Boolean = js.native
    /* CompleteClass */
    override def select(): Unit = js.native
    /* CompleteClass */
    override def setPrevious(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def setValid(value: Boolean): Unit = js.native
  }
  
}

