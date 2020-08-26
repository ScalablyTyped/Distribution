package typings.materialSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARIACONTROLS extends js.Object {
  var ARIA_CONTROLS: String = js.native
  var ARIA_SELECTED_ATTR: String = js.native
  var CHANGE_EVENT: String = js.native
  var LABEL_SELECTOR: String = js.native
  var LEADING_ICON_SELECTOR: String = js.native
  var LINE_RIPPLE_SELECTOR: String = js.native
  var MENU_SELECTOR: String = js.native
  var OUTLINE_SELECTOR: String = js.native
  var SELECTED_ITEM_SELECTOR: String = js.native
  var SELECTED_TEXT_SELECTOR: String = js.native
  var SELECT_ANCHOR_SELECTOR: String = js.native
  var VALUE_ATTR: String = js.native
}

object ARIACONTROLS {
  @scala.inline
  def apply(
    ARIA_CONTROLS: String,
    ARIA_SELECTED_ATTR: String,
    CHANGE_EVENT: String,
    LABEL_SELECTOR: String,
    LEADING_ICON_SELECTOR: String,
    LINE_RIPPLE_SELECTOR: String,
    MENU_SELECTOR: String,
    OUTLINE_SELECTOR: String,
    SELECTED_ITEM_SELECTOR: String,
    SELECTED_TEXT_SELECTOR: String,
    SELECT_ANCHOR_SELECTOR: String,
    VALUE_ATTR: String
  ): ARIACONTROLS = {
    val __obj = js.Dynamic.literal(ARIA_CONTROLS = ARIA_CONTROLS.asInstanceOf[js.Any], ARIA_SELECTED_ATTR = ARIA_SELECTED_ATTR.asInstanceOf[js.Any], CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], LABEL_SELECTOR = LABEL_SELECTOR.asInstanceOf[js.Any], LEADING_ICON_SELECTOR = LEADING_ICON_SELECTOR.asInstanceOf[js.Any], LINE_RIPPLE_SELECTOR = LINE_RIPPLE_SELECTOR.asInstanceOf[js.Any], MENU_SELECTOR = MENU_SELECTOR.asInstanceOf[js.Any], OUTLINE_SELECTOR = OUTLINE_SELECTOR.asInstanceOf[js.Any], SELECTED_ITEM_SELECTOR = SELECTED_ITEM_SELECTOR.asInstanceOf[js.Any], SELECTED_TEXT_SELECTOR = SELECTED_TEXT_SELECTOR.asInstanceOf[js.Any], SELECT_ANCHOR_SELECTOR = SELECT_ANCHOR_SELECTOR.asInstanceOf[js.Any], VALUE_ATTR = VALUE_ATTR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIACONTROLS]
  }
  @scala.inline
  implicit class ARIACONTROLSOps[Self <: ARIACONTROLS] (val x: Self) extends AnyVal {
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
    def setARIA_CONTROLS(value: String): Self = this.set("ARIA_CONTROLS", value.asInstanceOf[js.Any])
    @scala.inline
    def setARIA_SELECTED_ATTR(value: String): Self = this.set("ARIA_SELECTED_ATTR", value.asInstanceOf[js.Any])
    @scala.inline
    def setCHANGE_EVENT(value: String): Self = this.set("CHANGE_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setLABEL_SELECTOR(value: String): Self = this.set("LABEL_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setLEADING_ICON_SELECTOR(value: String): Self = this.set("LEADING_ICON_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setLINE_RIPPLE_SELECTOR(value: String): Self = this.set("LINE_RIPPLE_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setMENU_SELECTOR(value: String): Self = this.set("MENU_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setOUTLINE_SELECTOR(value: String): Self = this.set("OUTLINE_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSELECTED_ITEM_SELECTOR(value: String): Self = this.set("SELECTED_ITEM_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSELECTED_TEXT_SELECTOR(value: String): Self = this.set("SELECTED_TEXT_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSELECT_ANCHOR_SELECTOR(value: String): Self = this.set("SELECT_ANCHOR_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setVALUE_ATTR(value: String): Self = this.set("VALUE_ATTR", value.asInstanceOf[js.Any])
  }
  
}

