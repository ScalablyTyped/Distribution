package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLinkPropertiesDialogMethods extends js.Object {
  def hide(): Unit
  def show(item: js.Object): Unit
}

object IgLinkPropertiesDialogMethods {
  @scala.inline
  def apply(hide: () => Unit, show: js.Object => Unit): IgLinkPropertiesDialogMethods = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show))
  
    __obj.asInstanceOf[IgLinkPropertiesDialogMethods]
  }
}

