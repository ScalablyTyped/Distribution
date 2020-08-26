package typings.materialMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARIACHECKEDATTR extends js.Object {
  var ARIA_CHECKED_ATTR: String = js.native
  var ARIA_DISABLED_ATTR: String = js.native
  var CHECKBOX_SELECTOR: String = js.native
  var LIST_SELECTOR: String = js.native
  var SELECTED_EVENT: String = js.native
}

object ARIACHECKEDATTR {
  @scala.inline
  def apply(
    ARIA_CHECKED_ATTR: String,
    ARIA_DISABLED_ATTR: String,
    CHECKBOX_SELECTOR: String,
    LIST_SELECTOR: String,
    SELECTED_EVENT: String
  ): ARIACHECKEDATTR = {
    val __obj = js.Dynamic.literal(ARIA_CHECKED_ATTR = ARIA_CHECKED_ATTR.asInstanceOf[js.Any], ARIA_DISABLED_ATTR = ARIA_DISABLED_ATTR.asInstanceOf[js.Any], CHECKBOX_SELECTOR = CHECKBOX_SELECTOR.asInstanceOf[js.Any], LIST_SELECTOR = LIST_SELECTOR.asInstanceOf[js.Any], SELECTED_EVENT = SELECTED_EVENT.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIACHECKEDATTR]
  }
  @scala.inline
  implicit class ARIACHECKEDATTROps[Self <: ARIACHECKEDATTR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setARIA_CHECKED_ATTR(value: String): Self = this.set("ARIA_CHECKED_ATTR", value.asInstanceOf[js.Any])
    @scala.inline
    def setARIA_DISABLED_ATTR(value: String): Self = this.set("ARIA_DISABLED_ATTR", value.asInstanceOf[js.Any])
    @scala.inline
    def setCHECKBOX_SELECTOR(value: String): Self = this.set("CHECKBOX_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setLIST_SELECTOR(value: String): Self = this.set("LIST_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSELECTED_EVENT(value: String): Self = this.set("SELECTED_EVENT", value.asInstanceOf[js.Any])
  }
  
}

