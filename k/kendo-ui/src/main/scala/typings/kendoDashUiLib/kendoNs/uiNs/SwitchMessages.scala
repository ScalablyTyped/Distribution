package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchMessages extends js.Object {
  var checked: js.UndefOr[java.lang.String] = js.undefined
  var unchecked: js.UndefOr[java.lang.String] = js.undefined
}

object SwitchMessages {
  @scala.inline
  def apply(checked: java.lang.String = null, unchecked: java.lang.String = null): SwitchMessages = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked)
    if (unchecked != null) __obj.updateDynamic("unchecked")(unchecked)
    __obj.asInstanceOf[SwitchMessages]
  }
}

