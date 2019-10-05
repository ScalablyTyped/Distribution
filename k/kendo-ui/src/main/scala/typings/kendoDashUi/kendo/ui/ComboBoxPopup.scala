package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboBoxPopup extends js.Object {
  var appendTo: js.UndefOr[String] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object ComboBoxPopup {
  @scala.inline
  def apply(appendTo: String = null, origin: String = null, position: String = null): ComboBoxPopup = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ComboBoxPopup]
  }
}

