package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchMessages extends js.Object {
  var checked: js.UndefOr[String] = js.undefined
  var unchecked: js.UndefOr[String] = js.undefined
}

object SwitchMessages {
  @scala.inline
  def apply(checked: String = null, unchecked: String = null): SwitchMessages = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (unchecked != null) __obj.updateDynamic("unchecked")(unchecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchMessages]
  }
}

