package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSliderMethods extends js.Object {
  def clearBookmarks(): scala.Unit
  def destroy(): scala.Unit
  def value(newValue: js.Object): scala.Unit
  def widget(): scala.Unit
}

object IgSliderMethods {
  @scala.inline
  def apply(
    clearBookmarks: () => scala.Unit,
    destroy: () => scala.Unit,
    value: js.Object => scala.Unit,
    widget: () => scala.Unit
  ): IgSliderMethods = {
    val __obj = js.Dynamic.literal(clearBookmarks = js.Any.fromFunction0(clearBookmarks), destroy = js.Any.fromFunction0(destroy), value = js.Any.fromFunction1(value), widget = js.Any.fromFunction0(widget))
  
    __obj.asInstanceOf[IgSliderMethods]
  }
}

