package typings.materialTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARIASELECTED extends js.Object {
  var ARIA_SELECTED: String = js.native
  var CONTENT_SELECTOR: String = js.native
  var INTERACTED_EVENT: String = js.native
  var RIPPLE_SELECTOR: String = js.native
  var TABINDEX: String = js.native
  var TAB_INDICATOR_SELECTOR: String = js.native
}

object ARIASELECTED {
  @scala.inline
  def apply(
    ARIA_SELECTED: String,
    CONTENT_SELECTOR: String,
    INTERACTED_EVENT: String,
    RIPPLE_SELECTOR: String,
    TABINDEX: String,
    TAB_INDICATOR_SELECTOR: String
  ): ARIASELECTED = {
    val __obj = js.Dynamic.literal(ARIA_SELECTED = ARIA_SELECTED.asInstanceOf[js.Any], CONTENT_SELECTOR = CONTENT_SELECTOR.asInstanceOf[js.Any], INTERACTED_EVENT = INTERACTED_EVENT.asInstanceOf[js.Any], RIPPLE_SELECTOR = RIPPLE_SELECTOR.asInstanceOf[js.Any], TABINDEX = TABINDEX.asInstanceOf[js.Any], TAB_INDICATOR_SELECTOR = TAB_INDICATOR_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIASELECTED]
  }
  @scala.inline
  implicit class ARIASELECTEDOps[Self <: ARIASELECTED] (val x: Self) extends AnyVal {
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
    def setARIA_SELECTED(value: String): Self = this.set("ARIA_SELECTED", value.asInstanceOf[js.Any])
    @scala.inline
    def setCONTENT_SELECTOR(value: String): Self = this.set("CONTENT_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setINTERACTED_EVENT(value: String): Self = this.set("INTERACTED_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setRIPPLE_SELECTOR(value: String): Self = this.set("RIPPLE_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTABINDEX(value: String): Self = this.set("TABINDEX", value.asInstanceOf[js.Any])
    @scala.inline
    def setTAB_INDICATOR_SELECTOR(value: String): Self = this.set("TAB_INDICATOR_SELECTOR", value.asInstanceOf[js.Any])
  }
  
}

