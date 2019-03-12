package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgProgressBarMethods extends js.Object {
  def destroy(): scala.Unit
  def value(newValue: js.Object): scala.Unit
  def widget(): scala.Unit
}

object IgProgressBarMethods {
  @scala.inline
  def apply(destroy: () => scala.Unit, value: js.Object => scala.Unit, widget: () => scala.Unit): IgProgressBarMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), value = js.Any.fromFunction1(value), widget = js.Any.fromFunction0(widget))
  
    __obj.asInstanceOf[IgProgressBarMethods]
  }
}

