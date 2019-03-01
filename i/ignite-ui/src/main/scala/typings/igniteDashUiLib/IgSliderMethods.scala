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
    clearBookmarks: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    value: js.Function1[js.Object, scala.Unit],
    widget: js.Function0[scala.Unit]
  ): IgSliderMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearBookmarks")(clearBookmarks)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("value")(value)
    __obj.updateDynamic("widget")(widget)
    __obj.asInstanceOf[IgSliderMethods]
  }
}

