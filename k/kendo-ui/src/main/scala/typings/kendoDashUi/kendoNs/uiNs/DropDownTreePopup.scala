package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownTreePopup extends js.Object {
  var appendTo: js.UndefOr[String] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object DropDownTreePopup {
  @scala.inline
  def apply(appendTo: String = null, origin: String = null, position: String = null): DropDownTreePopup = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[DropDownTreePopup]
  }
}

