package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSliderMethods extends js.Object {
  def clearBookmarks(): Unit
  def destroy(): Unit
  def value(newValue: js.Object): Unit
  def widget(): Unit
}

object IgSliderMethods {
  @scala.inline
  def apply(clearBookmarks: () => Unit, destroy: () => Unit, value: js.Object => Unit, widget: () => Unit): IgSliderMethods = {
    val __obj = js.Dynamic.literal(clearBookmarks = js.Any.fromFunction0(clearBookmarks), destroy = js.Any.fromFunction0(destroy), value = js.Any.fromFunction1(value), widget = js.Any.fromFunction0(widget))
  
    __obj.asInstanceOf[IgSliderMethods]
  }
}

