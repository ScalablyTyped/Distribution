package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLinkPropertiesDialogMethods extends js.Object {
  def hide(): scala.Unit
  def show(item: js.Object): scala.Unit
}

object IgLinkPropertiesDialogMethods {
  @scala.inline
  def apply(hide: js.Function0[scala.Unit], show: js.Function1[js.Object, scala.Unit]): IgLinkPropertiesDialogMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[IgLinkPropertiesDialogMethods]
  }
}

