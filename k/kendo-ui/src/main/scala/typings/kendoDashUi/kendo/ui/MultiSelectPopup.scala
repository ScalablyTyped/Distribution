package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelectPopup extends js.Object {
  var appendTo: js.UndefOr[String] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object MultiSelectPopup {
  @scala.inline
  def apply(appendTo: String = null, origin: String = null, position: String = null): MultiSelectPopup = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelectPopup]
  }
}

