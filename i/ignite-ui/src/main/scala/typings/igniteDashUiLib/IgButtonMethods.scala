package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgButtonMethods extends js.Object {
  def destroy(): scala.Unit
  def setTitle(title: js.Object): scala.Unit
  def widget(): scala.Unit
}

object IgButtonMethods {
  @scala.inline
  def apply(destroy: () => scala.Unit, setTitle: js.Object => scala.Unit, widget: () => scala.Unit): IgButtonMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setTitle = js.Any.fromFunction1(setTitle), widget = js.Any.fromFunction0(widget))
  
    __obj.asInstanceOf[IgButtonMethods]
  }
}

