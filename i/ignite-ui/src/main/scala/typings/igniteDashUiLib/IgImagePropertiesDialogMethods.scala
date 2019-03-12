package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgImagePropertiesDialogMethods extends js.Object {
  def hide(): scala.Unit
  def show(item: js.Object): scala.Unit
}

object IgImagePropertiesDialogMethods {
  @scala.inline
  def apply(hide: () => scala.Unit, show: js.Object => scala.Unit): IgImagePropertiesDialogMethods = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show))
  
    __obj.asInstanceOf[IgImagePropertiesDialogMethods]
  }
}

