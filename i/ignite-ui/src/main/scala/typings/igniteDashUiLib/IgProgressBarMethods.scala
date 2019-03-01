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
  def apply(
    destroy: js.Function0[scala.Unit],
    value: js.Function1[js.Object, scala.Unit],
    widget: js.Function0[scala.Unit]
  ): IgProgressBarMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("value")(value)
    __obj.updateDynamic("widget")(widget)
    __obj.asInstanceOf[IgProgressBarMethods]
  }
}

