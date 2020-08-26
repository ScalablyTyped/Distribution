package typings.materialSnackbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ACTIONSELECTOR extends js.Object {
  var ACTION_SELECTOR: String = js.native
  var ARIA_LIVE_LABEL_TEXT_ATTR: String = js.native
  var CLOSED_EVENT: String = js.native
  var CLOSING_EVENT: String = js.native
  var DISMISS_SELECTOR: String = js.native
  var LABEL_SELECTOR: String = js.native
  var OPENED_EVENT: String = js.native
  var OPENING_EVENT: String = js.native
  var REASON_ACTION: String = js.native
  var REASON_DISMISS: String = js.native
  var SURFACE_SELECTOR: String = js.native
}

object ACTIONSELECTOR {
  @scala.inline
  def apply(
    ACTION_SELECTOR: String,
    ARIA_LIVE_LABEL_TEXT_ATTR: String,
    CLOSED_EVENT: String,
    CLOSING_EVENT: String,
    DISMISS_SELECTOR: String,
    LABEL_SELECTOR: String,
    OPENED_EVENT: String,
    OPENING_EVENT: String,
    REASON_ACTION: String,
    REASON_DISMISS: String,
    SURFACE_SELECTOR: String
  ): ACTIONSELECTOR = {
    val __obj = js.Dynamic.literal(ACTION_SELECTOR = ACTION_SELECTOR.asInstanceOf[js.Any], ARIA_LIVE_LABEL_TEXT_ATTR = ARIA_LIVE_LABEL_TEXT_ATTR.asInstanceOf[js.Any], CLOSED_EVENT = CLOSED_EVENT.asInstanceOf[js.Any], CLOSING_EVENT = CLOSING_EVENT.asInstanceOf[js.Any], DISMISS_SELECTOR = DISMISS_SELECTOR.asInstanceOf[js.Any], LABEL_SELECTOR = LABEL_SELECTOR.asInstanceOf[js.Any], OPENED_EVENT = OPENED_EVENT.asInstanceOf[js.Any], OPENING_EVENT = OPENING_EVENT.asInstanceOf[js.Any], REASON_ACTION = REASON_ACTION.asInstanceOf[js.Any], REASON_DISMISS = REASON_DISMISS.asInstanceOf[js.Any], SURFACE_SELECTOR = SURFACE_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ACTIONSELECTOR]
  }
  @scala.inline
  implicit class ACTIONSELECTOROps[Self <: ACTIONSELECTOR] (val x: Self) extends AnyVal {
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
    def setACTION_SELECTOR(value: String): Self = this.set("ACTION_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setARIA_LIVE_LABEL_TEXT_ATTR(value: String): Self = this.set("ARIA_LIVE_LABEL_TEXT_ATTR", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLOSED_EVENT(value: String): Self = this.set("CLOSED_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLOSING_EVENT(value: String): Self = this.set("CLOSING_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setDISMISS_SELECTOR(value: String): Self = this.set("DISMISS_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setLABEL_SELECTOR(value: String): Self = this.set("LABEL_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPENED_EVENT(value: String): Self = this.set("OPENED_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPENING_EVENT(value: String): Self = this.set("OPENING_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setREASON_ACTION(value: String): Self = this.set("REASON_ACTION", value.asInstanceOf[js.Any])
    @scala.inline
    def setREASON_DISMISS(value: String): Self = this.set("REASON_DISMISS", value.asInstanceOf[js.Any])
    @scala.inline
    def setSURFACE_SELECTOR(value: String): Self = this.set("SURFACE_SELECTOR", value.asInstanceOf[js.Any])
  }
  
}

