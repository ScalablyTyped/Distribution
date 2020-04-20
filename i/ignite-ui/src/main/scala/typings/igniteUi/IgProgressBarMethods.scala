package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgProgressBarMethods extends js.Object {
  def destroy(): Unit
  def value(newValue: js.Object): Unit
  def widget(): Unit
}

object IgProgressBarMethods {
  @scala.inline
  def apply(destroy: () => Unit, value: js.Object => Unit, widget: () => Unit): IgProgressBarMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), value = js.Any.fromFunction1(value), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgProgressBarMethods]
  }
}

