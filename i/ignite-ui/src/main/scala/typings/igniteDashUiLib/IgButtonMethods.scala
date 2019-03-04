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
  def apply(
    destroy: js.Function0[scala.Unit],
    setTitle: js.Function1[js.Object, scala.Unit],
    widget: js.Function0[scala.Unit]
  ): IgButtonMethods = {
    val __obj = js.Dynamic.literal(destroy = destroy, setTitle = setTitle, widget = widget)
  
    __obj.asInstanceOf[IgButtonMethods]
  }
}

