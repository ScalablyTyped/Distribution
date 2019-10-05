package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxToolbar extends js.Object {
  var position: js.UndefOr[String] = js.undefined
  var tools: js.UndefOr[js.Any] = js.undefined
}

object ListBoxToolbar {
  @scala.inline
  def apply(position: String = null, tools: js.Any = null): ListBoxToolbar = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    if (tools != null) __obj.updateDynamic("tools")(tools)
    __obj.asInstanceOf[ListBoxToolbar]
  }
}

