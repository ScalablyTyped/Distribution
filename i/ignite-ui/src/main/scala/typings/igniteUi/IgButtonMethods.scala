package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgButtonMethods extends js.Object {
  def destroy(): Unit
  def setTitle(title: js.Object): Unit
  def widget(): Unit
}

object IgButtonMethods {
  @scala.inline
  def apply(destroy: () => Unit, setTitle: js.Object => Unit, widget: () => Unit): IgButtonMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setTitle = js.Any.fromFunction1(setTitle), widget = js.Any.fromFunction0(widget))
  
    __obj.asInstanceOf[IgButtonMethods]
  }
}

